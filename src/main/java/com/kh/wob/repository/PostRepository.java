
package com.kh.wob.repository;

import com.kh.wob.entity.Post;
import com.kh.wob.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    Optional<Post> findByTitle(String title);
    List<Post> findByCategoryNameContaining(String keyword);
    List<Post> findByTitleContaining(String keyword);
    List<Post> findByIntroductionContaining(String keyword);
    Optional<Post> findById(Long id);
    // postIdList에 해당하는 포스트 리스트 조회 메서드 추가
    List<Post> findByIdIn(List<Long> postIdList);
    List<Post> findByUserEmail(String userEmail);
}
