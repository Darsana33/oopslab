import java.util.*;
class rect extends Thread 
{
    int le, br, he;
    public void run()
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        le = sc.nextInt();
        System.out.println("Enter breath:");
        br = sc.nextInt();
        System.out.println("Area of rectangle:"+le * br);
    }

}
class sqr extends Thread
{
  int le;
  public void run() 
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side:");
        le = sc.nextInt();
        System.out.println("Area of square:"+le * le);
  }

}
class tri implements Runnable
 {
    int le, br, he;
    public void run() 
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base:");
        br = sc.nextInt();
        System.out.println("Enter height:");
        he = sc.nextInt();
        System.out.println("Area of triangle:"+0.5f * br * he);
    }

}
class cir implements Runnable
{
    int le;
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        le = sc.nextInt();
        System.out.println("Area of circle:"+3.14f * le);
    }

}

public class c4pg1
 {
    public static void main(String ...a)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        rect t1 = new rect();
        sqr t2 = new sqr();
        tri r1 = new tri();
        cir r2 = new cir();
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);
        int choice;
        do{
            System.out.println("\n1.Area of rectangle\n2.Area of square\n3.Area of triangle\n4.Area of circle\n5.Exit\noption:");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                       t1.start();
                       t1.join();
                       break;
                case 2: 
                       t2.start();
                       t2.join();
                       break;
                case 3:
                       t3.start();
                       t3.join();
                       break;
                case 4: 
                       t4.start();
                       t4.join();
                       break;
                case 5: 
                       System.exit(0);
                       break;
                default:
			System.out.println("Invalid");
                	break;
            }
        }while (choice!=5);
    }
}
