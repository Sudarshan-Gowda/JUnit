# JUnit4:

## Basic Information:
  •	@Test annotation should be placed on the top of the method to test the functions.
  •	Any test method should be public and return type is void.
 
## Basic Methods:
  •	assertEquals(expected, actual);

  •	assertTrue(trueCondition);
  •	assertFalse(falseCondition);
 

## @Before and @After Annotation
•	@Before annotation is used to setup some conditions that will be executed before the every test method.
•	@After annotation is used to setup some conditions that will be executed after the every test method.
 
•	Demonstrations:
 
  Result:
       
#### Observation: 
method with @Before annotations will be executed before the for every test method and after method will be after the test method.

## Other methods
•	assertArrayEquals(expected, actual)  <br>
To compare the array elements we will use assertArrayEquals method.   <br>
 
•	To handle the exception  <br>

•	To do performance test  <br>
 
•	Parameterized test
  o	Configure @RunWith(Parameterized.class) annotation <br>
  o	Define static method with @Parameters annotations  <br>
  o	Create constructors with parameters  <br>
  o	Pass the parameters as input for the functions.  <br>
 

•	Organize into suites <br>
  o	Create a class and configure  @RunWith(Suite.class) <br>
  o	Use annotation @SuiteClasses and define the classes which need to be suites <br>
  For ex:   ``@SuiteClasses({ QuickBeforeAfterTest.class, StringHelperTest.class })`` <br>
	     
	 
