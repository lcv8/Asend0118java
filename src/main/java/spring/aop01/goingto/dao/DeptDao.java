package spring.aop01.goingto.dao;

public interface DeptDao {
    void save(String name);
    void update(String name);
    void delete(Integer id);
    String find(String name);
}
