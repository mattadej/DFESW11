package org.qa.generics.service;

import org.qa.generics.domain.Cat;
import org.qa.generics.generic.CatStuff;

import java.util.List;

public class CatService implements CatStuff<Cat> {

    @Override
    public Cat create(Cat t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Cat> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cat getById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cat update(long id, Cat t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean delete(long id) {
        // TODO Auto-generated method stub
        return false;
    }
}