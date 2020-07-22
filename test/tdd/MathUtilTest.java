package tdd;

import hung.util.MathUtil;
import static hung.util.MathUtil.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KenLy
 */

public class MathUtilTest 
{  
    @Test       //bao cho jvm biet rang day la ham math()
    //trong ham nay chua cac lenh de test code chinh o ben MathUtil
    //ta test cac tinh huong thanh cong o day
    //thanh cong - cF(5) la ve gia tri 120 
    public void testSuccesfullCases()
    {
        // assertEquals(30, 50);
        //ky vong co 30 xem dua vao thuc te la bao nhieu (vd: 50)
        //2 thu khop nhau va xu ly nhu du kien -> den xanh thong thuong
        //----- khong khop nhau---- khong nhu du kien -> den do -> toang code
        assertEquals(120, MathUtil.computeFactorial(5));
        assertEquals(720, MathUtil.computeFactorial(6));
        assertEquals(1, MathUtil.computeFactorial(0));
        assertEquals(1, MathUtil.computeFactorial(1));
        assertEquals(2, MathUtil.computeFactorial(2));   
        //muon xanh, thi tat ca phai xanh, dung het cho 1 case
        //neu tat ca xanh, co 1 thang do, coi nhu bo
        //vi ham y: code phai chay dung theo moi tinh huong
        //ta chi can nhin xanh do, khoi can nhin = mat
    }
    
    @Test(expected = IllegalArgumentException.class)
    //annotation: dau hieu bao JVM va lien quan .jar biet can phai lam gi
    //ham nay chua cac tinh huong ca chon, vd: cF(-5), cF(16)
    public void testFailedCases()
    {
        //t ky vong m nem ra ngoai le
        //thi coi nhu cot cua m moi ngon vi -5 k tinh dc
        //ngoai le k phai la 1 value de co the so sanh duoc nen minh k co xai ham assertEquals() dc
        //vi ham nay can 2 value expected va actual
        //trong khi do nem ra ngoai le k phai la actual value de so sanh
        //ta phai xai chieu khac khi bat ngoai le
        //la ngoai le minh can ham
        //computeFactorial(-5);
        computeFactorial(16);   //giai thua tang rat nhanh -> khong choi qua 15
    }
    //code co the con tiem an loi nhung clean & build luon ra file.jar
    //neu code k sai cu phap
    //v thi nguy hiem qua di
    //minh phai disable cai nut CLEAN & BUILD NEU CODE CON MAU DO
    //TUC LA CON ERROR LOGIC
    //NHO 2 CON SO 1005 Netbeans 8, 1204 voi Netbean tu 10 tro len
    //khi choi voi Ant project
}