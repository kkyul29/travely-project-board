package travely.travelyprojectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import travely.travelyprojectboard.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
