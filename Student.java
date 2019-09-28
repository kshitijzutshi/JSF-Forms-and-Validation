package hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	private String firstname;
	private String lastname;
	private String country;
	private String favouriteLanguage;
	
	List<String> countryoptn;
	List<String> favouriteLanguageoptn;
	
	
	
	
	public Student()
	{
		countryoptn=new ArrayList<String>();
		countryoptn.add("Brazil");
		countryoptn.add("UK");
		countryoptn.add("US");
		countryoptn.add("India");
		countryoptn.add("Germany");
		
		favouriteLanguageoptn=new ArrayList<String>();
		favouriteLanguageoptn.add("Java");
		favouriteLanguageoptn.add("C#");
		favouriteLanguageoptn.add("PHP");
		favouriteLanguageoptn.add("Ruby");
		
	}



	public List<String> getFavouriteLanguageoptn() {
		return favouriteLanguageoptn;
	}



	public List<String> getCountryoptn() {
		return countryoptn;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	

}
