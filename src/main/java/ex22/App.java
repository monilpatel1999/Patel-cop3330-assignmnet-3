/* Exercise 22
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Monil_Patel
 */
package ex22;
public class App {

    nums = []

    def getANum(msg):
    n = int(input(msg))
            while n in nums:
    print('Duplicate number. Enter again: ')
    n = int(input(msg))
            return n

        nums.append(getANum('Enter the first number: '))
            nums.append(getANum('Enter the second number: '))
            nums.append(getANum('Enter the third number: '))

            # Now we have all the three numbers
            max = nums[0]
        for i in range(1, len(nums)):
            if nums[i] > max:
    max = nums[i]
}
