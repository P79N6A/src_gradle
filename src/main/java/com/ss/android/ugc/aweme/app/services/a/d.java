package com.ss.android.ugc.aweme.app.services.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.services.a.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\u0018\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020$2\u0006\u0010'\u001a\u00020(H\u0016J\u0006\u0010)\u001a\u00020\u0006J\b\u0010*\u001a\u00020+H\u0014J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\"H\u0016J \u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020+H\u0016J\u0012\u00102\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u000104H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\n¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/storydownload/StoryImageDownloadHelper;", "Lcom/ss/android/ugc/aweme/app/services/storydownload/BaseStoryDownloadHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DCIM_DIR", "", "getDCIM_DIR", "()Ljava/lang/String;", "setDCIM_DIR", "(Ljava/lang/String;)V", "mCurrentProgress", "", "getMCurrentProgress", "()F", "setMCurrentProgress", "(F)V", "mHandler", "Landroid/os/Handler;", "mImageName", "getMImageName", "setMImageName", "mProgressRunnable", "Ljava/lang/Runnable;", "mRetryCount", "", "getMRetryCount", "()I", "setMRetryCount", "(I)V", "mUrl", "getMUrl", "setMUrl", "checkState", "", "story", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "download", "", "listener", "Lcom/ss/android/ugc/aweme/app/services/storydownload/BaseStoryDownloadHelper$OnDownloadListener;", "getSavePath", "getSpaceLimit", "", "handleOutput", "doCopy", "onDownloadProgress", "progress", "cacheSize", "totalSize", "onError", "error", "Lcom/ss/android/ugc/iesdownload/IesDownloadError;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends a {
    public static ChangeQuickRedirect g = null;
    public static final a m = new a((byte) 0);
    private static final String p = (((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().shortVideoRootDir() + "share/");
    private static final String q = (p + "image/");
    private static final int r = 3;
    private static final int s = s;
    @NotNull
    public String h;
    @NotNull
    public String i;
    @NotNull
    public String j;
    public float k;
    public int l;
    private final Handler n = new Handler(Looper.getMainLooper());
    private final Runnable o = new C0442d(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/storydownload/StoryImageDownloadHelper$Companion;", "", "()V", "IMAGE_DIR", "", "LIMIT_RETRY_COUNT", "", "LIMIT_TIME_OUT", "SHARE_DIR", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34240a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f34241b;

        b(d dVar) {
            this.f34241b = dVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34240a, false, 23717, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34240a, false, 23717, new Class[0], Void.TYPE);
                return;
            }
            if (this.f34241b.k == 0.0f) {
                this.f34241b.g();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f34243b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34244c;

        c(d dVar, boolean z) {
            this.f34243b = dVar;
            this.f34244c = z;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34242a, false, 23718, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34242a, false, 23718, new Class[0], Void.TYPE);
            } else if (this.f34244c) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).photoProcessService().photoAddStoryWaterMarker(this.f34243b.d(), this.f34243b.k(), new IPhotoProcessService.IPhotoServiceListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34245a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c f34246b;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
                    /* renamed from: com.ss.android.ugc.aweme.app.services.a.d$c$1$a */
                    static final class a implements Runnable {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f34247a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f34248b;

                        a(AnonymousClass1 r1) {
                            this.f34248b = r1;
                        }

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f34247a, false, 23720, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f34247a, false, 23720, new Class[0], Void.TYPE);
                                return;
                            }
                            this.f34248b.f34246b.f34243b.i();
                            this.f34248b.f34246b.f34243b.a().a();
                            com.bytedance.ies.dmt.ui.d.a.a(this.f34248b.f34246b.f34243b.f34228b, "保存成功，请到系统相册查看").a();
                            this.f34248b.f34246b.f34243b.b(this.f34248b.f34246b.f34243b.k());
                        }
                    }

                    public final void onWaterMakerAdded(@Nullable Bitmap bitmap) {
                    }

                    {
                        this.f34246b = r1;
                    }

                    public final void onSaved(int i, @Nullable PhotoContext photoContext) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), photoContext}, this, f34245a, false, 23719, new Class[]{Integer.TYPE, PhotoContext.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), photoContext}, this, f34245a, false, 23719, new Class[]{Integer.TYPE, PhotoContext.class}, Void.TYPE);
                            return;
                        }
                        if (i == 0) {
                            com.ss.android.b.a.a.a.b(new a(this));
                        } else {
                            this.f34246b.f34243b.g();
                        }
                        this.f34246b.f34243b.h();
                    }
                });
            } else {
                com.ss.android.b.a.a.a.b(new Runnable(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34249a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c f34250b;

                    {
                        this.f34250b = r1;
                    }

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f34249a, false, 23721, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f34249a, false, 23721, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f34250b.f34243b.i();
                        this.f34250b.f34243b.b(this.f34250b.f34243b.k());
                        this.f34250b.f34243b.a().a();
                        com.bytedance.ies.dmt.ui.d.a.a(this.f34250b.f34243b.f34228b, "保存成功，请到系统相册查看").a();
                    }
                });
                this.f34243b.h();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.app.services.a.d$d  reason: collision with other inner class name */
    static final class C0442d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f34252b;

        C0442d(d dVar) {
            this.f34252b = dVar;
        }

        public final void run() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f34251a, false, 23722, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34251a, false, 23722, new Class[0], Void.TYPE);
                return;
            }
            try {
                if (this.f34252b.c() != null) {
                    com.ss.android.ugc.aweme.shortvideo.view.d c2 = this.f34252b.c();
                    if (this.f34252b.k >= 100.0f) {
                        i = 100;
                    } else {
                        i = (int) this.f34252b.k;
                    }
                    c2.setProgress(i);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final long j() {
        return 5242880;
    }

    @NotNull
    public final String k() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 23713, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, g, false, 23713, new Class[0], String.class);
        }
        String str = this.h;
        StringBuilder sb = new StringBuilder();
        String str2 = this.j;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImageName");
        }
        sb.append(str2);
        sb.append(".png");
        String path = new File(str, sb.toString()).getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "File(DCIM_DIR, \"$mImageName.png\").path");
        return path;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        String a2 = com.ss.android.ugc.aweme.am.a.a(context);
        Intrinsics.checkExpressionValueIsNotNull(a2, "StorageCompat.getSystemCameraDir(context)");
        this.h = a2;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, g, false, 23715, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, g, false, 23715, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new c(this, z));
    }

    public final void onError(@Nullable com.ss.android.ugc.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, g, false, 23714, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, g, false, 23714, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE);
        } else if (this.f34228b != null) {
            if (this.l < r) {
                this.l++;
                e.a aVar = new e.a();
                String str = this.i;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUrl");
                }
                com.ss.android.ugc.aweme.app.application.initialization.a.a(aVar.a(str).b(d()).a(), (com.ss.android.ugc.a.b.d) this);
                return;
            }
            g();
        }
    }

    public final void a(@NotNull LifeStory lifeStory, @NotNull a.C0441a aVar) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{lifeStory, aVar}, this, g, false, 23711, new Class[]{LifeStory.class, a.C0441a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifeStory, aVar}, this, g, false, 23711, new Class[]{LifeStory.class, a.C0441a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(lifeStory, "story");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        super.a(lifeStory, aVar);
        LifeStory b2 = b();
        if (PatchProxy.isSupport(new Object[]{b2}, this, g, false, 23712, new Class[]{LifeStory.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{b2}, this, g, false, 23712, new Class[]{LifeStory.class}, Boolean.TYPE)).booleanValue();
        } else {
            Intrinsics.checkParameterIsNotNull(b2, "story");
            if (b2.getImageInfo() != null) {
                ImageInfo imageInfo = b2.getImageInfo();
                Intrinsics.checkExpressionValueIsNotNull(imageInfo, "story.imageInfo");
                if (imageInfo.getLabelLarge() != null && f() && e()) {
                    z = true;
                }
            }
            z = false;
        }
        if (!z) {
            a().a("");
            return;
        }
        ImageInfo imageInfo2 = b().getImageInfo();
        Intrinsics.checkExpressionValueIsNotNull(imageInfo2, "mStory.imageInfo");
        UrlModel labelLarge = imageInfo2.getLabelLarge();
        Intrinsics.checkExpressionValueIsNotNull(labelLarge, "urlModel");
        if (labelLarge.getUrlList() == null || labelLarge.getUrlList().isEmpty()) {
            g();
            return;
        }
        String str = labelLarge.getUrlList().get(0);
        Intrinsics.checkExpressionValueIsNotNull(str, "urlModel.urlList[0]");
        this.i = str;
        String str2 = this.i;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUrl");
        }
        String md5Hex = DigestUtils.md5Hex(str2);
        Intrinsics.checkExpressionValueIsNotNull(md5Hex, "DigestUtils.md5Hex(mUrl)");
        this.j = md5Hex;
        String k2 = k();
        com.ss.android.ugc.aweme.shortvideo.view.d b3 = com.ss.android.ugc.aweme.shortvideo.view.d.b(this.f34228b, this.f34228b.getResources().getString(C0906R.string.a7v));
        Intrinsics.checkExpressionValueIsNotNull(b3, "AwemeProgressDialog.show…ng(R.string.downloading))");
        a(b3);
        c().setIndeterminate(false);
        c().setProgress(0);
        StringBuilder sb = new StringBuilder();
        sb.append(q);
        String str3 = this.j;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImageName");
        }
        sb.append(str3);
        sb.append(".temp");
        a(sb.toString());
        if (com.ss.android.ugc.aweme.video.b.b(k2)) {
            a(false);
            return;
        }
        if (!com.ss.android.ugc.aweme.video.b.b(d())) {
            com.ss.android.ugc.aweme.video.b.a(d(), true);
        }
        e.a aVar2 = new e.a();
        String str4 = this.i;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUrl");
        }
        com.ss.android.ugc.aweme.app.application.initialization.a.a(aVar2.a(str4).b(d()).a(), (com.ss.android.ugc.a.b.d) this);
        this.k = 0.0f;
        this.n.postDelayed(new b(this), (long) s);
    }

    public final void onDownloadProgress(int i2, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, g, false, 23716, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, g, false, 23716, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.k = (float) i2;
        com.ss.android.b.a.a.a.b(this.o);
    }
}
