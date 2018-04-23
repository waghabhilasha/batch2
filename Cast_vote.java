import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Cast_vote {
	
	ArrayList<Vclass>_candidates = new ArrayList<Vclass>();
	String vote_id;

  	public Cast_vote (String id)
	{
		 vote_id = id;
	};

	 public void addVote(Vclass arg) {
	     _candidates.add(arg);
	   }
	
	 public String getVoteID ()
	 {
		 return vote_id;
	 };
	 
	 public String vote_result()
	 {
		 int vote1=0;
		 int vote2=0;
		
		 Enumeration<Vclass> candidates = Collections.enumeration(_candidates);
		 String result = "Final Voting Results \n" ;
		
		 while(candidates.hasMoreElements())
		 {
		
			 Vclass each = (Vclass) candidates.nextElement();
			
			  
			 if(each.getCandidate().getCand_id() == "100")
			 {
				 vote1=vote1+each.getCandidate().votes;
			 }
			 else if(each.getCandidate().getCand_id() == "101")
			 {

				 vote2=vote2+each.getCandidate().votes;
			 }
			 
			 result += "\t" + each.getCandidate().getCand_name() + "\t" + each.getCandidate().getCand_constituency() +"\n";
		 }
		 return result;
	 }
}



