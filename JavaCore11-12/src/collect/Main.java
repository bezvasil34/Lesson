package collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Main {

	public static void main(String[] args) {
	
		List<Human> humans = new LinkedList<Human>();
		humans.add(new Human("anton", 12));
		humans.add(new Human("vova", 32));
		humans.add(new Human("ira", 22));
		humans.add(new Human("jora", 30));
		humans.add(new Human("roza", 50));
	
	//	Human human = new Human("vova", 32);
		
	//	System.out.println(humans.contains(human));
		
		int maxAge = 0;
		for (Human human : humans) {
			if (human.getAge()>maxAge) {
				maxAge=human.getAge();
			}
		}
		for (Human human : humans) {
			if (human.getAge()==maxAge){
				System.out.println(human);
			}
		}
		
		int maxName=0;
		for (Human human : humans) {
			if (human.getName().length()>maxName){
				maxName=human.getName().length();
				
			}
			}
		for (Human human : humans) {
			if(human.getName().length()==maxName){
				System.out.println(human);
		}
		}
		
//		for (Human human : humans) {
//			if (human.getName().equals("jora")) {
//				humans.remove(human);
//			}
//		}
//		System.out.println(humans);
		
//		Iterator<Human> iterator = humans.iterator();
		
//		
//		while (iterator.hasNext()) {
////			if (iterator.next().getName().equals("anton")) {
////				iterator.remove();
//			
//			Human human = iterator.next();
//			
//			System.out.println(human.getName() + " "+ human.getAge());
//			}
//			
//		//	System.out.println(humans);
		
//	ListIterator<Human> listIterator= humans.listIterator(humans.size());
//		
//	while (listIterator.hasPrevious()) {
//	//System.out.println(listIterator.previous()); // виводить з к≥нц€ на початок
////		Human human =listIterator.previous();
////		if (human.getAge()==30){
////			listIterator.add(e);
////		}
////	
//	
//	}
		
	
	
		List<Shop> list=new ArrayList<>();
		
		Commodity commodity1= new Commodity("laptop", 12000);
		Commodity commodity2= new Commodity("potato", 12);
		
		
		Commodity commodity3= new Commodity("Car", 124423);
		Commodity commodity4= new Commodity("orange", 12421);
		
		
		List<Commodity> commodities1= new ArrayList<Commodity>();
		List<Commodity> commodities2= new ArrayList<Commodity>();
		
		
		commodities1.add(commodity1);
		commodities1.add(commodity2);
		
		commodities2.add(commodity3);
		commodities2.add(commodity4);
		
		
		list.add(new Shop("pozetka", commodities1));
		list.add(new Shop("citrus", commodities2));
		
		
		
		for (Shop shop : list) {
			if (shop.getName().equals("pozetka")) {
				for (Commodity commodity : shop.getCommodities()) {
					System.out.println(commodity);
				}
			}
		}
		
		
		for (Shop shop : list) {
				for (Commodity commodity : shop.getCommodities()) {
					if (commodity.getName().equals("potato")) {
					System.out.println(shop.getName());
					}
				}
		}
		
		
		
		
		
		
		
		System.out.println("new commit");
		
		
		
		
		
		
		
		}
		
	}


