package com.bytedance.android.livesdk.i18n.db;

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

public class I18nDatabase_Impl extends I18nDatabase {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15605a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f15606b;

    /* renamed from: c  reason: collision with root package name */
    private volatile b f15607c;

    public final e a() {
        e eVar;
        if (PatchProxy.isSupport(new Object[0], this, f15605a, false, 10182, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f15605a, false, 10182, new Class[0], e.class);
        } else if (this.f15606b != null) {
            return this.f15606b;
        } else {
            synchronized (this) {
                if (this.f15606b == null) {
                    this.f15606b = new f(this);
                }
                eVar = this.f15606b;
            }
            return eVar;
        }
    }

    public final b b() {
        b bVar;
        if (PatchProxy.isSupport(new Object[0], this, f15605a, false, 10183, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f15605a, false, 10183, new Class[0], b.class);
        } else if (this.f15607c != null) {
            return this.f15607c;
        } else {
            synchronized (this) {
                if (this.f15607c == null) {
                    this.f15607c = new c(this);
                }
                bVar = this.f15607c;
            }
            return bVar;
        }
    }

    public InvalidationTracker createInvalidationTracker() {
        if (PatchProxy.isSupport(new Object[0], this, f15605a, false, 10180, new Class[0], InvalidationTracker.class)) {
            return (InvalidationTracker) PatchProxy.accessDispatch(new Object[0], this, f15605a, false, 10180, new Class[0], InvalidationTracker.class);
        }
        return new InvalidationTracker(this, "translation", "information");
    }

    public void clearAllTables() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f15605a, false, 10181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15605a, false, 10181, new Class[0], Void.TYPE);
            return;
        }
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `translation`");
            writableDatabase.execSQL("DELETE FROM `information`");
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
        if (PatchProxy.isSupport(new Object[]{databaseConfiguration2}, this, f15605a, false, 10179, new Class[]{DatabaseConfiguration.class}, SupportSQLiteOpenHelper.class)) {
            return (SupportSQLiteOpenHelper) PatchProxy.accessDispatch(new Object[]{databaseConfiguration2}, this, f15605a, false, 10179, new Class[]{DatabaseConfiguration.class}, SupportSQLiteOpenHelper.class);
        }
        return databaseConfiguration2.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration2.context).name(databaseConfiguration2.name).callback(new RoomOpenHelper(databaseConfiguration2, new RoomOpenHelper.Delegate(1) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15608a;

            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f15608a, false, 10185, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f15608a, false, 10185, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                supportSQLiteDatabase2.execSQL("DROP TABLE IF EXISTS `translation`");
                supportSQLiteDatabase2.execSQL("DROP TABLE IF EXISTS `information`");
            }

            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f15608a, false, 10184, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f15608a, false, 10184, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `translation` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `information` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase2.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"db08c04e8a10c6c1ddb9d9ab384c2f17\")");
            }

            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase}, this, f15608a, false, 10186, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase}, this, f15608a, false, 10186, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                if (I18nDatabase_Impl.this.mCallbacks != null) {
                    int size = I18nDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) I18nDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase}, this, f15608a, false, 10187, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase}, this, f15608a, false, 10187, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                I18nDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                I18nDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (I18nDatabase_Impl.this.mCallbacks != null) {
                    int size = I18nDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) I18nDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            public final void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f15608a, false, 10188, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f15608a, false, 10188, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap(2);
                hashMap.put("key", new TableInfo.Column("key", "TEXT", true, 1));
                hashMap.put("value", new TableInfo.Column("value", "TEXT", false, 0));
                TableInfo tableInfo = new TableInfo("translation", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase2, "translation");
                if (tableInfo.equals(read)) {
                    HashMap hashMap2 = new HashMap(2);
                    hashMap2.put("key", new TableInfo.Column("key", "TEXT", true, 1));
                    hashMap2.put("value", new TableInfo.Column("value", "TEXT", false, 0));
                    TableInfo tableInfo2 = new TableInfo("information", hashMap2, new HashSet(0), new HashSet(0));
                    TableInfo read2 = TableInfo.read(supportSQLiteDatabase2, "information");
                    if (!tableInfo2.equals(read2)) {
                        throw new IllegalStateException("Migration didn't properly handle information(com.bytedance.android.livesdk.i18n.db.I18nInformation).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                    }
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle translation(com.bytedance.android.livesdk.i18n.db.I18nTranslation).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
        }, "db08c04e8a10c6c1ddb9d9ab384c2f17", "e3af7f9b450df7204a5f65d0fd2a1eaa")).build());
    }
}
