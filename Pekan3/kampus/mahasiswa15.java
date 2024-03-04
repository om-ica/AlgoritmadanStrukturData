package Pekan3.kampus;

public class mahasiswa15 {
    public String nama;
    public int nim;
    public char kelamin;
    public float ipk;

    void tampilInformasi() {
        System.out.println("\nNama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Kelamin\t\t: " + kelamin);
        System.out.println("IPK\t\t: " + ipk);
    }

    public static float hitungRerata(mahasiswa15[] mhs) {
        float totalIpk = 0;
        for (int i = 0; i < mhs.length; i++) {
            totalIpk += mhs[i].ipk;
        }

        return totalIpk / mhs.length;
    }

    public static mahasiswa15 mhsIpkTertinggi(mahasiswa15[] mhs) {
        mahasiswa15 mhsTerbaik = mhs[0];
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].ipk > mhsTerbaik.ipk) {
                mhsTerbaik = mhs[i];
            }
        }
        
        return mhsTerbaik;
    }

    
}
