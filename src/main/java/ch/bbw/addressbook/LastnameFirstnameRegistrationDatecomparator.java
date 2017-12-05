package ch.bbw.addressbook;

import java.util.Comparator;

public class LastnameFirstnameRegistrationDatecomparator implements Comparator<Address> {

	@Override
	public int compare(Address address1, Address address2) {
		int result = address1.getLastname().compareTo(address2.getLastname());
		
		if(result == 0) {
			result = address1.getFirstname().compareTo(address2.getFirstname());
		}
		
		if(result == 0) {
			result = address1.getRegistrationDate().compareTo(address2.getRegistrationDate());
		}
		
		return result;
	}

}
