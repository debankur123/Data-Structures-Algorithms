import java.math.BigDecimal;
import java.util.Scanner;
public class SquareRoot_Leetcode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        int precision = sc.nextInt();
        BigDecimal integerPart = BigDecimal.valueOf(BinarySearch(number));
        System.out.println("Answer is " + morePrecision(number,precision, integerPart));
        sc.close();     
    }
    public static BigDecimal morePrecision(int number,int precision,BigDecimal integerRoot){
        BigDecimal factor = BigDecimal.ONE.divide(BigDecimal.TEN.pow(precision));
        BigDecimal result = integerRoot;
        for(int idx=0;idx<precision;idx++){
            for(BigDecimal j=result;j.multiply(j).compareTo(BigDecimal.valueOf(number)) < 0; j = j.add(factor)){
                result = j;
            }
        }
        return result;
    }
    public static int BinarySearch(int x){
        int start = 0;
        int end = x;
        long ans = 0;
        long mid = start + (end-start)/2;
        while(start <= end){
            long square = mid * mid;
            if(square == x){
                return (int)mid;
            }
            else if(square > x){
                end = (int)mid-1;
            }
            else if(square < x){
                ans = mid;
                start = (int)mid+1;
            }
            mid = start + (end-start)/2;
        }
        return (int)ans;
    }
}
