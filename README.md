# Four-Person-Group-Solver
Attempts to find the optimal 2 groups of 4 to prevent housing heartbreak in the split of 8 friends.

Each person chooses their top 3 people who they wish to live with, with the option to give weighted preference.
The basic idea is that every combination of groups will be calculated and the result that gives the highest total Happiness score will be chosen.

The Happiness is a balance between these two calculations to ensure there are less conflicts and to ensure those who really want to live with each other can

- The Mutual Respect, which is meant to reduce divisiveness. The votes that each person submits are checked against other's weight of them and a mutual
  score is calculated. 

- The Raw Love, which is the total votes group members had for each other.

This was a one day programming job to help solve a problem we had been procrastinating until the last day so excuse my inefficiencies and style
When I have some time I might modernize it

Group calculations:
I didn't know how else to formulate every combination of 2 groups of 4 out of 8 people, 
