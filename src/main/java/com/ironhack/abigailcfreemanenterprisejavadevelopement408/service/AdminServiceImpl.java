package com.ironhack.abigailcfreemanenterprisejavadevelopement408.service;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.AdminDTO;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Admin;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public AdminDTO create(AdminDTO adminDTO) {
        var entity = Admin.fromDTO(adminDTO);
        var storedMember = adminRepository.save(entity);

        return adminDTO.fromEntity(storedMember);
    }
}