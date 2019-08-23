package com.ss.android.ugc.aweme.following.ui;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ap.a;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.profile.model.NewUserCount;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.MusMyProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.MyProfileFragment;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel;
import com.ss.android.ugc.aweme.user.a.b;

@AddPageTrace
public class FollowingFollowerActivity extends AmeSlideSSActivity implements Observer<com.ss.android.ugc.aweme.ap.a<NewUserCount>> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f48014b;

    /* renamed from: c  reason: collision with root package name */
    public int f48015c;

    /* renamed from: d  reason: collision with root package name */
    private MyProfileViewModel f48016d;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f48017a = new int[SimpleUserFragment.b.values().length];

        static {
            try {
                f48017a[SimpleUserFragment.b.follower.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48018a;

        /* renamed from: b  reason: collision with root package name */
        private Context f48019b;

        /* renamed from: c  reason: collision with root package name */
        private Fragment f48020c;

        /* renamed from: d  reason: collision with root package name */
        private b f48021d;

        /* renamed from: e  reason: collision with root package name */
        private SimpleUserFragment.b f48022e;

        /* renamed from: f  reason: collision with root package name */
        private int f48023f;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f48018a, false, 44972, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48018a, false, 44972, new Class[0], Void.TYPE);
                return;
            }
            Intent intent = new Intent(this.f48019b, FollowingFollowerActivity.class);
            intent.putExtra("following_page_param", this.f48021d);
            intent.putExtra("page_type_const_for_simpleuser", this.f48022e);
            intent.putExtra("following_or_follower_count", this.f48023f);
            if ((this.f48020c instanceof MyProfileFragment) || (this.f48020c instanceof MusMyProfileFragment)) {
                this.f48020c.startActivityForResult(intent, 20001);
            } else {
                this.f48019b.startActivity(intent);
            }
        }

        public final a a(User user) {
            if (PatchProxy.isSupport(new Object[]{user}, this, f48018a, false, 44971, new Class[]{User.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{user}, this, f48018a, false, 44971, new Class[]{User.class}, a.class);
            }
            b.f75295a = user;
            return this;
        }

        public a(Context context, Fragment fragment, String str, boolean z, SimpleUserFragment.b bVar, int i) {
            this.f48019b = context;
            this.f48021d = new b(str, z, bVar);
            this.f48022e = bVar;
            this.f48023f = i;
            this.f48020c = fragment;
        }
    }

    public final void c() {
        this.f48015c = 0;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f48014b, false, 44969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48014b, false, 44969, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48014b, false, 44970, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48014b, false, 44970, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f48014b, false, 44967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48014b, false, 44967, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("recommend_count", this.f48015c);
        setResult(-1, intent);
        super.finish();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f48014b, false, 44968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48014b, false, 44968, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f48014b, false, 44966, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48014b, false, 44966, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.b()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.w1).statusBarDarkFont(true).init();
        } else {
            StatusBarUtils.setTransparent(this);
        }
    }

    public /* bridge */ /* synthetic */ void onChanged(@Nullable Object obj) {
        com.ss.android.ugc.aweme.ap.a aVar = (com.ss.android.ugc.aweme.ap.a) obj;
        if (!(aVar == null || aVar.f33640c == null || aVar.f33639b != a.C0431a.SUCCESS)) {
            int i = ((NewUserCount) aVar.f33640c).count;
            if (i > 0) {
                this.f48015c = i;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.ss.android.ugc.aweme.following.ui.FollowerListFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.ss.android.ugc.aweme.following.ui.FollowerListFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.ss.android.ugc.aweme.following.ui.FollowerListFragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f48014b
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 44964(0xafa4, float:6.3008E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f48014b
            r3 = 0
            r4 = 44964(0xafa4, float:6.3008E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r18)
            r0 = 2131689554(0x7f0f0052, float:1.9008127E38)
            r7.setContentView((int) r0)
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r17)
            java.lang.Class<com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel> r1 = com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel.class
            android.arch.lifecycle.ViewModel r0 = r0.get(r1)
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel r0 = (com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel) r0
            r7.f48016d = r0
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel r0 = r7.f48016d
            android.arch.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.ap.a<com.ss.android.ugc.aweme.profile.model.NewUserCount>> r0 = r0.f63180b
            r0.observe(r7, r7)
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel r0 = r7.f48016d
            r0.a()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f48014b
            r3 = 0
            r4 = 44965(0xafa5, float:6.301E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0087
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f48014b
            r3 = 0
            r4 = 44965(0xafa5, float:6.301E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x014a
        L_0x0087:
            android.support.v4.app.FragmentManager r0 = r17.getSupportFragmentManager()
            java.lang.String r1 = "FRAGMENT_FOLLOWING_LIST"
            android.support.v4.app.Fragment r1 = r0.findFragmentByTag(r1)
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r3 = "page_type_const_for_simpleuser"
            java.io.Serializable r2 = r2.getSerializableExtra(r3)
            com.ss.android.ugc.aweme.following.ui.SimpleUserFragment$b r2 = (com.ss.android.ugc.aweme.following.ui.SimpleUserFragment.b) r2
            if (r2 != 0) goto L_0x00a1
            com.ss.android.ugc.aweme.following.ui.SimpleUserFragment$b r2 = com.ss.android.ugc.aweme.following.ui.SimpleUserFragment.b.following
        L_0x00a1:
            if (r1 != 0) goto L_0x013a
            int[] r1 = com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity.AnonymousClass1.f48017a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r8) goto L_0x00f4
            android.content.Intent r1 = r17.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r1
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.following.ui.FollowingListFragment.f48024a
            r13 = 1
            r14 = 44976(0xafb0, float:6.3025E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r2[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.following.ui.SimpleUserFragment> r16 = com.ss.android.ugc.aweme.following.ui.SimpleUserFragment.class
            r15 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x00ea
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r1
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.following.ui.FollowingListFragment.f48024a
            r13 = 1
            r14 = 44976(0xafb0, float:6.3025E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.following.ui.SimpleUserFragment> r16 = com.ss.android.ugc.aweme.following.ui.SimpleUserFragment.class
            r15 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.following.ui.SimpleUserFragment r1 = (com.ss.android.ugc.aweme.following.ui.SimpleUserFragment) r1
            goto L_0x013a
        L_0x00ea:
            com.ss.android.ugc.aweme.following.ui.FollowingListFragment r2 = new com.ss.android.ugc.aweme.following.ui.FollowingListFragment
            r2.<init>()
            r2.setArguments(r1)
        L_0x00f2:
            r1 = r2
            goto L_0x013a
        L_0x00f4:
            android.content.Intent r1 = r17.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r1
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.following.ui.FollowerListFragment.f47992a
            r13 = 1
            r14 = 44922(0xaf7a, float:6.2949E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r2[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.following.ui.SimpleUserFragment> r16 = com.ss.android.ugc.aweme.following.ui.SimpleUserFragment.class
            r15 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x0131
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r1
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.following.ui.FollowerListFragment.f47992a
            r13 = 1
            r14 = 44922(0xaf7a, float:6.2949E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.following.ui.SimpleUserFragment> r16 = com.ss.android.ugc.aweme.following.ui.SimpleUserFragment.class
            r15 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.following.ui.SimpleUserFragment r1 = (com.ss.android.ugc.aweme.following.ui.SimpleUserFragment) r1
            goto L_0x013a
        L_0x0131:
            com.ss.android.ugc.aweme.following.ui.FollowerListFragment r2 = new com.ss.android.ugc.aweme.following.ui.FollowerListFragment
            r2.<init>()
            r2.setArguments(r1)
            goto L_0x00f2
        L_0x013a:
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
            r2 = 2131166894(0x7f0706ae, float:1.7948046E38)
            java.lang.String r3 = "FRAGMENT_FOLLOWING_LIST"
            android.support.v4.app.FragmentTransaction r0 = r0.replace(r2, r1, r3)
            r0.commitAllowingStateLoss()
        L_0x014a:
            java.lang.String r0 = "com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity.onCreate(android.os.Bundle):void");
    }
}
