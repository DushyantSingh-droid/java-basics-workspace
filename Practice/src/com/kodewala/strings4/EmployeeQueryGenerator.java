package com.kodewala.strings4;

public class EmployeeQueryGenerator {
	public StringBuilder queryGenerator(String department, int salary) {
		StringBuilder query = new StringBuilder("Select * From employee ");

		if (salary > 0 && department != null && !department.isEmpty()) {
			query.append("where salary " + salary + " And Department " + department + ";");
		} else if (salary > 0) {
			query.append("where salary " + salary + ";");
		} else if (department != null) {
			query.append("where Department  " + department + ";");
		} else {
			query.append(";");
		}
		return query;
	}
}
