package com.example.lab2.Repository;

import com.example.lab2.Model.WikiPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiPageRepository extends JpaRepository<WikiPage, Long> {
}