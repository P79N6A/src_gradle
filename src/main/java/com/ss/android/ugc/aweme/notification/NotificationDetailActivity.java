package com.ss.android.ugc.aweme.notification;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.activity.AmeSlideBaseActivity;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter;
import com.ss.android.ugc.aweme.notification.b.o;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.DiggNotice;
import com.ss.android.ugc.aweme.notification.bean.FollowNotice;
import com.ss.android.ugc.aweme.notification.bean.FriendNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.api.b.d;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

@AddPageTrace
public class NotificationDetailActivity extends AmeSlideBaseActivity implements Observer<d>, SwipeRefreshLayout.OnRefreshListener, LoadMoreRecyclerViewAdapter.a, c<BaseNotice> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3692b = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f3693e = "NotificationDetailActivity";
    private TextTitleBar A;
    private String B;
    private String C;
    private int D;
    private Integer E;
    private DiggNotice F;
    private i G;

    /* renamed from: c  reason: collision with root package name */
    public DmtStatusView f3694c;

    /* renamed from: d  reason: collision with root package name */
    View f3695d;

    /* renamed from: f  reason: collision with root package name */
    private String f3696f = "";
    private boolean g;
    private int u;
    private int v;
    private RecyclerView w;
    private SwipeRefreshLayout x;
    private NotificationAdapter y;
    private o z;

    public final int a() {
        return C0906R.layout.cq;
    }

    public final void c(List<BaseNotice> list, boolean z2) {
    }

    public final void d(Exception exc) {
    }

    public final void n_() {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3692b, false, 62860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3692b, false, 62860, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3692b, false, 62861, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3692b, false, 62861, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final void z_() {
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f3692b, false, 62858, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3692b, false, 62858, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        com.ss.android.ugc.aweme.ae.c.a(this);
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3692b, false, 62852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3692b, false, 62852, new Class[0], Void.TYPE);
            return;
        }
        this.y.showLoadMoreLoading();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3692b, false, 62846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3692b, false, 62846, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public Analysis getAnalysis() {
        if (PatchProxy.isSupport(new Object[0], this, f3692b, false, 62856, new Class[0], Analysis.class)) {
            return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f3692b, false, 62856, new Class[0], Analysis.class);
        }
        Analysis analysis = new Analysis();
        String str = "fans";
        int i = this.u;
        switch (i) {
            case 0:
                str = "fans";
                break;
            case 1:
                str = "like";
                break;
            case 2:
                str = "at";
                break;
            case 3:
                str = "comment";
                break;
            default:
                switch (i) {
                    case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        str = "commentandat";
                        break;
                    case 13:
                        str = "story";
                        break;
                }
        }
        return analysis.setLabelName(str);
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f3692b, false, 62848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3692b, false, 62848, new Class[0], Void.TYPE);
            return;
        }
        this.z.a(4, Integer.valueOf(this.v), this.E);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3692b, false, 62857, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3692b, false, 62857, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.z != null) {
            this.z.k();
        }
        if (this.u == 0 || this.u == 11) {
            bg.d(this);
        }
        if (this.G != null) {
            this.G.b().removeObserver(this);
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3692b, false, 62850, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3692b, false, 62850, new Class[0], Void.TYPE);
            return;
        }
        if (this.y.mShowFooter) {
            this.y.setShowFooter(false);
            this.y.notifyDataSetChanged();
            this.y.showLoadMoreEmpty();
        }
        this.x.setRefreshing(false);
        if (this.y.getItemCount() == 0) {
            this.f3694c.e();
        }
    }

    public void onRefresh() {
        if (PatchProxy.isSupport(new Object[0], this, f3692b, false, 62847, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3692b, false, 62847, new Class[0], Void.TYPE);
            return;
        }
        if (this.F != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.F.getUsers().size(); i++) {
                BaseNotice baseNotice = new BaseNotice();
                DiggNotice diggNotice = new DiggNotice(this.F);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add((User) this.F.getUsers().get(i));
                diggNotice.setUsers(arrayList2);
                diggNotice.setMergeCount(1);
                baseNotice.diggNotice = diggNotice;
                arrayList.add(baseNotice);
            }
            this.f3694c.b();
            this.y.setData(arrayList);
            this.y.notifyDataSetChanged();
        } else if (NetworkUtils.b(this)) {
            if (this.y.getItemCount() == 0) {
                this.f3694c.d();
            }
            this.z.a(1, Integer.valueOf(this.v), this.E);
        } else if (this.y.getItemCount() == 0) {
            a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57830a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f57830a, false, 62864, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57830a, false, 62864, new Class[0], Void.TYPE);
                    } else if (NotificationDetailActivity.this.isViewValid()) {
                        NotificationDetailActivity.this.f3694c.f();
                        com.bytedance.ies.dmt.ui.d.a.b((Context) NotificationDetailActivity.this, (int) C0906R.string.bgf).a();
                    }
                }
            }, 100);
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3692b, false, 62853, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3692b, false, 62853, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.y.showPullUpLoadMore();
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3692b, false, 62849, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3692b, false, 62849, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.y.mShowFooter) {
            this.y.setShowFooter(false);
            this.y.notifyDataSetChanged();
        }
        this.x.setRefreshing(false);
        if (this.y.getItemCount() == 0) {
            this.f3694c.f();
        }
    }

    private static Class a(int i) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f3692b, true, 62837, new Class[]{Integer.TYPE}, Class.class)) {
            return (Class) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f3692b, true, 62837, new Class[]{Integer.TYPE}, Class.class);
        }
        if (i != 0 || !AbTestManager.a().aL()) {
            z2 = false;
        }
        if (z2) {
            return FansDetailActivity.class;
        }
        return NotificationDetailActivity.class;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.ss.android.ugc.aweme.profile.model.User} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.ss.android.ugc.aweme.story.api.b.d r7 = (com.ss.android.ugc.aweme.story.api.b.d) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.b.d> r1 = com.ss.android.ugc.aweme.story.api.b.d.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62859(0xf58b, float:8.8084E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            r3 = 0
            r4 = 62859(0xf58b, float:8.8084E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.b.d> r1 = com.ss.android.ugc.aweme.story.api.b.d.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0035:
            if (r7 == 0) goto L_0x00b9
            com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter r0 = r10.y
            java.util.List r0 = r0.getData()
            if (r0 == 0) goto L_0x00b8
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0047
            goto L_0x00b8
        L_0x0047:
            java.util.Iterator r0 = r0.iterator()
        L_0x004b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b9
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.notification.bean.BaseNotice r1 = (com.ss.android.ugc.aweme.notification.bean.BaseNotice) r1
            r2 = 0
            int r3 = r10.u
            switch(r3) {
                case 0: goto L_0x009e;
                case 1: goto L_0x0088;
                case 12: goto L_0x0072;
                case 13: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x00a2
        L_0x005e:
            com.ss.android.ugc.aweme.notification.bean.StoryNotice r1 = r1.storyNotice
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r1 = r1.users
            if (r1 == 0) goto L_0x00a2
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x00a2
            java.lang.Object r1 = r1.get(r9)
            r2 = r1
            com.ss.android.ugc.aweme.profile.model.User r2 = (com.ss.android.ugc.aweme.profile.model.User) r2
            goto L_0x00a2
        L_0x0072:
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r3 = r1.commentNotice
            if (r3 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r1 = r1.commentNotice
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.comment
            com.ss.android.ugc.aweme.profile.model.User r2 = r1.getUser()
            goto L_0x00a2
        L_0x007f:
            com.ss.android.ugc.aweme.notification.bean.AtMe r3 = r1.atMe
            if (r3 == 0) goto L_0x00a2
            com.ss.android.ugc.aweme.notification.bean.AtMe r1 = r1.atMe
            com.ss.android.ugc.aweme.profile.model.User r2 = r1.user
            goto L_0x00a2
        L_0x0088:
            com.ss.android.ugc.aweme.notification.bean.DiggNotice r1 = r1.diggNotice
            java.util.List r1 = r1.getUsers()
            if (r1 == 0) goto L_0x00a2
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x00a2
            java.lang.Object r1 = r1.get(r9)
            r2 = r1
            com.ss.android.ugc.aweme.profile.model.User r2 = (com.ss.android.ugc.aweme.profile.model.User) r2
            goto L_0x00a2
        L_0x009e:
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r1 = r1.followNotice
            com.ss.android.ugc.aweme.profile.model.User r2 = r1.user
        L_0x00a2:
            if (r2 == 0) goto L_0x004b
            boolean r1 = r7.f71832b
            if (r1 == 0) goto L_0x004b
            java.lang.String r1 = r2.getUid()
            java.lang.String r3 = r7.f71831a
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x004b
            r2.setHasUnreadStory(r9)
            goto L_0x004b
        L_0x00b8:
            return
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.NotificationDetailActivity.onChanged(java.lang.Object):void");
    }

    @Subscribe
    public void onProfileFollowEvent(com.ss.android.ugc.aweme.challenge.a.d dVar) {
        int i;
        com.ss.android.ugc.aweme.challenge.a.d dVar2 = dVar;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3692b, false, 62855, new Class[]{com.ss.android.ugc.aweme.challenge.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3692b, false, 62855, new Class[]{com.ss.android.ugc.aweme.challenge.a.d.class}, Void.TYPE);
            return;
        }
        Object obj = dVar2.f35319b;
        if (obj == null || !(obj instanceof User)) {
            return;
        }
        User user = (User) obj;
        int i3 = dVar2.f35318a;
        NotificationAdapter notificationAdapter = this.y;
        if (i3 == 1 || i3 == 2) {
            i = 2;
        } else {
            i = 0;
        }
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, notificationAdapter, NotificationAdapter.f57927a, false, 63059, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            NotificationAdapter notificationAdapter2 = notificationAdapter;
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, notificationAdapter2, NotificationAdapter.f57927a, false, 63059, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (notificationAdapter.f57928b == 0 || notificationAdapter.f57928b == 11) {
            if (notificationAdapter.f57928b == 0) {
                while (i2 < notificationAdapter.mItems.size()) {
                    FollowNotice followNotice = ((BaseNotice) notificationAdapter.mItems.get(i2)).followNotice;
                    if (!(followNotice == null || followNotice.user == null || !TextUtils.equals(followNotice.user.getUid(), user.getUid()))) {
                        followNotice.user.setFollowStatus(i);
                        notificationAdapter.notifyItemChanged(i2);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < notificationAdapter.mItems.size()) {
                FriendNotice friendNotice = ((BaseNotice) notificationAdapter.mItems.get(i2)).friendNotice;
                if (friendNotice == null || friendNotice.user == null || !TextUtils.equals(friendNotice.user.getUid(), user.getUid())) {
                    i2++;
                } else {
                    friendNotice.user.setFollowStatus(i);
                    notificationAdapter.notifyItemChanged(i2);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0340  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r27) {
        /*
            r26 = this;
            r7 = r26
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r27
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62841(0xf579, float:8.8059E-41)
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r27
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            r3 = 0
            r4 = 62841(0xf579, float:8.8059E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.notification.NotificationDetailActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            super.onCreate(r27)
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.f3696f = r0
            java.lang.String r0 = r7.f3696f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "message"
            r7.f3696f = r0
        L_0x0058:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "from_where"
            r2 = -1
            int r0 = r0.getIntExtra(r1, r2)
            r7.u = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "notice_name"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.C = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "unRead_message_count"
            int r0 = r0.getIntExtra(r1, r10)
            r7.D = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "digg_notice_data"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            com.ss.android.ugc.aweme.notification.bean.DiggNotice r0 = (com.ss.android.ugc.aweme.notification.bean.DiggNotice) r0
            r7.F = r0
            int r0 = r7.u
            r8 = 18
            r11 = 17
            r12 = 15
            r13 = 5
            r14 = 11
            r15 = 4
            r6 = 16
            r5 = 19
            r4 = 6
            r3 = 12
            r2 = 13
            r1 = 3
            r10 = 2
            if (r0 == 0) goto L_0x00c7
            if (r0 == r9) goto L_0x00c7
            if (r0 == r10) goto L_0x00c7
            if (r0 == r1) goto L_0x00c7
            if (r0 == r15) goto L_0x00c7
            if (r0 == r4) goto L_0x00c7
            if (r0 == r14) goto L_0x00c7
            if (r0 == r13) goto L_0x00c7
            r1 = 9
            if (r0 == r1) goto L_0x00c7
            if (r0 == r2) goto L_0x00c7
            if (r0 == r3) goto L_0x00c7
            if (r0 == r12) goto L_0x00c7
            if (r0 == r6) goto L_0x00c7
            if (r0 == r11) goto L_0x00c7
            if (r0 == r8) goto L_0x00c7
            if (r0 != r5) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r0 = 0
            goto L_0x00c8
        L_0x00c7:
            r0 = 1
        L_0x00c8:
            if (r0 != 0) goto L_0x00d6
            r26.finish()
            java.lang.String r0 = "com.ss.android.ugc.aweme.notification.NotificationDetailActivity"
            java.lang.String r1 = "onCreate"
            r2 = 0
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            return
        L_0x00d6:
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.meituan.robust.ChangeQuickRedirect r16 = f3692b
            r17 = 0
            r18 = 62844(0xf57c, float:8.8063E-41)
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.Class r19 = java.lang.Void.TYPE
            r8 = 0
            r11 = 3
            r1 = r26
            r12 = 13
            r2 = r16
            r13 = 12
            r3 = r17
            r15 = 6
            r4 = r18
            r15 = 19
            r6 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0110
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            r3 = 0
            r4 = 62844(0xf57c, float:8.8063E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0268
        L_0x0110:
            r0 = 2131170110(0x7f07133e, float:1.795457E38)
            android.view.View r0 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r0
            r7.f3694c = r0
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            r3 = 0
            r4 = 62845(0xf57d, float:8.8065E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0143
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            r3 = 0
            r4 = 62845(0xf57d, float:8.8065E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x021d
        L_0x0143:
            int r0 = r7.u
            if (r0 != 0) goto L_0x015e
            com.bytedance.ies.dmt.ui.widget.c$a r0 = new com.bytedance.ies.dmt.ui.widget.c$a
            r0.<init>(r7)
            r1 = 2131560469(0x7f0d0815, float:1.8746311E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.b((int) r1)
            r1 = 2131560468(0x7f0d0814, float:1.874631E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.c(r1)
            com.bytedance.ies.dmt.ui.widget.c r0 = r0.f20493a
            goto L_0x01f5
        L_0x015e:
            int r0 = r7.u
            if (r0 != r9) goto L_0x0179
            com.bytedance.ies.dmt.ui.widget.c$a r0 = new com.bytedance.ies.dmt.ui.widget.c$a
            r0.<init>(r7)
            r1 = 2131560573(0x7f0d087d, float:1.8746522E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.b((int) r1)
            r1 = 2131560572(0x7f0d087c, float:1.874652E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.c(r1)
            com.bytedance.ies.dmt.ui.widget.c r0 = r0.f20493a
            goto L_0x01f5
        L_0x0179:
            int r0 = r7.u
            if (r0 != r10) goto L_0x0193
            com.bytedance.ies.dmt.ui.widget.c$a r0 = new com.bytedance.ies.dmt.ui.widget.c$a
            r0.<init>(r7)
            r1 = 2131560381(0x7f0d07bd, float:1.8746133E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.b((int) r1)
            r1 = 2131560380(0x7f0d07bc, float:1.874613E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.c(r1)
            com.bytedance.ies.dmt.ui.widget.c r0 = r0.f20493a
            goto L_0x01f5
        L_0x0193:
            int r0 = r7.u
            if (r0 != r11) goto L_0x01ad
            com.bytedance.ies.dmt.ui.widget.c$a r0 = new com.bytedance.ies.dmt.ui.widget.c$a
            r0.<init>(r7)
            r1 = 2131560418(0x7f0d07e2, float:1.8746208E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.b((int) r1)
            r1 = 2131560417(0x7f0d07e1, float:1.8746206E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.c(r1)
            com.bytedance.ies.dmt.ui.widget.c r0 = r0.f20493a
            goto L_0x01f5
        L_0x01ad:
            int r0 = r7.u
            if (r0 != r12) goto L_0x01c7
            com.bytedance.ies.dmt.ui.widget.c$a r0 = new com.bytedance.ies.dmt.ui.widget.c$a
            r0.<init>(r7)
            r1 = 2131560733(0x7f0d091d, float:1.8746847E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.b((int) r1)
            r1 = 2131560732(0x7f0d091c, float:1.8746845E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.c(r1)
            com.bytedance.ies.dmt.ui.widget.c r0 = r0.f20493a
            goto L_0x01f5
        L_0x01c7:
            int r0 = r7.u
            if (r0 != r13) goto L_0x01e1
            com.bytedance.ies.dmt.ui.widget.c$a r0 = new com.bytedance.ies.dmt.ui.widget.c$a
            r0.<init>(r7)
            r1 = 2131560559(0x7f0d086f, float:1.8746494E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.b((int) r1)
            r1 = 2131560558(0x7f0d086e, float:1.8746492E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.c(r1)
            com.bytedance.ies.dmt.ui.widget.c r0 = r0.f20493a
            goto L_0x01f5
        L_0x01e1:
            com.bytedance.ies.dmt.ui.widget.c$a r0 = new com.bytedance.ies.dmt.ui.widget.c$a
            r0.<init>(r7)
            r1 = 2131560998(0x7f0d0a26, float:1.8747384E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.b((int) r1)
            java.lang.String r1 = ""
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.b((java.lang.String) r1)
            com.bytedance.ies.dmt.ui.widget.c r0 = r0.f20493a
        L_0x01f5:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r7.f3694c
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r2 = com.bytedance.ies.dmt.ui.widget.DmtStatusView.a.a((android.content.Context) r26)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r2 = r2.a()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r20 = r2.a((com.bytedance.ies.dmt.ui.widget.c) r0)
            r21 = 2130840142(0x7f020a4e, float:1.7285314E38)
            r22 = 2131564396(0x7f0d176c, float:1.8754276E38)
            r23 = 2131564395(0x7f0d176b, float:1.8754274E38)
            r24 = 2131564402(0x7f0d1772, float:1.8754288E38)
            com.ss.android.ugc.aweme.notification.NotificationDetailActivity$2 r0 = new com.ss.android.ugc.aweme.notification.NotificationDetailActivity$2
            r0.<init>()
            r25 = r0
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = r20.a(r21, r22, r23, r24, r25)
            r1.setBuilder(r0)
        L_0x021d:
            r0 = 2131168687(0x7f070daf, float:1.7951683E38)
            android.view.View r0 = r7.findViewById(r0)
            android.support.v4.widget.SwipeRefreshLayout r0 = (android.support.v4.widget.SwipeRefreshLayout) r0
            r7.x = r0
            r0 = 2131168674(0x7f070da2, float:1.7951657E38)
            android.view.View r0 = r7.findViewById(r0)
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            r7.w = r0
            android.support.v7.widget.RecyclerView r0 = r7.w
            android.support.v7.widget.RecyclerView$ItemAnimator r0 = r0.getItemAnimator()
            android.support.v7.widget.SimpleItemAnimator r0 = (android.support.v7.widget.SimpleItemAnimator) r0
            r1 = 0
            r0.setSupportsChangeAnimations(r1)
            r0 = 2131170418(0x7f071472, float:1.7955194E38)
            android.view.View r0 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r0 = (com.bytedance.ies.dmt.ui.titlebar.TextTitleBar) r0
            r7.A = r0
            com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter r0 = new com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter
            int r1 = r7.u
            int r2 = r7.D
            java.lang.String r3 = r7.f3696f
            r0.<init>(r1, r7, r2, r3)
            r7.y = r0
            com.ss.android.ugc.aweme.notification.b.o r0 = new com.ss.android.ugc.aweme.notification.b.o
            r0.<init>()
            r7.z = r0
            android.support.v7.widget.RecyclerView r0 = r7.w
            com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager r1 = new com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager
            r1.<init>(r7)
            r0.setLayoutManager(r1)
        L_0x0268:
            r0 = 2131170096(0x7f071330, float:1.795454E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.f3695d = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r15) goto L_0x0281
            android.view.View r0 = r7.f3695d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r1 = com.bytedance.ies.uikit.statusbar.StatusBarUtils.getStatusBarHeight(r26)
            r0.height = r1
        L_0x0281:
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            r3 = 0
            r4 = 62843(0xf57b, float:8.8062E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02a9
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            r3 = 0
            r4 = 62843(0xf57b, float:8.8062E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x02a7:
            r8 = 0
            goto L_0x0319
        L_0x02a9:
            android.support.v4.widget.SwipeRefreshLayout r0 = r7.x
            r0.setOnRefreshListener(r7)
            android.support.v7.widget.RecyclerView r0 = r7.w
            com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener r1 = new com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener
            r1.<init>(r7)
            r0.addOnScrollListener(r1)
            com.ss.android.ugc.aweme.notification.b.o r0 = r7.z
            com.ss.android.ugc.aweme.notification.model.NoticeModel r1 = new com.ss.android.ugc.aweme.notification.model.NoticeModel
            r1.<init>()
            r0.a(r1)
            com.ss.android.ugc.aweme.notification.b.o r0 = r7.z
            r0.a(r7)
            com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter r0 = r7.y
            r0.setLoadMoreListener(r7)
            com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter r0 = r7.y
            r0.setShowFooter(r9)
            com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter r0 = r7.y
            r0.showLoadMoreEmpty()
            android.support.v7.widget.RecyclerView r0 = r7.w
            com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter r1 = r7.y
            r0.setAdapter(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r7.f3694c
            r0.d()
            int r0 = r7.u
            if (r0 == 0) goto L_0x02ea
            int r0 = r7.u
            if (r0 != r14) goto L_0x02ed
        L_0x02ea:
            com.ss.android.ugc.aweme.utils.bg.c(r26)
        L_0x02ed:
            int r0 = r7.u
            if (r0 == 0) goto L_0x02fd
            int r0 = r7.u
            if (r0 == r9) goto L_0x02fd
            int r0 = r7.u
            if (r0 == r13) goto L_0x02fd
            int r0 = r7.u
            if (r0 != r12) goto L_0x02a7
        L_0x02fd:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.story.api.i> r1 = com.ss.android.ugc.aweme.story.api.i.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.story.api.i r0 = (com.ss.android.ugc.aweme.story.api.i) r0
            r7.G = r0
            com.ss.android.ugc.aweme.story.api.i r0 = r7.G
            if (r0 == 0) goto L_0x02a7
            com.ss.android.ugc.aweme.story.api.i r0 = r7.G
            com.ss.android.ugc.aweme.arch.widgets.base.b r0 = r0.b()
            r8 = 0
            r0.a(r7, r7, r8)
        L_0x0319:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            r3 = 0
            r4 = 62842(0xf57a, float:8.806E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0340
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3692b
            r3 = 0
            r4 = 62842(0xf57a, float:8.806E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x04a5
        L_0x0340:
            int r0 = r7.u
            if (r0 != 0) goto L_0x0356
            r0 = 7
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560078(0x7f0d068e, float:1.8745518E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x0356:
            int r0 = r7.u
            if (r0 != r9) goto L_0x036b
            r7.v = r11
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560447(0x7f0d07ff, float:1.8746267E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x036b:
            int r0 = r7.u
            if (r0 != r10) goto L_0x0381
            r0 = 6
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560633(0x7f0d08b9, float:1.8746644E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x0381:
            int r0 = r7.u
            if (r0 != r11) goto L_0x0396
            r7.v = r10
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560416(0x7f0d07e0, float:1.8746204E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x0396:
            int r0 = r7.u
            r1 = 4
            if (r0 != r1) goto L_0x03ae
            r0 = 46
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560449(0x7f0d0801, float:1.874627E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x03ae:
            int r0 = r7.u
            r1 = 5
            if (r0 != r1) goto L_0x03c6
            r0 = 47
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560746(0x7f0d092a, float:1.8746873E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x03c6:
            int r0 = r7.u
            r1 = 6
            if (r0 != r1) goto L_0x03de
            r0 = 16
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560721(0x7f0d0911, float:1.8746822E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x03de:
            r0 = 16
            int r1 = r7.u
            r2 = 15
            if (r1 != r2) goto L_0x03f9
            r0 = 29
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560588(0x7f0d088c, float:1.8746553E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x03f9:
            int r1 = r7.u
            if (r1 != r0) goto L_0x0410
            r0 = 32
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560723(0x7f0d0913, float:1.8746826E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x0410:
            int r0 = r7.u
            if (r0 != r12) goto L_0x0426
            r0 = 24
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560731(0x7f0d091b, float:1.8746843E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x0426:
            int r0 = r7.u
            if (r0 != r13) goto L_0x043c
            r0 = 28
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560557(0x7f0d086d, float:1.874649E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x043c:
            int r0 = r7.u
            r1 = 17
            if (r0 != r1) goto L_0x0454
            r0 = 103(0x67, float:1.44E-43)
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560749(0x7f0d092d, float:1.874688E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x0454:
            int r0 = r7.u
            r1 = 18
            if (r0 != r1) goto L_0x046c
            r0 = 45
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560773(0x7f0d0945, float:1.8746928E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
            goto L_0x0481
        L_0x046c:
            int r0 = r7.u
            if (r0 != r15) goto L_0x0481
            r0 = 31
            r7.v = r0
            android.content.res.Resources r0 = r26.getResources()
            r1 = 2131560706(0x7f0d0902, float:1.8746792E38)
            java.lang.String r0 = r0.getString(r1)
            r7.B = r0
        L_0x0481:
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r0 = r7.A
            java.lang.String r1 = r7.B
            r0.setTitle((java.lang.CharSequence) r1)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r0 = r7.A
            android.widget.ImageView r0 = r0.getBackBtn()
            r1 = 2131558849(0x7f0d01c1, float:1.8743025E38)
            java.lang.String r1 = r7.getString(r1)
            r0.setContentDescription(r1)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r0 = r7.A
            com.ss.android.ugc.aweme.notification.NotificationDetailActivity$1 r1 = new com.ss.android.ugc.aweme.notification.NotificationDetailActivity$1
            r1.<init>()
            r0.setOnTitleBarClickListener(r1)
            r26.onRefresh()
        L_0x04a5:
            java.lang.String r0 = "com.ss.android.ugc.aweme.notification.NotificationDetailActivity"
            java.lang.String r1 = "onCreate"
            r2 = 0
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.NotificationDetailActivity.onCreate(android.os.Bundle):void");
    }

    public static Intent a(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, null, f3692b, true, 62836, new Class[]{Context.class, Integer.TYPE}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, null, f3692b, true, 62836, new Class[]{Context.class, Integer.TYPE}, Intent.class);
        }
        Intent intent = new Intent(context2, a(i));
        intent.putExtra("from_where", i);
        return intent;
    }

    public final void b(List<BaseNotice> list, boolean z2) {
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3692b, false, 62854, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f3692b, false, 62854, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list != null && !list.isEmpty()) {
            z3 = z2;
        }
        if (!z3) {
            this.y.showLoadMoreEmpty();
        } else {
            this.y.resetLoadMoreState();
        }
        this.y.setDataAfterLoadMore(list);
    }

    public final void a(List<BaseNotice> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3692b, false, 62851, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f3692b, false, 62851, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.y.setShowFooter(true);
        if (this.g) {
            this.y.a();
        }
        this.g = true;
        if (!z2) {
            this.y.showLoadMoreEmpty();
        } else {
            this.y.resetLoadMoreState();
        }
        this.x.setRefreshing(false);
        this.y.setData(list);
        this.f3694c.b();
        if (this.y.getData() != null) {
            if (this.y.getData().size() <= 7) {
                this.y.setShowFooter(false);
            } else {
                this.y.setShowFooter(true);
            }
        }
    }

    public static void a(Context context, int i, int i2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f3692b, true, 62838, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f3692b, true, 62838, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(context2, i, i2, null);
    }

    private static void a(Context context, int i, int i2, String str) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2), null}, null, f3692b, true, 62839, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2), null}, null, f3692b, true, 62839, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intent a2 = a(context, i);
        a2.putExtra("unRead_message_count", i2);
        if (!TextUtils.isEmpty(null)) {
            a2.putExtra("notice_name", null);
        }
        context2.startActivity(a2);
    }
}
