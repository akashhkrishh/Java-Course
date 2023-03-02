class StringBuffer{
	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("Shelkton");
		System.out.println("Mutable String");
		name.append(".A");
		name.insert(0, "Antony ");
		System.out.println(name);
				
	}
}
