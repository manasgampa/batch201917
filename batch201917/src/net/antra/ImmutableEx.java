package net.antra;

public final class ImmutableEx {
	
	private final int x;
	
	public ImmutableEx(int x) {
		this.x=x;
	}
	
	public ImmutableEx setX(int x) {
		return new ImmutableEx(x);
		
	}
	
	public int getX() {
		return this.x;
	}
}
