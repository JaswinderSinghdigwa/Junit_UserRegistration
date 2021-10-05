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
        Assert.assertTrue(registration.validName("Singh"));

    }

	public void Lastname_Shouldbe_False_whenitisnotproper() {
	     Assert.assertFalse(registration.validName("singh"));

	}
	
	@Test
	public void Email_Shouldbe_True_whenitisproper() {
        Assert.assertTrue(registration.validName("abc.111@gmail.com"));

	}
	
	public void Email_Shouldbe_True_whenitisnotproper() {
	     Assert.assertFalse(registration.validName("abc2!!!;@gmail.com"));

	}


}
// this for junit test