package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.property.f;
import dmt.av.video.ah;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"getContentSource", "", "model", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "getContentType", "mobEnterVideoEditPage", "", "intent", "Landroid/content/Intent;", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class bz {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67157a;

    private static final String a(cb cbVar) {
        if (PatchProxy.isSupport(new Object[]{cbVar}, null, f67157a, true, 76542, new Class[]{cb.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{cbVar}, null, f67157a, true, 76542, new Class[]{cb.class}, String.class);
        } else if (cbVar.getAvetParameter() != null) {
            return cbVar.getAvetParameter().getContentType();
        } else {
            if (cbVar.isMvThemeVideoType()) {
                return "mv";
            }
            return "video";
        }
    }

    private static final String b(cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, null, f67157a, true, 76543, new Class[]{cb.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{cbVar2}, null, f67157a, true, 76543, new Class[]{cb.class}, String.class);
        } else if (cbVar.getAvetParameter() != null) {
            return cbVar.getAvetParameter().getContentSource();
        } else {
            if (cbVar2.mFromCut || cbVar2.mFromMultiCut || cbVar.isMvThemeVideoType()) {
                return "upload";
            }
            return "shoot";
        }
    }

    public static final void a(@NotNull cb cbVar, @Nullable Intent intent) {
        String str;
        int i;
        String str2;
        int i2;
        String str3;
        String str4;
        cb cbVar2 = cbVar;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{cbVar2, intent2}, null, f67157a, true, 76541, new Class[]{cb.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cbVar2, intent2}, null, f67157a, true, 76541, new Class[]{cb.class, Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cbVar2, "model");
        int[] a2 = ah.a(cbVar2.mPath);
        d a3 = d.a().a("creation_id", cbVar2.creationId).a("shoot_way", cbVar2.mShootWay).a("draft_id", cbVar2.draftId).a("filter_list", cbVar2.mCurFilterLabels).a("filter_id_list", cbVar2.mCurFilterIds);
        if (f.a()) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        d a4 = a3.a("is_hardcode", str).a("bite_rate", String.valueOf(f.e()));
        if (a2 != null) {
            i = a2[6];
        } else {
            i = 0;
        }
        d a5 = a4.a("file_bitrate", i).a("video_quality", f.g());
        if (cbVar.getOriginal() == 1) {
            str2 = f.h();
        } else {
            str2 = f.i();
        }
        d a6 = a5.a("resolution", str2).a("content_type", a(cbVar)).a("content_source", b(cbVar)).a("draft_version", cbVar.getNewVersion()).a("prop_list", cbVar2.mStickerID);
        if (a2 != null) {
            i2 = a2[7];
        } else {
            i2 = 0;
        }
        d a7 = a6.a("edit_fps", i2);
        if (TextUtils.equals(b(cbVar), "upload")) {
            a7.a("fast_import", cbVar2.isFastImport ? 1 : 0);
            if (cbVar2.mFromMultiCut) {
                str4 = "multiple_content";
            } else {
                str4 = "single_content";
            }
            a7.a("upload_type", str4);
            a7.a("fast_import_fail", cbVar2.fastImportErrorCode);
        }
        if (intent2 != null) {
            if (intent2.getBooleanExtra("extra_is_change_speed", false)) {
                str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str3 = PushConstants.PUSH_TYPE_NOTIFY;
            }
            a7.a("is_speed_change", str3);
        }
        r.a("enter_video_edit_page", (Map) a7.f34114b);
    }
}
