package domein;

import java.util.Objects;

public class Student  implements Comparable<Student>
{

    private long stamboeknr;
    private String naam, voornaam, woonplaats;

    public Student(long stamboeknr, String naam, String voornaam, String woonplaats)
    {
        controleStamboeknr(stamboeknr);
        controleNullString(naam);
        controleNullString(voornaam);
        controleNullString(woonplaats);
        this.stamboeknr=stamboeknr;
        this.naam=naam;
        this.voornaam=voornaam;
        this.woonplaats=woonplaats;
    }

    @Override
    public int hashCode()
    {
//        int hash = 3;
//        hash = 61 * hash + (int) (this.stamboeknr ^ (this.stamboeknr >>> 32));
//        return hash;
//        
        return Objects.hash(this.stamboeknr);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Student other = (Student) obj;
        if (this.stamboeknr != other.stamboeknr)
        {
            return false;
        }
        return true;
    }

    public long getStamboeknr()
    {
        return stamboeknr;
    }

    private void controleStamboeknr(long stamboeknr)
    {
        if(stamboeknr==0)
            throw new IllegalArgumentException("Geen correct stamboeknr");
    }
    
    public void setStamboeknr(long stamboeknr)
    {
        controleStamboeknr(stamboeknr);
        this.stamboeknr = stamboeknr;
    }

    public String getNaam()
    {
        return naam;
    }

    private void controleNullString(String string)
    {
        if(string==null)
            throw new IllegalArgumentException("Null");
    }
    
    public void setNaam(String naam)
    {
        controleNullString(naam);
        this.naam = naam;
    }

    public String getVoornaam()
    {
        return voornaam;
    }

    public void setVoornaam(String voornaam)
    {
        controleNullString(voornaam);
        this.voornaam = voornaam;
    }

    public String getWoonplaats()
    {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats)
    {
        controleNullString(woonplaats);
        this.woonplaats = woonplaats;
    }

    

    @Override
    public int compareTo(Student o)
    {
        //return this.stamboeknr-o.stamboeknr lukt niet omdat het een long is
        return Long.compare(this.stamboeknr,o.stamboeknr);        
    }

    @Override
    public String toString()
    {
        return "\nStudent{" + "stamboeknr=" + stamboeknr + ", naam=" + naam + ", voornaam=" + voornaam + ", woonplaats=" + woonplaats + '}';
    }

    
    

}
