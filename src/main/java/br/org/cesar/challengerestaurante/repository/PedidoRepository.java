package br.org.cesar.challengerestaurante.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.org.cesar.challengerestaurante.model.Pedido;

@RepositoryRestResource(collectionResourceRel= "pedido", path="pedido")
public interface PedidoRepository extends PagingAndSortingRepository<Pedido, Long>{
    
}
