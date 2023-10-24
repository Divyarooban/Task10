package task10;

public class Teaoverrides {
	public class Blacktea extends Tea{
		public void prepareTea()
		{
			System.out.println("Preparing black tea with hotwater and tea leaves");
		}
	}
	public class Greentea extends Tea{
		public void prepareTea()
		{
			System.out.println("Preparing green tea with hotwater and green tea leaves");
		}
	}
	public class Herbaltea extends Tea{
		public void prepareTea()
		{
			System.out.println("Preparing herbal tea with hotwater and herbal tea leaves");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teaoverrides t=new Teaoverrides();
		Blacktea bt=t.new Blacktea();
		bt.prepareTea();
		Greentea gt=t.new Greentea();
		gt.prepareTea();
		Herbaltea ht=t.new Herbaltea();
		ht.prepareTea();
	}

}
