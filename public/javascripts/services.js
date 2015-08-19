var appServices = angular.module('appServices', ['ngResource']);

appServices.factory('Calories', ['$resource',
  function($resource){
    return $resource('tables/calories', {}, {
      query: {method:'GET', params:{}, isArray:true}
    });
}]);