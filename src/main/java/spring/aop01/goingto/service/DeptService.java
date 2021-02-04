package spring.aop01.goingto.service;

public interface DeptService {
    void save(String name);
    void update(String name);
    void delete(Integer id);
    String find(String name);
}
