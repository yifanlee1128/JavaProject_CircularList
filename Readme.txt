Some explainations about the answer to q1:

In question 1, I use Array to construct the circularlist instead of using ArrayList, because I think it is helpful for me to understand the logic behind circularlist. I use a integer "_first" to point to the first value of the circular list and use "_last" to point to the last value of the list. when there is only one value in the list, they point to the same element. Whether the list is empty or full, the relation between "_first" and "_last" is

(((_first+_capacity)%_capacity)==((_last+1)%_capacity)) 

so I create a boolean variable called "_empty" to distinguish these two conditions.

Some explainations about the answer to q2:

TreeMap has keys and values, in my code, key is the "returnValue", value is the number of duplicates the returnValue has. For example, the first element we add to the TreeMap is 1.2, so the key-value pair is (1.2,1), when I add another "1.2" to the TreeMap, the key-value pair becomes (1.2,2)

There is a condition that we can return more elements than required, such as there are 5 elements samller than 1 but the program just tell us to return 3 values, in the condition, my code return first 3 values we find which is smaller than 1.