package travely.travelyprojectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import travely.travelyprojectboard.domain.ArticleComment;

@RepositoryRestResource
public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}