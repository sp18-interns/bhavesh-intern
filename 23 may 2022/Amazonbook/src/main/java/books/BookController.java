package books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Book")
public class BookController {
    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = new BookService();
    }

    @GetMapping
    public List<Book> getBook(){
        return bookService.getBook();
    }


}
