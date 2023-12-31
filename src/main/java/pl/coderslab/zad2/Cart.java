package pl.coderslab.zad2;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
    private List<CartItem> cartItems = new ArrayList<>();


    public void addToCart(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    public String getAll() {
        return cartItems.stream().map(p -> p.getQuantity() + " " + p.getProduct()).collect(Collectors.joining(System.lineSeparator()));
    }
}
