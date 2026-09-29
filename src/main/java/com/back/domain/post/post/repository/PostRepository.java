package com.back.domain.post.post.repository;

import com.back.domain.post.post.document.Post;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostRepository extends ElasticsearchRepository<Post,String> {
    // ElasticsearchRepository의 findAll()은 Iterable<Post>를 반환
    // List로 반환하기 위해 선언
    List<Post> findAll();
}
