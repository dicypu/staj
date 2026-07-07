import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //parametreli constructor ile veri oluşturma
        User user1 = new User(1L, "Emirhan" , "Yavuz" , "emirhan@test.com ", "5551231233 ", "aktif " ,LocalDate.now());

        //parametresiz constructor ile veri oluşturup setter ile doldurma
        User user2 = new User();
        user2.setId(2L);
        user2.setAd("Olcay");
        user2.setDurum("Aktif");

        // toString() ile ekrana yazdırma
        System.out.println(user1);
        System.out.println(user2);

    }
}

