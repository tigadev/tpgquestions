package com.question.second.comparator;

import com.question.second.StudentDTO;

import java.util.Comparator;

//created by adzam on 31/8/2017
public class GPAComparator implements Comparator<StudentDTO>{

    @Override
    public int compare(StudentDTO o1, StudentDTO o2) {
        if (o1.getGpa() < o2.getGpa()) return 1;
        if (o1.getGpa() > o2.getGpa()) return -1;
        return 0;
    }
}
