package seedabit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import seedabit.blog.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
}
