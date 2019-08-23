package com.ss.android.ugc.aweme.profile.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ap.a;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;

public final /* synthetic */ class aq implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62478a;

    /* renamed from: b  reason: collision with root package name */
    private final MusMyProfileFragment f62479b;

    aq(MusMyProfileFragment musMyProfileFragment) {
        this.f62479b = musMyProfileFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62478a, false, 68325, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62478a, false, 68325, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        MusMyProfileFragment musMyProfileFragment = this.f62479b;
        a aVar = (a) obj;
        ActivityLinkResponse.LinkInfo linkInfo = null;
        if (!(aVar == null || aVar.f33639b != a.C0431a.SUCCESS || aVar.f33640c == null)) {
            linkInfo = ((ActivityLinkResponse) aVar.f33640c).linkInfo;
        }
        musMyProfileFragment.a(linkInfo);
    }
}
