package com.appprocesssors.ecomstore.restcontroller;


import com.appprocesssors.ecomstore.model.Address;
import com.appprocesssors.ecomstore.model.Cart;
import com.appprocesssors.ecomstore.model.User;
import com.appprocesssors.ecomstore.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    private UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/allusers")
    public List<User> getAllUsers() {
        List<User> allusers = this.userRepository.findAll();

        return allusers;
    }


    @PostMapping
    public User CreateNewUser(@RequestBody User user) {
        this.userRepository.insert(user);
        User createdUser = this.userRepository.findByPhone(user.getPhone());
        return createdUser;
    }


    @GetMapping("/{phone}")
    public User checkUserExists(@PathVariable("phone") String phone) {
        User user = this.userRepository.findByPhone(phone);
        return user;

    }

    @GetMapping("/{phone}/alladdresses")
    public List<Address> findAllAddressesByPhone(@PathVariable("phone") String phone) {
        User user = this.userRepository.findByPhone(phone);
        if (user.getAddresses() != null) {
            List<Address> addressDefaultFirst = new ArrayList<>();
            addressDefaultFirst.addAll(user.getAddresses());
            for (int i = 0; i < addressDefaultFirst.size(); i++) {
                if (user.getAddresses().get(i).getIsDefaultAddress()) {
                    Collections.swap(addressDefaultFirst, 0, i);
                }
            }
            return addressDefaultFirst;
        } else {
            return new ArrayList<>();
        }

    }

    @DeleteMapping("/{phone}/{id}")
    public void deleteAddressByID(@PathVariable("phone") String phone, @PathVariable("id") String id) {
        User user = this.userRepository.findByPhone(phone);
        List<Address> userAddresses = user.getAddresses();
        for (int i = 0; i < user.getAddresses().size(); i++) {

            if (userAddresses.get(i).get_id().equalsIgnoreCase(id)) {
                userAddresses.remove(i);
            }
        }
        user.setAddresses(userAddresses);
        this.userRepository.save(user);
    }


    @PostMapping("/{phone}/addaddress")
    public Address addNewAddress(@PathVariable("phone") String phone, @RequestBody Address address) {
        User user = this.userRepository.findByPhone(phone);
        if (address.getIsDefaultAddress()) {
            List<Address> userAddresses = user.getAddresses();
            if (userAddresses != null) {
                for (Address userAddress : userAddresses) {
                    if (userAddress.getIsDefaultAddress()) {
                        userAddress.setIsDefaultAddress(false);
                    }
                }
            }
        }
        for (int i=0;i<user.getAddresses().size();i++){
            if (user.getAddresses().get(i).get_id().equalsIgnoreCase(address.get_id())){
                user.getAddresses().remove(user.getAddresses().get(i));
                break;
            }

        }
        if (user.getAddresses() != null) {
            List<Address> userAddress = user.getAddresses();
            userAddress.add(address);
            user.setAddresses(userAddress);
        } else {
            user.setAddresses(Collections.singletonList(address));
        }

        this.userRepository.save(user);
        return address;
    }

    @PostMapping("/{phone}/addtocart")
    public List<Cart> addToCart(@PathVariable("phone") String phone, @RequestBody Cart cart) {

        User user = this.userRepository.findByPhone(phone);

        if (user.getCartList() != null) {
            List<Cart> userCartList = user.getCartList();
            for (int i = 0; i < userCartList.size(); i++) {
                if (userCartList.get(i).getProductCode().equals(cart.getProductCode())) {
                    userCartList.remove(userCartList.get(i));
                } else {
                    userCartList.add(cart);
                    user.setCartList(userCartList);
                }
            }
        } else {
            user.setCartList(Collections.singletonList(cart));
        }
        this.userRepository.save(user);
        return this.userRepository.findByPhone(phone).getCartList();
    }

    @GetMapping("/{phone}/allcartitems")
    public List<Cart> findAllCartItemByPhone(@PathVariable("phone") String phone) {
        User user = this.userRepository.findByPhone(phone);
        if (user.getCartList() != null) {
            List<Cart> cartList = new ArrayList<>(user.getCartList());
            return cartList;
        } else {
            return new ArrayList<>();
        }

    }

    @DeleteMapping("deletecartitem/{phone}/{productCode}")
    public void deletecartItemByProductCode(@PathVariable("phone") String phone, @PathVariable("productCode") String productCode) {
        User user = this.userRepository.findByPhone(phone);
        List<Cart> userCartList = user.getCartList();
        for (int i = 0; i < user.getCartList().size(); i++) {

            if (userCartList.get(i).getProductCode().equalsIgnoreCase(productCode)) {
                userCartList.remove(i);

            } else {
                break;
            }

        }
        user.setCartList(userCartList);
        this.userRepository.save(user);
    }


}
