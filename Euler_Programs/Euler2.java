public class Euler2{  
    public static void main(String[] args) {    
    int num1 = 0;
    int num2 = 1;
    int temp = 0;
    int sum = 0;

    while (num2 < 4000000) {
        if (num2 % 2 == 0)
            sum = sum + num2;
        temp = num1 + num2;
        num1 = num2;
        num2 = temp;
    } 

    System.out.println(sum);
  }
}