package com.instanceCounter.prg;

class InstanceCounter{
	private static int count;
	
	public InstanceCounter () {
		InstanceCounter.count = InstanceCounter.count + 1;
	}
	
	public static int getInstance() {
		return count;
	}
}

public class InstanceCount {
	public static void main(String[] args) {
		
		System.out.println("Instance count: "+InstanceCounter.getInstance());
		
		InstanceCounter c1 = new InstanceCounter();
		InstanceCounter c2 = new InstanceCounter();
		InstanceCounter c3 = new InstanceCounter();
		
		System.out.println("Instance count:"+InstanceCounter.getInstance());
	}

}
