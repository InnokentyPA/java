public static void main(String[] args) {
    Set<Cat> uniqueCats = new HashSet<Cat>();

    Cat simpleCat0 = new Cat("Vasya", "White", 5);
    Cat simpleCat1 = new Cat("Boris", "Black", 2);
    Cat simpleCat2 = new Cat("Felix", "Multicolor", 3);
    Cat simpleCat3 = new Cat("Vasya", "White", 5);
    Cat simpleCat4 = simpleCat2;

    uniqueCats.add(simpleCat0);
    uniqueCats.add(simpleCat1);
    uniqueCats.add(simpleCat2);
    uniqueCats.add(simpleCat3);
    uniqueCats.add(simpleCat4);

    System.out.println(simpleCat0.equals(simpleCat3));
    System.out.println(simpleCat0.equals(simpleCat1));
    System.out.println(simpleCat0.equals(simpleCat2));
    System.out.println(simpleCat4.equals(simpleCat2));
    

    System.out.println(uniqueCats);
    System.out.printf("Всего котов в сете: %d\n", uniqueCats.size());
} 