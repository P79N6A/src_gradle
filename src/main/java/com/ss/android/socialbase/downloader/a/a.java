package com.ss.android.socialbase.downloader.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ss.android.socialbase.downloader.downloader.b;
import java.io.File;

public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f30802a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f30803b = false;

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private a() {
        super(b.q(), "downloader.db", null, 9);
    }

    public static a a() {
        if (f30802a == null) {
            synchronized (a.class) {
                if (f30802a == null) {
                    f30802a = new a();
                }
            }
        }
        return f30802a;
    }

    public SQLiteDatabase getReadableDatabase() {
        Context q = b.q();
        if (this.f30803b || q == null) {
            return super.getReadableDatabase();
        }
        try {
            File file = new File("/data/data/" + q.getPackageName() + "/database/main/");
            if (!file.exists()) {
                file.mkdir();
            }
            super.getReadableDatabase().execSQL("PRAGMA temp_store_directory = tempDir");
            this.f30803b = true;
        } catch (Exception unused) {
        }
        return super.getReadableDatabase();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloader( _id INTEGER PRIMARY KEY, url TEXT, savePath TEXT, tempPath TEXT, name TEXT, chunkCount INTEGER, status INTEGER, curBytes INTEGER, totalBytes INTEGER, eTag TEXT, onlyWifi INTEGER, force INTEGER, retryCount INTEGER, extra TEXT, mimeType TEXT, title TEXT, notificationEnable INTEGER, notificationVisibility INTEGER, isFirstDownload INTEGER, isFirstSuccess INTEGER, needHttpsToHttpRetry INTEGER, downloadTime INTEGER, packageName TEXT, md5 TEXT, retryDelay INTEGER, curRetryTime INTEGER, retryDelayStatus INTEGER, defaultHttpServiceBackUp INTEGER, chunkRunnableReuse INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloadChunk( _id INTEGER, chunkIndex INTEGER, startOffset INTEGER, curOffset INTEGER, endOffset INTEGER, chunkContentLen INTEGER, hostChunkIndex INTEGER )");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r1.execSQL("ALTER TABLE downloader ADD isFirstDownload INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        r1.execSQL("ALTER TABLE downloader ADD isFirstSuccess INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        r1.execSQL("ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD downloadTime INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        r1.execSQL("ALTER TABLE downloader ADD packageName TEXT");
        r1.execSQL("ALTER TABLE downloader ADD md5 TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
        r1.execSQL("ALTER TABLE downloader ADD retryDelay INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD curRetryTime INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD retryDelayStatus INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        r1.execSQL("ALTER TABLE downloadChunk ADD chunkContentLen INTEGER");
        r1.execSQL("ALTER TABLE downloadChunk ADD hostChunkIndex INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        r1.execSQL("ALTER TABLE downloader ADD chunkRunnableReuse INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
        /*
            r0 = this;
            switch(r2) {
                case 1: goto L_0x0004;
                case 2: goto L_0x0018;
                case 3: goto L_0x001d;
                case 4: goto L_0x0022;
                case 5: goto L_0x002c;
                case 6: goto L_0x0036;
                case 7: goto L_0x004a;
                case 8: goto L_0x0054;
                default: goto L_0x0003;
            }
        L_0x0003:
            goto L_0x0059
        L_0x0004:
            java.lang.String r2 = "ALTER TABLE downloader ADD mimeType TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD title TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD notificationEnable INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD notificationVisibility INTEGER"
            r1.execSQL(r2)
        L_0x0018:
            java.lang.String r2 = "ALTER TABLE downloader ADD isFirstDownload INTEGER"
            r1.execSQL(r2)
        L_0x001d:
            java.lang.String r2 = "ALTER TABLE downloader ADD isFirstSuccess INTEGER"
            r1.execSQL(r2)
        L_0x0022:
            java.lang.String r2 = "ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD downloadTime INTEGER"
            r1.execSQL(r2)
        L_0x002c:
            java.lang.String r2 = "ALTER TABLE downloader ADD packageName TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD md5 TEXT"
            r1.execSQL(r2)
        L_0x0036:
            java.lang.String r2 = "ALTER TABLE downloader ADD retryDelay INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD curRetryTime INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD retryDelayStatus INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER"
            r1.execSQL(r2)
        L_0x004a:
            java.lang.String r2 = "ALTER TABLE downloadChunk ADD chunkContentLen INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloadChunk ADD hostChunkIndex INTEGER"
            r1.execSQL(r2)
        L_0x0054:
            java.lang.String r2 = "ALTER TABLE downloader ADD chunkRunnableReuse INTEGER"
            r1.execSQL(r2)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.a.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
