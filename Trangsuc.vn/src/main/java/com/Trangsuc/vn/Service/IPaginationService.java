package com.Trangsuc.vn.Service;

import ProductDTO.PaginatesDto;

public interface IPaginationService {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage);

	public int FindEnd(int start, int limit, int totalData); 

	public int FindStart(int currentPage, int limit); 

	public int SetInfoTotalPage(int totalData, int limit); 

	public int CheckCurrentPage(int currentPage, int totalPage);

}
