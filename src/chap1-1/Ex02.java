/*
 * @Author: batkiz 
 * @Date: 2018-08-04 13:25:09 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-04 13:38:40
 */

 /**
  * Ex02 给出以下表达式的类型和值：
  * a. (1 + 2.236) / 2
  * b. 1 + 2 + 3 + 4.0
  * c. 4.1 >= 4
  * d. 1 + 2 + "3"
  */
 public class Ex02 {
 
     public static void main(String[] args) {
        System.out.println((1 + 2.236) / 2); // double
        System.out.println(1 + 2 + 3 + 4.0); // double
        System.out.println(4.1 >= 4); // boolean
        System.out.println(1 + 2 + "3"); // string
     }
 }