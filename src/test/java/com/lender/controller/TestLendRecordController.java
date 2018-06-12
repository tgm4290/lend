package com.lender.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.lender.model.LendRecord;
import com.lender.repository.LendRecordRepository;

public class TestLendRecordController {
	
	@InjectMocks
	private LendRecordController sut;
	
	@Mock
	private LendRecordRepository lendRecordRepository;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testLendRecordGet() {
		LendRecord dataRecord = new LendRecord();
		dataRecord.setId(1L);
		when(lendRecordRepository.findOne(1L)).thenReturn(dataRecord);
		
		LendRecord record = sut.get(1L);
		assertThat(record.getId(), is(1L));
	}

}
