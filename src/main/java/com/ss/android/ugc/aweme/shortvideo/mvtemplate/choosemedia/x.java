package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.c;
import com.ss.android.ugc.aweme.photo.j;
import com.ss.android.ugc.aweme.shortvideo.e.j;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity;
import com.ss.android.ugc.aweme.tools.a.e;
import com.ss.android.ugc.aweme.tools.a.g;
import com.ss.android.ugc.aweme.utils.bc;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/StoryPhotoChosenResultImpl;", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/IMediaChosenResultProcess;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "addExtraInfoToIntent", "", "intent", "Landroid/content/Intent;", "compressImage", "filePath", "", "onChosenResult", "requestCode", "", "resultCode", "data", "onPhotoSelected", "photoContext", "Lcom/ss/android/ugc/aweme/photo/PhotoContext;", "toPhotoEditPage", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class x implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68664a;

    /* renamed from: b  reason: collision with root package name */
    fh f68665b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Activity f68666c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x f68668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f68669c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f68670d;

        a(x xVar, String str, d dVar) {
            this.f68668b = xVar;
            this.f68669c = str;
            this.f68670d = dVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f68667a, false, 78044, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68667a, false, 78044, new Class[0], Void.TYPE);
                return;
            }
            final PhotoContext a2 = j.a(this.f68669c, new c());
            if (a2 != null) {
                a2.md5 = j.a.a(new File(this.f68669c));
            }
            com.ss.android.b.a.a.a.b(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68671a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f68672b;

                {
                    this.f68672b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f68671a, false, 78045, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f68671a, false, 78045, new Class[0], Void.TYPE);
                        return;
                    }
                    bc.b(this.f68672b.f68670d);
                    if (a2 == null) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) this.f68672b.f68668b.f68666c, (int) C0906R.string.b0w).a();
                        return;
                    }
                    x xVar = this.f68672b.f68668b;
                    PhotoContext photoContext = a2;
                    if (PatchProxy.isSupport(new Object[]{photoContext}, xVar, x.f68664a, false, 78041, new Class[]{PhotoContext.class}, Void.TYPE)) {
                        x xVar2 = xVar;
                        PatchProxy.accessDispatch(new Object[]{photoContext}, xVar2, x.f68664a, false, 78041, new Class[]{PhotoContext.class}, Void.TYPE);
                        return;
                    }
                    fh fhVar = xVar.f68665b;
                    if (fhVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    fhVar.d().setContentSource("upload");
                    fh fhVar2 = xVar.f68665b;
                    if (fhVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    fhVar2.d().setContentType("photo");
                    fh fhVar3 = xVar.f68665b;
                    if (fhVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    photoContext.mShootWay = fhVar3.r;
                    ej a2 = ej.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "PublishManager.inst()");
                    photoContext.challenges = a2.f67529b;
                    fh fhVar4 = xVar.f68665b;
                    if (fhVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    photoContext.mPoiId = fhVar4.D;
                    fh fhVar5 = xVar.f68665b;
                    if (fhVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    photoContext.microAppModel = fhVar5.am;
                    fh fhVar6 = xVar.f68665b;
                    if (fhVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    photoContext.setAvetParameter(fhVar6.d());
                    r.onEvent(MobClick.obtain().setEventName("upload_next").setLabelName("photo").setExtValueLong(1));
                    fh fhVar7 = xVar.f68665b;
                    if (fhVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    g.a(com.ss.android.ugc.aweme.shortvideo.r.b(fhVar7), com.ss.android.ugc.aweme.shortvideo.r.a(photoContext), e.RECORD, e.EDIT);
                    fh fhVar8 = xVar.f68665b;
                    if (fhVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    if (PatchProxy.isSupport(new Object[]{photoContext, fhVar8}, xVar, x.f68664a, false, 78042, new Class[]{PhotoContext.class, fh.class}, Void.TYPE)) {
                        x xVar3 = xVar;
                        PatchProxy.accessDispatch(new Object[]{photoContext, fhVar8}, xVar3, x.f68664a, false, 78042, new Class[]{PhotoContext.class, fh.class}, Void.TYPE);
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("story_mediaType", 0);
                    intent.putExtra("photo_model", photoContext);
                    if (fhVar8.ap != null) {
                        StoryFestivalModel storyFestivalModel = fhVar8.ap;
                        if (storyFestivalModel != null) {
                            intent.putExtra("story_festival_model", storyFestivalModel);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.os.Parcelable");
                        }
                    }
                    intent.putExtra("creation_id", fhVar8.q);
                    intent.putExtra("av_et_parameter", photoContext.getAvetParameter());
                    if (PatchProxy.isSupport(new Object[]{intent, fhVar8}, xVar, x.f68664a, false, 78043, new Class[]{Intent.class, fh.class}, Void.TYPE)) {
                        x xVar4 = xVar;
                        PatchProxy.accessDispatch(new Object[]{intent, fhVar8}, xVar4, x.f68664a, false, 78043, new Class[]{Intent.class, fh.class}, Void.TYPE);
                    } else {
                        intent.putExtra("send_to_user_head", fhVar8.ar);
                        intent.putExtra("enter_from", fhVar8.s);
                    }
                    VideoStoryEditPublishActivity.a(xVar.f68666c, intent, 4);
                }
            });
        }
    }

    public x(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f68666c = activity;
    }

    public final void a(int i, int i2, @NotNull Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68664a, false, 78039, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68664a, false, 78039, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(intent2, "data");
        if (i == 1) {
            ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("key_choose_media_data");
            Intrinsics.checkExpressionValueIsNotNull(parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            Parcelable parcelableExtra = intent2.getParcelableExtra("key_short_video_context");
            Intrinsics.checkExpressionValueIsNotNull(parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
            this.f68665b = (fh) parcelableExtra;
            String str = ((com.ss.android.ugc.aweme.music.b.a.a) parcelableArrayListExtra.get(0)).f56315e;
            Intrinsics.checkExpressionValueIsNotNull(str, "selectedMediaData[0].filePath");
            if (PatchProxy.isSupport(new Object[]{str}, this, f68664a, false, 78040, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f68664a, false, 78040, new Class[]{String.class}, Void.TYPE);
                return;
            }
            d b2 = d.b(this.f68666c, "");
            Intrinsics.checkExpressionValueIsNotNull(b2, "dialog");
            b2.setIndeterminate(true);
            v.a((Dialog) b2);
            com.ss.android.b.a.a.a.a(new a(this, str, b2));
        }
    }
}
