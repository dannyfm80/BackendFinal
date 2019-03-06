package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Artefacto;
import edu.umss.dip.ssiservice.repositories.ArtefactoRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtefactoServiceImpl extends GenericServiceImpl<Artefacto> implements ArtefactoService {
    private final ArtefactoRepository repository;

    public ArtefactoServiceImpl(ArtefactoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Artefacto> getRepository() {
        return repository;
    }
}
