import java.time.LocalDate;

public class User {

    private Long id;
    private String ad;
    private String soyad;
    private String email;
    private String telefon;
    private String durum; // aktif - pasif
    private LocalDate olusturmatarihi;

    public User() {

    }

    public User(Long id, String ad, String soyad, String email, String telefon, String durum, LocalDate olusturmatarihi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefon = telefon;
        this.durum = durum;
        this.olusturmatarihi = olusturmatarihi;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOlusturmatarihi() {
        return olusturmatarihi;
    }

    public void setOlusturmatarihi(LocalDate olusturmatarihi) {
        this.olusturmatarihi = olusturmatarihi;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", durum='" + durum + '\'' +
                ", olusturmatarihi=" + olusturmatarihi +
                '}';
    }
}