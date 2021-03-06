/*
 Jackson Frank
 File: Cylinder.java
 Purpose: to return the volume and SA of a cylinder
 */
public class Cylinder implements Interface3D {
	private float BRadius, height;
	
	public Cylinder (float BRadius, float height) {
		this.BRadius = BRadius;
		this.height = height;
	}
	
	public float getVolume() {
		return (float)(Math.PI * (BRadius * BRadius));
	}
	public float getSA() {
		return (float)((2f * Math.PI * BRadius * height) + (2f * Math.PI * BRadius * BRadius));
	}
	
}
