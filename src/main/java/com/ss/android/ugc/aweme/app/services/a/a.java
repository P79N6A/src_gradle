package com.ss.android.ugc.aweme.app.services.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u00015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0004J\b\u0010\"\u001a\u00020!H\u0004J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0015H$J\b\u0010%\u001a\u00020&H\u0004J\u0018\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\tH\u0016J\b\u0010)\u001a\u00020*H$J\b\u0010+\u001a\u00020&H\u0004J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020!H&J\b\u0010.\u001a\u00020&H\u0016J\u0012\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u00101\u001a\u00020&H\u0004J\u0010\u00102\u001a\u00020&2\u0006\u00100\u001a\u000203H\u0004J\u0010\u00102\u001a\u00020&2\u0006\u00104\u001a\u00020\u001bH\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/storydownload/BaseStoryDownloadHelper;", "Lcom/ss/android/ugc/aweme/app/services/storydownload/SimpleDownloadEnqueueListener;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getMContext", "()Landroid/content/Context;", "setMContext", "mDownloadListener", "Lcom/ss/android/ugc/aweme/app/services/storydownload/BaseStoryDownloadHelper$OnDownloadListener;", "getMDownloadListener", "()Lcom/ss/android/ugc/aweme/app/services/storydownload/BaseStoryDownloadHelper$OnDownloadListener;", "setMDownloadListener", "(Lcom/ss/android/ugc/aweme/app/services/storydownload/BaseStoryDownloadHelper$OnDownloadListener;)V", "mProgressDialog", "Lcom/ss/android/ugc/aweme/shortvideo/view/AwemeProgressDialog;", "getMProgressDialog", "()Lcom/ss/android/ugc/aweme/shortvideo/view/AwemeProgressDialog;", "setMProgressDialog", "(Lcom/ss/android/ugc/aweme/shortvideo/view/AwemeProgressDialog;)V", "mStory", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "getMStory", "()Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "setMStory", "(Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;)V", "mTempPath", "", "getMTempPath", "()Ljava/lang/String;", "setMTempPath", "(Ljava/lang/String;)V", "checkNetWork", "", "checkSdCardAvailable", "checkState", "story", "dismissDialog", "", "download", "listener", "getSpaceLimit", "", "handleFailedInMain", "handleOutput", "doCopy", "onCancel", "onDownloadSuccess", "file", "removeTmpFiles", "scanFile", "Ljava/io/File;", "path", "OnDownloadListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34227a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public Context f34228b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public C0441a f34229c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public LifeStory f34230d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public d f34231e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public String f34232f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/storydownload/BaseStoryDownloadHelper$OnDownloadListener;", "", "onFail", "", "msg", "", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.app.services.a.a$a  reason: collision with other inner class name */
    public interface C0441a {
        void a();

        void a(@NotNull String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34233a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f34234b;

        b(a aVar) {
            this.f34234b = aVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34233a, false, 23702, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34233a, false, 23702, new Class[0], Void.TYPE);
                return;
            }
            this.f34234b.h();
            this.f34234b.a().a("");
            if (this.f34234b.f34228b != null) {
                this.f34234b.i();
                com.bytedance.ies.dmt.ui.d.a.b(this.f34234b.f34228b, (int) C0906R.string.a7i).a();
            }
        }
    }

    public abstract void a(boolean z);

    public abstract long j();

    @NotNull
    public final C0441a a() {
        if (PatchProxy.isSupport(new Object[0], this, f34227a, false, 23684, new Class[0], C0441a.class)) {
            return (C0441a) PatchProxy.accessDispatch(new Object[0], this, f34227a, false, 23684, new Class[0], C0441a.class);
        }
        C0441a aVar = this.f34229c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDownloadListener");
        }
        return aVar;
    }

    @NotNull
    public final LifeStory b() {
        if (PatchProxy.isSupport(new Object[0], this, f34227a, false, 23686, new Class[0], LifeStory.class)) {
            return (LifeStory) PatchProxy.accessDispatch(new Object[0], this, f34227a, false, 23686, new Class[0], LifeStory.class);
        }
        LifeStory lifeStory = this.f34230d;
        if (lifeStory == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStory");
        }
        return lifeStory;
    }

    @NotNull
    public final d c() {
        if (PatchProxy.isSupport(new Object[0], this, f34227a, false, 23688, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f34227a, false, 23688, new Class[0], d.class);
        }
        d dVar = this.f34231e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProgressDialog");
        }
        return dVar;
    }

    @NotNull
    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f34227a, false, 23690, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f34227a, false, 23690, new Class[0], String.class);
        }
        String str = this.f34232f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTempPath");
        }
        return str;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f34227a, false, 23695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34227a, false, 23695, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.b(new b(this));
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f34227a, false, 23696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34227a, false, 23696, new Class[0], Void.TYPE);
            return;
        }
        String str = this.f34232f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTempPath");
        }
        com.ss.android.ugc.aweme.video.b.c(str);
    }

    public void onCancel() {
        if (PatchProxy.isSupport(new Object[0], this, f34227a, false, 23698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34227a, false, 23698, new Class[0], Void.TYPE);
            return;
        }
        i();
        C0441a aVar = this.f34229c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDownloadListener");
        }
        aVar.a("");
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f34227a, false, 23693, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34227a, false, 23693, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.video.b.h()) {
            com.bytedance.ies.dmt.ui.d.a.b(this.f34228b, (int) C0906R.string.c1x).a();
            return false;
        } else if (com.ss.android.ugc.aweme.video.b.i() >= j()) {
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(this.f34228b, (int) C0906R.string.c1y).a();
            return false;
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f34227a, false, 23694, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34227a, false, 23694, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (NetworkUtils.isNetworkAvailable(this.f34228b)) {
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(this.f34228b, (int) C0906R.string.bgf, 1).a();
            return false;
        }
    }

    public final void i() {
        Boolean bool;
        if (PatchProxy.isSupport(new Object[0], this, f34227a, false, 23697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34227a, false, 23697, new Class[0], Void.TYPE);
            return;
        }
        try {
            d dVar = this.f34231e;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mProgressDialog");
            }
            if (dVar != null) {
                d dVar2 = this.f34231e;
                if (dVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mProgressDialog");
                }
                if (dVar2 != null) {
                    bool = Boolean.valueOf(dVar2.isShowing());
                } else {
                    bool = null;
                }
                if (!bool.booleanValue()) {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.dismiss();
                }
            }
        } catch (Exception unused) {
        }
    }

    public a(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f34228b = context;
    }

    public final void a(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f34227a, false, 23689, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f34227a, false, 23689, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "<set-?>");
        this.f34231e = dVar2;
    }

    public final void b(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34227a, false, 23700, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34227a, false, 23700, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "path");
        if (!TextUtils.isEmpty(str2)) {
            a(new File(str2));
        }
    }

    public void onDownloadSuccess(@Nullable String str) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, f34227a, false, 23699, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34227a, false, 23699, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str != null) {
            i = str.length();
        }
        if (i <= 0) {
            g();
        } else {
            a(true);
        }
    }

    public final void a(@NotNull File file) {
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{file2}, this, f34227a, false, 23701, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file2}, this, f34227a, false, 23701, new Class[]{File.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(file2, "file");
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        GlobalContext.getContext().sendBroadcast(intent);
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34227a, false, 23691, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34227a, false, 23691, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.f34232f = str2;
    }

    public void a(@NotNull LifeStory lifeStory, @NotNull C0441a aVar) {
        if (PatchProxy.isSupport(new Object[]{lifeStory, aVar}, this, f34227a, false, 23692, new Class[]{LifeStory.class, C0441a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifeStory, aVar}, this, f34227a, false, 23692, new Class[]{LifeStory.class, C0441a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(lifeStory, "story");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f34230d = lifeStory;
        this.f34229c = aVar;
    }
}
