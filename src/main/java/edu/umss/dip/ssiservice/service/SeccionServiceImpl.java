package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Seccion;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.SeccionRepository;
import org.springframework.stereotype.Service;

@Service
public class SeccionServiceImpl extends GenericServiceImpl<Seccion> implements SeccionService {
    private final SeccionRepository repository;

    public SeccionServiceImpl(SeccionRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Seccion> getRepository() {
        return repository;
    }
}
