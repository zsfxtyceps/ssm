package cn.ssm.dao;

import cn.ssm.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public class Bookdao {
    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
    Book queryById(long id){
        return null;
    }

    /**
     * 查询所有图书
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit){
        return null;
    }

    /**
     * 减少馆藏数量
     *
     * @param bookId
     * @return 如果影响行数等于>1，表示更新的记录行数
     */
    int reduceNumber(long bookId) {
        return 0;
    }
}
