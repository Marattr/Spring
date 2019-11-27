package com.murat.demir.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.murat.demir.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}