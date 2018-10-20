package orgHRMFunctional;

public class TestSuite {

	public static void main(String[] args) throws InterruptedException 
	{
		//Login
		
		OrgHRMLib om=new OrgHRMLib();
		
		String res=om.OrgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Application closed successfully");
		
		//EmpReg
		res=om.OrgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgEmpReg("N", "ManasaReddy", "NM7890");
		System.out.println("Employee Registration "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Application closed successfully");

		//userreg
		res=om.OrgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgUserReg("N ManasaReddy", "NManasaReddy12345", "NManasaReddy12345", "NManasaReddy12345");
		System.out.println("User Registration "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Application closed successfully");
		
		//UserLogin
		
		res=om.OrgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("ManasaReddy1234", "ManasaReddy1234");
		System.out.println("Application Login "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Application closed successfully");
	}

}
