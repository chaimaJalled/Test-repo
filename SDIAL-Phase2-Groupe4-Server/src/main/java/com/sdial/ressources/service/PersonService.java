package com.sdial.ressources.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.sdial.ressources.model.Person;


@Service
public class PersonService {
	

	public JSONObject createPerson(String JSONEntry) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		//Status status = null;


		JSONObject obj = new JSONObject(JSONEntry);
		

		try {
			obj.put("event", "create");
			
			person.setId(obj.getString("id"));
			person.setFirstName(obj.getString("firstName"));
			person.setLastName(obj.getString("lastName"));
			person.setEmail(obj.getString("email"));
			obj.put("person", person);
			

			//person.setStatus(obj.getEnum(clazz, key);
		
		} catch (JSONException e) {

			System.out.println("Unexpected json file, should be: promotion,filiere");

		}

		return obj;

	}

}
