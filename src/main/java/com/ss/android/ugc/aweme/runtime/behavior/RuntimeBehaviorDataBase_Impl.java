package com.ss.android.ugc.aweme.runtime.behavior;

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

public class RuntimeBehaviorDataBase_Impl extends RuntimeBehaviorDataBase {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63670a;

    /* renamed from: b  reason: collision with root package name */
    private volatile a f63671b;

    public InvalidationTracker createInvalidationTracker() {
        if (PatchProxy.isSupport(new Object[0], this, f63670a, false, 70985, new Class[0], InvalidationTracker.class)) {
            return (InvalidationTracker) PatchProxy.accessDispatch(new Object[0], this, f63670a, false, 70985, new Class[0], InvalidationTracker.class);
        }
        return new InvalidationTracker(this, "runtimeBehaviorEntity");
    }

    public final a a() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f63670a, false, 70987, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f63670a, false, 70987, new Class[0], a.class);
        } else if (this.f63671b != null) {
            return this.f63671b;
        } else {
            synchronized (this) {
                if (this.f63671b == null) {
                    this.f63671b = new b(this);
                }
                aVar = this.f63671b;
            }
            return aVar;
        }
    }

    public void clearAllTables() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f63670a, false, 70986, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63670a, false, 70986, new Class[0], Void.TYPE);
            return;
        }
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `runtimeBehaviorEntity`");
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
        if (PatchProxy.isSupport(new Object[]{databaseConfiguration2}, this, f63670a, false, 70984, new Class[]{DatabaseConfiguration.class}, SupportSQLiteOpenHelper.class)) {
            return (SupportSQLiteOpenHelper) PatchProxy.accessDispatch(new Object[]{databaseConfiguration2}, this, f63670a, false, 70984, new Class[]{DatabaseConfiguration.class}, SupportSQLiteOpenHelper.class);
        }
        return databaseConfiguration2.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration2.context).name(databaseConfiguration2.name).callback(new RoomOpenHelper(databaseConfiguration2, new RoomOpenHelper.Delegate(1) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63672a;

            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f63672a, false, 70989, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f63672a, false, 70989, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                supportSQLiteDatabase2.execSQL("DROP TABLE IF EXISTS `runtimeBehaviorEntity`");
            }

            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f63672a, false, 70988, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f63672a, false, 70988, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `runtimeBehaviorEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `time` INTEGER NOT NULL, `msg` TEXT NOT NULL)");
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase2.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"977ffca18b985d80d9f488e58c9d7da9\")");
            }

            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase}, this, f63672a, false, 70990, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase}, this, f63672a, false, 70990, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                if (RuntimeBehaviorDataBase_Impl.this.mCallbacks != null) {
                    int size = RuntimeBehaviorDataBase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) RuntimeBehaviorDataBase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase}, this, f63672a, false, 70991, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase}, this, f63672a, false, 70991, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                RuntimeBehaviorDataBase_Impl.this.mDatabase = supportSQLiteDatabase;
                RuntimeBehaviorDataBase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (RuntimeBehaviorDataBase_Impl.this.mCallbacks != null) {
                    int size = RuntimeBehaviorDataBase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) RuntimeBehaviorDataBase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            public final void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f63672a, false, 70992, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f63672a, false, 70992, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap(4);
                hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
                hashMap.put("type", new TableInfo.Column("type", "TEXT", true, 0));
                hashMap.put("time", new TableInfo.Column("time", "INTEGER", true, 0));
                hashMap.put("msg", new TableInfo.Column("msg", "TEXT", true, 0));
                TableInfo tableInfo = new TableInfo("runtimeBehaviorEntity", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase2, "runtimeBehaviorEntity");
                if (!tableInfo.equals(read)) {
                    throw new IllegalStateException("Migration didn't properly handle runtimeBehaviorEntity(com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
            }
        }, "977ffca18b985d80d9f488e58c9d7da9", "3d4bcb8798a8e5184ae76e79c3f54456")).build());
    }
}
