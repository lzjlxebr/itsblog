package com.lzjlxebr.blog.service;

import com.lzjlxebr.blog.base.BaseService;
import com.lzjlxebr.blog.entity.Blog;
import org.springframework.data.domain.Page;

/**
 * BlogService
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2019-08-26 15:28
 **/
public interface BlogService extends BaseService<Blog> {
    Page<Blog> findAllByPublished(int page, int size, String keyword, Integer isArchive);

    Blog findByBlogSourceId(Long id);

    void save(Blog blog);

    Page<Blog> findAllByDashboard();
}
