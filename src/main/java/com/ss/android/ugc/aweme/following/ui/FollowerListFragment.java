package com.ss.android.ugc.aweme.following.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.following.b.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

public class FollowerListFragment extends SimpleUserFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47992a;

    /* renamed from: b  reason: collision with root package name */
    public a f47993b;
    @BindView(2131493033)
    ImageView imgAddFriends;
    @BindView(2131494217)
    View viewFansDivider;

    /* access modifiers changed from: package-private */
    public final int f() {
        return C0906R.layout.nw;
    }

    public final String h() {
        return "fans_list";
    }

    public final /* bridge */ /* synthetic */ b n() {
        return this.f47993b;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f47992a, false, 44923, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47992a, false, 44923, new Class[0], Void.TYPE);
            return;
        }
        super.g();
    }

    public final int i() {
        if (!PatchProxy.isSupport(new Object[0], this, f47992a, false, 44928, new Class[0], Integer.TYPE)) {
            return l() ? 2130839716 : 2130839716;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47992a, false, 44928, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean l() {
        if (!PatchProxy.isSupport(new Object[0], this, f47992a, false, 44931, new Class[0], Boolean.TYPE)) {
            return d.a().getCurUserId().equals(this.f3273f.getUid());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47992a, false, 44931, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int m() {
        if (PatchProxy.isSupport(new Object[0], this, f47992a, false, 44932, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47992a, false, 44932, new Class[0], Integer.TYPE)).intValue();
        } else if (l()) {
            return C0906R.string.agv;
        } else {
            return C0906R.string.agw;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47992a, false, 44921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47992a, false, 44921, new Class[0], Void.TYPE);
            return;
        }
        this.f47993b = new a();
        this.f47993b.a(this);
        this.f47993b.a(new com.ss.android.ugc.aweme.following.a.b(this.f3273f.getUid()));
    }

    public final int j() {
        if (PatchProxy.isSupport(new Object[0], this, f47992a, false, 44929, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47992a, false, 44929, new Class[0], Integer.TYPE)).intValue();
        } else if (l()) {
            if (com.ss.android.g.a.a()) {
                return C0906R.string.agx;
            }
            return C0906R.string.dmn;
        } else if (com.ss.android.g.a.a()) {
            return C0906R.string.agx;
        } else {
            return C0906R.string.dn3;
        }
    }

    public final int k() {
        if (PatchProxy.isSupport(new Object[0], this, f47992a, false, 44930, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47992a, false, 44930, new Class[0], Integer.TYPE)).intValue();
        } else if (l()) {
            if (com.ss.android.g.a.a()) {
                return C0906R.string.agy;
            }
            return C0906R.string.dmo;
        } else if (com.ss.android.g.a.a()) {
            return C0906R.string.agz;
        } else {
            return C0906R.string.dn4;
        }
    }

    @OnClick({2131493033})
    public void onViewClicked() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f47992a, false, 44935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47992a, false, 44935, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() instanceof FollowingFollowerActivity) {
            i = ((FollowingFollowerActivity) getActivity()).f48015c;
        } else {
            i = 0;
        }
        Intent addFriendsActivityIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(getActivity(), i, 6, "", "fans");
        if (addFriendsActivityIntent != null) {
            startActivity(addFriendsActivityIntent);
            if (getActivity() instanceof FollowingFollowerActivity) {
                ((FollowingFollowerActivity) getActivity()).c();
            }
        }
        r.a("click_add_friends", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "fans").f34114b);
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f47992a, false, 44933, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47992a, false, 44933, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", true);
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        intent.putExtras(bundle);
        intent.setData(Uri.parse((String) SharePrefCache.inst().getSyncToTTUrl().c()));
        startActivity(intent);
    }

    public final void b(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f47992a, false, 44927, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f47992a, false, 44927, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.b(exc);
        if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            this.f3271d.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x014b, code lost:
        if (r9 != false) goto L_0x014d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            r10 = 1
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f47992a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 44924(0xaf7c, float:6.2952E-41)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f47992a
            r3 = 0
            r4 = 44924(0xaf7c, float:6.2952E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            super.onViewCreated(r12, r13)
            com.ss.android.ugc.aweme.following.ui.b r0 = r11.f3273f
            com.ss.android.ugc.aweme.profile.model.User r7 = r0.getUser()
            r0 = 8
            if (r7 == 0) goto L_0x0095
            boolean r1 = com.ss.android.ugc.aweme.profile.ui.y.a((com.ss.android.ugc.aweme.profile.model.User) r7)
            if (r1 == 0) goto L_0x006c
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r1 = r11.mTitleBar
            android.content.Context r2 = r11.getContext()
            r3 = 2131624999(0x7f0e0427, float:1.8877194E38)
            int r2 = android.support.v4.content.ContextCompat.getColor(r2, r3)
            r1.setBackgroundColor(r2)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r1 = r11.mTitleBar
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.getEndText()
            r1.setVisibility(r9)
            goto L_0x007a
        L_0x006c:
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r1 = r11.mTitleBar
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.getEndText()
            r1.setVisibility(r0)
            android.view.View r1 = r11.viewFansDivider
            r1.setVisibility(r0)
        L_0x007a:
            boolean r1 = r11.l()
            if (r1 == 0) goto L_0x008f
            android.widget.ImageView r1 = r11.imgAddFriends
            r1.setVisibility(r9)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r1 = r11.mTitleBar
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.getEndText()
            r1.setVisibility(r0)
            goto L_0x00ac
        L_0x008f:
            android.widget.ImageView r1 = r11.imgAddFriends
            r1.setVisibility(r0)
            goto L_0x00ac
        L_0x0095:
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r1 = r11.mTitleBar
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.getEndText()
            r1.setVisibility(r0)
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.b()
            r0 = r0 ^ r10
            android.view.View[] r1 = new android.view.View[r10]
            android.widget.ImageView r2 = r11.imgAddFriends
            r1[r9] = r2
            com.ss.android.ugc.aweme.base.utils.v.a((boolean) r0, (android.view.View[]) r1)
        L_0x00ac:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47992a
            r3 = 0
            r4 = 44925(0xaf7d, float:6.2953E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00d7
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47992a
            r3 = 0
            r4 = 44925(0xaf7d, float:6.2953E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00f6
        L_0x00d7:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x00f5
            com.ss.android.ugc.aweme.following.ui.b r0 = r11.f3273f
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            boolean r0 = com.ss.android.ugc.aweme.profile.ui.y.a((com.ss.android.ugc.aweme.profile.model.User) r0)
            if (r0 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.following.ui.b r0 = r11.f3273f
            com.ss.android.ugc.aweme.following.ui.SimpleUserFragment$b r0 = r0.getPageType()
            com.ss.android.ugc.aweme.following.ui.SimpleUserFragment$b r1 = com.ss.android.ugc.aweme.following.ui.SimpleUserFragment.b.follower
            if (r0 != r1) goto L_0x00f5
            r0 = 1
            goto L_0x00f6
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            if (r0 != 0) goto L_0x014d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f47992a
            r3 = 0
            r4 = 44926(0xaf7e, float:6.2955E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x012f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f47992a
            r3 = 0
            r4 = 44926(0xaf7e, float:6.2955E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L_0x014b
        L_0x012f:
            if (r7 == 0) goto L_0x014b
            boolean r0 = com.ss.android.ugc.aweme.profile.ui.y.a((com.ss.android.ugc.aweme.profile.model.User) r7)
            if (r0 == 0) goto L_0x013c
            int r0 = r7.getFansCount()
            goto L_0x0140
        L_0x013c:
            int r0 = r7.getFollowerCount()
        L_0x0140:
            boolean r1 = com.ss.android.g.a.b()
            if (r1 != 0) goto L_0x014b
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 < r1) goto L_0x014b
            r9 = 1
        L_0x014b:
            if (r9 == 0) goto L_0x0162
        L_0x014d:
            android.content.Context r0 = r11.getContext()
            android.support.v7.widget.RecyclerView r1 = r11.mListView
            com.ss.android.ugc.aweme.following.ui.b r2 = r11.f3273f
            com.ss.android.ugc.aweme.following.ui.FollowerCardViewHolder r0 = com.ss.android.ugc.aweme.following.ui.c.a(r0, r1, r2)
            com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter r1 = r11.f3271d
            android.view.View r0 = r0.b()
            r1.a(r0)
        L_0x0162:
            android.support.v7.widget.RecyclerView r0 = r11.mListView
            com.ss.android.ugc.aweme.utils.di.b((android.support.v7.widget.RecyclerView) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.FollowerListFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f47992a, false, 44934, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f47992a, false, 44934, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
