App.controller('RoleController', function ($scope, $http) {
    $scope.search = function (page, pageSize) {
        let form = {};
        form.roleName = $scope.roleName;//获取表单参数
        $scope.form = form;
        $scope.doList(page, pageSize);
    }
    $scope.doList = function (page, pageSize) {
        $http({
            method: 'GET', url: 'role/list',
            params: {"name": $scope.form.roleName, "page": page, "size": pageSize}
        }).then(function success(response) {
            $scope.roles = response.data.content;
            $scope.rolePage = $scope.wrapPage(response.data);
            //给分页组件添加分页点击函数
            $scope.rolePage.pageClickCallback = $scope.pageClickCallback
        }, function error(response) {
            console.error("获取角色列表数据失败")
            console.error(response)
        });
    }
    //组装分页数据
    $scope.wrapPage = function (page) {
        page.totalPagesArray = [];
        for (let i = 0; i < page.totalPages; i++) {
            page.totalPagesArray.push(i);
        }
        return page;
    }
    //分页点击函数
    $scope.pageClickCallback = function (pageNumber, pageSize) {
        console.log("点击分页")
        $scope.doList(pageNumber, pageSize);
    };
    $scope.search(0, 1);
});