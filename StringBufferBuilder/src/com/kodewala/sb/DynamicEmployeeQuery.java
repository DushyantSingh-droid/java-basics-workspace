package com.kodewala.sb;

public class DynamicEmployeeQuery {
	public StringBuilder generateQuery(String department, int minSalary, String empName) {

		StringBuilder query = new StringBuilder("Select * from employee ");
		boolean hasCondition = false;
		if (department != null && !department.trim().isEmpty()) {
			if (!hasCondition) {
				query.append("WHERE ");
				hasCondition = true;
			} else {
				query.append(" AND ");
				hasCondition = true;
			}
			query.append(" department = " + department);
		}

		if (minSalary > 0) {

			if (!hasCondition) {
				query.append(" WHERE ");
				hasCondition = true;
			} else {
				query.append(" AND ");
				hasCondition = true;
			}
			query.append(" salary >= " + minSalary);
		}
		if (empName != null && !empName.trim().isEmpty()) {
			if (!hasCondition) {
				query.append(" WHERE ");
				hasCondition = true;
			} else {
				query.append(" AND ");
				hasCondition = true;
			}
			query.append(" empName = " + empName + ";");
		}

		return query;
	}
}
