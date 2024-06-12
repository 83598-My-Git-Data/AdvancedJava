package com.sunbeam.myjspapp;


import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.Candidate;
import com.sunbeam.pojos.User;

public class VoteBean 
{
		private Candidate candidate;
		private User user;
		private String message;
		
		public VoteBean() 
		{
			
			// TODO Auto-generated constructor stub
		}
		
		public VoteBean(Candidate candidate, User user, String message) 
		{
			
			this.candidate = candidate;
			this.user = user;
			this.message = message;
		}

		public void RegisterVote() 
		{
				if(user.getStatus() == 0) 
				{
					try(CandidateDao candidateDao=new CandidateDaoImpl())
					{
						candidateDao.incrementVote(candidate.getId());
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					message = "Your vote is registerd successfully. <br/><br/>";
					try(UserDao userDao = new UserDaoImpl()) 
					{
						userDao.updateStatus(user.getId(), true);
					} catch (Exception e) 
					{
						e.printStackTrace();
						
					}
				}
				else
				{
					message="You have already voted. </br></br>";
				}
			
		}
}