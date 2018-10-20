package orgHRMFunctional;

public class UserLoginTC {

	public static void main(String[] args) throws InterruptedException 
	{
		OrgHRMLib om=new OrgHRMLib();
		
		String res=om.OrgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("ManasaReddy1234", "ManasaReddy1234");
		System.out.println("Application Login "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Application closed successfully");

	}

}
