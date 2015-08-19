var athleteApp = angular.module('athleteApp', [
    'ngRoute',
    'appControllers',
    'appServices'
]);

athleteApp.config(function($routeProvider) {
    $routeProvider.
      when('/', {
        templateUrl: 'assets/views/calories.html',
        controller: 'CaloriesCtrl'
      }).
      otherwise({
        redirectTo: '/'
      });
});