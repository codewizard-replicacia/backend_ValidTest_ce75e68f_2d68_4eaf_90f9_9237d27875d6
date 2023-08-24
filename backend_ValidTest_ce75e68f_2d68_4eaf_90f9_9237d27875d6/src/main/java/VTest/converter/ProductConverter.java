package VTest.converter;

import VTest.enums.Product;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class ProductConverter implements AttributeConverter<Product, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Product product) {
        return product != null ? product.ordinal() : null;
    }

    @Override
    public Product convertToEntityAttribute(Integer dbData) {
		return Product.getProduct(dbData);
    }
}
