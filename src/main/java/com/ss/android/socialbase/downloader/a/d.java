package com.ss.android.socialbase.downloader.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.ss.android.socialbase.downloader.e.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f30840a;

    /* renamed from: b  reason: collision with root package name */
    private final String f30841b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f30842c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f30843d;

    /* renamed from: e  reason: collision with root package name */
    private SQLiteStatement f30844e;

    /* renamed from: f  reason: collision with root package name */
    private SQLiteStatement f30845f;
    private SQLiteStatement g;

    public final SQLiteStatement a() {
        if (this.f30844e == null) {
            String str = this.f30841b;
            String[] strArr = this.f30842c;
            StringBuilder sb = new StringBuilder("INSERT INTO ");
            sb.append('\"');
            sb.append(str);
            sb.append('\"');
            sb.append(" (");
            f.a(sb, strArr);
            sb.append(") VALUES (");
            f.a(sb, strArr.length);
            sb.append(')');
            SQLiteStatement compileStatement = this.f30840a.compileStatement(sb.toString());
            synchronized (this) {
                if (this.f30844e == null) {
                    this.f30844e = compileStatement;
                }
            }
            if (this.f30844e != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f30844e;
    }

    public final SQLiteStatement b() {
        if (this.g == null) {
            String str = this.f30841b;
            String[] strArr = this.f30843d;
            String str2 = "\"" + str + '\"';
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(str2);
            if (strArr != null && strArr.length > 0) {
                sb.append(" WHERE ");
                f.a(sb, str2, strArr);
            }
            SQLiteStatement compileStatement = this.f30840a.compileStatement(sb.toString());
            synchronized (this) {
                if (this.g == null) {
                    this.g = compileStatement;
                }
            }
            if (this.g != compileStatement) {
                compileStatement.close();
            }
        }
        return this.g;
    }

    public final SQLiteStatement c() {
        if (this.f30845f == null) {
            String str = this.f30841b;
            String[] strArr = this.f30842c;
            String[] strArr2 = this.f30843d;
            String str2 = "\"" + str + '\"';
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(str2);
            sb.append(" SET ");
            f.b(sb, strArr);
            if (strArr2 != null && strArr2.length > 0) {
                sb.append(" WHERE ");
                f.a(sb, str2, strArr2);
            }
            SQLiteStatement compileStatement = this.f30840a.compileStatement(sb.toString());
            synchronized (this) {
                if (this.f30845f == null) {
                    this.f30845f = compileStatement;
                }
            }
            if (this.f30845f != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f30845f;
    }

    public d(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.f30840a = sQLiteDatabase;
        this.f30841b = str;
        this.f30842c = strArr;
        this.f30843d = strArr2;
    }
}
