
public class Q_Two {
    String name ;
    int phone ;
    int age;

    public Q_Two ( String name , int phone , int age ) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString () {
        return "Q_Two{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                '}';
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getPhone () {
        return phone;
    }

    public void setPhone ( int phone ) {
        this.phone = phone;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

}
