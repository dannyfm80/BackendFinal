package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.DetalleArtefactoDto;
import edu.umss.dip.ssiservice.model.DetalleArtefacto;
import edu.umss.dip.ssiservice.service.ArtefactoService;
import edu.umss.dip.ssiservice.service.DetalleArtefactoService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/detalleArtefactos")
@Produces(MediaType.APPLICATION_JSON)
public class DetalleArtefactoController extends GenericController<DetalleArtefacto, DetalleArtefactoDto> {
    private DetalleArtefactoService service;
    private ArtefactoService artefactoService;

    public DetalleArtefactoController(DetalleArtefactoService service, ArtefactoService artefactoService) {
        this.service = service;
        this.artefactoService = artefactoService;
    }

    @Override
    @GET
    public List<DetalleArtefactoDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected DetalleArtefacto toModel(DetalleArtefactoDto dto) {
        DetalleArtefacto detalleArtefacto = super.toModel(dto);
        detalleArtefacto.setArtefacto(artefactoService.findById(dto.getArtefactoId()));
        return detalleArtefacto;
    }
}
