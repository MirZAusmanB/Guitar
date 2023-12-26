import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean backToMenu = true;

        Guitar2 g = new Guitar2();
        g.addGuitar(new Guitar("4560", "acoustic", "Yamaha", "F310P", 500));
        g.addGuitar(new Guitar("4561", "electric", "Yamaha", "1611M", 800));
        g.addGuitar(new Guitar("4562", "electric", "Affinity", "230S", 1200));
        g.addGuitar(new Guitar("4563", "acoustic", "Yamaha", "F310P", 500));
        g.addGuitar(new Guitar("4564", "classical", "Taylor", "12eN", 900));
        g.addGuitar(new Guitar("4565", "classical", "Taylor", "12eN", 900));

        while(backToMenu){
            System.out.println("Pick one option.");
            System.out.println("1. See all the guitars.");
            System.out.println("2. Buy a guitar.");
            System.out.println("3. Add a guitar.");
            System.out.println("4. Search guitar by type.");
            System.out.println("5. Exit the program.");

            int option = sc.nextInt();
            String r;

            switch (option){
                case 1:
                    System.out.println("________________Showing Guitars_____________________");
                    g.showGuitars();
                    break;
                case 2:
                    System.out.println("________________Buy a Guitar_____________________");
                    g.showGuitars();
                    System.out.println("Enter id of the guitar");
                    r = sc.next();
                    g.buyGuitar(r);
                    break;
                case 3:
                    System.out.println("________________Add a Guitar_____________________");
                    System.out.print("Enter ID : ");
                    String idR = sc.next();
                    System.out.print("Enter Type : ");
                    String typeR = sc.next();
                    System.out.print("Enter Make : ");
                    String makeR = sc.next();
                    System.out.print("Enter Model : ");
                    String modelR = sc.next();
                    System.out.print("Enter Price : ");
                    double priceR = sc.nextDouble();
                    g.addGuitar(new Guitar(idR, typeR, makeR, modelR, priceR));
                    break;
                case 4:
                    System.out.println("________________Search a Guitar_____________________");
                    System.out.println("Enter the type you want to see.");
                    typeR = sc.next();
                    g.searchType(typeR);
                    break;
                case 5:
                    System.out.println("Exiting program....");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }

            System.out.println("do you want to go back to menu? Enter 'Yes'");
            String input = sc.next();
            if(input.equalsIgnoreCase("yes")){
                continue;
            }else{
                break;
            }
        }
    }
}
