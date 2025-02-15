package com.example.backend.Repository;

import com.example.backend.Model.ClaimModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<ClaimModel, Long> {
}
