App.controller('Partial2Controller', function ($scope) {
    $scope.test = function () {
        console.log($scope.email);
        console.log($scope.password);
    }
});