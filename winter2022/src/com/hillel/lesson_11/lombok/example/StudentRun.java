package com.hillel.lesson_11.lombok.example;

public class StudentRun {
    public static void main(String[] args) {
        Student st = new Student();
//        st.setId(1);
        st.setName("Alex");
        st.setPhone("=38056756875");
//        st.setEmail("email@email.com");
        System.out.println(st);
    }
}
