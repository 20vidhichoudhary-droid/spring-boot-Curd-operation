package SB_curd_operation_Pacakge.booksrepository;

import SB_curd_operation_Pacakge.model.books;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<books,String> {
}
