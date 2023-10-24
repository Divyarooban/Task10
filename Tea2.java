package task10;

class Tea2 {
    private String name;
    public Tea2(String name) {
        this.name = name;
    }
    public String getname() {
    	return name;
    	}
    public void prepare() {
        System.out.println("Preparing " + name + " tea.");
    }
    public void serve() {
        System.out.println("Serving " + name + " tea.");
    }
}
class BlackTea extends Tea2 {
    public BlackTea(String name) {
        super(name);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + getname() + " black tea.");
    }
}
class GreenTea extends Tea2 {
    public GreenTea(String name) {
        super(name);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + getname() + " green tea.");
    }
}
class HerbalTea extends Tea2 {
    public HerbalTea(String name) {
        super(name);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + getname() + " herbal tea.");
    }
}
public class Tea {
    public static void main(String[] args) {
        Tea[] teas = {
                new BlackTea("Earl Grey"),
                new GreenTea("Matcha"),
                new HerbalTea("Chamomile"),
                new Tea("English Breakfast") // Tea class instance
        }

        for (Tea tea : teas) {
            tea.prepare();
            tea.serve();
            System.out.println();
        }
    }
}