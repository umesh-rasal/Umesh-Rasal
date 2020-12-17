package shop;

public class Item
{
	static int id;
	protected double cost;
	public float profit;

	static{
		
		id=System.currentTimeMillis()%10000;
	}

	public Item(double c,float p)
	{
		cost=c;
		profit=p;
	}

	public Item()
	{
		this(0,0);
	}

	public static int getId()
	{
	 	return id;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double c)
	{
		cost=c;
	}

	public float getProfit()
	{
		return profit;
	}

	public void profit(float p)
	{
		profit=p;
	}

	public double sellingPrice()
	{
		double total=cost*(1+profit/100);
		return total;
	}
}
