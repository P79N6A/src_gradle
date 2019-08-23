package com.ss.android.ugc.aweme.challenge.data;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35385a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase f35386b;

    /* renamed from: c  reason: collision with root package name */
    private final EntityInsertionAdapter f35387c;

    /* renamed from: d  reason: collision with root package name */
    private final EntityDeletionOrUpdateAdapter f35388d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedSQLiteStatement f35389e;

    public final List<c> a() {
        Long l;
        if (PatchProxy.isSupport(new Object[0], this, f35385a, false, 25812, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f35385a, false, 25812, new Class[0], List.class);
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM localHashTag order by time desc", 0);
        Cursor query = this.f35386b.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("name");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("time");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                c cVar = new c();
                cVar.f35395a = query.getString(columnIndexOrThrow);
                if (query.isNull(columnIndexOrThrow2)) {
                    l = null;
                } else {
                    l = Long.valueOf(query.getLong(columnIndexOrThrow2));
                }
                cVar.f35396b = l;
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public final int b() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f35385a, false, 25813, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35385a, false, 25813, new Class[0], Integer.TYPE)).intValue();
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT count(*) FROM localHashTag", 0);
        Cursor query = this.f35386b.query(acquire);
        try {
            if (query.moveToFirst()) {
                i = query.getInt(0);
            }
            return i;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public b(RoomDatabase roomDatabase) {
        this.f35386b = roomDatabase;
        this.f35387c = new EntityInsertionAdapter<c>(roomDatabase) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35390a;

            public final String createQuery() {
                return "INSERT OR FAIL INTO `localHashTag`(`name`,`time`) VALUES (?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                c cVar = (c) obj;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteStatement2, cVar}, this, f35390a, false, 25814, new Class[]{SupportSQLiteStatement.class, c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteStatement2, cVar}, this, f35390a, false, 25814, new Class[]{SupportSQLiteStatement.class, c.class}, Void.TYPE);
                    return;
                }
                if (cVar.f35395a == null) {
                    supportSQLiteStatement2.bindNull(1);
                } else {
                    supportSQLiteStatement2.bindString(1, cVar.f35395a);
                }
                if (cVar.f35396b == null) {
                    supportSQLiteStatement2.bindNull(2);
                } else {
                    supportSQLiteStatement2.bindLong(2, cVar.f35396b.longValue());
                }
            }
        };
        this.f35388d = new EntityDeletionOrUpdateAdapter<c>(roomDatabase) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35392a;

            public final String createQuery() {
                return "UPDATE OR FAIL `localHashTag` SET `name` = ?,`time` = ? WHERE `name` = ?";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                c cVar = (c) obj;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteStatement2, cVar}, this, f35392a, false, 25815, new Class[]{SupportSQLiteStatement.class, c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteStatement2, cVar}, this, f35392a, false, 25815, new Class[]{SupportSQLiteStatement.class, c.class}, Void.TYPE);
                    return;
                }
                if (cVar.f35395a == null) {
                    supportSQLiteStatement2.bindNull(1);
                } else {
                    supportSQLiteStatement2.bindString(1, cVar.f35395a);
                }
                if (cVar.f35396b == null) {
                    supportSQLiteStatement2.bindNull(2);
                } else {
                    supportSQLiteStatement2.bindLong(2, cVar.f35396b.longValue());
                }
                if (cVar.f35395a == null) {
                    supportSQLiteStatement2.bindNull(3);
                } else {
                    supportSQLiteStatement2.bindString(3, cVar.f35395a);
                }
            }
        };
        this.f35389e = new SharedSQLiteStatement(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM localHashTag WHERE time in(SELECT time FROM localHashTag ORDER BY time ASC LIMIT ?)";
            }
        };
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35385a, false, 25811, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35385a, false, 25811, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SupportSQLiteStatement acquire = this.f35389e.acquire();
        this.f35386b.beginTransaction();
        try {
            acquire.bindLong(1, (long) i);
            acquire.executeUpdateDelete();
            this.f35386b.setTransactionSuccessful();
        } finally {
            this.f35386b.endTransaction();
            this.f35389e.release(acquire);
        }
    }

    public final void b(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f35385a, false, 25810, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f35385a, false, 25810, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f35386b.beginTransaction();
        try {
            this.f35388d.handle(cVar);
            this.f35386b.setTransactionSuccessful();
        } finally {
            this.f35386b.endTransaction();
        }
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f35385a, false, 25809, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f35385a, false, 25809, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f35386b.beginTransaction();
        try {
            this.f35387c.insert(cVar);
            this.f35386b.setTransactionSuccessful();
        } finally {
            this.f35386b.endTransaction();
        }
    }
}
