package com.ss.android.ugc.aweme.freeflowcard.data.a;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.freeflowcard.data.b.c;
import java.util.ArrayList;
import java.util.List;

public final class f extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48627a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase f48628b;

    /* renamed from: c  reason: collision with root package name */
    private final EntityInsertionAdapter f48629c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedSQLiteStatement f48630d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48627a, false, 46080, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48627a, false, 46080, new Class[0], Void.TYPE);
            return;
        }
        SupportSQLiteStatement acquire = this.f48630d.acquire();
        this.f48628b.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f48628b.setTransactionSuccessful();
        } finally {
            this.f48628b.endTransaction();
            this.f48630d.release(acquire);
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.f48628b = roomDatabase;
        this.f48629c = new EntityInsertionAdapter<c>(roomDatabase) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48631a;

            public final String createQuery() {
                return "INSERT OR ABORT INTO `tb_user_click_event`(`id`,`time`,`click_type`,`is_auto_play`) VALUES (nullif(?, 0),?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                c cVar = (c) obj;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteStatement2, cVar}, this, f48631a, false, 46083, new Class[]{SupportSQLiteStatement.class, c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteStatement2, cVar}, this, f48631a, false, 46083, new Class[]{SupportSQLiteStatement.class, c.class}, Void.TYPE);
                    return;
                }
                supportSQLiteStatement2.bindLong(1, (long) cVar.id);
                supportSQLiteStatement2.bindLong(2, cVar.time);
                supportSQLiteStatement2.bindLong(3, (long) cVar.clickType);
                supportSQLiteStatement2.bindLong(4, cVar.isAutoPlay ? 1 : 0);
            }
        };
        this.f48630d = new SharedSQLiteStatement(roomDatabase) {
            public final String createQuery() {
                return "delete from tb_user_click_event";
            }
        };
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f48627a, false, 46079, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f48627a, false, 46079, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f48628b.beginTransaction();
        try {
            this.f48629c.insert(cVar);
            this.f48628b.setTransactionSuccessful();
        } finally {
            this.f48628b.endTransaction();
        }
    }

    public final List<c> a(long j, long j2) {
        boolean z;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f48627a, false, 46082, new Class[]{Long.TYPE, Long.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f48627a, false, 46082, new Class[]{Long.TYPE, Long.TYPE}, List.class);
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from tb_user_click_event where time between ? and ?", 2);
        acquire.bindLong(1, j3);
        acquire.bindLong(2, j4);
        Cursor query = this.f48628b.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("click_type");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("is_auto_play");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                long j5 = query.getLong(columnIndexOrThrow2);
                int i = query.getInt(columnIndexOrThrow3);
                if (query.getInt(columnIndexOrThrow4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c cVar = new c(j5, i, z);
                cVar.id = query.getInt(columnIndexOrThrow);
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
