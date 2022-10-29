package com.rmn.toolkit.cards.command.repository;

import com.rmn.toolkit.cards.command.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
}

