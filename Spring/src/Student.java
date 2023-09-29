 class CustomerBusinessLogic
{
    public CustomerBusinessLogic()
    {
    }

    public String GetCustomerName(int id)
    {
        DataAccess _dataAccess = DataAccessFactory.GetDataAccessObj();

        return _dataAccess.GetCustomerName(id);
    }
}

class DataAccessFactory
{
    public static DataAccess GetDataAccessObj()
    {
        return new DataAccess();
    }
}

 class DataAccess
{
    public DataAccess()
    {
    }

    public String GetCustomerName(int id) {
        return "Dummy Customer Name"; // get it from DB in real app
    }
}

public class Student{
    public static void main(String[] args){
        CustomerBusinessLogic obj = new CustomerBusinessLogic();
        System.out.println(obj.GetCustomerName(1));
    }
}