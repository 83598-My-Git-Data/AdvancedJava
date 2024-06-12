package com.sunbeam.myjspapp;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.pojos.Candidate;

public class DeleteCandidateBean
{
	private int id ;
	private Candidate candidate;
	
	
	public DeleteCandidateBean()
	{
		
	}
	public DeleteCandidateBean(int id, Candidate candidate) {
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
	
	public void deleteCandidate()
	{
		try(CandidateDao candDao=new CandidateDaoImpl())
		{
			int count=candDao.deleteById(id);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
