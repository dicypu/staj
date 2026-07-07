# Staj
Bu repo staj süresince yapacağım çalışmaları içerir.
- **Gün 1:** Proje ortamı kuruldu ve Git entegrasyonu tamamlandı.
- **Gün 2:** Java Temelleri, Sınıf ve Nesne Yapısı
  Bugünün çalışmasında, kurumsal standartlara uygun bir kullanıcı yönetim sisteminin ilk temel taşı olan `User` sınıfı mimarisini inşa ettim
  ### Yapılan İşlemler:
1. User Nesnesi Oluşturuldu: Kurum standardı olan Java 21 ve Maven altyapısı kullanılarak `User` sınıfı tanımlandı. Sınıf içerisine `id`, `ad`, `soyad`, `email`, `telefon`, `durum` ve `olusturmatarihi` alanları eklendi.
2. Kapsülleme (Encapsulation): Tüm sınıf değişkenleri `private` yapılarak veri güvenliği sağlandı ve dışarıdan kontrollü erişim için `Getter/Setter` metotları yazıldı.
3. Yapıcı Metotlar (Constructor): Nesnelerin farklı senaryolarda başlatılabilmesi adına hem parametresiz (boş) hem de tüm alanları dolduran parametreli constructor yapıları kuruldu.
4. Veri Testi: `Main` sınıfı üzerinden oluşturulan nesneler, `toString()` metodu override edilerek konsola başarıyla yazdırıldı ve sistemin doğruluğu test edildi.  