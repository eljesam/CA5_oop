package Server.example.Exceptions;

/**     Feb 2022
 * A 'homemade' Exception to report exceptions
 *  arising in the Data Access Layer.
 */
import java.sql.SQLException;

public class DaoException extends SQLException
{
    public DaoException()
    {


    }

    public DaoException(String aMessage)
    {
        super(aMessage);
    }
}