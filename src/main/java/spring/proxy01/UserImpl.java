package spring.proxy01;

public class UserImpl implements UserService{
    @Override
    public void update(String name) {
        System.out.println("update dao");
    }

    @Override
    public void delect(String name) {
        System.out.println("delete dao");
    }

    @Override
    public void add(String name) {
        System.out.println("add dao");
    }
}
