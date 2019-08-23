package com.ss.android.ugc.aweme.commercialize.dao;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.util.TableInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.HashSet;

public class ShowAdDataBase_Impl extends ShowAdDataBase {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38658a;

    /* renamed from: b  reason: collision with root package name */
    private volatile b f38659b;

    public final b a() {
        b bVar;
        if (PatchProxy.isSupport(new Object[0], this, f38658a, false, 30543, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f38658a, false, 30543, new Class[0], b.class);
        } else if (this.f38659b != null) {
            return this.f38659b;
        } else {
            synchronized (this) {
                if (this.f38659b == null) {
                    this.f38659b = new c(this);
                }
                bVar = this.f38659b;
            }
            return bVar;
        }
    }

    public InvalidationTracker createInvalidationTracker() {
        if (PatchProxy.isSupport(new Object[0], this, f38658a, false, 30541, new Class[0], InvalidationTracker.class)) {
            return (InvalidationTracker) PatchProxy.accessDispatch(new Object[0], this, f38658a, false, 30541, new Class[0], InvalidationTracker.class);
        }
        return new InvalidationTracker(this, "showAd");
    }

    public void clearAllTables() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f38658a, false, 30542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38658a, false, 30542, new Class[0], Void.TYPE);
            return;
        }
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `showAd`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            str = "PRAGMA wal_checkpoint(FULL)";
            writableDatabase.query(str).close();
            if (!writableDatabase.inTransaction()) {
                str2 = "VACUUM";
                writableDatabase.execSQL(str2);
            }
        }
    }

    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        DatabaseConfiguration databaseConfiguration2 = databaseConfiguration;
        if (PatchProxy.isSupport(new Object[]{databaseConfiguration2}, this, f38658a, false, 30540, new Class[]{DatabaseConfiguration.class}, SupportSQLiteOpenHelper.class)) {
            return (SupportSQLiteOpenHelper) PatchProxy.accessDispatch(new Object[]{databaseConfiguration2}, this, f38658a, false, 30540, new Class[]{DatabaseConfiguration.class}, SupportSQLiteOpenHelper.class);
        }
        return databaseConfiguration2.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration2.context).name(databaseConfiguration2.name).callback(new RoomOpenHelper(databaseConfiguration2, new RoomOpenHelper.Delegate(1) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38660a;

            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f38660a, false, 30545, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f38660a, false, 30545, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                supportSQLiteDatabase2.execSQL("DROP TABLE IF EXISTS `showAd`");
            }

            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f38660a, false, 30544, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f38660a, false, 30544, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `showAd` (`awemeId` TEXT NOT NULL, PRIMARY KEY(`awemeId`))");
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase2.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"b390b3c8ccd346d851c56d8fb78f29df\")");
            }

            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase}, this, f38660a, false, 30546, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase}, this, f38660a, false, 30546, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                if (ShowAdDataBase_Impl.this.mCallbacks != null) {
                    int size = ShowAdDataBase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) ShowAdDataBase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase}, this, f38660a, false, 30547, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase}, this, f38660a, false, 30547, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                ShowAdDataBase_Impl.this.mDatabase = supportSQLiteDatabase;
                ShowAdDataBase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (ShowAdDataBase_Impl.this.mCallbacks != null) {
                    int size = ShowAdDataBase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) ShowAdDataBase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            public final void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f38660a, false, 30548, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f38660a, false, 30548, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap(1);
                hashMap.put("awemeId", new TableInfo.Column("awemeId", "TEXT", true, 1));
                TableInfo tableInfo = new TableInfo("showAd", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase2, "showAd");
                if (!tableInfo.equals(read)) {
                    throw new IllegalStateException("Migration didn't properly handle showAd(com.ss.android.ugc.aweme.commercialize.dao.ShowAd).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
            }
        }, "b390b3c8ccd346d851c56d8fb78f29df", "ad22cd0c0878f7d44a84485b85a127f7")).build());
    }
}
