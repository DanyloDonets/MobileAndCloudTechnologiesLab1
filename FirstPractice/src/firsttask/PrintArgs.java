package firsttask;

public class PrintArgs {

	public static void main(String[] args) {
		for(int i=0; i<args.length;i++) {
			System.out.println(i+1 + ". arg" + "->" + args[i]);
		}

	}
}
