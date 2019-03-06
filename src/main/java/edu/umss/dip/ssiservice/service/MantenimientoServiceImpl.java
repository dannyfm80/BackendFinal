package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Mantenimiento;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.MantenimientoRepository;
import org.springframework.stereotype.Service;

@Service
public class MantenimientoServiceImpl  extends GenericServiceImpl<Mantenimiento> implements MantenimientoService {
    private final MantenimientoRepository repository;

    public MantenimientoServiceImpl(MantenimientoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Mantenimiento> getRepository() {
        return repository;
    }
}
