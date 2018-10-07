package guru.springframework.spring5webapp.model.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anti1991 on 10/7/2018
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
