package travely.travelyprojectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import travely.travelyprojectboard.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}