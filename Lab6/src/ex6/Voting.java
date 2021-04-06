package ex6;
import java.util.*;
import java.util.Map.*;

public class Voting {
	Map<String, Integer> map = new HashMap<String, Integer>();
	public void votersList()
	{
		map.put("A01", 21);
		map.put("N66", 12);
		map.put("B88", 38);
		map.put("T77", 88);
	}
	public void eligibility()
	{
		
		List<String> listOfIds = new ArrayList<String>();
		for(Entry<String, Integer> m:map.entrySet())
		{ 
			if(m.getValue()>=18)
			{
				listOfIds.add(m.getKey());
			}
		}
		for(String e : listOfIds)
		{
			System.out.println(e);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting v = new Voting();
		v.votersList();
		v.eligibility();


	}

}
