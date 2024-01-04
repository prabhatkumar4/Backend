package com.Task.Repository;

import com.Task.Entity.Task;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
