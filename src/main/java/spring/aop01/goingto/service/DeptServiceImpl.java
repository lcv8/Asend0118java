package spring.aop01.goingto.service;

import spring.aop01.goingto.dao.DeptDao;

public class DeptServiceImpl implements DeptService{

    private DeptDao deptDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public void save(String name) {
        System.out.println("处理save业务逻辑");
        deptDao.save(name);
    }

    @Override
    public void update(String name) {
        System.out.println("处理update业务逻辑");
        deptDao.update(name);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("处理delete业务逻辑");
        deptDao.delete(id);
    }

    @Override
    public String find(String name) {
        System.out.println("处理find业务逻辑");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deptDao.find(name);
        return null;
    }
}
