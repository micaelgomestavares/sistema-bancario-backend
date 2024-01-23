package com.rysirengback.bancobackend.repositories;

import com.rysirengback.bancobackend.entities.AccountEntity;
import com.rysirengback.bancobackend.entities.AgencyEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, String> {
	AgencyEntity findByNumberAndPassword(String number, String password);
}