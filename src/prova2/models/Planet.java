package prova2.models;

public class Planet {
    private Long id;
    private String name;

    public Planet(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void print() {
        System.out.printf(
                """
                        Planeta id: %d,
                        Nome do planeta: %s
                        """, this.getId(), this.getName()
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
