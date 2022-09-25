package com.ironhack.abigailcfreemanenterprisejavadevelopement408.model;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.AdminDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String uuid;

    public static Admin fromDTO(AdminDTO dto){
        var adminNew = new Admin();
        adminNew.setName(dto.getName());
        adminNew.setUuid(dto.getUuid());
        return adminNew;
    }
}