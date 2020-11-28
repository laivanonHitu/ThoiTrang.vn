package com.Trangsuc.vn.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Trangsuc.vn.Entity.MapperProduct;
import com.Trangsuc.vn.Entity.MapperProductDTO;
import com.Trangsuc.vn.Entity.Product;

import ProductDTO.ProductDTO;

@Repository
public class ProductDTO_DAO extends baseDAO {

	private final static boolean YES = true;
	private final static boolean NO = false;

	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("p.id as id_product ");
		sql.append(", p.id_category ");
		sql.append(", p.sizes ");
		sql.append(", p.name ");
		sql.append(", p.price ");
		sql.append(", p.sale ");
		sql.append(", p.title ");
		sql.append(", p.highlight ");
		sql.append(", p.new_product ");
		sql.append(", p.details ");
		sql.append(", c.id as id_color ");
		sql.append(", c.name as name_color ");
		sql.append(", c.code as code_color ");
		sql.append(", c.img ");
		sql.append(", p.created_at ");
		sql.append(", p.updated_at ");
		sql.append("FROM ");
		sql.append("products AS p ");
		sql.append("INNER JOIN ");
		sql.append("colors AS c ");
		sql.append("ON p.id = c.id_product ");
		return sql;
	}

	private String SqlProducts(boolean newProduct, boolean highLight) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		if (highLight) {
			sql.append("AND p.highlight = true ");
		}
		if (newProduct) {
			sql.append("AND p.new_product = true ");
		}
		sql.append("GROUP BY p.id, c.id_product ");
		sql.append("ORDER BY RAND() ");
		if (highLight) {
			sql.append("LIMIT 9 ");
		}
		if (newProduct) {
			sql.append("LIMIT 12 ");
		}
		return sql.toString();
	}

	public String sqlCategoryById(int id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id_category = " + id);
		return sql.toString();
	}
	
	
	public String insertProduct() {
		ProductDTO dto = new ProductDTO();
		String sql = "INSERT INTO products (name, price) VALUE (?, ?)";
		_jdbcTemplate.update(dto.getName(), dto.getPrice());
		return sql;
	}
	public String insertProduct1() {
		ProductDTO dto = new ProductDTO();
		String sql = "INSERT INTO colors (img) VALUE (?, ?)";
		_jdbcTemplate.update(dto.getImg());
		return sql;
	}

	public String sqlProductBanner() {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("GROUP BY p.id, c.id_product ");
		sql.append("ORDER BY RAND() ");
		sql.append("LIMIT 3 ");
		return sql.toString();
	}

	public String sqlProductById(long id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id = " + id + " ");
		sql.append("LIMIT 1 ");
		return sql.toString();
	}

	public String sqlProductByCategory(int id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id = " + id + " ");
		sql.append("LIMIT 4 ");
		return sql.toString();
	}

	public String sqlProductPaginate(int start, int end) {
		StringBuffer sql = SqlString();
		sql.append("LIMIT  " + start + ", " + end + " ;");
		return sql.toString();
	}

	public String sqlProductByIdCategory(long id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id_category = " + id + " ");
		return sql.toString();
	}

	public List<ProductDTO> getProductByIdCategory(int id) {
		String sql = sqlProductByIdCategory(id);
		List<ProductDTO> listProductByCategory = _jdbcTemplate.query(sql, new MapperProductDTO());
		return listProductByCategory;
	}

	public List<ProductDTO> getProductByCategory(int id) {
		String sql = sqlProductByCategory(id);
		List<ProductDTO> listProductByCategory = _jdbcTemplate.query(sql, new MapperProductDTO());
		return listProductByCategory;
	}

	public List<ProductDTO> getProductById(int id) {
		String sql = sqlProductById(id);
		List<ProductDTO> productDTO =  _jdbcTemplate.query(sql, new MapperProductDTO());
		return productDTO;
	}

	public List<ProductDTO> getAllProduct() {
		String sql = SqlProducts(NO, YES);
		List<ProductDTO> listProducts = _jdbcTemplate.query(sql, new MapperProductDTO());
		return listProducts;
	}

	public List<ProductDTO> getAllProductById(int id) {
		String sqlCategoryById = sqlCategoryById(id);
		List<ProductDTO> listProducts = _jdbcTemplate.query(sqlCategoryById, new MapperProductDTO());
		return listProducts;
	}

	public List<ProductDTO> getPaginatesDto(int start, int end) {
		String sqlProductPaginate = sqlProductPaginate(start, end);
		List<ProductDTO> listProducts = _jdbcTemplate.query(sqlProductPaginate, new MapperProductDTO());
		return listProducts;
	}

	public List<ProductDTO> getProductBanner() {
		String sql = sqlProductBanner();
		List<ProductDTO> listProductBanner = _jdbcTemplate.query(sql, new MapperProductDTO());
		return listProductBanner;
	}

	public ProductDTO FindProductCart(long id) {
		String sql = sqlProductById(id);
		ProductDTO listProductBanner = _jdbcTemplate.queryForObject(sql, new MapperProductDTO());
		return listProductBanner;
	}
	
	
	public int delete(Integer id) {
		String SQL = "DELETE FROM products WHERE id = ?";
		int ex = _jdbcTemplate.update(SQL, id);
		System.out.println("Deleted products with ID = " + id);
		return ex;
	}

	public int sqlUpdateProduct(Product product) {
		String updateQuery = "UPDATE products AS p SET p.name = ?, p.price = ? where id = ?";
		int status = _jdbcTemplate.update(updateQuery, product.getName(), product.getPrice(), product.getId());
		if (status != 0) {
			System.out.println("products data updated for ID " + product.getId());
		} else {
			System.out.println("No products found with ID " + product.getId());
		}
		return status;
	}

//	public int getUpdateProduct(int id, String name_product, String price) {
//		String sql = sqlUpdateProduct(id, name_product, price);
//		int Product = _jdbcTemplate.update(sql);
//		return Product;
//	}

}
