suratKeluarAngular.controller('DaftarController', 
    function($scope, $http, $window) {
        $scope.daftarSurat = [];

        $scope.updateDaftar = function() {
            $http.get("/get-daftar-surat-keluar").then(sukses, gagal);

            function sukses(response) {
                $scope.daftarSurat = response.data;
            }

            function gagal(response) {}
        };

        $scope.tambah = function() {
            $window.location.href = "/tambah-ui";
        }

        $scope.edit = function(surat) {
            $window.location.href = "/edit-ui?id=" + surat.id +
                    "&tgl_surat=" + surat.tgl_surat +
                    "&judul=" + surat.judul +
                    "&tujuan=" + surat.tujuan;
        }

        $scope.delete = function(surat) {
            $http.delete("/api/delete/" + surat.id).then(sukses, gagal);

            function sukses(response) {
                $scope.updateDaftar();
            }

            function gagal(response) {}
        }

        $scope.updateDaftar();
    }
);
