package com.radoslawdebosz.jobspringapp.jobportal.services;

import com.radoslawdebosz.jobspringapp.jobportal.entity.UsersType;
import com.radoslawdebosz.jobspringapp.jobportal.repository.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;


    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll(){
        return usersTypeRepository.findAll();
    }
}
