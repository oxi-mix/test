class Person {
    private String name;
    private String fName;

    public Integer getAge() {
        return age;
    }

    private Integer age;

    Person(String name, String fName, Integer age) {
        this.name = name;
        this.fName = fName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fName='" + fName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}