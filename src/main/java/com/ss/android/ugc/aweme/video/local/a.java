package com.ss.android.ugc.aweme.video.local;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f*\u0001\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ0\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J6\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\bJ\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\nH\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\n\n\u0002\u0010\u0006\u0012\u0004\b\u0005\u0010\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/video/local/DownloaderVideoWrapper;", "", "()V", "mAbsDownloadListener", "com/ss/android/ugc/aweme/video/local/DownloaderVideoWrapper$mAbsDownloadListener$1", "mAbsDownloadListener$annotations", "Lcom/ss/android/ugc/aweme/video/local/DownloaderVideoWrapper$mAbsDownloadListener$1;", "mIesDownloadEnqueueListener", "Lcom/ss/android/ugc/iesdownload/interfaces/IesDownloadEnqueueListener;", "mTaskId", "", "cancel", "", "context", "Landroid/content/Context;", "download", "originalUrl", "", "url", "fileName", "fileSaveDirectory", "downloadVideo", "sourceId", "removeCurrentTask", "setIesDownloadEnqueueListener", "iesDownloadEnqueueListener", "updateProgress", "taskId", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76129a = null;

    /* renamed from: d  reason: collision with root package name */
    public static final String f76130d = f76130d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0795a f76131e = new C0795a((byte) 0);
    private static final Map<String, Integer> g = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    public int f76132b = -1;

    /* renamed from: c  reason: collision with root package name */
    public d f76133c;

    /* renamed from: f  reason: collision with root package name */
    private final c f76134f = new c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000RN\u0010\t\u001aB\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\b0\b \u000b* \u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\b0\b\u0018\u00010\f0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/video/local/DownloaderVideoWrapper$Companion;", "", "()V", "TAG", "", "cacheSize", "", "percent", "", "sTaskIdMap", "", "kotlin.jvm.PlatformType", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.video.local.a$a  reason: collision with other inner class name */
    public static final class C0795a {
        private C0795a() {
        }

        public /* synthetic */ C0795a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/video/local/DownloaderVideoWrapper$downloadVideo$isLocalAvailable$1", "Lcom/ss/android/ugc/aweme/video/local/LocalVideoPlayerManager$DownloadLocalVideoListener;", "onFailed", "", "onSuccess", "filePath", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements LocalVideoPlayerManager.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76135a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f76136b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f76137c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f76138d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f76139e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f76140f;
        final /* synthetic */ String g;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f76135a, false, 89114, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f76135a, false, 89114, new Class[0], Void.TYPE);
                return;
            }
            this.f76136b.f76132b = this.f76136b.a(this.f76137c, this.f76138d, this.f76139e, this.f76140f, this.g);
        }

        public final void a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f76135a, false, 89113, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f76135a, false, 89113, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "filePath");
            File file = new File(str2);
            d dVar = this.f76136b.f76133c;
            if (dVar != null) {
                dVar.onDownloadProgress(100, file.length(), file.length());
            }
            d dVar2 = this.f76136b.f76133c;
            if (dVar2 != null) {
                dVar2.onDownloadSuccess(str2);
            }
        }

        b(a aVar, Context context, String str, String str2, String str3, String str4) {
            this.f76136b = aVar;
            this.f76137c = context;
            this.f76138d = str;
            this.f76139e = str2;
            this.f76140f = str3;
            this.g = str4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/ugc/aweme/video/local/DownloaderVideoWrapper$mAbsDownloadListener$1", "Lcom/ss/android/socialbase/downloader/depend/AbsDownloadListener;", "onCanceled", "", "entity", "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;", "onFailed", "e", "Lcom/ss/android/socialbase/downloader/exception/BaseException;", "onFirstStart", "onFirstSuccess", "onPause", "onPrepare", "onProgress", "onRetry", "onRetryDelay", "onStart", "onSuccessed", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f76142b;

        public final void onFirstStart(@Nullable DownloadInfo downloadInfo) {
        }

        public final void onFirstSuccess(@Nullable DownloadInfo downloadInfo) {
        }

        public final void onPrepare(@Nullable DownloadInfo downloadInfo) {
        }

        public final void onRetry(@Nullable DownloadInfo downloadInfo, @Nullable BaseException baseException) {
        }

        public final void onRetryDelay(@Nullable DownloadInfo downloadInfo, @Nullable BaseException baseException) {
        }

        c(a aVar) {
            this.f76142b = aVar;
        }

        public final void onCanceled(@Nullable DownloadInfo downloadInfo) {
            if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f76141a, false, 89120, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f76141a, false, 89120, new Class[]{DownloadInfo.class}, Void.TYPE);
                return;
            }
            d dVar = this.f76142b.f76133c;
            if (dVar != null) {
                dVar.onCancel();
            }
        }

        public final void onPause(@Nullable DownloadInfo downloadInfo) {
            if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f76141a, false, 89117, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f76141a, false, 89117, new Class[]{DownloadInfo.class}, Void.TYPE);
                return;
            }
            d dVar = this.f76142b.f76133c;
            if (dVar != null) {
                dVar.onDownloadPause();
            }
        }

        public final void onProgress(@Nullable DownloadInfo downloadInfo) {
            if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f76141a, false, 89116, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f76141a, false, 89116, new Class[]{DownloadInfo.class}, Void.TYPE);
                return;
            }
            if (downloadInfo != null) {
                d dVar = this.f76142b.f76133c;
                if (dVar != null) {
                    dVar.onDownloadProgress((int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f), 0, downloadInfo.getTotalBytes());
                }
            }
        }

        public final void onStart(@Nullable DownloadInfo downloadInfo) {
            if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f76141a, false, 89115, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f76141a, false, 89115, new Class[]{DownloadInfo.class}, Void.TYPE);
                return;
            }
            if (downloadInfo != null) {
                d dVar = this.f76142b.f76133c;
                if (dVar != null) {
                    dVar.onDownloadStart(downloadInfo.getId());
                }
            }
        }

        public final void onSuccessed(@Nullable DownloadInfo downloadInfo) {
            String str;
            if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f76141a, false, 89118, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f76141a, false, 89118, new Class[]{DownloadInfo.class}, Void.TYPE);
                return;
            }
            d dVar = this.f76142b.f76133c;
            if (dVar != null) {
                if (downloadInfo != null) {
                    str = downloadInfo.getTargetFilePath();
                } else {
                    str = null;
                }
                dVar.onDownloadSuccess(str);
            }
        }

        public final void onFailed(@Nullable DownloadInfo downloadInfo, @Nullable BaseException baseException) {
            if (PatchProxy.isSupport(new Object[]{downloadInfo, baseException}, this, f76141a, false, 89119, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo, baseException}, this, f76141a, false, 89119, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.a.c a2 = com.ss.android.ugc.a.c.a();
            if (baseException != null) {
                a2.a(baseException.getErrorCode());
                a2.a(baseException.getErrorMessage());
            }
            d dVar = this.f76142b.f76133c;
            if (dVar != null) {
                dVar.onError(a2);
            }
        }
    }

    public final void a(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f76129a, false, 89107, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f76129a, false, 89107, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "iesDownloadEnqueueListener");
        this.f76133c = dVar2;
    }

    private final void a(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, f76129a, false, 89111, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, f76129a, false, 89111, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f76133c != null) {
            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
            if (downloadInfo != null) {
                d dVar = this.f76133c;
                if (dVar != null) {
                    dVar.onDownloadProgress((int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f), 0, downloadInfo.getTotalBytes());
                }
            }
        }
    }

    public final int a(Context context, String str, String str2, String str3, String str4) {
        Context context2 = context;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{context2, str5, str6, str7, str8}, this, f76129a, false, 89112, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2, str5, str6, str7, str8}, this, f76129a, false, 89112, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Integer.TYPE)).intValue();
        }
        Integer num = g.get(str5);
        if (num != null) {
            num.intValue();
            if (Downloader.getInstance(context).canResume(num.intValue())) {
                a(context2, num.intValue());
                Downloader.getInstance(context).setMainThreadListener(num.intValue(), this.f76134f);
                Downloader.getInstance(context).resume(num.intValue());
                return num.intValue();
            }
        }
        int download = Downloader.with(context).url(str6).name(str7).savePath(str8).retryCount(0).mainThreadListener(this.f76134f).download();
        Map<String, Integer> map = g;
        Intrinsics.checkExpressionValueIsNotNull(map, "sTaskIdMap");
        map.put(str5, Integer.valueOf(download));
        return this.f76132b;
    }

    public final void a(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Context context2 = context;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{context2, str6, str7, str8, str9, str10}, this, f76129a, false, 89110, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str6, str7, str8, str9, str10}, this, f76129a, false, 89110, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str6, "sourceId");
        Intrinsics.checkParameterIsNotNull(str7, "originalUrl");
        Intrinsics.checkParameterIsNotNull(str8, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(str9, "fileSaveDirectory");
        Intrinsics.checkParameterIsNotNull(str10, "fileName");
        LocalVideoPlayerManager a2 = LocalVideoPlayerManager.a();
        b bVar = new b(this, context, str2, str3, str5, str4);
        if (!a2.a(str6, str9, bVar)) {
            this.f76132b = a(context, str2, str3, str5, str4);
        }
    }
}
