

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.genericLib.BestTest;
import org.openqa.selenium.WebDriver;
import org.pomRepository.BasePage;
import org.pomRepository.CellphonesPage;
import org.pomRepository.CheckoutPage;
import org.pomRepository.CompletedPage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TC_BuyProduct_003_Test extends BestTest{
	
	@Test
	public void buyProductMethod() throws EncryptedDocumentException, IOException, InterruptedException
	{
		WebDriver driver;
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesLink().click();
		
		CellphonesPage cpp = new CellphonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true,"Product is not added to cart");
		
		bp.getShoppingCartLink().click();
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getSmartphoneCartItem().click();
		scp.getTearmsofserviceCheckbox().click();
		scp.getCheckoutButton().click();
		
		String city = Flib.getWorkbookCellValue("buyproductcreads", 1, 0);
		String address1 = Flib.getWorkbookCellValue("buyproductcreads", 1, 1);
		String pincode =Flib.getNumericCellValueMethod("buyproductcreads", 1, 2);
		String contact = Flib.getNumericCellValueMethod("buyproductcreads", 1, 3);
		
		int rn = Flib.generateRandomNo();
		String phoneNo = contact+rn;
		
		CheckoutPage cop= new CheckoutPage(driver);
		cop.buyProduct(city, address1, pincode, phoneNo);
		
		CompletedPage comp = new CompletedPage(driver);
		SoftAssert sa1=new SoftAssert();
		
		sa1.assertEquals(pincode, contact, phoneNo);
		sa1.assertEquals(comp.getOrderPlacedMsg().isDisplayed(), true, "Your order is not placed");
		sa1.assertAll();
		
		
		
		
		
		
		
	}

}
