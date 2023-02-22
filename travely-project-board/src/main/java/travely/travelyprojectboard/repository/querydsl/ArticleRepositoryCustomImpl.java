package travely.travelyprojectboard.repository.querydsl;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import travely.travelyprojectboard.domain.Article;
import travely.travelyprojectboard.domain.QArticle;

import java.util.List;

public class ArticleRepositoryCustomImpl extends QuerydslRepositorySupport implements ArticleRepositoryCustom {

    public ArticleRepositoryCustomImpl() {
        super(Article.class);
    }

    @Override
    public List<String> findAllDistinctHashtags() {
        QArticle article = QArticle.article;

        return from(article)
                .distinct()
                .select(article.hashtag)
                .where(article.hashtag.isNotNull())
                .fetch();
    }
}
