package com.infosys.employeeCourse.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.employeeCourse.model.EmployeeCourse;

@Repository
public interface EmployeeCourseRepository  extends CrudRepository<EmployeeCourse, Integer>{

}
