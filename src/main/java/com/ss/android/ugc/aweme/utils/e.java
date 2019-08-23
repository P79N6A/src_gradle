package com.ss.android.ugc.aweme.utils;

import a.i;
import android.app.Application;
import android.os.Build;
import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/AndroidQPathManager;", "", "()V", "lruCache", "Landroid/util/LruCache;", "", "checkFilePersonal", "", "path", "getAdaptionPath", "filePath", "type", "Lcom/ss/android/ugc/aweme/utils/MediaType;", "getAdaptionPaths", "", "filePaths", "getContentUri", "Landroid/net/Uri;", "getSelectionByMediaType", "getUriFromPath", "needConvert", "preloadAdaptionPath", "", "Companion", "SingletonHolder", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75795a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final e f75796b = b.f75799a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f75797c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final LruCache<String, String> f75798d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/AndroidQPathManager$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/utils/AndroidQPathManager;", "instance$annotations", "getInstance", "()Lcom/ss/android/ugc/aweme/utils/AndroidQPathManager;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        @NotNull
        public static e a() {
            return e.f75796b;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/AndroidQPathManager$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/ugc/aweme/utils/AndroidQPathManager;", "getHolder", "()Lcom/ss/android/ugc/aweme/utils/AndroidQPathManager;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class b {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        static final e f75799a = new e((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f75800b = new b();

        private b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class c<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75801a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f75802b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f75803c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ co f75804d;

        c(e eVar, String str, co coVar) {
            this.f75802b = eVar;
            this.f75803c = str;
            this.f75804d = coVar;
        }

        public final /* synthetic */ Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f75801a, false, 87874, new Class[0], String.class)) {
                return this.f75802b.b(this.f75803c, this.f75804d);
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f75801a, false, 87874, new Class[0], String.class);
        }
    }

    @NotNull
    public static final e a() {
        return f75796b;
    }

    private e() {
        this.f75798d = new LruCache<>(30);
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    private final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f75795a, false, 87869, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f75795a, false, 87869, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenSDKQAdaption) || ((Build.VERSION.SDK_INT <= 28 && !com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SDKQAdaptionConfig)) || b(str))) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean b(String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75795a, false, 87871, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f75795a, false, 87871, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        File externalFilesDir = com.ss.android.ugc.aweme.port.in.a.f61119b.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            String absolutePath = externalFilesDir.getAbsolutePath();
            Intrinsics.checkExpressionValueIsNotNull(absolutePath, "it.absolutePath");
            z = StringsKt.startsWith$default(str2, absolutePath, false, 2, null);
        } else {
            z = false;
        }
        if (!z) {
            Application application = com.ss.android.ugc.aweme.port.in.a.f61119b;
            Intrinsics.checkExpressionValueIsNotNull(application, "AVEnv.application");
            File filesDir = application.getFilesDir();
            Intrinsics.checkExpressionValueIsNotNull(filesDir, "AVEnv.application.filesDir");
            String absolutePath2 = filesDir.getAbsolutePath();
            Intrinsics.checkExpressionValueIsNotNull(absolutePath2, "AVEnv.application.filesDir.absolutePath");
            if (StringsKt.startsWith$default(str2, absolutePath2, false, 2, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final List<String> a(@NotNull List<String> list, @NotNull co coVar) {
        List<String> list2 = list;
        co coVar2 = coVar;
        if (PatchProxy.isSupport(new Object[]{list2, coVar2}, this, f75795a, false, 87867, new Class[]{List.class, co.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2, coVar2}, this, f75795a, false, 87867, new Class[]{List.class, co.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "filePaths");
        Intrinsics.checkParameterIsNotNull(coVar2, "type");
        List<String> arrayList = new ArrayList<>();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(f75796b.b(list2.get(i), coVar2));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        if (r8 == false) goto L_0x009d;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.utils.co r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f75795a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.utils.co> r1 = com.ss.android.ugc.aweme.utils.co.class
            r5[r9] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r3 = 0
            r4 = 87868(0x1573c, float:1.23129E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0042
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f75795a
            r3 = 0
            r4 = 87868(0x1573c, float:1.23129E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.utils.co> r1 = com.ss.android.ugc.aweme.utils.co.class
            r5[r9] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0042:
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            boolean r0 = r10.a(r11)
            if (r0 == 0) goto L_0x009c
            android.util.LruCache<java.lang.String, java.lang.String> r0 = r10.f75798d
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0068
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r1 = 0
            goto L_0x0069
        L_0x0068:
            r1 = 1
        L_0x0069:
            if (r1 == 0) goto L_0x008d
            android.net.Uri r0 = r10.c(r11, r12)
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = r0.toString()
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0085
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r1 = 0
            goto L_0x0086
        L_0x0085:
            r1 = 1
        L_0x0086:
            if (r1 != 0) goto L_0x008d
            android.util.LruCache<java.lang.String, java.lang.String> r1 = r10.f75798d
            r1.put(r11, r0)
        L_0x008d:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0098
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0099
        L_0x0098:
            r8 = 1
        L_0x0099:
            if (r8 != 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r0 = r11
        L_0x009d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.e.b(java.lang.String, com.ss.android.ugc.aweme.utils.co):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014c, code lost:
        if (r1 != null) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.net.Uri c(java.lang.String r20, com.ss.android.ugc.aweme.utils.co r21) {
        /*
            r19 = this;
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r5 = f75795a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.utils.co> r4 = com.ss.android.ugc.aweme.utils.co.class
            r8[r11] = r4
            java.lang.Class<android.net.Uri> r9 = android.net.Uri.class
            r6 = 0
            r7 = 87870(0x1573e, float:1.23132E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r14 = f75795a
            r15 = 0
            r16 = 87870(0x1573e, float:1.23132E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.utils.co> r1 = com.ss.android.ugc.aweme.utils.co.class
            r0[r11] = r1
            java.lang.Class<android.net.Uri> r18 = android.net.Uri.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
        L_0x0046:
            java.lang.System.currentTimeMillis()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r3[r10] = r21     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            com.meituan.robust.ChangeQuickRedirect r5 = f75795a     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r6 = 0
            r7 = 87872(0x15740, float:1.23135E-40)
            java.lang.Class[] r8 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.Class<com.ss.android.ugc.aweme.utils.co> r4 = com.ss.android.ugc.aweme.utils.co.class
            r8[r10] = r4     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            if (r3 == 0) goto L_0x0081
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r12[r10] = r21     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            com.meituan.robust.ChangeQuickRedirect r14 = f75795a     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r15 = 0
            r16 = 87872(0x15740, float:1.23135E-40)
            java.lang.Class[] r3 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.Class<com.ss.android.ugc.aweme.utils.co> r4 = com.ss.android.ugc.aweme.utils.co.class
            r3[r10] = r4     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r13 = r19
            r17 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            goto L_0x0098
        L_0x0081:
            int[] r3 = com.ss.android.ugc.aweme.utils.f.f75862a     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            int r4 = r21.ordinal()     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r3 = r3[r4]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            switch(r3) {
                case 1: goto L_0x0096;
                case 2: goto L_0x0093;
                case 3: goto L_0x0090;
                default: goto L_0x008c;
            }     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
        L_0x008c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            goto L_0x0140
        L_0x0090:
            java.lang.String r3 = "_data= ?"
            goto L_0x0098
        L_0x0093:
            java.lang.String r3 = "_data= ?"
            goto L_0x0098
        L_0x0096:
            java.lang.String r3 = "_data= ?"
        L_0x0098:
            r7 = r3
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r8[r10] = r20     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.String r0 = "_id"
            r6[r10] = r0     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            android.app.Application r0 = com.ss.android.ugc.aweme.port.in.a.f61119b     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.String r3 = "AVEnv.application"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            android.content.ContentResolver r4 = r0.getContentResolver()     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r12[r10] = r21     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            com.meituan.robust.ChangeQuickRedirect r14 = f75795a     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r15 = 0
            r16 = 87873(0x15741, float:1.23136E-40)
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.Class<com.ss.android.ugc.aweme.utils.co> r3 = com.ss.android.ugc.aweme.utils.co.class
            r0[r10] = r3     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.Class<android.net.Uri> r18 = android.net.Uri.class
            r13 = r19
            r17 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            if (r0 == 0) goto L_0x00e7
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r12[r10] = r21     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            com.meituan.robust.ChangeQuickRedirect r14 = f75795a     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r15 = 0
            r16 = 87873(0x15741, float:1.23136E-40)
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.Class<com.ss.android.ugc.aweme.utils.co> r1 = com.ss.android.ugc.aweme.utils.co.class
            r0[r10] = r1     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.Class<android.net.Uri> r18 = android.net.Uri.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            android.net.Uri r0 = (android.net.Uri) r0     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            goto L_0x010c
        L_0x00e7:
            int[] r0 = com.ss.android.ugc.aweme.utils.f.f75863b     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            int r1 = r21.ordinal()     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            switch(r0) {
                case 1: goto L_0x0105;
                case 2: goto L_0x00fd;
                case 3: goto L_0x00f5;
                default: goto L_0x00f2;
            }     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
        L_0x00f2:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            goto L_0x013c
        L_0x00f5:
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.String r1 = "MediaStore.Audio.Media.EXTERNAL_CONTENT_URI"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            goto L_0x010c
        L_0x00fd:
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.String r1 = "MediaStore.Video.Media.EXTERNAL_CONTENT_URI"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            goto L_0x010c
        L_0x0105:
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            java.lang.String r1 = "MediaStore.Images.Media.EXTERNAL_CONTENT_URI"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
        L_0x010c:
            r5 = r0
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            if (r1 != 0) goto L_0x011b
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ Exception -> 0x014c, all -> 0x0118 }
            goto L_0x011b
        L_0x0118:
            r0 = move-exception
            r2 = r1
            goto L_0x0145
        L_0x011b:
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x014c, all -> 0x0118 }
            if (r0 == 0) goto L_0x014e
            java.lang.String r0 = r1.getString(r10)     // Catch:{ Exception -> 0x014c, all -> 0x0118 }
            java.lang.String r3 = "external"
            android.net.Uri r3 = android.provider.MediaStore.Files.getContentUri(r3)     // Catch:{ Exception -> 0x014c, all -> 0x0118 }
            java.lang.String r4 = "id"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)     // Catch:{ Exception -> 0x014c, all -> 0x0118 }
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x014c, all -> 0x0118 }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r3, r4)     // Catch:{ Exception -> 0x014c, all -> 0x0118 }
            r1.close()
            return r0
        L_0x013c:
            r0.<init>()     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            throw r0     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
        L_0x0140:
            r0.<init>()     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
            throw r0     // Catch:{ Exception -> 0x014b, all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
        L_0x0145:
            if (r2 == 0) goto L_0x014a
            r2.close()
        L_0x014a:
            throw r0
        L_0x014b:
            r1 = r2
        L_0x014c:
            if (r1 == 0) goto L_0x0151
        L_0x014e:
            r1.close()
        L_0x0151:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.e.c(java.lang.String, com.ss.android.ugc.aweme.utils.co):android.net.Uri");
    }

    public final void a(@NotNull String str, @NotNull co coVar) {
        String str2 = str;
        co coVar2 = coVar;
        if (PatchProxy.isSupport(new Object[]{str2, coVar2}, this, f75795a, false, 87866, new Class[]{String.class, co.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, coVar2}, this, f75795a, false, 87866, new Class[]{String.class, co.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "filePath");
        Intrinsics.checkParameterIsNotNull(coVar2, "type");
        i.a((Callable<TResult>) new c<TResult>(this, str2, coVar2));
    }
}
