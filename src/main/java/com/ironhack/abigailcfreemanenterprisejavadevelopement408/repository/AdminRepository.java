package com.ironhack.abigailcfreemanenterprisejavadevelopement408.repository;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}