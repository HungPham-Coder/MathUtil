package mathutil;
import static hung.util.MathUtil.computeFactorial;

public class MathUtil 
{
    public static void main(String[] args) 
    {
        //hy vong ham tra ve 120 neu tinh 5!
        System.out.println("5! = " + computeFactorial(5));
        
        
        //hy vong ham tra ve 1 neu tinh 1!
        //expected 1 if cF(1)
        System.out.println("1! = "+ computeFactorial(1));
        
        //expected 1 if cF(0)
        System.out.println("0! = "+ computeFactorial(0));
        
        //expected Exception if cF(-5)8
        System.out.println("-5! = "+ computeFactorial(-5));
    }
}