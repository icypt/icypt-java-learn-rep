<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>多级列表树插件|Bootstrap Tree View</title>
    <link rel="stylesheet" type="text/css" href="css/default.css">
    <link href="https://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        .htmleaf-header {
            margin-bottom: 15px;
            font-family: "Segoe UI", "Lucida Grande", Helvetica, Arial, "Microsoft YaHei", FreeSans, Arimo, "Droid Sans", "wenquanyi micro hei", "Hiragino Sans GB", "Hiragino Sans GB W3", "FontAwesome", sans-serif;
        }
    </style>
</head>
<body>
<div class="htmleaf-container">
    <header class="htmleaf-header bgcolor-12">
        <h1>多级列表树插件 <span>Bootstrap Tree View</span></h1>
    </header>
    <div class="container">
        <h1>Bootstrap Tree View</h1>
        <br>
        <div class="row">
            <div class="col-sm-4">
                <h2>Custom Icons</h2>
                <div id="treeview5" class=""></div>
            </div>
        </div>
        <script src="js/jquery-2.1.0.min.js"></script>
        <script src="js/bootstrap-treeview.js"></script>
        <script type="text/javascript">

            $(function () {

                var defaultData = [
                    {
                        text: 'Parent 1',
                        href: '#parent1',
                        tags: ['0'],
                        nodes: [
                            {
                                text: 'Child 1',
                                href: '#child1',
                                tags: ['2'],
                                nodes: [
                                    {
                                        text: 'Grandchild 1',
                                        href: '#grandchild1',
                                        tags: ['0']
                                    },
                                    {
                                        text: 'Grandchild 2',
                                        href: '#grandchild2',
                                        tags: ['0']
                                    }
                                ]
                            },
                            {
                                text: 'Child 2',
                                href: '#child2',
                                tags: ['0']
                            }
                        ]
                    },
                    {
                        text: 'Parent 2',
                        href: '#parent2',
                        tags: ['0']
                    },
                    {
                        text: 'Parent 3',
                        href: '#parent3',
                        tags: ['0']
                    },
                    {
                        text: 'Parent 4',
                        href: '#parent4',
                        tags: ['0']
                    },
                    {
                        text: 'Parent 5',
                        href: '#parent5',
                        tags: ['0']
                    }
                ];

                $('#treeview5').treeview({
                    color: "#428bca",
                    expandIcon: 'glyphicon glyphicon-chevron-right',
                    collapseIcon: 'glyphicon glyphicon-chevron-down',
                    nodeIcon: 'glyphicon glyphicon-bookmark',
                    data: defaultData
                });
            });
        </script>
</body>
</html>