package com.ss.android.ugc.aweme.shortvideo.cut;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.publish.c;
import com.ss.android.ugc.aweme.utils.be;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001!B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0004J0\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004J\u001e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VEFrameDiskLruCache;", "T", "", "cacheDir", "", "cacheWriterAndReader", "Lcom/ss/android/ugc/aweme/shortvideo/cut/CacheWriterAndReader;", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/shortvideo/cut/CacheWriterAndReader;)V", "diskCache", "Lcom/ss/android/ugc/aweme/utils/DiskLruCache;", "kotlin.jvm.PlatformType", "getDiskCache", "()Lcom/ss/android/ugc/aweme/utils/DiskLruCache;", "diskCache$delegate", "Lkotlin/Lazy;", "clear", "", "get", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VideoFrameData;", "key", "insert", "videoFrameData", "onInsertFinish", "Lkotlin/Function1;", "", "isCacheExisted", "readFileAsFrameData", "inputStream", "Ljava/io/InputStream;", "remove", "writeFrameData2File", "outputStream", "Ljava/io/OutputStream;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class an<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66368a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f66369b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(an.class), "diskCache", "getDiskCache()Lcom/ss/android/ugc/aweme/utils/DiskLruCache;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final a f66370d = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final String f66371c;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f66372e = LazyKt.lazy(new b(this));

    /* renamed from: f  reason: collision with root package name */
    private final b<T> f66373f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VEFrameDiskLruCache$Companion;", "", "()V", "CACHE_FILE_SIZE", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/utils/DiskLruCache;", "kotlin.jvm.PlatformType", "T", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<be> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ an this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(an anVar) {
            super(0);
            this.this$0 = anVar;
        }

        public final be invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 75670, new Class[0], be.class)) {
                return be.a(new File(this.this$0.f66371c), 1, 1, 52428800);
            }
            return (be) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 75670, new Class[0], be.class);
        }
    }

    private final be b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f66368a, false, 75662, new Class[0], be.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f66368a, false, 75662, new Class[0], be.class);
        } else {
            value = this.f66372e.getValue();
        }
        return (be) value;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66368a, false, 75667, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66368a, false, 75667, new Class[0], Void.TYPE);
            return;
        }
        try {
            b().e();
            be b2 = b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "diskCache");
            b2.f75591c.delete();
        } catch (Exception unused) {
        }
    }

    public final boolean b(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f66368a, false, 75665, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f66368a, false, 75665, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "key");
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        be.c a2 = b().a(c.a(str));
        if (a2 == null) {
            return false;
        }
        a2.close();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.shortvideo.cut.as<T> a(@org.jetbrains.annotations.NotNull java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f66368a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.as> r8 = com.ss.android.ugc.aweme.shortvideo.cut.as.class
            r5 = 0
            r6 = 75664(0x12790, float:1.06028E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f66368a
            r13 = 0
            r14 = 75664(0x12790, float:1.06028E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.as> r16 = com.ss.android.ugc.aweme.shortvideo.cut.as.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.shortvideo.cut.as r0 = (com.ss.android.ugc.aweme.shortvideo.cut.as) r0
            return r0
        L_0x0039:
            java.lang.String r2 = "key"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0049
            return r3
        L_0x0049:
            com.ss.android.ugc.aweme.utils.be r2 = r17.b()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = com.ss.android.ugc.aweme.story.shootvideo.publish.c.a((java.lang.String) r18)     // Catch:{ all -> 0x00b0 }
            com.ss.android.ugc.aweme.utils.be$c r2 = r2.a((java.lang.String) r0)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00ad
            java.io.InputStream r0 = r2.a(r9)     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = "snapshot.getInputStream(0)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a9 }
            r10[r9] = r0     // Catch:{ all -> 0x00a9 }
            com.meituan.robust.ChangeQuickRedirect r12 = f66368a     // Catch:{ all -> 0x00a9 }
            r13 = 0
            r14 = 75669(0x12795, float:1.06035E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ all -> 0x00a9 }
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            r15[r9] = r3     // Catch:{ all -> 0x00a9 }
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.as> r16 = com.ss.android.ugc.aweme.shortvideo.cut.as.class
            r11 = r17
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0097
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a9 }
            r10[r9] = r0     // Catch:{ all -> 0x00a9 }
            com.meituan.robust.ChangeQuickRedirect r12 = f66368a     // Catch:{ all -> 0x00a9 }
            r13 = 0
            r14 = 75669(0x12795, float:1.06035E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ all -> 0x00a9 }
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            r15[r9] = r0     // Catch:{ all -> 0x00a9 }
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.as> r16 = com.ss.android.ugc.aweme.shortvideo.cut.as.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00a9 }
            com.ss.android.ugc.aweme.shortvideo.cut.as r0 = (com.ss.android.ugc.aweme.shortvideo.cut.as) r0     // Catch:{ all -> 0x00a9 }
            r1 = r17
            goto L_0x00a3
        L_0x0097:
            r1 = r17
            com.ss.android.ugc.aweme.shortvideo.cut.b<T> r3 = r1.f66373f     // Catch:{ all -> 0x00a7 }
            com.ss.android.ugc.aweme.shortvideo.cut.as r3 = r3.a(r0)     // Catch:{ all -> 0x00a7 }
            r0.close()     // Catch:{ all -> 0x00a7 }
            r0 = r3
        L_0x00a3:
            r2.close()
            return r0
        L_0x00a7:
            r0 = move-exception
            goto L_0x00b4
        L_0x00a9:
            r0 = move-exception
            r1 = r17
            goto L_0x00b4
        L_0x00ad:
            r1 = r17
            return r3
        L_0x00b0:
            r0 = move-exception
            r1 = r17
            r2 = r3
        L_0x00b4:
            if (r2 == 0) goto L_0x00b9
            r2.close()
        L_0x00b9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.an.a(java.lang.String):com.ss.android.ugc.aweme.shortvideo.cut.as");
    }

    public an(@NotNull String str, @NotNull b<T> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "cacheDir");
        Intrinsics.checkParameterIsNotNull(bVar, "cacheWriterAndReader");
        this.f66371c = str;
        this.f66373f = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f5 A[SYNTHETIC, Splitter:B:31:0x00f5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.shortvideo.cut.as<T> r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f66368a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.as> r5 = com.ss.android.ugc.aweme.shortvideo.cut.as.class
            r9[r12] = r5
            java.lang.Class<kotlin.jvm.functions.Function1> r5 = kotlin.jvm.functions.Function1.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r7 = 0
            r8 = 75663(0x1278f, float:1.06026E-40)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0057
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f66368a
            r17 = 0
            r18 = 75663(0x1278f, float:1.06026E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.as> r1 = com.ss.android.ugc.aweme.shortvideo.cut.as.class
            r0[r12] = r1
            java.lang.Class<kotlin.jvm.functions.Function1> r1 = kotlin.jvm.functions.Function1.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r21
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0057:
            java.lang.String r3 = "key"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.lang.String r3 = "videoFrameData"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r3)
            java.lang.String r3 = "onInsertFinish"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0075
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.invoke(r0)
            return
        L_0x0075:
            r3 = 0
            com.ss.android.ugc.aweme.utils.be r4 = r21.b()     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r0 = com.ss.android.ugc.aweme.story.shootvideo.publish.c.a((java.lang.String) r22)     // Catch:{ Exception -> 0x00f0 }
            com.ss.android.ugc.aweme.utils.be$a r0 = r4.b((java.lang.String) r0)     // Catch:{ Exception -> 0x00f0 }
            if (r0 == 0) goto L_0x00ed
            java.io.OutputStream r3 = r0.a(r11)     // Catch:{ Exception -> 0x00ea }
            if (r3 == 0) goto L_0x00ed
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x00ea }
            r4[r11] = r3     // Catch:{ Exception -> 0x00ea }
            r4[r12] = r1     // Catch:{ Exception -> 0x00ea }
            com.meituan.robust.ChangeQuickRedirect r6 = f66368a     // Catch:{ Exception -> 0x00ea }
            r7 = 0
            r8 = 75668(0x12794, float:1.06033E-40)
            java.lang.Class[] r9 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x00ea }
            java.lang.Class<java.io.OutputStream> r5 = java.io.OutputStream.class
            r9[r11] = r5     // Catch:{ Exception -> 0x00ea }
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.as> r5 = com.ss.android.ugc.aweme.shortvideo.cut.as.class
            r9[r12] = r5     // Catch:{ Exception -> 0x00ea }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00ea }
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00ea }
            if (r4 == 0) goto L_0x00cd
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x00ea }
            r14[r11] = r3     // Catch:{ Exception -> 0x00ea }
            r14[r12] = r1     // Catch:{ Exception -> 0x00ea }
            com.meituan.robust.ChangeQuickRedirect r16 = f66368a     // Catch:{ Exception -> 0x00ea }
            r17 = 0
            r18 = 75668(0x12794, float:1.06033E-40)
            java.lang.Class[] r1 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x00ea }
            java.lang.Class<java.io.OutputStream> r3 = java.io.OutputStream.class
            r1[r11] = r3     // Catch:{ Exception -> 0x00ea }
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.as> r3 = com.ss.android.ugc.aweme.shortvideo.cut.as.class
            r1[r12] = r3     // Catch:{ Exception -> 0x00ea }
            java.lang.Class r20 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00ea }
            r15 = r21
            r19 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x00ea }
            r4 = r21
            goto L_0x00da
        L_0x00cd:
            r4 = r21
            com.ss.android.ugc.aweme.shortvideo.cut.b<T> r5 = r4.f66373f     // Catch:{ Exception -> 0x00f3 }
            r5.a(r3, r1)     // Catch:{ Exception -> 0x00f3 }
            r3.flush()     // Catch:{ Exception -> 0x00f3 }
            r3.close()     // Catch:{ Exception -> 0x00f3 }
        L_0x00da:
            r0.a()     // Catch:{ Exception -> 0x00f3 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00f3 }
            r2.invoke(r1)     // Catch:{ Exception -> 0x00f3 }
            com.ss.android.ugc.aweme.utils.be r1 = r21.b()     // Catch:{ Exception -> 0x00f3 }
            r1.c()     // Catch:{ Exception -> 0x00f3 }
            goto L_0x0106
        L_0x00ea:
            r4 = r21
            goto L_0x00f3
        L_0x00ed:
            r4 = r21
            return
        L_0x00f0:
            r4 = r21
            r0 = r3
        L_0x00f3:
            if (r0 == 0) goto L_0x0101
            r0.b()     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0101
        L_0x00f9:
            r0 = move-exception
            r1 = r0
            r0 = r1
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            com.crashlytics.android.Crashlytics.logException(r0)
        L_0x0101:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.invoke(r0)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.an.a(java.lang.String, com.ss.android.ugc.aweme.shortvideo.cut.as, kotlin.jvm.functions.Function1):void");
    }
}
