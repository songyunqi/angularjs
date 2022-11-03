App.directive("paginator", function () {
    return {
        restrict: 'AE',//A代表属性、E代表元素、C代表类、M代表注释。实际情况中我们一般使用AE这两种方式。
        replace: true,
        scope: {
            page: "=",
        },
        templateUrl: "app/directive/paginator.html",
        link: function (scope, elem, attrs) {
            console.log("paginator link")
        }
    }
});