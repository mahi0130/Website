package in.co.service;


import in.co.dao.CartRepository;
import in.co.dto.Cart;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getCartItemsByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    public Cart addItemToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void removeItemFromCart(Long id) {
        cartRepository.deleteById(id);
    }
}
