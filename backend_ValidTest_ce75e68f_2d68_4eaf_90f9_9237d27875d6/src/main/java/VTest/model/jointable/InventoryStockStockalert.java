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

@Entity(name = "InventoryStockStockalert")
@Table(schema = "\"Testdb\"", name = "\"InventoryStockStockalert\"")
@Data
public class InventoryStockStockalert{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"InventoryId\"")
	private String inventoryId;

    
    @Column(name = "\"ReOrderId\"")
    private Integer reOrderId;
 
}