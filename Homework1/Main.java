
public class Main {
	public static void main(String[] args){
		Cat catOne = new Cat(4,3,"Viskas","Pantera","Home cat",true,9);
		Cat catTwo = new Cat(5,4,"Mouse", "Tom", "Street cat", false,6);
		Cat catThree = new Cat(1,2,"Milk", "Pushok", "Kitten",true,9);

	catOne.getVoice();
	System.out.println(catOne);
	catOne.Eat();
	catOne.goWC();
	catOne.getDead();
	catOne.answer();
	
	System.out.println(catTwo);
	catTwo.getDead();
	catTwo.answer();
	
	System.out.println(catThree);
	catThree.answer();
	}
}
