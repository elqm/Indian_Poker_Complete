import java.util.Random;
import java.util.Scanner;

public class User1 extends Player {

	@Override
	public void shareCard(int num1) {
		
		System.out.println("\n[유저1(나)이 카드 " + num1 + "장을 받았습니다.]");
	}

	@Override
	public void selectCard() {
		
		System.out.println("\n[유저1(나)이 카드 1장을 선택했습니다.]");

	}

	@Override
	public void openCard(int num1) {

		System.out.println("\n[유저1(나)이 유저2(상대)에게 카드를 공개합니다.]");
		System.out.println("[유저2(상대)가 유저1(나)의 카드를 확인했습니다.]");

		if(num1 == 1 || num1 == 2 || num1 == 9 || num1 == 10) {
			System.out.println("[유저2(상대)의 입꼬리가 슬며시 올라갑니다.]\n");
		} else {
			System.out.println("[유저2(상대)가 포커페이스를 유지합니다.]\n");
		}

	}

	public void dualGame(int num1, int num2) {

		System.out.println("\n[GAME START!]");

		int max = 0;
		int min = 0;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
			System.out.println("[유저1(나)의 카드는 [" + max + "]]");
			System.out.println("[유저2(상대)의 카드는 [" + min + "]]");
			System.out.println("[WIN!!!]\n");
		} else if(num1 == num2) {
			System.out.println("[유저1(나)의 카드는 [" + num1 + "]]");
			System.out.println("[유저2(상대)의 카드는 [" + num2 + "]]");
			System.out.println("[DRAW!]\n");
		} else {
			max = num2;
			min = num1;
			System.out.println("[유저1(나)의 카드는 [" + min + "]]");
			System.out.println("[유저2(상대)의 카드는 [" + max + "]]");
			System.out.println("[LOSE...]\n");
		}
		
	}

	public void dieGame(int num1, int num2) {

		int max = 0;
		int min = 0;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
			System.out.println("\n[DIE...]");
			System.out.println("[유저1(나)의 카드는 [" + max + "]]");
			System.out.println("[유저2(상대)의 카드는 [" + min + "]]");
			System.out.println("[당신의 배짱은 물벼룩만 하군요. 겁쟁이는 돌아가서 잠이나 자세요~]\n");
		} else if(num1 == num2) {
			System.out.println("\n[DIE...]");
			System.out.println("[유저1(나)의 카드는 [" + num1 + "]]");
			System.out.println("[유저2(상대)의 카드는 [" + num2 + "]]\n");
		} else {
			max = num2;
			min = num1;
			System.out.println("\n[DIE...]");
			System.out.println("[유저1(나)의 카드는 [" + min + "]]");
			System.out.println("[유저2(상대)의 카드는 [" + max + "]]\n");
		}

	}

	public void exitGame() {

		System.out.println("\n[GAME OVER.]\n");

	}

	public void restartGame() {
		
		System.out.println("\n[RESTART!]\n");

	}
	
}
