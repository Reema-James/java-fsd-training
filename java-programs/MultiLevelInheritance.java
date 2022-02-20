//4.write a program to implement Multi-level inheritance. Include atleast 3 classes

import java.io.*;
import java.lang.*;

class WebDevelopment 
	{
		void code()
		{
			System.out.println("Coding");
		}
	}

class FrontEnd extends WebDevelopment
	{
		void design()
		{
			System.out.println("Designing");
		}
	}

class BackEnd extends FrontEnd
	{
		void validation()
		{
			System.out.println("Validating");
		}
	}


class MultiLevelInheritance
	{
		public static void main(String[] args)
		{
			BackEnd b = new BackEnd();
			b.validation();
			b.design();
			b.code();
		}
	}
