package C07ExceptionFileParsing.AuthorException;

import javax.crypto.IllegalBlockSizeException;
import javax.naming.SizeLimitExceededException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//핵심 로직을 구현하는 레이어
public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(){
        authorRepository = new AuthorRepository();
    }

//    예외 throw
    public void register(String name, String email, String password){
        if(password.length() < 8){
            throw new InputMismatchException();
        }
        Author author = new Author(name, email, password);
        Optional<Author> optAuthor = this.authorRepository.findByEmail(email);
        if(optAuthor.isPresent()){
            throw new IllegalArgumentException();
        }
        this.authorRepository.register(author);
    }

//    예외 throw
    public void login(String email, String password){
//        Optional<Author> optAuthor = this.authorRepository.findByEmail(email);
//        if(optAuthor.isPresent()){
//            Author author = optAuthor.get();
//            if(!author.getPassword().equals(password)){
//                throw new InputMismatchException();
//            }
//        }else{
//            throw new NoSuchElementException();
//        }
        Author author = this.authorRepository.findByEmail(email).orElseThrow(()->new NoSuchElementException());
        if(!author.getPassword().equals(password)){
            throw new InputMismatchException();
        }
    }

    public List<Author> findAll(){
        return this.authorRepository.findAll();
    }
}
