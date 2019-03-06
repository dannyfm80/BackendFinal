package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.TipoArtefactoDto;
import edu.umss.dip.ssiservice.model.TipoArtefacto;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.TipoArtefactoService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/tipoArtefactos")
@Produces(MediaType.APPLICATION_JSON)
public class TipoArtefactoController extends GenericController<TipoArtefacto, TipoArtefactoDto> {
    private TipoArtefactoService service;

    public TipoArtefactoController(TipoArtefactoService service) {
        this.service = service;
    }

    @Override
    @GET
    public List<TipoArtefactoDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
