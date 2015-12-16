package leetcodeEasy;

public class Numberof1Bits {
	// Write a function that takes an unsigned integer and returns the number of
	// ’1' bits it has (also known as the Hamming weight).
	//
	// For example, the 32-bit integer ’11' has binary representation
	// 00000000000000000000000000001011, so the function should return 3.
	public int hammingWeight(int n) {
		int count=n<0?1:0;
		for(int i=0;i<31;i++){
			if((n&(1<<i))==(1<<i)){
				count++;
			}
		}
		return count;
	}
}
