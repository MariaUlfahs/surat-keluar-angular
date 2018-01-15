suratKeluarAngular.controller('TambahController', 
    function($scope, $http, $window) {
        $scope.simpan = function() {
            $http.post("/api/tambah", $scope.surat).then(sukses, gagal);

            function sukses(response) {
                $window.location.href = "/";    
            }

            function gagal(response) {}
        }

        $scope.batal = function() {
            $window.location.href = "/";
        }
    }
);
