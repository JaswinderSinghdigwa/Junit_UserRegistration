
import org.junit.Assert;
import org.junit.Test;
import com.bl.regex.Registration;

public class UserRegistration {
	Registration registration = new Registration();
	
	@Test
    public void Firstname_Shouldbe_True_whenitisproper() {
     Assert.assertTrue(registration.validName("Roney"));
    }
	//
	public void Firstname_Shouldbe_False_whenitisnotproper() {
	     Assert.assertFalse(registration.validName("Roney"));

	}
	
	@Test
    public void Lastname_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validLastName("Singh"));

    }

	public void Lastname_Shouldbe_False_whenitisnotproper() {
	     Assert.assertFalse(registration.validLastName("singh"));

	}
	
	@Test
	public void Email_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validEmail("abc.111@gmail.com"));

	}
	
	public void Email_Shouldbe_True_whenitisnotproper() {
	     Assert.assertFalse(registration.validEmail("abc2!!!;@gmail.com"));

	}
	
	@Test
	public void Mobileno_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validPhoneNumber("919666983674"));

	}
	
	public void Mobileno_Shouldbe_True_whenitisnotproper() {
        Assert.assertTrue(registration.validPhoneNumber("91966698367421"));

	}


}