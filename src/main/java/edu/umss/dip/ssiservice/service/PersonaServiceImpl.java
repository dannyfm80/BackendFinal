package edu.umss.dip.ssiservice.service;


import edu.umss.dip.ssiservice.model.Persona;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.PersonaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona> implements PersonaService{
    private final PersonaRepository repository;

    public PersonaServiceImpl(PersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Persona> getRepository() {
        return repository;
    }
}
