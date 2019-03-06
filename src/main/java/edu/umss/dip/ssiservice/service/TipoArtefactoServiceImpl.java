package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.TipoArtefacto;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.TipoArtefactoRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoArtefactoServiceImpl extends GenericServiceImpl<TipoArtefacto> implements TipoArtefactoService {
    private final TipoArtefactoRepository repository;

    public TipoArtefactoServiceImpl(TipoArtefactoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<TipoArtefacto> getRepository() {
        return repository;
    }
}
