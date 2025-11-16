package exercises.java;

class PackageDemo {
    public void display() {
        System.out.println("Lavisha 24csu314");
        System.out.println("PackageDemo executed");
    }
}

public class PackageDemoDriver {
    public static void main(String[] args) {
        PackageDemo demo = new PackageDemo();
        demo.display();
    }
}
