package com.app.projects.repositories;

import com.app.projects.domain.ProfileEligible;
import com.app.projects.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProfileEligibleRepository extends JpaRepository<ProfileEligible, Long> {

    Optional<ProfileEligible> findByProfileIdAndSubject(Long aLong, Subject subject);
}
