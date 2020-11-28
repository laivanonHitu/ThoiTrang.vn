package ProductDTO;

public class CartDTO {
	private int quantity;
	private double totalPrice;
	private ProductDTO productDTO;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ProductDTO getProductDTO() {
		return productDTO;
	}

	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}

	public CartDTO(int quantity, double totalPrice, ProductDTO productDTO) {
		super();
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.productDTO = productDTO;
	}

	public CartDTO() {
		super();
	}
}
