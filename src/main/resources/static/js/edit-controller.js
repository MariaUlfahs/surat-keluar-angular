suratKeluarAngular.controller('EditController', 
    function($scope, $http, $window) {

        $scope.surat = {};

        $scope.load = function() {
            var data = $window.location.search.split("&");
            for(i=0; i<data.length; i++) {
                console.log(data[i]);
                switch(i) {
                    case 0: $scope.surat.id = data[i].split("=")[1];
                    case 1: $scope.surat.tgl_surat = data[i].split("=")[1];
                    case 2: $scope.surat.judul = data[i].split("=")[1];
                    case 3: $scope.surat.tujuan = data[i].split("=")[1];
                }
            }
        }

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

        $scope.load();

});
