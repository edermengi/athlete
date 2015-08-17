var athleteApp = angular.module('athleteApp', [
    'ngRoute',
    'athleteControllers'
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