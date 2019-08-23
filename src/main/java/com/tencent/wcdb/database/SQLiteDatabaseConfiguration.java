package com.tencent.wcdb.database;

import java.util.ArrayList;
import java.util.Locale;

public final class SQLiteDatabaseConfiguration {
    public final ArrayList<SQLiteCustomFunction> customFunctions = new ArrayList<>();
    public boolean customWALHookEnabled;
    public boolean foreignKeyConstraintsEnabled;
    public final String label;
    public Locale locale;
    public int maxSqlCacheSize;
    public int openFlags;
    public final String path;
    public int synchronousMode;
    public boolean updateNotificationEnabled;
    public boolean updateNotificationRowID;
    public String vfsName;

    public final boolean isInMemoryDb() {
        return this.path.equalsIgnoreCase(":memory:");
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration != null) {
            this.path = sQLiteDatabaseConfiguration.path;
            this.label = sQLiteDatabaseConfiguration.label;
            updateParametersFrom(sQLiteDatabaseConfiguration);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }

    public final void updateParametersFrom(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("other must not be null.");
        } else if (this.path.equals(sQLiteDatabaseConfiguration.path)) {
            this.openFlags = sQLiteDatabaseConfiguration.openFlags;
            this.maxSqlCacheSize = sQLiteDatabaseConfiguration.maxSqlCacheSize;
            this.locale = sQLiteDatabaseConfiguration.locale;
            this.foreignKeyConstraintsEnabled = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
            this.customWALHookEnabled = sQLiteDatabaseConfiguration.customWALHookEnabled;
            this.updateNotificationEnabled = sQLiteDatabaseConfiguration.updateNotificationEnabled;
            this.updateNotificationRowID = sQLiteDatabaseConfiguration.updateNotificationRowID;
            this.synchronousMode = sQLiteDatabaseConfiguration.synchronousMode;
            this.vfsName = sQLiteDatabaseConfiguration.vfsName;
            this.customFunctions.clear();
            this.customFunctions.addAll(sQLiteDatabaseConfiguration.customFunctions);
        } else {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
    }

    public SQLiteDatabaseConfiguration(String str, int i) {
        String str2;
        if (str != null) {
            this.path = str;
            this.label = str;
            this.openFlags = i;
            this.synchronousMode = 2;
            this.maxSqlCacheSize = 25;
            this.locale = Locale.getDefault();
            if ((i & 256) != 0) {
                str2 = "vfslog";
            } else {
                str2 = null;
            }
            this.vfsName = str2;
            return;
        }
        throw new IllegalArgumentException("path must not be null.");
    }
}
