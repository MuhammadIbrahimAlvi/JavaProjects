package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.dto.DepartmentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DepartmentService implements DepartmentInterface{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private ModelMapper mapper;
    @Override
    public DepartmentDTO createDept(DepartmentDTO depart) {
        Department d = mapper.map(depart,Department.class);
        return mapper.map(departmentRepository.save(d),DepartmentDTO.class);
    }

    @Override
    public String deleteDept(long dId) {
        departmentRepository.deleteById(dId);
        return "Department Deleted";
    }

    @Override
    public List<DepartmentDTO> createDepts(List<DepartmentDTO> departs) {
        List<Department> dept = departs
                .stream()
                .map(depart -> mapper.map(depart, Department.class))
                .collect(Collectors.toList());

        return departmentRepository.saveAll(dept)
                .stream()
                .map(depart -> mapper.map(depart, DepartmentDTO.class))
                .collect(Collectors.toList());
    }

    public Optional<Department> getDeptById(long dId) {
        return  (departmentRepository.findById(dId));
    }

    @Override
    public DepartmentDTO updateDepart(DepartmentDTO depart) {
        Optional<Department> optionalDepart = departmentRepository.findById((long) depart.getDept_id());
        if(optionalDepart.isPresent()){
          Department  oldDept1 = null;
            oldDept1 = optionalDepart.get();
//            oldDept1.setDept_name(depart.getDept_name());
//            oldDept1.setTeacher_staff(depart.getTeacher_staff());
            Department dept = departmentRepository.save(oldDept1);
            return mapper.map(dept,DepartmentDTO.class);
        }else {
            return new DepartmentDTO();
        }
    }
}
