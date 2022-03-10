package com.nttada.credit.service;

import com.nttada.credit.modelo.Credit;
import com.nttada.credit.repository.CreditRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreditServiceImpl implements CreditService {

    @Value("${backend.service.url}")
    private String url;

    @Override
    public Mono<String> message() {
        return WebClient
                .create(url)
                .get().retrieve()
                .toEntity(String.class)
                .map(response -> "Mensaje recibido"+ response.getBody());
    }

    @Autowired
    CreditRepository creditRepository;

    @Override
    public Mono<Credit> createCredit(Credit c) {
        return creditRepository.save(c);
    }

    @Override
    public Mono<Credit> findByCustomerId(String id) {
        return creditRepository.findById(id);
    }

    @Override
    public Flux<Credit> findAllCredit() {
        return creditRepository.findAll();
    }

    @Override
    public Mono<Credit> updateCredit(Credit c) {
        return creditRepository.save(c);
    }

    @Override
    public Mono<Void> deleteCredit(String id) {
        return creditRepository.deleteById(id);
    }
}
