
public class PrimeCheck {

	public static void main(String[]args) {
		
		prime();
		
	}
	public static void prime() {
		
		for(int i = 2; i <= 1000 ; i++) {
			
			boolean isPrime = true;
			
			for(int j = 2; j < i ; j++) {
				if(i % j == 0) {
					
					isPrime = false;
					break;
					
				}
				
			}
			if(isPrime) {
				
				System.out.println(i);
			}
		}
		
	}
}

//so we have static method prime in it we have for loop where i is 2 if i is less than 1000 or = to 1000 jvm willl go downward to the nxt line now here isPrime is true another for loop where j is 2 if j  is less than i which is 2 than condition is false  than it will go to the if (isPrime) which is 2 it will print 2 than jvm will return to 1st for loops i++ now i is 3 now heres comes the twist i(3) is less than the 1000 isPrime true for now nxt for loop j = 2 j< 3 true now if block if i (3) divided by j(2) == 0 than conditon is true (means if the number can be divided by 2 purely than it is not a prime num)but 3/2 = 1 it is false in the if than it will return to j++ so after the 2nd loops one round completed the state is i is 3 (prime num) j (now 3) jvm checks condition for 2nd for loop which is now false  now jvm moves to the if isPrime which is true because in the 2nd loop if stmt was false thats why isPrime was never changed n it prints out 3 our 1st prime num and jvm goes back to 1st loop now i is 4 still less than 1000 cycle continues until the i becomes = or > 1000 (this fried my brain for while but i got it)
