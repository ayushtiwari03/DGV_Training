package modules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class StockController {
	
	ArrayList<Stock> stocks  = new ArrayList<Stock>(); 
	
	public void add() 
	{
			stocks.add(new Stock("Ayush Industries", "Food  ", 23.5, 90, 18.5, new double[] {18.5, 19, 28.5, 35, 50}, 12));
			stocks.add(new Stock("Parth Beverages", "Beverages", 40.5, 74, 20.5, new double[] {20.5,30,28.56,35,58.5}, 10));
			stocks.add(new Stock("Sujeet SoftTech", "Technology", 52.5, 80, 50.25, new double[] {50.25, 55,59.67,65,68}, 11));
			stocks.add(new Stock("Sarvesh Clothing", "Clothing", 90.5, 120, 92.5, new double[] {92.5, 95, 90.5,100.25,115}, 15));
			stocks.add(new Stock("Devansh Handlooms", "Handlooms", 105.5, 125, 100.5, new double[] {100.5,105.25,110,115.5,114}, 13));
	}
	
	
	public void displayStocks() {
		System.out.println("Name              "+"Category     "+"Price     ");
		stocks.forEach((stock) -> {
			System.out.println(stock.getName()+"      "+stock.getCategory()+"      "+stock.getPrice());
		});
		
	}
	
	public void displayPerformance() {
		System.out.println("Name"+"              "+"Category" +"   "+ "Price" + "   " + "High52" +"   "+ "Low52" + "   "+ "   "+ "ROI"+"   "+"Last5");
		
		stocks.forEach((stock) -> {
			
			System.out.print(stock.getName()+"   ");
			System.out.print(stock.getCategory()+"   ");
			System.out.print(stock.getPrice()+"   ");
			System.out.print(stock.getHigh52()+"   ");
			System.out.print(stock.getLow52()+"    ");
			System.out.print(stock.getRoi()+"    ");
			System.out.print("(");
			for(double st:stock.getLast5()) {
				System.out.print(st+",");
			}
			System.out.print(")");
			System.out.println();
		});
		System.out.println();
	}
	
	public void searchStock(String userString) {
		Optional<Stock> stockFound = stocks.stream().filter((n) -> {
			return n.getName().equals(userString);
		}).findFirst();
		
		System.out.print(stockFound.get().getName()+"    ");
		System.out.print(stockFound.get().getCategory()+ "    ");
		System.out.print(stockFound.get().getPrice()+"     ");
		System.out.print(stockFound.get().getHigh52()+"    ");
		System.out.print(stockFound.get().getLow52() +"     ");
		System.out.print(stockFound.get().getRoi()+ "      ");
		System.out.print("(");
		for(double sk:stockFound.get().getLast5()) {
			System.out.print(sk+",");
		}
		System.out.print(")");
		System.out.println();
	}
	
	public void sortStock() {
	
		Collections.sort(stocks,new SortStocks());
		this.displayStocks();
	}
	
	public void calculateProfit(String name, int month) {
		
		Optional<Stock> stockSearched = stocks.stream().filter((n) -> {
			return n.getName().equals(name);
		}).findFirst();
		
		System.out.println("The Profit for "+name+" stock will be "+ (stockSearched.get().getPrice())*stockSearched.get().getRoi()/100);
		
	}

}
