package spring.aop01.goingto.dao;

public class DeptDaoImpl implements DeptDao{
    @Override
    public void save(String name) {
        System.out.println("save dao :" + name);
    }

    @Override
    public void update(String name) {
        System.out.println("update dao :" + name);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("delete dao :" + id);
    }

    @Override
    public String find(String name) {
        System.out.println("find dao :" + name);
        return name;
    }
}
