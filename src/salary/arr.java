package salary;

public class arr {
	static int visokosny() {
		int[] vis=new int[48];
		int vis_number=0;
		for (int i=0; i<vis.length; i++){
			vis[i]=i+1970;
			if(vis[i]%4==0 && vis[i]%100!=0)
				vis_number++;
		}
		return vis_number;
	}

	public static void main(String[] args) {
		double year_from1970=System.currentTimeMillis()/1000/60.0/60/24/365;
		int year=1970+(int)year_from1970;
		double day=((year_from1970-(int)year_from1970)*365)-visokosny();
		double hour=(day-(int) day)*24;
		double minute=(hour-(int) hour)*60;
		double sec=(minute-(int) minute)*60+000;
//		System.out.println(System.currentTimeMillis()/1000);
		System.out.println(year+" "+(int)day+" "+(int) hour+" "+(int)hour+" "+(int)sec);
//		Kate.print();
//		System.out.println(Baby.number);
	}
}