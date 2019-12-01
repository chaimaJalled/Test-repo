package fr.isty.iatic5.archilog.sessions.controller;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import fr.isty.iatic5.sessions.service.Classe;
import fr.isty.iatic5.sessions.service.SessionImplementation;

import java.util.List;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/manipulSession")
@Api(value = "APIManipulSession")

public class SessionController {

	/**
	 * Creation d'une nouvelle session
	 * classeBody
	 * param1
	 * @return
	 */
	@ResponseBody
	@PostMapping(path = "/create/newsession", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "L'utilisateur peut créer une session", httpMethod = "POST")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to run is not found") })
	
	public ResponseEntity<Void> createNewSession(@RequestBody String classeBody,
			
			@ApiParam(value = "Param1 ", required = true) @PathVariable("valeurParam1") String param1) {
		try {
			
			SessionImplementation sessionImplementation = new SessionImplementation ();
			sessionImplementation.createSession(classeBody);			

			
		} catch (Exception e) {
			   System.out.print("Erreur lors de l'appel de l'API /create/newSession");

		}
		return new ResponseEntity<>(HttpStatus.CREATED);

	}
	
	/**
	 * Affichage de toutes les lignes de la table Session
	 * 
	 * @return
	 */
	@ResponseBody
	@GetMapping(path = "/get/getSession", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "L'utilisateur peut afficher un creneau", httpMethod = "GET", response = Classe.class,
	responseContainer = "List")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to run is not found") })

	public ResponseEntity<List<Classe>> getCreneau() {
		List<Classe> listClass = null ;

		try {
			listClass = Classe.getAll();

		} catch (Exception e) {
         System.out.print("Erreur lors de l'appel de l'API /get/getCreneau");
		}
		return new ResponseEntity<>(listClass,HttpStatus.OK);

	}
	/**
	 * Supprimer une session
	 * classeBody
	 * param1
	 * @return
	 */
	@ResponseBody
	@DeleteMapping(path = "/delete/deletesession", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "L'utilisateur peut supprimer une session", httpMethod = "DELETE")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to run is not found") })
	
	public ResponseEntity<Void> deleteSession(@RequestBody String classeBody,
			
			@ApiParam(value = "Param1 ", required = true) @PathVariable("valeurParam1") String param1) {
		try {
			
			

			
		} catch (Exception e) {
			
		}
		return new ResponseEntity<>(HttpStatus.CREATED);

	}
}
