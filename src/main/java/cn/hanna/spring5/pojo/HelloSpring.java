package cn.hanna.spring5.pojo;

public class HelloSpring {

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void show(){
        System.out.println(userName+"，欢迎来到Spring");
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
