package com.bnt.TestManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bnt.TestManagement.Model.SubCategory;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory,Integer>{

}
