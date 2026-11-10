# Mod 7 Skills Demonstration

> **What are 3 examples of problems that are in NP? Please be as descriptive as possible in describing these problems.**

## 1. Vertex Cover:

>> Problem: Given a graph G and an integer m, find a subset of at most m vertices of G that are touched by all the edges or report that none exists.

The goal is to pick vertices that would be able to see all of the other vertices, as well as edges, along their connected edges. It is important to note that you cannot see through the vertices, so this means that we can only see the vertices connected to our selected vertices along an edge. If the vertices are not connected along an edge, then they cannot see each other. 

Since we can select up to m vertices, we will start with the fewest possible, selecting only one vertex. 

Select (C) and we see that we can only see (A) and (D). 

Select (D) and we can only see (A) and (C). 

Select (A) and we can see all of the vertices, but we cannot see the edge between (C) and (D). 

Select (B) or (E) and we can only see (A). 

Notice that selecting (A) allows me to see the most from the get-go. So I will pick a vertex to add to the vision of (A). 

Select (B) or (E) and I still cannot see the edge between (C) and (D). 

Select (C) or (D) and we can see the final edge. 

The vertex cover for this problem will be (A) and (C or D) 

Since we had to check every combination up to size m, as m increases, the size of the problem increases. With more points to check, the problem takes longer and is harder to find while not making it much more difficult to verify. This makes the problem in NP but not in P. 

## Subset Sum:

>> Given an array of integers, determine whether there exists a subset of them whose sum is 0.

        x = {1342, -1991, 231, -351, 1000}

The only way that we could find a sum of 0 would be to try every single combination of the values. A "1" to indicate that the value is being used in the calculation, and a "0" otherwise.

| $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | Sum |
| :---: | :---: | :---: | :---: | :---: | :---: |
| 0 | 0 | 0 | 0 | 1 | 1,000 |
| 0 | 0 | 0 | 1 | 0 | -351 |
| 0 | 0 | 0 | 1 | 1 | 649 |
| 0 | 0 | 1 | 0 | 0 | 231 |
| 0 | 0 | 1 | 0 | 1 | 1,231 |
| 0 | 0 | 1 | 1 | 0 | -120 |
| 0 | 0 | 1 | 1 | 1 | 880 |
| 0 | 1 | 0 | 0 | 0 | -1,991 |
| 0 | 1 | 0 | 0 | 1 | -991 |
| 0 | 1 | 0 | 1 | 0 | -2,342 |
| 0 | 1 | 0 | 1 | 1 | -1,342 |
| 0 | 1 | 1 | 0 | 0 | -1,760 |
| 0 | 1 | 1 | 0 | 1 | -760 |
| 0 | 1 | 1 | 1 | 0 | -2,111 |
| 0 | 1 | 1 | 1 | 1 | -1,111 |
| 1 | 0 | 0 | 0 | 0 | 1,342 |
| 1 | 0 | 0 | 0 | 1 | 2,342 |
| 1 | 0 | 0 | 1 | 0 | 991 |
| 1 | 0 | 0 | 1 | 1 | 1,991 |
| 1 | 0 | 1 | 0 | 0 | 1,673 |
| 1 | 0 | 1 | 0 | 1 | 2,673 |
| 1 | 0 | 1 | 1 | 0 | 1,322 |
| 1 | 0 | 1 | 1 | 1 | 2,322 |
| 1 | 1 | 0 | 0 | 0 | -649 |
| 1 | 1 | 0 | 0 | 1 | 351 |
| 1 | 1 | 0 | 1 | 0 | -1,000 |
| 1 | 1 | 0 | 1 | 1 | 0 |
| 1 | 1 | 1 | 0 | 0 | -418 |
| 1 | 1 | 1 | 0 | 1 | 682 |
| 1 | 1 | 1 | 1 | 0 | -769 |
| 1 | 1 | 1 | 1 | 1 | 231 |

It is easy to tell by looking at the list of possibilities that the sum is only 0 in one place, so we take note of the values that were used to get the sum (where the columns are 1):

        x_1 = 1342
        x_2 = -1991
        x_4 = -351
        x_5 = 1000

With some simple math, we can quickly check that these are the correct values:

        1342 - 1991 - 351 + 1000 = 0

Since we only had to scan through the results once to find the correct result, it was fast to check, but we had to go through every combination to find the solution, which makes the problem difficult. Thus subset sum is in NP and not in P.

## Boolean Equation Satisfiability:

>> We take m equations using n variables and assume the right side to be true.

        x' + z = true      (NOT x OR z)
        x + y' + z = true  (x OR NOT y OR z)
        x + y = true       (x OR y)
        x' + y' = true     (NOT x OR NOT y)

The problem would be to find the boolean values for x, y, z that would make AND'ing them together true:

        s = (x'+ z)(x + y' + z)(x + y)(x' + y') = true

We can use a table to map all possible boolean values for x, y, z.

| x | y | z | (x'+ z) | (x + y' + z) | (x y) | (x' + y') | s |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| F | F | F | T | T | F | T | F |
| F | F | T | T | T | F | T | F |
| F | T | F | T | F | T | T | F |
| F | T | T | T | T | T | T | T |
| T | F | F | F | T | T | T | F |
| T | F | T | T | T | T | T | T |
| T | T | F | F | T | T | F | F |
| T | T | T | T | T | T | F | F |

From this we can see that only two subsets of x, y, z allow s to be true.

        x = false  x = true
        y = true   y = false
        z = true   z = true

We had to look at every combination of true and false between x, y, z in order to find the solution. However, the solution was easily verifiable once the full table was made. Since the solution was difficult to find but easy to check, boolean equation satisfiability is in NP, but not in P.

## What is the difference between universality, computability, and intractability, in your own words

> Universality tells us that a Turing machine can do any computation that a computer can do.

> Computability tells us that some problems cannot be solved by a Turing machine, and thus by a computer.

> Intractability tells us that a problem cannot be solved in polynomial time.

Since Turing machines are a mirror of the capability of a computer, anything that does not work on a Turing machine will not work on a computer. So, if a problem is not computable or is intractable on a Turing machine, then it will be on a computer as well. I find this fascinating because that mean the study of computers can be entirely done with Turing machines on paper. 
