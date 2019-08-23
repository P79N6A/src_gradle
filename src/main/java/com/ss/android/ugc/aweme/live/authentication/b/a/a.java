package com.ss.android.ugc.aweme.live.authentication.b.a;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.live.authentication.b.a;
import com.ss.android.ugc.aweme.live.authentication.model.b;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;

public final class a implements com.ss.android.ugc.aweme.live.authentication.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53298a;

    /* renamed from: b  reason: collision with root package name */
    private Fragment f53299b;

    public final void a(a.C0618a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f53298a, false, 55643, new Class[]{a.C0618a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f53298a, false, 55643, new Class[]{a.C0618a.class}, Void.TYPE);
        } else if (aVar.a().f53308a.is_phone_binded) {
            aVar.a(aVar.a());
        } else {
            if (this.f53299b == null) {
                this.f53299b = c.c().createLiveBindPhoneFragment(new IAccountService.h() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f53300a;

                    public final void a(int i, int i2, @Nullable Object obj) {
                        Object obj2 = obj;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f53300a, false, 55644, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f53300a, false, 55644, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
                            return;
                        }
                        if (i2 == 1) {
                            if (obj2 instanceof String) {
                                d.a().getCurUser().setBindPhone((String) obj2);
                                d.a().getCurUser().setPhoneBinded(true);
                            }
                            b.a().f53325b.is_phone_binded = true;
                            bg.a(new com.ss.android.ugc.aweme.fe.a.a(2));
                            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84705, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84705, new Class[0], Void.TYPE);
                            } else {
                                r.a("livesdk_number_bound", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("_param_live_platform", "live").a("event_page", "live_take_page").a("event_belong", "live_take").f34114b);
                            }
                        } else {
                            d.a().getCurUser().setBindPhone("");
                        }
                    }
                });
            }
            if (!this.f53299b.isAdded()) {
                aVar.a().f53309b.a(this.f53299b);
            }
        }
    }
}
