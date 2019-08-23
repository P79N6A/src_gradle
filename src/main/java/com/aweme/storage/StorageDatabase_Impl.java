package com.aweme.storage;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.util.TableInfo;
import java.util.HashMap;
import java.util.HashSet;

public class StorageDatabase_Impl extends StorageDatabase {

    /* renamed from: a  reason: collision with root package name */
    private volatile j f7361a;

    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, "black_tb");
    }

    public final j a() {
        j jVar;
        if (this.f7361a != null) {
            return this.f7361a;
        }
        synchronized (this) {
            if (this.f7361a == null) {
                this.f7361a = new k(this);
            }
            jVar = this.f7361a;
        }
        return jVar;
    }

    public void clearAllTables() {
        String str;
        String str2;
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `black_tb`");
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
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(1) {
            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `black_tb`");
            }

            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `black_tb` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `path` TEXT, `size` INTEGER NOT NULL, `date` INTEGER NOT NULL, `count` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"9da1db0d9f35b616dc4fd53e8847a569\")");
            }

            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (StorageDatabase_Impl.this.mCallbacks != null) {
                    int size = StorageDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) StorageDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                StorageDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                StorageDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (StorageDatabase_Impl.this.mCallbacks != null) {
                    int size = StorageDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) StorageDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            public final void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(5);
                hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
                hashMap.put("path", new TableInfo.Column("path", "TEXT", false, 0));
                hashMap.put("size", new TableInfo.Column("size", "INTEGER", true, 0));
                hashMap.put("date", new TableInfo.Column("date", "INTEGER", true, 0));
                hashMap.put("count", new TableInfo.Column("count", "INTEGER", true, 0));
                TableInfo tableInfo = new TableInfo("black_tb", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "black_tb");
                if (!tableInfo.equals(read)) {
                    throw new IllegalStateException("Migration didn't properly handle black_tb(com.aweme.storage.StorageItem).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
            }
        }, "9da1db0d9f35b616dc4fd53e8847a569", "49c93119ba969cd899aa69d0a2419483")).build());
    }
}
