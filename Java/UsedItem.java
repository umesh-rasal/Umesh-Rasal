package shop;

public class UsedItem extends Item
{
	public float discount;

	public UsedItem(double c,float p,flaot d)
	{
		super(c,p);
		discount=d;
	}

	public float getDiscount()
	{
		return discount;
	}

	public void setDiscount(float d)
	{
		discount=d;
	}

	@Override
	public double sellingPrice()
	{
		double amount=super.sellingPrice();
		if(cost > 5000)
			amount-=0.05*disount;
		
		return amount;
	}

}
