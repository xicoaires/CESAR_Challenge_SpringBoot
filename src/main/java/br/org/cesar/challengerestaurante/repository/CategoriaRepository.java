package br.org.cesar.challengerestaurante.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.org.cesar.challengerestaurante.model.Categoria;

@RepositoryRestResource(collectionResourceRel="categoria", path="categoria")
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Long>{
    
}
