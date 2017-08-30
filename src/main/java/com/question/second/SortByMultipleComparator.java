package com.question.second;

import com.question.second.comparator.GPAComparator;
import com.question.second.comparator.IDComparator;
import com.question.second.comparator.NameComparator;
import com.question.second.comparator.StudentMultipleComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//created by adzam on 31/8/2017
public class SortByMultipleComparator {

    public static void main(String[] args) {

        System.out.println("===== SORTING BY MULTIPLE ATTRIBUTES =====");

        List<StudentDTO> listStudentDTOs = new ArrayList<StudentDTO>();

        listStudentDTOs.add(new StudentDTO(33, "Tina", 3.68));
        listStudentDTOs.add(new StudentDTO(85, "Louis", 3.85));
        listStudentDTOs.add(new StudentDTO(56, "Samil", 3.75));
        listStudentDTOs.add(new StudentDTO(19, "Samar", 3.75));
        listStudentDTOs.add(new StudentDTO(22, "Lorry", 3.76));

        System.out.println("*** Before sorting:");

        for (StudentDTO student : listStudentDTOs) {
            System.out.println(student);
        }

        Collections.sort(listStudentDTOs, new StudentMultipleComparator(
                new GPAComparator(),
                new NameComparator(),
                new IDComparator())
        );

        System.out.println("\n*** After sorting:");

        for (StudentDTO emp : listStudentDTOs) {
            System.out.println(emp);
        }

    }
}
