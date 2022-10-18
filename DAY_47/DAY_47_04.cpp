// Created by KUNTAL OJHA .
// Today 18/10/2022 (dd/mm/yyyy)
// Problem Link: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
// Problem Title: 1523. Count Odd Numbers in an Interval Range
// Platforms: LeedCode
// Programmng Language: C++


class Solution {
public:
    int countOdds(int low, int high) {
        int count=0;
        for(int i = low;low<=high;low++)
        {
             if(low %2  !=0)
             {
                   count++;
             }
        }
        
        return count;
    }
};


