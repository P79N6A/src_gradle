package com.ss.android.ugc.aweme.share;

import a.i;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.utils.ey;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/share/ShareDownloadSuccessMonitor;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class cf {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64930a;

    /* renamed from: b  reason: collision with root package name */
    public static int f64931b = 500;

    /* renamed from: c  reason: collision with root package name */
    public static final a f64932c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/share/ShareDownloadSuccessMonitor$Companion;", "", "()V", "htmlFileNumber", "", "maxLength", "", "maxSize", "txtFileNumber", "monitorDownloadStatus", "", "filePath", "duration", "", "mUrl", "needWaterMark", "", "errorCode", "errorMsg", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;)V", "readFileToString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64933a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.share.cf$a$a  reason: collision with other inner class name */
        static final class C0698a<V> implements Callable<TResult> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64934a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f64935b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Long f64936c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f64937d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f64938e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Integer f64939f;
            final /* synthetic */ boolean g;

            C0698a(String str, Long l, String str2, String str3, Integer num, boolean z) {
                this.f64935b = str;
                this.f64936c = l;
                this.f64937d = str2;
                this.f64938e = str3;
                this.f64939f = num;
                this.g = z;
            }

            public final /* synthetic */ Object call() {
                if (PatchProxy.isSupport(new Object[0], this, f64934a, false, 73311, new Class[0], Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[0], this, f64934a, false, 73311, new Class[0], Void.class);
                }
                if (this.f64935b != null) {
                    String a2 = ey.a(this.f64935b);
                    long length = new File(this.f64935b).length();
                    CharSequence charSequence = a2;
                    boolean equals = TextUtils.equals(charSequence, "20");
                    c cVar = new c();
                    long j = 0;
                    if (this.f64936c != null) {
                        Long l = this.f64936c;
                        if (l == null || l.longValue() != 0) {
                            j = length / this.f64936c.longValue();
                        }
                    }
                    c a3 = cVar.a("download_rate", Long.valueOf(j)).a("download_duration", this.f64936c).a("file_size", Long.valueOf(length)).a("errorDesc", "null").a("errorCode", "null").a(PushConstants.WEB_URL, this.f64937d).a("needWaterMark", Boolean.FALSE).a("fileMagic", ey.a(this.f64935b)).a("isMp4", Boolean.valueOf(equals));
                    if (com.ss.android.g.a.a() && ((TextUtils.equals(charSequence, "34303330") || TextUtils.equals(charSequence, "3c21444f")) && length < 1500)) {
                        String a4 = cf.f64932c.a(this.f64935b);
                        if (!TextUtils.isEmpty(a4)) {
                            a3.a("errorFileContent", a4);
                        } else {
                            a3.a("errorFileContent", "file is null");
                        }
                    }
                    n.a("save_video_success_rate", 0, a3.b());
                } else {
                    n.a("save_video_success_rate", 1, new c().a("download_rate", (Integer) 0).a("download_duration", this.f64936c).a("file_size", (Integer) -1).a("errorDesc", this.f64938e).a("errorCode", this.f64939f).a(PushConstants.WEB_URL, this.f64937d).a("needWaterMark", Boolean.valueOf(this.g)).a("fileMagic", "download_error").a("isMp4", "notSure").b());
                }
                return null;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x007b A[SYNTHETIC, Splitter:B:20:0x007b] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[SYNTHETIC, Splitter:B:26:0x0081] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(java.lang.String r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f64933a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r7[r9] = r3
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r5 = 0
                r6 = 73310(0x11e5e, float:1.02729E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0039
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f64933a
                r13 = 0
                r14 = 73310(0x11e5e, float:1.02729E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r15[r9] = r0
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x0039:
                java.lang.StringBuffer r1 = new java.lang.StringBuffer
                r1.<init>()
                r2 = 0
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x007f, all -> 0x0078 }
                r3.<init>(r0)     // Catch:{ Throwable -> 0x007f, all -> 0x0078 }
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x007f, all -> 0x0078 }
                java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x007f, all -> 0x0078 }
                java.io.InputStream r3 = (java.io.InputStream) r3     // Catch:{ Throwable -> 0x007f, all -> 0x0078 }
                r0.<init>(r3)     // Catch:{ Throwable -> 0x007f, all -> 0x0078 }
                java.io.Reader r0 = (java.io.Reader) r0     // Catch:{ Throwable -> 0x007f, all -> 0x0078 }
                r4.<init>(r0)     // Catch:{ Throwable -> 0x007f, all -> 0x0078 }
            L_0x0052:
                java.lang.String r0 = r4.readLine()     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
                if (r0 == 0) goto L_0x006d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
                r2.<init>()     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
                r2.append(r0)     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
                java.lang.String r0 = "        "
                r2.append(r0)     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
                java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
                r1.append(r0)     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
                goto L_0x0052
            L_0x006d:
                r4.close()     // Catch:{ IOException -> 0x0071 }
                goto L_0x0084
            L_0x0071:
                goto L_0x0084
            L_0x0073:
                r0 = move-exception
                r2 = r4
                goto L_0x0079
            L_0x0076:
                r2 = r4
                goto L_0x007f
            L_0x0078:
                r0 = move-exception
            L_0x0079:
                if (r2 == 0) goto L_0x007e
                r2.close()     // Catch:{ IOException -> 0x007e }
            L_0x007e:
                throw r0
            L_0x007f:
                if (r2 == 0) goto L_0x0084
                r2.close()     // Catch:{ IOException -> 0x0071 }
            L_0x0084:
                int r0 = com.ss.android.ugc.aweme.share.cf.f64931b
                java.lang.String r2 = r1.toString()
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x009a
                java.lang.String r0 = r1.toString()
                int r0 = r0.length()
                com.ss.android.ugc.aweme.share.cf.f64931b = r0
            L_0x009a:
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "sb.toString()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                int r1 = com.ss.android.ugc.aweme.share.cf.f64931b
                if (r0 == 0) goto L_0x00b1
                java.lang.String r0 = r0.substring(r9, r1)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                return r0
            L_0x00b1:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.cf.a.a(java.lang.String):java.lang.String");
        }

        @JvmStatic
        public final void a(@Nullable String str, @Nullable Long l, @Nullable String str2, boolean z, @Nullable Integer num, @Nullable String str3) {
            if (PatchProxy.isSupport(new Object[]{str, l, str2, Byte.valueOf(z ? (byte) 1 : 0), num, str3}, this, f64933a, false, 73309, new Class[]{String.class, Long.class, String.class, Boolean.TYPE, Integer.class, String.class}, Void.TYPE)) {
                Object[] objArr = {str, l, str2, Byte.valueOf(z), num, str3};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f64933a, false, 73309, new Class[]{String.class, Long.class, String.class, Boolean.TYPE, Integer.class, String.class}, Void.TYPE);
                return;
            }
            C0698a aVar = new C0698a(str, l, str2, str3, num, z);
            i.a((Callable<TResult>) aVar);
        }
    }

    @JvmStatic
    public static final void a(@Nullable String str, @Nullable Long l, @Nullable String str2, boolean z, @Nullable Integer num, @Nullable String str3) {
        if (PatchProxy.isSupport(new Object[]{str, l, str2, Byte.valueOf(z ? (byte) 1 : 0), num, str3}, null, f64930a, true, 73308, new Class[]{String.class, Long.class, String.class, Boolean.TYPE, Integer.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str, l, str2, Byte.valueOf(z), num, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f64930a, true, 73308, new Class[]{String.class, Long.class, String.class, Boolean.TYPE, Integer.class, String.class}, Void.TYPE);
            return;
        }
        f64932c.a(str, l, str2, z, num, str3);
    }
}
