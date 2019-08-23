package com.ss.android.ugc.aweme.base.component;

import android.widget.PopupWindow;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.co;
import com.ss.android.ugc.aweme.share.cq;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.f.e;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import kotlin.jvm.internal.Intrinsics;

public final /* synthetic */ class c implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34712a;

    /* renamed from: b  reason: collision with root package name */
    private final e f34713b;

    /* renamed from: c  reason: collision with root package name */
    private final co f34714c;

    /* renamed from: d  reason: collision with root package name */
    private final AVUploadSaveModel f34715d;

    /* renamed from: e  reason: collision with root package name */
    private final AbsActivity f34716e;

    c(e eVar, co coVar, AVUploadSaveModel aVUploadSaveModel, AbsActivity absActivity) {
        this.f34713b = eVar;
        this.f34714c = coVar;
        this.f34715d = aVUploadSaveModel;
        this.f34716e = absActivity;
    }

    public final void onDismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f34712a, false, 24592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34712a, false, 24592, new Class[0], Void.TYPE);
            return;
        }
        e eVar = this.f34713b;
        co coVar = this.f34714c;
        AVUploadSaveModel aVUploadSaveModel = this.f34715d;
        AbsActivity absActivity = this.f34716e;
        Aweme aweme = ((CreateAwemeResponse) eVar.i).aweme;
        String localFinalPath = aVUploadSaveModel.getLocalFinalPath();
        if (PatchProxy.isSupport(new Object[]{aweme, coVar, localFinalPath, absActivity}, null, cq.f64998a, true, 73409, new Class[]{Aweme.class, co.class, String.class, AbsActivity.class}, Void.TYPE)) {
            Object[] objArr = {aweme, coVar, localFinalPath, absActivity};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, cq.f64998a, true, 73409, new Class[]{Aweme.class, co.class, String.class, AbsActivity.class}, Void.TYPE);
            return;
        }
        cq.a aVar = cq.f64999b;
        if (PatchProxy.isSupport(new Object[]{aweme, coVar, localFinalPath, absActivity}, aVar, cq.a.f65000a, false, 73410, new Class[]{Aweme.class, co.class, String.class, AbsActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, coVar, localFinalPath, absActivity}, aVar, cq.a.f65000a, false, 73410, new Class[]{Aweme.class, co.class, String.class, AbsActivity.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aweme, "aweme");
        Intrinsics.checkParameterIsNotNull(coVar, "channel");
        Intrinsics.checkParameterIsNotNull(localFinalPath, "downloadedFilePath");
        Intrinsics.checkParameterIsNotNull(absActivity, PushConstants.INTENT_ACTIVITY_NAME);
    }
}
