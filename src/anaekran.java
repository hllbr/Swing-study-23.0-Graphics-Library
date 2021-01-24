//super class
import java.awt.HeadlessException;
import javax.swing.JFrame;

//bu classtan bir jframe oluşturmam için extends frame demem gerekiyor.Yapmak istediğim işlemi classa bildirmem ve gerekli hazılığı yapmasını sağlamam gerek
public class anaekran extends JFrame{//şimdi anaekran bir jframe gibi davranacak 
    /*
    SWİNG ile tasarım kısmından(desıgn) yararlanarak işlemler gerçekleştirmiştim.
    Ancak dizayn yaptıktan sonra çok fazla Graphics kullanamıyoruz.
    şimdi bunları bir class halinde oluşturup daha sonra bu jframe üzerine bir jpanel ekleyip jpanel içinede graphics kütüphanesini kullanarak şekiller çizmeye çalışıyorum
    class hiyerarşisi = bizim swing kütüphanemizin içerisinde bulunan classlar birbirlerinden türemektedirler.Ve bunlardan özelliklerini alıyorlar
    Jfamre'e bir jpanel eklediğimde jpanel jcomponent te türediği için ordaki metodları direkt olarak override edebiliyor.
    biz overide ettiğimizde direkt graphics kütüphanesini kullanarak bu jpanel üzerinde şekiller çizebiliyorum.
    
    */
    
    
    public anaekran(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {
        //burada jpaneli bir jframe'e eklemeye çalışıyorum.
        GrafikKullanımı grafik = new GrafikKullanımı();//şeklinde bir jpanel tasarlıyorum ve bunu daha sonra bunu jframe eklicem.
        //main metodum statik olduğu için burada bu classtan bir objeyi oluşturabilirim.
        anaekran ae = new anaekran("Grafik Kullanımı");
        
        ae.setVisible(true);//görünür hale getirdim yapıyı
        ae.setResizable(true);//jframe kenarlarından tuttuğumda genişlesin
        ae.setSize(800,600);//en 800 boy 600 olsun diye ifade ettiğim
        ae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X işaretine bastığımda kapansın dedim 
        
        ae.add(grafik);
    }
}
