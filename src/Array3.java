
public class Array3 {

	public static void main(String[] args) {
		int [][] emp = new int[3][3];
		emp[0][0]=101;
		emp[0][1]=30;
		emp[0][2]=1200;
		emp[0][0]=201;
		emp[0][1]=20;
		emp[0][2]=1500;
		emp[0][0]=301;
		emp[0][1]=30;
		emp[0][2]=1800;
		int[][] prid = {{101,1000,100},{102,2000,150}};
		for(int i=0; i<2;i++) {
			for(int j=0;j<=2;j++) 
			{
				System.out.print(prid [i][j]+" ");
			}
			System.out.println();
		}
	}

}
