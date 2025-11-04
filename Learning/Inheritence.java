//  ek generation se dusri generation mein pass karna 
// ek class ki properties jab dusri class lena chahti hai toh uss process ko hum kehte hain inheritence

// class Shape{
//     String color;

// }

// class Triangle extends Shape{
        
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.color = "red";
//     }
// }

// types of inheritence
// single level inheritence

class Shape {
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area (int l,int h){
        System.out.println((1/2*l*h));
    }
}
// multi level inheritance

class EquilateralTriangle extends Triangle {
    public void area (int l,int h){
        System.out.println(1/2*l*h);
    }
}

// hierarchial inheritance

class Circle extends Shape{
        public void area (int r){
            System.out.println((3.14)*r*r);
        }
}

//  Hybrid inheritence

//it cotains any from all the inheritence

public class Inheritence {
    public static void main(String[] args) {
        
    }
}