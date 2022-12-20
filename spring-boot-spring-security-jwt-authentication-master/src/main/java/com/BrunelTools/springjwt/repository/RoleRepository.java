package com.BrunelTools.springjwt.repository;

import java.util.Optional;

import com.BrunelTools.springjwt.models.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BrunelTools.springjwt.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
