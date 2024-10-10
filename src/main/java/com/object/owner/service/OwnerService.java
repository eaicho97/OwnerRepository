package com.object.owner.service;

import com.object.owner.model.Owner;
import com.object.owner.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public Owner saveOwner(Owner newOwner){
        return ownerRepository.save(newOwner);
    }

    public List<Owner> getAllOwners(){
        return ownerRepository.findAll();
    }

    public Optional<Owner> getOwnerById(Long id){
        return ownerRepository.findById(id);
    }

    public void deleteOwner(Long id){
        ownerRepository.deleteById(id);
    }
}
