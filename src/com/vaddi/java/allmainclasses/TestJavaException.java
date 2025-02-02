package com.vaddi.java.allmainclasses;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.vaddi.java.exceptions.CustomException;

public class TestJavaException {

	public static void main(String[] args) {
		int[] i = {1,2,3};
		int k = 20;
		
		try {
			System.out.println("Values are ::" +  i[3] + k/0 );
		}
		
		
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException::" +e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutof::" +e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException::" +e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception::" +e.getMessage());
		}
		
		
		try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // This will throw ArrayIndexOutOfBoundsException

            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }  finally {
            System.out.println("Finally block executed.");
        }
		
		
		//Exception Handling using stream
		
		List<Integer> values = Arrays.asList(100,200,34,900);
		
		List<Double> output = values.stream().map(d -> getNewException(d)).map(Math::sqrt).collect(Collectors.toList());
		
		System.out.println("Output .... "+ output);
	}
	
	public static Integer getNewException(Integer k) {
		
			try {
				if(k / 0 == 0) {
				return k;
				}	
			} catch(Exception e) {
				System.out.println("Exception occurred");
				throw new CustomException("Value is / by zero", 403);
			}
			
		return null;
		
	}

}
