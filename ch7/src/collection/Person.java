package collection;

import java.util.Objects;

public class Person { //SetEx3번에 담기
	String name;
	int age;
	
	//소스 -> 유징파일
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//소스->toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	

	
	
	
	
	
	
	
	

}
