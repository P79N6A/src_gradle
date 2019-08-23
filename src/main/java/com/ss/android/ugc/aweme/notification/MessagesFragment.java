package com.ss.android.ugc.aweme.notification;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.a.b;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.experiencekit.c.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.f;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.c.a;
import com.ss.android.ugc.aweme.main.bl;
import com.ss.android.ugc.aweme.notification.adapter.MessagePagerAdapter;
import com.ss.android.ugc.aweme.notification.widget.PagerIndicator;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import java.util.HashMap;
import java.util.Map;

public class MessagesFragment extends AmeBaseFragment implements PagerIndicator.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57798a;

    /* renamed from: b  reason: collision with root package name */
    public MessagePagerAdapter f57799b;

    /* renamed from: c  reason: collision with root package name */
    b f57800c;

    /* renamed from: d  reason: collision with root package name */
    private View f57801d;

    /* renamed from: e  reason: collision with root package name */
    private int f57802e = 1;

    /* renamed from: f  reason: collision with root package name */
    private AnalysisStayTimeFragmentComponent f57803f;
    private boolean g = true;
    @BindView(2131493030)
    ImageView mAddFriendIv;
    @BindView(2131497328)
    View mStatusBarView;
    @BindView(2131497525)
    TextView mTvNoticeAdd;
    @BindView(2131498539)
    RtlViewPager mViewPager;
    @BindView(2131492867)
    PagerIndicator pagerIndicator;

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f57798a, false, 62786, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("message");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f57798a, false, 62786, new Class[0], Analysis.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f57798a, false, 62789, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57798a, false, 62789, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f57800c != null) {
            this.f57800c.b();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f57798a, false, 62788, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57798a, false, 62788, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f57800c != null) {
            this.f57800c.dismiss();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f57798a, false, 62787, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57798a, false, 62787, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.g) {
            this.g = false;
            bl.a(d.END, "tag", getTag());
        }
    }

    @OnClick({2131493030})
    public void addFriendViewClick() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f57798a, false, 62779, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57798a, false, 62779, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        if (this.f57802e == 1) {
            str = "message_tab";
        } else {
            str = "contact_tab";
        }
        r.a("find_friends", (Map) a2.a("enter_from", str).f34114b);
        if (getContext() != null) {
            Context context = getContext();
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            Context context2 = getContext();
            if (this.f57802e == 1) {
                str2 = "message_tab";
            } else {
                str2 = "contact_tab";
            }
            context.startActivity(iBridgeService.getAddFriendsActivityIntent(context2, -1, 4, "", str2));
        }
    }

    @OnClick({2131497525})
    public void noticeViewClick() {
        if (PatchProxy.isSupport(new Object[0], this, f57798a, false, 62778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57798a, false, 62778, new Class[0], Void.TYPE);
            return;
        }
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a(false);
        if (a2 != null) {
            a2.enterChooseContact(getActivity(), null, null);
            if (!AbTestManager.a().cb()) {
                if (PatchProxy.isSupport(new Object[0], null, f.f50065a, true, 50093, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f.f50065a, true, 50093, new Class[0], Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "message");
                    hashMap.put("enter_method", "click_contact_button");
                    r.a("enter_contact_list", (Map) hashMap);
                }
                if (PatchProxy.isSupport(new Object[0], null, f.f50065a, true, 50090, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f.f50065a, true, 50090, new Class[0], Void.TYPE);
                    return;
                }
                r.onEvent(MobClick.obtain().setEventName("create_chat").setLabelName("message"));
            } else if (PatchProxy.isSupport(new Object[0], null, f.f50065a, true, 50105, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f.f50065a, true, 50105, new Class[0], Void.TYPE);
            } else {
                r.a("create_chat_click", (Map) null);
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57798a, false, 62785, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57798a, false, 62785, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 0) {
            a aVar = (a) this.f57799b.a(1);
            if (aVar != null && this.f57802e == 0) {
                aVar.c();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(@android.support.annotation.Nullable android.os.Bundle r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f57798a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62776(0xf538, float:8.7968E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f57798a
            r3 = 0
            r4 = 62776(0xf538, float:8.7968E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            super.onActivityCreated(r18)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f57798a
            r3 = 0
            r4 = 62782(0xf53e, float:8.7976E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0060
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f57798a
            r3 = 0
            r4 = 62782(0xf53e, float:8.7976E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0196
        L_0x0060:
            boolean r0 = com.ss.android.ugc.aweme.im.b.b()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.b.f50051a
            r13 = 1
            r14 = 50028(0xc36c, float:7.0104E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r15 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x0093
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.b.f50051a
            r13 = 1
            r14 = 50028(0xc36c, float:7.0104E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r15 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x009f
        L_0x0093:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            boolean r0 = r0.isNotificationTabNewStyle()
        L_0x009f:
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.b.a((boolean) r9)
            if (r0 == 0) goto L_0x00a9
            r0 = 1
            goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            com.ss.android.ugc.aweme.notification.adapter.MessagePagerAdapter r1 = new com.ss.android.ugc.aweme.notification.adapter.MessagePagerAdapter
            android.support.v4.app.FragmentManager r2 = r17.getChildFragmentManager()
            r1.<init>(r2, r0)
            r7.f57799b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 2131560430(0x7f0d07ee, float:1.8746232E38)
            if (r0 == 0) goto L_0x00df
            android.content.Context r0 = r17.getContext()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r2)
            r1.add(r0)
            com.ss.android.ugc.aweme.notification.widget.PagerIndicator r0 = r7.pagerIndicator
            r0.setSelectCallBack(r7)
            boolean r0 = com.ss.android.g.a.b()
            if (r0 != 0) goto L_0x011c
            android.widget.ImageView r0 = r7.mAddFriendIv
            r0.setVisibility(r9)
            goto L_0x011c
        L_0x00df:
            android.widget.ImageView r0 = r7.mAddFriendIv
            r3 = 8
            r0.setVisibility(r3)
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x0112
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.cb()
            if (r0 == 0) goto L_0x0112
            android.widget.TextView r0 = r7.mTvNoticeAdd
            r2 = 2131560496(0x7f0d0830, float:1.8746366E38)
            r0.setText(r2)
            android.widget.TextView r0 = r7.mTvNoticeAdd
            r2 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r8, r2)
            android.widget.TextView r0 = r7.mTvNoticeAdd
            com.ss.android.ugc.aweme.notification.MessagesFragment$1 r2 = new com.ss.android.ugc.aweme.notification.MessagesFragment$1
            r2.<init>()
            r3 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r2, r3)
            goto L_0x0117
        L_0x0112:
            android.widget.TextView r0 = r7.mTvNoticeAdd
            r0.setText(r2)
        L_0x0117:
            android.widget.TextView r0 = r7.mTvNoticeAdd
            r0.setVisibility(r9)
        L_0x011c:
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131561517(0x7f0d0c2d, float:1.8748437E38)
            java.lang.String r0 = r0.getString(r2)
            r1.add(r0)
            com.ss.android.ugc.aweme.views.RtlViewPager r0 = r7.mViewPager
            com.ss.android.ugc.aweme.notification.adapter.MessagePagerAdapter r2 = r7.f57799b
            r0.setAdapter(r2)
            com.ss.android.ugc.aweme.notification.widget.PagerIndicator r0 = r7.pagerIndicator
            r0.setTabItems(r1)
            com.ss.android.ugc.aweme.notification.widget.PagerIndicator r0 = r7.pagerIndicator
            com.ss.android.ugc.aweme.views.RtlViewPager r1 = r7.mViewPager
            com.ss.android.ugc.aweme.notification.adapter.MessagePagerAdapter r2 = r7.f57799b
            int r2 = r2.getCount()
            int r2 = r2 - r8
            r3 = 2
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r9] = r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r10[r8] = r4
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.notification.widget.PagerIndicator.f58136a
            r13 = 0
            r14 = 63320(0xf758, float:8.873E-41)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.support.v4.view.ViewPager> r5 = android.support.v4.view.ViewPager.class
            r4[r9] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r8] = r5
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            r15 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x018c
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r10[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.notification.widget.PagerIndicator.f58136a
            r13 = 0
            r14 = 63320(0xf758, float:8.873E-41)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<android.support.v4.view.ViewPager> r2 = android.support.v4.view.ViewPager.class
            r1[r9] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r8] = r2
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            r15 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0196
        L_0x018c:
            r0.g = r1
            com.ss.android.ugc.aweme.notification.widget.PagerIndicator$IndicatorListener r0 = r0.i
            r1.addOnPageChangeListener(r0)
            r1.setCurrentItem(r2)
        L_0x0196:
            com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent r0 = new com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent
            r0.<init>(r7, r8)
            r7.f57803f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MessagesFragment.onActivityCreated(android.os.Bundle):void");
    }

    public void onHiddenChanged(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57798a, false, 62777, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57798a, false, 62777, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        if (z2) {
            if (PatchProxy.isSupport(new Object[0], this, f57798a, false, 62781, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57798a, false, 62781, new Class[0], Void.TYPE);
            } else if (!(this.f57799b == null || this.f57799b.getCount() == 0 || this.pagerIndicator == null)) {
                Fragment a2 = this.f57799b.a(0);
                if (a2 instanceof NewsFragment) {
                    NewsFragment newsFragment = (NewsFragment) a2;
                    if (PatchProxy.isSupport(new Object[0], newsFragment, NewsFragment.f57816a, false, 62802, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], newsFragment, NewsFragment.f57816a, false, 62802, new Class[0], Void.TYPE);
                    } else if (newsFragment.f57820e != null) {
                        newsFragment.f57820e.onPause();
                    }
                }
                if (this.f57800c != null) {
                    this.f57800c.dismiss();
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f57798a, false, 62780, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57798a, false, 62780, new Class[0], Void.TYPE);
            } else if (!(this.f57799b == null || this.f57799b.getCount() == 0 || this.pagerIndicator == null)) {
                this.pagerIndicator.a(this.f57799b.getCount());
                Fragment a3 = this.f57799b.a(0);
                if (a3 instanceof NewsFragment) {
                    NewsFragment newsFragment2 = (NewsFragment) a3;
                    if (PatchProxy.isSupport(new Object[0], newsFragment2, NewsFragment.f57816a, false, 62801, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], newsFragment2, NewsFragment.f57816a, false, 62801, new Class[0], Void.TYPE);
                    } else {
                        newsFragment2.onResume();
                        if (newsFragment2.f57820e != null) {
                            newsFragment2.f57820e.onResume();
                        }
                        if (!com.ss.android.g.a.a() && newsFragment2.f57819d != null) {
                            newsFragment2.f57819d.a();
                        }
                        if (newsFragment2.f57818c != null) {
                            newsFragment2.f57818c.a();
                        }
                    }
                }
            }
        }
        if (this.f57803f != null) {
            this.f57803f.a(z2);
        }
        if (!z2) {
            bl.a(d.END, "tag", getTag());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f57798a, false, 62775, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f57798a, false, 62775, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(getActivity());
        }
    }

    public final void a(int i, boolean z) {
        String str;
        String str2;
        com.ss.android.ugc.aweme.app.d.d dVar;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f57798a, false, 62783, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f57798a, false, 62783, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a aVar = (a) this.f57799b.a(1);
        this.f57802e = i;
        if (aVar != null) {
            if (i == 0) {
                str3 = "enter_contact_list";
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                if (z) {
                    str4 = "slide_right";
                } else {
                    str4 = "click_contact_tab";
                }
                dVar = a2.a("enter_method", str4);
                str2 = "enter_from";
                str = "message";
            } else {
                aVar.d();
                str3 = "enter_message_tab";
                dVar = com.ss.android.ugc.aweme.app.d.d.a();
                str2 = "enter_method";
                if (z) {
                    str = "slide_right";
                } else {
                    str = "click_message_tab";
                }
            }
            r.a(str3, (Map) dVar.a(str2, str).f34114b);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f57798a, false, 62774, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f57798a, false, 62774, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.f57801d = layoutInflater.inflate(C0906R.layout.op, viewGroup2, false);
        return this.f57801d;
    }
}
