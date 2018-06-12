package com.lender.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lender.model.LendRecord;
import com.lender.repository.LendRecordRepository;

@RestController
@RequestMapping("api/v1/")
public class LendRecordController {

	@Autowired
	private LendRecordRepository lendRecordRepository;
	
	@RequestMapping(value="lendrecords", method=RequestMethod.GET)
	public List<LendRecord> list() {
		return lendRecordRepository.findAll();
	}
	
	@RequestMapping(value="lendrecords/{id}", method=RequestMethod.GET)
	public LendRecord get(@PathVariable Long id) {
		return lendRecordRepository.findOne(id);
	}
	
	@RequestMapping(value="lendrecords", method=RequestMethod.POST)
	public LendRecord create(@RequestBody LendRecord record) {
		return lendRecordRepository.saveAndFlush(record);
	}
	
	@RequestMapping(value="lendrecords/{id}", method=RequestMethod.POST)
	public LendRecord update(@PathVariable Long id, @RequestBody LendRecord record) {
		LendRecord existingRecord = lendRecordRepository.findOne(id);
		BeanUtils.copyProperties(record, existingRecord);
		return lendRecordRepository.saveAndFlush(existingRecord);
	}
	
	@RequestMapping(value="lendrecords/{id}", method=RequestMethod.DELETE)
	public LendRecord delete(@PathVariable Long id){
		LendRecord existingRecord = lendRecordRepository.findOne(id);
		lendRecordRepository.delete(existingRecord);
		return existingRecord;
	}
	
}
