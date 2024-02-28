package J13;

class Bag<T extends Solid> {
	private T thing;
	
	public Bag(T thing) {
		this.thing = thing;
	}
	
	public T getThing() {
		return thing;
	}
	
	public void setThing(T thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T의 타입은" + thing.getClass().getName());
	}
}

class solid{}
class liquid{}

class Book extends Solid{}
class PencilCase extends Solid{}
class Notebook extends Solid{}

class Water extends Liquid{}
class Coffee extends Liquid{}

	public class bagTEst_627 {
		
		public static void main(String[] args) {
			Bag<Book>bag = new Bag<>(new Book());
			Bag<PencilCase> Bag2


		}
	}
