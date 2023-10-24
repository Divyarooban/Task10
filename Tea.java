package task10;

public class Tea {

	public void prepareTea()
	{
		System.out.println("Preparing tea with hotwater and tea leaves");
	}
	public void addMilk()
	{
		System.out.println("Adding milk to the basic tea");
	}
	public void addSugar()
	{
		System.out.println("Adding sugar to the basic tea");
	}

	public static void main(String[] args) {
		Tea t=new Tea();
		t.prepareTea();
		t.addMilk();
		t.addSugar();

	}

}
