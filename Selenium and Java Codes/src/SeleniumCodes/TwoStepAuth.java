package SeleniumCodes;

import org.jboss.aerogear.security.otp.Totp;

public class TwoStepAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Totp totp=new Totp("j7fo bnqp brbi lh57 sdv6 5tjm rn5p thea");
		String twoFactorCode=totp.now();
		System.out.println("Two factor code is :"+twoFactorCode);
	}

}
