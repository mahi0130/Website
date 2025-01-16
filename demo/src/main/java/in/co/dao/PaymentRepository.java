package in.co.dao;

import com.example.demo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Custom query methods if needed
    Payment findByOrderId(Long orderId); // Example: Find payment by order ID
}
