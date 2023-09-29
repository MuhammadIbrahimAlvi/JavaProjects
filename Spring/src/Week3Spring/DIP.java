package Week3Spring;

public class DIP {
    public static void main(String[] args){

    }
}
 interface ICustomerDataAccess
{
    String GetCustomerName(int id);
}

 class CustomerDataAccess implements ICustomerDataAccess
        {
public CustomerDataAccess() {
        }

public String GetCustomerName(int id) {
        return "Dummy Customer Name";
        }
        }

 class DataAccessFactory
{
    public static ICustomerDataAccess GetCustomerDataAccessObj()
    {
        return new CustomerDataAccess();
    }
}

 class CustomerBusinessLogic
{
    ICustomerDataAccess _custDataAccess;

    public CustomerBusinessLogic()
    {
        _custDataAccess = DataAccessFactory.GetCustomerDataAccessObj();
    }

    public String GetCustomerName(int id)
    {
        return _custDataAccess.GetCustomerName(id);
    }
}
