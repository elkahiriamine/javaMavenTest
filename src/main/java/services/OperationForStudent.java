package services;

import model.Student;

public interface OperationForStudent {
    public void addStudent(Student student);
    public void removeStudentById(Long id);
    public void updateStudent(Student student);
}
