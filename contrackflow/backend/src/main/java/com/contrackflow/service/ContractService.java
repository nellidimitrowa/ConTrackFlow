package com.contrackflow.service;

import com.contrackflow.entity.Contract;
import com.contrackflow.repository.ContractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContractService {

    private final ContractRepository contractRepository;

    public Contract create(Contract contract) {
        contract.setCreatedAt(LocalDateTime.now());
        return contractRepository.save(contract);
    }

    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
