package com.bytedance.im.core.b.a.c;

import android.content.ContentValues;
import android.database.SQLException;

public interface c {

    public interface a {
        b a();
    }

    int a(String str, ContentValues contentValues, String str2, String[] strArr);

    int a(String str, String str2, String[] strArr);

    long a(String str, String str2, ContentValues contentValues);

    b a(String str, String[] strArr);

    void a(String str) throws SQLException, com.tencent.wcdb.SQLException;

    boolean a();

    d b(String str) throws SQLException, com.tencent.wcdb.SQLException;

    void b();

    boolean c();

    void d();

    void e();

    void f();
}
