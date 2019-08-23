package com.ss.android.ugc.aweme.profile.ui;

import android.arch.lifecycle.Observer;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ap.a;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import java.util.Calendar;

public final /* synthetic */ class bi implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62522a;

    /* renamed from: b  reason: collision with root package name */
    private final MyProfileFragment f62523b;

    bi(MyProfileFragment myProfileFragment) {
        this.f62523b = myProfileFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62522a, false, 68563, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62522a, false, 68563, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        MyProfileFragment myProfileFragment = this.f62523b;
        a aVar = (a) obj;
        ActivityLinkResponse.LinkInfo linkInfo = null;
        bm bmVar = (bm) c.a(myProfileFragment.getContext(), bm.class);
        if (!(aVar == null || aVar.f33639b != a.C0431a.SUCCESS || aVar.f33640c == null)) {
            linkInfo = ((ActivityLinkResponse) aVar.f33640c).linkInfo;
            if (bmVar != null && TextUtils.equals("", bmVar.c(""))) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(System.currentTimeMillis());
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                bmVar.d(instance.getTimeInMillis());
            }
        }
        if (com.ss.android.g.a.a()) {
            myProfileFragment.E.a(linkInfo);
            return;
        }
        if (bmVar != null && !bmVar.x(false)) {
            myProfileFragment.E.a(linkInfo);
        }
    }
}
