package kr.co.gidion.boardMyBatis.mapper;

import kr.co.gidion.boardMyBatis.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    // 게시판 목록을 조회한다.
    List<BoardDTO> selectBoardList();

    // 게시판 상세내용을 조회한다.
    BoardDTO selectBoardDetail(int id);

    // 조회수를 1 증가한다.
    void updateViewCnt(int id);

    // 글을 쓴다.
    void insertBoard(BoardDTO boardDTO);

    // 글을 수정한다.
    void updateBoard(BoardDTO boardDTO);

    // 글을 삭제한다.
    void deleteBoard(int id) throws Exception;
}
