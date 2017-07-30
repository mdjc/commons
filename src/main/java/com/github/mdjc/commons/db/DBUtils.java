package com.github.mdjc.commons.db;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class DBUtils {
	public static void insert(JdbcTemplate jdbcTemplate, String table, Object... values) {
		jdbcTemplate.update(buildInsertQuery(table, values.length), values);
	}

	private static String buildInsertQuery(String table, int parametersCount) {
		StringBuilder sb = new StringBuilder("insert into " + table);
		sb.append(" values (");

		for (int i = 0; i < parametersCount; i++) {
			sb.append("?");

			if (i != parametersCount - 1) {
				sb.append(",");
			}
		}

		sb.append(")");
		return sb.toString();
	}
	
	public static MapSqlParameterSource parametersMap(Object... params) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		for (int i = 0; i < params.length; i += 2) {
			parameters.addValue(String.valueOf(params[i]), params[i + 1]);
		}

		return parameters;
	}
}
