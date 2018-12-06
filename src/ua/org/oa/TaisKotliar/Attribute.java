package ua.org.oa.TaisKotliar;

public class Attribute {
    public final String DEFAULT_NAME = "EMPTY";
    public final String DEFAULT_DESCRIPTION = "EMPTY DESCRIPTION";

    private String name;
    private String description;
    private double value;

    public Attribute() {
        name = DEFAULT_NAME;
        description = DEFAULT_DESCRIPTION;
        value = 0.0;
    }

    public Attribute(String name, String description) {
        this.name = (name == null || name.isEmpty()) ? DEFAULT_NAME : name;
        this.description = (description == null || description.isEmpty()) ? DEFAULT_NAME : description;
        value = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.isEmpty()) return;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < 0.0 || value > 1.0) return;
        this.value = value;
    }

    /**
     * Check name and description
     *
     * @return true if this parameter is valid, in other case return false
     */
    public boolean isValid() {
        return (name.equals(DEFAULT_NAME) || description.equals(DEFAULT_DESCRIPTION)) ? false : true;
    }

    @Override
    public String toString() {
        return name + ", " + description;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (obj instanceof Attribute) {
            Attribute param = (Attribute) obj;
            return name.equals(param.name);
        }
        return false;
    }
}
