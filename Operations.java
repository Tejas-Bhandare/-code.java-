public class Operations{


    public static void main(String[] args) {

        int num = 15;
        CheckNum obj1 = new CheckNum();

        System.out.println(num + " " + obj1.checkEvenOdd(num));
        System.out.println(CheckNum.isEven(num));
    }
    

}

class CheckNum
{
    public String checkEvenOdd(int n)
    {
        return n % 2 == 0 ? "is Even" : "is Odd";
    }

    static boolean isEven(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}