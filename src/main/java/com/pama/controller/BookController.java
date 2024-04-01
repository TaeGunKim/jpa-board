package com.pama.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RequestMapping("api")
@RestController
public class BookController {

    /**
     * Vue Project에서 호출하기 위해 생성한 기본 API
     * Description: 책 리스트 정보
     *
     * @return List<Map<String, Object>>
     */
    @GetMapping(value = "book/list")
    public List<Map<String, Object>> bookList() {
        List<Map<String, Object>> boardList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            Map<String, Object> board = new HashMap<>();
            board.put("title", "동화 이야기" + num);
            board.put("content", "아름답고 신비한 도깨비 이야기" + num);
            board.put("author", "herojoon" + num);
            boardList.add(board);
        }
        return boardList;
    }

    /**
     * Vue Project에서 호출하기 위해 생성한 기본 API
     * Description: 작가 리스트 정보
     *
     * @return List<String>
     */
    @GetMapping(value = "writer/list")
    public List<String> writerList() {
        List<String> writerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            writerList.add("herojoon" + num);
        }
        return writerList;
    }
}
