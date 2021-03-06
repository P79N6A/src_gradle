package com.xiaomi.push.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.xiaomi.push.hv;

public class TrafficProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    private static final UriMatcher f82449a;

    /* renamed from: a  reason: collision with other field name */
    public static final Uri f880a = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");

    /* renamed from: a  reason: collision with other field name */
    private SQLiteOpenHelper f881a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f82449a = uriMatcher;
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "traffic", 1);
        f82449a.addURI("com.xiaomi.push.providers.TrafficProvider", "update_imsi", 2);
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        if (f82449a.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.xiaomi.push.traffic";
        }
        throw new IllegalArgumentException("Unknown URI " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        this.f881a = new a(getContext());
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query;
        synchronized (a.f882a) {
            if (f82449a.match(uri) == 1) {
                query = this.f881a.getReadableDatabase().query("traffic", strArr, str, strArr2, null, null, str2);
            } else {
                throw new IllegalArgumentException("Unknown URI " + uri);
            }
        }
        return query;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (f82449a.match(uri) == 2 && contentValues != null && contentValues.containsKey("imsi")) {
            hv.a(contentValues.getAsString("imsi"));
        }
        return 0;
    }
}
