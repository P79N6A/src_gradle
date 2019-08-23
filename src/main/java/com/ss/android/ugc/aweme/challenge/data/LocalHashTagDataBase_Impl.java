package com.ss.android.ugc.aweme.challenge.data;

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

public class LocalHashTagDataBase_Impl extends LocalHashTagDataBase {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35381a;

    /* renamed from: b  reason: collision with root package name */
    private volatile a f35382b;

    public final a a() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f35381a, false, 25819, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f35381a, false, 25819, new Class[0], a.class);
        } else if (this.f35382b != null) {
            return this.f35382b;
        } else {
            synchronized (this) {
                if (this.f35382b == null) {
                    this.f35382b = new b(this);
                }
                aVar = this.f35382b;
            }
            return aVar;
        }
    }

    public InvalidationTracker createInvalidationTracker() {
        if (PatchProxy.isSupport(new Object[0], this, f35381a, false, 25817, new Class[0], InvalidationTracker.class)) {
            return (InvalidationTracker) PatchProxy.accessDispatch(new Object[0], this, f35381a, false, 25817, new Class[0], InvalidationTracker.class);
        }
        return new InvalidationTracker(this, "localHashTag");
    }

    public void clearAllTables() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f35381a, false, 25818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35381a, false, 25818, new Class[0], Void.TYPE);
            return;
        }
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `localHashTag`");
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
        if (PatchProxy.isSupport(new Object[]{databaseConfiguration2}, this, f35381a, false, 25816, new Class[]{DatabaseConfiguration.class}, SupportSQLiteOpenHelper.class)) {
            return (SupportSQLiteOpenHelper) PatchProxy.accessDispatch(new Object[]{databaseConfiguration2}, this, f35381a, false, 25816, new Class[]{DatabaseConfiguration.class}, SupportSQLiteOpenHelper.class);
        }
        return databaseConfiguration2.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration2.context).name(databaseConfiguration2.name).callback(new RoomOpenHelper(databaseConfiguration2, new RoomOpenHelper.Delegate(1) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35383a;

            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f35383a, false, 25821, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f35383a, false, 25821, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                supportSQLiteDatabase2.execSQL("DROP TABLE IF EXISTS `localHashTag`");
            }

            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f35383a, false, 25820, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f35383a, false, 25820, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `localHashTag` (`name` TEXT NOT NULL, `time` INTEGER, PRIMARY KEY(`name`))");
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase2.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"0fdb23fe113307f93af74ceea527f0a9\")");
            }

            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase}, this, f35383a, false, 25822, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase}, this, f35383a, false, 25822, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                if (LocalHashTagDataBase_Impl.this.mCallbacks != null) {
                    int size = LocalHashTagDataBase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) LocalHashTagDataBase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase}, this, f35383a, false, 25823, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase}, this, f35383a, false, 25823, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                LocalHashTagDataBase_Impl.this.mDatabase = supportSQLiteDatabase;
                LocalHashTagDataBase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (LocalHashTagDataBase_Impl.this.mCallbacks != null) {
                    int size = LocalHashTagDataBase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) LocalHashTagDataBase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            public final void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f35383a, false, 25824, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f35383a, false, 25824, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap(2);
                hashMap.put("name", new TableInfo.Column("name", "TEXT", true, 1));
                hashMap.put("time", new TableInfo.Column("time", "INTEGER", false, 0));
                TableInfo tableInfo = new TableInfo("localHashTag", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase2, "localHashTag");
                if (!tableInfo.equals(read)) {
                    throw new IllegalStateException("Migration didn't properly handle localHashTag(com.ss.android.ugc.aweme.challenge.data.LocalHashTagItem).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
            }
        }, "0fdb23fe113307f93af74ceea527f0a9", "606e3395020db78e36e0b235c6657129")).build());
    }
}
