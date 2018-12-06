package ua.org.oa.TaisKotliar;

public class Test {
    /**
     * Create new attributes and test how to work class Attribute
     * Check is it possible to write the same attribute to the next cell
     * and what will be done in case of empty or null field.
     */
    public static void testAttribute() {
        Attribute empty = new Attribute();
        Attribute health = new Attribute("Health", "Level of life");
        Attribute spirit = new Attribute("Spirit", "Level of mental power");
        Attribute agility = new Attribute("Agility", "Level of evasion");

        if ((empty.getName() == empty.DEFAULT_NAME)
                && (empty.getDescription() == empty.DEFAULT_DESCRIPTION)
                && empty.getValue() == 0.0) {
            System.out.println("Check empty constructor test passed.");
        } else {
            System.out.println("Check empty constructor test failed.");
        }

        if (health.getName().equals("Health")) {
            System.out.println("Check 'Name' test passed.");
        } else {
            System.out.println("Check 'Name' test failed.");
        }

        if (health.getDescription().equals("Level of life")) {
            System.out.println("Check 'Description' test passed.");
        } else {
            System.out.println("Check 'Description' test failed.");
        }

        if (health.getValue() == 0.0) {
            System.out.println("Check 'Value' test passed.");
        } else {
            System.out.println("Check 'Value' test failed.");
        }

        if (health.isValid() == true) {
            System.out.println("Check 'isValid' method passed");
        } else {
            System.out.println("Check 'isValid' method failed");
        }

        if (!health.equals(spirit) && (!health.equals(agility))) {
            System.out.println("Check 'equals' method passed");
        } else {
            System.out.println("Check 'equals' method failed");
        }
    }

    /**
     * Create new Array of attribute ang test class AttributePool
     * Check addAttribute method for null and for "isValid'
     */
    public static void testAttributePoolAr() {
        AttributePool testAttributePool = new AttributePool();
        Attribute testAttribute = new Attribute();
        testAttributePool.addAttribute(null);
        if (testAttributePool.getAttributesQuantity() == 0) {
            System.out.println("Check 'addAttribute' for null passed");
        } else {
            System.out.println("Check 'addAttribute' for null failed");
        }
        testAttributePool.addAttribute(testAttribute);
        if (testAttributePool.getAttributesQuantity() == 0) {
            System.out.println("Check 'addAttribute' for 'isValid' passed");
        } else {
            System.out.println("Check 'addAttribute' for 'isValid' failed");
        }
    }
}
