package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.SeccionDto;
import edu.umss.dip.ssiservice.model.Seccion;
import edu.umss.dip.ssiservice.service.EmpresaService;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.SeccionService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/secciones")
@Produces(MediaType.APPLICATION_JSON)
public class SeccionController extends GenericController<Seccion, SeccionDto> {
    private SeccionService service;
    private EmpresaService empresaService;

    public SeccionController(SeccionService service, EmpresaService empresaService) {
        this.service = service;
        this.empresaService = empresaService;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    @GET
    public List<SeccionDto> getAll() {
        return super.getAll();
    }

    @Override
    protected Seccion toModel(SeccionDto dto) {
        Seccion seccion = super.toModel(dto);
        seccion.setEmpresa(empresaService.findById(dto.getEmpresaId()));
        return seccion;
    }
}
