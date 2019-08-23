package com.ss.android.ugc.aweme.plugin.d;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.Formatter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.plugin.a.a;
import com.ss.android.ugc.aweme.plugin.e.b;
import java.util.HashMap;
import java.util.Map;

public final class d implements a.C0664a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59286a;

    /* renamed from: b  reason: collision with root package name */
    private Context f59287b;

    /* renamed from: com.ss.android.ugc.aweme.plugin.d.d$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59288a = new int[b.C0667b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.android.ugc.aweme.plugin.e.b$b[] r0 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f59288a = r0
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.FAILED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.INSUFFICIENT_STORAGE_FAILED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.SUCCESS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.CANCELED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.VERIFY_FAILED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.FIRST_DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.DOWNLOADING     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.PAUSED_BY_APP     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.PAUSED_BY_NETWORK     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.PAUSED_BY_OTHERS     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f59288a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.ss.android.ugc.aweme.plugin.e.b$b r1 = com.ss.android.ugc.aweme.plugin.e.b.C0667b.PAUSED_BY_LOADPATCH_ONLY     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.d.d.AnonymousClass1.<clinit>():void");
        }
    }

    public final void b(b bVar) {
    }

    private static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f59286a, true, 64618, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59286a, true, 64618, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return Environment.getExternalStorageState().equals("mounted");
    }

    public d(Context context) {
        this.f59287b = context;
    }

    private static String a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f59286a, true, 64619, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f59286a, true, 64619, new Class[]{Context.class}, String.class);
        } else if (!a()) {
            return "sdcard not available";
        } else {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return Formatter.formatFileSize(context2, ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount()));
            } catch (Throwable unused) {
                return "unknown";
            }
        }
    }

    private static String b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f59286a, true, 64620, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f59286a, true, 64620, new Class[]{Context.class}, String.class);
        } else if (!a()) {
            return "sdcard not available";
        } else {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return Formatter.formatFileSize(context2, ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks()));
            } catch (Throwable unused) {
                return "unknown";
            }
        }
    }

    private static String c(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f59286a, true, 64621, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f59286a, true, 64621, new Class[]{Context.class}, String.class);
        }
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Formatter.formatFileSize(context2, ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount()));
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    private static String d(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f59286a, true, 64622, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f59286a, true, 64622, new Class[]{Context.class}, String.class);
        }
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Formatter.formatFileSize(context2, ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks()));
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public final void a(b bVar) {
        String str;
        String str2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f59286a, false, 64617, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f59286a, false, 64617, new Class[]{b.class}, Void.TYPE);
            return;
        }
        String str3 = "other";
        if (bVar.f59320c != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.f59320c.toString());
            if (bVar.k != null) {
                sb.append("error msg:" + bVar.k.toString());
            }
            switch (AnonymousClass1.f59288a[bVar.f59320c.ordinal()]) {
                case 1:
                    a(bVar, 2, sb.toString(), -1, null);
                    break;
                case 2:
                    HashMap hashMap = new HashMap();
                    String a2 = a(this.f59287b);
                    hashMap.put("sdcard_size", a2);
                    sb.append(",sdcard_size:");
                    sb.append(a2);
                    String b2 = b(this.f59287b);
                    hashMap.put("sdcard_available_size", b2);
                    sb.append(",sdcard_available_size:");
                    sb.append(b2);
                    String c2 = c(this.f59287b);
                    hashMap.put("internal_size", c2);
                    sb.append(",internal_size:");
                    sb.append(c2);
                    String d2 = d(this.f59287b);
                    hashMap.put("internal_available_size", d2);
                    sb.append(",internal_available_size:");
                    sb.append(d2);
                    a(bVar, 4, sb.toString(), -1, hashMap);
                    break;
                case 3:
                    try {
                        if (bVar.j > 0) {
                            sb.append(",retry_count:");
                            sb.append(bVar.j);
                        }
                    } catch (Exception unused) {
                    }
                    b bVar2 = bVar;
                    a(bVar2, 1, sb.toString(), System.currentTimeMillis() - bVar.h, null);
                    break;
                case 5:
                    sb.append(",verify:md5 verify failed");
                    a(bVar, 3, "md5 verify failed", -1, null);
                    break;
                case 6:
                    str3 = "first";
                    break;
                case e.l:
                    str3 = "continue";
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                    try {
                        sb.append("paused:");
                        sb.append(bVar.f59320c.toString());
                        break;
                    } catch (Exception unused2) {
                        break;
                    }
            }
            z = false;
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("plugin_version", String.valueOf(bVar.f59319b.f59325b));
                hashMap2.put("plugin_name", bVar.f59319b.f59324a);
                if (bVar.g == b.a.Direct) {
                    hashMap2.put("trigger", "launch");
                } else {
                    hashMap2.put("trigger", "shoot");
                }
                if (bVar.f59320c.isFailed()) {
                    str = "error";
                } else {
                    str = "success";
                }
                hashMap2.put("status", str);
                if (bVar.k != null) {
                    sb.append(",exception:");
                    sb.append(bVar.k.toString());
                }
                if (!b.C0667b.SUCCESS.equals(bVar.f59320c)) {
                    hashMap2.put("reason", sb.toString());
                }
                hashMap2.put("download_type", str3);
                if (b.C0667b.ALREADY_DOWNLOADED.equals(bVar.f59320c)) {
                    str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                hashMap2.put("is_download", str2);
                if (z) {
                    hashMap2.put("duration", Long.toString(System.currentTimeMillis() - bVar.h));
                }
                r.a("plugin_download", (Map) hashMap2);
            } catch (Exception unused3) {
            }
        }
    }

    private void a(b bVar, int i, String str, long j, Map<String, String> map) {
        b bVar2 = bVar;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{bVar2, Integer.valueOf(i), str, new Long(j2), map}, this, f59286a, false, 64623, new Class[]{b.class, Integer.TYPE, String.class, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, Integer.valueOf(i), str, new Long(j2), map}, this, f59286a, false, 64623, new Class[]{b.class, Integer.TYPE, String.class, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.plugin.g.a.a(bVar2.f59319b.f59324a, bVar2.f59319b.f59325b, "plugin_download", i, str, j, bVar2.f59319b.j, bVar2.f59319b.f59329f, bVar2.j, map);
    }
}
