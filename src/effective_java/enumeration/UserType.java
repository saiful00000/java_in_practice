package effective_java.enumeration;

public enum UserType {
    SALES_REPRESENTATIVE("The Sales representative. who sale the actual product to the retailers."),
    SALES_SUPERVISOR("The sales supervisor. who manage all the sales representatives and also sale the product to the retailers."),
    SALES_MANAGER("The sales manager. who manage all the sales supervisors and also can sale the product to the retailers.");

    private String description;

    UserType(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
