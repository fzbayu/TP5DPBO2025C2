import java.sql.*;

public class Database {
    private Connection connection;
    private Statement statement;

    // constructor
    public Database(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    // digunakan untuk SELECT
    public ResultSet selectQuery(String sql){
        try{
            statement.executeQuery(sql);
            return statement.getResultSet();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    // digunakan untuk INSERT, UPDATE, dan DELETE
    public int insertUpdateDeleteQuery(String sql){
        try{
            return  statement.executeUpdate(sql);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    // Untuk menjalankan query SELECT dan mengembalikan hasilnya dalam bentuk ResultSet. (digunakan untuk mencari NIM jika sudah terdaftar dalam database)
    public ResultSet getSelectQuery(String query) {
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }


    // getter
    public Statement getStatement(){
        return statement;
    }
}

