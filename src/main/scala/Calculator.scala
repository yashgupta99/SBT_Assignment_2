// SBT_Assignment_2
// This class has some methods in which I implement the mathematical operations
class Calculator{

  def add(addend1:Int, addend2:Int):Int = addend1 + addend2

  def subtract(minuend:Int, subtrahend:Int):Int = minuend - subtrahend

  def multiply(multiplier:Int, multiplicand:Int):Long = multiplier * multiplicand

//This method is for Division if the denominator/divisor is zero it will print the message and also return the value zero 
  def divide(dividend:Int , divisor:Int):Double = {
    var result = 0
    if(divisor != 0){
      result = dividend/divisor
    }
    else{
      print("divisor can't be zero")
    }
    result
  }


//In this method there is a loop through which the the value multiply itself until the loop's iteration does npt equal to power
  def power(value:Int , power:Int):Long = {
    var result = 1
    var temp = power
    while(temp > 0){
      result = result*value
      temp = temp - 1
    }
    result
  }

//It will return always positive value.
  def absolute(value: Int):Int = Math.abs(value)

//Return maximum value from the given two
  def max(num1:Int,num2:Int):Int={
    var result = 0

    if(num1 > num2){
      result = num1
    }
    else{
      result = num2
    }

    result
  }

//Return minimum value from the given two
  def min(num1:Int,num2:Int):Int={
    var result = 0

    if(num1 < num2){
      result = num1
    }
    else{
      result = num2
    }

    result
  }

}

