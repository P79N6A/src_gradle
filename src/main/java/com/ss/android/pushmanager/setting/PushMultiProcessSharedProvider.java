package com.ss.android.pushmanager.setting;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.push.ActivityLifecycleObserver;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.k;
import com.ss.android.ugc.aweme.q.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PushMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30572a;

    /* renamed from: b  reason: collision with root package name */
    public static String f30573b;

    /* renamed from: c  reason: collision with root package name */
    public static Uri f30574c;

    /* renamed from: d  reason: collision with root package name */
    private static UriMatcher f30575d;
    @SuppressLint({"CI_StaticFieldLeak"})
    private static b i;

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f30576e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f30577f = new ConcurrentHashMap();
    private volatile boolean g = false;
    private final Object h = new Object();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30578a;

        /* renamed from: b  reason: collision with root package name */
        Context f30579b;

        /* renamed from: c  reason: collision with root package name */
        ContentValues f30580c;

        public final synchronized void b() {
            if (PatchProxy.isSupport(new Object[0], this, f30578a, false, 19163, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f30578a, false, 19163, new Class[0], Void.TYPE);
                return;
            }
            a();
        }

        public final synchronized void a() {
            if (PatchProxy.isSupport(new Object[0], this, f30578a, false, 19162, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f30578a, false, 19162, new Class[0], Void.TYPE);
                return;
            }
            try {
                this.f30579b.getContentResolver().insert(PushMultiProcessSharedProvider.a(this.f30579b, "key", "type"), this.f30580c);
            } catch (Throwable unused) {
            }
        }

        private a(Context context) {
            this.f30580c = new ContentValues();
            this.f30579b = context.getApplicationContext();
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }

        public final a a(String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f30578a, false, 19167, new Class[]{String.class, Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f30578a, false, 19167, new Class[]{String.class, Integer.TYPE}, a.class);
            }
            this.f30580c.put(str, Integer.valueOf(i));
            return this;
        }

        public final a a(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f30578a, false, 19165, new Class[]{String.class, Long.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f30578a, false, 19165, new Class[]{String.class, Long.TYPE}, a.class);
            }
            this.f30580c.put(str, Long.valueOf(j));
            return this;
        }

        public final a a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f30578a, false, 19164, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f30578a, false, 19164, new Class[]{String.class, String.class}, a.class);
            }
            this.f30580c.put(str, str2);
            return this;
        }

        public final a a(String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f30578a, false, 19166, new Class[]{String.class, Boolean.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f30578a, false, 19166, new Class[]{String.class, Boolean.TYPE}, a.class);
            }
            this.f30580c.put(str, Boolean.valueOf(z));
            return this;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30581a;

        /* renamed from: b  reason: collision with root package name */
        private Context f30582b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f30583c;

        /* renamed from: d  reason: collision with root package name */
        private SharedPreferences f30584d;

        private boolean c() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f30581a, false, 19180, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30581a, false, 19180, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (!ActivityLifecycleObserver.getIns().isBackGround()) {
                z = true;
            }
            return z;
        }

        public final a a() {
            if (!PatchProxy.isSupport(new Object[0], this, f30581a, false, 19171, new Class[0], a.class)) {
                return new a(this.f30582b, (byte) 0);
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, f30581a, false, 19171, new Class[0], a.class);
        }

        public final boolean b() {
            if (PatchProxy.isSupport(new Object[0], this, f30581a, false, 19179, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30581a, false, 19179, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.f30583c) {
                return c();
            } else {
                return a("current_app_foreground", false);
            }
        }

        private b(Context context) {
            this.f30583c = k.d(context);
            this.f30582b = context.getApplicationContext();
            this.f30584d = c.a(this.f30582b.getApplicationContext(), "push_multi_process_config", 4);
            Logger.debug();
        }

        /* synthetic */ b(Context context, byte b2) {
            this(context);
        }

        public final int a(String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f30581a, false, 19176, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f30581a, false, 19176, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            try {
                if (this.f30583c) {
                    return this.f30584d.getInt(str, i);
                }
                return PushMultiProcessSharedProvider.a(this.f30582b.getContentResolver().query(PushMultiProcessSharedProvider.a(this.f30582b, str, "integer"), null, null, null, null), i);
            } catch (Throwable unused) {
                return i;
            }
        }

        public final long a(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f30581a, false, 19173, new Class[]{String.class, Long.TYPE}, Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f30581a, false, 19173, new Class[]{String.class, Long.TYPE}, Long.TYPE)).longValue();
            }
            try {
                if (this.f30583c) {
                    return this.f30584d.getLong(str, j2);
                }
                return PushMultiProcessSharedProvider.a(this.f30582b.getContentResolver().query(PushMultiProcessSharedProvider.a(this.f30582b, str, "long"), null, null, null, null), j2);
            } catch (Throwable unused) {
                return j2;
            }
        }

        public final String a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f30581a, false, 19172, new Class[]{String.class, String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f30581a, false, 19172, new Class[]{String.class, String.class}, String.class);
            }
            try {
                if (this.f30583c) {
                    return this.f30584d.getString(str, str2);
                }
                return PushMultiProcessSharedProvider.a(this.f30582b.getContentResolver().query(PushMultiProcessSharedProvider.a(this.f30582b, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }

        public final boolean a(String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f30581a, false, 19175, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f30581a, false, 19175, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            }
            try {
                if (this.f30583c) {
                    return this.f30584d.getBoolean(str, z);
                }
                return PushMultiProcessSharedProvider.a(this.f30582b.getContentResolver().query(PushMultiProcessSharedProvider.a(this.f30582b, str, "boolean"), null, null, null, null), z);
            } catch (Throwable unused) {
                return z;
            }
        }
    }

    private void a(Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2}, this, f30572a, false, 19140, new Class[]{Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2}, this, f30572a, false, 19140, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        getContext().getContentResolver().notifyChange(uri2, null);
    }

    private static String a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f30572a, true, 19145, new Class[]{Context.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f30572a, true, 19145, new Class[]{Context.class, String.class}, String.class);
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
            return context.getPackageName() + ".push.SHARE_PROVIDER_AUTHORITY";
        }
    }

    public static String a(Cursor cursor, String str) {
        String str2;
        Cursor cursor2 = cursor;
        if (PatchProxy.isSupport(new Object[]{cursor2, str}, null, f30572a, true, 19154, new Class[]{Cursor.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{cursor2, str}, null, f30572a, true, 19154, new Class[]{Cursor.class, String.class}, String.class);
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
        if (PatchProxy.isSupport(new Object[]{cursor2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f30572a, true, 19155, new Class[]{Cursor.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cursor2, Byte.valueOf(z)}, null, f30572a, true, 19155, new Class[]{Cursor.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
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

    private static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f30572a, true, 19142, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30572a, true, 19142, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(f30573b) && f30575d != null) {
            return false;
        }
        return true;
    }

    public boolean onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f30572a, false, 19146, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30572a, false, 19146, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!Logger.debug() || k.d(getContext())) {
            if (f30575d == null) {
                try {
                    Logger.debug();
                    b(getContext());
                } catch (Exception unused) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalAccessError("should be create in main process");
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f30572a, false, 19147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30572a, false, 19147, new Class[0], Void.TYPE);
        } else if (!this.g) {
            synchronized (this.h) {
                if (!this.g) {
                    if (PatchProxy.isSupport(new Object[0], this, f30572a, false, 19153, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f30572a, false, 19153, new Class[0], Void.TYPE);
                    } else {
                        SharedPreferences a2 = a();
                        if (a2 != null) {
                            for (Map.Entry next : a2.getAll().entrySet()) {
                                Object value = next.getValue();
                                this.f30577f.put((String) next.getKey(), value);
                            }
                        }
                    }
                    this.g = true;
                }
            }
        }
    }

    private synchronized SharedPreferences a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f30572a, false, 19141, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, f30572a, false, 19141, new Class[0], SharedPreferences.class);
        } else if (this.f30576e == null) {
            int i3 = Build.VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            if (i3 >= 11) {
                i2 = 4;
            }
            this.f30576e = c.a(applicationContext, "push_multi_process_config", i2);
            return this.f30576e;
        } else {
            return this.f30576e;
        }
    }

    public String getType(Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, this, f30572a, false, 19148, new Class[]{Uri.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{uri}, this, f30572a, false, 19148, new Class[]{Uri.class}, String.class);
        }
        c();
        return "vnd.android.cursor.item/vnd." + f30573b + ".item";
    }

    private static void b(Context context) throws IllegalStateException {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f30572a, true, 19144, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f30572a, true, 19144, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(f30573b)) {
            f30573b = a(context2, PushMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f30573b)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            f30575d = uriMatcher;
            uriMatcher.addURI(f30573b, "*/*", 65536);
            f30574c = Uri.parse("content://" + f30573b);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    public static synchronized b a(Context context) {
        Context context2 = context;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f30572a, true, 19160, new Class[]{Context.class}, b.class)) {
                b bVar = (b) PatchProxy.accessDispatch(new Object[]{context2}, null, f30572a, true, 19160, new Class[]{Context.class}, b.class);
                return bVar;
            }
            if (i == null) {
                i = new b(context2, (byte) 0);
            }
            b bVar2 = i;
            return bVar2;
        }
    }

    public static int a(Cursor cursor, int i2) {
        int i3;
        Cursor cursor2 = cursor;
        if (PatchProxy.isSupport(new Object[]{cursor2, Integer.valueOf(i2)}, null, f30572a, true, 19156, new Class[]{Cursor.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{cursor2, Integer.valueOf(i2)}, null, f30572a, true, 19156, new Class[]{Cursor.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (cursor2 == null) {
            return i2;
        } else {
            try {
                if (cursor.moveToFirst()) {
                    i3 = cursor2.getInt(0);
                } else {
                    i3 = i2;
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
            return i3;
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        ProviderInfo providerInfo2 = providerInfo;
        if (PatchProxy.isSupport(new Object[]{context, providerInfo2}, this, f30572a, false, 19143, new Class[]{Context.class, ProviderInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, providerInfo2}, this, f30572a, false, 19143, new Class[]{Context.class, ProviderInfo.class}, Void.TYPE);
            return;
        }
        if (providerInfo2 != null) {
            f30573b = providerInfo2.authority;
        }
        super.attachInfo(context, providerInfo);
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
            com.meituan.robust.ChangeQuickRedirect r6 = f30572a
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class<android.database.Cursor> r5 = android.database.Cursor.class
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r9[r12] = r5
            java.lang.Class r10 = java.lang.Long.TYPE
            r5 = 0
            r7 = 1
            r8 = 19157(0x4ad5, float:2.6845E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0055
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r13[r11] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r2)
            r13[r12] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f30572a
            r16 = 1
            r17 = 19157(0x4ad5, float:2.6845E-41)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(android.database.Cursor, long):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099 A[Catch:{ Exception -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x005e A[SYNTHETIC] */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r12, android.content.ContentValues r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            r10 = 1
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f30572a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r9] = r1
            java.lang.Class<android.content.ContentValues> r1 = android.content.ContentValues.class
            r5[r10] = r1
            java.lang.Class<android.net.Uri> r6 = android.net.Uri.class
            r3 = 0
            r4 = 19150(0x4ace, float:2.6835E-41)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0040
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f30572a
            r3 = 0
            r4 = 19150(0x4ace, float:2.6835E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r9] = r1
            java.lang.Class<android.content.ContentValues> r1 = android.content.ContentValues.class
            r5[r10] = r1
            java.lang.Class<android.net.Uri> r6 = android.net.Uri.class
            r1 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
        L_0x0040:
            r11.c()
            boolean r0 = b()
            r1 = 0
            if (r0 == 0) goto L_0x004b
            return r1
        L_0x004b:
            android.content.UriMatcher r0 = f30575d
            int r0 = r0.match(r12)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r0 != r2) goto L_0x0180
            java.util.Set r0 = r13.valueSet()     // Catch:{ Exception -> 0x017f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x017f }
            r2 = r1
        L_0x005e:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x017f }
            if (r3 == 0) goto L_0x016f
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x017f }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x017f }
            java.lang.Object r4 = r3.getValue()     // Catch:{ Exception -> 0x017f }
            java.lang.Object r3 = r3.getKey()     // Catch:{ Exception -> 0x017f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x017f }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x017f }
            if (r4 != 0) goto L_0x0080
            java.util.Map<java.lang.String, java.lang.Object> r5 = r11.f30577f     // Catch:{ Exception -> 0x017f }
            r5.remove(r3)     // Catch:{ Exception -> 0x017f }
        L_0x007e:
            r5 = 1
            goto L_0x0097
        L_0x0080:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r11.f30577f     // Catch:{ Exception -> 0x017f }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ Exception -> 0x017f }
            if (r5 == 0) goto L_0x0091
            boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x017f }
            if (r5 != 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r5 = 0
            goto L_0x0097
        L_0x0091:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r11.f30577f     // Catch:{ Exception -> 0x017f }
            r5.put(r3, r4)     // Catch:{ Exception -> 0x017f }
            goto L_0x007e
        L_0x0097:
            if (r5 == 0) goto L_0x005e
            boolean r5 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x017f }
            if (r5 == 0) goto L_0x00c3
            java.lang.String r5 = "PushService"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017f }
            java.lang.String r7 = "MultiProcessShareProvider reallly insert key = "
            r6.<init>(r7)     // Catch:{ Exception -> 0x017f }
            r6.append(r3)     // Catch:{ Exception -> 0x017f }
            java.lang.String r7 = " value = "
            r6.append(r7)     // Catch:{ Exception -> 0x017f }
            r6.append(r4)     // Catch:{ Exception -> 0x017f }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x017f }
            if (r6 == 0) goto L_0x00be
            java.lang.String r6 = r4.toString()     // Catch:{ Exception -> 0x017f }
            goto L_0x00c0
        L_0x00be:
            java.lang.String r6 = "null"
        L_0x00c0:
            com.bytedance.common.utility.Logger.d(r5, r6)     // Catch:{ Exception -> 0x017f }
        L_0x00c3:
            if (r2 != 0) goto L_0x00cd
            android.content.SharedPreferences r2 = r11.a()     // Catch:{ Exception -> 0x017f }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x017f }
        L_0x00cd:
            if (r4 != 0) goto L_0x00d3
            r2.remove(r3)     // Catch:{ Exception -> 0x017f }
            goto L_0x005e
        L_0x00d3:
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ Exception -> 0x017f }
            if (r5 == 0) goto L_0x00eb
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x017f }
            r2.putString(r3, r4)     // Catch:{ Exception -> 0x017f }
            android.content.Context r4 = r11.getContext()     // Catch:{ Exception -> 0x017f }
            java.lang.String r5 = "string"
            android.net.Uri r3 = a(r4, r3, r5)     // Catch:{ Exception -> 0x017f }
            r11.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x017f }
            goto L_0x005e
        L_0x00eb:
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x017f }
            if (r5 == 0) goto L_0x0107
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x017f }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x017f }
            r2.putBoolean(r3, r4)     // Catch:{ Exception -> 0x017f }
            android.content.Context r4 = r11.getContext()     // Catch:{ Exception -> 0x017f }
            java.lang.String r5 = "boolean"
            android.net.Uri r3 = a(r4, r3, r5)     // Catch:{ Exception -> 0x017f }
            r11.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x017f }
            goto L_0x005e
        L_0x0107:
            boolean r5 = r4 instanceof java.lang.Long     // Catch:{ Exception -> 0x017f }
            if (r5 == 0) goto L_0x0123
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x017f }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x017f }
            r2.putLong(r3, r4)     // Catch:{ Exception -> 0x017f }
            android.content.Context r4 = r11.getContext()     // Catch:{ Exception -> 0x017f }
            java.lang.String r5 = "long"
            android.net.Uri r3 = a(r4, r3, r5)     // Catch:{ Exception -> 0x017f }
            r11.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x017f }
            goto L_0x005e
        L_0x0123:
            boolean r5 = r4 instanceof java.lang.Integer     // Catch:{ Exception -> 0x017f }
            if (r5 == 0) goto L_0x013f
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x017f }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x017f }
            r2.putInt(r3, r4)     // Catch:{ Exception -> 0x017f }
            android.content.Context r4 = r11.getContext()     // Catch:{ Exception -> 0x017f }
            java.lang.String r5 = "integer"
            android.net.Uri r3 = a(r4, r3, r5)     // Catch:{ Exception -> 0x017f }
            r11.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x017f }
            goto L_0x005e
        L_0x013f:
            boolean r5 = r4 instanceof java.lang.Float     // Catch:{ Exception -> 0x017f }
            if (r5 == 0) goto L_0x015b
            java.lang.Float r4 = (java.lang.Float) r4     // Catch:{ Exception -> 0x017f }
            float r4 = r4.floatValue()     // Catch:{ Exception -> 0x017f }
            r2.putFloat(r3, r4)     // Catch:{ Exception -> 0x017f }
            android.content.Context r4 = r11.getContext()     // Catch:{ Exception -> 0x017f }
            java.lang.String r5 = "float"
            android.net.Uri r3 = a(r4, r3, r5)     // Catch:{ Exception -> 0x017f }
            r11.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x017f }
            goto L_0x005e
        L_0x015b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x017f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017f }
            java.lang.String r3 = "Unsupported type "
            r2.<init>(r3)     // Catch:{ Exception -> 0x017f }
            r2.append(r12)     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x017f }
            r0.<init>(r2)     // Catch:{ Exception -> 0x017f }
            throw r0     // Catch:{ Exception -> 0x017f }
        L_0x016f:
            if (r2 != 0) goto L_0x0172
            return r1
        L_0x0172:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x017f }
            r3 = 8
            if (r0 <= r3) goto L_0x017c
            r2.apply()     // Catch:{ Exception -> 0x017f }
            goto L_0x017f
        L_0x017c:
            r2.commit()     // Catch:{ Exception -> 0x017f }
        L_0x017f:
            return r1
        L_0x0180:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported uri "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2, str, strArr}, this, f30572a, false, 19149, new Class[]{Uri.class, String.class, String[].class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{uri2, str, strArr}, this, f30572a, false, 19149, new Class[]{Uri.class, String.class, String[].class}, Integer.TYPE)).intValue();
        }
        c();
        if (b() || f30575d.match(uri2) == 65536) {
            return 0;
        }
        throw new IllegalArgumentException("Unsupported uri " + uri2);
    }

    public static final synchronized Uri a(Context context, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (PatchProxy.isSupport(new Object[]{context, str3, str4}, null, f30572a, true, 19161, new Class[]{Context.class, String.class, String.class}, Uri.class)) {
                Uri uri = (Uri) PatchProxy.accessDispatch(new Object[]{context, str3, str4}, null, f30572a, true, 19161, new Class[]{Context.class, String.class, String.class}, Uri.class);
                return uri;
            }
            if (f30574c == null) {
                try {
                    Logger.debug();
                    b(context);
                } catch (Exception unused) {
                    return null;
                }
            }
            Uri build = f30574c.buildUpon().appendPath(str3).appendPath(str4).build();
            return build;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (PatchProxy.isSupport(new Object[]{uri, contentValues, str, strArr}, this, f30572a, false, 19152, new Class[]{Uri.class, ContentValues.class, String.class, String[].class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{uri, contentValues, str, strArr}, this, f30572a, false, 19152, new Class[]{Uri.class, ContentValues.class, String.class, String[].class}, Integer.TYPE)).intValue();
        }
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        Object obj;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2, strArr, str, strArr2, str2}, this, f30572a, false, 19151, new Class[]{Uri.class, String[].class, String.class, String[].class, String.class}, Cursor.class)) {
            return (Cursor) PatchProxy.accessDispatch(new Object[]{uri2, strArr, str, strArr2, str2}, this, f30572a, false, 19151, new Class[]{Uri.class, String[].class, String.class, String[].class, String.class}, Cursor.class);
        }
        c();
        if (b()) {
            return null;
        }
        if (f30575d.match(uri2) == 65536) {
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
                    boolean equal = StringUtils.equal(str5, "current_app_state");
                    boolean equal2 = StringUtils.equal(str5, "current_app_foreground");
                    if (!this.f30577f.containsKey(str5) && !equal && !equal2) {
                        return null;
                    }
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{str5});
                    if (equal) {
                        try {
                            obj = Boolean.valueOf(ActivityLifecycleObserver.getIns().isApplicationActive());
                        } catch (Exception unused2) {
                        }
                    } else if (equal2) {
                        obj = Boolean.valueOf(!ActivityLifecycleObserver.getIns().isBackGround());
                    } else {
                        obj = this.f30577f.get(str5);
                    }
                    MatrixCursor.RowBuilder newRow2 = matrixCursor2.newRow();
                    if (obj instanceof Boolean) {
                        obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                    }
                    Logger.debug();
                    newRow2.add(obj);
                    matrixCursor = matrixCursor2;
                }
            } catch (Exception unused3) {
                matrixCursor = null;
            }
            return matrixCursor;
        }
        throw new IllegalArgumentException("Unsupported uri " + uri2);
    }
}
