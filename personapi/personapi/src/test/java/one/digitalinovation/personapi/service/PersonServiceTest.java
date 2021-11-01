package one.digitalinovation.personapi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sun.xml.bind.v2.schemagen.xmlschema.Any;

import one.digitalinovation.personapi.dto.PersonDTO;
import one.digitalinovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinovation.personapi.entity.Person;
import one.digitalinovation.personapi.repository.PersonRepository;
import one.digitalinovation.personapi.utils.PersonUtils;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	
	@Mock
	private PersonRepository personRepository;
	
	@InjectMocks
	private PersonService personService;
	
	@Test
	void testGivenPersonDTOThenReturnSavedMessage() {
		PersonDTO personDTO =  PersonUtils.createFakeDTO();
		Person expectedSavedPerson = PersonUtils.createFakeEntity();
		
		when(personRepository.save(expectedSavedPerson)).thenReturn(expectedSavedPerson) ;		
		
		MessageResponseDTO expectedSucessMessage =  createExpectedMessageResponse(expectedSavedPerson.getId());
		MessageResponseDTO sucessMesage = personService.createPerson(personDTO);
		
		assertEquals(expectedSucessMessage, sucessMesage);
	}

	private MessageResponseDTO createExpectedMessageResponse(Long id) {
		return MessageResponseDTO.builder()
		.message("Created person with id: " + id)
		.build();
	}

}
