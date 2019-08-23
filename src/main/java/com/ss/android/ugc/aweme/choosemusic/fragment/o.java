package com.ss.android.ugc.aweme.choosemusic.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.utils.ad;

public final /* synthetic */ class o implements CommonTabLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35990a;

    /* renamed from: b  reason: collision with root package name */
    private final NewMusicTabFragment f35991b;

    o(NewMusicTabFragment newMusicTabFragment) {
        this.f35991b = newMusicTabFragment;
    }

    public final void a(CommonTabLayout.e eVar) {
        Bundle bundle;
        CommonTabLayout.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f35990a, false, 26707, new Class[]{CommonTabLayout.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f35990a, false, 26707, new Class[]{CommonTabLayout.e.class}, Void.TYPE);
            return;
        }
        NewMusicTabFragment newMusicTabFragment = this.f35991b;
        if (eVar2.f40629f == 1) {
            String string = newMusicTabFragment.getString(C0906R.string.ads);
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                if (c.a()) {
                    bundle = null;
                } else {
                    bundle = ad.a().a("login_title", string).f75487b;
                }
                e.a((Fragment) newMusicTabFragment, "", "click_my_music", bundle);
                return;
            }
        }
        eVar.a();
    }
}
