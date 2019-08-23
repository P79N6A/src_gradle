package com.ss.android.ugc.aweme.shortvideo.model;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EXTRA_AV_ET_PARAMETER", "", "EXTRA_CONTENT_SOURCE", "EXTRA_CONTENT_TYPE", "EXTRA_CREATION_ID", "EXTRA_DRAFT_ID", "EXTRA_SHOOT_MODE", "EXTRA_SHOOT_WAY", "generateAVETParam", "Lcom/ss/android/ugc/aweme/shortvideo/model/AVETParameter;", "intent", "Landroid/content/Intent;", "tools.service_release"}, k = 2, mv = {1, 1, 15})
public final class AVETParameterKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public static final AVETParameter generateAVETParam(@NotNull Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, null, changeQuickRedirect, true, 77610, new Class[]{Intent.class}, AVETParameter.class)) {
            return (AVETParameter) PatchProxy.accessDispatch(new Object[]{intent2}, null, changeQuickRedirect, true, 77610, new Class[]{Intent.class}, AVETParameter.class);
        }
        Intrinsics.checkParameterIsNotNull(intent2, "intent");
        if (intent2.getSerializableExtra("av_et_parameter") != null) {
            Serializable serializableExtra = intent2.getSerializableExtra("av_et_parameter");
            if (serializableExtra != null) {
                return (AVETParameter) serializableExtra;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.model.AVETParameter");
        }
        AVETParameter aVETParameter = new AVETParameter();
        String stringExtra = intent2.getStringExtra("creation_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVETParameter.setCreationId(stringExtra);
        aVETParameter.setDraftId(intent2.getIntExtra("draft_id", 0));
        String stringExtra2 = intent2.getStringExtra("shoot_way");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        aVETParameter.setShootWay(stringExtra2);
        aVETParameter.setShootMode(intent2.getIntExtra("shoot_mode", 0));
        if (intent2.hasExtra("content_type")) {
            String stringExtra3 = intent2.getStringExtra("content_type");
            Intrinsics.checkExpressionValueIsNotNull(stringExtra3, "intent.getStringExtra(EXTRA_CONTENT_TYPE)");
            aVETParameter.setContentType(stringExtra3);
        }
        if (intent2.hasExtra("content_source")) {
            String stringExtra4 = intent2.getStringExtra("content_source");
            Intrinsics.checkExpressionValueIsNotNull(stringExtra4, "intent.getStringExtra(EXTRA_CONTENT_SOURCE)");
            aVETParameter.setContentSource(stringExtra4);
        }
        return aVETParameter;
    }
}
