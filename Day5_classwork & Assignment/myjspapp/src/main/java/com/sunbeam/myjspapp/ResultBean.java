package com.sunbeam.myjspapp;

import java.util.ArrayList;
import java.util.List;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.pojos.Candidate;

public class ResultBean 
{
	private List<Candidate> candidateList;
	
	
	public ResultBean() {
	}
	public ResultBean(List<Candidate> candidateList) {
		this.candidateList = candidateList;
	}
	public List<Candidate> getCandidateList() {
		return candidateList;
	}
	public void setCandidateList(List<Candidate> candidateList) {
		this.candidateList = candidateList;
	}
	public void fetchCandidates() {
		try(CandidateDao candDao = new CandidateDaoImpl()) {
			candidateList = candDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
