package com.sunbeam.myjspapp;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.pojos.Candidate;

public class FindCandidateBean 
{
	private int id ;
	private Candidate candidate;
	
	
	public FindCandidateBean()
	{
		
	}

	public FindCandidateBean(int id, Candidate candidate) {
		this.id = id;
		this.candidate = candidate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	
	public void findCandidate()
	{
		try (CandidateDao candDao = new CandidateDaoImpl())
		{
			candidate=candDao.findById(id);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
