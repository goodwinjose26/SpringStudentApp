package com.example.studentapp2_backend.dao;

import com.example.studentapp2_backend.model.Students;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDao extends CrudRepository<Students,Integer> {
    @Query(value = "SELECT `id`, `admno`, `collegename`, `name`, `rollno` FROM `students` WHERE `admno`=:admno",nativeQuery = true)
    List<Students> searchStudent(@Param("admno") String admno);
}
