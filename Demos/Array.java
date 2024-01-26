/* David Sellers
 * 26JAN2024
 * An introduction to arrays
 */

class Array {
  public static void main(String[] args) {
    // Arrays are a collection of data, all of the same type
    // One dimensional arrays are similar to a list
    // Two dimensional arrays are similar to a table
    // To define an array you must declare them using a type and []
    // with an identifier
    int[] nums;

   // An array once declared must be initialized, this allocates
   // the memory needed.
   nums = new int[20];

   // Once you have declared  and initialized the array you
    // can place values in the array
    nums[0] = 14;
    System.out.println(nums[0]);


  }
}
