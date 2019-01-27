package com.appprocesssors.ecomstore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")

public class Order {

    @Id
    private String _id;
    private String productName;
    private String productPrice;
    private String shippingFee;
    private String productQuanity;
    private String totalAmount;
    private String paymentMode;
    private ProductDetails productDetails;
    private Address deliveryAddress;
    private String orderedAccountMobileNo;
    private String orderDateTime;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(String shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getProductQuanity() {
        return productQuanity;
    }

    public void setProductQuanity(String productQuanity) {
        this.productQuanity = productQuanity;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderedAccountMobileNo() {
        return orderedAccountMobileNo;
    }

    public void setOrderedAccountMobileNo(String orderedAccountMobileNo) {
        this.orderedAccountMobileNo = orderedAccountMobileNo;
    }

    public String getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(String orderDateTime) {
        this.orderDateTime = orderDateTime;
    }
}
