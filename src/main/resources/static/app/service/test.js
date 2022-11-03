App.factory('BusinessService', ['$http', function ($http) {
    let list = function (postData) {
        return $http.post('/Employee/GetAllEmployee', postData);
    }
    return {
        list: function (postData) {
            return list(postData);
        }
    }
}]);