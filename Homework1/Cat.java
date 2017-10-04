
public class Cat {
	private int age;
	private double weght;
	private String ration;
	private String name;
	private String type;
	private boolean mood;
	private int lifes;
	
	public Cat(int age, double weght, String ration, String name, String type, boolean mood, int lifes) {
		super();
		this.age = age;
		this.weght = weght;
		this.ration = ration;
		this.name = name;
		this.type = type;
		this.mood = mood;
		this.lifes = lifes;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeght() {
		return weght;
	}

	public void setWeght(double weght) {
		this.weght = weght;
	}

	public String getRation() {
		return ration;
	}

	public void setRation(String ration) {
		this.ration = ration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isMood() {
		return mood;
	}

	public void setMood(boolean mood) {
		this.mood = mood;
	}

	public int getLifes() {
		return lifes;
	}

	public void setLifes(int lifes) {
		this.lifes = lifes;
	}
	// Умеет говорить "May"
	public void getVoice(){
		System.out.println("May-May");
	}
	// Кушает, следовательно прибавляет в весе
	public void Eat(){
		weght += 0.2;
		System.out.println("Weght is:\n" + weght);
	}
	// Ходит в лоток, следовательно убавляет в весе
	public void goWC(){
		weght -= 0.2;
		System.out.println("Weght is:\n" + weght);
	}
	// У котов 9 жизней =)
	public void getDead(){
		// Умер "-"жизнь
		lifes -= 1;
		System.out.println("Rest lifes:\n" + lifes);
	}
	// Под настроение, может поиграть, может укусить
	public void answer(){
		if (mood == true)
		System.out.println("Playing with me");
		else 
		System.out.println("Bite me");
	}

	public String toString() {
		return "Cat [age=" + age + ", weght=" + weght + ", ration=" + ration + ", name=" + name + ", type=" + type
				+ ", mood=" + mood + ", lifes=" + lifes + "]";
	}
	
	}

		

	


