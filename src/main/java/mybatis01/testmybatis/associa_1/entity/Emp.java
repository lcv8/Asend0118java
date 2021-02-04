package mybatis01.testmybatis.associa_1.entity;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.Date;

public class Emp {
    private Integer id;
    private String name;
    private Integer age;
    private Date bir;
    private Integer deptId;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bir=" + bir +
                ", deptId=" + deptId +
                '}';
    }

    public Emp(Integer id, String name, Integer age, Date bir, Integer deptId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bir = bir;
        this.deptId = deptId;
    }

    public Emp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
