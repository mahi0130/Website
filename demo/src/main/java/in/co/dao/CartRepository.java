package in.co.dao;

import com.example.demo.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    // Custom query methods
    List<Cart> findByUserId(Long userId); // Example: Find cart items by user ID
    List<Cart> findByProductId(Long productId); // Example: Find cart items by product ID
}
