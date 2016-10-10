/**
 * Created by Andrzej on 10.10.2016.
 */
var vali = angular.module("validationModule", []);

vali.controller("ValidationController", function ($scope, $http) {


    $scope.submit = function () {

        var password = {
            oldPassword: "stare",
            newPassword: "nowe"
        };

        $http({
            method: 'POST',
            url: '/changePassword',
            data: password
            
        }).then(function success(response)
        {
            if(response.data.status == "OK") {

                console.log("Udało się zmienić hasło");
            }else {
                console.log("Nie udało się zmienić hasła.");
            }
                
        }, function error(response)
        {
            console.log("error");

        });
    }

})

