package com.ss.android.ugc.aweme.discover.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.comment.ui.VideoCommentDialogFragment2;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.discover.c.a;
import com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct;
import com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.shortvideo.f.f;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.b.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.Subscribe;

public class DiscoverDetailPageFragment extends DetailPageFragment implements a.C0023a {
    public static ChangeQuickRedirect g;
    public boolean h;
    com.ss.android.ugc.aweme.feed.g.a i = new com.ss.android.ugc.aweme.feed.g.a();
    public DiscoverCellStruct j;
    protected d k;
    protected b l;
    public long m;
    @BindView(2131493931)
    DiscoverExpandView mDiscoverExpandView;
    @BindView(2131498426)
    DiscoverShootView mDiscoverShootView;
    private int n;
    private int o;
    private i p;
    private bv q;
    private String r;
    private String s;
    private String t;

    public final User c() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37436, new Class[0], User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[0], this, g, false, 37436, new Class[0], User.class);
        }
        Aweme q2 = q();
        if (q2 == null) {
            return null;
        }
        return q2.getAuthor();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 37446, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null && this.k.isShowing()) {
            this.k.dismiss();
        }
        this.k = null;
    }

    public final DetailFragmentPanel h() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37417, new Class[0], DetailFragmentPanel.class)) {
            return (DetailFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, g, false, 37417, new Class[0], DetailFragmentPanel.class);
        }
        a aVar = new a();
        aVar.u = this;
        aVar.s = this;
        return aVar;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 37421, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (e() && this.mDiscoverExpandView.f42833d) {
            o.b().h();
        }
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37426, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 37426, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3013d == null || this.f3013d.be() == null) {
            return false;
        } else {
            int currentItem = ((a) this.f3013d).mViewPager.getCurrentItem();
            List<Aweme> list = this.f3013d.be().h;
            if (CollectionUtils.isEmpty(list) || currentItem != list.size() - 1) {
                return false;
            }
            return true;
        }
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37429, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 37429, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null && iAVService.needLoginBeforeRecord()) {
            e.a((Fragment) this, "challenge", "click_challenge_shoot", ad.a().a("login_title", getString(C0906R.string.c7i)).f75487b);
            return true;
        } else if (!((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().checkIsAlreadyPublished(getContext())) {
            return true;
        } else {
            return false;
        }
    }

    private Aweme q() {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37437, new Class[0], Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[0], this, g, false, 37437, new Class[0], Aweme.class);
        } else if (this.j == null) {
            return null;
        } else {
            List<? extends Aweme> list = this.j.awemeList;
            if (CollectionUtils.isEmpty(list)) {
                return null;
            }
            if (this.f3013d != null) {
                i2 = this.f3013d.ah();
            } else {
                i2 = 0;
            }
            if (i2 < list.size()) {
                i3 = i2;
            }
            return (Aweme) list.get(i3);
        }
    }

    public String getPlayListIdKey() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37442, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, g, false, 37442, new Class[0], String.class);
        } else if (!TextUtils.isEmpty(this.t)) {
            return this.t;
        } else {
            if (this.j == null) {
                str = "";
            } else {
                str = this.j.getMobIdKey();
            }
            this.t = str;
            return this.t;
        }
    }

    public String getPlayListType() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37441, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, g, false, 37441, new Class[0], String.class);
        } else if (!TextUtils.isEmpty(this.s)) {
            return this.s;
        } else {
            if (this.j == null) {
                str = "";
            } else {
                str = this.j.getPlayListType();
            }
            this.s = str;
            return this.s;
        }
    }

    public String getPlayListId() {
        String str;
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37440, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, g, false, 37440, new Class[0], String.class);
        } else if (!TextUtils.isEmpty(this.r)) {
            return this.r;
        } else {
            if (this.j == null) {
                return "";
            }
            Aweme q2 = q();
            int i2 = this.j.subtype;
            if (!(i2 == 0 || i2 == 2)) {
                if (i2 != 8) {
                    switch (i2) {
                        case 5:
                            if (q2 == null || q2.getMusic() == null) {
                                str3 = "";
                            } else {
                                str3 = q2.getMusic().getMid();
                            }
                            this.r = str3;
                            break;
                        case 6:
                            if (q2 == null) {
                                str4 = "";
                            } else {
                                str4 = q2.getAuthorUid();
                            }
                            this.r = str4;
                            break;
                        default:
                            if (this.j == null) {
                                str = "";
                                break;
                            }
                            break;
                    }
                } else {
                    if (q2 == null || q2.getMusic() == null) {
                        str2 = "";
                    } else {
                        str2 = q2.getMusic().getAuthorName();
                    }
                    this.r = str2;
                }
                return this.r;
            }
            str = this.j.cellId;
            this.r = str;
            return this.r;
        }
    }

    public final void l() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37443, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 37443, new Class[0], Void.TYPE);
        } else if (this.mDiscoverExpandView.f42833d) {
            this.mDiscoverExpandView.b();
        } else if (!this.f3014e) {
            k();
            Aweme o2 = o();
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.f3012c.getEventType()).a("playlist_type", getPlayListType()).a(getPlayListIdKey(), getPlayListId());
            if (o2 == null) {
                str = "";
            } else {
                str = o2.getAid();
            }
            r.a("quit_playlist", (Map) a2.a("group_id", str).f34114b);
            if (this.f3012c != null && this.f3012c.isFromAdsActivity()) {
                int aZ = AbTestManager.a().aZ();
                if (aZ == 1) {
                    getActivity().overridePendingTransition(C0906R.anim.d3, C0906R.anim.d3);
                } else if (aZ == 2) {
                    getActivity().overridePendingTransition(C0906R.anim.d3, C0906R.anim.d3);
                } else {
                    getActivity().overridePendingTransition(C0906R.anim.d4, C0906R.anim.d4);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.ss.android.ugc.aweme.discover.model.Challenge} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0184, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = g
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 37427(0x9233, float:5.2446E-41)
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = g
            r5 = 0
            r6 = 37427(0x9233, float:5.2446E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r1 = r14.j
            if (r1 == 0) goto L_0x04e1
            android.support.v4.app.FragmentActivity r1 = r14.getActivity()
            if (r1 != 0) goto L_0x0031
            goto L_0x04e1
        L_0x0031:
            android.support.v4.app.FragmentActivity r1 = r14.getActivity()
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r2 = r14.j
            int r2 = r2.subtype
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L_0x04d9;
                case 1: goto L_0x045e;
                case 2: goto L_0x0400;
                case 3: goto L_0x02de;
                case 4: goto L_0x02de;
                case 5: goto L_0x014b;
                case 6: goto L_0x0040;
                case 7: goto L_0x0400;
                case 8: goto L_0x014b;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x04da
        L_0x0040:
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
            boolean r2 = r2.isLogin()
            if (r2 == 0) goto L_0x0126
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r7 = g
            r8 = 0
            r9 = 37428(0x9234, float:5.2448E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r14
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x006f
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r7 = g
            r8 = 0
            r9 = 37428(0x9234, float:5.2448E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x04da
        L_0x006f:
            com.ss.android.ugc.aweme.profile.model.User r2 = r14.c()
            com.ss.android.ugc.aweme.profile.presenter.i r5 = r14.p
            if (r5 == 0) goto L_0x04da
            if (r2 == 0) goto L_0x04da
            int r5 = r2.getFollowStatus()
            if (r5 != r4) goto L_0x0080
            r0 = 1
        L_0x0080:
            r4 = r0 ^ 1
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r14.q()
            if (r5 != 0) goto L_0x008b
            java.lang.String r6 = ""
            goto L_0x008f
        L_0x008b:
            java.lang.String r6 = r5.getAid()
        L_0x008f:
            com.ss.android.ugc.aweme.profile.presenter.i r7 = r14.p
            com.ss.android.ugc.aweme.profile.presenter.i$a r8 = new com.ss.android.ugc.aweme.profile.presenter.i$a
            r8.<init>()
            java.lang.String r9 = r2.getUid()
            com.ss.android.ugc.aweme.profile.presenter.i$a r8 = r8.a((java.lang.String) r9)
            java.lang.String r9 = r2.getSecUid()
            com.ss.android.ugc.aweme.profile.presenter.i$a r8 = r8.b((java.lang.String) r9)
            com.ss.android.ugc.aweme.profile.presenter.i$a r4 = r8.a((int) r4)
            com.ss.android.ugc.aweme.feed.param.b r8 = r14.f3012c
            java.lang.String r8 = r8.getEventType()
            com.ss.android.ugc.aweme.profile.presenter.i$a r4 = r4.c((java.lang.String) r8)
            com.ss.android.ugc.aweme.profile.presenter.i$a r4 = r4.d(r6)
            com.ss.android.ugc.aweme.profile.presenter.h r4 = r4.a()
            r7.a((com.ss.android.ugc.aweme.profile.presenter.h) r4)
            if (r0 == 0) goto L_0x00c4
            java.lang.String r4 = "follow_cancel"
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r4 = "follow"
        L_0x00c6:
            com.ss.android.ugc.aweme.app.d.d r6 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r7 = "enter_from"
            com.ss.android.ugc.aweme.feed.param.b r8 = r14.f3012c
            java.lang.String r8 = r8.getEventType()
            com.ss.android.ugc.aweme.app.d.d r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "playlist_type"
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r8 = r14.j
            if (r8 != 0) goto L_0x00df
            java.lang.String r8 = ""
            goto L_0x00e5
        L_0x00df:
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r8 = r14.j
            java.lang.String r8 = r8.getPlayListType()
        L_0x00e5:
            com.ss.android.ugc.aweme.app.d.d r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = r14.getPlayListIdKey()
            java.lang.String r8 = r14.getPlayListId()
            com.ss.android.ugc.aweme.app.d.d r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "to_user_id"
            java.lang.String r2 = r2.getUid()
            com.ss.android.ugc.aweme.app.d.d r2 = r6.a((java.lang.String) r7, (java.lang.String) r2)
            java.lang.String r6 = "group_id"
            if (r5 != 0) goto L_0x0106
            java.lang.String r5 = ""
            goto L_0x010a
        L_0x0106:
            java.lang.String r5 = r5.getAid()
        L_0x010a:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r6, (java.lang.String) r5)
            if (r0 != 0) goto L_0x011f
            java.lang.String r0 = "enter_method"
            java.lang.String r5 = "bottom_button"
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r0, (java.lang.String) r5)
            java.lang.String r5 = "previous_page"
            java.lang.String r6 = "discovery"
            r0.a((java.lang.String) r5, (java.lang.String) r6)
        L_0x011f:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r4, (java.util.Map) r0)
            goto L_0x04da
        L_0x0126:
            android.content.res.Resources r0 = r1.getResources()
            r2 = 2131560039(0x7f0d0667, float:1.874544E38)
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = "playlist"
            java.lang.String r4 = "bottom_button"
            com.ss.android.ugc.aweme.utils.ad r5 = com.ss.android.ugc.aweme.utils.ad.a()
            java.lang.String r6 = "login_title"
            com.ss.android.ugc.aweme.utils.ad r0 = r5.a((java.lang.String) r6, (java.lang.String) r0)
            android.os.Bundle r0 = r0.f75487b
            com.ss.android.ugc.aweme.discover.ui.e r5 = new com.ss.android.ugc.aweme.discover.ui.e
            r5.<init>(r14)
            com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r1, (java.lang.String) r2, (java.lang.String) r4, (android.os.Bundle) r0, (com.ss.android.ugc.aweme.base.component.f) r5)
            goto L_0x04da
        L_0x014b:
            boolean r2 = r14.f()
            if (r2 == 0) goto L_0x0152
            return
        L_0x0152:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = g
            r8 = 0
            r9 = 37433(0x9239, float:5.2455E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r10[r0] = r2
            java.lang.Class<android.content.Intent> r11 = android.content.Intent.class
            r6 = r14
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x0187
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = g
            r8 = 0
            r9 = 37433(0x9239, float:5.2455E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r10[r0] = r2
            java.lang.Class<android.content.Intent> r11 = android.content.Intent.class
            r6 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            android.content.Intent r0 = (android.content.Intent) r0
        L_0x0184:
            r3 = r0
            goto L_0x04da
        L_0x0187:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.q()
            if (r2 == 0) goto L_0x02d8
            com.ss.android.ugc.aweme.music.model.Music r5 = r2.getMusic()
            if (r5 == 0) goto L_0x02d8
            com.ss.android.ugc.aweme.music.util.c r5 = com.ss.android.ugc.aweme.music.util.c.f56796b
            com.ss.android.ugc.aweme.music.model.Music r2 = r2.getMusic()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = r5.a((com.ss.android.ugc.aweme.music.model.Music) r2)
            android.support.v4.app.FragmentActivity r5 = r14.getActivity()
            boolean r5 = com.ss.android.ugc.aweme.music.util.d.a((com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r2, (android.content.Context) r5, (boolean) r4)
            if (r5 == 0) goto L_0x02d8
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = g
            r9 = 0
            r10 = 37444(0x9244, float:5.247E-41)
            java.lang.Class[] r11 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r5 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r11[r0] = r5
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r14
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x01d8
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = g
            r9 = 0
            r10 = 37444(0x9244, float:5.247E-41)
            java.lang.Class[] r11 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r2 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r11[r0] = r2
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x04da
        L_0x01d8:
            if (r2 == 0) goto L_0x04da
            com.ss.android.ugc.b.b r5 = r14.l
            if (r5 != 0) goto L_0x01e5
            com.ss.android.ugc.b.b r5 = new com.ss.android.ugc.b.b
            r5.<init>()
            r14.l = r5
        L_0x01e5:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = g
            r9 = 0
            r10 = 37447(0x9247, float:5.2474E-41)
            java.lang.Class[] r11 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r5 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r11[r0] = r5
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r14
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x0215
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = g
            r9 = 0
            r10 = 37447(0x9247, float:5.2474E-41)
            java.lang.Class[] r11 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r5 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r11[r0] = r5
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x023f
        L_0x0215:
            com.ss.android.ugc.aweme.music.ui.t r5 = new com.ss.android.ugc.aweme.music.ui.t
            java.lang.String r6 = com.ss.android.ugc.aweme.music.util.e.a((com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r2)
            com.ss.android.ugc.aweme.music.ui.f r7 = com.ss.android.ugc.aweme.music.ui.p.q
            r5.<init>(r6, r7)
            com.ss.android.ugc.aweme.discover.ui.DiscoverDetailPageFragment$7 r6 = new com.ss.android.ugc.aweme.discover.ui.DiscoverDetailPageFragment$7
            r6.<init>(r2)
            r5.a((com.ss.android.ugc.aweme.music.e) r6)
            com.ss.android.ugc.b.b r6 = r14.l
            r6.a((com.ss.android.ugc.b.a.a) r5)
            boolean r5 = com.ss.android.g.a.c()
            if (r5 == 0) goto L_0x023f
            com.ss.android.ugc.b.b r5 = r14.l
            com.ss.android.ugc.aweme.setting.AbTestManager r6 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r6 = r6.ap()
            r5.f77129a = r6
        L_0x023f:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r9 = g
            r10 = 0
            r11 = 37445(0x9245, float:5.2472E-41)
            java.lang.Class[] r12 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r5 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r12[r0] = r5
            java.lang.Class r13 = java.lang.Void.TYPE
            r8 = r14
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r5 == 0) goto L_0x0270
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = g
            r9 = 0
            r10 = 37445(0x9245, float:5.2472E-41)
            java.lang.Class[] r11 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r2 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r11[r0] = r2
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x04da
        L_0x0270:
            android.support.v4.app.FragmentActivity r4 = r14.getActivity()
            boolean r4 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r4)
            if (r4 != 0) goto L_0x028a
            android.support.v4.app.FragmentActivity r0 = r14.getActivity()
            r2 = 2131561430(0x7f0d0bd6, float:1.874826E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r2)
            r0.a()
            goto L_0x04da
        L_0x028a:
            android.support.v4.app.FragmentActivity r4 = r14.getActivity()
            r5 = 2131561358(0x7f0d0b8e, float:1.8748114E38)
            java.lang.String r5 = r14.getString(r5)
            com.ss.android.ugc.aweme.shortvideo.view.d r4 = com.ss.android.ugc.aweme.shortvideo.view.d.b(r4, r5)
            r14.k = r4
            com.ss.android.ugc.aweme.shortvideo.view.d r4 = r14.k
            r4.setIndeterminate(r0)
            com.ss.android.ugc.b.b.a r4 = new com.ss.android.ugc.b.b.a
            r4.<init>()
            java.util.HashMap r0 = com.ss.android.ugc.aweme.music.util.d.a((boolean) r0)
            r4.a(r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r0 = r2.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r5 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.ONLINE
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x02c2
            java.lang.String r0 = r2.getPath()
            r4.f77131a = r0
            r0 = 4
            r4.f77132b = r0
            goto L_0x02cb
        L_0x02c2:
            r0 = 3
            r4.f77132b = r0
            java.lang.String r0 = r2.getPath()
            r4.f77131a = r0
        L_0x02cb:
            long r5 = java.lang.System.currentTimeMillis()
            r14.m = r5
            com.ss.android.ugc.b.b r0 = r14.l
            r0.b(r4)
            goto L_0x04da
        L_0x02d8:
            android.content.Intent r0 = r14.a((android.app.Activity) r1)
            goto L_0x0184
        L_0x02de:
            boolean r2 = r14.f()
            if (r2 == 0) goto L_0x02e5
            return
        L_0x02e5:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = g
            r8 = 0
            r9 = 37434(0x923a, float:5.2456E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r10[r0] = r2
            java.lang.Class<android.content.Intent> r11 = android.content.Intent.class
            r6 = r14
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x031a
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = g
            r8 = 0
            r9 = 37434(0x923a, float:5.2456E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r10[r0] = r2
            java.lang.Class<android.content.Intent> r11 = android.content.Intent.class
            r6 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            android.content.Intent r0 = (android.content.Intent) r0
            r3 = r0
            goto L_0x03f3
        L_0x031a:
            android.content.Intent r2 = r14.a((android.app.Activity) r1)
            java.lang.String r4 = "shoot_way"
            java.lang.String r5 = "playlist_challenge"
            r2.putExtra(r4, r5)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = g
            r9 = 0
            r10 = 37435(0x923b, float:5.2458E-41)
            java.lang.Class[] r11 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.Challenge> r12 = com.ss.android.ugc.aweme.discover.model.Challenge.class
            r7 = r14
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r4 == 0) goto L_0x034e
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r7 = g
            r8 = 0
            r9 = 37435(0x923b, float:5.2458E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.Challenge> r11 = com.ss.android.ugc.aweme.discover.model.Challenge.class
            r6 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            r3 = r0
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = (com.ss.android.ugc.aweme.discover.model.Challenge) r3
            goto L_0x03cf
        L_0x034e:
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r0 = r14.j
            if (r0 == 0) goto L_0x03cf
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r0 = r14.j
            java.lang.String r0 = r0.cellId
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.q()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x03cf
            if (r4 == 0) goto L_0x03cf
            java.util.List r5 = r4.getChallengeList()
            boolean r5 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x036d
            goto L_0x03cf
        L_0x036d:
            java.util.List r5 = r4.getChallengeList()
            java.util.Iterator r5 = r5.iterator()
        L_0x0375:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x038f
            java.lang.Object r6 = r5.next()
            com.ss.android.ugc.aweme.discover.model.Challenge r6 = (com.ss.android.ugc.aweme.discover.model.Challenge) r6
            if (r6 == 0) goto L_0x0375
            java.lang.String r7 = r6.getCid()
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0375
            r3 = r6
            goto L_0x03cf
        L_0x038f:
            java.util.List r4 = r4.getTextExtra()
            boolean r5 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x03cf
            java.util.Iterator r4 = r4.iterator()
        L_0x039d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x03cf
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r5 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r5
            if (r5 == 0) goto L_0x039d
            java.lang.String r6 = r5.getCid()
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x039d
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = new com.ss.android.ugc.aweme.discover.model.Challenge
            r3.<init>()
            java.lang.String r0 = r5.getCid()
            r3.setCid(r0)
            int r0 = r5.getType()
            r3.setType(r0)
            java.lang.String r0 = r5.getHashTagName()
            r3.setChallengeName(r0)
        L_0x03cf:
            if (r3 == 0) goto L_0x03f2
            com.ss.android.ugc.aweme.shortvideo.o.a r0 = new com.ss.android.ugc.aweme.shortvideo.o.a
            r0.<init>()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.apply((com.ss.android.ugc.aweme.discover.model.Challenge) r3)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r4 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r3 = r3.getService(r4)
            com.ss.android.ugc.aweme.services.IAVService r3 = (com.ss.android.ugc.aweme.services.IAVService) r3
            com.ss.android.ugc.aweme.services.video.IAVPublishService r3 = r3.publishService()
            r3.addChallenge(r0)
            java.lang.String r3 = "challenge"
            r2.putExtra(r3, r0)
        L_0x03f2:
            r3 = r2
        L_0x03f3:
            java.lang.String r0 = "creation_id"
            java.lang.String r0 = r3.getStringExtra(r0)
            java.lang.String r2 = "playlist_challenge"
            r14.a(r0, r2)
            goto L_0x04da
        L_0x0400:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r14.o()
            java.lang.String r1 = "click_link"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.feed.param.b r4 = r14.f3012c
            java.lang.String r4 = r4.getEventType()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "playlist_type"
            java.lang.String r4 = r14.getPlayListType()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = r14.getPlayListIdKey()
            java.lang.String r4 = r14.getPlayListId()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "group_id"
            if (r0 != 0) goto L_0x0433
            java.lang.String r0 = ""
            goto L_0x0437
        L_0x0433:
            java.lang.String r0 = r0.getAid()
        L_0x0437:
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r2 = "link_type"
            com.ss.android.ugc.aweme.feed.param.b r3 = r14.f3012c
            java.lang.String r3 = r3.getEventType()
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "url"
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r3 = r14.j
            java.lang.String r3 = r3.refUrl
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r0 = r14.j
            java.lang.String r0 = r0.refUrl
            r14.b(r0)
            return
        L_0x045e:
            boolean r2 = r14.f()
            if (r2 == 0) goto L_0x0465
            return
        L_0x0465:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = g
            r8 = 0
            r9 = 37430(0x9236, float:5.245E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r10[r0] = r2
            java.lang.Class<android.content.Intent> r11 = android.content.Intent.class
            r6 = r14
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x0499
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = g
            r8 = 0
            r9 = 37430(0x9236, float:5.245E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r10[r0] = r2
            java.lang.Class<android.content.Intent> r11 = android.content.Intent.class
            r6 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            android.content.Intent r0 = (android.content.Intent) r0
            goto L_0x0184
        L_0x0499:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.q()
            if (r2 == 0) goto L_0x04d3
            com.ss.android.ugc.aweme.sticker.model.d r4 = r2.getStickerEntranceInfo()
            if (r4 == 0) goto L_0x04d3
            com.ss.android.ugc.aweme.sticker.model.d r2 = r2.getStickerEntranceInfo()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r2 = r2.id
            r4.add(r2)
            com.ss.android.ugc.aweme.share.bv r2 = r14.q
            if (r2 != 0) goto L_0x04cd
            com.ss.android.ugc.aweme.share.bv r2 = new com.ss.android.ugc.aweme.share.bv
            android.content.Context r5 = r14.getContext()
            java.lang.String r6 = "prop_page"
            r2.<init>(r5, r6)
            r14.q = r2
            com.ss.android.ugc.aweme.share.bv r2 = r14.q
            com.ss.android.ugc.aweme.discover.ui.DiscoverDetailPageFragment$6 r5 = new com.ss.android.ugc.aweme.discover.ui.DiscoverDetailPageFragment$6
            r5.<init>()
            r2.k = r5
        L_0x04cd:
            com.ss.android.ugc.aweme.share.bv r2 = r14.q
            r2.a((java.util.ArrayList<java.lang.String>) r4, (boolean) r0)
            goto L_0x04da
        L_0x04d3:
            android.content.Intent r0 = r14.a((android.app.Activity) r1)
            goto L_0x0184
        L_0x04d9:
            return
        L_0x04da:
            if (r3 != 0) goto L_0x04dd
            return
        L_0x04dd:
            r1.startActivity(r3)
            return
        L_0x04e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.DiscoverDetailPageFragment.b():void");
    }

    private Intent a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, g, false, 37439, new Class[]{Activity.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{activity2}, this, g, false, 37439, new Class[]{Activity.class}, Intent.class);
        }
        String uuid = UUID.randomUUID().toString();
        Intent intent = new Intent(activity2, ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
        intent.putExtra("creation_id", uuid);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        intent.putExtra("translation_type", 3);
        return intent;
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, g, false, 37432, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, g, false, 37432, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bundle_user_webview_title", "true");
        hashMap.put(PushConstants.TITLE, " ");
        h.a().f2591d.c("bundle_user_webview_title");
        h.a().a(str2, hashMap);
    }

    @Subscribe
    public void onUserFollowEvent(FollowStatus followStatus) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, g, false, 37438, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, g, false, 37438, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (this.j != null && this.j.subtype == 6) {
            String str = followStatus.userId;
            User c2 = c();
            if (!TextUtils.isEmpty(str) && c2 != null && str.equals(c2.getUid())) {
                DiscoverShootView discoverShootView = this.mDiscoverShootView;
                if (followStatus.followStatus == 0) {
                    z = false;
                }
                discoverShootView.a(c2, z);
            }
        }
    }

    public final void a(int i2) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 37420, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 37420, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.mDiscoverExpandView.getLayoutParams()).bottomMargin = i2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mVideoPlayerProgressbar.getLayoutParams();
        if (this.h) {
            i3 = this.o;
        } else {
            i3 = i2;
        }
        marginLayoutParams.bottomMargin = i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mAudioControlView.getLayoutParams();
        if (this.h) {
            i4 = this.o;
        } else {
            i4 = i2;
        }
        marginLayoutParams2.bottomMargin = i4;
        this.mDiscoverExpandView.requestLayout();
        this.mAudioControlView.requestLayout();
        this.n = i2;
        if (this.mDiscoverExpandView.getParent() instanceof View) {
            this.mDiscoverExpandView.setMaxHeight(((View) this.mDiscoverExpandView.getParent()).getMeasuredHeight() - i2);
        }
        if (i2 > 0) {
            ((ViewGroup.MarginLayoutParams) this.mDiscoverShootView.getLayoutParams()).bottomMargin = (int) UIUtils.dip2Px(getContext(), 10.0f);
            this.mDiscoverShootView.requestLayout();
        }
    }

    @Subscribe
    public void onVideoPlayerEvent(f fVar) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{fVar}, this, g, false, 37425, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, g, false, 37425, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (fVar.f67648c == 7) {
            if (PatchProxy.isSupport(new Object[0], this, g, false, 37424, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 37424, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = VideoCommentDialogFragment2.a(getContext());
            }
            if (!z && !p()) {
                if (this.mDiscoverExpandView == null || !this.mDiscoverExpandView.f42833d) {
                    if (e()) {
                        o.b().h();
                        this.f3013d.ab();
                        this.mDiscoverExpandView.a(true);
                        return;
                    }
                    bg.a(new com.ss.android.ugc.aweme.feed.f.a(1));
                } else if (e()) {
                    o.b().h();
                    this.f3013d.ab();
                }
            }
        }
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, g, false, 37415, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, g, false, 37415, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.a(bundle);
        this.f3012c.setEventType("playlist");
        this.f3012c.setVideoType(2);
    }

    /* JADX WARNING: type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r11v11, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r11v14, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r11v17, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0272  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = g
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 37418(0x922a, float:5.2434E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 37418(0x922a, float:5.2434E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.detail.operators.s$a r0 = r7.f3015f
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.detail.operators.g
            if (r0 == 0) goto L_0x0305
            com.ss.android.ugc.aweme.detail.operators.s$a r0 = r7.f3015f
            com.ss.android.ugc.aweme.detail.operators.g r0 = (com.ss.android.ugc.aweme.detail.operators.g) r0
            com.ss.android.ugc.aweme.discover.model.DiscoverListModel r0 = r0.d()
            if (r0 == 0) goto L_0x0305
            java.lang.Object r0 = r0.getData()
            r11 = r0
            com.ss.android.ugc.aweme.discover.model.DiscoverCellDetailResponse r11 = (com.ss.android.ugc.aweme.discover.model.DiscoverCellDetailResponse) r11
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 37419(0x922b, float:5.2435E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.DiscoverCellDetailResponse> r1 = com.ss.android.ugc.aweme.discover.model.DiscoverCellDetailResponse.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0082
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 37419(0x922b, float:5.2435E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.DiscoverCellDetailResponse> r1 = com.ss.android.ugc.aweme.discover.model.DiscoverCellDetailResponse.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0305
        L_0x0082:
            if (r11 == 0) goto L_0x0305
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r0 = r11.cellInfo
            if (r0 == 0) goto L_0x0305
            com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView r0 = r7.mDiscoverExpandView
            if (r0 != 0) goto L_0x008e
            goto L_0x0305
        L_0x008e:
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r0 = r11.cellInfo
            r7.j = r0
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r0 = r7.j
            int r0 = r0.subtype
            r1 = 8
            if (r0 == 0) goto L_0x00a9
            r7.h = r10
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            com.ss.android.ugc.aweme.discover.c.a r0 = (com.ss.android.ugc.aweme.discover.c.a) r0
            r0.G()
            com.ss.android.ugc.aweme.discover.ui.DiscoverShootView r0 = r7.mDiscoverShootView
            r0.setVisibility(r10)
            goto L_0x00c4
        L_0x00a9:
            r7.h = r9
            android.content.Context r0 = r18.getContext()
            r2 = 1111228416(0x423c0000, float:47.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r2)
            int r0 = (int) r0
            r7.o = r0
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            com.ss.android.ugc.aweme.discover.c.a r0 = (com.ss.android.ugc.aweme.discover.c.a) r0
            r0.H()
            com.ss.android.ugc.aweme.discover.ui.DiscoverShootView r0 = r7.mDiscoverShootView
            r0.setVisibility(r1)
        L_0x00c4:
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r0 = r7.j
            int r0 = r0.subtype
            r2 = 6
            if (r0 != r2) goto L_0x00dc
            com.ss.android.ugc.aweme.profile.presenter.i r0 = new com.ss.android.ugc.aweme.profile.presenter.i
            r0.<init>()
            r7.p = r0
            com.ss.android.ugc.aweme.profile.presenter.i r0 = r7.p
            com.ss.android.ugc.aweme.discover.ui.DiscoverDetailPageFragment$1 r2 = new com.ss.android.ugc.aweme.discover.ui.DiscoverDetailPageFragment$1
            r2.<init>()
            r0.a(r2)
        L_0x00dc:
            com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView r0 = r7.mDiscoverExpandView
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView r0 = r7.mDiscoverExpandView
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r2 = r7.j
            java.lang.String r2 = r2.title
            r0.setTitle(r2)
            com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView r0 = r7.mDiscoverExpandView
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r2 = r7.j
            java.lang.String r2 = r2.desc
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r3 = r7.j
            java.lang.String r3 = r3.buttonName
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r4 = r7.j
            java.lang.String r4 = r4.refUrl
            r5 = 3
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r10] = r2
            r11[r9] = r3
            r6 = 2
            r11[r6] = r4
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView.f42830a
            r14 = 0
            r15 = 37472(0x9260, float:5.251E-41)
            java.lang.Class[] r12 = new java.lang.Class[r5]
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r12[r10] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r12[r9] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r12[r6] = r16
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r12
            r12 = r0
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x0147
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r10] = r2
            r11[r9] = r3
            r11[r6] = r4
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView.f42830a
            r14 = 0
            r15 = 37472(0x9260, float:5.251E-41)
            java.lang.Class[] r1 = new java.lang.Class[r5]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r9] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r6] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c2
        L_0x0147:
            r0.setContent(r2)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r10] = r3
            r11[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView.f42830a
            r14 = 0
            r15 = 37480(0x9268, float:5.252E-41)
            java.lang.Class[] r2 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r2[r10] = r12
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r2[r9] = r12
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x018a
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r10] = r3
            r11[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView.f42830a
            r14 = 0
            r15 = 37480(0x9268, float:5.252E-41)
            java.lang.Class[] r1 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c2
        L_0x018a:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x01b2
            r2 = r4
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x019c
            goto L_0x01b2
        L_0x019c:
            android.view.View r1 = r0.f42832c
            if (r1 == 0) goto L_0x01a3
            r1.setVisibility(r10)
        L_0x01a3:
            android.widget.TextView r1 = r0.f42831b
            if (r1 == 0) goto L_0x01aa
            r1.setVisibility(r10)
        L_0x01aa:
            android.widget.TextView r1 = r0.f42831b
            if (r1 == 0) goto L_0x01c0
            r1.setText(r3)
            goto L_0x01c0
        L_0x01b2:
            android.view.View r2 = r0.f42832c
            if (r2 == 0) goto L_0x01b9
            r2.setVisibility(r1)
        L_0x01b9:
            android.widget.TextView r2 = r0.f42831b
            if (r2 == 0) goto L_0x01c0
            r2.setVisibility(r1)
        L_0x01c0:
            r0.h = r4
        L_0x01c2:
            com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView r0 = r7.mDiscoverExpandView
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r1 = r7.j
            int r1 = r1.subtype
            r2 = 4
            if (r1 != r2) goto L_0x01cd
            r1 = 1
            goto L_0x01ce
        L_0x01cd:
            r1 = 0
        L_0x01ce:
            r0.setIsRecommend(r1)
            com.ss.android.ugc.aweme.discover.ui.DiscoverShootView r0 = r7.mDiscoverShootView
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r1 = r7.j
            int r1 = r1.subtype
            com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct r2 = r7.j
            java.lang.String r2 = r2.buttonName
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r18.q()
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r11[r10] = r4
            r11[r9] = r2
            r11[r6] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.ui.DiscoverShootView.f42888a
            r14 = 0
            r15 = 37570(0x92c2, float:5.2647E-41)
            java.lang.Class[] r4 = new java.lang.Class[r5]
            java.lang.Class r12 = java.lang.Integer.TYPE
            r4[r10] = r12
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r4[r9] = r12
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r12 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r4[r6] = r12
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0234
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r10] = r1
            r11[r9] = r2
            r11[r6] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.ui.DiscoverShootView.f42888a
            r14 = 0
            r15 = 37570(0x92c2, float:5.2647E-41)
            java.lang.Class[] r1 = new java.lang.Class[r5]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r6] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0305
        L_0x0234:
            r4 = 2131562434(0x7f0d0fc2, float:1.8750297E38)
            r5 = 2130838879(0x7f02055f, float:1.7282753E38)
            r6 = 2130837927(0x7f0201a7, float:1.7280822E38)
            r11 = 0
            r12 = 2130837926(0x7f0201a6, float:1.728082E38)
            switch(r1) {
                case 0: goto L_0x0302;
                case 1: goto L_0x02e4;
                case 2: goto L_0x02d0;
                case 3: goto L_0x02b5;
                case 4: goto L_0x029a;
                case 5: goto L_0x027b;
                case 6: goto L_0x025b;
                case 7: goto L_0x0246;
                case 8: goto L_0x027b;
                default: goto L_0x0244;
            }
        L_0x0244:
            goto L_0x0305
        L_0x0246:
            android.widget.TextView r1 = r0.f42889b
            if (r1 == 0) goto L_0x024f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
        L_0x024f:
            android.widget.ImageView r1 = r0.f42890c
            if (r1 == 0) goto L_0x0256
            r1.setImageResource(r5)
        L_0x0256:
            r0.setBackgroundResource(r6)
            goto L_0x0305
        L_0x025b:
            if (r3 == 0) goto L_0x0261
            com.ss.android.ugc.aweme.profile.model.User r11 = r3.getAuthor()
        L_0x0261:
            if (r3 == 0) goto L_0x026e
            com.ss.android.ugc.aweme.profile.model.User r1 = r3.getAuthor()
            if (r1 == 0) goto L_0x026e
            int r1 = r1.getFollowStatus()
            goto L_0x026f
        L_0x026e:
            r1 = 0
        L_0x026f:
            if (r1 == 0) goto L_0x0272
            goto L_0x0273
        L_0x0272:
            r9 = 0
        L_0x0273:
            r0.a(r11, r9)
            r0.setBackgroundResource(r6)
            goto L_0x0305
        L_0x027b:
            android.widget.TextView r1 = r0.f42889b
            if (r1 == 0) goto L_0x0295
            android.widget.TextView r2 = r0.f42889b
            if (r2 == 0) goto L_0x0290
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x0290
            r3 = 2131562435(0x7f0d0fc3, float:1.8750299E38)
            java.lang.String r11 = r2.getString(r3)
        L_0x0290:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r1.setText(r11)
        L_0x0295:
            r0.setBackgroundResource(r12)
            goto L_0x0305
        L_0x029a:
            android.widget.TextView r1 = r0.f42889b
            if (r1 == 0) goto L_0x02b1
            android.widget.TextView r2 = r0.f42889b
            if (r2 == 0) goto L_0x02ac
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x02ac
            java.lang.String r11 = r2.getString(r4)
        L_0x02ac:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r1.setText(r11)
        L_0x02b1:
            r0.setBackgroundResource(r12)
            goto L_0x0305
        L_0x02b5:
            android.widget.TextView r1 = r0.f42889b
            if (r1 == 0) goto L_0x02cc
            android.widget.TextView r2 = r0.f42889b
            if (r2 == 0) goto L_0x02c7
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x02c7
            java.lang.String r11 = r2.getString(r4)
        L_0x02c7:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r1.setText(r11)
        L_0x02cc:
            r0.setBackgroundResource(r12)
            goto L_0x0305
        L_0x02d0:
            android.widget.TextView r1 = r0.f42889b
            if (r1 == 0) goto L_0x02d9
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
        L_0x02d9:
            android.widget.ImageView r1 = r0.f42890c
            if (r1 == 0) goto L_0x02e0
            r1.setImageResource(r5)
        L_0x02e0:
            r0.setBackgroundResource(r6)
            goto L_0x0305
        L_0x02e4:
            android.widget.TextView r1 = r0.f42889b
            if (r1 == 0) goto L_0x02fe
            android.widget.TextView r2 = r0.f42889b
            if (r2 == 0) goto L_0x02f9
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x02f9
            r3 = 2131562436(0x7f0d0fc4, float:1.87503E38)
            java.lang.String r11 = r2.getString(r3)
        L_0x02f9:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r1.setText(r11)
        L_0x02fe:
            r0.setBackgroundResource(r12)
            goto L_0x0305
        L_0x0302:
            r0.setBackgroundResource(r12)
        L_0x0305:
            com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView r0 = r7.mDiscoverExpandView
            if (r0 == 0) goto L_0x030e
            com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView r0 = r7.mDiscoverExpandView
            r0.setData(r8)
        L_0x030e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.DiscoverDetailPageFragment.a(java.util.List):void");
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, g, false, 37422, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, g, false, 37422, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.mVideoPlayerProgressbar.setProgressbarThreshold(1000);
        this.mDiscoverExpandView.setOnItemClickListener(new d(this));
        this.mDiscoverExpandView.setCurrentPositionProvider(new DiscoverExpandView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42802a;

            public final int a() {
                if (PatchProxy.isSupport(new Object[0], this, f42802a, false, 37452, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42802a, false, 37452, new Class[0], Integer.TYPE)).intValue();
                } else if (DiscoverDetailPageFragment.this.f3013d == null) {
                    return 0;
                } else {
                    return DiscoverDetailPageFragment.this.f3013d.ah();
                }
            }
        });
        this.mDiscoverExpandView.setOnExpandStatusChangeLisenter(new DiscoverExpandView.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42804a;

            public final void a(boolean z, boolean z2) {
                String str;
                String str2;
                String str3;
                String str4;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f42804a, false, 37453, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f42804a, false, 37453, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                } else if (DiscoverDetailPageFragment.this.f3013d != null && DiscoverDetailPageFragment.this.f3013d.af() != null) {
                    if (z) {
                        if (DiscoverDetailPageFragment.this.h) {
                            ((a) DiscoverDetailPageFragment.this.f3013d).D();
                        }
                        DiscoverDetailPageFragment.this.f3013d.af().a(true);
                    } else {
                        if (DiscoverDetailPageFragment.this.h) {
                            ((a) DiscoverDetailPageFragment.this.f3013d).F_();
                        }
                        DiscoverDetailPageFragment.this.f3013d.af().a(false);
                    }
                    DiscoverDetailPageFragment discoverDetailPageFragment = DiscoverDetailPageFragment.this;
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, discoverDetailPageFragment, DiscoverDetailPageFragment.g, false, 37423, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        DiscoverDetailPageFragment discoverDetailPageFragment2 = discoverDetailPageFragment;
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, discoverDetailPageFragment2, DiscoverDetailPageFragment.g, false, 37423, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else if (discoverDetailPageFragment.mDiscoverShootView.getVisibility() == 0) {
                        if (z) {
                            discoverDetailPageFragment.mDiscoverShootView.setClickable(false);
                            an.a(discoverDetailPageFragment.mDiscoverShootView, 1.0f, 0.0f, 200);
                        } else {
                            discoverDetailPageFragment.mDiscoverShootView.setClickable(true);
                            an.a(discoverDetailPageFragment.mDiscoverShootView, 0.0f, 1.0f, 200);
                        }
                    }
                    Aweme o = DiscoverDetailPageFragment.this.o();
                    com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                    if (z) {
                        str = "open";
                    } else {
                        str = "close";
                    }
                    com.ss.android.ugc.aweme.app.d.d a3 = a2.a("action_type", str).a("enter_from", DiscoverDetailPageFragment.this.f3012c.getEventType());
                    if (z2) {
                        str2 = "auto";
                    } else {
                        str2 = "click";
                    }
                    com.ss.android.ugc.aweme.app.d.d a4 = a3.a("enter_method", str2);
                    if (DiscoverDetailPageFragment.this.j == null) {
                        str3 = "";
                    } else {
                        str3 = DiscoverDetailPageFragment.this.j.getPlayListType();
                    }
                    com.ss.android.ugc.aweme.app.d.d a5 = a4.a("playlist_type", str3).a(DiscoverDetailPageFragment.this.getPlayListIdKey(), DiscoverDetailPageFragment.this.getPlayListId());
                    if (o == null) {
                        str4 = "";
                    } else {
                        str4 = o.getAid();
                    }
                    r.a("playlist_mask", (Map) a5.a("group_id", str4).f34114b);
                }
            }
        });
        this.mDiscoverExpandView.setOnButtonClickListener(new DiscoverExpandView.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42806a;

            public final void a() {
                String str;
                if (PatchProxy.isSupport(new Object[0], this, f42806a, false, 37454, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f42806a, false, 37454, new Class[0], Void.TYPE);
                } else if (DiscoverDetailPageFragment.this.getActivity() != null) {
                    Aweme o = DiscoverDetailPageFragment.this.o();
                    com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", DiscoverDetailPageFragment.this.f3012c.getEventType()).a("playlist_type", DiscoverDetailPageFragment.this.getPlayListType()).a(DiscoverDetailPageFragment.this.getPlayListIdKey(), DiscoverDetailPageFragment.this.getPlayListId());
                    if (o == null) {
                        str = "";
                    } else {
                        str = o.getAid();
                    }
                    r.a("quit_playlist", (Map) a2.a("group_id", str).f34114b);
                    DiscoverDetailPageFragment.this.getActivity().finish();
                }
            }

            public final void a(String str) {
                String str2;
                String str3;
                if (PatchProxy.isSupport(new Object[]{str}, this, f42806a, false, 37455, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f42806a, false, 37455, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                DiscoverDetailPageFragment.this.b(DiscoverDetailPageFragment.this.j.refUrl);
                Aweme o = DiscoverDetailPageFragment.this.o();
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", DiscoverDetailPageFragment.this.f3012c.getEventType());
                if (DiscoverDetailPageFragment.this.j == null) {
                    str2 = "";
                } else {
                    str2 = DiscoverDetailPageFragment.this.j.getPlayListType();
                }
                com.ss.android.ugc.aweme.app.d.d a3 = a2.a("playlist_type", str2).a(DiscoverDetailPageFragment.this.getPlayListIdKey(), DiscoverDetailPageFragment.this.getPlayListId());
                if (o == null) {
                    str3 = "";
                } else {
                    str3 = o.getAid();
                }
                r.a("click_link", (Map) a3.a("group_id", str3).a("link_type", DiscoverDetailPageFragment.this.f3012c.getEventType()).a(PushConstants.WEB_URL, str).f34114b);
            }
        });
        this.mDiscoverShootView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42808a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f42808a, false, 37456, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f42808a, false, 37456, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                DiscoverDetailPageFragment.this.b();
            }
        });
        List<Aweme> list = this.f3013d.be().h;
        if (this.mDiscoverExpandView != null) {
            this.mDiscoverExpandView.setData(list);
        }
        this.mBackView.setVisibility(8);
    }

    public final void a(String str, String str2) {
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, g, false, 37431, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, g, false, 37431, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Aweme o2 = o();
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("shoot_way", str2);
        if (this.j == null) {
            str3 = "";
        } else {
            str3 = this.j.getPlayListType();
        }
        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("playlist_type", str3).a(getPlayListIdKey(), getPlayListId());
        if (o2 == null) {
            str4 = "";
        } else {
            str4 = o2.getAid();
        }
        r.a("shoot", (Map) a3.a("group_id", str4).a("creation_id", str).f34114b);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, g, false, 37416, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, g, false, 37416, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.i.a(getContext());
        }
        return layoutInflater2.inflate(C0906R.layout.nj, viewGroup2, false);
    }
}
