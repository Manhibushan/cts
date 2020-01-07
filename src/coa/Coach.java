package coa;

public class Coach {
public String coachid;
private String firstName;
private String lastName;
private String coachesFor;
public Coach()
{
	super();
}
public Coach(String coachid, String firstName, String lastName, String coachesFor) {
	super();
	this.coachid = coachid;
	this.firstName = firstName;
	this.lastName = lastName;
	this.coachesFor = coachesFor;
}
@Override
public String toString() {
	return "Coach [coachid=" + coachid + ", firstName=" + firstName + ", lastName=" + lastName + ", coachesFor="
			+ coachesFor + "]";
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public boolean equals(Object obj) {
	Coach theCoach=null;
	boolean isEqual=false;
	if(obj instanceof Coach) {
		theCoach=(Coach) obj;
	}
	if((this.getFirstName()==theCoach.getFirstName()) &&
			(this.getLastName()==theCoach.getLastName()) &&(this.getCoachesFor()==theCoach.getCoachesFor()))
	{
		isEqual=true;
	}
	return isEqual;
}
public String getCoachid() {
	return coachid;
}
public void setCoachid(String coachid) {
	this.coachid = coachid;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getCoachesFor() {
	return coachesFor;
}
public void setCoachesFor(String coachesFor) {
	this.coachesFor = coachesFor;
}

}
