package com.ss.android.downloadlib.core.download;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.downloadlib.core.download.j;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static UriMatcher f28997c;

    /* renamed from: d  reason: collision with root package name */
    private static final Uri[] f28998d = {j.a.f29029a};

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<String, String> f28999e;
    private static final Object g = new Object();
    private static g h;

    /* renamed from: a  reason: collision with root package name */
    protected q f29000a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f29001b;

    /* renamed from: f  reason: collision with root package name */
    private SQLiteOpenHelper f29002f;

    final class a extends SQLiteOpenHelper {
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            onUpgrade(sQLiteDatabase, 0, BaseLoginOrRegisterActivity.o);
        }

        private static void a(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ss_downloads");
                sQLiteDatabase.execSQL("CREATE TABLE ss_downloads(_id INTEGER PRIMARY KEY AUTOINCREMENT,uri TEXT, entity TEXT, no_integrity BOOLEAN, hint TEXT, _data TEXT, mimetype TEXT, destination INTEGER, visibility INTEGER, control INTEGER, status INTEGER, numfailed INTEGER, lastmod BIGINT, notificationpackage TEXT, notificationextras TEXT, cookiedata TEXT, useragent TEXT, referer TEXT, total_bytes INTEGER, current_bytes INTEGER, title TEXT, description TEXT, allow_roaming INTEGER NOT NULL DEFAULT 0, allowed_network_types INTEGER NOT NULL DEFAULT 0, is_visible_in_downloads_ui INTEGER NOT NULL DEFAULT 1, bypass_recommended_size_limit INTEGER NOT NULL DEFAULT 0, mediaprovider_uri TEXT, deleted BOOLEAN NOT NULL DEFAULT 0, errorMsg TEXT, allow_write BOOLEAN NOT NULL DEFAULT 0, etag TEXT, scanned INTEGER, method INTEGER);");
            } catch (SQLException e2) {
                throw e2;
            }
        }

        public a(Context context) {
            super(context, "ss_downloads.db", null, BaseLoginOrRegisterActivity.o);
        }

        private static void a(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            sQLiteDatabase.update("ss_downloads", contentValues, ((String) contentValues.valueSet().iterator().next().getKey()) + " is null", null);
            contentValues.clear();
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = 99;
            if (i >= 100 && i <= i2) {
                i3 = i;
            }
            while (true) {
                i3++;
                if (i3 <= i2) {
                    switch (i3) {
                        case 100:
                            a(sQLiteDatabase);
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS request_headers");
                            sQLiteDatabase.execSQL("CREATE TABLE request_headers(id INTEGER PRIMARY KEY AUTOINCREMENT,download_id INTEGER NOT NULL,header TEXT NOT NULL,value TEXT NOT NULL);");
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("is_visible_in_downloads_ui", Boolean.FALSE);
                            sQLiteDatabase.update("ss_downloads", contentValues, "destination != 0", null);
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("current_bytes", 0);
                            a(sQLiteDatabase, contentValues2);
                            contentValues2.put("total_bytes", -1);
                            a(sQLiteDatabase, contentValues2);
                            contentValues2.put(PushConstants.TITLE, "");
                            a(sQLiteDatabase, contentValues2);
                            contentValues2.put("description", "");
                            a(sQLiteDatabase, contentValues2);
                            break;
                        case BaseLoginOrRegisterActivity.o /*101*/:
                            sQLiteDatabase.execSQL("ALTER TABLE " + "ss_downloads" + " ADD COLUMN " + "time_cost" + " " + "INTEGER");
                            break;
                        default:
                            try {
                                throw new IllegalStateException("Don't know how to upgrade to " + i3);
                            } catch (Throwable unused) {
                                return;
                            }
                    }
                } else {
                    return;
                }
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public StringBuilder f29004a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f29005b;

        public final String a() {
            return this.f29004a.toString();
        }

        private b() {
            this.f29004a = new StringBuilder();
            this.f29005b = new ArrayList();
        }

        public final String[] b() {
            return (String[]) this.f29005b.toArray(new String[this.f29005b.size()]);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final <T> void a(String str, T... tArr) {
            if (str != null && !TextUtils.isEmpty(str)) {
                if (this.f29004a.length() != 0) {
                    this.f29004a.append(" AND ");
                }
                this.f29004a.append("(");
                this.f29004a.append(str);
                this.f29004a.append(")");
                if (tArr != null) {
                    for (T obj : tArr) {
                        this.f29005b.add(obj.toString());
                    }
                }
            }
        }
    }

    public final Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            SQLiteDatabase readableDatabase = this.f29002f.getReadableDatabase();
            int match = f28997c.match(uri);
            if (match == -1) {
                throw new IllegalArgumentException("Unknown URI: " + uri);
            } else if (match != 3) {
                b a2 = a(uri, str, strArr2, match);
                if (b.f28941d) {
                    a(strArr, str, strArr2, str2, readableDatabase);
                }
                Cursor query = readableDatabase.query("ss_downloads", strArr, a2.a(), a2.b(), null, null, str2);
                if (query != null) {
                    query.setNotificationUri(this.f29001b.getContentResolver(), uri);
                }
                return query;
            } else if (strArr == null && str == null && str2 == null) {
                return readableDatabase.query("request_headers", new String[]{"header", "value"}, "download_id=" + a(uri), null, null, null, null);
            } else {
                throw new UnsupportedOperationException("Request header queries do not support projections, selections or sorting");
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(String[] strArr, String str, String[] strArr2, String str2, SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("starting query, database is ");
        if (sQLiteDatabase != null) {
            sb.append("not ");
        }
        sb.append("null; ");
        if (strArr == null) {
            sb.append("projection is null; ");
        } else if (strArr.length == 0) {
            sb.append("projection is empty; ");
        } else {
            for (int i = 0; i < strArr.length; i++) {
                sb.append("projection[");
                sb.append(i);
                sb.append("] is ");
                sb.append(strArr[i]);
                sb.append("; ");
            }
        }
        sb.append("selection is ");
        sb.append(str);
        sb.append("; ");
        if (strArr2 == null) {
            sb.append("selectionArgs is null; ");
        } else if (strArr2.length == 0) {
            sb.append("selectionArgs is empty; ");
        } else {
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                sb.append("selectionArgs[");
                sb.append(i2);
                sb.append("] is ");
                sb.append(strArr2[i2]);
                sb.append("; ");
            }
        }
        sb.append("sort is ");
        sb.append(str2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|(0)|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069 A[SYNTHETIC, Splitter:B:28:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f A[SYNTHETIC, Splitter:B:34:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007a A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009d A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad A[Catch:{ Exception -> 0x00ef }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.net.Uri r16, android.content.ContentValues r17, java.lang.String r18, java.lang.String[] r19) {
        /*
            r15 = this;
            r7 = r15
            r0 = r16
            r8 = r17
            r9 = 0
            android.database.sqlite.SQLiteOpenHelper r1 = r7.f29002f     // Catch:{ Exception -> 0x00ef }
            android.database.sqlite.SQLiteDatabase r10 = r1.getWritableDatabase()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "deleted"
            boolean r1 = r8.containsKey(r1)     // Catch:{ Exception -> 0x00ef }
            r11 = 1
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "deleted"
            java.lang.Integer r1 = r8.getAsInteger(r1)     // Catch:{ Exception -> 0x00ef }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            if (r1 != r11) goto L_0x0023
            r12 = 1
            goto L_0x0024
        L_0x0023:
            r12 = 0
        L_0x0024:
            java.lang.String r1 = "_data"
            java.lang.String r13 = r8.getAsString(r1)     // Catch:{ Exception -> 0x00ef }
            if (r13 == 0) goto L_0x0072
            r14 = 0
            java.lang.String[] r3 = new java.lang.String[r11]     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            java.lang.String r1 = "title"
            r3[r9] = r1     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r15
            r2 = r16
            android.database.Cursor r1 = r1.a((android.net.Uri) r2, (java.lang.String[]) r3, (java.lang.String) r4, (java.lang.String[]) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = r1.getString(r9)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            if (r2 == 0) goto L_0x005b
        L_0x004d:
            java.lang.String r2 = "title"
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            r3.<init>(r13)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            r8.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
        L_0x005b:
            if (r1 == 0) goto L_0x0072
            r1.close()     // Catch:{ Exception -> 0x0072 }
            goto L_0x0072
        L_0x0061:
            r0 = move-exception
            goto L_0x0067
        L_0x0063:
            r14 = r1
            goto L_0x006d
        L_0x0065:
            r0 = move-exception
            r1 = r14
        L_0x0067:
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            throw r0     // Catch:{ Exception -> 0x00ef }
        L_0x006d:
            if (r14 == 0) goto L_0x0072
            r14.close()     // Catch:{ Exception -> 0x0072 }
        L_0x0072:
            java.lang.String r1 = "status"
            java.lang.Integer r1 = r8.getAsInteger(r1)     // Catch:{ Exception -> 0x00ef }
            if (r1 == 0) goto L_0x0094
            int r2 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            r3 = 190(0xbe, float:2.66E-43)
            if (r2 == r3) goto L_0x0092
            int r2 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            r3 = 201(0xc9, float:2.82E-43)
            if (r2 == r3) goto L_0x0092
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            r2 = 193(0xc1, float:2.7E-43)
            if (r1 != r2) goto L_0x0094
        L_0x0092:
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            java.lang.String r2 = "bypass_recommended_size_limit"
            boolean r2 = r8.containsKey(r2)     // Catch:{ Exception -> 0x00ef }
            if (r1 != 0) goto L_0x00a1
            if (r2 == 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r11 = r12
        L_0x00a1:
            android.content.UriMatcher r1 = f28997c     // Catch:{ Exception -> 0x00ef }
            int r1 = r1.match(r0)     // Catch:{ Exception -> 0x00ef }
            switch(r1) {
                case 1: goto L_0x00ad;
                case 2: goto L_0x00ad;
                default: goto L_0x00aa;
            }     // Catch:{ Exception -> 0x00ef }
        L_0x00aa:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x00ef }
            goto L_0x00dd
        L_0x00ad:
            r2 = r18
            r3 = r19
            com.ss.android.downloadlib.core.download.g$b r2 = r15.a((android.net.Uri) r0, (java.lang.String) r2, (java.lang.String[]) r3, (int) r1)     // Catch:{ Exception -> 0x00ef }
            int r3 = r17.size()     // Catch:{ Exception -> 0x00ef }
            if (r3 <= 0) goto L_0x00ca
            java.lang.String r3 = "ss_downloads"
            java.lang.String r4 = r2.a()     // Catch:{ Exception -> 0x00ef }
            java.lang.String[] r2 = r2.b()     // Catch:{ Exception -> 0x00ef }
            int r2 = r10.update(r3, r8, r4, r2)     // Catch:{ Exception -> 0x00ef }
            goto L_0x00cb
        L_0x00ca:
            r2 = 0
        L_0x00cb:
            r15.a((android.net.Uri) r0, (int) r1)     // Catch:{ Exception -> 0x00ef }
            if (r11 == 0) goto L_0x00dc
            android.content.Context r0 = r7.f29001b     // Catch:{ Exception -> 0x00ef }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x00dc }
            java.lang.Class<com.ss.android.downloadlib.core.download.DownloadService> r3 = com.ss.android.downloadlib.core.download.DownloadService.class
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x00dc }
            r0.startService(r1)     // Catch:{ Exception -> 0x00dc }
        L_0x00dc:
            return r2
        L_0x00dd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ef }
            java.lang.String r3 = "Cannot update URI: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x00ef }
            r2.append(r0)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00ef }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00ef }
            throw r1     // Catch:{ Exception -> 0x00ef }
        L_0x00ef:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.g.a(android.net.Uri, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|(2:21|22)|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.net.Uri r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            r12 = this;
            r0 = 0
            android.database.sqlite.SQLiteOpenHelper r1 = r12.f29002f     // Catch:{ Exception -> 0x0086 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Exception -> 0x0086 }
            android.content.UriMatcher r2 = f28997c     // Catch:{ Exception -> 0x0086 }
            int r11 = r2.match(r13)     // Catch:{ Exception -> 0x0086 }
            switch(r11) {
                case 1: goto L_0x0013;
                case 2: goto L_0x0013;
                default: goto L_0x0010;
            }     // Catch:{ Exception -> 0x0086 }
        L_0x0010:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0086 }
            goto L_0x0074
        L_0x0013:
            com.ss.android.downloadlib.core.download.g$b r14 = r12.a((android.net.Uri) r13, (java.lang.String) r14, (java.lang.String[]) r15, (int) r11)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r5 = r14.a()     // Catch:{ Exception -> 0x0086 }
            java.lang.String[] r6 = r14.b()     // Catch:{ Exception -> 0x0086 }
            r15 = 1
            java.lang.String[] r4 = new java.lang.String[r15]     // Catch:{ Exception -> 0x0086 }
            java.lang.String r15 = "_id"
            r4[r0] = r15     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = "ss_downloads"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r1
            android.database.Cursor r15 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0086 }
            r15.moveToFirst()     // Catch:{ all -> 0x006d }
        L_0x0034:
            boolean r2 = r15.isAfterLast()     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x0056
            long r2 = r15.getLong(r0)     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            java.lang.String r5 = "download_id="
            r4.<init>(r5)     // Catch:{ all -> 0x006d }
            r4.append(r2)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "request_headers"
            r4 = 0
            r1.delete(r3, r2, r4)     // Catch:{ all -> 0x006d }
            r15.moveToNext()     // Catch:{ all -> 0x006d }
            goto L_0x0034
        L_0x0056:
            if (r15 == 0) goto L_0x005b
            r15.close()     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            java.lang.String r15 = "ss_downloads"
            java.lang.String r2 = r14.a()     // Catch:{ Exception -> 0x0086 }
            java.lang.String[] r14 = r14.b()     // Catch:{ Exception -> 0x0086 }
            int r14 = r1.delete(r15, r2, r14)     // Catch:{ Exception -> 0x0086 }
            r12.a((android.net.Uri) r13, (int) r11)     // Catch:{ Exception -> 0x0086 }
            return r14
        L_0x006d:
            r13 = move-exception
            if (r15 == 0) goto L_0x0073
            r15.close()     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            throw r13     // Catch:{ Exception -> 0x0086 }
        L_0x0074:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086 }
            java.lang.String r1 = "Cannot delete URI: "
            r15.<init>(r1)     // Catch:{ Exception -> 0x0086 }
            r15.append(r13)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r13 = r15.toString()     // Catch:{ Exception -> 0x0086 }
            r14.<init>(r13)     // Catch:{ Exception -> 0x0086 }
            throw r14     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.g.a(android.net.Uri, java.lang.String, java.lang.String[]):int");
    }

    private static final void a(String str, ContentValues contentValues, ContentValues contentValues2, String str2) {
        c(str, contentValues, contentValues2);
        if (!contentValues2.containsKey(str)) {
            contentValues2.put(str, str2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:40|41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x018f, code lost:
        throw new java.lang.SecurityException("Problem resolving path: " + r8);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x017c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0297 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri a(android.net.Uri r14, android.content.ContentValues r15) {
        /*
            r13 = this;
            android.content.Context r0 = r13.f29001b
            java.lang.String r1 = "android.permission.INTERNET"
            java.lang.String r2 = "INTERNET permission is required to use the download manager"
            r0.enforceCallingOrSelfPermission(r1, r2)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>(r15)
            java.lang.String r1 = "destination"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r3[r5] = r4
            a((android.content.ContentValues) r0, (java.lang.String) r1, (java.lang.Object[]) r3)
            java.lang.String r1 = "visibility"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r2] = r4
            r4 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r7 = 2
            r3[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r3[r4] = r6
            a((android.content.ContentValues) r0, (java.lang.String) r1, (java.lang.Object[]) r3)
            java.lang.String r1 = "uri"
            r0.remove(r1)
            java.lang.String r1 = "title"
            r0.remove(r1)
            java.lang.String r1 = "description"
            r0.remove(r1)
            java.lang.String r1 = "mimetype"
            r0.remove(r1)
            java.lang.String r1 = "hint"
            r0.remove(r1)
            java.lang.String r1 = "notificationpackage"
            r0.remove(r1)
            java.lang.String r1 = "allowed_network_types"
            r0.remove(r1)
            java.lang.String r1 = "allow_roaming"
            r0.remove(r1)
            java.lang.String r1 = "is_visible_in_downloads_ui"
            r0.remove(r1)
            java.lang.String r1 = "scanned"
            r0.remove(r1)
            java.lang.String r1 = "allow_write"
            r0.remove(r1)
            java.lang.String r1 = "InExternalPublicDir"
            r0.remove(r1)
            java.util.Set r1 = r0.valueSet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "http_header_"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x0083
            r1.remove()
            goto L_0x0083
        L_0x00a1:
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x00d6
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Invalid columns in request: "
            r14.<init>(r15)
            java.util.Set r15 = r0.valueSet()
            java.util.Iterator r15 = r15.iterator()
        L_0x00b6:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r14.append(r0)
            goto L_0x00b6
        L_0x00cc:
            java.lang.SecurityException r15 = new java.lang.SecurityException
            java.lang.String r14 = r14.toString()
            r15.<init>(r14)
            throw r15
        L_0x00d6:
            r0 = 0
            android.database.sqlite.SQLiteOpenHelper r1 = r13.f29002f     // Catch:{ Exception -> 0x02b2 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Exception -> 0x02b2 }
            android.content.UriMatcher r3 = f28997c     // Catch:{ Exception -> 0x02b2 }
            int r3 = r3.match(r14)     // Catch:{ Exception -> 0x02b2 }
            if (r3 != r2) goto L_0x029e
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ Exception -> 0x02b2 }
            r4.<init>()     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r6 = "uri"
            c(r6, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r6 = "entity"
            c(r6, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r6 = "no_integrity"
            b(r6, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r6 = "hint"
            c(r6, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r6 = "mimetype"
            c(r6, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r6 = "destination"
            java.lang.Integer r6 = r15.getAsInteger(r6)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r8 = "InExternalPublicDir"
            java.lang.Integer r8 = r15.getAsInteger(r8)     // Catch:{ Exception -> 0x02b2 }
            if (r6 == 0) goto L_0x01c5
            int r9 = r6.intValue()     // Catch:{ Exception -> 0x02b2 }
            if (r9 != r2) goto L_0x01c0
            if (r8 == 0) goto L_0x0130
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x02b2 }
            if (r8 <= 0) goto L_0x0130
            android.content.Context r8 = r13.f29001b     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r9 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r10 = android.os.Binder.getCallingPid()     // Catch:{ Exception -> 0x02b2 }
            int r11 = android.os.Binder.getCallingUid()     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r12 = "need WRITE_EXTERNAL_STORAGE permission to use DESTINATION_FILE_URI"
            r8.enforcePermission(r9, r10, r11, r12)     // Catch:{ Exception -> 0x02b2 }
        L_0x0130:
            java.lang.String r8 = "hint"
            java.lang.String r8 = r15.getAsString(r8)     // Catch:{ Exception -> 0x02b2 }
            if (r8 == 0) goto L_0x01b8
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r9 = r8.getScheme()     // Catch:{ Exception -> 0x02b2 }
            if (r9 == 0) goto L_0x01a4
            java.lang.String r10 = "file"
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x02b2 }
            if (r9 == 0) goto L_0x01a4
            java.lang.String r9 = r8.getPath()     // Catch:{ Exception -> 0x02b2 }
            if (r9 == 0) goto L_0x0190
            java.io.File r10 = new java.io.File     // Catch:{ IOException -> 0x017c }
            r10.<init>(r9)     // Catch:{ IOException -> 0x017c }
            java.lang.String r9 = r10.getCanonicalPath()     // Catch:{ IOException -> 0x017c }
            java.io.File r10 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x017c }
            java.lang.String r10 = r10.getAbsolutePath()     // Catch:{ IOException -> 0x017c }
            boolean r9 = r9.startsWith(r10)     // Catch:{ IOException -> 0x017c }
            if (r9 == 0) goto L_0x0168
            goto L_0x01c0
        L_0x0168:
            java.lang.SecurityException r14 = new java.lang.SecurityException     // Catch:{ IOException -> 0x017c }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017c }
            java.lang.String r1 = "Destination must be on external storage: "
            r15.<init>(r1)     // Catch:{ IOException -> 0x017c }
            r15.append(r8)     // Catch:{ IOException -> 0x017c }
            java.lang.String r15 = r15.toString()     // Catch:{ IOException -> 0x017c }
            r14.<init>(r15)     // Catch:{ IOException -> 0x017c }
            throw r14     // Catch:{ IOException -> 0x017c }
        L_0x017c:
            java.lang.SecurityException r14 = new java.lang.SecurityException     // Catch:{ Exception -> 0x02b2 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r1 = "Problem resolving path: "
            r15.<init>(r1)     // Catch:{ Exception -> 0x02b2 }
            r15.append(r8)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x02b2 }
            r14.<init>(r15)     // Catch:{ Exception -> 0x02b2 }
            throw r14     // Catch:{ Exception -> 0x02b2 }
        L_0x0190:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x02b2 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r1 = "Invalid file URI: "
            r15.<init>(r1)     // Catch:{ Exception -> 0x02b2 }
            r15.append(r8)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x02b2 }
            r14.<init>(r15)     // Catch:{ Exception -> 0x02b2 }
            throw r14     // Catch:{ Exception -> 0x02b2 }
        L_0x01a4:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x02b2 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r1 = "Not a file URI: "
            r15.<init>(r1)     // Catch:{ Exception -> 0x02b2 }
            r15.append(r8)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x02b2 }
            r14.<init>(r15)     // Catch:{ Exception -> 0x02b2 }
            throw r14     // Catch:{ Exception -> 0x02b2 }
        L_0x01b8:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r15 = "DESTINATION_FILE_URI must include a file URI under COLUMN_FILE_NAME_HINT"
            r14.<init>(r15)     // Catch:{ Exception -> 0x02b2 }
            throw r14     // Catch:{ Exception -> 0x02b2 }
        L_0x01c0:
            java.lang.String r8 = "destination"
            r4.put(r8, r6)     // Catch:{ Exception -> 0x02b2 }
        L_0x01c5:
            java.lang.String r8 = "visibility"
            java.lang.Integer r8 = r15.getAsInteger(r8)     // Catch:{ Exception -> 0x02b2 }
            if (r8 != 0) goto L_0x01e7
            int r8 = r6.intValue()     // Catch:{ Exception -> 0x02b2 }
            if (r8 != 0) goto L_0x01dd
            java.lang.String r7 = "visibility"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x02b2 }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x02b2 }
            goto L_0x01ec
        L_0x01dd:
            java.lang.String r8 = "visibility"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x02b2 }
            r4.put(r8, r7)     // Catch:{ Exception -> 0x02b2 }
            goto L_0x01ec
        L_0x01e7:
            java.lang.String r7 = "visibility"
            r4.put(r7, r8)     // Catch:{ Exception -> 0x02b2 }
        L_0x01ec:
            java.lang.String r7 = "control"
            a((java.lang.String) r7, (android.content.ContentValues) r15, (android.content.ContentValues) r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = "status"
            r8 = 190(0xbe, float:2.66E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x02b2 }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = "total_bytes"
            r8 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x02b2 }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = "current_bytes"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x02b2 }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x02b2 }
            com.ss.android.downloadlib.core.download.q r7 = r13.f29000a     // Catch:{ Exception -> 0x02b2 }
            long r7 = r7.a()     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r9 = "lastmod"
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x02b2 }
            r4.put(r9, r7)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = "notificationpackage"
            java.lang.String r7 = r15.getAsString(r7)     // Catch:{ Exception -> 0x02b2 }
            if (r7 == 0) goto L_0x022b
            java.lang.String r8 = "notificationpackage"
            r4.put(r8, r7)     // Catch:{ Exception -> 0x02b2 }
        L_0x022b:
            java.lang.String r7 = "notificationextras"
            c(r7, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = "cookiedata"
            c(r7, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = "useragent"
            c(r7, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = "referer"
            c(r7, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = "title"
            java.lang.String r8 = ""
            a((java.lang.String) r7, (android.content.ContentValues) r15, (android.content.ContentValues) r4, (java.lang.String) r8)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = "description"
            java.lang.String r8 = ""
            a((java.lang.String) r7, (android.content.ContentValues) r15, (android.content.ContentValues) r4, (java.lang.String) r8)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = "is_visible_in_downloads_ui"
            boolean r7 = r15.containsKey(r7)     // Catch:{ Exception -> 0x02b2 }
            if (r7 == 0) goto L_0x025b
            java.lang.String r2 = "is_visible_in_downloads_ui"
            b(r2, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            goto L_0x026e
        L_0x025b:
            if (r6 == 0) goto L_0x0265
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x02b2 }
            if (r6 != 0) goto L_0x0264
            goto L_0x0265
        L_0x0264:
            r2 = 0
        L_0x0265:
            java.lang.String r5 = "is_visible_in_downloads_ui"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x02b2 }
            r4.put(r5, r2)     // Catch:{ Exception -> 0x02b2 }
        L_0x026e:
            java.lang.String r2 = "allowed_network_types"
            a((java.lang.String) r2, (android.content.ContentValues) r15, (android.content.ContentValues) r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r2 = "allow_roaming"
            b(r2, r15, r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r2 = "ss_downloads"
            long r4 = r1.insert(r2, r0, r4)     // Catch:{ Exception -> 0x02b2 }
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0285
            return r0
        L_0x0285:
            a((android.database.sqlite.SQLiteDatabase) r1, (long) r4, (android.content.ContentValues) r15)     // Catch:{ Exception -> 0x02b2 }
            r13.a((android.net.Uri) r14, (int) r3)     // Catch:{ Exception -> 0x02b2 }
            android.content.Context r14 = r13.f29001b     // Catch:{ Exception -> 0x02b2 }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x0297 }
            java.lang.Class<com.ss.android.downloadlib.core.download.DownloadService> r1 = com.ss.android.downloadlib.core.download.DownloadService.class
            r15.<init>(r14, r1)     // Catch:{ Exception -> 0x0297 }
            r14.startService(r15)     // Catch:{ Exception -> 0x0297 }
        L_0x0297:
            android.net.Uri r14 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ Exception -> 0x02b2 }
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r14, r4)     // Catch:{ Exception -> 0x02b2 }
            return r14
        L_0x029e:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x02b2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r2 = "Unknown/Invalid URI "
            r1.<init>(r2)     // Catch:{ Exception -> 0x02b2 }
            r1.append(r14)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r14 = r1.toString()     // Catch:{ Exception -> 0x02b2 }
            r15.<init>(r14)     // Catch:{ Exception -> 0x02b2 }
            throw r15     // Catch:{ Exception -> 0x02b2 }
        L_0x02b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.g.a(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    static {
        a();
        HashMap<String, String> hashMap = new HashMap<>();
        f28999e = hashMap;
        hashMap.put("_display_name", "title AS _display_name");
        f28999e.put("_size", "total_bytes AS _size");
    }

    public static void a() {
        try {
            UriMatcher uriMatcher = new UriMatcher(-1);
            f28997c = uriMatcher;
            uriMatcher.addURI(j.f29028a, "all_downloads", 1);
            f28997c.addURI(j.f29028a, "all_downloads/#", 2);
            f28997c.addURI(j.f29028a, "all_downloads/#/headers", 3);
            f28997c.addURI(j.f29028a, "download/#/headers", 3);
        } catch (Exception unused) {
        }
    }

    private static String a(Uri uri) {
        return uri.getPathSegments().get(1);
    }

    private g(Context context) {
        this.f29001b = context;
        if (this.f29000a == null) {
            this.f29000a = n.a(context);
        }
        this.f29002f = new a(context);
        try {
            context.startService(new Intent(context, DownloadService.class));
        } catch (Exception unused) {
        }
    }

    public static g a(Context context) {
        synchronized (g) {
            if (h == null) {
                h = new g(context.getApplicationContext());
            }
        }
        return h;
    }

    private void a(Uri uri, int i) {
        Long l;
        if (i == 2) {
            l = Long.valueOf(Long.parseLong(a(uri)));
        } else {
            l = null;
        }
        for (Uri uri2 : f28998d) {
            if (l != null) {
                uri2 = ContentUris.withAppendedId(uri2, l.longValue());
            }
            this.f29001b.getContentResolver().notifyChange(uri2, null);
        }
    }

    private static final void b(String str, ContentValues contentValues, ContentValues contentValues2) {
        Boolean asBoolean = contentValues.getAsBoolean(str);
        if (asBoolean != null) {
            contentValues2.put(str, asBoolean);
        }
    }

    private static final void c(String str, ContentValues contentValues, ContentValues contentValues2) {
        String asString = contentValues.getAsString(str);
        if (asString != null) {
            contentValues2.put(str, asString);
        }
    }

    private static void a(ContentValues contentValues, String str, Object... objArr) {
        Object obj = contentValues.get(str);
        contentValues.remove(str);
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj2 = objArr[i];
            if (obj != null || obj2 != null) {
                if (obj == null || !obj.equals(obj2)) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        throw new SecurityException("Invalid value for " + str + ": " + obj);
    }

    private static void a(SQLiteDatabase sQLiteDatabase, long j, ContentValues contentValues) {
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("download_id", Long.valueOf(j));
        for (Map.Entry next : contentValues.valueSet()) {
            if (((String) next.getKey()).startsWith("http_header_")) {
                String obj = next.getValue().toString();
                if (obj.contains(":")) {
                    String[] split = obj.split(":", 2);
                    contentValues2.put("header", split[0].trim());
                    contentValues2.put("value", split[1].trim());
                    sQLiteDatabase.insert("request_headers", null, contentValues2);
                } else {
                    throw new IllegalArgumentException("Invalid HTTP header line: " + obj);
                }
            }
        }
    }

    private static final void a(String str, ContentValues contentValues, ContentValues contentValues2) {
        Integer asInteger = contentValues.getAsInteger(str);
        if (asInteger != null) {
            contentValues2.put(str, asInteger);
        }
    }

    private b a(Uri uri, String str, String[] strArr, int i) {
        b bVar = new b((byte) 0);
        bVar.a(str, strArr);
        if (i == 2) {
            bVar.a("_id = ?", a(uri));
        }
        return bVar;
    }
}
