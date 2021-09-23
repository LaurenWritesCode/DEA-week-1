public class FizzBuzz {
    public static void main(String args[])
    {
        int number=100;
        System.out.println("FizzBuzz of numbers from 1 to "+number+": ");
        for (int i=1; i<=number; i++)
        {
            //logic to check if the number is multiple of 3, 5 or both

            //if i%3 and i%5 is equal to zero, the number is multiple of 3 and 5
            if (i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }

            //if i%3 is equal to zero, the number is multiple of 3
            else if (i%3==0)
            {
                System.out.println("Fizz");
            }

            //if i%5 is equal to zero, the number is multiple of 5
            else if (i%5==0)
            {
                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }
        }
    }
}
