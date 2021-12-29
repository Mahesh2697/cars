package com.springApplication.cars.service;


import com.springApplication.cars.model.DealerDetailsModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DealersService {

    private List<DealerDetailsModel> dealers = new ArrayList<>();

    public void addDealers(DealerDetailsModel dealerDetailsModel) {
        dealers.add(dealerDetailsModel);

    }

    public List<DealerDetailsModel> getAllDealers() {
        return dealers;
    }
}

