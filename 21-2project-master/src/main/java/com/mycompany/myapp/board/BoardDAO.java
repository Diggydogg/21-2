package com.mycompany.myapp.board;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class BoardDAO {
	private JdbcTemplate template;
	
	private final String BOARD_INSERT = "insert into spring_board (date, weather, temp, sensTemp, humidity, wind) values (?,?,?,?,?,?)";
	private final String BOARD_UPDATE = "update spring_board set date=?, weather=?, temp=?, sensTemp=?, humidity=?, wind=? where seq=?";
	private final String BOARD_DELETE = "delete from spring_board where seq=?";
	private final String BOARD_GET = "select * from spring_board where seq=?";
	private final String BOARD_LIST =  "select * from spring_board order by seq desc";
	private final String BOARD_WEEK =  "select * from spring_board order by seq desc";
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insertBoard(BoardVO vo) {
		return template.update(BOARD_INSERT, new Object[]{vo.getDate(), vo.getWeather(), vo.getTemp(), vo.getSensTemp(), vo.getHumidity(), vo.getWind()});
	}
	
	public int deleteBoard(int seq) {
		return template.update(BOARD_DELETE, new Object[]{seq});
	}
	
	public int updateBoard(BoardVO vo) {
		return template.update(BOARD_UPDATE, new Object[]{vo.getDate(), vo.getWeather(), vo.getTemp(), vo.getSensTemp(), vo.getHumidity(), vo.getWind(), vo.getSeq()});
	}
	
	public BoardVO getBoard(int seq) {
		return template.queryForObject(BOARD_GET, new Object[] {seq}, new BeanPropertyRowMapper<BoardVO>(BoardVO.class));
	}
	
	public List<BoardVO> getBoardList() {
		return template.query(BOARD_LIST, new RowMapper<BoardVO>() {
			
			@Override
			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardVO data = new BoardVO();
				data.setSeq(rs.getInt("seq"));
				data.setDate(rs.getString("date"));
				data.setDate(rs.getString("weather"));
				data.setTemp(rs.getFloat("temp"));
				data.setSensTemp(rs.getFloat("sensTemp"));
				data.setHumidity(rs.getFloat("humidity"));
				data.setWind(rs.getFloat("wind"));
				
				
				return data;
			}
		});
	}
	
	public List<BoardVO> getWeekAve() {
		return template.query(BOARD_WEEK, new RowMapper<BoardVO>() {
			
			@Override
			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardVO data = new BoardVO();
				data.setSeq(rs.getInt("seq"));
				data.setDate(rs.getString("date"));
				data.setDate(rs.getString("weather"));
				data.setTemp(rs.getFloat("temp"));
				data.setSensTemp(rs.getFloat("sensTemp"));
				data.setHumidity(rs.getFloat("humidity"));
				data.setWind(rs.getFloat("wind"));
				
				
				return data;
			}
		});
	}
}
