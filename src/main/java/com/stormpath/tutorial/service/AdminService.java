package com.stormpath.tutorial.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @PreAuthorize("hasRole(@roles.ADMIN)")
    public boolean ensureAdmin() {
        // per the @PreAuthorize, can only get in here if an admin
        return true;
    }
}
