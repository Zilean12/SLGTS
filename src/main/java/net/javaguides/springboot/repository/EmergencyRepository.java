package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Emergency;

public interface EmergencyRepository extends JpaRepository<Emergency, Long> {
}

