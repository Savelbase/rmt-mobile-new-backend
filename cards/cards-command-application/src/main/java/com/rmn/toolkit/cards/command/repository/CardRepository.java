package com.rmn.toolkit.cards.command.repository;

import com.rmn.toolkit.cards.command.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, String> {
}

