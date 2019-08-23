package com.ss.android.ugc.aweme.poi.ui.comment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.u.ao;

public class AbsPoiCommentFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60544a;

    /* renamed from: b  reason: collision with root package name */
    protected long f60545b = -1;

    /* renamed from: c  reason: collision with root package name */
    protected c f60546c;

    private static String b() {
        return "poi_page";
    }

    public String a() {
        return "";
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60544a, false, 66235, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60544a, false, 66235, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (PatchProxy.isSupport(new Object[0], this, f60544a, false, 66237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60544a, false, 66237, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.f60545b == -1) {
            this.f60545b = System.currentTimeMillis();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f60544a, false, 66236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60544a, false, 66236, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (PatchProxy.isSupport(new Object[0], this, f60544a, false, 66238, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60544a, false, 66238, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.f60545b != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f60545b;
            if (currentTimeMillis > 0) {
                r.a(getContext(), "stay_time", b(), currentTimeMillis, 0);
                new ao().a(String.valueOf(currentTimeMillis)).b(b()).f(this.f60546c.getPoiId()).a(this.f60546c).e(a()).e();
            }
            this.f60545b = -1;
        }
    }
}
