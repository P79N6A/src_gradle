package com.bytedance.android.live.core.setting;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.utils.SlideFinishUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LiveSettingGroupFragment extends BaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8133a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f8134b = {"直播AB", "直播配置", "feed配置"};

    /* renamed from: c  reason: collision with root package name */
    public String[][] f8135c = {new String[]{"com.bytedance.android.livesdk.config.LiveSettingKeys"}, new String[]{"com.bytedance.android.livesdk.config.LiveConfigSettingKeys", "com.bytedance.android.live.core.setting.CoreSettingKeys"}, new String[]{"com.bytedance.android.livesdk.feed.setting.LiveFeedSettings"}};
    private TabLayout h;
    private ViewPager i;

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f8133a, false, 895, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f8133a, false, 895, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f8133a, false, 896, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8133a, false, 896, new Class[0], Void.TYPE);
            return;
        }
        this.h = (TabLayout) getView().findViewById(C0906R.id.cyz);
        this.i = (ViewPager) getView().findViewById(C0906R.id.duu);
        this.i.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8136a;

            public int getCount() {
                return LiveSettingGroupFragment.this.f8134b.length;
            }

            public CharSequence getPageTitle(int i) {
                return LiveSettingGroupFragment.this.f8134b[i];
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.support.v4.app.Fragment getItem(int r17) {
                /*
                    r16 = this;
                    r0 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
                    r8 = 0
                    r1[r8] = r2
                    com.meituan.robust.ChangeQuickRedirect r3 = f8136a
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r6[r8] = r2
                    java.lang.Class<android.support.v4.app.Fragment> r7 = android.support.v4.app.Fragment.class
                    r4 = 0
                    r5 = 897(0x381, float:1.257E-42)
                    r2 = r16
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x003d
                    java.lang.Object[] r9 = new java.lang.Object[r0]
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
                    r9[r8] = r1
                    com.meituan.robust.ChangeQuickRedirect r11 = f8136a
                    r12 = 0
                    r13 = 897(0x381, float:1.257E-42)
                    java.lang.Class[] r14 = new java.lang.Class[r0]
                    java.lang.Class r0 = java.lang.Integer.TYPE
                    r14[r8] = r0
                    java.lang.Class<android.support.v4.app.Fragment> r15 = android.support.v4.app.Fragment.class
                    r10 = r16
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                    android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
                    return r0
                L_0x003d:
                    r1 = r16
                    com.bytedance.android.live.core.setting.LiveSettingGroupFragment r2 = com.bytedance.android.live.core.setting.LiveSettingGroupFragment.this
                    java.lang.String[][] r2 = r2.f8135c
                    r2 = r2[r17]
                    java.lang.Object[] r9 = new java.lang.Object[r0]
                    r9[r8] = r2
                    r10 = 0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.bytedance.android.live.core.setting.SettingFragment.f8138a
                    r12 = 1
                    r13 = 917(0x395, float:1.285E-42)
                    java.lang.Class[] r14 = new java.lang.Class[r0]
                    java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
                    r14[r8] = r3
                    java.lang.Class<com.bytedance.android.live.core.setting.SettingFragment> r15 = com.bytedance.android.live.core.setting.SettingFragment.class
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                    if (r3 == 0) goto L_0x0076
                    java.lang.Object[] r9 = new java.lang.Object[r0]
                    r9[r8] = r2
                    r10 = 0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.bytedance.android.live.core.setting.SettingFragment.f8138a
                    r12 = 1
                    r13 = 917(0x395, float:1.285E-42)
                    java.lang.Class[] r14 = new java.lang.Class[r0]
                    java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
                    r14[r8] = r0
                    java.lang.Class<com.bytedance.android.live.core.setting.SettingFragment> r15 = com.bytedance.android.live.core.setting.SettingFragment.class
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                    com.bytedance.android.live.core.setting.SettingFragment r0 = (com.bytedance.android.live.core.setting.SettingFragment) r0
                    return r0
                L_0x0076:
                    com.bytedance.android.live.core.setting.SettingFragment r0 = new com.bytedance.android.live.core.setting.SettingFragment
                    r0.<init>()
                    r0.f8139b = r2
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.setting.LiveSettingGroupFragment.AnonymousClass1.getItem(int):android.support.v4.app.Fragment");
            }
        });
        this.i.addOnPageChangeListener(new SlideFinishUtil.SlideFinishPageChangeListener(this.i));
        this.h.setupWithViewPager(this.i);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f8133a, false, 894, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.ahs, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f8133a, false, 894, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
