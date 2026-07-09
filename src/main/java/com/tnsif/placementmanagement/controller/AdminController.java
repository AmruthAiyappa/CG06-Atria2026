package com.tnsif.placementmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnsif.placementmanagement.entity.Admin;
import com.tnsif.placementmanagement.service.AdminService;

@RestController
public class AdminController {

    @Autowired
    private AdminService as;

    // Create
    @PostMapping("/saveadmin")
    public Admin saveAdmin(@RequestBody Admin a) {
        return as.saveAdmin(a);
    }

    // Read
    @GetMapping("/getadmins")
    public List<Admin> getAdmins() {
        return as.getAdmins();
    }

    // Update
    @PutMapping("/updateadmin")
    public Admin updateAdmin(@RequestBody Admin a) {
        return as.updateAdmin(a);
    }

    // Delete
    @DeleteMapping("/deleteadmin/{id}")
    public void deleteAdmin(@PathVariable("id") Integer id) {
        as.deleteAdmin(id);
    }
}