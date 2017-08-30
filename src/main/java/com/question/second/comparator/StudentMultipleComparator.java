package com.question.second.comparator;

import com.question.second.StudentDTO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//created by adzam on 31/8/2017
public class StudentMultipleComparator implements Comparator<StudentDTO>{

    private List<Comparator<StudentDTO>> listComparators;

    public StudentMultipleComparator(Comparator<StudentDTO>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }

    @Override
    public int compare(StudentDTO student1, StudentDTO student2) {
        for (Comparator<StudentDTO> comparator : listComparators) {
            int result = comparator.compare(student1, student2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }

}
