package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Empresa;
import edu.umss.dip.ssiservice.repositories.EmpresaRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends GenericServiceImpl<Empresa> implements EmpresaService{
    private final EmpresaRepository repository;

    public EmpresaServiceImpl(EmpresaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Empresa> getRepository() {
        return repository;
    }
}
