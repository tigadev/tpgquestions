package com.question.second.comparator;

import com.question.second.StudentDTO;

import java.util.Comparator;

//created by adzam on 31/8/2017
public class IDComparator implements Comparator<StudentDTO> {
    @Override
    public int compare(StudentDTO o1, StudentDTO o2) {
        return o1.getId() - o2.getId();
    }
}
