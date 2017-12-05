package ch.bbw.addressbook;

import java.util.Comparator;

public class LastnameFirstnameRegistrationDatecomparator implements Comparator<Address> {

	@Override
	public int compare(Address arg0, Address arg1) {
		int result = arg0.getLastname().compareTo(arg1.getLastname());
		
		if(result == 0) {
			arg0.getFirstname().compareTo(arg1.getFirstname());
		}
		
		if(result == 0) {
			arg0.getRegistrationDate().compareTo(arg1.getRegistrationDate());
		}
		
		return result;
	}

}
