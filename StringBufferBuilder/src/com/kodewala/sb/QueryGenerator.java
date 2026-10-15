package com.kodewala.sb;

public class QueryGenerator {
	public StringBuilder generateQuery(int salary,String empId)
	{
  StringBuilder query = new StringBuilder("salary * from employee");
  if (salary > 0 )
  {
	  query.append(" where salary = " + salary + ";");
  }
  else if (empId != null)
  {
	  query.append(" where empId = " + empId + ";");
  }
  else
  {
	  query.append(";");
  }
  return query;
	}
  
}
