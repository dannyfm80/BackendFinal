package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.EmpresaDto;
import edu.umss.dip.ssiservice.model.Empresa;
import edu.umss.dip.ssiservice.service.EmpresaService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/empresa")
@Produces(MediaType.APPLICATION_JSON)
public class EmpresaController extends GenericController<Empresa, EmpresaDto> {
    private EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    @GET
    public List<EmpresaDto> getAll() {
        return super.getAll();
    }

}
