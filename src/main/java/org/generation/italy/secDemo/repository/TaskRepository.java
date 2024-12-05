package org.generation.italy.secDemo.repository;


import org.generation.italy.secDemo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
