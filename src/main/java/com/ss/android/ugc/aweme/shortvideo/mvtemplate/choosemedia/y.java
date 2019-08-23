package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.r;
import com.ss.android.ugc.aweme.tools.a.e;
import com.ss.android.ugc.aweme.tools.a.g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/StoryVideoChosenResultImpl;", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/IMediaChosenResultProcess;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "onChosenResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onLocalVideoSelected", "videoFile", "", "isMultiEdit", "", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class y implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68674a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Activity f68675b;

    /* renamed from: c  reason: collision with root package name */
    private fh f68676c;

    public y(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f68675b = activity;
    }

    public final void a(int i, int i2, @NotNull Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68674a, false, 78046, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), -1, intent2}, this, f68674a, false, 78046, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(intent2, "data");
        if (i == 1) {
            ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("key_choose_media_data");
            Intrinsics.checkExpressionValueIsNotNull(parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            List list = parcelableArrayListExtra;
            Parcelable parcelableExtra = intent2.getParcelableExtra("key_short_video_context");
            Intrinsics.checkExpressionValueIsNotNull(parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
            this.f68676c = (fh) parcelableExtra;
            d.a().b();
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                d.a().a((a) list.get(i3));
            }
            String str = ((a) list.get(0)).f56315e;
            Intrinsics.checkExpressionValueIsNotNull(str, "selectedMediaData[0].filePath");
            if (PatchProxy.isSupport(new Object[]{str, (byte) 0}, this, f68674a, false, 78047, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, (byte) 0}, this, f68674a, false, 78047, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            fh fhVar = this.f68676c;
            if (fhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            fhVar.d().setContentSource("upload");
            fh fhVar2 = this.f68676c;
            if (fhVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            fhVar2.d().setContentType("video");
            Intent intent3 = new Intent();
            fh fhVar3 = this.f68676c;
            if (fhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent3.putExtra("from_music_detail", Intrinsics.areEqual((Object) "single_song", (Object) fhVar3.r));
            fh fhVar4 = this.f68676c;
            if (fhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent3.putExtra("creation_id", fhVar4.q);
            fh fhVar5 = this.f68676c;
            if (fhVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent3.putExtra("shoot_way", fhVar5.r);
            fh fhVar6 = this.f68676c;
            if (fhVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent3.putExtra("min_duration", fhVar6.f67721d);
            fh fhVar7 = this.f68676c;
            if (fhVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent3.putExtra("shoot_mode", fhVar7.N);
            fh fhVar8 = this.f68676c;
            if (fhVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            com.ss.android.ugc.aweme.shortvideo.a.d dVar = fhVar8.l;
            Intrinsics.checkExpressionValueIsNotNull(dVar, "shortVideoContext.mWorkspace");
            if (dVar.e() != null) {
                fh fhVar9 = this.f68676c;
                if (fhVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
                }
                com.ss.android.ugc.aweme.shortvideo.a.d dVar2 = fhVar9.l;
                Intrinsics.checkExpressionValueIsNotNull(dVar2, "shortVideoContext.mWorkspace");
                File e2 = dVar2.e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "shortVideoContext.mWorkspace.musicFile");
                intent3.putExtra("path", e2.getAbsolutePath());
            }
            ej a2 = ej.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "PublishManager.inst()");
            List<c> list2 = a2.f67529b;
            if (list2 != null && !list2.isEmpty()) {
                intent3.putExtra("av_challenge", list2.get(0));
            }
            fh fhVar10 = this.f68676c;
            if (fhVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent3.putExtra("poi_data_in_tools_line", fhVar10.D);
            fh fhVar11 = this.f68676c;
            if (fhVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent3.putExtra("micro_app_info", fhVar11.am);
            fh fhVar12 = this.f68676c;
            if (fhVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent3.putExtra("av_et_parameter", fhVar12.d());
            fh fhVar13 = this.f68676c;
            if (fhVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent3.putExtra("send_to_user_head", fhVar13.ar);
            fh fhVar14 = this.f68676c;
            if (fhVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            intent3.putExtra("enter_from", fhVar14.s);
            fh fhVar15 = this.f68676c;
            if (fhVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            g.a(intent3, r.b(fhVar15), e.RECORD, e.CUT);
            fh fhVar16 = this.f68676c;
            if (fhVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shortVideoContext");
            }
            if (TextUtils.equals(fhVar16.s, "from_chat")) {
                VECutVideoActivity.f66190b.a(this.f68675b, intent3, 4);
            } else {
                VECutVideoActivity.f66190b.a(this.f68675b, intent3, -1);
            }
        }
    }
}
