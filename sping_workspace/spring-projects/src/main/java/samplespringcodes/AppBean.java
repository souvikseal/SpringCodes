package samplespringcodes;

/**
 * Hello world!
 *
 */
public class AppBean 
{
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("App name:" + this.name);
	}
}
