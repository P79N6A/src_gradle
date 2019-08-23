package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.profile.d.b;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder;
import java.util.List;

public class FansAdapter extends RecyclerView.Adapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61846a;

    /* renamed from: b  reason: collision with root package name */
    private int f61847b;

    /* renamed from: c  reason: collision with root package name */
    private List<FollowerDetail> f61848c;

    /* renamed from: d  reason: collision with root package name */
    private Context f61849d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f61850e;

    /* renamed from: f  reason: collision with root package name */
    private User f61851f;

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f61846a, false, 68051, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61846a, false, 68051, new Class[0], Integer.TYPE)).intValue();
        } else if (CollectionUtils.isEmpty(this.f61848c)) {
            return 0;
        } else {
            return this.f61848c.size();
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        byte b2;
        int i3 = i;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f61846a, false, 68050, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f61846a, false, 68050, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        FansCardViewHolder fansCardViewHolder = (FansCardViewHolder) viewHolder;
        FollowerDetail followerDetail = this.f61848c.get(i3);
        int i5 = this.f61847b;
        boolean z = this.f61850e;
        if (CollectionUtils.isEmpty(this.f61848c)) {
            i2 = 0;
        } else {
            i2 = this.f61848c.size() - 1;
        }
        if (i3 == i2) {
            b2 = 1;
        } else {
            b2 = 0;
        }
        User user = this.f61851f;
        if (PatchProxy.isSupport(new Object[]{followerDetail, Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(b2), user}, fansCardViewHolder, FansCardViewHolder.f62997a, false, 69667, new Class[]{FollowerDetail.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, User.class}, Void.TYPE)) {
            Object[] objArr = {followerDetail, Integer.valueOf(i5), Byte.valueOf(z), Byte.valueOf(b2), user};
            ChangeQuickRedirect changeQuickRedirect = FansCardViewHolder.f62997a;
            PatchProxy.accessDispatch(objArr, fansCardViewHolder, changeQuickRedirect, false, 69667, new Class[]{FollowerDetail.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, User.class}, Void.TYPE);
            return;
        }
        if (followerDetail != null) {
            fansCardViewHolder.f62999c = followerDetail;
            fansCardViewHolder.f63000d = i5;
            fansCardViewHolder.f63002f = z;
            fansCardViewHolder.g = user;
            fansCardViewHolder.h = followerDetail.getFansCount();
            fansCardViewHolder.txtFansCount.setText(String.valueOf(b.a(followerDetail.getFansCount())));
            fansCardViewHolder.txtPlatform.setText(followerDetail.getName());
            c.a((RemoteImageView) fansCardViewHolder.ivFansPlatform, followerDetail.getIcon());
            if (!fansCardViewHolder.b()) {
                if (PatchProxy.isSupport(new Object[0], fansCardViewHolder, FansCardViewHolder.f62997a, false, 69672, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], fansCardViewHolder, FansCardViewHolder.f62997a, false, 69672, new Class[0], Void.TYPE);
                } else {
                    fansCardViewHolder.ivDetailFans.setAlpha(0.6f);
                    fansCardViewHolder.ivFansPlatform.setAlpha(0.6f);
                    fansCardViewHolder.txtPlatform.setTextColor(ContextCompat.getColor(fansCardViewHolder.f62998b, C0906R.color.a0y));
                    fansCardViewHolder.txtFansCount.setTextColor(ContextCompat.getColor(fansCardViewHolder.f62998b, C0906R.color.a0y));
                }
            }
            if (fansCardViewHolder.c() && fansCardViewHolder.f63001e != null) {
                View view = fansCardViewHolder.f63001e;
                if (b2 != 0) {
                    i4 = 8;
                }
                view.setVisibility(i4);
            }
            if (fansCardViewHolder.b()) {
                fansCardViewHolder.ivDetailFans.setVisibility(4);
            }
            fansCardViewHolder.itemView.setOnClickListener(new View.OnClickListener(z, followerDetail) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63003a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ boolean f63004b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ FollowerDetail f63005c;

                /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
                    if (r7.f63006d.b() == false) goto L_0x00e0;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r19) {
                    /*
                        r18 = this;
                        r7 = r18
                        r9 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r10 = 0
                        r0[r10] = r19
                        com.meituan.robust.ChangeQuickRedirect r2 = f63003a
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.view.View> r1 = android.view.View.class
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 69673(0x11029, float:9.7633E-41)
                        r1 = r18
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0036
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r0[r10] = r19
                        com.meituan.robust.ChangeQuickRedirect r2 = f63003a
                        r3 = 0
                        r4 = 69673(0x11029, float:9.7633E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.view.View> r1 = android.view.View.class
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r18
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x0036:
                        com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r19)
                        com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
                        java.lang.String r1 = "fans_click_from_fans_power"
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r1 = com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder.this
                        boolean r1 = r1.c()
                        if (r1 == 0) goto L_0x0055
                        boolean r1 = r7.f63004b
                        if (r1 == 0) goto L_0x0052
                        java.lang.String r1 = "personal_fans_page"
                        goto L_0x0057
                    L_0x0052:
                        java.lang.String r1 = "others_fans_page"
                        goto L_0x0057
                    L_0x0055:
                        java.lang.String r1 = "personal_homepage"
                    L_0x0057:
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
                        com.ss.android.ugc.aweme.app.d.c r1 = new com.ss.android.ugc.aweme.app.d.c
                        r1.<init>()
                        java.lang.String r2 = "to_app"
                        com.ss.android.ugc.aweme.profile.model.FollowerDetail r3 = r7.f63005c
                        java.lang.String r3 = r3.getAppName()
                        com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                        org.json.JSONObject r1 = r1.b()
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
                        com.ss.android.ugc.aweme.common.r.onEvent(r0)
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r0 = com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder.this
                        boolean r0 = r0.c()
                        if (r0 == 0) goto L_0x0088
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r0 = com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder.this
                        boolean r0 = r0.b()
                        if (r0 != 0) goto L_0x00e5
                        goto L_0x00e0
                    L_0x0088:
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r0 = com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder.this
                        boolean r0 = r0.b()
                        if (r0 == 0) goto L_0x00e0
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r0 = com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder.this
                        java.lang.Object[] r11 = new java.lang.Object[r10]
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder.f62997a
                        r14 = 0
                        r15 = 69671(0x11027, float:9.763E-41)
                        java.lang.Class[] r1 = new java.lang.Class[r10]
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r1 == 0) goto L_0x00ba
                        java.lang.Object[] r11 = new java.lang.Object[r10]
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder.f62997a
                        r14 = 0
                        r15 = 69671(0x11027, float:9.763E-41)
                        java.lang.Class[] r1 = new java.lang.Class[r10]
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        goto L_0x00e5
                    L_0x00ba:
                        com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
                        com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
                        com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity$a r2 = new com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity$a
                        android.content.Context r9 = r0.f62998b
                        r10 = 0
                        com.ss.android.ugc.aweme.IAccountUserService r3 = com.ss.android.ugc.aweme.account.d.a()
                        java.lang.String r11 = r3.getCurUserId()
                        r12 = 1
                        com.ss.android.ugc.aweme.following.ui.SimpleUserFragment$b r13 = com.ss.android.ugc.aweme.following.ui.SimpleUserFragment.b.follower
                        int r14 = r0.h
                        r8 = r2
                        r8.<init>(r9, r10, r11, r12, r13, r14)
                        com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity$a r0 = r2.a(r1)
                        r0.a()
                        return
                    L_0x00e0:
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r0 = com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder.this
                        r0.a()
                    L_0x00e5:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder.AnonymousClass1.onClick(android.view.View):void");
                }

                {
                    this.f63004b = r2;
                    this.f63005c = r3;
                }
            });
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate;
        int i2;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f61846a, false, 68049, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f61846a, false, 68049, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (this.f61847b == 2) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aoy, viewGroup2, false);
        } else if (this.f61847b == 3) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.adz, viewGroup2, false);
        } else if (this.f61847b == 4) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.adz, viewGroup2, false);
        } else if (this.f61847b == 5) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.mo, viewGroup2, false);
        } else {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.mn, viewGroup2, false);
        }
        View view = inflate;
        int i3 = this.f61847b;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), view}, this, f61846a, false, 68052, new Class[]{Integer.TYPE, View.class}, Void.TYPE)) {
            int screenWidth = UIUtils.getScreenWidth(this.f61849d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (i3 < 2 || i3 > 4) {
                i2 = (int) UIUtils.dip2Px(this.f61849d, 0.0f);
            } else {
                i2 = (int) UIUtils.dip2Px(this.f61849d, 5.0f);
                screenWidth = (int) (((float) screenWidth) - UIUtils.dip2Px(this.f61849d, 25.0f));
            }
            if (!CollectionUtils.isEmpty(this.f61848c)) {
                this.f61848c.size();
            }
            switch (i3) {
                case 2:
                    marginLayoutParams.width = (screenWidth - (i2 * 2)) / 2;
                    marginLayoutParams.leftMargin = i2;
                    view.setLayoutParams(marginLayoutParams);
                    break;
                case 3:
                    marginLayoutParams.width = (screenWidth - (i2 * 3)) / 3;
                    marginLayoutParams.leftMargin = i2;
                    view.setLayoutParams(marginLayoutParams);
                    break;
                case 4:
                    marginLayoutParams.leftMargin = i2;
                    view.setLayoutParams(marginLayoutParams);
                    break;
                case 5:
                    marginLayoutParams.width = (screenWidth - (i2 * 2)) / 2;
                    marginLayoutParams.leftMargin = i2;
                    view.setLayoutParams(marginLayoutParams);
                    break;
                case 6:
                    marginLayoutParams.width = (screenWidth - (i2 * 3)) / 3;
                    marginLayoutParams.leftMargin = i2;
                    view.setLayoutParams(marginLayoutParams);
                    break;
                case e.l:
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.width = (int) UIUtils.dip2Px(this.f61849d, 88.0f);
                    view.setLayoutParams(marginLayoutParams);
                    break;
            }
        } else {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), view}, this, f61846a, false, 68052, new Class[]{Integer.TYPE, View.class}, Void.TYPE);
        }
        return new FansCardViewHolder(view);
    }

    public FansAdapter(Context context, int i, List<FollowerDetail> list, boolean z, User user) {
        this.f61847b = i;
        this.f61848c = list;
        this.f61849d = context;
        this.f61850e = z;
        this.f61851f = user;
    }
}
