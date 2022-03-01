package com.nttada.credit.repository;

import com.nttada.credit.modelo.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CreditRepository extends ReactiveMongoRepository<Credit, String> {

}
