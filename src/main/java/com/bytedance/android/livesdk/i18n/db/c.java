package com.bytedance.android.livesdk.i18n.db;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15612a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase f15613b;

    /* renamed from: c  reason: collision with root package name */
    private final EntityInsertionAdapter f15614c;

    public c(RoomDatabase roomDatabase) {
        this.f15613b = roomDatabase;
        this.f15614c = new EntityInsertionAdapter<a>(roomDatabase) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15615a;

            public final String createQuery() {
                return "INSERT OR REPLACE INTO `information`(`key`,`value`) VALUES (?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                a aVar = (a) obj;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteStatement2, aVar}, this, f15615a, false, 10191, new Class[]{SupportSQLiteStatement.class, a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteStatement2, aVar}, this, f15615a, false, 10191, new Class[]{SupportSQLiteStatement.class, a.class}, Void.TYPE);
                    return;
                }
                if (aVar.f15610a == null) {
                    supportSQLiteStatement2.bindNull(1);
                } else {
                    supportSQLiteStatement2.bindString(1, aVar.f15610a);
                }
                if (aVar.f15611b == null) {
                    supportSQLiteStatement2.bindNull(2);
                } else {
                    supportSQLiteStatement2.bindString(2, aVar.f15611b);
                }
            }
        };
    }

    public final a a(String str) {
        a aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f15612a, false, 10190, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f15612a, false, 10190, new Class[]{String.class}, a.class);
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM information WHERE `key` = ?", 1);
        acquire.bindString(1, str2);
        Cursor query = this.f15613b.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("key");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("value");
            if (query.moveToFirst()) {
                aVar = new a();
                aVar.f15610a = query.getString(columnIndexOrThrow);
                aVar.f15611b = query.getString(columnIndexOrThrow2);
            } else {
                aVar = null;
            }
            return aVar;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f15612a, false, 10189, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f15612a, false, 10189, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f15613b.beginTransaction();
        try {
            this.f15614c.insert(aVar);
            this.f15613b.setTransactionSuccessful();
        } finally {
            this.f15613b.endTransaction();
        }
    }
}
