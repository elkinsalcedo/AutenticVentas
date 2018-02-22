var app = angular.module('autenticapp', []);
app.controller('listaventacontroller', function($scope, $http, $location) {
	$scope.listarVentas = function(){
		$http.get("listaventas").then(function (response) {
			if (response.data.length > 0){
				$scope.resultMessage = "Lista de ventas registradas";
				$scope.respuestaVentas = response.data
			}else{
				$scope.resultMessage = "No hay ventas registradas !!!";
			}
		}, function error(response) {
			$scope.resultMessage = "Error with status: " +  response.statusText;
		});
	}
	$scope.listarVentas();
});