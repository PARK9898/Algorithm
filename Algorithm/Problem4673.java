import java.util.Arrays;

public class Problem4673 {
	public static void main(String[] args) {
		int NSN = 0;// 셀프넘버가 아닌 수
		int NonSelfNumber[];
		boolean y = false;
		NonSelfNumber = new int[10000];
		Arrays.fill(NonSelfNumber,0);
		for(int n = 1; n <10001 ; n++)
		{
			NSN = n + n/1000 + (n%1000)/100 + (n%100)/10 + n%10; // 셀프넘버가 아닌 수임
			if(NSN<10000) {
				for(int z : NonSelfNumber){
					 if(z == NSN){
						 y = true;
						 break;// 같으면 true로 바꿔주고 break 해준다
					 }
				}
				if(!y){
					NonSelfNumber[NSN-1] = 1;
				}
				y = false;
			}
		}
		for(int m = 0 ; m<9999 ; m++)
		{
			if(NonSelfNumber[m]==0)
			{
				System.out.println(m+1);
			}
		}
	}
}
