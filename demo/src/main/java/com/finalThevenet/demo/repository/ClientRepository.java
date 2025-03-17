package com.finalThevenet.demo.repository;

import com.finalThevenet.demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Integer> {
}
