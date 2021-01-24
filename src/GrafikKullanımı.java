
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GrafikKullanımı extends JPanel{//sub class

     @Override
    public void paint(Graphics g) {//graphics kütüphanesini kullanka istediğim için bunu override etmem gerek
        //bu metod içine bir graphics cinsinden değer alıyor ve daha sonra ben g'yi kullanarak değerlerimi ekleyebiliyorum.(daha doğrusu şekillerimi çizebiliyorum.)
        //super.paint(g); //To change body of generated methods, choose Tools | Templates.
        //paints ben ekstradan çağırmıyorum.Bunu java zaten bir jframe oluşturulduğu zaman ve onun içine bir jpanel eklendiği zaman java bunu otomatik olarak yapıyor.(Çağırıyor)
        //içine graphics cinsinden bir parametreyi kendisi gönderiyor.Ben sadece paint içerisinde yapıcağım işlemleri yapıyorum java bunları otomatik oalrak çağırıyor.
        //Graphics kullanarak şekillerimi çizmeye başlıyorum
        g.setColor(Color.blue);//bunun altındaki herşey tüm şekillder kırmızı olarak çizilmiş olacak 
        g.drawRect(100 , 58 , 30 , 40);//bir dikdörtgen çizmeye çalışıyorum şimdi 
        //4 değerden x,y kordinatlar,diğerleri ise genişlik ve uzunluk
        g.fillRect(200 , 100, 40, 40);//içi dolu bir dikdörtgen çizmek için kullandım
        
        g.setColor(Color.orange);//burdan sonrakiler turuncu olacak
        g.drawOval(200, 250, 30, 30);//bir daire oluşturmak için kullandım.tam daire
        g.drawOval(250, 225, 60, 60);
        g.drawOval(220, 205, 30, 60);//elips meydana getirdim
        g.drawOval(40, 400, 60, 120);//yana yatık elips
        g.fillOval(300, 300, 40, 40);//içi dolu daire
        g.setColor(Color.MAGENTA);
        g.drawLine(100, 100, 300, 300);//bir çizgi çiziyorum.verdiğim değerler başlangıç ve bitiş noktaları
        //bu bir doğru parçası.bu yapılar sayesinde oyun tasarımı yapabiliyoruz.
        
    }
     //bir constructor yazmam gerek
        public GrafikKullanımı() {
        //tek bir işlem tanımladım
        setBackground(Color.red);
        //arkaplan renk ataması gerçekleştirdim
        //jpanele bir renk ataması gerçekleştirdim
    }
}
