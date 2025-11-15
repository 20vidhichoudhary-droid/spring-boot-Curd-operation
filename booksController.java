package SB_curd_operation_Pacakge.bookscontroller;
import SB_curd_operation_Pacakge.model.books;
import SB_curd_operation_Pacakge.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class booksController
{
@Autowired
service booksService;

@GetMapping("/books")
private List<books> getAllbooks()
{
    return  booksService.getAllbooks();
}
@GetMapping("/book/{bookid}")
private books getBook(@PathVariable("bookid") int bookid)
{
    return booksService.getBooksByid(bookid);
}

@DeleteMapping("/book/{bookid}")
private String deleteBook(@PathVariable("bookid") int bookid)
{
    booksService.delete(bookid);
    return "deleted!";
}

@PostMapping("/books")
private String saveBook(@RequestBody books boos)
{
    booksService.saveOrUpdate(boos);
    return  "book saved!";
}
@PutMapping("/books")
private String update(@RequestBody books boos)
{
    booksService.saveOrUpdate(boos);
    return "Books added!";
}
}
