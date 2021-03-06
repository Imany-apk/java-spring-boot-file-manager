package filehandler.project.repository;

import filehandler.project.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {

    File findFileByUuid(String uuid);

}
