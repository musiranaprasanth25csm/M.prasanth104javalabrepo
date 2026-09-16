class Nestedif {
	public static void main (String[] args) {
		int a=10,b=2,c=3,d=5;
		if (a>b) {
			if (a>c) {
				if (a>d) {
					System.out.println("a is greatest");
				}
				else {
					System.out.println("d is greatest");
				}
			}
			else {
				if (c>d) {
					System.out.println("c is greatest");
				}
				else {
					System.out.println("d is greatest");
				}
			}
		}
		else {
			if (b>c) {
				if (b>d) {
					System.out.println("b is greatest");
				}
				else {
					System.out.println("d is greatest");
				}
			}
			else {
				if (c>d) {
					System.out.println("c is greatest");
				}
				else {
					System.out.println("d is greatest");
				}
			}
		}
	}
}
		
			