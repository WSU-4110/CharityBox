package charitybox.jsp;

import java.util.ArrayList;
import java.util.List;

public class UserClass {

	private List<String> username = new ArrayList<>();
	private List<String> password = new ArrayList<>();
	private List<String> email = new ArrayList<>();
	private List<String> firstName = new ArrayList<>();
	private List<String> lastName = new ArrayList<>();
	private List<String> gender = new ArrayList<>();
	private List<String> age = new ArrayList<>();
	private List<String> orgName = new ArrayList<>();
	private List<String> orgUsername = new ArrayList<>();
	private List<String> orgPassword = new ArrayList<>();
	private List<String> date = new ArrayList<>();
	private List<String> orgAddress = new ArrayList<>();
	private List<String> orgPhone = new ArrayList<>();
	

	
	public List<String> getPassword(){
		
		return password;
	}
	public void setPassword(List<String> p_password) {
		if(!password.isEmpty()) {
			password.clear();
		}
		password.addAll(p_password);
		
	}
	public List<String> getUsername(){
		
		return username;
	}
	public void setUsername(List<String> p_username) {
		if(!username.isEmpty()) {
			username.clear();
		}
		username.addAll(p_username);
	}

	public List<String> getEmail(){
		
		return email;
	}
	public void setEmail(List<String> p_email) {
		if(!email.isEmpty()) {
			email.clear();
		}
		email.addAll(p_email);
		
	}
	public List<String> getFirstName(){
	
		return firstName;
	}
	public void setFirstName(List<String> p_first) {
		if(!firstName.isEmpty()) {
			firstName.clear();
		}
		firstName.addAll(p_first);
		
	}
	public List<String> getGender(){
		
		return gender;
	}
	public void setgender(List<String> p_gender) {
		if(!gender.isEmpty()) {
			gender.clear();
		}
		gender.addAll(p_gender);
		
	}
public List<String> getAge(){
		
		return age;
	}
	public void setAge(List<String> p_age) {
		if(!age.isEmpty()) {
			age.clear();
		}
		age.addAll(p_age);
		
	}
	public List<String> getOrgName(){
		
		return orgName;
	}
	public void setOrgName(List<String> p_orgName) {
		if(!orgName.isEmpty()) {
			orgName.clear();
		}
		orgName.addAll(p_orgName);
		
	}
	
public List<String> getOrgUsername(){
		
		return orgUsername;
	}
	public void setOrgUsername(List<String> p_orgUsername) {
		if(!orgUsername.isEmpty()) {
			orgUsername.clear();
		}
		orgUsername.addAll(p_orgUsername);
		
	}
	
public List<String> getOrgPassword(){
		
		return orgPassword;
	}
	public void setOrgPassword(List<String> p_orgPassword) {
		if(!orgPassword.isEmpty()) {
			orgPassword.clear();
		}
		orgPassword.addAll(p_orgPassword);
		
	}
	
public List<String> getDate(){
		
		return date;
	}
	public void setDate(List<String> p_date) {
		if(!date.isEmpty()) {
			date.clear();
		}
		date.addAll(p_date);
		
	}
	
public List<String> getOrgAddress(){
		
		return orgAddress;
	}
	public void setOrgAddress(List<String> p_orgAddress) {
		if(!orgAddress.isEmpty()) {
			orgAddress.clear();
		}
		orgAddress.addAll(p_orgAddress);
		
	}
	
public List<String> getOrgPhone(){
		
		return orgPhone;
	}
	public void setOrgPhone(List<String> p_orgPhone) {
		if(!orgPhone.isEmpty()) {
			orgPhone.clear();
		}
		orgPhone.addAll(p_orgPhone);
		
	}
	
	
	
}
