package org.example;

import org.junit.Before;
import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuroraNationalJUnitTest {
    private static final Logger log = LogManager.getLogger();

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    //MOCKITO CONNECTIONS
    @Before
    public void addMockito() {
        connection = mock(Connection.class);
        statement = mock(Statement.class);
        resultSet = mock(ResultSet.class);
    }

    //GET CUSTOMER ID TEST
    @Test
    public void customerIDReturnsFirstCustomerId() throws Exception {


        when(connection.createStatement()).thenReturn(statement);
        when(statement.executeQuery("SELECT customer_id FROM dbo.Customers")).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true);
        when(resultSet.getString("customer_id")).thenReturn("ANB-100268");

        AuroraNational bank = new AuroraNational(connection);

        assertEquals("ANB-100268", bank.customerID());
    }

    @Test
    public void customerIDReturnsNullWhenThereAreNoCustomers() throws Exception {

        when(connection.createStatement()).thenReturn(statement);
        when(statement.executeQuery("SELECT customer_id FROM dbo.Customers")).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(false);

        AuroraNational bank = new AuroraNational(connection);
        try {
            assertNull(bank.customerID());
            log.info("Null customer ID returned");
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
    }

    @Test
    public void bankNameReturnsBankName() throws Exception {

        when(connection.createStatement()).thenReturn(statement);
        when(statement.executeQuery("SELECT bank_name FROM dbo.Accounts")).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true);
        when(resultSet.getString("bank_name")).thenReturn("Aurora National Bank");

        AuroraNational bank = new AuroraNational(connection);

        assertEquals("Aurora National Bank", bank.bankName());
    }


    @Test
    public void testGetBankNameNull() throws Exception{

        when(connection.createStatement()).thenReturn(statement);
        when(statement.executeQuery("SELECT bank_name FROM dbo.Accounts")).thenReturn(resultSet);

        AuroraNational bank1 = new AuroraNational(connection);


        assertNull(bank1.bankName());
        log.info("Null bank name returned");

    }

    @Test
    public void testPasscodeReturn() throws Exception{
        when(connection.createStatement()).thenReturn(statement);
        when(statement.executeQuery("SELECT passcode FROM dbo.Customers")).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true);
        when(resultSet.getString("passcode")).thenReturn("12345");

        AuroraNational bank1 = new AuroraNational(connection);

        assertEquals("12345", bank1.accountPasscode());
    }

}
