package com.tnsif.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.placementmanagement.entity.Admin;
import com.tnsif.placementmanagement.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository ar;

    // Create
    public Admin saveAdmin(Admin a) {
        return ar.save(a);
    }

    // Read
    public List<Admin> getAdmins() {
        return (List<Admin>) ar.findAll();
    }

    // Update
 // Update
    public Admin updateAdmin(Admin a) {

        Admin existing = ar.findById(a.getId()).orElse(null);

        if (existing != null) {

            existing.setAdminId(a.getAdminId());
            existing.setEmail(a.getEmail());
            existing.setName(a.getName());
            existing.setPhoneNumber(a.getPhoneNumber());
            existing.setPassword(a.getPassword());
            existing.setDepartment(a.getDepartment());
            existing.setDesignation(a.getDesignation());
            existing.setRole(a.getRole());
            existing.setStatus(a.getStatus());
            existing.setCreatedDate(a.getCreatedDate());

            return ar.save(existing);
        }

        return null;
    }

    // Delete
    public void deleteAdmin(Integer id) {
        ar.deleteById(id);
    }
}