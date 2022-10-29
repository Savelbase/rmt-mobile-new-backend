package com.rmn.toolkit.user.command.repository;

import com.rmn.toolkit.user.command.model.DeletedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeletedUserRepository extends JpaRepository<DeletedUser,String> {
}
