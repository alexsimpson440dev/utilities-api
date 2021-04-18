package com.utilities.controllers;

import com.utilities.domains.BillType;
import com.utilities.services.BillTypeService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import java.util.List;

@ExecuteOn(TaskExecutors.IO)
@Controller("/bill_types")
public class BillTypeController {

    protected final BillTypeService billTypeService;

    public BillTypeController(BillTypeService billTypeService) {
        this.billTypeService = billTypeService;
    }

    @Get
    public List<BillType> getBillTypes() {
        return billTypeService.findAll();
    }
}
