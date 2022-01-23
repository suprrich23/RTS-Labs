# RTS-Labs

Please write a class in the language of your choice that contains the following two public methods:

aboveBelow
accepts two arguments
An unsorted collection of integers (the list)
an integer (the comparison value)
returns a hash/object/map/etc. with the keys "above" and "below" with the corresponding count of integers from the list that are above or below the comparison value
Example usage:

input: [1, 5, 2, 1, 10], 6

output: { "above": 1, "below": 4 }

stringRotation
accepts two arguments
a string (the original string)
a positive integer (the rotation amount)
returns a new string, rotating the characters in the original string to the right by the rotation amount and have the overflow appear at the beginning
Example usage:

input: "MyString", 2

output: "ngMyStri"