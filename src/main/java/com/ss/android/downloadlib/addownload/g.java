package com.ss.android.downloadlib.addownload;

import android.content.ContentValues;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.downloadlib.a;
import com.ss.android.downloadlib.addownload.d.b;
import com.ss.android.downloadlib.c.f;
import com.ss.android.downloadlib.core.download.l;
import com.ss.android.downloadlib.e;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Iterator;
import org.json.JSONObject;

public final class g implements l {

    /* renamed from: a  reason: collision with root package name */
    Context f28801a;

    public g(Context context) {
        this.f28801a = context.getApplicationContext();
    }

    private static void a(long j) {
        try {
            ContentValues contentValues = new ContentValues();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_using_new", 0);
            contentValues.put(PushConstants.EXTRA, jSONObject.toString());
            a.a().a(String.valueOf(j), contentValues);
        } catch (Exception unused) {
        }
    }

    static b a(String str) {
        String str2;
        long j;
        boolean z;
        long j2 = 0;
        try {
            String[] split = str.split("##");
            j = Long.parseLong(split[0]);
            try {
                if (split.length > 2) {
                    str2 = split[2];
                    try {
                        if (split.length > 3) {
                            z = TextUtils.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, split[3]);
                            try {
                                if (split.length > 4) {
                                    j2 = Long.parseLong(split[4]);
                                }
                            } catch (Exception unused) {
                            }
                            return new b.a().a(j).a(str2).a(z).b(j2).a();
                        }
                    } catch (Exception unused2) {
                    }
                    z = false;
                    return new b.a().a(j).a(str2).a(z).b(j2).a();
                }
            } catch (Exception unused3) {
            }
            str2 = "";
        } catch (Exception unused4) {
            str2 = "";
            j = 0;
        }
        z = false;
        return new b.a().a(j).a(str2).a(z).b(j2).a();
    }

    public static void b(DownloadInfo downloadInfo, String str) {
        Iterator<com.ss.android.download.api.b.a.a> it2 = e.a().f29049b.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public static void a(DownloadInfo downloadInfo, String str) {
        for (com.ss.android.download.api.b.a.a a2 : e.a().f29049b) {
            a2.a(downloadInfo, str);
        }
    }

    public final void a(final Context context, final String str) {
        if (f.a()) {
            new StringBuilder("DownloadReceiver packageName = ").append(str);
        }
        com.ss.android.downloadlib.c.a.a.a(new AsyncTask<Void, Void, Long>() {
            /* JADX WARNING: Can't wrap try/catch for region: R(10:10|(1:12)|13|(4:15|(2:17|(1:19)(2:20|(4:63|23|(2:25|26)|27)))|21|(0))|29|30|(3:32|33|(1:35)(1:36))|37|38|8) */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
                if (r4 != null) goto L_0x00dd;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
                r4.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x00eb, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ec, code lost:
                if (r4 != null) goto L_0x00ee;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
                r4.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f2, code lost:
                if (r4 == null) goto L_0x00f5;
             */
            /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d6 */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x00eb A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:37:0x00d6] */
            /* JADX WARNING: Removed duplicated region for block: B:63:0x007f A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private java.lang.Long a() {
                /*
                    r17 = this;
                    r1 = r17
                    android.content.Context r0 = r3
                    r2 = 0
                    if (r0 == 0) goto L_0x00fa
                    java.lang.String r0 = r4
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x0012
                    goto L_0x00fa
                L_0x0012:
                    android.content.Context r0 = r3
                    com.ss.android.downloadlib.core.download.d r0 = com.ss.android.downloadlib.core.download.d.a((android.content.Context) r0)
                    com.ss.android.downloadlib.core.download.d$b r4 = new com.ss.android.downloadlib.core.download.d$b
                    r4.<init>()
                    r5 = 8
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    r4.f28969a = r5
                    android.database.Cursor r4 = r0.a((com.ss.android.downloadlib.core.download.d.b) r4)
                    boolean r0 = r4.moveToFirst()     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    if (r0 == 0) goto L_0x00e1
                L_0x002f:
                    boolean r0 = r4.isAfterLast()     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    if (r0 != 0) goto L_0x00db
                    java.lang.String r0 = "local_filename"
                    int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    java.lang.String r5 = "_id"
                    int r5 = r4.getColumnIndexOrThrow(r5)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    long r14 = r4.getLong(r5)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    java.lang.String r5 = "time_cost"
                    int r5 = r4.getColumnIndexOrThrow(r5)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    long r12 = r4.getLong(r5)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    boolean r5 = com.ss.android.downloadlib.c.f.a()     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    if (r5 == 0) goto L_0x0063
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    java.lang.String r6 = "handleAppInstalled id = "
                    r5.<init>(r6)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    r5.append(r14)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                L_0x0063:
                    boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    if (r5 != 0) goto L_0x009f
                    android.content.Context r5 = r3     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    java.lang.String r6 = r4     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    boolean r0 = com.ss.android.downloadlib.c.k.a((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r6)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    if (r0 != 0) goto L_0x007c
                    boolean r0 = com.ss.android.downloadlib.c.k.b(r5, r6)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    if (r0 == 0) goto L_0x007a
                    goto L_0x007c
                L_0x007a:
                    r0 = 0
                    goto L_0x007d
                L_0x007c:
                    r0 = 1
                L_0x007d:
                    if (r0 == 0) goto L_0x009f
                    com.ss.android.downloadlib.addownload.g r6 = com.ss.android.downloadlib.addownload.g.this     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    r9 = 4
                    java.lang.String r10 = r4     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    r11 = 200(0xc8, float:2.8E-43)
                    r7 = r14
                    r6.a(r7, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    android.content.Context r0 = r3     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    com.ss.android.downloadlib.core.download.e r0 = com.ss.android.downloadlib.core.download.e.a((android.content.Context) r0)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    android.content.Context r5 = r3     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    r0.a((android.content.Context) r5, (long) r14)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    if (r4 == 0) goto L_0x009e
                    r4.close()     // Catch:{ Exception -> 0x009e }
                L_0x009e:
                    return r0
                L_0x009f:
                    com.ss.android.downloadlib.addownload.g r0 = com.ss.android.downloadlib.addownload.g.this     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    java.lang.String r5 = r4     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    android.content.Context r0 = r0.f28801a     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    if (r0 == 0) goto L_0x00d6
                    com.ss.android.downloadlib.core.download.e r0 = com.ss.android.downloadlib.core.download.e.a((android.content.Context) r0)     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    java.lang.String r0 = r0.a((long) r14)     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    if (r6 == 0) goto L_0x00b6
                    goto L_0x00d6
                L_0x00b6:
                    org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    r15.<init>()     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    java.lang.String r6 = "package_name"
                    r15.put(r6, r5)     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    com.ss.android.downloadlib.addownload.d.b r0 = com.ss.android.downloadlib.addownload.g.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    java.lang.String r7 = com.ss.android.downloadlib.addownload.k.l()     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    java.lang.String r8 = "deeplink_installed_package_name_match_fail"
                    r9 = 1
                    long r10 = r0.f28760a     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    java.lang.String r12 = r0.f28762c     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    long r13 = r0.f28761b     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                    r16 = 2
                    com.ss.android.downloadlib.addownload.j.a(r7, r8, r9, r10, r12, r13, r15, r16)     // Catch:{ Exception -> 0x00d6, all -> 0x00eb }
                L_0x00d6:
                    r4.moveToNext()     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    goto L_0x002f
                L_0x00db:
                    if (r4 == 0) goto L_0x00f5
                L_0x00dd:
                    r4.close()     // Catch:{ Exception -> 0x00f5 }
                    goto L_0x00f5
                L_0x00e1:
                    java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x00f2, all -> 0x00eb }
                    if (r4 == 0) goto L_0x00ea
                    r4.close()     // Catch:{ Exception -> 0x00ea }
                L_0x00ea:
                    return r0
                L_0x00eb:
                    r0 = move-exception
                    if (r4 == 0) goto L_0x00f1
                    r4.close()     // Catch:{ Exception -> 0x00f1 }
                L_0x00f1:
                    throw r0
                L_0x00f2:
                    if (r4 == 0) goto L_0x00f5
                    goto L_0x00dd
                L_0x00f5:
                    java.lang.Long r0 = java.lang.Long.valueOf(r2)
                    return r0
                L_0x00fa:
                    java.lang.Long r0 = java.lang.Long.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.g.AnonymousClass1.a():java.lang.Long");
            }

            /* access modifiers changed from: protected */
            public final /* synthetic */ Object doInBackground(Object[] objArr) {
                return a();
            }

            /* access modifiers changed from: protected */
            public final /* synthetic */ void onPostExecute(Object obj) {
                Long l = (Long) obj;
                super.onPostExecute(l);
                if (l.longValue() == 0) {
                    g.b(null, str);
                } else {
                    b.a().a(str);
                }
            }
        }, new Void[0]);
        a.a().a(str);
    }

    private static void a(long j, String str, long j2, String str2) {
        if (j > 0) {
            j.a("download_notificaion", str2, true, j, str, j2, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0141, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r24, int r26, java.lang.String r27, int r28, long r29) {
        /*
            r23 = this;
            r8 = r24
            r11 = r27
            r14 = r23
            android.content.Context r12 = r14.f28801a
            if (r12 != 0) goto L_0x000b
            return
        L_0x000b:
            com.ss.android.downloadlib.core.download.e r0 = com.ss.android.downloadlib.core.download.e.a((android.content.Context) r12)     // Catch:{ Exception -> 0x0142 }
            java.lang.String r0 = r0.a((long) r8)     // Catch:{ Exception -> 0x0142 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0142 }
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            com.ss.android.downloadlib.addownload.d.b r13 = a((java.lang.String) r0)     // Catch:{ Exception -> 0x0142 }
            switch(r26) {
                case 1: goto L_0x0101;
                case 2: goto L_0x00ed;
                case 3: goto L_0x00d9;
                case 4: goto L_0x0092;
                case 5: goto L_0x004d;
                case 6: goto L_0x0038;
                case 7: goto L_0x0023;
                default: goto L_0x0021;
            }     // Catch:{ Exception -> 0x0142 }
        L_0x0021:
            goto L_0x0141
        L_0x0023:
            long r0 = r13.f28760a     // Catch:{ Exception -> 0x0142 }
            java.lang.String r2 = r13.f28762c     // Catch:{ Exception -> 0x0142 }
            long r3 = r13.f28761b     // Catch:{ Exception -> 0x0142 }
            java.lang.String r5 = "click_item"
            r24 = r0
            r26 = r2
            r27 = r3
            r29 = r5
            a(r24, r26, r27, r29)     // Catch:{ Exception -> 0x0142 }
            goto L_0x0141
        L_0x0038:
            long r0 = r13.f28760a     // Catch:{ Exception -> 0x0142 }
            java.lang.String r2 = r13.f28762c     // Catch:{ Exception -> 0x0142 }
            long r3 = r13.f28761b     // Catch:{ Exception -> 0x0142 }
            java.lang.String r5 = "click_install"
            r24 = r0
            r26 = r2
            r27 = r3
            r29 = r5
            a(r24, r26, r27, r29)     // Catch:{ Exception -> 0x0142 }
            goto L_0x0142
        L_0x004d:
            long r2 = r13.f28760a     // Catch:{ Exception -> 0x0142 }
            long r4 = r13.f28761b     // Catch:{ Exception -> 0x0142 }
            java.lang.String r6 = r13.f28762c     // Catch:{ Exception -> 0x0142 }
            boolean r7 = r13.f28763d     // Catch:{ Exception -> 0x0142 }
            r0 = 490(0x1ea, float:6.87E-43)
            r10 = r28
            if (r10 != r0) goto L_0x006a
            com.ss.android.downloadlib.a.a()     // Catch:{ Exception -> 0x0142 }
            r18 = 0
            r21 = 1
            r15 = r2
            r17 = r28
            r19 = r29
            com.ss.android.downloadlib.a.a(r15, r17, r18, r19, r21)     // Catch:{ Exception -> 0x0142 }
        L_0x006a:
            android.net.Uri r0 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ Exception -> 0x0142 }
            android.net.Uri r18 = android.content.ContentUris.withAppendedId(r0, r8)     // Catch:{ Exception -> 0x0142 }
            com.ss.android.downloadlib.core.download.d r0 = com.ss.android.downloadlib.core.download.d.a((android.content.Context) r12)     // Catch:{ Exception -> 0x0142 }
            com.ss.android.downloadlib.core.download.a r15 = r0.f28953c     // Catch:{ Exception -> 0x0142 }
            r16 = 0
            com.ss.android.downloadlib.addownload.g$4 r17 = new com.ss.android.downloadlib.addownload.g$4     // Catch:{ Exception -> 0x0142 }
            r0 = r17
            r1 = r23
            r8 = r24
            r10 = r28
            r0.<init>(r2, r4, r6, r7, r8, r10)     // Catch:{ Exception -> 0x0142 }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r15.a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0142 }
            goto L_0x0141
        L_0x0092:
            long r2 = r13.f28760a     // Catch:{ Exception -> 0x0142 }
            long r4 = r13.f28761b     // Catch:{ Exception -> 0x0142 }
            java.lang.String r6 = r13.f28762c     // Catch:{ Exception -> 0x0142 }
            boolean r7 = r13.f28763d     // Catch:{ Exception -> 0x0142 }
            android.net.Uri r0 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ Exception -> 0x0142 }
            android.net.Uri r18 = android.content.ContentUris.withAppendedId(r0, r8)     // Catch:{ Exception -> 0x0142 }
            com.ss.android.downloadlib.core.download.d r0 = com.ss.android.downloadlib.core.download.d.a((android.content.Context) r12)     // Catch:{ Exception -> 0x0142 }
            com.ss.android.downloadlib.core.download.a r15 = r0.f28953c     // Catch:{ Exception -> 0x0142 }
            r16 = 0
            com.ss.android.downloadlib.addownload.g$3 r17 = new com.ss.android.downloadlib.addownload.g$3     // Catch:{ Exception -> 0x0142 }
            r0 = r17
            r1 = r23
            r8 = r24
            r10 = r27
            r0.<init>(r2, r4, r6, r7, r8, r10)     // Catch:{ Exception -> 0x0142 }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r15.a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0142 }
            com.ss.android.downloadlib.addownload.a r0 = com.ss.android.downloadlib.addownload.a.a()     // Catch:{ Exception -> 0x0142 }
            long r1 = r13.f28760a     // Catch:{ Exception -> 0x0142 }
            r0.a((java.lang.String) r11, (long) r1)     // Catch:{ Exception -> 0x0142 }
            com.ss.android.downloadlib.addownload.a r0 = com.ss.android.downloadlib.addownload.a.a()     // Catch:{ Exception -> 0x0142 }
            r0.a((android.content.Context) r12, (java.lang.String) r11)     // Catch:{ Exception -> 0x0142 }
            com.ss.android.downloadlib.addownload.a.a r0 = com.ss.android.downloadlib.addownload.a.a.a()     // Catch:{ Exception -> 0x0142 }
            r0.a(r11)     // Catch:{ Exception -> 0x0142 }
            goto L_0x0142
        L_0x00d9:
            long r0 = r13.f28760a     // Catch:{ Exception -> 0x0142 }
            java.lang.String r2 = r13.f28762c     // Catch:{ Exception -> 0x0142 }
            long r3 = r13.f28761b     // Catch:{ Exception -> 0x0142 }
            java.lang.String r5 = "click_continue"
            r24 = r0
            r26 = r2
            r27 = r3
            r29 = r5
            a(r24, r26, r27, r29)     // Catch:{ Exception -> 0x0142 }
            goto L_0x0142
        L_0x00ed:
            long r0 = r13.f28760a     // Catch:{ Exception -> 0x0142 }
            java.lang.String r2 = r13.f28762c     // Catch:{ Exception -> 0x0142 }
            long r3 = r13.f28761b     // Catch:{ Exception -> 0x0142 }
            java.lang.String r5 = "click_pause"
            r24 = r0
            r26 = r2
            r27 = r3
            r29 = r5
            a(r24, r26, r27, r29)     // Catch:{ Exception -> 0x0142 }
            goto L_0x0142
        L_0x0101:
            long r2 = r13.f28760a     // Catch:{ Exception -> 0x0142 }
            long r6 = r13.f28761b     // Catch:{ Exception -> 0x0142 }
            java.lang.String r4 = r13.f28762c     // Catch:{ Exception -> 0x0142 }
            boolean r5 = r13.f28763d     // Catch:{ Exception -> 0x0142 }
            a((long) r2)     // Catch:{ Exception -> 0x0142 }
            com.ss.android.downloadlib.a r0 = com.ss.android.downloadlib.a.a()     // Catch:{ Exception -> 0x0142 }
            r0.a((long) r2, (java.lang.String) r11)     // Catch:{ Exception -> 0x0142 }
            android.net.Uri r0 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ Exception -> 0x0142 }
            android.net.Uri r18 = android.content.ContentUris.withAppendedId(r0, r8)     // Catch:{ Exception -> 0x0142 }
            com.ss.android.downloadlib.core.download.d r0 = com.ss.android.downloadlib.core.download.d.a((android.content.Context) r12)     // Catch:{ Exception -> 0x0142 }
            com.ss.android.downloadlib.core.download.a r15 = r0.f28953c     // Catch:{ Exception -> 0x0142 }
            r16 = 0
            com.ss.android.downloadlib.addownload.g$2 r17 = new com.ss.android.downloadlib.addownload.g$2     // Catch:{ Exception -> 0x0142 }
            r0 = r17
            r1 = r23
            r19 = r6
            r6 = r24
            r8 = r19
            r10 = r27
            r11 = r12
            r12 = r29
            r0.<init>(r2, r4, r5, r6, r8, r10, r11, r12)     // Catch:{ Exception -> 0x0142 }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r15.a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0142 }
            goto L_0x0142
        L_0x0141:
            return
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.g.a(long, int, java.lang.String, int, long):void");
    }
}
