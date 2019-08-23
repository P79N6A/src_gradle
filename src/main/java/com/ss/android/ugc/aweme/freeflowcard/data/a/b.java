package com.ss.android.ugc.aweme.freeflowcard.data.a;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.freeflowcard.data.b.a;
import java.util.ArrayList;
import java.util.List;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48613a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase f48614b;

    /* renamed from: c  reason: collision with root package name */
    private final EntityInsertionAdapter f48615c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedSQLiteStatement f48616d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48613a, false, 46070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48613a, false, 46070, new Class[0], Void.TYPE);
            return;
        }
        SupportSQLiteStatement acquire = this.f48616d.acquire();
        this.f48614b.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f48614b.setTransactionSuccessful();
        } finally {
            this.f48614b.endTransaction();
            this.f48616d.release(acquire);
        }
    }

    public b(RoomDatabase roomDatabase) {
        this.f48614b = roomDatabase;
        this.f48615c = new EntityInsertionAdapter<a>(roomDatabase) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48617a;

            public final String createQuery() {
                return "INSERT OR ABORT INTO `tb_app_start_mode`(`id`,`time`,`start_mode`) VALUES (nullif(?, 0),?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                a aVar = (a) obj;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteStatement2, aVar}, this, f48617a, false, 46074, new Class[]{SupportSQLiteStatement.class, a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteStatement2, aVar}, this, f48617a, false, 46074, new Class[]{SupportSQLiteStatement.class, a.class}, Void.TYPE);
                    return;
                }
                supportSQLiteStatement2.bindLong(1, (long) aVar.id);
                supportSQLiteStatement2.bindLong(2, aVar.time);
                supportSQLiteStatement2.bindLong(3, (long) aVar.mode);
            }
        };
        this.f48616d = new SharedSQLiteStatement(roomDatabase) {
            public final String createQuery() {
                return "delete from tb_app_start_mode";
            }
        };
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f48613a, false, 46069, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f48613a, false, 46069, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f48614b.beginTransaction();
        try {
            this.f48615c.insert(aVar);
            this.f48614b.setTransactionSuccessful();
        } finally {
            this.f48614b.endTransaction();
        }
    }

    public final List<a> a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f48613a, false, 46072, new Class[]{Long.TYPE, Long.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f48613a, false, 46072, new Class[]{Long.TYPE, Long.TYPE}, List.class);
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from tb_app_start_mode where time between ? and ?", 2);
        acquire.bindLong(1, j3);
        acquire.bindLong(2, j4);
        Cursor query = this.f48614b.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("start_mode");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                a aVar = new a();
                aVar.id = query.getInt(columnIndexOrThrow);
                aVar.time = query.getLong(columnIndexOrThrow2);
                aVar.mode = query.getInt(columnIndexOrThrow3);
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public final List<a> a(long j, long j2, int i) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), Integer.valueOf(i)}, this, f48613a, false, 46073, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), Integer.valueOf(i)}, this, f48613a, false, 46073, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, List.class);
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from tb_app_start_mode where start_mode=? and time between ? and ?", 3);
        acquire.bindLong(1, (long) i);
        acquire.bindLong(2, j3);
        acquire.bindLong(3, j4);
        Cursor query = this.f48614b.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("start_mode");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                a aVar = new a();
                aVar.id = query.getInt(columnIndexOrThrow);
                aVar.time = query.getLong(columnIndexOrThrow2);
                aVar.mode = query.getInt(columnIndexOrThrow3);
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
