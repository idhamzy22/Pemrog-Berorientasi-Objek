package Sesi5;

public class NilaiTester {
    
    static class Nilai {
        private double quis;
        private double uts;
        private double uas;

        // Setter untuk quis dengan validasi nilai antara 0 dan 100
        public void setQuis(double x) {
            if (x >= 0 && x <= 100) {
                quis = x;
            } else {
                System.out.println("Nilai quis harus antara 0 dan 100.");
            }
        }

        // Setter untuk uts dengan validasi nilai antara 0 dan 100
        public void setUTS(double x) {
            if (x >= 0 && x <= 100) {
                uts = x;
            } else {
                System.out.println("Nilai UTS harus antara 0 dan 100.");
            }
        }

        // Setter untuk uas dengan validasi nilai antara 0 dan 100
        public void setUAS(double x) {
            if (x >= 0 && x <= 100) {
                uas = x;
            } else {
                System.out.println("Nilai UAS harus antara 0 dan 100.");
            }
        }

        // Getter untuk quis
        public double getQuis() {
            return quis;
        }

        // Getter untuk uts
        public double getUTS() {
            return uts;
        }

        // Getter untuk uas
        public double getUAS() {
            return uas;
        }

        // Menghitung nilai akhir (NA)
        public double getNA() {
            return 0.20 * quis + 0.30 * uts + 0.50 * uas;
        }
    }
    
    public static void main(String[] args) {
        Nilai n = new Nilai();
        
        // Mengisi nilai quis, uts, dan uas
        n.setQuis(90);
        n.setUTS(70);
        n.setUAS(150); // Nilai tidak valid, akan menampilkan pesan kesalahan

        // Menampilkan nilai akhir
        System.out.println("Nilai Akhir (NA): " + n.getNA());
    }
}