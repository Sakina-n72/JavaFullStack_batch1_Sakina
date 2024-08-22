package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList <Stocks> records = new ArrayList<>();
		records.add(new Stocks("Reliance",100000));
		records.add(new Stocks("Awl", 40000));
		records.add(new Stocks("Olectra", 6000));
		records.add(new Stocks("jbm auto", 10000));
		//Collections.sort(records);
		Collections.sort(records, new Comparator<Stocks>() {

			@Override
			public int compare(Stocks o1, Stocks o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		Collections.sort(records, (Stocks o1, Stocks o2) -> o1.getName().compareTo(o2.getName())
 );
		records.forEach(System.out::println);
		
	}

}
class Stocks{
	private String name;
	private Integer marketCap;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(Integer marketCap) {
		this.marketCap = marketCap;
	}
	@Override
	public String toString() {
		return "Stocks [name=" + name + ", marketCap=" + marketCap + "]";
	}
	public Stocks(String name, Integer marketCap) {
		super();
		this.name = name;
		this.marketCap = marketCap;
	}
//	@Override
//	public int compareTo(Stocks o) {
//		return this.getMarketCap().compareTo(o.getMarketCap());
//	}
	
}

	
