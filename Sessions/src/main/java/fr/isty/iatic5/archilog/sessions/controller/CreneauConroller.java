package fr.isty.iatic5.archilog.sessions.controller;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/manipulCreneau")
@Api(value = "APIManipulCreneau")

public class CreneauConroller {
	//@Resource(name = "creerCreneau")
	//private DefaultMessageProducer<String, ReferentielPostEvent> sendReferentielPostEvent;

	//@Resource(name = "supprimeCreneau")
	//private DefaultMessageProducer<String, SourceOrgaEvent> sendReferentielSourceOrga;

	/**
	 * Creation d'un nouveau creneau
	 * classeBody
	 * param1
	 * @return
	 */
	@ResponseBody
	@PostMapping(path = "/create/newcreneau/{param1}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "L'utilisateur peut créer un nouveau creneau", httpMethod = "POST")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to run is not found") })
	
	public ResponseEntity<Void> createNewClass(@RequestBody String classeBody,
			
			@ApiParam(value = "Param1 ", required = true) @PathVariable("valeurParam1") String param1) {
		try {
			
			

			
		} catch (Exception e) {
			
		}
		return new ResponseEntity<>(HttpStatus.CREATED);

	}
	/**
	 * Suppression d'un creneau
	 * classeBody
	 * param1
	 * @return
	 */
	@ResponseBody
	@PostMapping(path = "/delete/deletecreneau/{param1}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "L'utilisateur peut supprimer un creneau", httpMethod = "DELETE")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to run is not found") })
	
	public ResponseEntity<Void> deleteCreneau(@RequestBody String classeBody,
			
			@ApiParam(value = "Param1 ", required = true) @PathVariable("valeurParam1") String param1) {
		try {
			
			

			
		} catch (Exception e) {
			
		}
		return new ResponseEntity<>(HttpStatus.CREATED);

	}
}
