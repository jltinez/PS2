import static org.junit.Assert.*;
public class MyInteger_Test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testIsEven() {
		int integerTest= 7;
		MyInteger instance= new MyInteger(integerTest);
		boolean expectedRes= true;
		boolean actualRes= instance.isEven();
		assertEquals("testIsEven() failed",expectedRes,actualRes);
	}
	public void testIsOdd() {
		int integerTest= 3;
		MyInteger instance= new MyInteger(integerTest);
		boolean expectedRes= true;
		boolean actualRes= instance.isEven();
		assertEquals("testIsEven() failed",expectedRes,actualRes);
	}
	public void testIsPrime() {
		int integerTest= 17;
		MyInteger instance= new MyInteger(integerTest);
		boolean expectedRes= true;
		boolean actualRes= instance.isEven();
		assertEquals("testIsEven() failed",expectedRes,actualRes);
	}
}
