package com.ss.android.ugc.aweme.commercialize.loft.model;

import a.i;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 B2\u00020\u0001:\u0002BCB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J4\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J*\u0010\"\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010#\u001a\u00020\u00062\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002J\u0006\u0010$\u001a\u00020\u0013J\u0006\u0010%\u001a\u00020\u0019J\u0010\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0006H\u0002J\u0010\u0010'\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0006H\u0002J\b\u0010(\u001a\u0004\u0018\u00010\u0006J\u0010\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\nJ\u0014\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u001a\u0010-\u001a\u0004\u0018\u00010\n2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\nH\u0002J\b\u0010/\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0006H\u0002J*\u00101\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010#\u001a\u00020\u00062\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002J\b\u00102\u001a\u00020\u0013H\u0002J\u0016\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207J\u0010\u00108\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002J\u0010\u00109\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0006H\u0002J\u001e\u0010:\u001a\u00020\u00192\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\nJ\u0006\u0010<\u001a\u00020\u0013J\u0006\u0010=\u001a\u00020\u0013J\u0010\u0010>\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0006H\u0002J*\u0010?\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010#\u001a\u00020\u00062\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002J\u001a\u0010@\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010#\u001a\u00020\u0006H\u0002J\u0010\u0010A\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006`\u000bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006D"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "currentLoft", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/Loft;", "latestLoft", "loftCache", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "pullGuide", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/PullGuide;", "getPullGuide", "()Lcom/ss/android/ugc/aweme/commercialize/loft/model/PullGuide;", "setPullGuide", "(Lcom/ss/android/ugc/aweme/commercialize/loft/model/PullGuide;)V", "refreshEnable", "", "getRefreshEnable", "()Z", "setRefreshEnable", "(Z)V", "callbackFail", "", "id", "error", "", "weakListener", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftManager$OnRefreshListener;", "t", "", "callbackSuccess", "loft", "canEnterLoft", "detach", "getDownloadFileAbsPath", "getDownloadFileSaveName", "getLatestLoft", "getLoft", "getLoftFromResponse", "result", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftResponse;", "getResUri", "name", "getSaveDirPathName", "getUnzipDirPathName", "handleApiSuccess", "hasPermission", "initGuide", "itemView", "Landroid/view/View;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "isDownloaded", "prepareCurrentLoftRes", "refresh", "listener", "shouldShowLoft", "shouldShowLoftGuide", "tryCleanRes", "unZip", "updateCurrentLoft", "updateLoftRes", "Companion", "OnRefreshListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39238a = null;

    /* renamed from: f  reason: collision with root package name */
    public static final int f39239f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final a m = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public Context f39240b;

    /* renamed from: c  reason: collision with root package name */
    public a f39241c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public l f39242d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f39243e;
    private a n;
    private final HashMap<String, a> o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftManager$Companion;", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/SingletonHolder;", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftManager;", "Landroid/content/Context;", "()V", "ERROR_API_FAIL", "", "getERROR_API_FAIL", "()I", "ERROR_DOWNLOAD_FAIL", "getERROR_DOWNLOAD_FAIL", "ERROR_INVALID_DATA", "getERROR_INVALID_DATA", "ERROR_NO_PERMISSION", "getERROR_NO_PERMISSION", "ERROR_UNZIP_FAIL", "getERROR_UNZIP_FAIL", "ERROR_WRONG_FORMAT", "getERROR_WRONG_FORMAT", "ERROR_ZIPFILE_INVALID", "getERROR_ZIPFILE_INVALID", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends m<e, Context> {
        private a() {
            super(AnonymousClass1.INSTANCE);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftManager$OnRefreshListener;", "", "onFail", "", "error", "", "t", "", "onSuccess", "loft", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/Loft;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(int i, @Nullable Throwable th);

        void a(@NotNull a aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/model/LoftManager$handleApiSuccess$1", "Lcom/ss/android/socialbase/downloader/depend/AbsDownloadListener;", "onFailed", "", "entity", "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;", "e", "Lcom/ss/android/socialbase/downloader/exception/BaseException;", "onSuccessed", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39244a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f39245b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f39246c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f39247d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ WeakReference f39248e;

        public final void onSuccessed(@Nullable DownloadInfo downloadInfo) {
            if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f39244a, false, 31331, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f39244a, false, 31331, new Class[]{DownloadInfo.class}, Void.TYPE);
                return;
            }
            this.f39245b.a(this.f39246c, this.f39247d, this.f39248e);
        }

        public final void onFailed(@Nullable DownloadInfo downloadInfo, @Nullable BaseException baseException) {
            if (PatchProxy.isSupport(new Object[]{downloadInfo, baseException}, this, f39244a, false, 31332, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo, baseException}, this, f39244a, false, 31332, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE);
                return;
            }
            this.f39245b.a(this.f39246c, e.j, this.f39248e, baseException);
        }

        c(e eVar, String str, a aVar, WeakReference weakReference) {
            this.f39245b = eVar;
            this.f39246c = str;
            this.f39247d = aVar;
            this.f39248e = weakReference;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "aFloat", "", "onChanged", "(Ljava/lang/Float;)V"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f39250b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f39251c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewGroup f39252d;

        d(l lVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.f39250b = lVar;
            this.f39251c = viewGroup;
            this.f39252d = viewGroup2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (PatchProxy.isSupport(new Object[]{f2}, this, f39249a, false, 31333, new Class[]{Float.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{f2}, this, f39249a, false, 31333, new Class[]{Float.class}, Void.TYPE);
                return;
            }
            if (f2 != null) {
                float floatValue = f2.floatValue() / this.f39250b.f39279e;
                ViewGroup viewGroup = this.f39251c;
                Intrinsics.checkExpressionValueIsNotNull(viewGroup, "strongGuide");
                if (viewGroup.getVisibility() == 0) {
                    ViewGroup viewGroup2 = this.f39251c;
                    Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "strongGuide");
                    viewGroup2.setAlpha(1.0f - floatValue);
                }
                ViewGroup viewGroup3 = this.f39252d;
                Intrinsics.checkExpressionValueIsNotNull(viewGroup3, "weakGuide");
                if (viewGroup3.getVisibility() == 0) {
                    ViewGroup viewGroup4 = this.f39252d;
                    Intrinsics.checkExpressionValueIsNotNull(viewGroup4, "weakGuide");
                    viewGroup4.setAlpha(1.0f - floatValue);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/model/LoftManager$refresh$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftResponse;", "onFailure", "", "t", "", "onSuccess", "result", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.e$e  reason: collision with other inner class name */
    public static final class C0512e implements k<g> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f39254b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f39255c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ WeakReference f39256d;

        public final void onFailure(@NotNull Throwable th) {
            if (PatchProxy.isSupport(new Object[]{th}, this, f39253a, false, 31335, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f39253a, false, 31335, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th, "t");
            this.f39254b.a(this.f39255c, e.f39239f, this.f39256d, th);
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            a aVar;
            boolean z;
            boolean z2;
            String str;
            boolean z3;
            boolean z4;
            g gVar = (g) obj;
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f39253a, false, 31334, new Class[]{g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f39253a, false, 31334, new Class[]{g.class}, Void.TYPE);
                return;
            }
            e eVar = this.f39254b;
            if (PatchProxy.isSupport(new Object[]{gVar}, eVar, e.f39238a, false, 31323, new Class[]{g.class}, a.class)) {
                aVar = (a) PatchProxy.accessDispatch(new Object[]{gVar}, eVar, e.f39238a, false, 31323, new Class[]{g.class}, a.class);
            } else if (gVar != null && gVar.status_code == 0) {
                aVar = new a();
                aVar.setId(gVar.getId());
                aVar.setAnimationRes(gVar.getAnimationRes());
                aVar.setEndTime(gVar.getEndTime());
                aVar.setGuide(gVar.getGuide());
                aVar.setStatus(gVar.getStatus());
                aVar.setVideoList(gVar.getVideoList());
            } else {
                aVar = null;
            }
            if (aVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                e eVar2 = this.f39254b;
                String str2 = this.f39255c;
                WeakReference weakReference = this.f39256d;
                if (PatchProxy.isSupport(new Object[]{str2, aVar, weakReference}, eVar2, e.f39238a, false, 31314, new Class[]{String.class, a.class, WeakReference.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2, aVar, weakReference}, eVar2, e.f39238a, false, 31314, new Class[]{String.class, a.class, WeakReference.class}, Void.TYPE);
                } else if (!i.a(aVar)) {
                    eVar2.a(str2, e.h, weakReference, null);
                } else {
                    if (PatchProxy.isSupport(new Object[]{aVar}, eVar2, e.f39238a, false, 31315, new Class[]{a.class}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, eVar2, e.f39238a, false, 31315, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        f fVar = (f) f.f39266c.a(eVar2.f39240b);
                        b animationRes = aVar.getAnimationRes();
                        if (animationRes != null) {
                            str = animationRes.getDownloadUrl();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            Intrinsics.throwNpe();
                        }
                        String d2 = eVar2.d();
                        String str3 = d2;
                        String str4 = str;
                        if (PatchProxy.isSupport(new Object[]{str, d2}, fVar, f.f39265a, false, 31340, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{str4, str3}, fVar, f.f39265a, false, 31340, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            Intrinsics.checkParameterIsNotNull(str4, "downloadUrl");
                            Intrinsics.checkParameterIsNotNull(str3, "savePath");
                            Downloader instance = Downloader.getInstance(fVar.f39267b);
                            Integer valueOf = Integer.valueOf(instance.getDownloadId(str4, str3));
                            if (valueOf.intValue() != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                DownloadInfo downloadInfo = instance.getDownloadInfo(valueOf.intValue());
                                if (downloadInfo != null && downloadInfo.isDownloaded()) {
                                    z3 = true;
                                }
                            }
                            z3 = false;
                        }
                        if (!z3 || !new File(eVar2.d(aVar)).exists()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        eVar2.a(aVar);
                        if (i.c(aVar)) {
                            eVar2.b(str2, aVar, weakReference);
                        } else {
                            eVar2.a(str2, aVar, weakReference);
                        }
                    } else {
                        f fVar2 = (f) f.f39266c.a(eVar2.f39240b);
                        b animationRes2 = aVar.getAnimationRes();
                        if (animationRes2 == null) {
                            Intrinsics.throwNpe();
                        }
                        String downloadUrl = animationRes2.getDownloadUrl();
                        String d3 = eVar2.d();
                        String e2 = eVar2.e(aVar);
                        IDownloadListener cVar = new c(eVar2, str2, aVar, weakReference);
                        String str5 = e2;
                        if (PatchProxy.isSupport(new Object[]{downloadUrl, d3, e2, cVar}, fVar2, f.f39265a, false, 31341, new Class[]{String.class, String.class, String.class, IDownloadListener.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{downloadUrl, d3, str5, cVar}, fVar2, f.f39265a, false, 31341, new Class[]{String.class, String.class, String.class, IDownloadListener.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(downloadUrl, "downloadUrl");
                            Intrinsics.checkParameterIsNotNull(d3, "savePath");
                            Intrinsics.checkParameterIsNotNull(str5, "saveName");
                            Intrinsics.checkParameterIsNotNull(cVar, "listener");
                            Downloader.with(fVar2.f39267b).url(downloadUrl).retryCount(3).name(str5).savePath(d3).mainThreadListener(cVar).download();
                        }
                    }
                }
            } else {
                this.f39254b.a(this.f39255c, e.g, this.f39256d, null);
            }
        }

        C0512e(e eVar, String str, WeakReference weakReference) {
            this.f39254b = eVar;
            this.f39255c = str;
            this.f39256d = weakReference;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class f<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f39258b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f39259c;

        f(e eVar, a aVar) {
            this.f39258b = eVar;
            this.f39259c = aVar;
        }

        public final /* synthetic */ Object call() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f39257a, false, 31336, new Class[0], Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f39257a, false, 31336, new Class[0], Integer.TYPE)).intValue();
            } else {
                c cVar = (c) c.f39235b.a(this.f39258b.f39240b);
                String d2 = this.f39258b.d(this.f39259c);
                String c2 = this.f39258b.c(this.f39259c);
                if (PatchProxy.isSupport(new Object[]{d2, c2}, cVar, c.f39234a, false, 31294, new Class[]{String.class, String.class}, Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{d2, c2}, cVar, c.f39234a, false, 31294, new Class[]{String.class, String.class}, Integer.TYPE)).intValue();
                } else {
                    Intrinsics.checkParameterIsNotNull(d2, "src");
                    Intrinsics.checkParameterIsNotNull(c2, "des");
                    ZipFile zipFile = new ZipFile(d2);
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    byte[] bArr = new byte[1024];
                    while (entries.hasMoreElements()) {
                        Object nextElement = entries.nextElement();
                        if (nextElement != null) {
                            ZipEntry zipEntry = (ZipEntry) nextElement;
                            if (zipEntry.isDirectory()) {
                                String str = c2 + File.separator + zipEntry.getName();
                                Charset charset = Charsets.ISO_8859_1;
                                if (str != null) {
                                    byte[] bytes = str.getBytes(charset);
                                    Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                                    new File(new String(bytes, Charsets.UTF_8)).mkdir();
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            } else {
                                String name = zipEntry.getName();
                                Intrinsics.checkExpressionValueIsNotNull(name, "ze.name");
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(cVar.a(c2, name)));
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                                while (true) {
                                    int read = bufferedInputStream.read(bArr, 0, 1024);
                                    if (read == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                }
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.util.zip.ZipEntry");
                        }
                    }
                    zipFile.close();
                }
            }
            return Integer.valueOf(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class g<TTaskResult, TContinuationResult> implements a.g<Integer, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f39261b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f39262c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f39263d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ WeakReference f39264e;

        g(e eVar, a aVar, String str, WeakReference weakReference) {
            this.f39261b = eVar;
            this.f39262c = aVar;
            this.f39263d = str;
            this.f39264e = weakReference;
        }

        public final /* synthetic */ Object then(i iVar) {
            boolean z;
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f39260a, false, 31337, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f39260a, false, 31337, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
            Integer num = (Integer) iVar.e();
            if (num != null && num.intValue() == 0) {
                e eVar = this.f39261b;
                a aVar = this.f39262c;
                if (PatchProxy.isSupport(new Object[]{aVar}, eVar, e.f39238a, false, 31317, new Class[]{a.class}, Boolean.TYPE)) {
                    e eVar2 = eVar;
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, eVar2, e.f39238a, false, 31317, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
                } else {
                    eVar.a(aVar);
                    z = i.c(aVar);
                }
                if (z) {
                    this.f39261b.b(this.f39263d, this.f39262c, this.f39264e);
                } else {
                    this.f39261b.b(this.f39262c);
                    this.f39261b.a(this.f39263d, e.l, this.f39264e, null);
                }
            } else {
                this.f39261b.b(this.f39262c);
                this.f39261b.a(this.f39263d, e.k, this.f39264e, iVar.f());
            }
            return null;
        }
    }

    public final void a(@Nullable b bVar, @Nullable String str) {
        b bVar2 = bVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{bVar2, str2}, this, f39238a, false, 31312, new Class[]{b.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, str2}, this, f39238a, false, 31312, new Class[]{b.class, String.class}, Void.TYPE);
            return;
        }
        l.a(LoftApi.a(str), new C0512e(this, str2, new WeakReference(bVar2)), i.f1052b);
    }

    public final void a(String str, a aVar, WeakReference<b> weakReference) {
        String str2 = str;
        a aVar2 = aVar;
        WeakReference<b> weakReference2 = weakReference;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2, weakReference2}, this, f39238a, false, 31316, new Class[]{String.class, a.class, WeakReference.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2, weakReference2}, this, f39238a, false, 31316, new Class[]{String.class, a.class, WeakReference.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new f<TResult>(this, aVar2)).a((a.g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(this, aVar2, str2, weakReference2), i.f1052b);
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f39238a, false, 31318, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f39238a, false, 31318, new Class[]{a.class}, Void.TYPE);
            return;
        }
        b animationRes = aVar.getAnimationRes();
        if (animationRes != null) {
            animationRes.setBackgroundUri(a(aVar, "background.png"));
        }
        b animationRes2 = aVar.getAnimationRes();
        if (animationRes2 != null) {
            animationRes2.setFloatLeftTopUri(a(aVar, "floatLeftTop.png"));
        }
        b animationRes3 = aVar.getAnimationRes();
        if (animationRes3 != null) {
            animationRes3.setFloatRightTopUri(a(aVar, "floatRightTop.png"));
        }
        b animationRes4 = aVar.getAnimationRes();
        if (animationRes4 != null) {
            animationRes4.setFloatLeftBottomUri(a(aVar, "floatLeftBottom.png"));
        }
        b animationRes5 = aVar.getAnimationRes();
        if (animationRes5 != null) {
            animationRes5.setFloatRightBottomUri(a(aVar, "floatRightBottom.png"));
        }
        b animationRes6 = aVar.getAnimationRes();
        if (animationRes6 != null) {
            animationRes6.setGoodsBackgroundUri(a(aVar, "goodsBackground.png"));
        }
        b animationRes7 = aVar.getAnimationRes();
        if (animationRes7 != null) {
            animationRes7.setGoodsUri(a(aVar, "goods.png"));
        }
        b animationRes8 = aVar.getAnimationRes();
        if (animationRes8 != null) {
            animationRes8.setLogoLeftUri(a(aVar, "logoLeft.png"));
        }
        b animationRes9 = aVar.getAnimationRes();
        if (animationRes9 != null) {
            animationRes9.setLogoRightUri(a(aVar, "logoRight.png"));
        }
    }

    public final void a(String str, int i2, WeakReference<b> weakReference, Throwable th) {
        String str2 = str;
        Throwable th2 = th;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2), weakReference, th2}, this, f39238a, false, 31321, new Class[]{String.class, Integer.TYPE, WeakReference.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2), weakReference, th2}, this, f39238a, false, 31321, new Class[]{String.class, Integer.TYPE, WeakReference.class, Throwable.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            this.f39241c = null;
        }
        this.n = null;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!z) {
            this.o.remove(str2);
        }
        if (weakReference != null) {
            b bVar = (b) weakReference.get();
            if (bVar != null) {
                bVar.a(i2, th2);
            }
        }
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f39238a, false, 31311, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39238a, false, 31311, new Class[0], Boolean.TYPE)).booleanValue();
        }
        a aVar = this.f39241c;
        if (aVar == null || !i.c(aVar)) {
            return false;
        }
        if (aVar.getStatus() == h.f39270c) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        if (!PatchProxy.isSupport(new Object[0], this, f39238a, false, 31325, new Class[0], String.class)) {
            return ((c) c.f39235b.a(this.f39240b)).a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f39238a, false, 31325, new Class[0], String.class);
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f39238a, false, 31308, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39238a, false, 31308, new Class[0], Boolean.TYPE)).booleanValue();
        }
        a aVar = this.f39241c;
        if (aVar == null || !i.c(aVar)) {
            return false;
        }
        if (aVar.getStatus() == h.f39270c || aVar.getStatus() == h.f39269b) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f39238a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 31306(0x7a4a, float:4.3869E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f39238a
            r5 = 0
            r6 = 31306(0x7a4a, float:4.3869E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            com.ss.android.ugc.aweme.commercialize.loft.model.a r1 = r9.n
            if (r1 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.commercialize.loft.model.a r1 = r9.n
            r2 = 0
            if (r1 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.commercialize.loft.model.b r1 = r1.getAnimationRes()
            if (r1 == 0) goto L_0x0037
            java.lang.String r1 = r1.getDownloadUrl()
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0042
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            if (r0 == 0) goto L_0x0046
            goto L_0x0096
        L_0x0046:
            com.ss.android.ugc.aweme.commercialize.loft.model.a r0 = r9.n
            if (r0 == 0) goto L_0x0055
            com.ss.android.ugc.aweme.commercialize.loft.model.b r0 = r0.getAnimationRes()
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r0.getDownloadUrl()
            goto L_0x0056
        L_0x0055:
            r0 = r2
        L_0x0056:
            if (r0 != 0) goto L_0x005b
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x005b:
            java.lang.String r1 = r9.d()
            com.ss.android.ugc.aweme.commercialize.loft.model.f$a r3 = com.ss.android.ugc.aweme.commercialize.loft.model.f.f39266c
            android.content.Context r4 = r9.f39240b
            java.lang.Object r3 = r3.a(r4)
            com.ss.android.ugc.aweme.commercialize.loft.model.f r3 = (com.ss.android.ugc.aweme.commercialize.loft.model.f) r3
            boolean r3 = r3.b(r0, r1)
            if (r3 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.commercialize.loft.model.f$a r3 = com.ss.android.ugc.aweme.commercialize.loft.model.f.f39266c
            android.content.Context r4 = r9.f39240b
            java.lang.Object r3 = r3.a(r4)
            com.ss.android.ugc.aweme.commercialize.loft.model.f r3 = (com.ss.android.ugc.aweme.commercialize.loft.model.f) r3
            r3.a(r0, r1)
        L_0x007c:
            com.ss.android.ugc.aweme.commercialize.loft.model.a r0 = r9.n
            if (r0 != 0) goto L_0x0083
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0083:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.loft.model.i.b(r0)
            if (r0 == 0) goto L_0x0093
            com.ss.android.ugc.aweme.commercialize.loft.model.a r0 = r9.n
            if (r0 != 0) goto L_0x0090
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0090:
            r9.b(r0)
        L_0x0093:
            r9.f39241c = r2
            return
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.loft.model.e.a():void");
    }

    private e(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
        this.f39240b = applicationContext;
        this.o = new HashMap<>();
    }

    public final void b(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f39238a, false, 31324, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f39238a, false, 31324, new Class[]{a.class}, Void.TYPE);
            return;
        }
        ((c) c.f39235b.a(this.f39240b)).a(d(aVar));
        ((c) c.f39235b.a(this.f39240b)).b(c(aVar));
    }

    public final String c(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f39238a, false, 31326, new Class[]{a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar}, this, f39238a, false, 31326, new Class[]{a.class}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((c) c.f39235b.a(this.f39240b)).a());
        sb.append(File.separator);
        String id = aVar.getId();
        if (id == null) {
            Intrinsics.throwNpe();
        }
        sb.append(id);
        return sb.toString();
    }

    public final String d(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f39238a, false, 31327, new Class[]{a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar}, this, f39238a, false, 31327, new Class[]{a.class}, String.class);
        }
        return d() + File.separator + e(aVar);
    }

    /* access modifiers changed from: package-private */
    public final String e(a aVar) {
        a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f39238a, false, 31328, new Class[]{a.class}, String.class)) {
            return ((c) c.f39235b.a(this.f39240b)).a(aVar2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f39238a, false, 31328, new Class[]{a.class}, String.class);
    }

    @Nullable
    public final a a(@NotNull String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f39238a, false, 31307, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str}, this, f39238a, false, 31307, new Class[]{String.class}, a.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "id");
        a aVar = this.o.get(str);
        if (aVar != null) {
            a aVar2 = this.o.get(str);
            if (aVar2 != null) {
                str2 = aVar2.getId();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual((Object) str, (Object) str2)) {
                return aVar;
            }
            return null;
        }
        aVar = null;
        return aVar;
    }

    public /* synthetic */ e(Context context, byte b2) {
        this(context);
    }

    private final void a(String str, a aVar) {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f39238a, false, 31313, new Class[]{String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f39238a, false, 31313, new Class[]{String.class, a.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f39241c = aVar;
        }
        this.n = aVar;
        CharSequence id = aVar.getId();
        if (id == null || id.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            Map map = this.o;
            String id2 = aVar.getId();
            if (id2 == null) {
                Intrinsics.throwNpe();
            }
            map.put(id2, aVar);
        }
    }

    private final String a(a aVar, String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{aVar, str3}, this, f39238a, false, 31319, new Class[]{a.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar, str3}, this, f39238a, false, 31319, new Class[]{a.class, String.class}, String.class);
        }
        try {
            try {
                c cVar = (c) c.f39235b.a(this.f39240b);
                String d2 = d(aVar);
                String c2 = c(aVar);
                if (!PatchProxy.isSupport(new Object[]{d2, c2}, cVar, c.f39234a, false, 31293, new Class[]{String.class, String.class}, String.class)) {
                    Intrinsics.checkParameterIsNotNull(d2, "src");
                    Intrinsics.checkParameterIsNotNull(c2, "des");
                    Enumeration<? extends ZipEntry> entries = new ZipFile(d2).entries();
                    while (true) {
                        if (!entries.hasMoreElements()) {
                            str2 = "";
                            break;
                        }
                        Object nextElement = entries.nextElement();
                        if (nextElement != null) {
                            ZipEntry zipEntry = (ZipEntry) nextElement;
                            if (zipEntry.isDirectory()) {
                                str2 = new File(c2 + File.separator + zipEntry.getName()).getAbsolutePath();
                                Intrinsics.checkExpressionValueIsNotNull(str2, "File(dirStr).absolutePath");
                                break;
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.util.zip.ZipEntry");
                        }
                    }
                } else {
                    c cVar2 = cVar;
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{d2, c2}, cVar2, c.f39234a, false, 31293, new Class[]{String.class, String.class}, String.class);
                }
                File file = new File(str2 + File.separator + str3);
                if (file.exists()) {
                    return Uri.fromFile(file).toString();
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public final void a(@NotNull View view, @NotNull LifecycleOwner lifecycleOwner) {
        boolean z;
        int i2;
        int i3;
        View view2 = view;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{view2, lifecycleOwner2}, this, f39238a, false, 31310, new Class[]{View.class, LifecycleOwner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, lifecycleOwner2}, this, f39238a, false, 31310, new Class[]{View.class, LifecycleOwner.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "itemView");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "owner");
        a aVar = m;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        l lVar = ((e) aVar.a(context)).f39242d;
        ViewGroup viewGroup = (ViewGroup) view2.findViewById(C0906R.id.cwc);
        ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(C0906R.id.dww);
        View findViewById = view2.findViewById(C0906R.id.c8z);
        if (PatchProxy.isSupport(new Object[0], this, f39238a, false, 31309, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39238a, false, 31309, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!b() || !this.f39243e || this.f39242d == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "strongGuide");
            viewGroup.setVisibility(8);
            Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "weakGuide");
            viewGroup2.setVisibility(8);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "pullGuideDivide");
            findViewById.setVisibility(8);
            return;
        }
        x a2 = x.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "CommonSharePrefCache.inst()");
        an<Boolean> e2 = a2.e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "CommonSharePrefCache.ins…shouldShowPullStrongGuide");
        Boolean bool = (Boolean) e2.c();
        Intrinsics.checkExpressionValueIsNotNull(viewGroup, "strongGuide");
        Intrinsics.checkExpressionValueIsNotNull(bool, "showStrongGuide");
        if (bool.booleanValue()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
        Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "weakGuide");
        if (bool.booleanValue()) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        viewGroup2.setVisibility(i3);
        if (bool.booleanValue()) {
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "pullGuideDivide");
            findViewById.setVisibility(0);
            TextView textView = (TextView) view2.findViewById(C0906R.id.c91);
            RemoteImageView remoteImageView = (RemoteImageView) view2.findViewById(C0906R.id.c90);
            FrameLayout frameLayout = (FrameLayout) view2.findViewById(C0906R.id.c8y);
            Intrinsics.checkExpressionValueIsNotNull(textView, "textView");
            a aVar2 = m;
            Context context2 = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
            l lVar2 = ((e) aVar2.a(context2)).f39242d;
            if (lVar2 == null) {
                Intrinsics.throwNpe();
            }
            textView.setText(lVar2.f39277c);
            a aVar3 = m;
            Context context3 = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "itemView.context");
            l lVar3 = ((e) aVar3.a(context3)).f39242d;
            if (lVar3 == null) {
                Intrinsics.throwNpe();
            }
            if (lVar3.f39276b == null) {
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "frameLayout");
                frameLayout.setVisibility(8);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "frameLayout");
                frameLayout.setVisibility(0);
                if (lVar == null) {
                    Intrinsics.throwNpe();
                }
                com.ss.android.ugc.aweme.base.c.b(remoteImageView, lVar.f39276b);
            }
            r.a("show_toast", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", "1003").a("toast_type", "enter_guide").a("enter_from", "discovery").f34114b);
        } else {
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "pullGuideDivide");
            findViewById.setVisibility(8);
        }
        if (lVar == null) {
            Intrinsics.throwNpe();
        }
        lVar.f39278d.observe(lifecycleOwner2, new d(lVar, viewGroup, viewGroup2));
    }

    public final void b(String str, a aVar, WeakReference<b> weakReference) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str, aVar2, weakReference}, this, f39238a, false, 31320, new Class[]{String.class, a.class, WeakReference.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar2, weakReference}, this, f39238a, false, 31320, new Class[]{String.class, a.class, WeakReference.class}, Void.TYPE);
            return;
        }
        a(str, aVar);
        if (weakReference != null) {
            b bVar = (b) weakReference.get();
            if (bVar != null) {
                bVar.a(aVar2);
            }
        }
    }
}
