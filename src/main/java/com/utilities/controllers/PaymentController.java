package com.utilities.controllers;

import com.utilities.domains.Bill;
import com.utilities.domains.Payment;
import com.utilities.services.BillService;
import com.utilities.services.PaymentService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import java.util.List;

@ExecuteOn(TaskExecutors.IO)
@Controller("/payments")
public class PaymentController {

    protected final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Get
    public List<Payment> getPayments() {
        return paymentService.findAll();
    }
}
