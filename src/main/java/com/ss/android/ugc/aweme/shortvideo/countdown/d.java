package com.ss.android.ugc.aweme.shortvideo.countdown;

import android.arch.lifecycle.ViewModelProviders;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.fh;
import java.util.Map;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66064a;

    /* renamed from: b  reason: collision with root package name */
    private final CountdownFragment f66065b;

    /* renamed from: c  reason: collision with root package name */
    private final long f66066c;

    d(CountdownFragment countdownFragment, long j) {
        this.f66065b = countdownFragment;
        this.f66066c = j;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f66064a, false, 75331, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f66064a, false, 75331, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CountdownFragment countdownFragment = this.f66065b;
        long j = this.f66066c;
        fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(countdownFragment.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
        r.a("count_down_start", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v).f34114b);
        if (countdownFragment.f66039c != null) {
            countdownFragment.f66039c.a(countdownFragment.f66038b.getStopPosition() - ((int) j));
            countdownFragment.dismissAllowingStateLoss();
        }
    }
}
