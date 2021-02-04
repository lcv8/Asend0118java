package spring.aop01;

public class UserServiceImpl implements UserService{
    @Override
    public void save(String name) {
        System.out.println("save dao" + name );
    }

    @Override
    public String find(String name) {
        System.out.println("find dao " + name);
        return name;
    }
}
