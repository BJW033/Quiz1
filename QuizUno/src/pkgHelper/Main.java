package pkgHelper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input player name: ");
		String name = input.next();
		System.out.println("Input player at bats: ");
		int ab = input.nextInt();
		System.out.println("Input player hits: ");
		int hit = input.nextInt();
		System.out.println("Input player doubles: ");
		int dub = input.nextInt();
		System.out.println("Input player triples: ");
		int trip = input.nextInt();
		System.out.println("Input player home runs: ");
		int hrs = input.nextInt();
		System.out.println("Input player runs: ");
		int runs = input.nextInt();
		System.out.println("Input player walks: ");
		int bbs = input.nextInt();
		Baseball P = new Baseball(name,ab,hit,dub,trip,hrs,runs,bbs);
		System.out.println(P);

	}

}
