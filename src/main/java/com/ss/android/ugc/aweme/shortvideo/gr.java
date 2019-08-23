package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.g;
import com.ss.android.vesdk.VEUtils;
import dmt.av.video.ah;
import java.util.List;

public final class gr implements k<SynthetiseResult> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67955a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f67956b;

    public final void onFailure(Throwable th) {
    }

    public gr(List<String> list) {
        this.f67956b = list;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f67955a, false, 74751, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f67955a, false, 74751, new Class[]{SynthetiseResult.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f67955a, false, 74752, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f67955a, false, 74752, new Class[]{SynthetiseResult.class}, Void.TYPE);
            return;
        }
        if (synthetiseResult.audioLength - synthetiseResult.videoLength > 3000.0f) {
            String str = synthetiseResult.inputVideoFile;
            if (PatchProxy.isSupport(new Object[]{str}, null, ah.f82889a, true, 92134, new Class[]{String.class}, Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{str}, null, ah.f82889a, true, 92134, new Class[]{String.class}, Integer.TYPE)).intValue();
            } else {
                int[] iArr = new int[10];
                if (VEUtils.getVideoFileInfo(g.a(str, co.VIDEO), iArr) == 0) {
                    i = iArr[3];
                }
            }
            n.a("aweme_synthesis_lost_video_log", bi.a().a("fileInfo", synthetiseResult.toString()).a("duration", Integer.valueOf(i)).b());
        }
        if (!this.f67956b.isEmpty()) {
            n.a("aweme_synthesis_skip_frame_log", bi.a().a("fileInfo", this.f67956b.toString()).b());
        }
    }
}
