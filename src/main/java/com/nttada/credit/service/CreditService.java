package com.nttada.credit.service;

import com.nttada.credit.modelo.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
    Mono<Credit> createCredit(Credit c);
    Mono<Credit> findByCustomerId(String id);
    Flux<Credit> findAllCredit();
    Mono<Credit> updateCredit(Credit c);
    Mono<Void> deleteCredit(String id);
}
