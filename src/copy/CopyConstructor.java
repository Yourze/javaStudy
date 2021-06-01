package copy;

public class CopyConstructor {
    public static void main(String[] args) {
        CopyConstructor cc = new CopyConstructor();
        Age a = cc.new Age(20);
        Person p1 = cc.new Person(a,"张三");
        Person p2 = cc.new Person(p1);
        System.out.println("p1是: " + p1);
        System.out.println("p2是: " + p2);

        p1.setName("李四");//引用传递
        a.setAge(30);//值传递
        System.out.println("修改后的p1是: " + p1);
        System.out.println("修改后的p2是: " + p2);
    }
    class Person {
        private Age age;
        private  String name;
        public Person(Age age, String name) {
            this.age = age;
            this.name = name;
        }
        public Person(Person p) {
            this.name = p.name;
            this.age = p.age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String toString() {
            return this.name + " " + this.age;
        }
    }

    class Age {
        private int age;
        public Age(int age) {
            this.age = age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return getAge() + " ";
        }
    }
}
