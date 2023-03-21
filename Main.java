import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

  System.out.println("Wybierz opcję : ");
  System.out.println("1  suma ");
  System.out.println("2  roznica ");
  System.out.println("3  iloczyn ");
  System.out.println("4  iloraz ");
  int wybor =  scanner.nextInt();
    if (wybor < 1 || wybor > 4){
      System.out.println("Spierdalaj ");
     return;
    }
  System.out.print("Podaj liczbę a: ");
  double a = scanner.nextDouble();
  System.out.print("Podaj liczbę b: ");
  double b = scanner.nextDouble();
    
    switch(wybor){
      case 1:
        double suma = a + b;
        System.out.println("Suma wynosi " +suma);
    
        break;
      case 2:
        double roznica = a - b;
        System.out.println("Roznica wynosi " +roznica);
        break;
      case 3:
        double iloczyn = a * b;
        System.out.println("Iloczyn wynosi " +iloczyn);
        break;
      case 4:
        if(b == 0 ) {
        System.out.println("Nie dziel przez zero!");
        }else{
          double iloraz = a / b;
          System.out.println("Iloraz wynosi " +iloraz);
          break;
          
    
        }
    }
  }
}