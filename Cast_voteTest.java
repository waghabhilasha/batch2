import static org.junit.Assert.*;

import org.junit.Test;

public class Cast_voteTest {
	Candidate c1,c2;
	Cast_vote v1;

	@Test
	public void test() {
		c1 = new Candidate ("ABC","Mapusa","100",0);
		c2 = new Candidate ("XYZ","Mapusa","100",0);
		v1 = new Cast_vote("ME");
		v1.addVote(new Vclass(c1));
		v1.addVote(new Vclass(c2));
		System.out.println(v1.vote_result());

		//fail("Not yet implemented");
	}

}
