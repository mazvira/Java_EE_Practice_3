package library;

public class MyLibraryClass {
    private String name;

    public MyLibraryClass(String s){
        name = s;
    }
    public void printInfo(){
        System.out.println("My class from library with parameter: " + name);
    }
}
