package Assignment8;

public class MotherBoard {
	static class USB{
	int usb2 = 2;
	int usb3 = 1;
	int getTotalPorts() {
		return usb2 + usb3;
		}
	
	static void disp() {
		System.out.println("we ar into static mthods of innr class");
		
	}
	}

public class Static_Nest_Main {

public static void main(String[] args) {
		MotherBoard.USB usb = new MotherBoard.USB();
		System.out.println("total ports = "+usb.getTotalPorts());
		MotherBoard.USB.disp();
		}

}
}
