//测试数据
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/partial1', {
        templateUrl: '/partial1',
        controller: 'SystemController'
    }).when('/partial2', {
        templateUrl: '/partial2',
        controller: 'Partial2Controller'
    }).otherwise({});
}]);

//角色管理
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/role/manage', {
        templateUrl: 'role/manage',
        controller: 'RoleController'
    })
}]);