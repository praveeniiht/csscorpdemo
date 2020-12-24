package csscorp;

public class TraineeNotFoundException extends RuntimeException{
	
	TraineeNotFoundException(){
		super("Trainee is not found");
	}

}
