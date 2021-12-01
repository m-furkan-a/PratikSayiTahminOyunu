import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.println("Sayı Tahmin Oyunu ... 1 - 100 arasında tahmin yapın ...");
        double number = (int)(Math.random() * 100);
	    int hak=5;
        int hata=0;
	    while (hak>0){
	        System.out.print("Tahmin : ");
            int tahmin = input.nextInt();


            if (tahmin == number){
                System.out.println("Tebrikler Kazandınız ...");
                break;
            }else {
                System.out.println("Yanlış Tahmin ...");
                if (tahmin > number)
                    System.out.println("Sayınızı Azaltın ...");
                else
                    System.out.println("Sayınızı Yükseltin ...");
                
                System.out.println("Kalan Hakkınız : " + --hak);

                if (hak==0) {
                    System.out.println("Game Over ...");
                    System.out.println("Sayımız : " + number);
                    break;
                }
            }
        }
    }
}
