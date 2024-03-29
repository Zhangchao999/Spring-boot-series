package cn.geoary.entity;

/**
 * @program: spring-boot-jdbc-02
 * @description: person
 * @author: Zhangc
 * @create: 2019-05-12 10:28
 **/
public class Person {
    private Integer id;
    private String name;
    private String age;

    public Person() {

    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

