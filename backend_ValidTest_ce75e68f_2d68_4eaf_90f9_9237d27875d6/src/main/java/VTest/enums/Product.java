package VTest.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum Product{
	    Edible,
	    Cleaning,
	    Grooming; 
    public int value(Product product) {
        return product.ordinal();
    }
    public static Product getProduct(int ordinal) {
        for(Product product : Product.values())
                if(product.ordinal() == ordinal)
                        return product;
        return null;
    }
}


