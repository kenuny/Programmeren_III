package domein;

import java.util.Comparator;

public class StudentVergelijkenOpNaamEnVoornaam implements Comparator<Student> 
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		int res = o1.getNaam().compareTo(o2.getNaam());
		if(res == 0)
			res = o1.getVoornaam().compareTo(o2.getVoornaam());
			
		return res;
	}

}
