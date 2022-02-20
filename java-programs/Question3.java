public class Question3

 {

	public static void main(String[] args) {
		ArrayList<String> first_name = new ArrayList<String>();
		first_name.add("Reema");
		first_name.add("Neetha");
		first_name.add("Nikita");
		System.out.println("First name is ="+first_name);
		
		ArrayList<String> second_name = new ArrayList<String>();
		second_name.add("James");
		second_name.add("Sam");
		second_name.add("Mathew");
		System.out.println("Second name is ="+second_name);
		
		ArrayList<String> total= new ArrayList<String>();
		
		for(int i=0; i<first_name.size();i++) {
			
			total.add(first_name.get(i)+" "+second_name.get(i));
		}
		
		System.out.println("Full name is :");
		System.out.println("");
		
		for (String fullname : total) {
			System.out.println(fullname);
		}
		
	
	}}
