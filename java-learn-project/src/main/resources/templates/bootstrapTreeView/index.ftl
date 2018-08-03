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
        <div class="row">
            <div class="col-md-4">
                <div id="treeview5" class=""></div>
            </div>
            <div class="col-md-8">
                <form>
                    <div class="form-group">
                        <label>名称</label>
                        <input type="text" class="form-control"/>
                    </div>
                    <button type="button" class="btn btn-default" onclick="createNode()">添加节点</button>
                    <button type="button" class="btn btn-default">编辑节点</button>
                    <button type="button" class="btn btn-default">删除节点</button>
                </form>
            </div>
        </div>
        <script src="js/jquery-2.1.0.min.js"></script>
        <script src="js/bootstrap-treeview.js"></script>
        <script type="text/javascript">
            //初始化树
            $(function () {
                var defaultData = null;
                $.ajax({
                    type: "get",
                    url: "/bootstrapTreeView/getTreeViewData",
                    data: {},
                    dataType: "json",
                    async: false,
                    success: function (obj) {
                        defaultData = obj;
                    }
                });
                $('#treeview5').treeview({
                    color: "#428bca",
                    expandIcon: 'glyphicon glyphicon-chevron-right',
                    collapseIcon: 'glyphicon glyphicon-chevron-down',
                    nodeIcon: 'glyphicon glyphicon-bookmark',
                    addNode: $.proxy(this.addNode, this),
                    data: defaultData
                });
            });
        </script>

        <script type="text/javascript">
            /**
             给节点添加子节点
             @param {Object|Number} identifiers - A valid node, node id or array of node identifiers
             @param {optional Object} options.node;
             */
            Tree.prototype.addNode = function (identifiers, options) {

                this.forEachIdentifier(identifiers, options, $.proxy(function (node, options) {
                    this.setAddNode(node, options);
                }, this));

                this.setInitialStates({ nodes: this.tree }, 0);
                this.render();
            }

            /**
             *  添加子节点
             */
            Tree.prototype.setAddNode = function (node, options) {
                if (node.nodes == null) node.nodes = [];
                if (options.node) {
                    node.nodes.push(options.node);
                };
            };

            function createNode() {
                $("#treeview5").treeview("addNode", [2, { node: { text: "新加的菜单", href: "001005" } }]);

            }
        </script>
</body>
</html>