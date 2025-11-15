package SB_curd_operation_Pacakge.service;

import SB_curd_operation_Pacakge.booksrepository.Repository;
import SB_curd_operation_Pacakge.model.books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class service {
    @Autowired
    Repository booksRepository;
    public List<books> getAllbooks()
    {
        List<books> books=new ArrayList<books>();
        books = (List<SB_curd_operation_Pacakge.model.books>) booksRepository.findAll();
        return books;
    }
    public books getBooksByid(int id)
    {
        books b = new books();
        if(booksRepository.findById(String.valueOf(id)).isPresent())
        {
            b = booksRepository.findById(String.valueOf(id)).get();
        }
        else {
            System.out.println("no books found");
        }
        return b;
    }
    public void saveOrUpdate(books books)
    {
        booksRepository.save(books);
    }
    public void delete(int id)
    {
        booksRepository.deleteById(String.valueOf(id));
    }
    public  void update(books books ,int bookid)
    {
        booksRepository.save(books);
    }
}

