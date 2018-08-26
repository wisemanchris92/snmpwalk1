
public class cmd_prmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && ping 192.168.204.20 && snmpwalk -v2c -c I$ilonpublic 192.168.204.20\"");
		}
		catch (Exception e) {
			System.out.println("wrong");
			e.printStackTrace();
		}

	}

}
