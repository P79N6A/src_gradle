package com.ss.android.ugc.aweme.feed.c;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FloatingCardInfo;
import com.ss.android.ugc.aweme.feed.ui.VideoBottomButton;
import com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45085a;

    /* renamed from: b  reason: collision with root package name */
    public VideoBottomButton f45086b;

    /* renamed from: c  reason: collision with root package name */
    public VideoFloatingCard f45087c;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f45088d;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f45089e;

    public c(View view) {
        this.f45088d = (ViewGroup) view.findViewById(C0906R.id.im);
        this.f45086b = (VideoBottomButton) view.findViewById(C0906R.id.drt);
        this.f45087c = (VideoFloatingCard) view.findViewById(C0906R.id.ds5);
    }

    public void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f45085a, false, 40961, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f45085a, false, 40961, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f45087c.a(j, null, new i(this, j));
    }

    /* access modifiers changed from: package-private */
    public void a(FloatingCardInfo floatingCardInfo) {
        if (PatchProxy.isSupport(new Object[]{floatingCardInfo}, this, f45085a, false, 40957, new Class[]{FloatingCardInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{floatingCardInfo}, this, f45085a, false, 40957, new Class[]{FloatingCardInfo.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.discover.hitrank.c.c(floatingCardInfo.getSchema())) {
            r.a("enter_star_board", (Map) d.a().a("enter_from", "star_ad").f34114b);
            h.a().a(com.ss.android.ugc.aweme.discover.hitrank.c.a("star_ad"));
        } else {
            h.a().a(floatingCardInfo.getSchema());
        }
    }
}
