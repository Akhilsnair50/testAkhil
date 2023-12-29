package com.shopme.razorpay;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.shopme.common.entity.order.Order;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewInvoice {
    @PostMapping("/newInvoice")
    public String generatedNewInvoice() throws RazorpayException {

        RazorpayClient razorpay = new RazorpayClient("rzp_test_YeGMvUyMRhiqlP", "FakJyJyE6bX6AcLCIrxmOCJh");

        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount",50000);
        orderRequest.put("currency","INR");
        orderRequest.put("receipt", "receipt#1");
        JSONObject notes = new JSONObject();
        notes.put("notes_key_1","Tea, Earl Grey, Hot");
        orderRequest.put("notes",notes);

        org.json.JSONObject invoiceRequest;
//        Order order = razorpay.orders.create(invoiceRequest);
        return "work-done";
    }
}
