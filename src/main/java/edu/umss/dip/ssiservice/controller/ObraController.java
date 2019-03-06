package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.ObraDto;
import edu.umss.dip.ssiservice.model.Obra;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.ObraService;
import edu.umss.dip.ssiservice.service.SeccionService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/obras")
@Produces(MediaType.APPLICATION_JSON)
public class ObraController extends GenericController<Obra, ObraDto>{
    private ObraService service;
    private SeccionService seccionService;

    public ObraController(ObraService service, SeccionService seccionService) {
        this.service = service;
        this.seccionService = seccionService;
    }

    @Override
    @GET
    public List<ObraDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Obra toModel(ObraDto dto) {
        Obra obra = super.toModel(dto);
        obra.setSeccion(seccionService.findById(dto.getSeccionId()));
        return obra;
    }
}
