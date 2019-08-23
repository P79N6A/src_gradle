package com.ss.android.ugc.aweme.commercialize.dao;

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

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38664a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase f38665b;

    /* renamed from: c  reason: collision with root package name */
    private final EntityInsertionAdapter f38666c;

    /* renamed from: d  reason: collision with root package name */
    private final EntityDeletionOrUpdateAdapter f38667d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedSQLiteStatement f38668e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38664a, false, 30534, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38664a, false, 30534, new Class[0], Void.TYPE);
            return;
        }
        SupportSQLiteStatement acquire = this.f38668e.acquire();
        this.f38665b.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38665b.setTransactionSuccessful();
        } finally {
            this.f38665b.endTransaction();
            this.f38668e.release(acquire);
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.f38665b = roomDatabase;
        this.f38666c = new EntityInsertionAdapter<a>(roomDatabase) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38669a;

            public final String createQuery() {
                return "INSERT OR ABORT INTO `showAd`(`awemeId`) VALUES (?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                a aVar = (a) obj;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteStatement2, aVar}, this, f38669a, false, 30538, new Class[]{SupportSQLiteStatement.class, a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteStatement2, aVar}, this, f38669a, false, 30538, new Class[]{SupportSQLiteStatement.class, a.class}, Void.TYPE);
                } else if (aVar.f38663b == null) {
                    supportSQLiteStatement2.bindNull(1);
                } else {
                    supportSQLiteStatement2.bindString(1, aVar.f38663b);
                }
            }
        };
        this.f38667d = new EntityDeletionOrUpdateAdapter<a>(roomDatabase) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38671a;

            public final String createQuery() {
                return "DELETE FROM `showAd` WHERE `awemeId` = ?";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                a aVar = (a) obj;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteStatement2, aVar}, this, f38671a, false, 30539, new Class[]{SupportSQLiteStatement.class, a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteStatement2, aVar}, this, f38671a, false, 30539, new Class[]{SupportSQLiteStatement.class, a.class}, Void.TYPE);
                } else if (aVar.f38663b == null) {
                    supportSQLiteStatement2.bindNull(1);
                } else {
                    supportSQLiteStatement2.bindString(1, aVar.f38663b);
                }
            }
        };
        this.f38668e = new SharedSQLiteStatement(roomDatabase) {
            public final String createQuery() {
                return "delete from showAd";
            }
        };
    }

    public final List<a> a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f38664a, false, 30536, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, this, f38664a, false, 30536, new Class[]{String.class}, List.class);
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM showAd where awemeId = ?", 1);
        if (str2 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str2);
        }
        Cursor query = this.f38665b.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("awemeId");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new a(query.getString(columnIndexOrThrow)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f38664a, false, 30531, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f38664a, false, 30531, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f38665b.beginTransaction();
        try {
            this.f38666c.insert(aVar);
            this.f38665b.setTransactionSuccessful();
        } finally {
            this.f38665b.endTransaction();
        }
    }
}
