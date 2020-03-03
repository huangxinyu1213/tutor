package com.qiaoyy.tutor.homework;

import com.qiaoyy.tutor.entity.HomeworkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Henry on 2017/5/30.
 */
@Repository
public interface HomeworkRepository extends JpaRepository<HomeworkEntity, Integer> {
    @Query(value = "from HomeworkEntity where classId=:classId")
    List<HomeworkEntity> findByClassId(@Param("classId") Integer classId);
}
