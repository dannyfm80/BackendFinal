package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.EmpleadoDto;
import edu.umss.dip.ssiservice.model.Empleado;
import edu.umss.dip.ssiservice.service.EmpleadoService;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.PersonaService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/empleados")
@Produces(MediaType.APPLICATION_JSON)
public class EmpleadoController extends GenericController<Empleado, EmpleadoDto>{
    private EmpleadoService service;
    private PersonaService personaService;

    public EmpleadoController(EmpleadoService service, PersonaService personaService) {
        this.service = service;
        this.personaService = personaService;
    }

    @Override
    @GET
    public List<EmpleadoDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Empleado toModel(EmpleadoDto dto){
        Empleado empleado = super.toModel(dto);
        empleado.setPersona(personaService.findById(dto.getPersonaId()));
        return empleado;
    }

}
