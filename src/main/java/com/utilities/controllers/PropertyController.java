package com.utilities.controllers;

import com.utilities.domains.Bill;
import com.utilities.domains.Property;
import com.utilities.services.BillService;
import com.utilities.services.PropertyService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import java.util.List;

@ExecuteOn(TaskExecutors.IO)
@Controller("/properties")
public class PropertyController {

    protected final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @Get
    public List<Property> getProperties() {
        return propertyService.findAll();
    }
}
