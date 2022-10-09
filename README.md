**Spring JDBC**
Java Database Connectivity(JDBC) is a way with the help of which we can connect our java application to the database and perform certain operations
and fire queries.

Problems of JDBC and why we are using Spring JDBC?
1) A lot of code needs to be written in normal JDBC to connect to the database
2) Checked exceptions needs to be handled at every point so need to apply try and catch both for every operation.
3) Database logic is a time consuming task

Hence we will be using Spring JDBC to avoid the above problems
We are going to use the object of the JdbcTemplate class to perform all the operations and fire queries.
But first we need to connect to the database in order to perform queries.
The JdbcTemplate class has a property known as datasource which will provide all the connection related info to the class
We have a DataSource interface where all the connection related info is entered. But the problem is we cannot make object of an interface.Hence we will
use a child class(DriverManagerDataSource) which implements the DataSource interface and use it's object in the JdbcTemplate class to get all the info.


**How to fetch data using spring jdbc**
Fetching data from the database means running all the select queries.
Now we can either get one row or multiple number of rows in our result.
1) To get one row we use : public T queryForObject(String query,RowMapper<T> rowMapper,Object args)  of JdbcTemplate class
2) To get multiple rows we use : public List<T> query(String query,RowMapper<T> rowMapper) of JdbcTemplate

The RowMapper interface is used to convert the rows which come in the result to class Objects;
We need to implement this interface using a class which will do the above task.
