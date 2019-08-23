package android.arch.persistence.room;

import android.arch.persistence.db.SimpleSQLiteQuery;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteQuery;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {
    @Nullable
    private DatabaseConfiguration mConfiguration;
    @NonNull
    private final Delegate mDelegate;
    @NonNull
    private final String mIdentityHash;
    @NonNull
    private final String mLegacyHash;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class Delegate {
        public final int version;

        /* access modifiers changed from: protected */
        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public abstract void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase);

        public Delegate(int i) {
            this.version = i;
        }
    }

    public void onConfigure(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.onConfigure(supportSQLiteDatabase);
    }

    private void createMasterTableIfNotExists(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private void updateIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        createMasterTableIfNotExists(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(RoomMasterTable.createInsertQuery(this.mIdentityHash));
    }

    public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
        updateIdentity(supportSQLiteDatabase);
        this.mDelegate.createAllTables(supportSQLiteDatabase);
        this.mDelegate.onCreate(supportSQLiteDatabase);
    }

    public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.onOpen(supportSQLiteDatabase);
        checkIdentity(supportSQLiteDatabase);
        this.mDelegate.onOpen(supportSQLiteDatabase);
        this.mConfiguration = null;
    }

    private static boolean hasRoomMasterTable(SupportSQLiteDatabase supportSQLiteDatabase) {
        Cursor query = supportSQLiteDatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (query.moveToFirst() && query.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            query.close();
        }
    }

    private void checkIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str = null;
        if (hasRoomMasterTable(supportSQLiteDatabase)) {
            Cursor query = supportSQLiteDatabase.query((SupportSQLiteQuery) new SimpleSQLiteQuery("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (query.moveToFirst()) {
                    str = query.getString(0);
                }
            } finally {
                query.close();
            }
        }
        if (!this.mIdentityHash.equals(str) && !this.mLegacyHash.equals(str)) {
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
        }
    }

    public void onDowngrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        onUpgrade(supportSQLiteDatabase, i, i2);
    }

    public RoomOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration, @NonNull Delegate delegate, @NonNull String str) {
        this(databaseConfiguration, delegate, "", str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.arch.persistence.db.SupportSQLiteDatabase r3, int r4, int r5) {
        /*
            r2 = this;
            android.arch.persistence.room.DatabaseConfiguration r0 = r2.mConfiguration
            if (r0 == 0) goto L_0x002c
            android.arch.persistence.room.DatabaseConfiguration r0 = r2.mConfiguration
            android.arch.persistence.room.RoomDatabase$MigrationContainer r0 = r0.migrationContainer
            java.util.List r0 = r0.findMigrationPath(r4, r5)
            if (r0 == 0) goto L_0x002c
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            android.arch.persistence.room.migration.Migration r1 = (android.arch.persistence.room.migration.Migration) r1
            r1.migrate(r3)
            goto L_0x0012
        L_0x0022:
            android.arch.persistence.room.RoomOpenHelper$Delegate r0 = r2.mDelegate
            r0.validateMigration(r3)
            r2.updateIdentity(r3)
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 != 0) goto L_0x0071
            android.arch.persistence.room.DatabaseConfiguration r0 = r2.mConfiguration
            if (r0 == 0) goto L_0x0046
            android.arch.persistence.room.DatabaseConfiguration r0 = r2.mConfiguration
            boolean r0 = r0.isMigrationRequiredFrom(r4)
            if (r0 != 0) goto L_0x0046
            android.arch.persistence.room.RoomOpenHelper$Delegate r4 = r2.mDelegate
            r4.dropAllTables(r3)
            android.arch.persistence.room.RoomOpenHelper$Delegate r4 = r2.mDelegate
            r4.createAllTables(r3)
            return
        L_0x0046:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A migration from "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " to "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " was required but not found. Please provide the necessary Migration path via "
            r0.append(r4)
            java.lang.String r4 = "RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the "
            r0.append(r4)
            java.lang.String r4 = "RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.arch.persistence.room.RoomOpenHelper.onUpgrade(android.arch.persistence.db.SupportSQLiteDatabase, int, int):void");
    }

    public RoomOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration, @NonNull Delegate delegate, @NonNull String str, @NonNull String str2) {
        super(delegate.version);
        this.mConfiguration = databaseConfiguration;
        this.mDelegate = delegate;
        this.mIdentityHash = str;
        this.mLegacyHash = str2;
    }
}
