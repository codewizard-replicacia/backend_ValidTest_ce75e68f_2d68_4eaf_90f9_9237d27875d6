package VTest.repository;


import VTest.model.PurchaseOrder;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PurchaseOrderRepository extends SimpleJpaRepository<PurchaseOrder, String> {
    private final EntityManager em;
    public PurchaseOrderRepository(EntityManager em) {
        super(PurchaseOrder.class, em);
        this.em = em;
    }
    @Override
    public List<PurchaseOrder> findAll() {
        return em.createNativeQuery("Select * from \"Testdb\".\"PurchaseOrder\"", PurchaseOrder.class).getResultList();
    }
}