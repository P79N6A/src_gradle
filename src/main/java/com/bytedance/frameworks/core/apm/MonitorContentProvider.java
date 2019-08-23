package com.bytedance.frameworks.core.apm;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.core.e;
import com.bytedance.apm.d;
import com.bytedance.apm.k.i;
import com.bytedance.frameworks.core.apm.b.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MonitorContentProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static String f2114a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, SQLiteOpenHelper> f2115b = new HashMap();

    public String getType(Uri uri) {
        return null;
    }

    public boolean onCreate() {
        f2114a = getContext().getPackageName() + ".apm";
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.util.Pair<android.content.SharedPreferences, java.lang.String> b(android.net.Uri r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r7 = r7.getPathSegments()     // Catch:{ all -> 0x0041 }
            r0 = 0
            if (r7 == 0) goto L_0x003f
            int r1 = r7.size()     // Catch:{ all -> 0x0041 }
            r2 = 2
            if (r1 < r2) goto L_0x003f
            java.lang.String r1 = "sp"
            r3 = 0
            java.lang.Object r4 = r7.get(r3)     // Catch:{ all -> 0x0041 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x003f
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0041 }
            android.content.Context r4 = r6.getContext()     // Catch:{ all -> 0x0041 }
            r5 = 1
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x0041 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0041 }
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r4, r5, r3)     // Catch:{ all -> 0x0041 }
            int r4 = r7.size()     // Catch:{ all -> 0x0041 }
            if (r4 <= r2) goto L_0x003a
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x0041 }
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0041 }
        L_0x003a:
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0041 }
            monitor-exit(r6)
            return r1
        L_0x003f:
            monitor-exit(r6)
            return r0
        L_0x0041:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.MonitorContentProvider.b(android.net.Uri):android.util.Pair");
    }

    private synchronized Pair<SQLiteDatabase, String> a(Uri uri) {
        d a2;
        String str;
        try {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments != null && pathSegments.size() >= 2) {
                String str2 = pathSegments.get(0);
                String str3 = pathSegments.get(1);
                if (str2 == null) {
                    return null;
                }
                try {
                    SQLiteOpenHelper sQLiteOpenHelper = this.f2115b.get(str2);
                    if (sQLiteOpenHelper == null) {
                        if (!str2.contains("apm_monitor_t1.db")) {
                            return null;
                        }
                        sQLiteOpenHelper = new a(getContext(), str2);
                        try {
                            this.f2115b.put(str2, sQLiteOpenHelper);
                        } catch (Exception e2) {
                            e = e2;
                            a2 = d.a();
                            str = "MonitorContentProvider: parseUri";
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return new Pair<>(sQLiteOpenHelper.getWritableDatabase(), str3);
                } catch (Exception e3) {
                    e = e3;
                    a2 = d.a();
                    str = "MonitorContentProvider: parseUri";
                    a2.a(e, str);
                    return null;
                }
            }
        } catch (Exception e4) {
            e = e4;
            a2 = d.a();
            str = "MonitorContentProvider: parseUri";
            a2.a(e, str);
            return null;
        }
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Pair<SQLiteDatabase, String> a2 = a(uri);
        if (a2 == null) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) a2.first;
        if (sQLiteDatabase == null) {
            return null;
        }
        long insert = sQLiteDatabase.insert((String) a2.second, null, contentValues);
        if (insert >= 0) {
            try {
                return ContentUris.withAppendedId(uri, insert);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static void a(SharedPreferences sharedPreferences, Bundle bundle) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bundle.getBoolean("clear")) {
            edit.clear();
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("edit");
        if (parcelableArrayList != null) {
            Iterator it2 = parcelableArrayList.iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (eVar.f18945b == null) {
                    edit.remove(eVar.f18944a);
                } else {
                    String str = eVar.f18944a;
                    Object obj = eVar.f18945b;
                    if (obj instanceof String) {
                        edit.putString(str, (String) obj);
                    } else if (obj instanceof Integer) {
                        edit.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        edit.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        edit.putFloat(str, ((Float) obj).floatValue());
                    } else if (obj instanceof Boolean) {
                        edit.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof String[]) {
                        edit.putStringSet(str, new HashSet(Arrays.asList((String[]) obj)));
                    }
                }
            }
            edit.apply();
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        Pair<SQLiteDatabase, String> a2 = a(uri);
        if (a2 == null) {
            return -1;
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) a2.first;
        if (sQLiteDatabase == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.delete((String) a2.second, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static Bundle a(SharedPreferences sharedPreferences, String str, Object obj) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                arrayList.add(new e((String) next.getKey(), next.getValue()));
            }
            bundle.putParcelableArrayList("sp", arrayList);
        } else {
            Object obj2 = sharedPreferences.getAll().get(str);
            if (obj2 == null) {
                obj2 = obj;
            }
            if (obj2 instanceof Set) {
                obj2 = i.a((Set) obj2);
            }
            arrayList.add(new e(str, obj2));
            bundle.putParcelableArrayList("sp", arrayList);
        }
        return bundle;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        if ("getPid".equals(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("Pid", Process.myPid());
            return bundle2;
        }
        Uri.parse(str);
        Pair<SharedPreferences, String> b2 = b(Uri.parse(str));
        Object obj = null;
        if (b2 == null) {
            return null;
        }
        if ("query".equals(str2)) {
            if (bundle != null) {
                e eVar = (e) bundle.getParcelable("sp");
                if (eVar != null) {
                    obj = eVar.f18945b;
                }
            }
            return a((SharedPreferences) b2.first, (String) b2.second, obj);
        } else if ("contains".equals(str2)) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("contains", ((SharedPreferences) b2.first).contains((String) b2.second));
            return bundle3;
        } else {
            if ("edit".equals(str2) && bundle != null) {
                a((SharedPreferences) b2.first, bundle);
            }
            return null;
        }
    }

    public static Cursor a(Context context, Uri uri, String str, String[] strArr) {
        try {
            return context.getContentResolver().query(uri, null, str, strArr, "rawQuery");
        } catch (Exception unused) {
            return null;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Pair<SQLiteDatabase, String> a2 = a(uri);
        if (a2 == null) {
            return -1;
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) a2.first;
        if (sQLiteDatabase == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.update((String) a2.second, contentValues, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Pair<SQLiteDatabase, String> a2 = a(uri);
        if (a2 == null) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) a2.first;
        if (sQLiteDatabase == null) {
            return null;
        }
        if (TextUtils.equals(str2, "rawQuery")) {
            return sQLiteDatabase.rawQuery(str, strArr2);
        }
        if (TextUtils.equals(str2, "execSQL")) {
            for (String str3 : str.split(";")) {
                if (!TextUtils.isEmpty(str3)) {
                    sQLiteDatabase.execSQL(str3);
                }
            }
            return null;
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables((String) a2.second);
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2);
    }
}
