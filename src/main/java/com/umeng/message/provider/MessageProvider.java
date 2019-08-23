package com.umeng.message.provider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public class MessageProvider extends ContentProvider {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f81319a = "MessageProvider";

    /* renamed from: b  reason: collision with root package name */
    private static final UriMatcher f81320b = new UriMatcher(-1);
    private static Context q;

    /* renamed from: c  reason: collision with root package name */
    private a f81321c;

    /* renamed from: d  reason: collision with root package name */
    private SQLiteDatabase f81322d;

    /* renamed from: e  reason: collision with root package name */
    private b f81323e;

    /* renamed from: f  reason: collision with root package name */
    private SQLiteDatabase f81324f;

    class a extends SQLiteOpenHelper {
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS MessageStore(_id Integer  PRIMARY KEY  AUTOINCREMENT  , MsdId Varchar  , Json Varchar  , SdkVersion Varchar  , ArrivalTime Long  , ActionType Integer )");
            sQLiteDatabase.execSQL("create table if not exists MsgTemp(id INTEGER AUTO_INCREMENT,tempkey varchar default NULL, tempvalue varchar default NULL,PRIMARY KEY(id))");
            sQLiteDatabase.execSQL("create table if not exists MsgAlias(time long,type varchar default NULL,alias varchar default NULL,exclusive int,error int,message varchar,PRIMARY KEY(time))");
        }

        public a(Context context) {
            super(context, "MessageStore.db", null, 3);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i <= 2) {
                sQLiteDatabase.execSQL("drop table MsgTemp");
            }
            onCreate(sQLiteDatabase);
        }
    }

    class b extends SQLiteOpenHelper {
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("create table if not exists MsgLogStore (MsgId varchar, ActionType Integer, Time long, pa varchar, PRIMARY KEY(MsgId, ActionType))");
            sQLiteDatabase.execSQL("create table if not exists MsgLogIdTypeStore (MsgId varchar, MsgType varchar, PRIMARY KEY(MsgId))");
            sQLiteDatabase.execSQL("create table if not exists MsgLogStoreForAgoo (MsgId varchar, TaskId varchar, MsgStatus varchar, Time long, PRIMARY KEY(MsgId, MsgStatus))");
            sQLiteDatabase.execSQL("create table if not exists MsgLogIdTypeStoreForAgoo (MsgId varchar, TaskId varchar, MsgStatus varchar, PRIMARY KEY(MsgId))");
            sQLiteDatabase.execSQL("create table if not exists MsgConfigInfo (SerialNo integer default 1, AppLaunchAt long default 0, UpdateResponse varchar default NULL)");
            sQLiteDatabase.execSQL("create table if not exists InAppLogStore (Time long, MsgId varchar, MsgType Integer, NumDisplay Integer, NumOpenFull Integer, NumOpenTop Integer, NumOpenBottom Integer, NumClose Integer, NumDuration Integer, NumCustom Integer, PRIMARY KEY(Time))");
        }

        public b(Context context) {
            super(context, "MsgLogStore.db", null, 7);
        }

        private boolean a(SQLiteDatabase sQLiteDatabase, String str) {
            boolean z = false;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select count(*) as c from sqlite_master where type = 'table' and name = '" + str.trim() + "'", null);
                if (rawQuery.moveToNext() && rawQuery.getInt(0) > 0) {
                    z = true;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (Exception unused) {
            }
            return z;
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i <= 4) {
                sQLiteDatabase.execSQL("drop table MsgConfigInfo");
            }
            if (i <= 5) {
                sQLiteDatabase.execSQL("ALTER TABLE MsgLogStore ADD COLUMN pa varchar");
            }
            if (i <= 6 && a(sQLiteDatabase, "InAppLogStore")) {
                sQLiteDatabase.execSQL("ALTER TABLE InAppLogStore ADD COLUMN NumCustom Integer");
            }
            onCreate(sQLiteDatabase);
        }
    }

    private void b() {
        try {
            synchronized (this) {
                this.f81321c = new a(getContext());
                this.f81323e = new b(getContext());
                if (this.f81322d == null) {
                    this.f81322d = this.f81321c.getWritableDatabase();
                }
                if (this.f81324f == null) {
                    this.f81324f = this.f81323e.getWritableDatabase();
                }
            }
        } catch (Exception unused) {
        }
    }

    public boolean onCreate() {
        q = getContext();
        b();
        UriMatcher uriMatcher = f81320b;
        a.a(q);
        uriMatcher.addURI(a.f81327a, "MessageStores", 1);
        UriMatcher uriMatcher2 = f81320b;
        a.a(q);
        uriMatcher2.addURI(a.f81327a, "MsgTemps", 2);
        UriMatcher uriMatcher3 = f81320b;
        a.a(q);
        uriMatcher3.addURI(a.f81327a, "MsgAlias", 3);
        UriMatcher uriMatcher4 = f81320b;
        a.a(q);
        uriMatcher4.addURI(a.f81327a, "MsgAliasDeleteAll", 4);
        UriMatcher uriMatcher5 = f81320b;
        a.a(q);
        uriMatcher5.addURI(a.f81327a, "MsgLogStores", 5);
        UriMatcher uriMatcher6 = f81320b;
        a.a(q);
        uriMatcher6.addURI(a.f81327a, "MsgLogIdTypeStores", 6);
        UriMatcher uriMatcher7 = f81320b;
        a.a(q);
        uriMatcher7.addURI(a.f81327a, "MsgLogStoreForAgoos", 7);
        UriMatcher uriMatcher8 = f81320b;
        a.a(q);
        uriMatcher8.addURI(a.f81327a, "MsgLogIdTypeStoreForAgoos", 8);
        UriMatcher uriMatcher9 = f81320b;
        a.a(q);
        uriMatcher9.addURI(a.f81327a, "MsgConfigInfos", 9);
        UriMatcher uriMatcher10 = f81320b;
        a.a(q);
        uriMatcher10.addURI(a.f81327a, "InAppLogStores", 10);
        return true;
    }

    public String getType(Uri uri) {
        switch (f81320b.match(uri)) {
            case 1:
            case 2:
            case 3:
            case 5:
            case e.l:
            case 8:
            case 9:
                return "vnd.android.cursor.dir/vnd.umeng.message";
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public android.content.ContentProviderResult[] applyBatch(java.util.ArrayList<android.content.ContentProviderOperation> r6) throws android.content.OperationApplicationException {
        /*
            r5 = this;
            android.database.sqlite.SQLiteDatabase r0 = r5.f81324f
            r0.beginTransaction()
            r0 = 0
            android.content.ContentProviderResult[] r1 = super.applyBatch(r6)     // Catch:{ all -> 0x0044 }
            android.database.sqlite.SQLiteDatabase r2 = r5.f81324f     // Catch:{ all -> 0x0044 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0044 }
            android.database.sqlite.SQLiteDatabase r2 = r5.f81324f
            r2.endTransaction()
            java.util.Iterator r6 = r6.iterator()
            r2 = r0
        L_0x0019:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0043
            java.lang.Object r3 = r6.next()
            android.content.ContentProviderOperation r3 = (android.content.ContentProviderOperation) r3
            android.net.Uri r4 = r3.getUri()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0019
            android.net.Uri r2 = r3.getUri()
            android.content.Context r4 = r5.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            android.net.Uri r3 = r3.getUri()
            r4.notifyChange(r3, r0)
            goto L_0x0019
        L_0x0043:
            return r1
        L_0x0044:
            r1 = move-exception
            android.database.sqlite.SQLiteDatabase r2 = r5.f81324f
            r2.endTransaction()
            java.util.Iterator r6 = r6.iterator()
            r2 = r0
        L_0x004f:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r6.next()
            android.content.ContentProviderOperation r3 = (android.content.ContentProviderOperation) r3
            android.net.Uri r4 = r3.getUri()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x004f
            android.net.Uri r2 = r3.getUri()
            android.content.Context r4 = r5.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            android.net.Uri r3 = r3.getUri()
            r4.notifyChange(r3, r0)
            goto L_0x004f
        L_0x0079:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.provider.MessageProvider.applyBatch(java.util.ArrayList):android.content.ContentProviderResult[]");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        switch (f81320b.match(uri)) {
            case 1:
                long insertWithOnConflict = this.f81322d.insertWithOnConflict("MessageStore", null, contentValues, 5);
                if (insertWithOnConflict > 0) {
                    a.a(q);
                    Uri withAppendedId = ContentUris.withAppendedId(a.f81328b, insertWithOnConflict);
                    getContext().getContentResolver().notifyChange(withAppendedId, null);
                    return withAppendedId;
                }
                break;
            case 2:
                long insertWithOnConflict2 = this.f81322d.insertWithOnConflict("MsgTemp", null, contentValues, 5);
                if (insertWithOnConflict2 > 0) {
                    a.a(q);
                    Uri withAppendedId2 = ContentUris.withAppendedId(a.f81328b, insertWithOnConflict2);
                    getContext().getContentResolver().notifyChange(withAppendedId2, null);
                    return withAppendedId2;
                }
                break;
            case 3:
                long insertWithOnConflict3 = this.f81322d.insertWithOnConflict("MsgAlias", null, contentValues, 5);
                if (insertWithOnConflict3 > 0) {
                    a.a(q);
                    Uri withAppendedId3 = ContentUris.withAppendedId(a.f81330d, insertWithOnConflict3);
                    getContext().getContentResolver().notifyChange(withAppendedId3, null);
                    return withAppendedId3;
                }
                break;
            case 5:
                long insertWithOnConflict4 = this.f81324f.insertWithOnConflict("MsgLogStore", null, contentValues, 5);
                if (insertWithOnConflict4 > 0) {
                    a.a(q);
                    Uri withAppendedId4 = ContentUris.withAppendedId(a.f81332f, insertWithOnConflict4);
                    getContext().getContentResolver().notifyChange(withAppendedId4, null);
                    return withAppendedId4;
                }
                break;
            case 6:
                long insertWithOnConflict5 = this.f81324f.insertWithOnConflict("MsgLogIdTypeStore", null, contentValues, 5);
                if (insertWithOnConflict5 > 0) {
                    a.a(q);
                    return ContentUris.withAppendedId(a.g, insertWithOnConflict5);
                }
                break;
            case e.l:
                long insertWithOnConflict6 = this.f81324f.insertWithOnConflict("MsgLogStoreForAgoo", null, contentValues, 5);
                if (insertWithOnConflict6 > 0) {
                    a.a(q);
                    return ContentUris.withAppendedId(a.h, insertWithOnConflict6);
                }
                break;
            case 8:
                long insertWithOnConflict7 = this.f81324f.insertWithOnConflict("MsgLogIdTypeStoreForAgoo", null, contentValues, 5);
                if (insertWithOnConflict7 > 0) {
                    a.a(q);
                    return ContentUris.withAppendedId(a.i, insertWithOnConflict7);
                }
                break;
            case 9:
                long insertWithOnConflict8 = this.f81324f.insertWithOnConflict("MsgConfigInfo", null, contentValues, 5);
                if (insertWithOnConflict8 > 0) {
                    a.a(q);
                    return ContentUris.withAppendedId(a.j, insertWithOnConflict8);
                }
                break;
            case 10:
                long insertWithOnConflict9 = this.f81324f.insertWithOnConflict("InAppLogStore", null, contentValues, 5);
                if (insertWithOnConflict9 > 0) {
                    a.a(q);
                    return ContentUris.withAppendedId(a.k, insertWithOnConflict9);
                }
                break;
        }
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        int i;
        switch (f81320b.match(uri)) {
            case 2:
                i = this.f81322d.delete("MsgTemp", str, strArr);
                break;
            case 3:
                i = this.f81322d.delete("MsgAlias", str, strArr);
                break;
            case 4:
                i = this.f81322d.delete("MsgAlias", null, null);
                break;
            case 5:
                i = this.f81324f.delete("MsgLogStore", str, strArr);
                break;
            case 6:
                i = this.f81324f.delete("MsgLogIdTypeStore", str, strArr);
                break;
            case e.l:
                i = this.f81324f.delete("MsgLogStoreForAgoo", str, strArr);
                break;
            case 8:
                i = this.f81324f.delete("MsgLogIdTypeStoreForAgoo", str, strArr);
                break;
            case 10:
                i = this.f81324f.delete("InAppLogStore", str, strArr);
                break;
            default:
                i = 0;
                break;
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        int match = f81320b.match(uri);
        switch (match) {
            case 1:
                i = this.f81322d.updateWithOnConflict("MessageStore", contentValues, str, strArr, 5);
                break;
            case 2:
                i = this.f81322d.updateWithOnConflict("MsgTemp", contentValues, str, strArr, 5);
                break;
            case 3:
                this.f81322d.updateWithOnConflict("MsgAlias", contentValues, str, strArr, 5);
                break;
            default:
                switch (match) {
                    case 9:
                        i = this.f81324f.updateWithOnConflict("MsgConfigInfo", contentValues, str, strArr, 5);
                        break;
                    case 10:
                        i = this.f81324f.updateWithOnConflict("InAppLogStore", contentValues, str, strArr, 5);
                        break;
                }
        }
        i = 0;
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursor;
        switch (f81320b.match(uri)) {
            case 2:
                cursor = this.f81322d.query("MsgTemp", strArr, str, strArr2, null, null, str2);
                break;
            case 3:
                cursor = this.f81322d.query("MsgAlias", strArr, str, strArr2, null, null, str2);
                break;
            case 5:
                cursor = this.f81324f.query("MsgLogStore", strArr, str, strArr2, null, null, str2);
                break;
            case e.l:
                cursor = this.f81324f.query("MsgLogStoreForAgoo", strArr, str, strArr2, null, null, str2);
                break;
            case 8:
                cursor = this.f81324f.query("MsgLogIdTypeStoreForAgoo", strArr, str, strArr2, null, null, str2);
                break;
            case 9:
                cursor = this.f81324f.query("MsgConfigInfo", strArr, str, strArr2, null, null, str2);
                break;
            case 10:
                cursor = this.f81324f.query("InAppLogStore", strArr, str, strArr2, null, null, str2);
                break;
            default:
                cursor = null;
                break;
        }
        if (cursor != null) {
            cursor.setNotificationUri(getContext().getContentResolver(), uri);
        }
        return cursor;
    }
}
