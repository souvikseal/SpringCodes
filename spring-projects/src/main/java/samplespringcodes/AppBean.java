package samplespringcodes;

/**
 * Hello world!
 *
 */
public class AppBean {
	private String name;
	private String extension;

	public AppBean(String name, String extension) {
		this.name = name;
		this.extension = extension;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String append() {
		return (this.name + "." + this.extension);
	}
}
