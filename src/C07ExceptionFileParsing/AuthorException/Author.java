package C07ExceptionFileParsing.AuthorException;

//엔티티 레이어
public class Author {
    private static Long staticId = 0L;
    private Long id;
    private String name;
    private String email;
    private String password;

    public Author(String name, String email, String password) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
