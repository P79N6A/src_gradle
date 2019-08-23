package com.aweme.storage;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f7402a;

    /* renamed from: b  reason: collision with root package name */
    private final EntityInsertionAdapter f7403b;

    /* renamed from: c  reason: collision with root package name */
    private final EntityDeletionOrUpdateAdapter f7404c;

    /* renamed from: d  reason: collision with root package name */
    private final EntityDeletionOrUpdateAdapter f7405d;

    public final List<m> a() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from black_tb", 0);
        Cursor query = this.f7402a.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("path");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("size");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("date");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("count");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                m mVar = new m(query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5));
                mVar.f7410a = query.getInt(columnIndexOrThrow);
                mVar.f7412c = query.getLong(columnIndexOrThrow3);
                arrayList.add(mVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public k(RoomDatabase roomDatabase) {
        this.f7402a = roomDatabase;
        this.f7403b = new EntityInsertionAdapter<m>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR ROLLBACK INTO `black_tb`(`id`,`path`,`size`,`date`,`count`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                m mVar = (m) obj;
                supportSQLiteStatement.bindLong(1, (long) mVar.f7410a);
                if (mVar.f7411b == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, mVar.f7411b);
                }
                supportSQLiteStatement.bindLong(3, mVar.f7412c);
                supportSQLiteStatement.bindLong(4, mVar.f7413d);
                supportSQLiteStatement.bindLong(5, (long) mVar.f7414e);
            }
        };
        this.f7404c = new EntityDeletionOrUpdateAdapter<m>(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM `black_tb` WHERE `id` = ?";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                supportSQLiteStatement.bindLong(1, (long) ((m) obj).f7410a);
            }
        };
        this.f7405d = new EntityDeletionOrUpdateAdapter<m>(roomDatabase) {
            public final String createQuery() {
                return "UPDATE OR REPLACE `black_tb` SET `id` = ?,`path` = ?,`size` = ?,`date` = ?,`count` = ? WHERE `id` = ?";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                m mVar = (m) obj;
                supportSQLiteStatement.bindLong(1, (long) mVar.f7410a);
                if (mVar.f7411b == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, mVar.f7411b);
                }
                supportSQLiteStatement.bindLong(3, mVar.f7412c);
                supportSQLiteStatement.bindLong(4, mVar.f7413d);
                supportSQLiteStatement.bindLong(5, (long) mVar.f7414e);
                supportSQLiteStatement.bindLong(6, (long) mVar.f7410a);
            }
        };
    }

    public final void a(m... mVarArr) {
        this.f7402a.beginTransaction();
        try {
            this.f7403b.insert((T[]) mVarArr);
            this.f7402a.setTransactionSuccessful();
        } finally {
            this.f7402a.endTransaction();
        }
    }

    public final void b(m... mVarArr) {
        this.f7402a.beginTransaction();
        try {
            this.f7404c.handleMultiple((T[]) mVarArr);
            this.f7402a.setTransactionSuccessful();
        } finally {
            this.f7402a.endTransaction();
        }
    }
}
