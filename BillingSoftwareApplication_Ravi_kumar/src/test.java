import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.takehome.exception.ProductNotFound;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;


public class test {
	IProductService prods=new ProductService();

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test() throws ProductNotFound {
		prods.getProductDetails(1001);
			}
	@Test(expected=com.capgemini.takehome.exception.ProductNotFound.class)
		public void test2() throws ProductNotFound
		{
		prods.getProductDetails(2014);
	}
	

}
