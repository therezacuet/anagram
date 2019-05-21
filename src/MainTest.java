import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MainTest {
	
	Main main;
	String str1, str2;
	boolean expectedResult;
	
	public MainTest(String str1, String str2, boolean expectedResult) {
		this.str1 = str1;
		this.str2 = str2;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
    public static Collection<Object[]> setParameters() {
        Collection<Object[]> params = new ArrayList<>();
        // load the external params here
        // this is an example
        params.add(new Object[] {"table", "bleat",true});
        params.add(new Object[] {"tar","eat",false});

        return params;
    }
	
	@Before
	public void setUp() throws Exception {
		main = new Main(str1, str2);
	}
	
	@Test
	public void testIsAnagram() {
		Assert.assertEquals(expectedResult, main.areAnagram());
	}
	 
	@After
	public void endTest() {
		main = null;
		str1 = null;
		str2 = null;
		expectedResult = false;
	}

}
