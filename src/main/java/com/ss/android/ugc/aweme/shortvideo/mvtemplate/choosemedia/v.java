package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.c;
import com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity;
import com.ss.android.ugc.aweme.photo.j;
import com.ss.android.ugc.aweme.shortvideo.e.j;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.tools.a.e;
import com.ss.android.ugc.aweme.tools.a.g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/PhotoChosenResultImpl;", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/IMediaChosenResultProcess;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "compressImage", "", "filePath", "", "onChosenResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onPhotoSelected", "photoContext", "Lcom/ss/android/ugc/aweme/photo/PhotoContext;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class v implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68648a;

    /* renamed from: b  reason: collision with root package name */
    fh f68649b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Activity f68650c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f68652b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f68653c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f68654d;

        a(v vVar, String str, d dVar) {
            this.f68652b = vVar;
            this.f68653c = str;
            this.f68654d = dVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f68651a, false, 78032, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68651a, false, 78032, new Class[0], Void.TYPE);
                return;
            }
            final PhotoContext a2 = j.a(this.f68653c, new c());
            if (a2 != null) {
                a2.md5 = j.a.a(new File(this.f68653c));
            }
            com.ss.android.b.a.a.a.b(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68655a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f68656b;

                {
                    this.f68656b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f68655a, false, 78033, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f68655a, false, 78033, new Class[0], Void.TYPE);
                        return;
                    }
                    this.f68656b.f68654d.dismiss();
                    if (a2 == null) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) this.f68656b.f68652b.f68650c, (int) C0906R.string.b0w).a();
                        return;
                    }
                    v vVar = this.f68656b.f68652b;
                    PhotoContext photoContext = a2;
                    if (PatchProxy.isSupport(new Object[]{photoContext}, vVar, v.f68648a, false, 78031, new Class[]{PhotoContext.class}, Void.TYPE)) {
                        v vVar2 = vVar;
                        PatchProxy.accessDispatch(new Object[]{photoContext}, vVar2, v.f68648a, false, 78031, new Class[]{PhotoContext.class}, Void.TYPE);
                        return;
                    }
                    fh fhVar = vVar.f68649b;
                    if (fhVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    photoContext.mShootWay = fhVar.r;
                    ej a2 = ej.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "PublishManager.inst()");
                    photoContext.challenges = a2.f67529b;
                    fh fhVar2 = vVar.f68649b;
                    if (fhVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    photoContext.mPoiId = fhVar2.D;
                    fh fhVar3 = vVar.f68649b;
                    if (fhVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    photoContext.microAppModel = fhVar3.am;
                    fh fhVar4 = vVar.f68649b;
                    if (fhVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    photoContext.mFromOtherPlatform = fhVar4.an;
                    r.onEvent(MobClick.obtain().setEventName("upload_next").setLabelName("photo").setExtValueLong(1));
                    fh fhVar5 = vVar.f68649b;
                    if (fhVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    g.a(com.ss.android.ugc.aweme.shortvideo.r.b(fhVar5), com.ss.android.ugc.aweme.shortvideo.r.a(photoContext), e.RECORD, e.EDIT);
                    fh fhVar6 = vVar.f68649b;
                    if (fhVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                    }
                    if (fhVar6.an) {
                        PhotoEditActivity.a(vVar.f68650c, photoContext, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
                    } else {
                        PhotoEditActivity.a((Context) vVar.f68650c, photoContext);
                    }
                }
            });
        }
    }

    public v(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f68650c = activity;
    }

    public final void a(int i, int i2, @NotNull Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68648a, false, 78029, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68648a, false, 78029, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(intent2, "data");
        if (i == 1) {
            ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("key_choose_media_data");
            Intrinsics.checkExpressionValueIsNotNull(parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            List<com.ss.android.ugc.aweme.music.b.a.a> list = parcelableArrayListExtra;
            List arrayList = new ArrayList();
            for (com.ss.android.ugc.aweme.music.b.a.a a2 : list) {
                String a3 = a2.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "it.lngLatStr");
                arrayList.add(a3);
            }
            Parcelable parcelableExtra = intent2.getParcelableExtra("key_short_video_context");
            Intrinsics.checkExpressionValueIsNotNull(parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
            this.f68649b = (fh) parcelableExtra;
            String joinToString$default = CollectionsKt.joinToString$default(arrayList, ";", null, null, 0, null, null, 62, null);
            if (!TextUtils.isEmpty(joinToString$default)) {
                fh fhVar = this.f68649b;
                if (fhVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                }
                fhVar.ag = joinToString$default;
            }
            String str = ((com.ss.android.ugc.aweme.music.b.a.a) list.get(0)).f56315e;
            Intrinsics.checkExpressionValueIsNotNull(str, "selectedMediaData[0].filePath");
            if (PatchProxy.isSupport(new Object[]{str}, this, f68648a, false, 78030, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f68648a, false, 78030, new Class[]{String.class}, Void.TYPE);
                return;
            }
            d b2 = d.b(this.f68650c, "");
            Intrinsics.checkExpressionValueIsNotNull(b2, "dialog");
            b2.setIndeterminate(true);
            com.ss.android.ugc.aweme.base.utils.v.a((Dialog) b2);
            com.ss.android.b.a.a.a.a(new a(this, str, b2));
        }
    }
}
