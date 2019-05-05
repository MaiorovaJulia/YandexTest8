
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class RunTest {

        @Before
        public  void before() {
                System.out.println("before");
        }

        @After
        public  void after() {
                System.out.println("after");
        }

        @Test
        public void test() {
                System.out.println("test");
        }


        @Test
        public void testAssertEquals() throws Exception {

                Assert.assertEquals( "aui",
                        "aui" );

        }
        @Test
        public void testAssertEqualsError() throws Exception {

                Assert.assertEquals( "aui",
                        "au" );

        }
        }