package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.MantenimientoDto;
import edu.umss.dip.ssiservice.model.Mantenimiento;
import edu.umss.dip.ssiservice.service.DetalleArtefactoService;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.MantenimientoService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/mantenimientos")
@Produces(MediaType.APPLICATION_JSON)
public class MantenimientoController extends GenericController<Mantenimiento, MantenimientoDto> {
    private MantenimientoService service;
    private DetalleArtefactoService detalleArtefactoService;

    public MantenimientoController(MantenimientoService service, DetalleArtefactoService detalleArtefactoService) {
        this.service = service;
        this.detalleArtefactoService = detalleArtefactoService;
    }

    @Override
    @GET
    public List<MantenimientoDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Mantenimiento toModel(MantenimientoDto dto) {
        Mantenimiento mantenimiento = super.toModel(dto);
        mantenimiento.setDetalleArtefacto(detalleArtefactoService.findById(dto.getDetalleArtefactoId()));
        return mantenimiento;
    }
}
