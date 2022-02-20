//HierarchialInheritance

import java.io.*;
import java.lang.*;
class Animal{
	void eat() {
		System.out.println("eating");
	}
}

class dog extends Animal{
	void bark() {
		System.out.println("baarking");
	}
}
class cat extends Animal{
	void meow() {
		System.out.println("meowing");
	}
}
class TestInheritance 
		{
	public static void main(String[] args) {
		cat c= new cat();
		c.meow();
		c.eat();
	}
		
}
