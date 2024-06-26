package com.mcarchieve.mcarchieve.repository;

import com.mcarchieve.mcarchieve.entity.session.Story;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface StoryRepository extends JpaRepository<Story, Long> {
    List<Story> findBySessionId(Long sessionId);
}
