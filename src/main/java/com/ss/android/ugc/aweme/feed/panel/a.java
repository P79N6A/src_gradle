package com.ss.android.ugc.aweme.feed.panel;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.profile.a;

public final /* synthetic */ class a implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45699a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseListFragmentPanel f45700b;

    a(BaseListFragmentPanel baseListFragmentPanel) {
        this.f45700b = baseListFragmentPanel;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45699a, false, 41732, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45699a, false, 41732, new Class[0], Void.TYPE);
            return;
        }
        BaseListFragmentPanel baseListFragmentPanel = this.f45700b;
        if (baseListFragmentPanel.am != 4) {
            if (com.ss.android.ugc.aweme.profile.a.e() > 0) {
                ao.a(baseListFragmentPanel.topFakeAdaptation, com.ss.android.ugc.aweme.profile.a.e());
                ao.a((View) baseListFragmentPanel.topFakeAdaptationContainer, -2);
            } else {
                ao.a((View) baseListFragmentPanel.topFakeAdaptationContainer, 0);
            }
            if (com.ss.android.ugc.aweme.profile.a.f() > 0) {
                ao.a(baseListFragmentPanel.bottomFakeAdaptation, com.ss.android.ugc.aweme.profile.a.f());
                ao.a((View) baseListFragmentPanel.bottomFakeAdaptationContainer, -2);
                return;
            }
            ao.a((View) baseListFragmentPanel.bottomFakeAdaptationContainer, 0);
            return;
        }
        ao.a((View) baseListFragmentPanel.topFakeAdaptationContainer, 0);
        ao.a((View) baseListFragmentPanel.bottomFakeAdaptationContainer, 0);
    }
}
