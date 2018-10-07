package guru.springframework.spring5webapp.model.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anti1991 on 10/7/2018
 */
public interface BookRepository extends CrudRepository<Book, Long> {


}
