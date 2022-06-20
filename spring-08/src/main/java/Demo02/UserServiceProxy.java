package Demo02;

// �����ɫ
public class UserServiceProxy implements UserService{
    UserServiceImpl userService = new UserServiceImpl();

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        this.print("add");
        userService.add();
    }

    @Override
    public void delete() {
        this.print("delete");
        userService.delete();
    }

    @Override
    public void update() {
        this.print("update");
        userService.update();
    }

    @Override
    public void query() {
        this.print("query");
        userService.query();
    }
    // ��ӡ����
    public void print(String mes){
        System.out.println("[DEBUG]ʹ����"+mes+"��ʽ");
    }
}
