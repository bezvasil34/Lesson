package plo.ujk;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Transport tr = Transport.HORSE;
		System.out.println(tr.getMaxspeed());
		
		
		Transport con=null;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter");
		
		String user= scanner.next();
		
		for (Transport t : Transport.values()){
			if (user.equalsIgnoreCase(t.name())) {
				con=t;
			}
		}
		
		Human human = new Human("anton", con);
		
		
		System.out.println(human);
		
		
		//System.out.println(human.getTransport().getMaxspeed());
	}

	

}
