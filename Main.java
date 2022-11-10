import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Введите пример, сложения, вычитания, умножения и деления с двумя числами");


        Scanner scanner = new Scanner(System.in);


            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.exit(0);
            }

            try {
                System.out.println(new Calk(input).parse().evaluate());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


    }
}