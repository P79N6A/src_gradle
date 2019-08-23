package com.bytedance.android.livesdk.i18n.db;

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

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15619a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase f15620b;

    /* renamed from: c  reason: collision with root package name */
    private final EntityInsertionAdapter f15621c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedSQLiteStatement f15622d;

    public final List<d> a() {
        if (PatchProxy.isSupport(new Object[0], this, f15619a, false, 10194, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f15619a, false, 10194, new Class[0], List.class);
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM translation", 0);
        Cursor query = this.f15620b.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("key");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("value");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                d dVar = new d();
                dVar.f15617a = query.getString(columnIndexOrThrow);
                dVar.f15618b = query.getString(columnIndexOrThrow2);
                arrayList.add(dVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f15619a, false, 10193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15619a, false, 10193, new Class[0], Void.TYPE);
            return;
        }
        SupportSQLiteStatement acquire = this.f15622d.acquire();
        this.f15620b.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f15620b.setTransactionSuccessful();
        } finally {
            this.f15620b.endTransaction();
            this.f15622d.release(acquire);
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.f15620b = roomDatabase;
        this.f15621c = new EntityInsertionAdapter<d>(roomDatabase) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15623a;

            public final String createQuery() {
                return "INSERT OR REPLACE INTO `translation`(`key`,`value`) VALUES (?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                d dVar = (d) obj;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteStatement2, dVar}, this, f15623a, false, 10195, new Class[]{SupportSQLiteStatement.class, d.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteStatement2, dVar}, this, f15623a, false, 10195, new Class[]{SupportSQLiteStatement.class, d.class}, Void.TYPE);
                    return;
                }
                if (dVar.f15617a == null) {
                    supportSQLiteStatement2.bindNull(1);
                } else {
                    supportSQLiteStatement2.bindString(1, dVar.f15617a);
                }
                if (dVar.f15618b == null) {
                    supportSQLiteStatement2.bindNull(2);
                } else {
                    supportSQLiteStatement2.bindString(2, dVar.f15618b);
                }
            }
        };
        this.f15622d = new SharedSQLiteStatement(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM translation";
            }
        };
    }

    public final void a(List<d> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f15619a, false, 10192, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15619a, false, 10192, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f15620b.beginTransaction();
        try {
            this.f15621c.insert((Iterable<T>) list);
            this.f15620b.setTransactionSuccessful();
        } finally {
            this.f15620b.endTransaction();
        }
    }
}
