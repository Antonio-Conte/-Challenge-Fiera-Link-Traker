package ar.com.fiera.link.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.com.fiera.link.entity.LinkEntity;

@Repository
public interface LinkRepository extends JpaRepository<LinkEntity, Integer>
{

	
	
	
	
}
