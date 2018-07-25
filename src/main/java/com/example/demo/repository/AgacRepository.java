package com.example.demo.repository;

import com.example.demo.model.Agac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.hibernate.sql.Select;
public interface AgacRepository extends JpaRepository<Agac,Long> {

    @Query("SELECT COUNT(id) FROM Agac ")
    int toplamAgac();

    @Query("SELECT  s FROM Agac s WHERE s.id=?1")
    Agac FindById(Long id);

}
