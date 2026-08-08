package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() { return repo.findAll(); }
    public Optional<Student> getById(Long id) { return repo.findById(id); }
    public Student create(Student s) { return repo.save(s); }
    public Student update(Long id, Student s) {
        s.setId(id);
        return repo.save(s);
    }
    public void delete(Long id) { repo.deleteById(id); }
}