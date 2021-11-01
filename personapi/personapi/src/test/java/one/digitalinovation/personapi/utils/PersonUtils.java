package one.digitalinovation.personapi.utils;

import java.time.LocalDate;
import java.util.Collections;

import one.digitalinovation.personapi.dto.PersonDTO;
import one.digitalinovation.personapi.entity.Person;

public class PersonUtils {
		private static final String FIRST_NAME= "Andrea";
		private static final String LAST_NAME= "Cruz";
		private static final String CPF_NUMBER = "196.730.088-76";
		private static final long PERSON_ID= 1L;
		private static final LocalDate BIRTH_DATE= LocalDate.of(2010,01,16);
		
		public static PersonDTO createFakeDTO() {
			return PersonDTO.builder()
					.firstName(FIRST_NAME)
					.lastName(LAST_NAME)
					.cpf(CPF_NUMBER)					
					.birthDate("16-01-1976")
					.phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
					.build();
					
		}
		
		public static Person createFakeEntity() {
			return Person.builder()
					.id(PERSON_ID)
					.firstName(FIRST_NAME)
					.lastName(LAST_NAME)
					.cpf(CPF_NUMBER)
					.birthDate(BIRTH_DATE)
					.phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
					.build();
		}

}
