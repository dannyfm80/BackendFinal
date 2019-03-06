package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Obra;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.ObraRepository;
import org.springframework.stereotype.Service;

@Service
public class ObraServiceImpl extends GenericServiceImpl<Obra> implements ObraService{
    private final ObraRepository repository;

    public ObraServiceImpl(ObraRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Obra> getRepository() {
        return repository;
    }
}
