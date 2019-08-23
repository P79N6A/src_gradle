package android.arch.persistence.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import java.io.File;

public interface SupportSQLiteOpenHelper {

    public static abstract class Callback {
        public final int version;

        public void onConfigure(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public abstract void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        public Callback(int i) {
            this.version = i;
        }

        private void deleteDatabaseFile(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } else {
                        try {
                            new File(str).delete();
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r0 != null) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            if (r3.hasNext() != false) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
            deleteDatabaseFile((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
            deleteDatabaseFile(r3.getPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0017 */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[ExcHandler: all (r1v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v8 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v1 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x000f, B:9:0x0017, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x000f] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCorruption(android.arch.persistence.db.SupportSQLiteDatabase r3) {
            /*
                r2 = this;
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x000e
                java.lang.String r3 = r3.getPath()
                r2.deleteDatabaseFile(r3)
                return
            L_0x000e:
                r0 = 0
                java.util.List r1 = r3.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0017, all -> 0x0015 }
                r0 = r1
                goto L_0x0017
            L_0x0015:
                r1 = move-exception
                goto L_0x001b
            L_0x0017:
                r3.close()     // Catch:{ IOException -> 0x003d, all -> 0x0015 }
                goto L_0x003d
            L_0x001b:
                if (r0 == 0) goto L_0x0035
                java.util.Iterator r3 = r0.iterator()
            L_0x0021:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x003c
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.deleteDatabaseFile(r0)
                goto L_0x0021
            L_0x0035:
                java.lang.String r3 = r3.getPath()
                r2.deleteDatabaseFile(r3)
            L_0x003c:
                throw r1
            L_0x003d:
                if (r0 == 0) goto L_0x0058
                java.util.Iterator r3 = r0.iterator()
            L_0x0043:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0057
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.deleteDatabaseFile(r0)
                goto L_0x0043
            L_0x0057:
                return
            L_0x0058:
                java.lang.String r3 = r3.getPath()
                r2.deleteDatabaseFile(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.arch.persistence.db.SupportSQLiteOpenHelper.Callback.onCorruption(android.arch.persistence.db.SupportSQLiteDatabase):void");
        }

        public void onDowngrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }
    }

    public static class Configuration {
        @NonNull
        public final Callback callback;
        @NonNull
        public final Context context;
        @Nullable
        public final String name;

        public static class Builder {
            Callback mCallback;
            Context mContext;
            String mName;

            public Configuration build() {
                if (this.mCallback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.mContext != null) {
                    return new Configuration(this.mContext, this.mName, this.mCallback);
                } else {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
            }

            public Builder callback(@NonNull Callback callback) {
                this.mCallback = callback;
                return this;
            }

            public Builder name(@Nullable String str) {
                this.mName = str;
                return this;
            }

            Builder(@NonNull Context context) {
                this.mContext = context;
            }
        }

        public static Builder builder(Context context2) {
            return new Builder(context2);
        }

        Configuration(@NonNull Context context2, @Nullable String str, @NonNull Callback callback2) {
            this.context = context2;
            this.name = str;
            this.callback = callback2;
        }
    }

    public interface Factory {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);
}
