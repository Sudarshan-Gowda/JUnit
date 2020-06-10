# JUnit4:

## Basic Information:
  •	@Test annotation should be placed on the top of the method to test the functions. <br>
  •	Any test method should be public and return type is void. <br>
  	<img src="./docs/pic1.png"/>
 
## Basic Methods:
 <ul>
	<li>`assertEquals(expected, actual);` <br>
	<img src="./docs/pic2.png"/>	
	</li>	
	<li>
	`assertTrue(trueCondition);` <br>
	</li>
	<li>
	`assertFalse(falseCondition);` <br>
	<img src="./docs/pic3.png"/>
	</li>	
 </ul>	

## @Before and @After Annotation
<ul>
	<li>`@Before` annotation is used to setup some conditions that will be executed before the every test method.</li>
	<li>`@After` annotation is used to setup some conditions that will be executed after the every test method.<br>
	<img src="./docs/pic4.png"/> <br>
	</li>
	<li>Demonstrations:<br>
	  <img src="./docs/pic5.png"/><br>
	  Result: <br>
 	 <img src="./docs/pic6.png"/>
	</li>	
</ul>	
       
<b> Observation: </b> method with @Before annotations will be executed before the for every test method and after method will be after the test method.

## Other methods

•	`assertArrayEquals(expected, actual)`  <br>
	To compare the array elements we will use assertArrayEquals method.   <br>
 	<img src="./docs/pic7.png"/>
	
•	To handle the exception  <br>
	<img src="./docs/pic8.png"/>
	
•	To do performance test  <br>
 	<img src="./docs/pic9.png"/>
	
•	Parameterized test
	<ol>
		<li>Configure `@RunWith(Parameterized.class)` annotation</li>	
		<li>Define static method with `@Parameters` annotations</li>	
		<li>Create constructors with parameters</li>	
		<li>Pass the parameters as input for the functions.</li>	
	</ol>
 	<img src="./docs/pic10.png"/>

•	Organize into suites <br>
	<ol>
		<li>Create a class and configure  ` @RunWith(Suite.class)` </li>	
		<li>Use annotation `@SuiteClasses` and define the classes which need to be suites</li>	
	</ol>
	  For ex:   `@SuiteClasses({ QuickBeforeAfterTest.class, StringHelperTest.class })` <br>
		<img src="./docs/pic11.png"/>
		<img src="./docs/pic12	.png"/>
	     
	 
