package com.example.CapstoneAPI.respository;

import com.example.CapstoneAPI.domain.CounselorsDomain;
import org.springframework.data.repository.CrudRepository;

public interface CounselorsRepository extends CrudRepository<CounselorsDomain, Integer> {
}
