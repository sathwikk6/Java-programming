class dectobin 
{
  public static void main(String[] args) 
  {
    long num = 24;
    int binary = convertDecimaltobinary(num);
    System.out.println("Decimal to binary");
    System.out.println(num + " = " + binary);
  }
   public static int convertDecimaltobinary(long num) 
   {
     int binaryNumber = 0, i = 0;
     long remainder;
     while (num != 0) 
     {
      remainder = num % 2;
      num /= 2;
      binaryNumber += remainder * Math.pow(10, i);
      ++i;
    }
    return binaryNumber;
  }
}