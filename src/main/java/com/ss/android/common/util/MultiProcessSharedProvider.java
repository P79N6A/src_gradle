package com.ss.android.common.util;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.uikit.base.AppHooks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28316a;

    /* renamed from: b  reason: collision with root package name */
    public static String f28317b;

    /* renamed from: c  reason: collision with root package name */
    public static Uri f28318c;

    /* renamed from: d  reason: collision with root package name */
    private static UriMatcher f28319d;
    private static b g;

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f28320e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f28321f = new ConcurrentHashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28322a;

        /* renamed from: b  reason: collision with root package name */
        Context f28323b;

        /* renamed from: c  reason: collision with root package name */
        private ContentValues f28324c;

        public final synchronized void a() {
            if (PatchProxy.isSupport(new Object[0], this, f28322a, false, 15969, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f28322a, false, 15969, new Class[0], Void.TYPE);
                return;
            }
            b();
        }

        private synchronized void b() {
            if (PatchProxy.isSupport(new Object[0], this, f28322a, false, 15968, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f28322a, false, 15968, new Class[0], Void.TYPE);
                return;
            }
            try {
                this.f28323b.getContentResolver().insert(MultiProcessSharedProvider.a(this.f28323b, "key", "type"), this.f28324c);
            } catch (Throwable unused) {
            }
        }

        private a(Context context) {
            this.f28324c = new ContentValues();
            this.f28323b = context.getApplicationContext();
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }

        public final a a(String str, float f2) {
            if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(f2)}, this, f28322a, false, 15974, new Class[]{String.class, Float.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(f2)}, this, f28322a, false, 15974, new Class[]{String.class, Float.TYPE}, a.class);
            }
            this.f28324c.put(str, Float.valueOf(f2));
            return this;
        }

        public final a a(String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f28322a, false, 15973, new Class[]{String.class, Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f28322a, false, 15973, new Class[]{String.class, Integer.TYPE}, a.class);
            }
            this.f28324c.put(str, Integer.valueOf(i));
            return this;
        }

        public final a a(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f28322a, false, 15971, new Class[]{String.class, Long.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f28322a, false, 15971, new Class[]{String.class, Long.TYPE}, a.class);
            }
            this.f28324c.put(str, Long.valueOf(j));
            return this;
        }

        public final a a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f28322a, false, 15970, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f28322a, false, 15970, new Class[]{String.class, String.class}, a.class);
            }
            this.f28324c.put(str, str2);
            return this;
        }

        public final a a(String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f28322a, false, 15972, new Class[]{String.class, Boolean.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f28322a, false, 15972, new Class[]{String.class, Boolean.TYPE}, a.class);
            }
            this.f28324c.put(str, Boolean.valueOf(z));
            return this;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28325a;

        /* renamed from: b  reason: collision with root package name */
        private Context f28326b;

        public final a a() {
            if (!PatchProxy.isSupport(new Object[0], this, f28325a, false, 15977, new Class[0], a.class)) {
                return new a(this.f28326b, (byte) 0);
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, f28325a, false, 15977, new Class[0], a.class);
        }

        private b(Context context) {
            this.f28326b = context.getApplicationContext();
            Logger.debug();
        }

        /* synthetic */ b(Context context, byte b2) {
            this(context);
        }

        public final int a(String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f28325a, false, 15982, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f28325a, false, 15982, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            try {
                return MultiProcessSharedProvider.a(this.f28326b.getContentResolver().query(MultiProcessSharedProvider.a(this.f28326b, str, "integer"), null, null, null, null), i);
            } catch (Throwable unused) {
                return i;
            }
        }

        public final long a(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f28325a, false, 15979, new Class[]{String.class, Long.TYPE}, Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f28325a, false, 15979, new Class[]{String.class, Long.TYPE}, Long.TYPE)).longValue();
            }
            try {
                return MultiProcessSharedProvider.a(this.f28326b.getContentResolver().query(MultiProcessSharedProvider.a(this.f28326b, str, "long"), null, null, null, null), j2);
            } catch (Throwable unused) {
                return j2;
            }
        }

        public final String a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f28325a, false, 15978, new Class[]{String.class, String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f28325a, false, 15978, new Class[]{String.class, String.class}, String.class);
            }
            try {
                return MultiProcessSharedProvider.a(this.f28326b.getContentResolver().query(MultiProcessSharedProvider.a(this.f28326b, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }

        public final boolean a(String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f28325a, false, 15981, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f28325a, false, 15981, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            }
            try {
                return MultiProcessSharedProvider.a(this.f28326b.getContentResolver().query(MultiProcessSharedProvider.a(this.f28326b, str, "boolean"), null, null, null, null), z);
            } catch (Throwable unused) {
                return z;
            }
        }
    }

    private void a(Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2}, this, f28316a, false, 15949, new Class[]{Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2}, this, f28316a, false, 15949, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        getContext().getContentResolver().notifyChange(uri2, null);
    }

    public static String a(Cursor cursor, String str) {
        String str2;
        Cursor cursor2 = cursor;
        if (PatchProxy.isSupport(new Object[]{cursor2, str}, null, f28316a, true, 15960, new Class[]{Cursor.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{cursor2, str}, null, f28316a, true, 15960, new Class[]{Cursor.class, String.class}, String.class);
        } else if (cursor2 == null) {
            return str;
        } else {
            try {
                str2 = cursor.moveToFirst() ? cursor2.getString(0) : str;
                if (cursor2 != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                if (cursor2 != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
            return str2;
        }
    }

    public static boolean a(Cursor cursor, boolean z) {
        boolean z2;
        Cursor cursor2 = cursor;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{cursor2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f28316a, true, 15961, new Class[]{Cursor.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cursor2, Byte.valueOf(z)}, null, f28316a, true, 15961, new Class[]{Cursor.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (cursor2 == null) {
            return z;
        } else {
            try {
                if (cursor.moveToFirst()) {
                    if (cursor2.getInt(0) > 0) {
                        z3 = true;
                    }
                    z2 = z3;
                } else {
                    z2 = z;
                }
                if (cursor2 != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                if (cursor2 != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
            return z2;
        }
    }

    public boolean onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f28316a, false, 15953, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f28316a, false, 15953, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (f28319d == null) {
            try {
                Logger.debug();
                c(getContext());
                if (PatchProxy.isSupport(new Object[0], this, f28316a, false, 15959, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f28316a, false, 15959, new Class[0], Void.TYPE);
                } else {
                    SharedPreferences a2 = a();
                    if (a2 != null) {
                        for (Map.Entry next : a2.getAll().entrySet()) {
                            Object value = next.getValue();
                            this.f28321f.put((String) next.getKey(), value);
                        }
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            AppHooks.InitHook initHook = AppHooks.getInitHook();
            if (initHook != null) {
                initHook.tryInit(getContext());
            } else {
                getContext().startService(new Intent(getContext(), Class.forName("com.ss.android.newmedia.message.MessageHandler")));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    private synchronized SharedPreferences a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f28316a, false, 15950, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, f28316a, false, 15950, new Class[0], SharedPreferences.class);
        } else if (this.f28320e == null) {
            int i2 = Build.VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            if (i2 >= 11) {
                i = 4;
            }
            this.f28320e = c.a(applicationContext, "multi_process_config", i);
            return this.f28320e;
        } else {
            return this.f28320e;
        }
    }

    public static a a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f28316a, true, 15965, new Class[]{Context.class}, a.class)) {
            return new a(context2, (byte) 0);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f28316a, true, 15965, new Class[]{Context.class}, a.class);
    }

    public static synchronized b b(Context context) {
        Context context2 = context;
        synchronized (MultiProcessSharedProvider.class) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f28316a, true, 15966, new Class[]{Context.class}, b.class)) {
                b bVar = (b) PatchProxy.accessDispatch(new Object[]{context2}, null, f28316a, true, 15966, new Class[]{Context.class}, b.class);
                return bVar;
            }
            if (g == null) {
                g = new b(context2, (byte) 0);
            }
            b bVar2 = g;
            return bVar2;
        }
    }

    private static void c(Context context) throws IllegalStateException {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f28316a, true, 15951, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f28316a, true, 15951, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        String a2 = a(context2, MultiProcessSharedProvider.class.getName());
        f28317b = a2;
        if (!TextUtils.isEmpty(a2)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            f28319d = uriMatcher;
            uriMatcher.addURI(f28317b, "*/*", 65536);
            f28318c = Uri.parse("content://" + f28317b);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    public String getType(Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, this, f28316a, false, 15954, new Class[]{Uri.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{uri}, this, f28316a, false, 15954, new Class[]{Uri.class}, String.class);
        }
        return "vnd.android.cursor.item/vnd." + f28317b + ".item";
    }

    public static int a(Cursor cursor, int i) {
        int i2;
        Cursor cursor2 = cursor;
        if (PatchProxy.isSupport(new Object[]{cursor2, Integer.valueOf(i)}, null, f28316a, true, 15962, new Class[]{Cursor.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{cursor2, Integer.valueOf(i)}, null, f28316a, true, 15962, new Class[]{Cursor.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (cursor2 == null) {
            return i;
        } else {
            try {
                if (cursor.moveToFirst()) {
                    i2 = cursor2.getInt(0);
                } else {
                    i2 = i;
                }
                if (cursor2 != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                if (cursor2 != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
            return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        if (r1 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r1 == null) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(android.database.Cursor r20, long r21) {
        /*
            r1 = r20
            r2 = r21
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r11 = 0
            r4[r11] = r1
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r2)
            r12 = 1
            r4[r12] = r5
            com.meituan.robust.ChangeQuickRedirect r6 = f28316a
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class<android.database.Cursor> r5 = android.database.Cursor.class
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r9[r12] = r5
            java.lang.Class r10 = java.lang.Long.TYPE
            r5 = 0
            r7 = 1
            r8 = 15963(0x3e5b, float:2.2369E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0055
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r13[r11] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r2)
            r13[r12] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f28316a
            r16 = 1
            r17 = 15963(0x3e5b, float:2.2369E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.database.Cursor> r1 = android.database.Cursor.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Long.TYPE
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x0055:
            if (r1 != 0) goto L_0x0058
            return r2
        L_0x0058:
            boolean r0 = r20.moveToFirst()     // Catch:{ Throwable -> 0x0070, all -> 0x0069 }
            if (r0 == 0) goto L_0x0063
            long r4 = r1.getLong(r11)     // Catch:{ Throwable -> 0x0070, all -> 0x0069 }
            r2 = r4
        L_0x0063:
            if (r1 == 0) goto L_0x0073
        L_0x0065:
            r20.close()     // Catch:{ Exception -> 0x0073 }
            goto L_0x0073
        L_0x0069:
            r0 = move-exception
            if (r1 == 0) goto L_0x006f
            r20.close()     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            throw r0
        L_0x0070:
            if (r1 == 0) goto L_0x0073
            goto L_0x0065
        L_0x0073:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.MultiProcessSharedProvider.a(android.database.Cursor, long):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f A[Catch:{ Exception -> 0x014c }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0054 A[SYNTHETIC] */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r11, android.content.ContentValues r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f28316a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r8] = r1
            java.lang.Class<android.content.ContentValues> r1 = android.content.ContentValues.class
            r5[r9] = r1
            java.lang.Class<android.net.Uri> r6 = android.net.Uri.class
            r3 = 0
            r4 = 15956(0x3e54, float:2.2359E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0040
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f28316a
            r3 = 0
            r4 = 15956(0x3e54, float:2.2359E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r8] = r1
            java.lang.Class<android.content.ContentValues> r1 = android.content.ContentValues.class
            r5[r9] = r1
            java.lang.Class<android.net.Uri> r6 = android.net.Uri.class
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
        L_0x0040:
            android.content.UriMatcher r0 = f28319d
            int r0 = r0.match(r11)
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 != r1) goto L_0x014d
            r0 = 0
            java.util.Set r1 = r12.valueSet()     // Catch:{ Exception -> 0x014c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x014c }
            r2 = r0
        L_0x0054:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x014c }
            if (r3 == 0) goto L_0x013c
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x014c }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x014c }
            java.lang.Object r4 = r3.getValue()     // Catch:{ Exception -> 0x014c }
            java.lang.Object r3 = r3.getKey()     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x014c }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x014c }
            if (r4 != 0) goto L_0x0076
            java.util.Map<java.lang.String, java.lang.Object> r5 = r10.f28321f     // Catch:{ Exception -> 0x014c }
            r5.remove(r3)     // Catch:{ Exception -> 0x014c }
        L_0x0074:
            r5 = 1
            goto L_0x008d
        L_0x0076:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r10.f28321f     // Catch:{ Exception -> 0x014c }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ Exception -> 0x014c }
            if (r5 == 0) goto L_0x0087
            boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x014c }
            if (r5 != 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r5 = 0
            goto L_0x008d
        L_0x0087:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r10.f28321f     // Catch:{ Exception -> 0x014c }
            r5.put(r3, r4)     // Catch:{ Exception -> 0x014c }
            goto L_0x0074
        L_0x008d:
            if (r5 == 0) goto L_0x0054
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x014c }
            if (r2 != 0) goto L_0x009c
            android.content.SharedPreferences r2 = r10.a()     // Catch:{ Exception -> 0x014c }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x014c }
        L_0x009c:
            if (r4 != 0) goto L_0x00a2
            r2.remove(r3)     // Catch:{ Exception -> 0x014c }
            goto L_0x0054
        L_0x00a2:
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ Exception -> 0x014c }
            if (r5 == 0) goto L_0x00b9
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x014c }
            r2.putString(r3, r4)     // Catch:{ Exception -> 0x014c }
            android.content.Context r4 = r10.getContext()     // Catch:{ Exception -> 0x014c }
            java.lang.String r5 = "string"
            android.net.Uri r3 = a(r4, r3, r5)     // Catch:{ Exception -> 0x014c }
            r10.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x014c }
            goto L_0x0054
        L_0x00b9:
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x014c }
            if (r5 == 0) goto L_0x00d4
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x014c }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x014c }
            r2.putBoolean(r3, r4)     // Catch:{ Exception -> 0x014c }
            android.content.Context r4 = r10.getContext()     // Catch:{ Exception -> 0x014c }
            java.lang.String r5 = "boolean"
            android.net.Uri r3 = a(r4, r3, r5)     // Catch:{ Exception -> 0x014c }
            r10.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x014c }
            goto L_0x0054
        L_0x00d4:
            boolean r5 = r4 instanceof java.lang.Long     // Catch:{ Exception -> 0x014c }
            if (r5 == 0) goto L_0x00f0
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x014c }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x014c }
            r2.putLong(r3, r4)     // Catch:{ Exception -> 0x014c }
            android.content.Context r4 = r10.getContext()     // Catch:{ Exception -> 0x014c }
            java.lang.String r5 = "long"
            android.net.Uri r3 = a(r4, r3, r5)     // Catch:{ Exception -> 0x014c }
            r10.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x014c }
            goto L_0x0054
        L_0x00f0:
            boolean r5 = r4 instanceof java.lang.Integer     // Catch:{ Exception -> 0x014c }
            if (r5 == 0) goto L_0x010c
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x014c }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x014c }
            r2.putInt(r3, r4)     // Catch:{ Exception -> 0x014c }
            android.content.Context r4 = r10.getContext()     // Catch:{ Exception -> 0x014c }
            java.lang.String r5 = "integer"
            android.net.Uri r3 = a(r4, r3, r5)     // Catch:{ Exception -> 0x014c }
            r10.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x014c }
            goto L_0x0054
        L_0x010c:
            boolean r5 = r4 instanceof java.lang.Float     // Catch:{ Exception -> 0x014c }
            if (r5 == 0) goto L_0x0128
            java.lang.Float r4 = (java.lang.Float) r4     // Catch:{ Exception -> 0x014c }
            float r4 = r4.floatValue()     // Catch:{ Exception -> 0x014c }
            r2.putFloat(r3, r4)     // Catch:{ Exception -> 0x014c }
            android.content.Context r4 = r10.getContext()     // Catch:{ Exception -> 0x014c }
            java.lang.String r5 = "float"
            android.net.Uri r3 = a(r4, r3, r5)     // Catch:{ Exception -> 0x014c }
            r10.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x014c }
            goto L_0x0054
        L_0x0128:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x014c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = "Unsupported type "
            r2.<init>(r3)     // Catch:{ Exception -> 0x014c }
            r2.append(r11)     // Catch:{ Exception -> 0x014c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x014c }
            r1.<init>(r2)     // Catch:{ Exception -> 0x014c }
            throw r1     // Catch:{ Exception -> 0x014c }
        L_0x013c:
            if (r2 != 0) goto L_0x013f
            return r0
        L_0x013f:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x014c }
            r3 = 8
            if (r1 <= r3) goto L_0x0149
            r2.apply()     // Catch:{ Exception -> 0x014c }
            goto L_0x014c
        L_0x0149:
            r2.commit()     // Catch:{ Exception -> 0x014c }
        L_0x014c:
            return r0
        L_0x014d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported uri "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.MultiProcessSharedProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    private static String a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f28316a, true, 15952, new Class[]{Context.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f28316a, true, 15952, new Class[]{Context.class, String.class}, String.class);
        } else if (context == null || StringUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                for (ProviderInfo providerInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers) {
                    if (str2.equals(providerInfo.name)) {
                        return providerInfo.authority;
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2, str, strArr}, this, f28316a, false, 15955, new Class[]{Uri.class, String.class, String[].class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{uri2, str, strArr}, this, f28316a, false, 15955, new Class[]{Uri.class, String.class, String[].class}, Integer.TYPE)).intValue();
        } else if (f28319d.match(uri) == 65536) {
            try {
                a().edit().clear().commit();
                this.f28321f.clear();
                a(a(getContext(), "key", "type"));
            } catch (Exception unused) {
            }
            return 0;
        } else {
            throw new IllegalArgumentException("Unsupported uri " + uri);
        }
    }

    public static final synchronized Uri a(Context context, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        synchronized (MultiProcessSharedProvider.class) {
            if (PatchProxy.isSupport(new Object[]{context, str3, str4}, null, f28316a, true, 15967, new Class[]{Context.class, String.class, String.class}, Uri.class)) {
                Uri uri = (Uri) PatchProxy.accessDispatch(new Object[]{context, str3, str4}, null, f28316a, true, 15967, new Class[]{Context.class, String.class, String.class}, Uri.class);
                return uri;
            }
            if (f28318c == null) {
                try {
                    Logger.debug();
                    c(context);
                } catch (Exception unused) {
                    return null;
                }
            }
            Uri build = f28318c.buildUpon().appendPath(str3).appendPath(str4).build();
            return build;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (PatchProxy.isSupport(new Object[]{uri, contentValues, str, strArr}, this, f28316a, false, 15958, new Class[]{Uri.class, ContentValues.class, String.class, String[].class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{uri, contentValues, str, strArr}, this, f28316a, false, 15958, new Class[]{Uri.class, ContentValues.class, String.class, String[].class}, Integer.TYPE)).intValue();
        }
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2, strArr, str, strArr2, str2}, this, f28316a, false, 15957, new Class[]{Uri.class, String[].class, String.class, String[].class, String.class}, Cursor.class)) {
            return (Cursor) PatchProxy.accessDispatch(new Object[]{uri2, strArr, str, strArr2, str2}, this, f28316a, false, 15957, new Class[]{Uri.class, String[].class, String.class, String[].class, String.class}, Cursor.class);
        } else if (f28319d.match(uri2) == 65536) {
            try {
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = a().getAll();
                    matrixCursor = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                    try {
                        for (Map.Entry next : all.entrySet()) {
                            String str3 = (String) next.getKey();
                            Object value = next.getValue();
                            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
                            String str4 = "string";
                            if (value instanceof String) {
                                str4 = "string";
                            } else if (value instanceof Boolean) {
                                str4 = "boolean";
                                value = Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0);
                            } else if (value instanceof Integer) {
                                str4 = "integer";
                            } else if (value instanceof Long) {
                                str4 = "long";
                            } else if (value instanceof Float) {
                                str4 = "float";
                            }
                            newRow.add(str3);
                            newRow.add(value);
                            newRow.add(str4);
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    String str5 = uri.getPathSegments().get(0);
                    if (!this.f28321f.containsKey(str5)) {
                        return null;
                    }
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{str5});
                    try {
                        Object obj = this.f28321f.get(str5);
                        MatrixCursor.RowBuilder newRow2 = matrixCursor2.newRow();
                        if (obj instanceof Boolean) {
                            obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                        }
                        Logger.debug();
                        newRow2.add(obj);
                    } catch (Exception unused2) {
                    }
                    matrixCursor = matrixCursor2;
                }
            } catch (Exception unused3) {
                matrixCursor = null;
            }
            return matrixCursor;
        } else {
            throw new IllegalArgumentException("Unsupported uri " + uri2);
        }
    }
}
