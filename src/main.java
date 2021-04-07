import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a :");
        double a = sc.nextDouble();
        System.out.println("Nhap b :");
        double b = sc.nextDouble();
        System.out.println("Nhap c :");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("PT vo nghiem");
        }
        else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println("PT co nghiem kep" + quadraticEquation.getRoot1());
        }
        else {
            System.out.println("PT co 2 nghiem"+ quadraticEquation.getRoot1() + "va" + quadraticEquation.getRoot2());
        }
    }
}
