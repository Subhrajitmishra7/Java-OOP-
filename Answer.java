This code implements inheritance using extend keyword
class Fruit 
{  
String name, taste, size;  
void eat() 
{  
    System.out.println("I am eating fruits today");  
}  
}  
class Apple extends Fruit 
{  
Apple() {  
name = "Apple";  
taste = "sweet and juicy"; 
size = "4";
}  

void eat() {  
    System.out.println(name + " is "+ taste + " in taste" + "and has a size of " + size);  
}  
}  
class Orange extends Fruit 

{  
Orange() {  
    name = "Orange";  
    taste = "sour,juicy and tangy";
    size = "5";  
}    
void eat()
{
System.out.println(name + " is "+ taste + " in taste." + "and has a size of " + size);  
}  
}
public class Answer 
{  
    public static void main(String[] args) {  
                Fruit fruit = new Fruit();  
                Apple apple = new Apple();  
                Orange orange = new Orange();  
                fruit.eat();  
                apple.eat();  
                orange.eat();  
        }  
    }  
    
