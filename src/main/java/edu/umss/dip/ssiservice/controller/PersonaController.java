package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.PersonaDto;
import edu.umss.dip.ssiservice.model.Persona;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.PersonaService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/personas")
@Produces(MediaType.APPLICATION_JSON)
public class PersonaController extends GenericController<Persona, PersonaDto>{
    private PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    @GET
    public List<PersonaDto> getAll() {
        return super.getAll();
    }
}
