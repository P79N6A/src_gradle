package com.tencent.wcdb.database;

public class SQLiteDatatypeMismatchException extends SQLiteException {
    public SQLiteDatatypeMismatchException() {
    }

    public SQLiteDatatypeMismatchException(String str) {
        super(str);
    }
}
