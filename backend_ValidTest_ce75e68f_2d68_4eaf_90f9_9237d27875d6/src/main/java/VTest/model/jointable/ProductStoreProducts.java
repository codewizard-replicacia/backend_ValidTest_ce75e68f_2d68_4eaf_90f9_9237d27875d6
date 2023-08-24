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

@Entity(name = "ProductStoreProducts")
@Table(schema = "\"Testdb\"", name = "\"ProductStoreProducts\"")
@Data
public class ProductStoreProducts{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"ProductStoreId\"")
	private Integer productStoreId;

    
    @Column(name = "\"ProductId\"")
    private Integer productId;
 
}