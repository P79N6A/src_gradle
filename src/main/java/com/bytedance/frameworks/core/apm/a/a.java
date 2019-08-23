package com.bytedance.frameworks.core.apm.a;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.apm.c;
import com.bytedance.apm.k.i;
import com.bytedance.frameworks.core.apm.MonitorContentProvider;
import com.bytedance.frameworks.core.apm.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public abstract class a<T> implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2120a = c.a();

    /* renamed from: b  reason: collision with root package name */
    private final String f2121b = (this.f2120a.getPackageName() + ".apm");

    /* renamed from: c  reason: collision with root package name */
    private Uri f2122c;

    /* renamed from: d  reason: collision with root package name */
    private String f2123d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, Integer> f2124e = new HashMap<>();

    /* renamed from: com.bytedance.frameworks.core.apm.a.a$a  reason: collision with other inner class name */
    public interface C0010a<T> {
        T a(b bVar);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Cursor f2127a;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<String, Integer> f2128b;

        public final long a(String str) {
            try {
                return this.f2127a.getLong(d(str));
            } catch (Throwable th) {
                com.bytedance.apm.d.a().a(th, "BaseDao$CursorWrapper: getLong");
                return -1;
            }
        }

        public final int b(String str) {
            try {
                return this.f2127a.getInt(d(str));
            } catch (Throwable th) {
                com.bytedance.apm.d.a().a(th, "BaseDao$CursorWrapper: getInt");
                return -1;
            }
        }

        public final String c(String str) {
            try {
                return this.f2127a.getString(d(str));
            } catch (Throwable th) {
                com.bytedance.apm.d.a().a(th, "BaseDao$CursorWrapper: getString");
                return "";
            }
        }

        private int d(String str) {
            Integer num = this.f2128b.get(str);
            if (num == null) {
                try {
                    num = Integer.valueOf(this.f2127a.getColumnIndex(str));
                } catch (Throwable th) {
                    com.bytedance.apm.d.a().a(th, "BaseDao$CursorWrapper: getIndex");
                    num = -1;
                }
                this.f2128b.put(str, num);
            }
            return num.intValue();
        }

        private b(Cursor cursor, HashMap<String, Integer> hashMap) {
            this.f2127a = cursor;
            this.f2128b = hashMap;
        }

        /* synthetic */ b(Cursor cursor, HashMap hashMap, byte b2) {
            this(cursor, hashMap);
        }
    }

    private static String f() {
        return "apm_monitor_t1.db";
    }

    public abstract ContentValues a(T t);

    public boolean c() {
        return true;
    }

    public abstract String d();

    public abstract String[] e();

    public final String a() {
        return d();
    }

    public final long b() {
        return b(null, null);
    }

    private String h() {
        if (this.f2123d == null) {
            this.f2123d = "SELECT count(*) FROM " + d();
        }
        return this.f2123d;
    }

    private Uri g() {
        if (this.f2122c == null) {
            this.f2122c = Uri.parse("content://" + this.f2121b + "/" + f() + "/" + d());
        }
        return this.f2122c;
    }

    protected a() {
        if (c()) {
            String absolutePath = c.a().getDatabasePath(f()).getAbsolutePath();
            if (absolutePath != null) {
                HashSet hashSet = com.bytedance.frameworks.core.apm.c.f2136a.get(absolutePath);
                if (hashSet == null) {
                    synchronized (com.bytedance.frameworks.core.apm.c.f2136a) {
                        hashSet = com.bytedance.frameworks.core.apm.c.f2136a.get(absolutePath);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            com.bytedance.frameworks.core.apm.c.f2136a.put(absolutePath, hashSet);
                        }
                    }
                }
                hashSet.add(this);
            }
        }
    }

    private static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized <I extends T> long a(ContentValues contentValues) {
        if (contentValues == null) {
            return -1;
        }
        try {
            Uri insert = c.a().getContentResolver().insert(g(), contentValues);
            if (insert == null) {
                return -1;
            }
            try {
                return Long.parseLong(insert.getLastPathSegment());
            } catch (Exception e2) {
                com.bytedance.apm.d.a().a(e2, "BaseDao: insert");
                return 1;
            }
        } catch (Exception e3) {
            com.bytedance.apm.d.a().a(e3, "BaseDao: insert");
            return -1;
        }
    }

    public final void a(long j) {
        a("timestamp <=?", new String[]{String.valueOf(j)});
    }

    public final synchronized void a(List<ContentValues> list) {
        int i;
        if (!i.a(list)) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2 = i) {
                ArrayList arrayList = new ArrayList(8);
                i = i2;
                for (int i3 = 0; i3 < 50 && i < size; i3++) {
                    ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(g());
                    newInsert.withValues(list.get(i));
                    arrayList.add(newInsert.build());
                    i++;
                }
                try {
                    ContentProviderResult[] applyBatch = c.a().getContentResolver().applyBatch(this.f2121b, arrayList);
                    if (c.d()) {
                        for (ContentProviderResult contentProviderResult : applyBatch) {
                            String[] strArr = {"insertBatch ret: ", contentProviderResult.uri.toString()};
                        }
                    }
                } catch (Exception e2) {
                    com.bytedance.apm.d.a().a(e2, "BaseDao: insertBatch");
                }
            }
        }
    }

    public final int a(String str, String[] strArr) {
        try {
            return this.f2120a.getContentResolver().delete(g(), str, strArr);
        } catch (Exception unused) {
            return -1;
        }
    }

    public final long b(String str, String[] strArr) {
        Cursor cursor;
        String str2;
        Cursor cursor2 = null;
        long j = -1;
        try {
            Context a2 = c.a();
            Uri g = g();
            if (str == null) {
                str2 = h();
            } else {
                str2 = h() + " where " + str;
            }
            cursor = MonitorContentProvider.a(a2, g, str2, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToNext()) {
                        j = cursor.getLong(0);
                    }
                } catch (Exception unused) {
                    a(cursor);
                    return -1;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    cursor2 = cursor;
                    th = th2;
                    a(cursor2);
                    throw th;
                }
            }
            a(cursor);
            return j;
        } catch (Exception unused2) {
            cursor = null;
            a(cursor);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            a(cursor2);
            throw th;
        }
    }

    public final int a(ContentValues contentValues, String str, String[] strArr) {
        try {
            return c.a().getContentResolver().update(g(), contentValues, str, strArr);
        } catch (Exception e2) {
            com.bytedance.apm.d.a().a(e2, "BaseDao: update");
            return -1;
        }
    }

    public final List<T> a(String str, String[] strArr, String str2, C0010a<T> aVar) {
        Cursor cursor;
        try {
            cursor = this.f2120a.getContentResolver().query(g(), e(), str, strArr, str2);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        LinkedList linkedList = new LinkedList();
                        while (cursor.moveToNext()) {
                            linkedList.add(aVar.a(new b(cursor, this.f2124e, (byte) 0)));
                        }
                        a(cursor);
                        return linkedList;
                    }
                } catch (Throwable th) {
                    th = th;
                    a(cursor);
                    throw th;
                }
            }
            List<T> emptyList = Collections.emptyList();
            a(cursor);
            return emptyList;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            a(cursor);
            throw th;
        }
    }
}
