class Person
{
	public String name;

	public Person(String name) {this.name = name;}
	public boolean isAsleep(int hr) {return 22 < hr || 7 > hr;}
	public String toString() {return name;}

	public void status(int hr)
	{
		if (this.isAsleep(hr))
			System.out.println("Now offline: " + this);
		else
			System.out.println("Now online: " + this);
	}
}

class Student extends Person
{
	protected int units;

	public Student(String name, int units) {
		super(name);
//		this.name = name;
		this.units = units;
	}

	public boolean isAsleep(int hr) {
		return 2 < hr && 8 > hr;
	}

	public String toString()
	{
		String result = super.toString();
		return result + " units: " + units;
	}

	public static void main(String[] args) {
		Student s;
		s = new Student("Sally", 16);
		s.status(1);
	}
}
