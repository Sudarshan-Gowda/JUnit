# JUnit5
Introduction to JUnit5

### Details:

* <b>@Test</b> -- Annotation used to run the test cases.<br>

* In case if we want to get the database connection we can initailze in common method wit beforeAll method which will be called only once at the time of loading the class.<br>
`@BeforeAll` <br>
`@AfterAll` <br>

* In case to load default data for each methods, Can be done in common methods with below annotations which will be called every time of method execution.
`@BeforeEach`<br>
`@AfterEach` <br>
This annotated methods also supports TestInfo as method parameters so we can use it for display of method name etc.

* Some of the methods used are:
`assertEquals(expected, actual);` <br>
`assertTrue(true);` <br>
`assertFalse(false);` <br>

* In JUnit5 method don't need to be public <br>

* @DisplayName("Write the content/message here which is specific to function") <br>

* To do parameterized test: <br>
`@ParameterizedTest` <br>
`@ValueSource(strings = {"",""})` <br>

* Example for parameterized test: <br>
`@ParameterizedTest(name = "{0} upper case is {1}")` <br>
`@CsvSource(value = { "abcd, ABCD", "abc, ABC", "'',''", "abcdef,ABCDEF" })` <br>

* To name the execution  function <br>
`@ParameterizedTest(name = "{0} upper case is {1}")` <br>

* For Repeated Execution: <br>
`@Test` <br>
`@RepeatedTest(10)` <br>

* To test the performance of the application: <br>
  `assertTimeout(Duration.ofSeconds(5), //code here);` <br>

* To disable of skip the test class <br>
`@Disabled`

