
public class Yatzee {//2,147,483,647

public static void main(String[] args){
		
		boolean Yatzee = false;
		int die1 = 1;
		int die2 = 1;
		int die3 = 1;
		int die4 = 1;
		int die5 = 1;
		/*int die6 = 1;
		int die7 = 1;
		int die8 = 1;*/
		int sides = 6;
		int times = 0;

		while (!Yatzee){
			die1 = ((int) (Math.random() * sides) + 1);
			die2 = ((int) (Math.random() * sides) + 1);
			die3 = ((int) (Math.random() * sides) + 1);
			die4 = ((int) (Math.random() * sides) + 1);
			die5 = ((int) (Math.random() * sides) + 1);
			/*die6 = ((int) (Math.random() * sides) + 1);
			die7 = ((int) (Math.random() * sides) + 1);
			die8 = ((int) (Math.random() * sides) + 1);*/
			times++;
			if (die1 == die2 && die2 == die3 && die3 == die4 && die4 == die5 /*&& die5 == die6 && die6 == die7 && die7 == die8*/){Yatzee = true; break;}
			else {continue;}
		} 
		System.out.print(die1 + "  " + times);
	}
}
