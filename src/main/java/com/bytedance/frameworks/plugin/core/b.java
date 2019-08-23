package com.bytedance.frameworks.plugin.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;

public abstract class b extends ContentProvider {
    /* access modifiers changed from: protected */
    public abstract IBinder b();

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public static IBinder a(Context context, Uri uri) {
        Bundle call = context.getContentResolver().call(uri, "query_binder", null, null);
        if (call != null) {
            call.setClassLoader(b.class.getClassLoader());
            a aVar = (a) call.getParcelable("binder");
            if (aVar != null) {
                return aVar.f2191a;
            }
        }
        return null;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        if (!"query_binder".equals(str)) {
            return null;
        }
        IBinder b2 = b();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("binder", new a(b2));
        return bundle2;
    }
}
