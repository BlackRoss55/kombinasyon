import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n,r,a=1,b=1,c=1,h;

        System.out.print("N sayısını giriniz: ");
        n = sc.nextInt();
        System.out.print("kaçıncı kombinasyonunun hesaplanacağını giriniz: ");
        r = sc.nextInt();

        for(int i=1;i<=n;i++){
            a = a*i;
        }
        for(int j=1;j<=r;j++){
            b = b*j;
        }
        for(int k=1;k<=(n-r);k++){
            c = c*k;
        }
        h = a/(b*c);
        System.out.print("N in r li kombinasyonu: "+h);
    }
}