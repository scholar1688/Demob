package com.cn;
/*
 * ��Ԫ������ϰ
 */
import static org.junit.Assert.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Parameters;

@RunWith(Parameterized.class)
public class AddMethodTest {
	private static AddMethod am=new AddMethod();
	private int input1;
	private int input2;
	private int result;
	
	//���캯��
	public AddMethodTest(int input1,int input2,int result)
	{
		this.input1=input1;
		this.input2=input2;
		this.result=result;
	}
	
	//ӳ��
	@org.junit.runners.Parameterized.Parameters   //ע��Ҫ���԰�
	public static Collection date()               //Collection������int
	{
		return Arrays.asList(new Object[][]{
				{4,2,2},{2,1,2},{9,3,12}
				});
	}
	
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
	public void testAdd() {
		am.div(input1, input2);
		Assert.assertEquals("---���Բ�ͨ��---", result, am.add(input1, input2));
		System.out.println("Ԥ�ڽ���ǣ�"+result);
		System.out.println("ʵ�ʽ����"+am.add(input1, input2));
	}

	@Ignore
	//@Test(timeout=1000)
	//@Test(expected=ArithmeticException.class)
	@Test
	public void testDiv() throws InterruptedException {
		Thread.sleep(100);
		int c=am.div(2, 0);
		assertEquals("--���Բ�ͨ��---", 1, c);
	}
}


/*注释过，再update
 * 
 * 
 * 注释过，再update
 */
