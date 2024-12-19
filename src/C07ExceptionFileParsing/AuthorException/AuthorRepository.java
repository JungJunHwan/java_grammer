package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소 역할을 하는 레이어
public class AuthorRepository {
    private static List<Author> authorList = new ArrayList<>();

    public void register(Author author){

        authorList.add(author);
    }

    public Optional<Author> findByEmail(String email){
//        email로 Author를 찾는 로직
        for (Author a : authorList) {
            if (a.getEmail().equals(email)){
                return Optional.of(a);
            }
        }
        return Optional.ofNullable(null);
    }

    public List<Author> findAll(){
        return authorList;
    }
}
