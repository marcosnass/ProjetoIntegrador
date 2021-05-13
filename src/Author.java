public class Author extends Books {
	
	String name;
	String country;
	
	public Author(){}
	
	public Author(String name, String country) {
		super();
		setName(name);
		setCountry(country);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Author [Nome = " + name + ", País de Origem = " + country + "]";
	}
	
	
	
}
