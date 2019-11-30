package com.company.Questions.ImplsForQuestions;

import com.company.Questions.IfStudent;

public class IfStudentHelper implements IfStudent {


    @Override
    public Boolean isStudent(boolean a) {
        return a;
    }

    @Override
    public Boolean isAdmin(boolean b) {
        return b;
    }

    @Override
    public Boolean notRight(boolean c) {
        return c;
    }
}
