package autonomous.repositories;

import autonomous.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ITaskRepository  extends JpaRepository<Task, Long> {

//    Task findById(long ID);
//    List<Task> findByName(String NOME);

//    @Modifying
//    @Query("UPDATE TASK SET NOME = :NOME WHERE id = :id")
//    boolean updateByName(@Param("id") Long id, @Param("NOME") String NOME);
}
