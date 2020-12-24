package csscorp;

import static csscorp.TestUtils.businessTestFile;
import static csscorp.TestUtils.currentTest;
import static csscorp.TestUtils.yakshaAssert;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

public class TraineeTest {
	
	Trainee trainee;
	@Before
	public void setUp() {
		trainee = new Trainee();
	}

	@Test
	public void testTraineeIdExists() throws IOException {
		//fail("Not yet implemented");
		Trainee trainee = new Trainee();
		boolean isExists=false;
		Field[] fields = trainee.getClass().getDeclaredFields();
		for(Field f: fields) {
			if(f.getName().equals("traineeId")) {
				isExists=true;
				break;
			}
		}
		yakshaAssert(currentTest(),isExists,businessTestFile);
	}
	@Test
	public void testTraineeNameExists() throws IOException {
		//fail("Not yet implemented");
		Trainee trainee = new Trainee();
		boolean isExists=false;
		Field[] fields = trainee.getClass().getDeclaredFields();
		for(Field f: fields) {
			if(f.getName().equals("traineeName")) {
				isExists=true;
				break;
			}
		}
		yakshaAssert(currentTest(),isExists,businessTestFile);
	}
	@Test
	public void testContactNoExists() throws IOException {
		//fail("Not yet implemented");
		Trainee trainee = new Trainee();
		boolean isExists=false;
		Field[] fields = trainee.getClass().getDeclaredFields();
		for(Field f: fields) {
			if(f.getName().equals("contactNo")) {
				isExists=true;
				break;
			}
		}
		yakshaAssert(currentTest(),isExists,businessTestFile);
	}
	@Test
	public void testEmailExists() throws IOException {
		//fail("Not yet implemented");
		Trainee trainee = new Trainee();
		boolean isExists=false;
		Field[] fields = trainee.getClass().getDeclaredFields();
		for(Field f: fields) {
			if(f.getName().equals("email")) {
				isExists=true;
				break;
			}
		}
		yakshaAssert(currentTest(),isExists,businessTestFile);
	}
	@Test
	public void testGenderExists() throws IOException {
	
		//fail("Not yet implemented");
		Trainee trainee = new Trainee();
		boolean isExists=false;
		Field[] fields = trainee.getClass().getDeclaredFields();
		for(Field f: fields) {
			if(f.getName().equals("gender")) {
				isExists=true;
				break;
			}
		}
		yakshaAssert(currentTest(),isExists,businessTestFile);
	}
	@Test
	public void testAgeExists() throws IOException {
	
		//fail("Not yet implemented");
		Trainee trainee = new Trainee();
		boolean isExists=false;
		Field[] fields = trainee.getClass().getDeclaredFields();
		for(Field f: fields) {
			if(f.getName().equals("age")) {
				isExists=true;
				break;
			}
		}
		yakshaAssert(currentTest(),isExists,businessTestFile);
	}
	
}
