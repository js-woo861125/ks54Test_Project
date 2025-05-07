package ks54team01.customer.transferBoard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks54team01.customer.transferBoard.domain.CustomerTransferBoard;

@Mapper
public interface CustomerTransferBoardMapper {
	
	// 양도 게시글 목록 조회
	List<CustomerTransferBoard> getTransferBoardList();
}