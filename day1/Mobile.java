package week1.day1;

public class Mobile {

		public void makeCall()
		{
			String mobileModel = "Oppo F19";
			float mobileWeight = 120.20f;
			System.out.println("This is makeCall method");
			
		}
		public void sendMsg()
		{
			boolean isFullCharge = true;
			int mobileCost = 10000;
			System.out.println("This is send msg method");
			
		
		}
		public static void main(String[] args) {
			Mobile mob = new Mobile();
			mob.makeCall();
			mob.sendMsg();
			System.out.println("This is my mobile");
		}
}

