<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link type="text/css" href="/mobileSelect/css/mobileSelect.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/mobileSelect/css/public.css" rel="stylesheet">
    <script type="text/javascript" src="/imgCropper/js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="/mobileSelect/js/mobileSelect.min.js"></script>
</head>
<body>
<div id="trigger5">物业-级联</div>
<script>
    var loc = [0,0,0];
    var mobileSelect5 = new MobileSelect({
        trigger: '#trigger5',
        title: '请选择楼号',
        wheels: [
            {data : [{id:"", value: ""}]},{data : [{id:"", value: ""}]},{data : [{id:"", value: ""}]}
        ],
        position: [0,0,0],
        transitionEnd:function(indexArr, data){
            indexArr[2] = 0;
            var flag = null;
            if(loc[0] != indexArr[0] && indexArr[2] == 0) {
                flag = 0;
            }
            if(loc[1] != indexArr[1] && indexArr[2] == 0) {
                flag = 1;
            }

            if(flag === 0) {
                $.ajax({
                    type: "get",
                    url: "/json/jsonData",
                    data: {"selectCode": data[0].id, "flag": 0},
                    dataType: "json",
                    async: false,
                    success: function (data) {
                        mobileSelect5.updateWheel(1, data);
                        mobileSelect5.updateWheel(2, {data : [{id:"", value: ""}]});
                    }
                });
            }
            if(flag === 1) {
                $.ajax({
                    type: "get",
                    url: "/json/jsonData",
                    data: {"selectCode": data[0].id + "," + data[1].id, "flag": 1},
                    dataType: "json",
                    async: false,
                    success: function (data) {
                        mobileSelect5.updateWheel(2, data);
                    }
                });
            }
            loc = indexArr;
        },
        callback:function(indexArr, data){
            console.log(data);
        }
    });

    $.ajax({
        type: "get",
        url: "/json/getSdData",
        data: {},
        dataType: "json",
        async: false,
        success: function (data) {
            mobileSelect5.updateWheel(0, data);
        }
    });
</script>
</body>
</html>