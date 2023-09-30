package pl.coderslab.zad2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class CartController {


    private final Cart cart;
    private final ProductDao productDao;

    public CartController(Cart cart, ProductDao productDao) {
        this.cart = cart;
        this.productDao = productDao;
    }

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addtocart(@RequestParam(name = "id") Long id,
                            @RequestParam(name = "quantity") Integer quantity) {
        CartItem cartItem = new CartItem(quantity,productDao.getList().get(Math.toIntExact(id)));
        cart.addToCart(cartItem);
        return "added to cart: " + cartItem;
    }

    @GetMapping("/cart")
    @ResponseBody
    public String showCartItems() {
        return "<pre>" + cart.getAll() + "</pre>";
    }

    @GetMapping("/shop")
    @ResponseBody
    public String showAll(){
        return "<pre>" + productDao.getList() + "</pre>";
    }
}
