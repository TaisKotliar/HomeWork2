package ua.org.oa.TaisKotliar;

public class AttributePool {
    public final int INITIAL_SIZE = 10;
    private Attribute[] attributes = new Attribute[INITIAL_SIZE];

    private int index = 0;

    /**
     * Add new unique attribute
     *
     * @param newAttribute passed attribute
     */
    public void addAttribute(Attribute newAttribute) {
        if (newAttribute == null || !newAttribute.isValid()) return;

        for (int i = 0; i < index; i++) {
            if (attributes[i].equals(newAttribute)) return;
        }
        attributes[index++] = newAttribute;

        //if array is over call method for resize it
        if (index > attributes.length - 1) {
            resizeArray();
        }
    }

    /**
     * Search of attribute
     *
     * @param name name of attribute
     * @return attribute or null if it is not present
     */
    public Attribute getAttribute(String name) {
        if (name == null || name.isEmpty()) return null;

        for (int i = 0; i < index; i++) {
            if (attributes[i].getName().equals(name)) return attributes[i];
        }
        return null;
    }

    /**
     * Return quantity of attributes
     * @return quantity of attributes
     */
    public int getAttributesQuantity() {
        return index;
    }

    /**
     * Create new bigger array and fill it
     */
    private void resizeArray() {
        Attribute[] newAttributes = new Attribute[attributes.length + 10];
        for (int i = 0; i < attributes.length; i++) {
            newAttributes[i] = attributes[i];
        }
        attributes = newAttributes;
    }

    /**
     * Print all parameters
     */
    public void printAll() {
        for (int i = 0; i < index; i++) {
            if (attributes[i] != null) {
                System.out.println(attributes[i]);
            }
        }
    }
}


