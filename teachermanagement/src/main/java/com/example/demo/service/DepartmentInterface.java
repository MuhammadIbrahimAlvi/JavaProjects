package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.dto.DepartmentDTO;

import java.util.List;
import java.util.Optional;

public interface DepartmentInterface {
    public DepartmentDTO createDept(DepartmentDTO depart);

    public String deleteDept(long dId);

    public List<DepartmentDTO> createDepts(List<DepartmentDTO> departs);

    public Optional<Department> getDeptById(long dId);

    public DepartmentDTO updateDepart(DepartmentDTO depart);
}
