package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.tools.a.e;
import com.ss.android.ugc.aweme.tools.a.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/VideoChosenResultImpl;", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/IMediaChosenResultProcess;", "activity", "Landroid/app/Activity;", "minDuration", "", "(Landroid/app/Activity;J)V", "getActivity", "()Landroid/app/Activity;", "getMinDuration", "()J", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "checkValid", "", "videosInfo", "", "Lcom/ss/android/ugc/aweme/music/mediachoose/helper/MediaModel;", "onChosenResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "toCutVideoActivity", "filePath", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class z implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68677a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Activity f68678b;

    /* renamed from: c  reason: collision with root package name */
    public final long f68679c;

    /* renamed from: d  reason: collision with root package name */
    private fh f68680d;

    private final void a(List<? extends a> list) {
        String str;
        int i;
        if (PatchProxy.isSupport(new Object[]{list}, this, f68677a, false, 78049, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f68677a, false, 78049, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Collection collection = list;
        int size = collection.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += (int) ((a) list.get(i3)).h;
        }
        if (((long) i2) <= this.f68679c) {
            UIUtils.displayToast((Context) this.f68678b, this.f68678b.getString(C0906R.string.dp6, new Object[]{Long.valueOf(this.f68679c / 1000)}));
        } else if (i2 > 3600000) {
            UIUtils.displayToast((Context) this.f68678b, (int) C0906R.string.bcy);
        } else {
            d.a().b();
            int size2 = collection.size();
            for (int i4 = 0; i4 < size2; i4++) {
                d.a().a((a) list.get(i4));
            }
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("content_type", "video");
            if (list.size() > 1) {
                str = "multiple_content";
            } else {
                str = "single_content";
            }
            r.a("upload_content_next", (Map) a2.a("upload_type", str).a("video_cnt", list.size()).a("duration_ms", i2).f34114b);
            String str2 = ((a) list.get(0)).f56315e;
            Intrinsics.checkExpressionValueIsNotNull(str2, "videosInfo[0].filePath");
            if (PatchProxy.isSupport(new Object[]{str2}, this, f68677a, false, 78050, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f68677a, false, 78050, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intent intent = new Intent();
            fh fhVar = this.f68680d;
            if (fhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent.putExtra("from_music_detail", Intrinsics.areEqual((Object) "single_song", (Object) fhVar.r));
            fh fhVar2 = this.f68680d;
            if (fhVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent.putExtra("creation_id", fhVar2.q);
            fh fhVar3 = this.f68680d;
            if (fhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent.putExtra("shoot_way", fhVar3.r);
            fh fhVar4 = this.f68680d;
            if (fhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            com.ss.android.ugc.aweme.shortvideo.a.d dVar = fhVar4.l;
            Intrinsics.checkExpressionValueIsNotNull(dVar, "shortVideoContext.mWorkspace");
            if (dVar.e() != null) {
                fh fhVar5 = this.f68680d;
                if (fhVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                }
                com.ss.android.ugc.aweme.shortvideo.a.d dVar2 = fhVar5.l;
                Intrinsics.checkExpressionValueIsNotNull(dVar2, "shortVideoContext.mWorkspace");
                File e2 = dVar2.e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "shortVideoContext.mWorkspace.musicFile");
                intent.putExtra("path", e2.getAbsolutePath());
            }
            ej a3 = ej.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "PublishManager.inst()");
            List<c> list2 = a3.f67529b;
            if (!Lists.isEmpty(list2)) {
                intent.putExtra("av_challenge", list2.get(0));
            }
            fh fhVar6 = this.f68680d;
            if (fhVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent.putExtra("poi_struct_in_tools_line", fhVar6.D);
            fh fhVar7 = this.f68680d;
            if (fhVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent.putExtra("micro_app_info", fhVar7.am);
            fh fhVar8 = this.f68680d;
            if (fhVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            g.a(intent, com.ss.android.ugc.aweme.shortvideo.r.b(fhVar8), e.RECORD, e.CUT);
            fh fhVar9 = this.f68680d;
            if (fhVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            if (fhVar9.an) {
                i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR;
            } else {
                i = -1;
            }
            VECutVideoActivity.f66190b.a(this.f68678b, intent, i);
        }
    }

    public z(@NotNull Activity activity, long j) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f68678b = activity;
        this.f68679c = j;
    }

    public final void a(int i, int i2, @NotNull Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68677a, false, 78048, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68677a, false, 78048, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(intent2, "data");
        if (i == 1) {
            ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("key_choose_media_data");
            Intrinsics.checkExpressionValueIsNotNull(parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            Parcelable parcelableExtra = intent2.getParcelableExtra("key_short_video_context");
            Intrinsics.checkExpressionValueIsNotNull(parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
            this.f68680d = (fh) parcelableExtra;
            a(parcelableArrayListExtra);
        }
    }
}
