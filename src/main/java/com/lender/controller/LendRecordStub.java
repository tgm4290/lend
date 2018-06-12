package com.lender.controller;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lender.model.LendRecord;

public class LendRecordStub {

	/*
	private static Map<Long, LendRecord> records = new HashMap<>();
	private static Long idIndex = 2L;
	
	static {
		LendRecord a = new LendRecord(1L, "Brett", LocalDateTime.of(2018, Month.APRIL, 3, 10, 17, 00), null);
		LendRecord b = new LendRecord(2L, "Brett", LocalDateTime.of(2018, Month.APRIL, 4, 10, 17, 00), null);
		records.put(1L, a);
		records.put(2L, b);
	}
	
	public static List<LendRecord> list() {
		return new ArrayList<LendRecord>(records.values());
	}
	
	public static LendRecord create(LendRecord record) {
		idIndex += 1L;
		record.setId(idIndex);
		records.put(idIndex, record);
		return record;
	}
	
	public static LendRecord get(Long id) {
		return records.get(id);
	}
	
	public static LendRecord update(Long id, LendRecord record) {
		records.put(id, record);
		return record;
	}
	
	public static LendRecord delete(Long id) {
		return records.remove(id);
	}
	*/
}
