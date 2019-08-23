package com.ss.android.ugc.aweme.freeflowcard.data.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.util.TableInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.freeflowcard.data.a.a;
import com.ss.android.ugc.aweme.freeflowcard.data.a.b;
import com.ss.android.ugc.aweme.freeflowcard.data.a.c;
import com.ss.android.ugc.aweme.freeflowcard.data.a.d;
import com.ss.android.ugc.aweme.freeflowcard.data.a.e;
import com.ss.android.ugc.aweme.freeflowcard.data.a.f;
import java.util.HashMap;
import java.util.HashSet;

public class FreeFlowDatabase_Impl extends FreeFlowDatabase {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48634a;

    /* renamed from: b  reason: collision with root package name */
    private volatile c f48635b;

    /* renamed from: c  reason: collision with root package name */
    private volatile e f48636c;

    /* renamed from: d  reason: collision with root package name */
    private volatile a f48637d;

    public InvalidationTracker createInvalidationTracker() {
        if (PatchProxy.isSupport(new Object[0], this, f48634a, false, 46085, new Class[0], InvalidationTracker.class)) {
            return (InvalidationTracker) PatchProxy.accessDispatch(new Object[0], this, f48634a, false, 46085, new Class[0], InvalidationTracker.class);
        }
        return new InvalidationTracker(this, "tb_auto_play_setting", "tb_user_click_event", "tb_app_start_mode");
    }

    public final c a() {
        c cVar;
        if (PatchProxy.isSupport(new Object[0], this, f48634a, false, 46087, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f48634a, false, 46087, new Class[0], c.class);
        } else if (this.f48635b != null) {
            return this.f48635b;
        } else {
            synchronized (this) {
                if (this.f48635b == null) {
                    this.f48635b = new d(this);
                }
                cVar = this.f48635b;
            }
            return cVar;
        }
    }

    public final e b() {
        e eVar;
        if (PatchProxy.isSupport(new Object[0], this, f48634a, false, 46088, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f48634a, false, 46088, new Class[0], e.class);
        } else if (this.f48636c != null) {
            return this.f48636c;
        } else {
            synchronized (this) {
                if (this.f48636c == null) {
                    this.f48636c = new f(this);
                }
                eVar = this.f48636c;
            }
            return eVar;
        }
    }

