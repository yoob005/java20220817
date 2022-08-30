package ch06.lecture.p09GetSet;

public class MyClass1 {
	public int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		}
	}
}
