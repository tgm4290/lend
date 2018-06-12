package com.lender.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lender.model.LendRecord;

public interface LendRecordRepository extends JpaRepository<LendRecord, Long> {

}
