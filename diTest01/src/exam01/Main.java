package exam01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        for(int i=1;;i++){
            if(fact(i)==n){
                answer = n;
                break;
            }
            else if(fact(i)<n && fact(i+1)>n){
                answer = n;
                break;
            }
        }
        System.out.println(answer);
	}
	 public static int fact(int n) {
			if(n<=1) {
				return 1;
			}
			else {
				return fact(n-1)*n;
			}
		}
}
