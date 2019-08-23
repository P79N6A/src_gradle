package com.ss.android.ugc.aweme.runtime.behavior;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63674a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase f63675b;

    /* renamed from: c  reason: collision with root package name */
    private final EntityInsertionAdapter f63676c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedSQLiteStatement f63677d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedSQLiteStatement f63678e;

    public b(RoomDatabase roomDatabase) {
        this.f63675b = roomDatabase;
        this.f63676c = new EntityInsertionAdapter<c>(roomDatabase) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63679a;

            public final String createQuery() {
                return "INSERT OR ABORT INTO `runtimeBehaviorEntity`(`id`,`type`,`time`,`msg`) VALUES (nullif(?, 0),?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                c cVar = (c) obj;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteStatement2, cVar}, this, f63679a, false, 70983, new Class[]{SupportSQLiteStatement.class, c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteStatement2, cVar}, this, f63679a, false, 70983, new Class[]{SupportSQLiteStatement.class, c.class}, Void.TYPE);
                    return;
                }
                supportSQLiteStatement2.bindLong(1, (long) cVar.f63684b);
                if (cVar.f63685c == null) {
                    supportSQLiteStatement2.bindNull(2);
                } else {
                    supportSQLiteStatement2.bindString(2, cVar.f63685c);
                }
                supportSQLiteStatement2.bindLong(3, cVar.f63686d);
                if (cVar.f63687e == null) {
                    supportSQLiteStatement2.bindNull(4);
                } else {
                    supportSQLiteStatement2.bindString(4, cVar.f63687e);
                }
            }
        };
        this.f63677d = new SharedSQLiteStatement(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM runtimeBehaviorEntity where type = ? and time < ?";
            }
        };
        this.f63678e = new SharedSQLiteStatement(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM runtimeBehaviorEntity";
            }
        };
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f63674a, false, 70979, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f63674a, false, 70979, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f63675b.beginTransaction();
        try {
            this.f63676c.insert(cVar);
            this.f63675b.setTransactionSuccessful();
        } finally {
            this.f63675b.endTransaction();
        }
    }

    public final void b(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f63674a, false, 70980, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f63674a, false, 70980, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        SupportSQLiteStatement acquire = this.f63677d.acquire();
        this.f63675b.beginTransaction();
        if (str2 == null) {
            try {
                acquire.bindNull(1);
            } catch (Throwable th) {
                this.f63675b.endTransaction();
                this.f63677d.release(acquire);
                throw th;
            }
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, j2);
        acquire.executeUpdateDelete();
        this.f63675b.setTransactionSuccessful();
        this.f63675b.endTransaction();
        this.f63677d.release(acquire);
    }

    public final List<c> a(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f63674a, false, 70982, new Class[]{String.class, Long.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f63674a, false, 70982, new Class[]{String.class, Long.TYPE}, List.class);
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM runtimeBehaviorEntity where type = ?  and time > ?", 2);
        if (str2 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str2);
        }
        acquire.bindLong(2, j2);
        Cursor query = this.f63675b.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("type");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("time");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("msg");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                c cVar = new c();
                cVar.f63684b = query.getInt(columnIndexOrThrow);
                String string = query.getString(columnIndexOrThrow2);
                if (PatchProxy.isSupport(new Object[]{string}, cVar, c.f63683a, false, 70993, new Class[]{String.class}, Void.TYPE)) {
                    c cVar2 = cVar;
                    PatchProxy.accessDispatch(new Object[]{string}, cVar2, c.f63683a, false, 70993, new Class[]{String.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(string, "<set-?>");
                    cVar.f63685c = string;
                }
                cVar.f63686d = query.getLong(columnIndexOrThrow3);
                String string2 = query.getString(columnIndexOrThrow4);
                if (PatchProxy.isSupport(new Object[]{string2}, cVar, c.f63683a, false, 70994, new Class[]{String.class}, Void.TYPE)) {
                    c cVar3 = cVar;
                    PatchProxy.accessDispatch(new Object[]{string2}, cVar3, c.f63683a, false, 70994, new Class[]{String.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(string2, "<set-?>");
                    cVar.f63687e = string2;
                }
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
