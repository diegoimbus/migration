package co.cuidamos.migracion.ds.api.config;

import org.hibernate.dialect.PostgreSQL9Dialect;

import java.sql.Types;

public class CustomPostgreSqlDialect extends PostgreSQL9Dialect {

    public CustomPostgreSqlDialect() {
        this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
    }
}
