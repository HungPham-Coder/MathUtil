package hung.util;

//day la class chua cac ham toan học, tính toán với mục tiêu sẽ xài chung cho các nơi khác
// phàm cái gì mang tính chat xài chung, ta sẽ dùng STATIC
public class MathUtil 
{
    //tinh n! = 1,2,3,...,n Vi n1 tang gia tri rat nhanh, som tarn mien int
    //int chua toi da 2 ty 1, nen ta xai dong moi an toan
    //that ra 15! da to lam roi nen ta chi tinh giai thua tu 15 tro lai
   
    public static long computeFactorial(int n)
    {
        if(n < 0)
        {
            throw new IllegalArgumentException("Invalid Input. n must be >= 0");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) 
        {
            result *= i;
        }
        return result;
    }
}
