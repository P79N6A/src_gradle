package com.ss.android.ugc.aweme.app.services.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.linkselector.LinkSelector;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.services.a.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.videoprocess.IVideoProcessorsService;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 M2\u00020\u0001:\u0001MB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020=H\u0014J\u0018\u0010>\u001a\u00020:2\u0006\u0010<\u001a\u00020=2\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020BH\u0014J\u0010\u0010C\u001a\u00020:2\u0006\u0010D\u001a\u00020\u0014H\u0016J \u0010E\u001a\u00020:2\u0006\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u00020BH\u0016J\u0012\u0010I\u001a\u00020:2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u00020:H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001c\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u001f\u001a\u00020 X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R\u001a\u00100\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R\u001a\u00103\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R\u001a\u00106\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,¨\u0006N"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/storydownload/StoryVideoDownloadHelper;", "Lcom/ss/android/ugc/aweme/app/services/storydownload/BaseStoryDownloadHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mCurrentProgress", "", "getMCurrentProgress", "()F", "setMCurrentProgress", "(F)V", "mFilePrefix", "", "getMFilePrefix", "()Ljava/lang/String;", "setMFilePrefix", "(Ljava/lang/String;)V", "mHandler", "Landroid/os/Handler;", "mNeedAddWatermark", "", "getMNeedAddWatermark", "()Z", "setMNeedAddWatermark", "(Z)V", "mOutPath", "getMOutPath", "setMOutPath", "mOutPutDir", "getMOutPutDir", "setMOutPutDir", "mPlayModel", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getMPlayModel", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setMPlayModel", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "mProgressRunnable", "Ljava/lang/Runnable;", "mRetryCount", "", "getMRetryCount", "()I", "setMRetryCount", "(I)V", "mUrl", "getMUrl", "setMUrl", "mUserId", "getMUserId", "setMUserId", "mVideoHeight", "getMVideoHeight", "setMVideoHeight", "mVideoWidth", "getMVideoWidth", "setMVideoWidth", "addWaterMark", "", "checkState", "story", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "download", "listener", "Lcom/ss/android/ugc/aweme/app/services/storydownload/BaseStoryDownloadHelper$OnDownloadListener;", "getSpaceLimit", "", "handleOutput", "doCopy", "onDownloadProgress", "progress", "cacheSize", "totalSize", "onError", "error", "Lcom/ss/android/ugc/iesdownload/IesDownloadError;", "showDebugToast", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends a {
    private static final String A = (z + "tmp/");
    private static final int B = 3;
    public static ChangeQuickRedirect g = null;
    public static final float t = 40.0f;
    public static final float u = 60.0f;
    public static final float v = 100.0f;
    public static final a w = new a((byte) 0);
    private static final int y = y;
    private static final String z = (((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().shortVideoRootDir() + "share/");
    @NotNull
    public String h;
    @NotNull
    public UrlModel i;
    @NotNull
    public String j;
    @NotNull
    public String k;
    @NotNull
    public String l;
    @NotNull
    public String m;
    public int n;
    public float o;
    public int p;
    public int q;
    public boolean r;
    public final Runnable s = new C0443e(this);
    private final Handler x = new Handler(Looper.getMainLooper());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/storydownload/StoryVideoDownloadHelper$Companion;", "", "()V", "COMPOSE_WEIGHT", "", "DOWNLOAD_WIGHT", "LIMIT_RETRY_COUNT", "", "LIMIT_TIME_OUT", "SHARE_DIR", "", "TMP_DIR", "TOTAL_WEIGHT", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/app/services/storydownload/StoryVideoDownloadHelper$addWaterMark$1", "Lcom/ss/android/ugc/aweme/shortvideo/videoprocess/VideoProcessListener;", "onProgress", "", "progress", "", "onResult", "ret", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.ss.android.ugc.aweme.shortvideo.q.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f34254b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34255a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f34256b;

            a(b bVar) {
                this.f34256b = bVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f34255a, false, 23742, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f34255a, false, 23742, new Class[0], Void.TYPE);
                    return;
                }
                this.f34256b.f34254b.i();
                this.f34256b.f34254b.a().a();
                com.bytedance.ies.dmt.ui.d.a.a(this.f34256b.f34254b.f34228b, "保存成功，请到系统相册查看").a();
                this.f34256b.f34254b.a(new File(this.f34256b.f34254b.k()));
                this.f34256b.f34254b.h();
            }
        }

        b(e eVar) {
            this.f34254b = eVar;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34253a, false, 23740, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34253a, false, 23740, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f34254b.o = e.t + ((((float) i) * e.u) / e.v);
            com.ss.android.b.a.a.a.b(this.f34254b.s);
        }

        public final void b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34253a, false, 23741, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34253a, false, 23741, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (i == 0) {
                com.ss.android.b.a.a.a.b(new a(this));
            } else {
                this.f34254b.g();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f34258b;

        c(e eVar) {
            this.f34258b = eVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34257a, false, 23743, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34257a, false, 23743, new Class[0], Void.TYPE);
                return;
            }
            if (this.f34258b.o == 0.0f) {
                this.f34258b.g();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f34260b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34261c;

        d(e eVar, boolean z) {
            this.f34260b = eVar;
            this.f34261c = z;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34259a, false, 23744, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34259a, false, 23744, new Class[0], Void.TYPE);
                return;
            }
            if (!this.f34261c) {
                com.ss.android.b.a.a.a.b(new Runnable(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34264a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ d f34265b;

                    {
                        this.f34265b = r1;
                    }

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f34264a, false, 23746, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f34264a, false, 23746, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f34265b.f34260b.i();
                        this.f34265b.f34260b.a().a();
                        com.bytedance.ies.dmt.ui.d.a.a(this.f34265b.f34260b.f34228b, "保存成功，请到系统相册查看").a();
                    }
                });
                this.f34260b.h();
            } else if (this.f34260b.r) {
                e eVar = this.f34260b;
                if (PatchProxy.isSupport(new Object[0], eVar, e.g, false, 23737, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], eVar, e.g, false, 23737, new Class[0], Void.TYPE);
                } else {
                    IVideoProcessorsService videoProcessorsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).videoProcessorsService();
                    String d2 = eVar.d();
                    String str = eVar.l;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mOutPath");
                    }
                    videoProcessorsService.addStoryWaterMark(d2, str, eVar.p, eVar.q, new b(eVar));
                }
            } else if (com.ss.android.ugc.aweme.video.b.c(this.f34260b.d(), this.f34260b.k())) {
                com.ss.android.b.a.a.a.b(new Runnable(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34262a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ d f34263b;

                    {
                        this.f34263b = r1;
                    }

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f34262a, false, 23745, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f34262a, false, 23745, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f34263b.f34260b.i();
                        this.f34263b.f34260b.a().a();
                        com.bytedance.ies.dmt.ui.d.a.a(this.f34263b.f34260b.f34228b, "保存成功，请到系统相册查看").a();
                        this.f34263b.f34260b.a(new File(this.f34263b.f34260b.k()));
                    }
                });
            } else {
                this.f34260b.g();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.app.services.a.e$e  reason: collision with other inner class name */
    static final class C0443e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f34267b;

        C0443e(e eVar) {
            this.f34267b = eVar;
        }

        public final void run() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f34266a, false, 23747, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34266a, false, 23747, new Class[0], Void.TYPE);
                return;
            }
            try {
                if (this.f34267b.c() != null) {
                    com.ss.android.ugc.aweme.shortvideo.view.d c2 = this.f34267b.c();
                    if (this.f34267b.o >= 100.0f) {
                        i = 100;
                    } else {
                        i = (int) this.f34267b.o;
                    }
                    c2.setProgress(i);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final long j() {
        return 20971520;
    }

    @NotNull
    public final String k() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 23730, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, g, false, 23730, new Class[0], String.class);
        }
        String str = this.l;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOutPath");
        }
        return str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        String a2 = com.ss.android.ugc.aweme.am.a.a(context);
        Intrinsics.checkExpressionValueIsNotNull(a2, "StorageCompat.getSystemCameraDir(context)");
        this.h = a2;
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, g, false, 23736, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, g, false, 23736, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new d(this, z2));
    }

    public final void onError(@Nullable com.ss.android.ugc.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, g, false, 23738, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, g, false, 23738, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE);
        } else if (this.n < B) {
            this.n++;
            UrlModel urlModel = this.i;
            if (urlModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayModel");
            }
            if (urlModel != null) {
                UrlModel urlModel2 = this.i;
                if (urlModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayModel");
                }
                if (!CollectionUtils.isEmpty(urlModel2.getUrlList())) {
                    LinkSelector a2 = LinkSelector.a();
                    UrlModel urlModel3 = this.i;
                    if (urlModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayModel");
                    }
                    List<String> urlList = urlModel3.getUrlList();
                    int i2 = this.n;
                    UrlModel urlModel4 = this.i;
                    if (urlModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayModel");
                    }
                    String a3 = a2.a(urlList.get(i2 % urlModel4.getUrlList().size()));
                    Intrinsics.checkExpressionValueIsNotNull(a3, "LinkSelector.getInstance…mPlayModel.urlList.size])");
                    this.m = a3;
                }
            }
            String str = this.m;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUrl");
            }
            String a4 = com.ss.android.ugc.aweme.video.e.b.a(str);
            Intrinsics.checkExpressionValueIsNotNull(a4, "PlayUrlBuilder.genDownloadUrl(mUrl)");
            this.m = a4;
            e.a aVar = new e.a();
            String str2 = this.m;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUrl");
            }
            com.ss.android.ugc.aweme.app.application.initialization.a.a(aVar.a(str2).b(d()).a(), (com.ss.android.ugc.a.b.d) this);
        } else {
            g();
        }
    }

    public final void a(@NotNull LifeStory lifeStory, @NotNull a.C0441a aVar) {
        boolean z2;
        String uniqueId;
        String str;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{lifeStory, aVar}, this, g, false, 23734, new Class[]{LifeStory.class, a.C0441a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifeStory, aVar}, this, g, false, 23734, new Class[]{LifeStory.class, a.C0441a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(lifeStory, "story");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        super.a(lifeStory, aVar);
        LifeStory b2 = b();
        if (PatchProxy.isSupport(new Object[]{b2}, this, g, false, 23735, new Class[]{LifeStory.class}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{b2}, this, g, false, 23735, new Class[]{LifeStory.class}, Boolean.TYPE)).booleanValue();
        } else {
            Intrinsics.checkParameterIsNotNull(b2, "story");
            if (b2.getVideo() == null || b2.getAuthor() == null || !e() || !f()) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            a().a("");
            return;
        }
        Video video = b().getVideo();
        Intrinsics.checkExpressionValueIsNotNull(video, "mStory.video");
        boolean isHasWaterMark = video.isHasWaterMark();
        if (isHasWaterMark) {
            Video video2 = b().getVideo();
            Intrinsics.checkExpressionValueIsNotNull(video2, "mStory.video");
            UrlModel downloadAddr = video2.getDownloadAddr();
            Intrinsics.checkExpressionValueIsNotNull(downloadAddr, "mStory.video.downloadAddr");
            this.i = downloadAddr;
            this.r = false;
        } else if (!isHasWaterMark) {
            Video video3 = b().getVideo();
            Intrinsics.checkExpressionValueIsNotNull(video3, "mStory.video");
            VideoUrlModel playAddrH264 = video3.getPlayAddrH264();
            Intrinsics.checkExpressionValueIsNotNull(playAddrH264, "mStory.video.playAddrH264");
            this.i = playAddrH264;
            this.r = true;
        }
        User author = b().getAuthor();
        Intrinsics.checkExpressionValueIsNotNull(author, "mStory.author");
        String uniqueId2 = author.getUniqueId();
        Intrinsics.checkExpressionValueIsNotNull(uniqueId2, "mStory.author.uniqueId");
        if (uniqueId2.length() != 0) {
            z3 = false;
        }
        if (z3) {
            User author2 = b().getAuthor();
            Intrinsics.checkExpressionValueIsNotNull(author2, "mStory.author");
            uniqueId = author2.getShortId();
            str = "mStory.author.shortId";
        } else {
            User author3 = b().getAuthor();
            Intrinsics.checkExpressionValueIsNotNull(author3, "mStory.author");
            uniqueId = author3.getUniqueId();
            str = "mStory.author.uniqueId";
        }
        Intrinsics.checkExpressionValueIsNotNull(uniqueId, str);
        this.j = uniqueId;
        StringBuilder sb = new StringBuilder();
        UrlModel urlModel = this.i;
        if (urlModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayModel");
        }
        sb.append(urlModel.getUri());
        String str2 = this.j;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserId");
        }
        sb.append(str2);
        String md5Hex = DigestUtils.md5Hex(sb.toString());
        Intrinsics.checkExpressionValueIsNotNull(md5Hex, "DigestUtils.md5Hex(mPlayModel.uri + mUserId)");
        this.k = md5Hex;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A);
        String str3 = this.k;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilePrefix");
        }
        sb2.append(str3);
        sb2.append(".mp4");
        a(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.h);
        String str4 = this.k;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilePrefix");
        }
        sb3.append(str4);
        sb3.append(".mp4");
        this.l = sb3.toString();
        Video video4 = b().getVideo();
        Intrinsics.checkExpressionValueIsNotNull(video4, "mStory.video");
        this.p = video4.getWidth();
        Video video5 = b().getVideo();
        Intrinsics.checkExpressionValueIsNotNull(video5, "mStory.video");
        this.q = video5.getHeight();
        com.ss.android.ugc.aweme.shortvideo.view.d b3 = com.ss.android.ugc.aweme.shortvideo.view.d.b(this.f34228b, this.f34228b.getResources().getString(C0906R.string.a7v));
        Intrinsics.checkExpressionValueIsNotNull(b3, "AwemeProgressDialog.show…ng(R.string.downloading))");
        a(b3);
        c().setIndeterminate(false);
        c().setProgress(0);
        String str5 = this.l;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOutPath");
        }
        if (com.ss.android.ugc.aweme.video.b.b(str5)) {
            a(false);
            return;
        }
        if (!com.ss.android.ugc.aweme.video.b.b(d())) {
            com.ss.android.ugc.aweme.video.b.a(A, false);
        }
        UrlModel urlModel2 = this.i;
        if (urlModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayModel");
        }
        if (urlModel2 != null) {
            UrlModel urlModel3 = this.i;
            if (urlModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayModel");
            }
            if (!CollectionUtils.isEmpty(urlModel3.getUrlList())) {
                LinkSelector a2 = LinkSelector.a();
                UrlModel urlModel4 = this.i;
                if (urlModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayModel");
                }
                String a3 = a2.a(urlModel4.getUrlList().get(0));
                Intrinsics.checkExpressionValueIsNotNull(a3, "LinkSelector.getInstance…rl(mPlayModel.urlList[0])");
                this.m = a3;
            }
        }
        String str6 = this.m;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUrl");
        }
        String a4 = com.ss.android.ugc.aweme.video.e.b.a(str6);
        Intrinsics.checkExpressionValueIsNotNull(a4, "PlayUrlBuilder.genDownloadUrl(mUrl)");
        this.m = a4;
        e.a aVar2 = new e.a();
        String str7 = this.m;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUrl");
        }
        com.ss.android.ugc.aweme.video.local.b.a(lifeStory.getStoryId(), aVar2.a(str7).b(d()).a(), this);
        this.o = 0.0f;
        this.x.postDelayed(new c(this), (long) y);
    }

    public final void onDownloadProgress(int i2, long j2, long j3) {
        int i3 = i2;
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, g, false, 23739, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, g, false, 23739, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.r) {
            this.o = (((float) i3) * t) / v;
        } else {
            this.o = (float) i3;
        }
        com.ss.android.b.a.a.a.b(this.s);
    }
}
