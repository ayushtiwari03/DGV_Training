package modules;

import java.util.Comparator;

class SortStocks implements Comparator<Stock> {

	@Override
	public int compare(Stock stock1, Stock stock2) {
		// TODO Auto-generated method stub
		return  Double.compare(stock1.getPrice(),stock2.getPrice());
	}

}
