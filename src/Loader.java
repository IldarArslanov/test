import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
       int sum=0, operand1=0, operand2=0;
       char operator;
       boolean work = true;
       while( work ) {
           System.out.println("prodolgat?" );
           if (getOperator() == 'y') {work = true;}
              else {work = false; break;}

           // poluchaem operandy i operator
           System.out.println("input first operand" );
           operand1 = getOperand();
           System.out.println("input operator" );
           operator = getOperator();
           System.out.println("input second operand" );
           operand2 = getOperand();

           switch (operator) {
               case '+': sum = operand1 + operand2; break;
               case '-': sum = operand1 - operand2; break;
               case '*': sum = operand1 * operand2; break;
               case '/': sum = operand1 / operand2; break;
               default : System.out.println("nepravilnye dannye" );
           }

           System.out.println("otvet"+sum );
       }




    }

    private static int getOperand() {
        Scanner scanner = new Scanner(System.in);
         return scanner.nextInt();
    }

    private static char getOperator() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
