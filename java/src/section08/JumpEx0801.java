package section08;

public class JumpEx0801 {
    public static void main(String[] args) {
        Animal cat = new Animal();

        System.out.println(cat); // section08.Animal@7344699f
        System.out.println(cat.name);
        
        cat.setName("Coco");
        System.out.println(cat.name);


    }
}
