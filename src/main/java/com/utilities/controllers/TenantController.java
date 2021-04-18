package com.utilities.controllers;

import com.utilities.domains.Bill;
import com.utilities.domains.Tenant;
import com.utilities.services.BillService;
import com.utilities.services.TenantService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import java.util.List;

@ExecuteOn(TaskExecutors.IO)
@Controller("/tenants")
public class TenantController {

    protected final TenantService tenantService;

    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @Get
    public List<Tenant> getTenants() {
        return tenantService.findAll();
    }
}
