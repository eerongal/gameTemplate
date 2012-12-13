package graphics;

public enum Direction {
	UP(-1), DOWN(1), LEFT(-1), RIGHT(1);
	
	private int value;
	
	private Direction(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
