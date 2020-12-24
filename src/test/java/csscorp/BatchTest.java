package csscorp;

import static csscorp.TestUtils.businessTestFile;
import static csscorp.TestUtils.currentTest;
import static csscorp.TestUtils.yakshaAssert;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;
public class BatchTest {

	@Test
	public void testBatchCodeExists() throws IOException {
		//fail("Not yet implemented");
		Batch batch = new Batch();
		boolean bcode=false;
		assertNotNull(batch);
		Field[] fields = batch.getClass().getDeclaredFields();
		for(Field f: fields) {
			if(f.getName().equals("batchCode")) {
				bcode=true;
				break;
			}
		}
		yakshaAssert(currentTest(),(bcode?true:false),businessTestFile);
		
	}
	@Test
	public void testStartDateExists() throws IOException {
		//fail("Not yet implemented");
		Batch batch = new Batch();
		boolean sdate=false;
		assertNotNull(batch);
		Field[] fields = batch.getClass().getDeclaredFields();
		for(Field f: fields) {
			if(f.getName().equals("startDate")) {
				sdate=true;
				break;
			}
		}
		yakshaAssert(currentTest(),(sdate?true:false),businessTestFile);
		
	}
	
	@Test
	public void testEndDateExists() throws IOException {
		//fail("Not yet implemented");
		Batch batch = new Batch();
		boolean edate=false;
		assertNotNull(batch);
		Field[] fields = batch.getClass().getDeclaredFields();
		for(Field f: fields) {
			if(f.getName().equals("endDate")) {
				edate=true;
				break;
			}
		}
		yakshaAssert(currentTest(),(edate?true:false),businessTestFile);
		
	}
	@Test
	public void testTraineesExists() throws IOException {
		//fail("Not yet implemented");
		Batch batch = new Batch();
		boolean trainees=false;
		assertNotNull(batch);
		Field[] fields = batch.getClass().getDeclaredFields();
		for(Field f: fields) {
			if(f.getName().equals("trainees")) {
				trainees=true;
				break;
			}
		}
		yakshaAssert(currentTest(),(trainees?true:false),businessTestFile);
		
	}
	
	
	@Test
	public void testGetTraineesMethodExists() throws IOException {
		//fail("Not yet implemented");
		Batch batch = new Batch();
		boolean traineesMethod=false;
		assertNotNull(batch);
		Method[] methods = batch.getClass().getDeclaredMethods();
		for(Method m: methods) {
			if(m.getName().equals("getTrainees")) {
				traineesMethod=true;
				break;
			}
		}
		yakshaAssert(currentTest(),traineesMethod,businessTestFile);
		
	}
	@Test
	public void testGetTraineeMethodExists() throws IOException {
		//fail("Not yet implemented");
		Batch batch = new Batch();
		boolean traineeMethod=false;
		assertNotNull(batch);
		Method[] methods = batch.getClass().getDeclaredMethods();
		for(Method m: methods) {
			if(m.getName().equals("getTrainee")) {
				traineeMethod=true;
				break;
			}
		}
		yakshaAssert(currentTest(),traineeMethod,businessTestFile);
		
	}
	@Test
	public void testTraineeExceptionExists() throws IOException {
		//fail("Not yet implemented");
		Batch batch = new Batch();
		boolean isExists=false;
		assertNotNull(batch);
		Method[] methods = batch.getClass().getMethods();
		for(Method m :methods) {
			Object[] exps = m.getExceptionTypes();
			for(Object obj: exps) {
			if(obj.equals("TraineeNotFoundException")) {
				System.out.println(obj);
				isExists = true;
				break;
			}
			}
		}
		yakshaAssert(currentTest(),isExists,businessTestFile);
		
	}

}
