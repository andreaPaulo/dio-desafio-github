package one.digitalinovation.personapi.utils;

import one.digitalinovation.personapi.dto.PhoneDTO;
import one.digitalinovation.personapi.entity.Phone;
import one.digitalinovation.personapi.enums.PhoneType;

public class PhoneUtils {
	
	private static final String PHONE_NUMBER = "11999999999";
	private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
	private static final long  PHONE_ID = 1L;

	public static PhoneDTO createFakeDTO() {		
		return PhoneDTO.builder()
				.number(PHONE_NUMBER)
				.type(PHONE_TYPE)				
				.build();
	}

	public static Phone createFakeEntity() {		
		return Phone.builder()
				.number(PHONE_NUMBER)
				.type(PHONE_TYPE)
				.id(PHONE_ID)
				.build();
	}

}
