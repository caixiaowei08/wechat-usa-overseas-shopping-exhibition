angular.module('routerShoppingExhibition', ['ngRoute'])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when('/product', {templateUrl: '/product', controller: "ProductController"})
            .when('/collection', {templateUrl: '/collection',controller: "CollectionController"})
            .when('/group', {templateUrl: '/group',controller: "GroupController"})
            .otherwise({redirectTo: '/product'});
    }]).controller("ProductController", function ($scope) {
    $(".menu-ul li a").removeClass("active");
    $("#product").addClass("active");
}).controller("CollectionController", function ($scope) {
    $(".menu-ul li a").removeClass("active");
    $("#collection").addClass("active");
}).controller("GroupController", function ($scope) {
    $(".menu-ul li a").removeClass("active");
    $("#group").addClass("active");
})

