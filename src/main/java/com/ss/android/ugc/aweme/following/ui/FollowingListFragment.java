package com.ss.android.ugc.aweme.following.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.b.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.Map;

public class FollowingListFragment extends SimpleUserFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48024a;

    /* renamed from: b  reason: collision with root package name */
    public b f48025b;
    @BindView(2131493033)
    ImageView imgAddFriends;
    @BindView(2131498410)
    View mVSpit;

    /* access modifiers changed from: package-private */
    public final int f() {
        return C0906R.layout.ny;
    }

    public final String h() {
        return "following_list";
    }

    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.common.f.b n() {
        return this.f48025b;
    }

    public final int i() {
        if (!PatchProxy.isSupport(new Object[0], this, f48024a, false, 44977, new Class[0], Integer.TYPE)) {
            return l() ? 2130839716 : 2130839716;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48024a, false, 44977, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean l() {
        if (!PatchProxy.isSupport(new Object[0], this, f48024a, false, 44980, new Class[0], Boolean.TYPE)) {
            return d.a().getCurUserId().equals(this.f3273f.getUid());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48024a, false, 44980, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int m() {
        if (PatchProxy.isSupport(new Object[0], this, f48024a, false, 44981, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48024a, false, 44981, new Class[0], Integer.TYPE)).intValue();
        } else if (l()) {
            return C0906R.string.agf;
        } else {
            return C0906R.string.agg;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48024a, false, 44975, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48024a, false, 44975, new Class[0], Void.TYPE);
            return;
        }
        this.f48025b = new b();
        this.f48025b.a(this);
        this.f48025b.a(new com.ss.android.ugc.aweme.following.a.d(this.f3273f.getUid(), l()));
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f48024a, false, 44982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48024a, false, 44982, new Class[0], Void.TYPE);
            return;
        }
        super.g();
        if (this.mVSpit != null) {
            this.mVSpit.setVisibility(8);
        }
        if (!l() || ex.b()) {
            this.imgAddFriends.setVisibility(8);
        }
    }

    public final int j() {
        if (PatchProxy.isSupport(new Object[0], this, f48024a, false, 44978, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48024a, false, 44978, new Class[0], Integer.TYPE)).intValue();
        } else if (l()) {
            if (a.a()) {
                return C0906R.string.ah2;
            }
            return C0906R.string.dmp;
        } else if (a.a()) {
            return C0906R.string.ah2;
        } else {
            return C0906R.string.dn1;
        }
    }

    public final int k() {
        if (PatchProxy.isSupport(new Object[0], this, f48024a, false, 44979, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48024a, false, 44979, new Class[0], Integer.TYPE)).intValue();
        } else if (l()) {
            if (a.a()) {
                return C0906R.string.ah3;
            }
            return C0906R.string.dmq;
        } else if (a.a()) {
            return C0906R.string.ah4;
        } else {
            return C0906R.string.dn2;
        }
    }

    @OnClick({2131493033})
    public void onViewClicked() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f48024a, false, 44984, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48024a, false, 44984, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() instanceof FollowingFollowerActivity) {
            i = ((FollowingFollowerActivity) getActivity()).f48015c;
        } else {
            i = 0;
        }
        Intent addFriendsActivityIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(getActivity(), i, 5, "", "following");
        if (addFriendsActivityIntent != null) {
            startActivity(addFriendsActivityIntent);
            if (getActivity() instanceof FollowingFollowerActivity) {
                ((FollowingFollowerActivity) getActivity()).c();
            }
        }
        r.a("click_add_friends", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "following").f34114b);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f48024a, false, 44983, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f48024a, false, 44983, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
