package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import a.g;
import a.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.j;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/MvMediaProcessImpl;", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/IMediaChosenResultProcess;", "activity", "Landroid/support/v4/app/FragmentActivity;", "(Landroid/support/v4/app/FragmentActivity;)V", "concatDialog", "Lcom/ss/android/ugc/aweme/shortvideo/view/AwemeProgressDialog;", "etParameter", "Lcom/ss/android/ugc/aweme/shortvideo/model/AVETParameter;", "mSelectMvData", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/MvThemeData;", "mvThemeChallenge", "Lcom/ss/android/ugc/aweme/shortvideo/AVChallenge;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "goVideoEditActivity", "", "videoData", "Lcom/ss/android/ugc/aweme/mvtheme/MvCreateVideoData;", "onChosenResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "resizeBitmap", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class u implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68634a;

    /* renamed from: b  reason: collision with root package name */
    public d f68635b;

    /* renamed from: c  reason: collision with root package name */
    j f68636c;

    /* renamed from: d  reason: collision with root package name */
    AVETParameter f68637d;

    /* renamed from: e  reason: collision with root package name */
    fh f68638e;

    /* renamed from: f  reason: collision with root package name */
    c f68639f;
    final FragmentActivity g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.x.a f68641b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f68642c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f68643d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f68644e;

        a(com.ss.android.ugc.aweme.x.a aVar, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3) {
            this.f68641b = aVar;
            this.f68642c = intRef;
            this.f68643d = intRef2;
            this.f68644e = intRef3;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f68640a, false, 78027, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68640a, false, 78027, new Class[0], Void.TYPE);
            } else {
                ArrayList arrayList = new ArrayList();
                String str = com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.a("resize_bitmap_tmp") + File.separator;
                Iterator<String> it2 = this.f68641b.selectMediaList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (com.ss.android.ugc.aweme.video.b.b(next)) {
                        if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.a.a(next) == null) {
                            arrayList.add(next);
                        } else {
                            String str2 = str + com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.b(".bmp");
                            if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.a(next, str2, this.f68642c.element, this.f68643d.element, this.f68644e.element)) {
                                arrayList.add(str2);
                            } else {
                                arrayList.add(next);
                            }
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    this.f68641b.selectMediaList.clear();
                    this.f68641b.selectMediaList.addAll(arrayList);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class b<TTaskResult, TContinuationResult> implements g<Unit, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68645a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f68646b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.x.a f68647c;

        b(u uVar, com.ss.android.ugc.aweme.x.a aVar) {
            this.f68646b = uVar;
            this.f68647c = aVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            List<String> list;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f68645a, false, 78028, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f68645a, false, 78028, new Class[]{i.class}, Void.TYPE);
            } else {
                d dVar = this.f68646b.f68635b;
                if (dVar != null) {
                    dVar.dismiss();
                }
                u uVar = this.f68646b;
                com.ss.android.ugc.aweme.x.a aVar = this.f68647c;
                if (PatchProxy.isSupport(new Object[]{aVar}, uVar, u.f68634a, false, 78026, new Class[]{com.ss.android.ugc.aweme.x.a.class}, Void.TYPE)) {
                    u uVar2 = uVar;
                    PatchProxy.accessDispatch(new Object[]{aVar}, uVar2, u.f68634a, false, 78026, new Class[]{com.ss.android.ugc.aweme.x.a.class}, Void.TYPE);
                } else {
                    r.a("upload_event_next", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("content_type", "photo").a("upload_type", "mv").f34114b);
                    Intent intent = new Intent();
                    j jVar = uVar.f68636c;
                    if (jVar != null) {
                        list = jVar.b();
                    } else {
                        list = null;
                    }
                    aVar.musicIds = list;
                    j jVar2 = uVar.f68636c;
                    if (jVar2 != null && !TextUtils.isEmpty(jVar2.a())) {
                        com.ss.android.ugc.aweme.shortvideo.j jVar3 = new com.ss.android.ugc.aweme.shortvideo.j();
                        jVar3.mvThemeId = jVar2.a();
                        intent.putExtra("av_upload_struct", jVar3);
                        if (!com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) jVar2.b())) {
                            intent.putExtra("first_sticker_music_ids", new Gson().toJson((Object) jVar2.b()));
                        }
                        aVar.mvResUnzipPath = jVar2.e();
                        aVar.mvType = jVar2.l;
                    }
                    String a2 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.a("contact_video");
                    aVar.contactVideoPath = a2 + File.separator + com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.b(".mp4");
                    intent.putExtra("key_mv_theme_data", aVar);
                    intent.putExtra("key_mv_theme_enter", true);
                    AVETParameter aVETParameter = uVar.f68637d;
                    if (aVETParameter != null) {
                        ej a3 = ej.a();
                        Intrinsics.checkExpressionValueIsNotNull(a3, "PublishManager.inst()");
                        List<c> list2 = a3.f67529b;
                        if (uVar.f68639f != null) {
                            if (list2 == null) {
                                list2 = new ArrayList<>();
                            }
                            c cVar = uVar.f68639f;
                            if (cVar == null) {
                                Intrinsics.throwNpe();
                            }
                            list2.add(cVar);
                        }
                        if (list2 != null) {
                            intent.putExtra("challenge", (Serializable) list2);
                            intent.putExtra("shoot_way", aVETParameter.getShootWay());
                            intent.putExtra("creation_id", aVETParameter.getCreationId());
                            intent.putExtra("shoot_mode", aVETParameter.getShootMode());
                            intent.putExtra("draft_id", aVETParameter.getDraftId());
                            intent.putExtra("origin", 1);
                            intent.putExtra("content_type", "mv");
                            intent.putExtra("content_source", "upload");
                            fh fhVar = uVar.f68638e;
                            if (fhVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                            }
                            intent.putExtra("poi_data_in_tools_line", fhVar.D);
                            fh fhVar2 = uVar.f68638e;
                            if (fhVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                            }
                            intent.putExtra("commerce_data_in_tools_line", fhVar2.ah);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.io.Serializable");
                        }
                    }
                    VEVideoPublishEditActivity.a((Context) uVar.g, intent, 1);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public u(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        this.g = fragmentActivity;
    }

    public final void a(int i, int i2, @NotNull Intent intent) {
        Serializable serializable;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68634a, false, 78024, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68634a, false, 78024, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(intent2, "data");
        if (i == 10001) {
            ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("key_choose_media_data");
            String stringExtra = intent2.getStringExtra("key_mv_resource_zip_path");
            Intrinsics.checkExpressionValueIsNotNull(stringExtra, "data.getStringExtra(AVCo…KEY_MV_RESOURCE_ZIP_PATH)");
            Bundle bundleExtra = intent2.getBundleExtra("key_extra_info");
            if (bundleExtra != null) {
                serializable = bundleExtra.getSerializable("Key_mv_challenge");
            } else {
                serializable = null;
            }
            this.f68639f = (c) serializable;
            com.ss.android.ugc.aweme.x.a aVar = new com.ss.android.ugc.aweme.x.a();
            Iterator it2 = parcelableArrayListExtra.iterator();
            while (it2.hasNext()) {
                com.ss.android.ugc.aweme.music.b.a.a aVar2 = (com.ss.android.ugc.aweme.music.b.a.a) it2.next();
                ArrayList<String> arrayList = aVar.selectMediaList;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "mediaModel");
                arrayList.add(aVar2.f56315e);
            }
            aVar.mvResZipPath = stringExtra;
            this.f68636c = (j) intent2.getParcelableExtra("key_select_mv_data");
            Parcelable parcelableExtra = intent2.getParcelableExtra("key_short_video_context");
            Intrinsics.checkExpressionValueIsNotNull(parcelableExtra, "data.getParcelableExtra(KEY_SHORT_VIDEO_CONTEXT)");
            this.f68638e = (fh) parcelableExtra;
            fh fhVar = this.f68638e;
            if (fhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            this.f68637d = fhVar.d();
            if (!com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) aVar.selectMediaList) && !TextUtils.isEmpty(stringExtra)) {
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f68634a, false, 78025, new Class[]{com.ss.android.ugc.aweme.x.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f68634a, false, 78025, new Class[]{com.ss.android.ugc.aweme.x.a.class}, Void.TYPE);
                    return;
                }
                this.f68635b = d.b(this.g, this.g.getString(C0906R.string.c83));
                d dVar = this.f68635b;
                if (dVar != null) {
                    dVar.setIndeterminate(true);
                }
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = 720;
                Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = 1280;
                Ref.IntRef intRef3 = new Ref.IntRef();
                intRef3.element = 1;
                j jVar = this.f68636c;
                if (jVar != null) {
                    if (!(jVar.i == 0 || jVar.j == 0)) {
                        intRef.element = jVar.i;
                        intRef2.element = jVar.j;
                    }
                    if (Intrinsics.areEqual((Object) "AspectFill", (Object) jVar.h)) {
                        intRef3.element = 1;
                    } else if (Intrinsics.areEqual((Object) "AspectFit", (Object) jVar.h)) {
                        intRef3.element = 3;
                    } else if (Intrinsics.areEqual((Object) "AspectWidth", (Object) jVar.h)) {
                        intRef3.element = 2;
                    }
                }
                aVar.srcSelectMediaList.clear();
                aVar.srcSelectMediaList.addAll(aVar.selectMediaList);
                i.a((Callable<TResult>) new a<TResult>(aVar, intRef, intRef2, intRef3)).a((g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(this, aVar), i.f1052b);
            }
        }
    }
}
