package coreJava;

import java.util.ArrayList;
import java.util.List;

class Data{
	public <E> void prinlistData(List<E> list) {
		for(E element: list) {
			System.out.println(element);
		}
	}
		
		public <E> void printArray(E[] array) {
			for(E elements: array) {
				System.out.println(elements);
			}
		}
	}


class dataBound<K,V>{
	private K key;
	private V value;
	
	public dataBound(K key, V value) {
	
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	public <E extends Character>  void charGeneric(E element) {
		System.out.println(element);
	}

	@Override
	public String toString() {
		return "dataBound [key=" + key + ", value=" + value + "]";
	}
	

	
}
public class Generics {

	public static void main(String[] args) {
		Data data= new Data();
		List<Integer> list= new ArrayList<Integer>();
		list.add(5);
		list.add(45);
		list.add(25);
		list.add(35);
		
		data.prinlistData(list);
		
		Integer[] array= {3,4,5,6};
		data.printArray(array);
		dataBound<Integer, String> db= new dataBound<Integer, String> (1, "Value");
		db.charGeneric('m');

	}

	
	
}
