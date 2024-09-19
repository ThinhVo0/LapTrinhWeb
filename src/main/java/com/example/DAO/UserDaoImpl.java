package com.example.DAO;

import com.example.Config.mydb;
import com.example.DAO.IUserDao;
import com.example.Model.UserModel;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends mydb implements IUserDao {
    public Connection conn = null;
    public PreparedStatement ps = null;
    public ResultSet rs = null;

    public List<UserModel> findAll() {
        List<UserModel> users = new ArrayList<>();
        String sql = "SELECT * FROM users W";
        try {
            conn = new mydb().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UserModel user = new UserModel();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("username"));
                user.setFullname(rs.getString("fullname"));
                user.setPassword(rs.getString("password"));
                user.setImages(rs.getString("images"));
                user.setRoleid(Integer.parseInt(rs.getString("roleid")));
                user.setPhone(rs.getString("phone"));
                user.setCreateDate(rs.getDate("createdDate"));
                users.add(user);
            }
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public UserModel findById(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        try {
            conn = new mydb().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                UserModel user = new UserModel();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("username"));
                user.setFullname(rs.getString("fullname"));
                user.setPassword(rs.getString("password"));
                user.setImages(rs.getString("images"));
                user.setRoleid(Integer.parseInt(rs.getString("roleid")));
                user.setPhone(rs.getString("phone"));
                user.setCreateDate(rs.getDate("createdDate"));
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insert(UserModel user) {
        String sql = "INSERT INTO users(username, password,email, roleid) VALUES(?,?,?,?)";
        try {
            conn = new mydb().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setInt(4, user.getRoleid());
            ps.setString(3, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public UserModel findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        try {
            conn = new mydb().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                UserModel user = new UserModel();

                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRoleid(Integer.parseInt(rs.getString("roleid")));


                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean checkExistUsername(String username) {
        boolean duplicate = false;
        String query = "select * from Users where username = ?";
        try {
            conn = new mydb().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                duplicate = true;
            }
            ps.close();
            conn.close();
        } catch (Exception ex) {}
        return duplicate;
    }

    public UserModel findByUsernameAndEmail(String username, String email) {
        String sql = "SELECT * FROM users WHERE username = ? AND email = ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        UserModel user = null;

        try {
            con = new mydb().getConnection(); // Tạo kết nối
            ps = con.prepareStatement(sql); // Tạo PreparedStatement
            ps.setString(1, username); // Set giá trị cho tham số username
            ps.setString(2, email); // Set giá trị cho tham số password
            rs = ps.executeQuery(); // Thực thi câu lệnh và lấy kết quả

            // Kiểm tra nếu có dòng nào được trả về
            if (rs.next()) {
                // Lấy thông tin người dùng từ ResultSet và tạo đối tượng UserModel
                user = new UserModel();
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("username"));
                user.setFullname(rs.getString("fullname"));
                user.setPassword(rs.getString("password"));
                user.setRoleid(rs.getInt("roleid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng tài nguyên
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return user; // Trả về đối tượng UserModel hoặc null nếu không tìm thấy người dùng
    }

    @Override
    public boolean updatePassword(String username, String newPassword) {
        String sql = "UPDATE users SET password = ? WHERE username = ?";
        Connection con = null;
        PreparedStatement ps = null;
        boolean isUpdated = false;

        try {
            con = new mydb().getConnection(); // Tạo kết nối
            ps = con.prepareStatement(sql); // Tạo PreparedStatement
            ps.setString(1, newPassword); // Set mật khẩu mới
            ps.setString(2, username); // Set giá trị cho tham số username
            int rowsAffected = ps.executeUpdate(); // Thực thi câu lệnh cập nhật

            // Kiểm tra số lượng dòng bị ảnh hưởng
            if (rowsAffected > 0) {
                isUpdated = true; // Cập nhật thành công
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng tài nguyên
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return isUpdated; // Trả về kết quả cập nhật
    }

    @Override
    public boolean checkExistEmail(String email) {
        boolean duplicate = false;
        String query = "select * from users where email = ?";
        try {
            conn = new mydb().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                duplicate = true;
            }
            ps.close();
            conn.close();
        } catch (Exception ex) {}
        return duplicate;
    }

}
