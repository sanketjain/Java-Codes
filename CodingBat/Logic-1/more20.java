/*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod

more20(20) → false
more20(21) → true
more20(22) → true
*/

public boolean more20(int n) {
  
  int modtwty = n % 20;
  
  if ((modtwty==1) || (modtwty==2)){
    return true;
  } else {
    return false;
  }
  
}
