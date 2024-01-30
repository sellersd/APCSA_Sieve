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
   // the memory needed. This array allocates space for 20 ints.
   nums = new int[20];

   // This can all be accomplished in a a single statement.
   int[] nums2 = new int[20];

   // Once you have declared  and initialized the array you
   // can place values in the array
    nums[0] = 14;
    System.out.println(nums[0]);

   // Looping can be an efficient way to initialize the array.
   for(int i = 0; i < nums.length(); i++) {
      nums[i] = i;
   }

   // Arrays are indexed, each location in the array has a specific
   // index that refers to it. When we say new int[n] the array
   // has n locations indexed by the integers 0 through n-1
  }
}
