package com.utilities.controllers;

import com.utilities.domains.Landlord;
import com.utilities.services.LandlordService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import java.util.List;

@ExecuteOn(TaskExecutors.IO)
@Controller("/landlords")
public class LandlordController {

    protected final LandlordService landlordService;

    public LandlordController(LandlordService landlordService) {
        this.landlordService = landlordService;
    }

    @Get
    public List<Landlord> getLandlords() {
        return landlordService.findAll();
    }
}
