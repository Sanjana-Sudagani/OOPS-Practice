class MyMessenger1{
	Protocolhandler handler;
	public MyMessenger1(String Protocol) {
		handler=ProtocolHandlerF.getProtocolHandler(Protocol);
	}
	public void send(String to, String message) {
		handler.sendMessage("message"+to+"-"+message);
	}
}

interface Protocolhandler{
	void sendMessage(String message);
}

class TCPPH implements Protocolhandler{
	public void sendMessage(String message) {
		System.out.println("TCP Sending Message");
	}
}

class UDPPH implements Protocolhandler{
	public void sendMessage(String message) {
		System.out.println("UDP Sending Message");
	}
}

class ProtocolHandlerF{
	public static Protocolhandler getProtocolHandler(String Protocol) {
		if("TCP".equalsIgnoreCase(Protocol)) {
			return new TCPPH();
		}
		if("UDP".equalsIgnoreCase(Protocol)) {
			return new UDPPH();
		}
	return null;
}}
public class dependency {
	public static void main(String[] args) {
		MyMessenger1 msg=new MyMessenger1("UDP");
		msg.send("a", "SOLID principles");
	}

}
