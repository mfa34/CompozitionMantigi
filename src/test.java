public class test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VS197DE" , "Asus","18.5",resolution);
        Kasa kasa  =new Kasa("Shadow Blade" , "Shadow" , "Tempered Glass" );
        Anakart anakart = new Anakart("B250-Pro" , "Asus" , 10,"Windows 10");
        Bilgisayar pc = new Bilgisayar(monitor,kasa,anakart);
        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletim_sistemi_yukle("Windows 11 ");
    }
}
