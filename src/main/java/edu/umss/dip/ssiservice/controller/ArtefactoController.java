package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.ArtefactoDto;
import edu.umss.dip.ssiservice.model.Artefacto;
import edu.umss.dip.ssiservice.service.ArtefactoService;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.TipoArtefactoService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/artefactos")
@Produces(MediaType.APPLICATION_JSON)
public class ArtefactoController extends GenericController<Artefacto, ArtefactoDto> {
    private ArtefactoService service;
    private TipoArtefactoService tipoArtefactoService;

    public ArtefactoController(ArtefactoService service, TipoArtefactoService tipoArtefactoService) {
        this.service = service;
        this.tipoArtefactoService = tipoArtefactoService;
    }
    @Override
    @GET
    public List<ArtefactoDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Artefacto toModel(ArtefactoDto dto) {
        Artefacto artefacto = super.toModel(dto);
        artefacto.setTipoArtefacto(tipoArtefactoService.findById(dto.getTipoArtefactoId()));
        return artefacto;
    }
}
