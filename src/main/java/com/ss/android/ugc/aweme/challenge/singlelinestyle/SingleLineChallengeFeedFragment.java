package com.ss.android.ugc.aweme.challenge.singlelinestyle;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.challenge.model.mixfeed.ChallengeMixFeedModel;
import com.ss.android.ugc.aweme.feed.h.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.f.c;
import com.ss.android.ugc.aweme.newfollow.f.f;
import com.ss.android.ugc.aweme.newfollow.g.a;
import com.ss.android.ugc.aweme.newfollow.ui.j;
import com.ss.android.ugc.aweme.newfollow.util.ScreenBroadcastReceiver;
import com.ss.android.ugc.aweme.newfollow.util.e;
import com.ss.android.ugc.aweme.utils.dq;

public class SingleLineChallengeFeedFragment extends SingleLineBaseFeedFragment {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f35419c;

    /* renamed from: d  reason: collision with root package name */
    protected String f35420d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f35421e = true;

    /* renamed from: f  reason: collision with root package name */
    private b f35422f;
    private a g;
    private ChallengeMixFeedModel h;
    private ScreenBroadcastReceiver i;
    private f j;
    private boolean k;
    private String l;
    private boolean m;
    private int n;
    private String o;
    private String p;

    public static String d() {
        return "challenge";
    }

    public final void a(View view, Aweme aweme, String str) {
    }

    public final void g() {
    }

    public final View f() {
        if (this.f35422f == null) {
            return null;
        }
        return this.f35422f.mRecyclerView;
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25918, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null && !dq.a()) {
            a.a();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25903, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.f35422f.mRecyclerView.getChildCount() > 0) {
            this.f35422f.mRecyclerView.smoothScrollToPosition(0);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25922, new Class[0], Void.TYPE);
            return;
        }
        h();
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f35419c, false, 25917, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("challenge");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25917, new Class[0], Analysis.class);
    }

    public void onDetach() {
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25913, new Class[0], Void.TYPE);
            return;
        }
        super.onDetach();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25911, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.mStatusActive = false;
        this.mStatusActive = false;
        if (this.f35422f != null) {
            this.f35422f.l();
        }
        this.k = false;
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25910, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25910, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.f35422f != null) {
            this.f35422f.k();
        }
        this.k = false;
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25914, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25914, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                if (!this.f35421e) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                }
                this.f35421e = true;
                return false;
            }
            this.f35421e = false;
            boolean z = !this.g.m();
            if (this.f35422f != null) {
                this.f35422f.a();
            }
            return z;
        }
    }

    public final void K_() {
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25921, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.mStatusActive && !this.k) {
            if (this.f35422f != null) {
                this.f35422f.j();
            }
            i();
            this.k = true;
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25920, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.g != null) {
            this.g.k();
            this.g.j();
            this.g.p();
            this.g.o();
        }
        if (this.j != null) {
            this.j.k();
            this.j.j();
            this.j.e();
        }
        if (this.f35422f != null) {
            this.f35422f.m();
        }
        this.i.a();
        e.a().a("key_container_challenge");
        c.a().b();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25912, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (getUserVisibleHint() && !dq.a()) {
            if (this.f35422f != null) {
                this.f35422f.j();
            }
            i();
            this.k = true;
        }
    }

    public final void a(String str) {
        this.f35420d = str;
        this.m = false;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35419c, false, 25901, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35419c, false, 25901, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            this.n = bundle.getInt("detail_aweme_list_type", 0);
            this.o = bundle.getString("event_label", "");
            this.f35420d = bundle.getString("detail_id", "");
            this.l = bundle.getString("detail_aweme_from", "");
            this.m = bundle.getBoolean("extra_challenge_is_hashtag", false);
            this.p = bundle.getString("extra_challenge_hashtag_name", "");
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35419c, false, 25904, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35419c, false, 25904, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f35420d = arguments.getString("detail_id");
        }
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35419c, false, 25916, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35419c, false, 25916, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        if (this.f35422f != null) {
            this.f35422f.b_(!z);
        }
        if (!z && this.f35422f != null) {
            h();
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35419c, false, 25915, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35419c, false, 25915, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.f35422f != null) {
            this.f35422f.d(z);
        }
        if (z) {
            i();
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25919, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25919, new Class[0], Void.TYPE);
            return;
        }
        if (!e.a().b()) {
            a.a("challenge", "list");
        }
    }

    public final void a(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f35419c, false, 25905, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f35419c, false, 25905, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f35419c, false, 25909, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f35419c, false, 25909, new Class[]{View.class, Bundle.class}, Void.TYPE);
        } else {
            this.f35422f = new b();
            this.i = new ScreenBroadcastReceiver(getContext());
            this.i.a(this);
            if (this.f35418b != null) {
                this.f35422f.f35428d = this.f35418b;
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25908, new Class[0], Void.TYPE);
        } else {
            this.j = new f(d(), 5);
            this.j.d();
            this.g = new a(this);
            this.g.a((Fragment) this, 5);
        }
        if (PatchProxy.isSupport(new Object[0], this, f35419c, false, 25906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35419c, false, 25906, new Class[0], Void.TYPE);
        } else {
            this.h = new ChallengeMixFeedModel();
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, f35419c, false, 25907, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35419c, false, 25907, new Class[]{View.class}, Void.TYPE);
        } else {
            this.j.a(new aa());
            this.j.a((j) this.f35422f);
            this.g.a(this.f35422f);
            this.f35422f.a(this, view, this.g, this.j, this.f35420d, d(), 5, this.m, this.p, this.n);
            this.g.a(this.h);
        }
        if (getUserVisibleHint() && this.f35421e) {
            h();
        }
    }
}
