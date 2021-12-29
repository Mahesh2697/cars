package com.springApplication.cars.controller;

import com.springApplication.cars.model.DealerDetailsModel;
import com.springApplication.cars.service.DealersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DealersController {

    @Autowired
    private DealersService dealersService;

    @PostMapping("/add-dealers")
    public  void add(@RequestBody DealerDetailsModel dealerDetailsModel) {
        dealersService.addDealers(dealerDetailsModel);

    }
    @GetMapping("/get-all-dealers")
    public List<DealerDetailsModel> getAll(){return dealersService.getAllDealers();}




}
