package com.utilities.controllers;

import com.utilities.domains.Bill;
import com.utilities.services.BillService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import java.util.List;

@ExecuteOn(TaskExecutors.IO)
@Controller("/bills")
public class BillController {

    protected final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @Get
    public List<Bill> getBills() {
        return billService.findAll();
    }
}
