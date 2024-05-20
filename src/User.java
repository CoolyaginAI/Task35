public class User {

    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String temp;

        temp = name + ", возраст " + age;
        if ((age%10 == 1) && (age != 11)) temp += " год";
         else if (((age>1)&&(age<5)) || ( (age>20) && (age%10>1) && (age%10<5))) temp += " года";
               else temp += " лет";

        return temp;
    }


}
