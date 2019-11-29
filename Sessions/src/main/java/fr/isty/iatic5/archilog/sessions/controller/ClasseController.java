package fr.isty.iatic5.archilog.sessions.controller;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/manipulClasse")
@Api(value = "APIManipulClasse")

public class ClasseController {

	//@Resource(name = "creerClasse")
	//private DefaultMessageProducer<String, ReferentielPostEvent> sendReferentielPostEvent;

	//@Resource(name = "supprimeClasse")
	//private DefaultMessageProducer<String, SourceOrgaEvent> sendReferentielSourceOrga;

	/**
	 * Creation d'une nouvelle classe
	 * classeBody
	 * param1
	 * @return
	 */
	@ResponseBody
	@PostMapping(path = "/create/newclasse/{param1}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "L'utilisateur peut créer une classe", httpMethod = "POST")
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
}