    public final a c() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f48634a, false, 46089, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f48634a, false, 46089, new Class[0], a.class);
        } else if (this.f48637d != null) {
            return this.f48637d;
        } else {
            synchronized (this) {
                if (this.f48637d == null) {
                    this.f48637d = new b(this);
                }
                aVar = this.f48637d;
            }
            return aVar;
        }
    }

    public void clearAllTables() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f48634a, false, 46086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48634a, false, 46086, new Class[0], Void.TYPE);
            return;
        }
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `tb_auto_play_setting`");
            writableDatabase.execSQL("DELETE FROM `tb_user_click_event`");
            writableDatabase.execSQL("DELETE FROM `tb_app_start_mode`");
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
        if (PatchProxy.isSupport(new Object[]{databaseConfiguration2}, this, f48634a, false, 46084, new Class[]{DatabaseConfiguration.class}, SupportSQLiteOpenHelper.class)) {
            return (SupportSQLiteOpenHelper) PatchProxy.accessDispatch(new Object[]{databaseConfiguration2}, this, f48634a, false, 46084, new Class[]{DatabaseConfiguration.class}, SupportSQLiteOpenHelper.class);
        }
        return databaseConfiguration2.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration2.context).name(databaseConfiguration2.name).callback(new RoomOpenHelper(databaseConfiguration2, new RoomOpenHelper.Delegate(1) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48638a;

            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f48638a, false, 46090, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f48638a, false, 46090, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `tb_auto_play_setting` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_open` INTEGER NOT NULL, `change_type` INTEGER NOT NULL, `reset_time` INTEGER NOT NULL, `monthly_state` INTEGER NOT NULL, `day_open` INTEGER NOT NULL, `day_open_reset_time` INTEGER NOT NULL)");
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `tb_user_click_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `click_type` INTEGER NOT NULL, `is_auto_play` INTEGER NOT NULL)");
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `tb_app_start_mode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `start_mode` INTEGER NOT NULL)");
                supportSQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase2.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"1967f4d2e5a4f7e5e76e753b06cafe2b\")");
            }

            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f48638a, false, 46091, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f48638a, false, 46091, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                supportSQLiteDatabase2.execSQL("DROP TABLE IF EXISTS `tb_auto_play_setting`");
                supportSQLiteDatabase2.execSQL("DROP TABLE IF EXISTS `tb_user_click_event`");
                supportSQLiteDatabase2.execSQL("DROP TABLE IF EXISTS `tb_app_start_mode`");
            }

            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase}, this, f48638a, false, 46092, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase}, this, f48638a, false, 46092, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                if (FreeFlowDatabase_Impl.this.mCallbacks != null) {
                    int size = FreeFlowDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) FreeFlowDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase}, this, f48638a, false, 46093, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase}, this, f48638a, false, 46093, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                FreeFlowDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                FreeFlowDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (FreeFlowDatabase_Impl.this.mCallbacks != null) {
                    int size = FreeFlowDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) FreeFlowDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            public final void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteDatabase2}, this, f48638a, false, 46094, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteDatabase2}, this, f48638a, false, 46094, new Class[]{SupportSQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap(7);
                hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
                hashMap.put("is_open", new TableInfo.Column("is_open", "INTEGER", true, 0));
                hashMap.put("change_type", new TableInfo.Column("change_type", "INTEGER", true, 0));
                hashMap.put("reset_time", new TableInfo.Column("reset_time", "INTEGER", true, 0));
                hashMap.put("monthly_state", new TableInfo.Column("monthly_state", "INTEGER", true, 0));
                hashMap.put("day_open", new TableInfo.Column("day_open", "INTEGER", true, 0));
                hashMap.put("day_open_reset_time", new TableInfo.Column("day_open_reset_time", "INTEGER", true, 0));
                TableInfo tableInfo = new TableInfo("tb_auto_play_setting", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase2, "tb_auto_play_setting");
                if (tableInfo.equals(read)) {
                    HashMap hashMap2 = new HashMap(4);
                    hashMap2.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
                    hashMap2.put("time", new TableInfo.Column("time", "INTEGER", true, 0));
                    hashMap2.put("click_type", new TableInfo.Column("click_type", "INTEGER", true, 0));
                    hashMap2.put("is_auto_play", new TableInfo.Column("is_auto_play", "INTEGER", true, 0));
                    TableInfo tableInfo2 = new TableInfo("tb_user_click_event", hashMap2, new HashSet(0), new HashSet(0));
                    TableInfo read2 = TableInfo.read(supportSQLiteDatabase2, "tb_user_click_event");
                    if (tableInfo2.equals(read2)) {
                        HashMap hashMap3 = new HashMap(3);
                        hashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
                        hashMap3.put("time", new TableInfo.Column("time", "INTEGER", true, 0));
                        hashMap3.put("start_mode", new TableInfo.Column("start_mode", "INTEGER", true, 0));
                        TableInfo tableInfo3 = new TableInfo("tb_app_start_mode", hashMap3, new HashSet(0), new HashSet(0));
                        TableInfo read3 = TableInfo.read(supportSQLiteDatabase2, "tb_app_start_mode");
                        if (!tableInfo3.equals(read3)) {
                            throw new IllegalStateException("Migration didn't properly handle tb_app_start_mode(com.ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                        }
                        return;
                    }
                    throw new IllegalStateException("Migration didn't properly handle tb_user_click_event(com.ss.android.ugc.aweme.freeflowcard.data.entity.UserClickEvent).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                throw new IllegalStateException("Migration didn't properly handle tb_auto_play_setting(com.ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
        }, "1967f4d2e5a4f7e5e76e753b06cafe2b", "b3be3e5c94533db90027e813123cd689")).build());
    }
}
