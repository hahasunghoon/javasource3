package shop2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static shop2.JdbcUtil.*;

public class ProductDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//전체 상품조회
	public List<ProductDTO> getList() {
		
		List<ProductDTO> list = new ArrayList<>();
		try {
			
			con = getConnection();
			//전체상품 조회
			String sql = "select * from product";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setProductId(rs.getInt("product_id"));
				dto.setPname(rs.getString("pname"));
				dto.setPrice(rs.getInt("price"));
				dto.setContent(rs.getString("content"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
			
		}
		return list;
	}
	
	
	
	
	//상품 추가
	public boolean insert(ProductDTO dto) {
		boolean status = false;
		
		try {
			
			con = getConnection();
			
			String sql = "insert into product(product_id, pname, price, content)";
			sql += "values(?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			//? 해결
			pstmt.setInt(1, dto.getProductId());
			pstmt.setString(2, dto.getPname());
			pstmt.setInt(3, dto.getPrice());
			pstmt.setString(4, dto.getContent());
			
			
			
			int result = pstmt.executeUpdate();
			if(result>0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
			
		}
		return status;
	}
}
