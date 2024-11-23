package App;

public enum Department {
    SALES("SPRZEDAŻ"),
    FINANCE("FINANSE"),
    ADMINISTRATION("ADMINISTRACJA");
    private final String name;
    private Department(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
