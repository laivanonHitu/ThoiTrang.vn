package com.Trangsuc.vn.Service;

import org.springframework.stereotype.Service;

import ProductDTO.PaginatesDto;

@Service
public class PaginationServiceImpl implements IPaginationService {
	
	
	
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage) {
		
		PaginatesDto paginate = new PaginatesDto();
		paginate.setLimmit(limit);
		paginate.setTotalPage(SetInfoTotalPage(totalData, limit));
		paginate.setCurentPage(CheckCurrentPage(currentPage, paginate.getTotalPage()));
		paginate.setStart(FindStart(paginate.getCurentPage(), limit));
		paginate.setEnd(FindEnd(paginate.getStart(), limit, totalData));
		return paginate;
	}

	public int FindEnd(int start, int limit, int totalData) {
		return start + limit > totalData ? totalData : (start + limit) - 1;
	}

	public int FindStart(int currentPage, int limit) {
		return ((currentPage - 1) * limit) + 1;
	}

	public int SetInfoTotalPage(int totalData, int limit) {
		int totalPage = 0;
		totalPage = totalData / limit;
		totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
		return totalPage;
	}

	public int CheckCurrentPage(int currentPage, int totalPage) {
		if (currentPage < 1) {
			return 1;
		}
		if (currentPage > totalPage) {
			return totalPage;
		}
		return currentPage;
	}

}
