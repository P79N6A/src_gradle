package com.ss.android.ugc.aweme.feed.ui;

import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.u.ao;

public abstract class FeedFragment extends AmeBaseFragment {
    public static ChangeQuickRedirect l;
    protected long m = -1;
    public String n;
    protected int o;
    protected String p;

    public void a(long j) {
    }

    public abstract boolean d(boolean z);

    public int e() {
        return 0;
    }

    public String n() {
        return null;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 42616, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 42619, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        L_();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 42618, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        h();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42617, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 42617, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    public void L_() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 42621, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.m != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.m;
            if (currentTimeMillis > 0) {
                if ("nearby".equals(this.n)) {
                    this.n = "homepage_fresh";
                }
                a.a(new m(this, currentTimeMillis));
            }
            this.m = -1;
        }
    }

    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 42620, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && (getActivity() instanceof MainActivity) && this.m == -1 && ((MainActivity) getActivity()).isMainTabVisible()) {
            this.m = System.currentTimeMillis();
        }
    }

    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, l, false, 42625, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, l, false, 42625, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        h();
    }

    public void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, l, false, 42626, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, l, false, 42626, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        L_();
    }

    public void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, l, false, 42614, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, l, false, 42614, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            this.o = bundle.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
            this.n = bundle.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
            this.p = bundle.getString("extra_follow_type", "extra_follow_type_follow");
        }
    }

    public void b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, l, false, 42622, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, l, false, 42622, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        new ao().a(String.valueOf(j)).b(this.n).e();
    }

    public void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, l, false, 42624, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, l, false, 42624, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && (getActivity() instanceof MainActivity)) {
            MainActivity mainActivity = (MainActivity) getActivity();
            if (mainActivity != null) {
                mainActivity.setTabBackground(z);
            }
        }
    }

    public final void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, l, false, 42623, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, l, false, 42623, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && (getActivity() instanceof MainActivity)) {
            MainActivity mainActivity = (MainActivity) getActivity();
            if (mainActivity != null) {
                mainActivity.setInVideoPlayMode(z);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, l, false, 42615, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, l, false, 42615, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        a(getArguments());
    }
}
