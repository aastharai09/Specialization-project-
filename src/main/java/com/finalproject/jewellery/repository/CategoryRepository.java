package com.finalproject.jewellery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalproject.jewellery.model.Category;

 
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

   

}
