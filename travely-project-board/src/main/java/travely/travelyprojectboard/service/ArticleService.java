package travely.travelyprojectboard.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import travely.travelyprojectboard.domain.type.SearchType;
import travely.travelyprojectboard.dto.ArticleDto;
import travely.travelyprojectboard.dto.ArticleWithCommentsDto;
import travely.travelyprojectboard.repository.ArticleRepository;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {
    private  final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleWithCommentsDto getArticle(Long articleId){
        return null;
    }

    public void saveArticle(ArticleDto dto) {
    }

    public void updateArticle(ArticleDto dto) {
    }

    public void deleteArticle(long articleId) {
    }

}
