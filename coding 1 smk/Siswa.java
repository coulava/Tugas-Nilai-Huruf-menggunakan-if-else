//Object Class
public class Siswa {
    private int id;
    private String nama;
    private double ipk;

    /*Constructor nama sama dgn nama Class*/ 
    public Siswa() {
        id = 0;
        nama ="";
        ipk = 0;

    }

    //Constructor Parameter
    public Siswa(int id, String nama, double ipk) {
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;

    }

    //Getter -->mendapatkan nilai -->tipe data
    public int getID() {
        return id;
    }
    //Setter-->mengubah nilai-->void
    public void setID(int id) {
        this.id = id;
    }

    

    //method yg tdk menghasilkan value
    public void print() {
        System.out.println("Ini Data dari Siswa "+nama);
        System.out.println("ID: "+id);
        System.out.println("Nama: "+nama);
        System.out.println("IPK: "+ipk);
    }

    //method yang menghasilkan value
    public String print2() {
        return "ID: "+id;


    }

   
     //Object Class

        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNama() {
            return this.nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public double getIpk() {
            return this.ipk;
        }

        public void setIpk(double ipk) {
            this.ipk = ipk;
        }

    

    

}