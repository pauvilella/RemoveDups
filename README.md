# RemoveDups
Exercise related with Linked Lists.

## Exercise Challenge
Write code to remove duplicates from an unsorted liked list.

### Solution
I implemented both solutions with my own implementation of the singly linked list. 
At the first one, what I did was using a hashset in order to insert the different values of the likedlist I'm traversing. 
If I see a value in the linkedlist that already is at the hashset I delete it from the linked list. 
For traversing the linked list I use two pointers (one current and one previous) so it's easier to delete a certain node from the list. 
This solution runs in O(N) runtime where N is the length of the linked list; and takes the extra space of the hashset.

### FOLLOW UP: No Buffer Allowed
To implement this, I use the runner technique. Basically, what I do is traverse the linkedlist with one current pointer and, for each element I see with it, I create another pointer called runner which is going to traverse the linked list from where current was to the end. 
Then, if runner sees another node who has the same value as the current node, he is going to delete it. Implementing it this way, we do not use any additional data structures (so we follow the restriction), but the algorithm runs with O(N^2) runtime.