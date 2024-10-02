import java.util.Scanner;

public class งาน2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] member = {"Silver", "Gold", "Platinum"};

        System.out.println("Select type:");
        for (int i = 0; i < member.length; i++) {
            System.out.println((i) + ": " + member[i]);
        }
        

        System.out.print("number of your type: ");
        int choice = scanner.nextInt();
       // System.out.println(member[choice]);
       System.out.println("how much ur price");
        int pricetotal = scanner.nextInt();
        scanner.close();
        
        int discountP = mathdisa(choice, pricetotal);
        System.out.println("Discount: " + discountP + " for " + member[choice]);
    }
    public static int mathdisa(int choice, int pricetotal){
        int i;
        switch (choice) {
            case 2:
            i = (int)(pricetotal *0.05);
            pricetotal -= i ;
                break;
        
            case 1 :
                if (pricetotal >= 1000) {
                i = (int)(pricetotal *0.03);
                pricetotal -= i ;
          }
                break;
            case 0 : 
                if (pricetotal >=1000) {
                 i = (int)(pricetotal *0.02);
                 pricetotal -= i ;
                
            }
            break;
        }return pricetotal;
    }
}