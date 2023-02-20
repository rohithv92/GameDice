package src;

public class Player {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	private String name;
	private int score;
	private int id;
	private int min;
	private int max;
	private int remaining;
	private int position;
	

    Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.score = 0;
        this.min = 0;
        this.max = 20;
        this.remaining = max-min;
        this.position=0;
        
    }
    
    public Player() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return name + " [" + score + "]";
    }
    
    public String knowMyPosition() {
        return name + " [" + position + "]";
    }
}
