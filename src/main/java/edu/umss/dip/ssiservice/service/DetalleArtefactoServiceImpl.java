package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.DetalleArtefacto;
import edu.umss.dip.ssiservice.repositories.DetalleArtefactoRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleArtefactoServiceImpl extends GenericServiceImpl<DetalleArtefacto> implements DetalleArtefactoService {
    private final DetalleArtefactoRepository repository;

    public DetalleArtefactoServiceImpl(DetalleArtefactoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<DetalleArtefacto> getRepository() {
        return repository;
    }
}
