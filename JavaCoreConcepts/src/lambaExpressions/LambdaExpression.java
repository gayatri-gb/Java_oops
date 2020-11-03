package lambaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

interface lambda{
	abstract public int demo();
}

public class LambdaExpression {
	private String name;
	
	

	public LambdaExpression(String name) {
		super();
		this.name = name;
	}




	public String getName() {
		return name;
	}




	@Override
	public String toString() {
		return "LambdaExpression [name=" + name + "]";
	}




	public static void main(String[] args) {
		lambda lambda = ()->{
			System.out.println("Elements");
			return (int) (10*10*2.5);
			
			
		};
		System.out.println(lambda.demo());
new Thread(()->System.out.println("Inside a simple thread")).start();

ArrayList<LambdaExpression> list= new ArrayList<LambdaExpression>();
	list.add(new LambdaExpression("Maya"));
	list.add(new LambdaExpression("May"));
	list.add(new LambdaExpression("Ma"));
	list.add(new LambdaExpression("M"));
	
	Collections.sort(list, (LambdaExpression o1, LambdaExpression o2)->{
		
		if( o1.getName().length()<o2.getName().length()) {
			
			return -1;
		}
		else if( o1.getName().length()<o2.getName().length()) {
			
			return 1;
		}
		else {
			return 0;
		}
	
	});

	

	for(LambdaExpression items: list) {
		System.out.println(items);
	}

	}

}
