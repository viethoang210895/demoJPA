package com.codegym.service;

import com.codegym.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface IProvinceService  extends PagingAndSortingRepository<Province, Long> {

}