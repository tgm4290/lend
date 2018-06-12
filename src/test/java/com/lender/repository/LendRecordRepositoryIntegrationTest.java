package com.lender.repository;

import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lender.LenderApplication;
import com.lender.model.LendRecord;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(LenderApplication.class)
public class LendRecordRepositoryIntegrationTest {
	
	@Autowired
	private LendRecordRepository lendRecordRepository;
	
	
	@Test
	public void testFindAll() {
		List<LendRecord> records = lendRecordRepository.findAll();
		assertThat(records.size(),  greaterThanOrEqualTo(0));
	}

}
