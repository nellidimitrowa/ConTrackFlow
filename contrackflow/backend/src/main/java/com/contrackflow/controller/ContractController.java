package com.contrackflow.controller;

import com.contrackflow.entity.Contract;
import com.contrackflow.service.ContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/contracts")
@RequiredArgsConstructor
public class ContractController {

    private final ContractService contractService;

    @PostMapping
    public Contract create(@RequestBody Contract contract) {
        return contractService.create(contract);
    }

    @GetMapping
    public List<Contract> getAll() {
        return contractService.findAll();
    }
}