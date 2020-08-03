public class HelloWorld {


    public String sayHi() {
        return "Hello World";
    }

    public String sayHi(String str) {
        return "Hello " + str.substring(0,1).toUpperCase()+str.substring(1,str.length());
    }
}
