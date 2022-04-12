package org.qa.generics.service;

import org.qa.generics.domain.Dog;
import org.qa.generics.generic.CatStuff;

import java.util.List;

public class DogService implements CatStuff<Dog> {

    @Override
    public Dog create(Dog t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Dog> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Dog getById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Dog update(long id, Dog t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean delete(long id) {
        // TODO Auto-generated method stub
        return false;
    }

}
