package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J@\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u00102\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0010JG\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0019\b\u0004\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u00102\u0019\b\u0004\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0010H\bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contextRef", "Ljava/lang/ref/WeakReference;", "mainLooperHandler", "Landroid/os/Handler;", "downloadRnFile", "", "sourceUrl", "", "successHandler", "Lkotlin/Function1;", "Ljava/io/File;", "Lkotlin/ExtensionFunctionType;", "failHandler", "Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$RnResourceDownloadException;", "downloadRnFileImpl", "RnResourceDownloadException", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40885a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f40886b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<Context> f40887c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001d\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$RnResourceDownloadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "(Ljava/lang/Throwable;)V", "message", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends Exception {
        public a() {
            this(null, null, 3, null);
        }

        public a(@Nullable Throwable th) {
            this(null, th);
        }

        public a(@Nullable String str, @Nullable Throwable th) {
            super(str, th);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¨\u0006\u0014¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$downloadRnFileImpl$1", "Lcom/ss/android/ugc/iesdownload/interfaces/IesDownloadEnqueueListener;", "onCancel", "", "onDownloadPause", "onDownloadProgress", "progress", "", "cacheSize", "", "totalSize", "onDownloadRestart", "onDownloadStart", "id", "onDownloadSuccess", "file", "", "onError", "error", "Lcom/ss/android/ugc/iesdownload/IesDownloadError;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.ss.android.ugc.a.b.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f40889b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f40890c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function1 f40891d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Function1 f40892e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$downloadRnFile$2$1"}, k = 3, mv = {1, 1, 15})
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40893a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f40894b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f40895c;

            a(a aVar, b bVar) {
                this.f40894b = aVar;
                this.f40895c = bVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f40893a, false, 34370, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40893a, false, 34370, new Class[0], Void.TYPE);
                    return;
                }
                this.f40895c.f40891d.invoke(this.f40894b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$downloadRnFile$2$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.m$b$b  reason: collision with other inner class name */
        static final class C0527b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40896a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f40897b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f40898c;

            C0527b(a aVar, b bVar) {
                this.f40897b = aVar;
                this.f40898c = bVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f40896a, false, 34371, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40896a, false, 34371, new Class[0], Void.TYPE);
                    return;
                }
                this.f40898c.f40891d.invoke(this.f40897b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$downloadRnFile$2$1"}, k = 3, mv = {1, 1, 15})
        static final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40899a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f40900b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f40901c;

            c(a aVar, b bVar) {
                this.f40900b = aVar;
                this.f40901c = bVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f40899a, false, 34372, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40899a, false, 34372, new Class[0], Void.TYPE);
                    return;
                }
                this.f40901c.f40891d.invoke(this.f40900b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$downloadRnFile$1$1"}, k = 3, mv = {1, 1, 15})
        static final class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40902a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ File f40903b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f40904c;

            d(File file, b bVar) {
                this.f40903b = file;
                this.f40904c = bVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f40902a, false, 34373, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40902a, false, 34373, new Class[0], Void.TYPE);
                    return;
                }
                this.f40904c.f40892e.invoke(this.f40903b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$downloadRnFile$2$1"}, k = 3, mv = {1, 1, 15})
        static final class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40905a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f40906b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f40907c;

            e(a aVar, b bVar) {
                this.f40906b = aVar;
                this.f40907c = bVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f40905a, false, 34374, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40905a, false, 34374, new Class[0], Void.TYPE);
                    return;
                }
                this.f40907c.f40891d.invoke(this.f40906b);
            }
        }

        public final void onCancel() {
        }

        public final void onDownloadPause() {
        }

        public final void onDownloadProgress(int i, long j, long j2) {
        }

        public final void onDownloadStart(int i) {
        }

        public final void onError(@Nullable com.ss.android.ugc.a.c cVar) {
            String str;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f40888a, false, 34369, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f40888a, false, 34369, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE);
                return;
            }
            StringBuilder sb = new StringBuilder("download failed, ");
            if (cVar != null) {
                str = cVar.f31520b;
            } else {
                str = null;
            }
            sb.append(str);
            this.f40890c.f40886b.post(new e(new a(sb.toString(), null, 2, null), this));
        }

        public final void onDownloadSuccess(@Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f40888a, false, 34368, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f40888a, false, 34368, new Class[]{String.class}, Void.TYPE);
            } else if (str == null) {
                this.f40890c.f40886b.post(new a(new a("file is null", null, 2, null), this));
            } else {
                File file = new File(str);
                if (!file.exists()) {
                    this.f40890c.f40886b.post(new C0527b(new a("tmp file not found", new FileNotFoundException(file.getPath())), this));
                } else if (!file.renameTo(this.f40889b)) {
                    this.f40890c.f40886b.post(new c(new a("temp file rename failed", null, 2, null), this));
                } else {
                    this.f40890c.f40886b.post(new d(this.f40889b, this));
                }
            }
        }

        public b(File file, m mVar, Function1 function1, Function1 function12) {
            this.f40889b = file;
            this.f40890c = mVar;
            this.f40891d = function1;
            this.f40892e = function12;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$downloadRnFile$2$1"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f40909b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f40910c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function1 f40911d;

        c(a aVar, m mVar, Function1 function1) {
            this.f40909b = aVar;
            this.f40910c = mVar;
            this.f40911d = function1;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f40908a, false, 34375, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40908a, false, 34375, new Class[0], Void.TYPE);
                return;
            }
            this.f40911d.invoke(this.f40909b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$downloadRnFile$1$1"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f40913b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f40914c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function1 f40915d;

        d(File file, m mVar, Function1 function1) {
            this.f40913b = file;
            this.f40914c = mVar;
            this.f40915d = function1;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f40912a, false, 34376, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40912a, false, 34376, new Class[0], Void.TYPE);
                return;
            }
            this.f40915d.invoke(this.f40913b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/crossplatform/platform/rn/RnResourceDownloader$downloadRnFile$2$1"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40916a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f40917b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f40918c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function1 f40919d;

        e(a aVar, m mVar, Function1 function1) {
            this.f40917b = aVar;
            this.f40918c = mVar;
            this.f40919d = function1;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f40916a, false, 34377, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40916a, false, 34377, new Class[0], Void.TYPE);
                return;
            }
            this.f40919d.invoke(this.f40917b);
        }
    }

    public m(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f40887c = new WeakReference<>(context);
    }

    public final void a(@NotNull String str, @NotNull Function1<? super File, Unit> function1, @NotNull Function1<? super a, Unit> function12) {
        String str2 = str;
        Function1<? super File, Unit> function13 = function1;
        Function1<? super a, Unit> function14 = function12;
        if (PatchProxy.isSupport(new Object[]{str2, function13, function14}, this, f40885a, false, 34366, new Class[]{String.class, Function1.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, function13, function14}, this, f40885a, false, 34366, new Class[]{String.class, Function1.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "sourceUrl");
        Intrinsics.checkParameterIsNotNull(function13, "successHandler");
        Intrinsics.checkParameterIsNotNull(function14, "failHandler");
        Context context = (Context) this.f40887c.get();
        if (context == null) {
            this.f40886b.post(new c(new a("context is null", null, 2, null), this, function14));
            return;
        }
        File file = new File(context.getCacheDir(), "rn_source_offline");
        if (!file.exists()) {
            file.mkdirs();
        }
        String md5Hex = DigestUtils.md5Hex(str);
        File file2 = new File(file, md5Hex + ".jsbundle");
        if (file2.exists()) {
            this.f40886b.post(new d(file2, this, function13));
            return;
        }
        File file3 = new File(file, md5Hex + ".jsbundle.tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            file3.createNewFile();
            com.ss.android.ugc.a.d.a().a(new e.a().a(str2).b(file3.getPath()).a(), (com.ss.android.ugc.a.b.d) new b(file2, this, function14, function13));
        } catch (IOException e2) {
            this.f40886b.post(new e(new a("temp file failed", e2), this, function14));
        }
    }
}
