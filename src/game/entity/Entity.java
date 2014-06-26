package game.entity;

public class Entity {

	protected String name;
	protected float x, y;

	/*
	 * Gets x coordinate of entity.
	 */
	public float getX() {
		return x;
	}

	/*
	 * Sets x coordinate of entity.
	 */
	public void setX(float x) {
		this.x = x;
	}

	/*
	 * Gets y coordinate of entity.
	 */
	public float getY() {
		return y;
	}

	/*
	 * Sets y coordinate of entity.
	 */
	public void setY(float y) {
		this.y = y;
	}

	/*
	 * Gets name of entity.
	 */
	public String getName() {
		return name;
	}

	/*
	 * Sets name of entity.
	 */
	public void setName(String name) {
		this.name = name;
	}
}