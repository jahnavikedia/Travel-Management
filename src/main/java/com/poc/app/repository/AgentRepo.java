package com.poc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.poc.app.model.Agent;

public interface AgentRepo extends JpaRepository<Agent, Integer> {

}
