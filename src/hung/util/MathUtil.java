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
        if(n < 0 || n > 15)
        {
            throw new IllegalArgumentException("Invalid Input. n must be >= 0");
        }
        
        if(n == 0 || n == 1)
        {
            return 1;
        }
        //dieu kien dung cuar de quy
        //song sot den dong lenh cho nay thi n chac chan roi vao tu 2 -> 15
        //khong can xai else
        return n * computeFactorial(n - 1);        //n * (n - 1)!
    }
}
