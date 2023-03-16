package generics;

class Fruit { // to 컨트롤스페이스바 오브젝트
	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit { // to 컨트롤스페이스바 오브젝트
	
	@Override
	public String toString() {
		
		return "Apple";
	}
	
}

class Grape extends Fruit{ // to 컨트롤스페이스바 오브젝트
	@Override
	public String toString() {
		
		return "Grape";
	}
}

class Toy { // to 컨트롤스페이스바 오브젝트
	@Override
	public String toString() {
		
		return "Toy";
	}
}
// T extends Fruit : Fruit 의 자손만 타입으로 지정 가능
class FruitBox<T extends Fruit> extends Box3<T> {}


public class GenericsEx4 {

	public static void main(String[] args) {
		//담기위한 타입 제안
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		//FruitBox<Toy> toBox = new FruitBox<>(); x
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
		
		grapeBox.add(new Grape());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		

	}

}
