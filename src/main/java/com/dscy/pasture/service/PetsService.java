package com.dscy.pasture.service;

import com.dscy.pasture.entity.Pets;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface PetsService {
    PageInfo selectPetsList(Integer currentPage,String petsName);

    Pets queryPetsById(Integer petsId);

    int delPetsBypetsId(Integer petsId);

    int addPets(Pets pets);

    int updatePetsById(Pets pets);

    List<Pets> queryPetsList();
}
