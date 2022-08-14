// Hashing is a search technique
// Time complexity: O(1)
// Faster then linear and binary search
//              O(n)        O(log n)
// Hash function: h(key) = key mod table SIZE
// Collision resolution
//    1. Separate chaining
//    2. Open chaining
//          Linear probing
//          Quadratic probing
//          Double hashing
//
// Seaparate chaining
// Create linked list.
//
// Linear probing
// next index from Collision
//
// Quadratic probing
// i=1, 4, 9, 16 from Collision
//
// Double Hashing
// h1(key) = key mod table SIZE
// h2(key) = R-(key mod R)
// R is a immediate prime number less than table SIZE
// Rehashing
// if (table SIZE is filled > 70%)
// calculate new TS = should be a prime number 2*old TS
