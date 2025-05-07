package ks54team01.customer.transferBoard.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks54team01.customer.transferBoard.domain.CustomerTransferBoard;
import ks54team01.customer.transferBoard.mapper.CustomerTransferBoardMapper;
import ks54team01.customer.transferBoard.service.CustomerTransferBoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class CustomerTransferBoardServiceImpl implements CustomerTransferBoardService{

	// DI 의존성주입
	private final CustomerTransferBoardMapper customertransferBoardMapper;
	
	/**
	 * 양도게시글목록조회
	 */
	@Override
	public List<CustomerTransferBoard> getTransferBoardList() {
		List<CustomerTransferBoard> transferBoardList = customertransferBoardMapper.getTransferBoardList();
		return transferBoardList;
	}
}