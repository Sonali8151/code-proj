import java.util.Scanner;
public class rectangel {
	int l;
	int b;

	public rectangel(int l,int b) {
		// TODO Auto-generated constructor stub
		this.l=l;
        this.b=b;
	}
	public double area(){
		int a=l*b;
		return a;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int l1=sc.nextInt();
		int b1=sc.nextInt();
		rectangel r=new rectangel( l1, b1);
		r.area();
	}

}
