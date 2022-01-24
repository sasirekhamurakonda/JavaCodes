package BasicsOfJava;

public class InterferenceTest {
    interface Gift  { void present(); }
    interface Guest { void present(); }

    interface Presentable extends Gift, Guest { }
    static class Present implements Gift,Guest {
        @Override
        public void present() {
            System.out.println("Heeeereee's Johnny!!!");
        }
    }
    public static void main(String[] args) {
        Present johnny = new Present();
        johnny.present();                     // "Heeeereee's Johnny!!!"

        ((Gift) johnny).present();            // "Heeeereee's Johnny!!!"
        ((Guest) johnny).present();           // "Heeeereee's Johnny!!!"

        Gift johnnyAsGift =  johnny;
        johnnyAsGift.present();               // "Heeeereee's Johnny!!!"

        Guest johnnyAsGuest = johnny;
        johnnyAsGuest.present();              // "Heeeereee's Johnny!!!"
    }
}
//i