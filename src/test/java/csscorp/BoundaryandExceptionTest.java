package csscorp;

import static csscorp.TestUtils.boundaryTestFile;
import static csscorp.TestUtils.currentTest;
import static csscorp.TestUtils.exceptionTestFile;
import static csscorp.TestUtils.yakshaAssert;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class BoundaryandExceptionTest {

	@Test
	public void testDummyException() throws IOException{
		yakshaAssert(currentTest(),true,exceptionTestFile);
	}
	@Test
	public void testDummyBoundary() throws IOException{
		yakshaAssert(currentTest(),true,boundaryTestFile);
	}


}
