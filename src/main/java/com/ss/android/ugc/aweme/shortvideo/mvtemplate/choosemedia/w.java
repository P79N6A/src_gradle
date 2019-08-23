package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.photomovie.v;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.tools.a.g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\"\u0010\u001a\u001a\u00020\u00132\u000e\u0010\u001b\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u001f\u001a\u00020\u00132\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010\rH\u0016J\u001e\u0010$\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0%H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/PhotoMovieChosenResultImpl;", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/IMediaChosenResultProcess;", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMusicChoicesView;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "mLoadingDialog", "Lcom/ss/android/ugc/aweme/common/widget/AwemeLoadingDialog;", "mMusicChoicesPresenter", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMusicChoicesPresenter;", "musicPath", "", "photoMovieContext", "Lcom/ss/android/ugc/aweme/photomovie/PhotoMovieContext;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "loadPhotoMovieMusic", "", "onChosenResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onGetMusicFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failMsg", "onGetMusicSuccess", "musicList", "", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "filePath", "toPhotoMovieActivity", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class w implements a.f, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68658a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Activity f68659b;

    /* renamed from: c  reason: collision with root package name */
    private fh f68660c;

    /* renamed from: d  reason: collision with root package name */
    private String f68661d;

    /* renamed from: e  reason: collision with root package name */
    private a.e f68662e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.common.widget.a f68663f;
    private final PhotoMovieContext g = new PhotoMovieContext();

    public w(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f68659b = activity;
    }

    public final void a(@Nullable Exception exc, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{exc, str}, this, f68658a, false, 78037, new Class[]{Exception.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, str}, this, f68658a, false, 78037, new Class[]{Exception.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.widget.a aVar = this.f68663f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingDialog");
        }
        aVar.dismiss();
        this.g.mMusicPath = com.ss.android.ugc.aweme.port.in.a.i.b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.ss.android.ugc.aweme.port.in.a.i.a());
        a(this.g, (List<? extends e>) arrayList);
    }

    public final void a(@Nullable List<e> list, @Nullable String str) {
        List<e> list2;
        if (PatchProxy.isSupport(new Object[]{list, str}, this, f68658a, false, 78036, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, str}, this, f68658a, false, 78036, new Class[]{List.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.widget.a aVar = this.f68663f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingDialog");
        }
        aVar.dismiss();
        if (list == null) {
            this.g.mMusicList = null;
            list2 = new ArrayList<>();
        } else {
            list2 = list;
        }
        this.g.mMusicPath = str;
        a(this.g, list2);
    }

    private final void a(PhotoMovieContext photoMovieContext, List<? extends e> list) {
        String str;
        if (PatchProxy.isSupport(new Object[]{photoMovieContext, list}, this, f68658a, false, 78038, new Class[]{PhotoMovieContext.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoMovieContext, list}, this, f68658a, false, 78038, new Class[]{PhotoMovieContext.class, List.class}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("content_type", "slideshow");
        if (photoMovieContext.getImageCount() > 1) {
            str = "multiple_content";
        } else {
            str = "single_content";
        }
        r.a("upload_content_next", (Map) a2.a("upload_type", str).f34114b);
        fh fhVar = this.f68660c;
        if (fhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
        }
        photoMovieContext.creationId = fhVar.q;
        fh fhVar2 = this.f68660c;
        if (fhVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
        }
        photoMovieContext.draftId = fhVar2.v;
        fh fhVar3 = this.f68660c;
        if (fhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
        }
        photoMovieContext.mShootWay = fhVar3.r;
        fh fhVar4 = this.f68660c;
        if (fhVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
        }
        photoMovieContext.poiId = fhVar4.D;
        fh fhVar5 = this.f68660c;
        if (fhVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
        }
        photoMovieContext.musicOrigin = fhVar5.i;
        String str2 = this.f68661d;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("musicPath");
        }
        if (!TextUtils.isEmpty(str2)) {
            String str3 = this.f68661d;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("musicPath");
            }
            photoMovieContext.mMusicPath = str3;
            photoMovieContext.mMusic = ej.a().b();
        } else if (Lists.notEmpty(list)) {
            photoMovieContext.mMusic = (e) list.get(0);
        }
        photoMovieContext.mFrom = 2;
        ej a3 = ej.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "PublishManager.inst()");
        photoMovieContext.challenges = a3.f67529b;
        fh fhVar6 = this.f68660c;
        if (fhVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
        }
        g.a(com.ss.android.ugc.aweme.shortvideo.r.b(fhVar6), com.ss.android.ugc.aweme.shortvideo.r.b((BaseShortVideoContext) photoMovieContext), com.ss.android.ugc.aweme.tools.a.e.RECORD, com.ss.android.ugc.aweme.tools.a.e.EDIT);
        v.a(this.f68659b, photoMovieContext, list, "upload");
    }

    public final void a(int i, int i2, @NotNull Intent intent) {
        String str;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68658a, false, 78034, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68658a, false, 78034, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(intent2, "data");
        if (i == 1) {
            ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("key_choose_media_data");
            Intrinsics.checkExpressionValueIsNotNull(parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            List<com.ss.android.ugc.aweme.music.b.a.a> list = parcelableArrayListExtra;
            Parcelable parcelableExtra = intent2.getParcelableExtra("key_short_video_context");
            Intrinsics.checkExpressionValueIsNotNull(parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
            this.f68660c = (fh) parcelableExtra;
            fh fhVar = this.f68660c;
            if (fhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            com.ss.android.ugc.aweme.shortvideo.a.d dVar = fhVar.l;
            Intrinsics.checkExpressionValueIsNotNull(dVar, "shortVideoContext.mWorkspace");
            if (dVar.e() != null) {
                fh fhVar2 = this.f68660c;
                if (fhVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                }
                com.ss.android.ugc.aweme.shortvideo.a.d dVar2 = fhVar2.l;
                Intrinsics.checkExpressionValueIsNotNull(dVar2, "shortVideoContext.mWorkspace");
                File e2 = dVar2.e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "shortVideoContext.mWorkspace.musicFile");
                str = e2.getAbsolutePath();
                Intrinsics.checkExpressionValueIsNotNull(str, "shortVideoContext.mWorks…ce.musicFile.absolutePath");
            } else {
                str = "";
            }
            this.f68661d = str;
            List arrayList = new ArrayList();
            this.g.mImageList = new ArrayList();
            for (com.ss.android.ugc.aweme.music.b.a.a a2 : list) {
                String a3 = a2.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "it.lngLatStr");
                arrayList.add(a3);
            }
            String joinToString$default = CollectionsKt.joinToString$default(arrayList, ";", null, null, 0, null, null, 62, null);
            if (!TextUtils.isEmpty(joinToString$default)) {
                fh fhVar3 = this.f68660c;
                if (fhVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                }
                fhVar3.ag = joinToString$default;
            }
            for (com.ss.android.ugc.aweme.music.b.a.a aVar : list) {
                this.g.mImageList.add(aVar.f56315e);
            }
            if (PatchProxy.isSupport(new Object[0], this, f68658a, false, 78035, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68658a, false, 78035, new Class[0], Void.TYPE);
                return;
            }
            this.f68662e = com.ss.android.ugc.aweme.port.in.a.i.a((a.f) this);
            a.e eVar = this.f68662e;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMusicChoicesPresenter");
            }
            eVar.a(new Object[0]);
            com.ss.android.ugc.aweme.common.widget.a a4 = com.ss.android.ugc.aweme.common.widget.a.a(this.f68659b, this.f68659b.getString(C0906R.string.a0t), "compress_photo_movie_loading.json");
            Intrinsics.checkExpressionValueIsNotNull(a4, "AwemeLoadingDialog.show(…RESS_PHOTO_MOVIE_LOADING)");
            this.f68663f = a4;
        }
    }
}
