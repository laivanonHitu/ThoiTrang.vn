package ProductDTO;

public class PaginatesDto {
	private int start, end, limmit, totalPage, curentPage;

	public PaginatesDto() {
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getLimmit() {
		return limmit;
	}

	public void setLimmit(int limmit) {
		this.limmit = limmit;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurentPage() {
		return curentPage;
	}

	public void setCurentPage(int curentPage) {
		this.curentPage = curentPage;
	}
	
	
}
