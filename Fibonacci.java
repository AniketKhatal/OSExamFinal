

/*
 Q.3 perform below task:
   a) write a program to print first 10 Fibonacci numbers(java code)
   b) Create git project 
   c) Write a dockerfile to execute option (a) program in container
 */
public class Fibonacci{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        System.out.println("The fibonacci series upto 10 is:");
        for (int i=1;i<=10;i++){
            System.out.println(b);
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}


