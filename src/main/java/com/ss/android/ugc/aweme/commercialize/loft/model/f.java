package com.ss.android.ugc.aweme.commercialize.loft.model;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ&\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftResDownloader;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isDownloaded", "", "downloadUrl", "", "savePath", "isDownloading", "removeListener", "", "start", "saveName", "listener", "Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39265a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f39266c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    Context f39267b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftResDownloader$Companion;", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/SingletonHolder;", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftResDownloader;", "Landroid/content/Context;", "()V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends m<f, Context> {
        private a() {
            super(AnonymousClass1.INSTANCE);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private f(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
        this.f39267b = applicationContext;
    }

    public /* synthetic */ f(Context context, byte b2) {
        this(context);
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f39265a, false, 31338, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f39265a, false, 31338, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "downloadUrl");
        Intrinsics.checkParameterIsNotNull(str4, "savePath");
        Downloader instance = Downloader.getInstance(this.f39267b);
        Integer valueOf = Integer.valueOf(instance.getDownloadId(str3, str4));
        if (valueOf.intValue() != 0) {
            z = true;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            instance.removeTaskMainListener(valueOf.intValue());
        }
    }

    public final boolean b(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f39265a, false, 31339, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f39265a, false, 31339, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str3, "downloadUrl");
        Intrinsics.checkParameterIsNotNull(str4, "savePath");
        Downloader instance = Downloader.getInstance(this.f39267b);
        Integer valueOf = Integer.valueOf(instance.getDownloadId(str3, str4));
        if (valueOf.intValue() == 0) {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            return instance.isDownloading(valueOf.intValue());
        }
        return false;
    }
}
