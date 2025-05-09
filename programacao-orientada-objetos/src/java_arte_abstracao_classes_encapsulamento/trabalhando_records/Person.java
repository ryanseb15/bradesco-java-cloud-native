package java_arte_abstracao_classes_encapsulamento.trabalhando_records;

public record Person(String name, int age) {
    public Person {
        
    }

    public Person(String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}
