package com.ss.android.ugc.aweme.newfollow.userstate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.feed.h.aa;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.newfollow.f.f;
import com.ss.android.ugc.aweme.newfollow.ui.j;
import com.ss.android.ugc.aweme.newfollow.util.ScreenBroadcastReceiver;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.utils.dq;
import java.util.List;

public class UserStateFragment extends ProfileListFragment implements d, b.a, ScreenBroadcastReceiver.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57359a;

    /* renamed from: b  reason: collision with root package name */
    public AwemeListFragment.a f57360b;

    /* renamed from: c  reason: collision with root package name */
    protected long f57361c = -1;

    /* renamed from: d  reason: collision with root package name */
    public String f57362d;

    /* renamed from: e  reason: collision with root package name */
    public int f57363e;

    /* renamed from: f  reason: collision with root package name */
    public String f57364f;
    protected String g;
    public boolean h = true;
    private UserStateFeedViewHolder l;
    private c m;
    private a n;
    private f o;
    private ScreenBroadcastReceiver p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;

    public final void a(List list, int i) {
    }

    public final void a_(int i) {
    }

    public final void l() {
    }

    public final boolean j() {
        return this.h;
    }

    public final void K_() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61836, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.mStatusActive && !this.q) {
            if (this.l != null) {
                this.l.j();
            }
            this.q = true;
        }
    }

    public final boolean e() {
        if (!PatchProxy.isSupport(new Object[0], this, f57359a, false, 61845, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals(this.f57364f, com.ss.android.ugc.aweme.account.d.a().getCurUserId());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61845, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61839, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61839, new Class[0], View.class);
        } else if (!isViewValid() || this.l == null) {
            return null;
        } else {
            return this.l.mRecyclerView;
        }
    }

    public void onDetach() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61831, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61831, new Class[0], Void.TYPE);
            return;
        }
        super.onDetach();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61829, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.mStatusActive = false;
        if (this.l != null) {
            this.l.l();
        }
        this.q = false;
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61828, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61828, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.l != null) {
            this.l.k();
        }
        this.q = false;
    }

    public final void H_() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61838, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61838, new Class[0], Void.TYPE);
        } else if (this.r) {
            d();
        } else {
            if (!this.t && !TimeLockRuler.isTeenModeON()) {
                a();
            } else if (this.l != null) {
                UserStateFeedViewHolder userStateFeedViewHolder = this.l;
                if (PatchProxy.isSupport(new Object[0], userStateFeedViewHolder, UserStateFeedViewHolder.f57340a, false, 61792, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], userStateFeedViewHolder, UserStateFeedViewHolder.f57340a, false, 61792, new Class[0], Void.TYPE);
                } else {
                    userStateFeedViewHolder.mLoadingStatusView.setVisibility(4);
                    userStateFeedViewHolder.mPrivateAccountView.setVisibility(0);
                }
            }
        }
    }

    public final void J_() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61841, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.l != null && this.l.mRecyclerView.getChildCount() > 0) {
            this.l.mRecyclerView.smoothScrollToPosition(0);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61843, new Class[0], Void.TYPE);
        } else if (this.l != null && this.l.j != null) {
            ((UserStateFeedAdapter) this.l.j).resetLoadMoreState();
            ((UserStateFeedAdapter) this.l.j).clearData();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61844, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (this.l != null) {
                this.l.f();
            }
            if (this.f57360b != null) {
                this.f57360b.a("personal_homepage".equals(this.f57362d), 5);
            }
        }
    }

    public final boolean k() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61840, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61840, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid() || this.l == null || this.l.j == null) {
            return false;
        } else {
            if (((UserStateFeedAdapter) this.l.j).getItemCount() == 0) {
                z = true;
            }
            return z;
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61835, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.m != null) {
            this.m.k();
            this.m.j();
            this.m.p();
            this.m.o();
        }
        if (this.o != null) {
            this.o.k();
            this.o.j();
            this.o.e();
        }
        if (this.l != null) {
            this.l.m();
        }
        this.p.a();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61830, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (getUserVisibleHint() && !dq.a()) {
            if (this.l != null) {
                this.l.j();
            }
            this.q = true;
        }
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61832, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61832, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid() || TimeLockRuler.isTeenModeON()) {
            return false;
        } else {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                if (!this.h) {
                    a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                }
                this.h = true;
                return false;
            }
            this.h = false;
            boolean z = !this.m.m();
            if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.account.d.a().getCurUserId()) && this.l != null) {
                this.l.a();
            }
            return z;
        }
    }

    public final void a(boolean z) {
        this.t = z;
    }

    public final void c(boolean z) {
        this.r = z;
        if (this.l != null) {
            this.l.g = z;
        }
    }

    public final void d(boolean z) {
        this.s = z;
        if (this.l != null) {
            this.l.h = z;
        }
    }

    public void onAttach(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f57359a, false, 61827, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f57359a, false, 61827, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f57359a, false, 61823, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f57359a, false, 61823, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f57362d = arguments.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE");
        this.f57364f = arguments.getString("uid");
        this.g = arguments.getString("sec_user_id");
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57359a, false, 61833, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57359a, false, 61833, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.l != null) {
            this.l.d(z);
        }
        if (z) {
            if (this.l != null) {
                this.l.j();
            }
        } else if (this.l != null) {
            this.l.l();
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f57359a, false, 61842, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f57359a, false, 61842, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) || this.l != null) {
            this.f57364f = str;
            this.g = str2;
            if (this.l != null) {
                this.l.a(str, str2);
            }
            this.h = true;
            if (this.m != null) {
                this.m.t = this.f57364f;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        c cVar;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f57359a, false, 61825, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f57359a, false, 61825, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.o = new f(this.f57362d, this.f57363e);
        this.o.d();
        this.l = new UserStateFeedViewHolder(this.f57364f, this.g, e());
        this.o.a(new aa());
        this.o.a((j) this.l);
        this.p = new ScreenBroadcastReceiver(getContext());
        this.p.a(this);
        if (PatchProxy.isSupport(new Object[0], this, f57359a, false, 61826, new Class[0], c.class)) {
            cVar = (c) PatchProxy.accessDispatch(new Object[0], this, f57359a, false, 61826, new Class[0], c.class);
        } else {
            if (this.m == null) {
                this.m = new c(this);
                this.m.s = this.f57362d;
                this.m.t = this.f57364f;
            }
            cVar = this.m;
        }
        this.m = cVar;
        this.m.a((Fragment) this, this.f57363e);
        this.m.a(this.l);
        this.l.a(this, view, this.m, this.o);
        this.n = new a();
        this.m.a(this.n);
    }

    public static UserStateFragment a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f57359a, true, 61822, new Class[]{String.class, String.class, String.class}, UserStateFragment.class)) {
            return (UserStateFragment) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f57359a, true, 61822, new Class[]{String.class, String.class, String.class}, UserStateFragment.class);
        }
        UserStateFragment userStateFragment = new UserStateFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", str4);
        bundle.putString("uid", str5);
        bundle.putString("sec_user_id", str6);
        userStateFragment.setArguments(bundle);
        return userStateFragment;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f57359a, false, 61837, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f57359a, false, 61837, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f57359a, false, 61824, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.r4, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f57359a, false, 61824, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
