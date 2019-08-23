package com.ss.android.ttplatformsdk.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ttplatformsdk.a.b;

public class TTPlatformAccountProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    private static final UriMatcher f31139a = new UriMatcher(-1);

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        UriMatcher uriMatcher = f31139a;
        uriMatcher.addURI(packageName + ".ttplatformapi.AccountProvider", "account", 1);
        return true;
    }

    public String getType(Uri uri) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName) || f31139a.match(uri) != 1) {
            return null;
        }
        return packageName + ".ttplatformapi.AccountProvider";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        boolean z = true;
        if (f31139a.match(uri) == 1) {
            String asString = contentValues.getAsString("user_name");
            String asString2 = contentValues.getAsString("user_avatar");
            Boolean asBoolean = contentValues.getAsBoolean("is_login");
            Context context = getContext();
            if (context != null) {
                if (TextUtils.isEmpty(asString)) {
                    asString = "";
                }
                b.a(context, "platform_user_name", asString);
                if (TextUtils.isEmpty(asString2)) {
                    asString2 = "";
                }
                b.a(context, "platform_user_avatar", asString2);
                if (asBoolean == null || !asBoolean.booleanValue()) {
                    z = false;
                }
                b.a(context);
                SharedPreferences.Editor edit = b.f31124a.f31122a.edit();
                edit.putBoolean("platform_is_login", z);
                edit.commit();
            }
        }
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"user_name", "user_avatar", "is_login", "support_open_sdk_api"}, 1);
        if (f31139a.match(uri) == 1) {
            Context context = getContext();
            if (context != null) {
                matrixCursor.addRow(new Object[]{b.b(context, "platform_user_name", ""), b.b(context, "platform_user_avatar", ""), Integer.valueOf(b.a(context, "platform_is_login", Boolean.FALSE) ? 1 : 0), 6430000});
            }
        }
        return matrixCursor;
    }
}
