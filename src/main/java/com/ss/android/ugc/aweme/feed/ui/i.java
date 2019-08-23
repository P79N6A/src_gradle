package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.listener.n;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final /* synthetic */ class i implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46670a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedFollowFragment f46671b;

    i(FeedFollowFragment feedFollowFragment) {
        this.f46671b = feedFollowFragment;
    }

    public final void p() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f46670a, false, 42606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46670a, false, 42606, new Class[0], Void.TYPE);
            return;
        }
        FeedFollowFragment feedFollowFragment = this.f46671b;
        if (PatchProxy.isSupport(new Object[0], feedFollowFragment, FeedFollowFragment.f3198e, false, 42591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], feedFollowFragment, FeedFollowFragment.f3198e, false, 42591, new Class[0], Void.TYPE);
            return;
        }
        if (feedFollowFragment.i != null) {
            ag agVar = feedFollowFragment.i;
            if (PatchProxy.isSupport(new Object[0], agVar, ag.f46463a, false, 42807, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], agVar, ag.f46463a, false, 42807, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = agVar.f46468e.size() == 0;
            }
            if (z) {
                feedFollowFragment.l();
            } else if (!feedFollowFragment.j) {
                if (PatchProxy.isSupport(new Object[0], feedFollowFragment, FeedFollowFragment.f3198e, false, 42602, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], feedFollowFragment, FeedFollowFragment.f3198e, false, 42602, new Class[0], Void.TYPE);
                } else if (feedFollowFragment.i != null && feedFollowFragment.isViewValid()) {
                    if (MainPageExperimentHelper.n()) {
                        switch (AbTestManager.a().bN()) {
                            case 1:
                                feedFollowFragment.a(true, false, false);
                                break;
                            case 2:
                                if (!ag.f()) {
                                    feedFollowFragment.a((View) feedFollowFragment.mSkyLightStyleBTxt, true, true);
                                    break;
                                } else {
                                    feedFollowFragment.a(true, false, false);
                                    feedFollowFragment.a((View) feedFollowFragment.mSkyLightStyleBTxt, false, true);
                                    break;
                                }
                            case 3:
                                if (!ag.f()) {
                                    feedFollowFragment.a((View) feedFollowFragment.mSkyLightStyleCLayout, true, true);
                                    break;
                                } else {
                                    feedFollowFragment.f(false);
                                    break;
                                }
                        }
                    } else if (ag.e()) {
                        if (ag.f()) {
                            feedFollowFragment.a(true, false, false);
                        }
                        if (feedFollowFragment.h != null) {
                            feedFollowFragment.h.a("follow_live_skylight_btn_show", (Object) Boolean.TRUE);
                        }
                    }
                }
            }
            ag.g = false;
            ag.b(false);
        }
    }
}
