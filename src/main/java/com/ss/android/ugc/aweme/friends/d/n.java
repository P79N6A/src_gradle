package com.ss.android.ugc.aweme.friends.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.r;
import java.util.ArrayList;
import java.util.Map;

public final class n extends b<m, g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48883a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<Long> f48884b = new ArrayList<>(1);

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48883a, false, 46714, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48883a, false, 46714, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((g) this.f2979f).b();
        }
        if (this.f48884b.size() > 0) {
            r.a("address_list_load_duration", (Map) d.a().a("duration", System.currentTimeMillis() - this.f48884b.remove(0).longValue()).a("is_success", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).f34114b);
        }
    }

    public final void a(Exception exc) {
        int i;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f48883a, false, 46713, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f48883a, false, 46713, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((g) this.f2979f).a(exc);
        }
        if (this.f48884b.size() > 0) {
            if (exc instanceof a) {
                i = ((a) exc).getErrorCode();
            } else {
                i = 0;
            }
            r.a("address_list_load_duration", (Map) d.a().a("duration", System.currentTimeMillis() - this.f48884b.remove(0).longValue()).a("is_success", PushConstants.PUSH_TYPE_NOTIFY).a("error_type", i).f34114b);
        }
    }
}
