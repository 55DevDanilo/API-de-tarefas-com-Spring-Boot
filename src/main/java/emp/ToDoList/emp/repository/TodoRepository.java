package emp.ToDoList.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emp.ToDoList.emp.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	
}
