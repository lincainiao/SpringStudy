package Demo04;

// 真实对象
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add a new User");
    }

    @Override
    public void delete() {
        System.out.println("delete a new User");
    }

    @Override
    public void update() {
        System.out.println("update a new User");
    }

    @Override
    public void query() {
        System.out.println("query a new User");
    }
}
