package com.sdial.ressources.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.sdial.ressources.model.Person;
import com.sdial.ressources.service.PersonService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

  /*  @Autowired
    private PersonRepository personRepository; */
    
    @Autowired
    private KafkaTemplate<String, JSONObject> kafkaTemplate;
    
    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
       // return personRepository.findAll();
    	return null;
    }
    
 
	  /**
		 * Creation d'une nouvelle classe classeBody param1
		 * 
		 * @return
		 */
	
	@ResponseBody
    @PostMapping(value = "/createPerson", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "L'utilisateur peut créer une Personne", httpMethod = "POST")
	public ResponseEntity<Void> createNewPerson(@RequestBody String personBody) {
     	
        try {
           
            kafkaTemplate.send("topic_person", personService.createPerson(personBody));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        return new ResponseEntity<>(HttpStatus.CREATED);

    	
    }

    @DeleteMapping("/persons/{id}")
    public void deletePerson(@PathVariable String id) {
       // personRepository.deleteById(id);
    }
}
