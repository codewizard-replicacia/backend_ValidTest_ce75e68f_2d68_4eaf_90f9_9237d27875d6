package VTest.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import VTest.model.Document;
import VTest.model.ProductCatalogue;
import VTest.model.Vendor;
import VTest.model.Reorder;
import VTest.model.InventoryStock;
import VTest.model.PurchaseOrder;
import VTest.model.ProductStore;
import VTest.model.ProductCategory;
import VTest.enums.Product;
import VTest.converter.ProductConverter;

@Entity(name = "ReorderProductVendor")
@Table(schema = "\"Testdb\"", name = "\"ReorderProductVendor\"")
@Data
public class ReorderProductVendor{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"ReOrderId\"")
	private Integer reOrderId;

    
    @Column(name = "\"Vendor\"")
    private String vendor;
 
}