import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Task{
	private int month, day, anxietyLevel, difficultyLevel;
	private String name;
	private int currMonth;
	private int currDay;
	public Task(int month, int day, String name, int anxietyLevel, int difficultyLevel)
	{
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
		String currDate = date.format(formatter);
		String currMonth = currDate.substring(0, 2);
		String currDay = currDate.substring(3);
		if (currMonth.substring(0, 1).equals("0"))
		{
			Integer.parseInt(currMonth.substring(1));   
		}
		else 
		{
			Integer.parseInt(currMonth);   
		}
		if (currDay.substring(0,1).equals("0"))
		{
			Integer.parseInt(currDay.substring(1));   
		}
		else 
		{
			Integer.parseInt(currDay);   
		}
		
		////////////////////////
		this.month = month;
		this.day = day;
		this.anxietyLevel = anxietyLevel;
		this.name = name;
		this.difficultyLevel = difficultyLevel;
		calculateDifficulty();
		
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAnxietyLevel()
	{
		return anxietyLevel;
	}
	
	public void setAnxietyLevel(int anxiety)
	{
		anxietyLevel = anxiety;
	}
	
	public void setDifficultyLevel(int d)
	{
		difficultyLevel = d;
	}
	
	public int getDifficultyLevel()
	{
		return difficultyLevel;
	}
	
    public void calculateDifficulty()
    {
    	Task a = this;
    	int difficulty = 0;
	    	if (a.getName().indexOf("essay") > -1)
	    	{
	    		difficulty += 10;
	    	}
	    	if (a.getName().indexOf("page") > -1)
	    	{
	    		difficulty += 9;
	    	}
	    	if (a.getName().indexOf("research") > -1)
	    	{
	    		difficulty += 8;
	    	}
	    	if (a.getName().indexOf("design") > -1)
	    	{
	    		difficulty += 7;
	    	}
	    	if (a.getName().indexOf("create") > -1)
	    	{
	    		difficulty += 6;
	    	}
	    	if (a.getName().indexOf("calculus") > -1)
	    	{
	    		difficulty += 5;
	    	}
	    	if (a.getName().indexOf("explain") > -1)
	    	{
	    		difficulty += 4;
	    	}
	    	if (a.getName().indexOf("problem") > -1)
	    	{
	    		difficulty += 3;
	    	}
	    	if (a.getName().indexOf("solve") > -1)
	    	{
	    		difficulty += 2;
	    	}
	    	if (a.getName().indexOf("worksheet") > -1)
	    	{
	    		difficulty += 1;
	    	}
    	 
    	difficulty += a.getAnxietyLevel();
    	
    	setDifficultyLevel(difficulty);
    }
    
	public String toString()
	{
		return month + "/" + day + " " + name + "| " + "Anxiety Level: " + anxietyLevel + "| Rating: " + difficultyLevel;
	}
}