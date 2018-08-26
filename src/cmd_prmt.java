
public class cmd_prmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && " 
				+ "ping x.x.x.x && snmpwalk -v2c -c [community string] x.x.x.x \"");
		}
		catch (Exception e) {
			System.out.println("wrong");
			e.printStackTrace();
		}

	}

}
