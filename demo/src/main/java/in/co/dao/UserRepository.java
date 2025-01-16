package in.co.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods if needed
    User findByEmail(String email); // Example: Find a user by email
}
