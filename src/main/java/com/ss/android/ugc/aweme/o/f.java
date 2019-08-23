package com.ss.android.ugc.aweme.o;

import android.app.Activity;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.google.common.collect.az;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.challenge.ChallengeType;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi;
import com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity;
import com.ss.android.ugc.aweme.main.HomeFragment;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.base.HomeViewPager;
import com.ss.android.ugc.aweme.poi.IPOIService;
import com.ss.android.ugc.aweme.poi.search.POISearchDialog;
import com.ss.android.ugc.aweme.poi.ui.publish.PoiContext;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.port.in.ag;
import com.ss.android.ugc.aweme.port.in.ah;
import com.ss.android.ugc.aweme.port.in.al;
import com.ss.android.ugc.aweme.port.in.am;
import com.ss.android.ugc.aweme.port.in.an;
import com.ss.android.ugc.aweme.port.in.m;
import com.ss.android.ugc.aweme.port.in.p;
import com.ss.android.ugc.aweme.port.in.q;
import com.ss.android.ugc.aweme.port.in.s;
import com.ss.android.ugc.aweme.port.in.u;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.port.in.w;
import com.ss.android.ugc.aweme.port.in.x;
import com.ss.android.ugc.aweme.port.in.y;
import com.ss.android.ugc.aweme.port.internal.ServiceConnectionImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.ui.BlackListActivity;
import com.ss.android.ugc.aweme.share.av;
import com.ss.android.ugc.aweme.share.aw;
import com.ss.android.ugc.aweme.share.bs;
import com.ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule;
import com.ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.ss.android.ugc.aweme.story.shootvideo.setting.j;
import com.ss.android.ugc.aweme.u.ak;
import com.ss.android.ugc.aweme.u.g;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.et;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3701a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile f f3702b = new f();

    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f3709a;

        /* renamed from: b  reason: collision with root package name */
        private final v.a f3710b;

        @Subscribe(a = ThreadMode.MAIN)
        public void onEvent(com.ss.android.ugc.aweme.live.authentication.model.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f3709a, false, 54643, new Class[]{com.ss.android.ugc.aweme.live.authentication.model.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f3709a, false, 54643, new Class[]{com.ss.android.ugc.aweme.live.authentication.model.a.class}, Void.TYPE);
                return;
            }
            this.f3710b.onEvent(v.b.LiveRestartEvent);
        }
    }

    static class a implements com.ss.android.ugc.aweme.port.in.i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58171a;

        private a() {
        }

        public final boolean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f58171a, false, 54543, new Class[0], Boolean.TYPE)) {
                return AbTestManager.a().I();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58171a, false, 54543, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final boolean b() {
            if (!PatchProxy.isSupport(new Object[0], this, f58171a, false, 54544, new Class[0], Boolean.TYPE)) {
                return AbTestManager.a().O();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58171a, false, 54544, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final int c() {
            if (!PatchProxy.isSupport(new Object[0], this, f58171a, false, 54545, new Class[0], Integer.TYPE)) {
                return AbTestManager.a().d().insShareType;
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58171a, false, 54545, new Class[0], Integer.TYPE)).intValue();
        }

        public final boolean d() {
            if (!PatchProxy.isSupport(new Object[0], this, f58171a, false, 54546, new Class[0], Boolean.TYPE)) {
                return AbTestManager.a().bb();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58171a, false, 54546, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final boolean e() {
            if (!PatchProxy.isSupport(new Object[0], this, f58171a, false, 54547, new Class[0], Boolean.TYPE)) {
                return AbTestManager.a().ck();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58171a, false, 54547, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final boolean f() {
            if (PatchProxy.isSupport(new Object[0], this, f58171a, false, 54548, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58171a, false, 54548, new Class[0], Boolean.TYPE)).booleanValue();
            }
            AbTestManager.a();
            return true;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static class b implements com.ss.android.ugc.aweme.port.in.m {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58172a;

        private b() {
        }

        public final Class<? extends FragmentActivity> a() {
            return MainActivity.class;
        }

        @NonNull
        public final Class<? extends FragmentActivity> b() {
            return MainActivity.class;
        }

        public final void a(Context context, String str) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2, str}, this, f58172a, false, 54559, new Class[]{Context.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, str}, this, f58172a, false, 54559, new Class[]{Context.class, String.class}, Void.TYPE);
                return;
            }
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setData(Uri.parse(str));
            intent.putExtra("bundle_user_webview_title", true);
            context2.startActivity(intent);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.ss.android.ugc.aweme.u.al} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: com.ss.android.ugc.aweme.u.al} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r20, java.lang.String r21) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r0
                r11 = 1
                r3[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = f58172a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r8[r10] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r8[r11] = r4
                java.lang.Class r9 = java.lang.Void.TYPE
                r6 = 0
                r7 = 54560(0xd520, float:7.6455E-41)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0047
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = f58172a
                r15 = 0
                r16 = 54560(0xd520, float:7.6455E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r10] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r11] = r1
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r19
                r17 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                return
            L_0x0047:
                com.ss.android.ugc.aweme.u.al r9 = new com.ss.android.ugc.aweme.u.al
                r9.<init>()
                java.lang.Object[] r2 = new java.lang.Object[r11]
                r2[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.u.al.f75041a
                r5 = 0
                r6 = 58946(0xe642, float:8.2601E-41)
                java.lang.Class[] r7 = new java.lang.Class[r11]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r7[r10] = r3
                java.lang.Class<com.ss.android.ugc.aweme.u.al> r8 = com.ss.android.ugc.aweme.u.al.class
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0080
                java.lang.Object[] r2 = new java.lang.Object[r11]
                r2[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.u.al.f75041a
                r5 = 0
                r6 = 58946(0xe642, float:8.2601E-41)
                java.lang.Class[] r7 = new java.lang.Class[r11]
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r7[r10] = r0
                java.lang.Class<com.ss.android.ugc.aweme.u.al> r8 = com.ss.android.ugc.aweme.u.al.class
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                r9 = r0
                com.ss.android.ugc.aweme.u.al r9 = (com.ss.android.ugc.aweme.u.al) r9
                goto L_0x0087
            L_0x0080:
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.u.d$a r3 = com.ss.android.ugc.aweme.u.d.a.f75112a
                r9.a(r2, r0, r3)
            L_0x0087:
                java.lang.Object[] r12 = new java.lang.Object[r11]
                r12[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.u.al.f75041a
                r15 = 0
                r16 = 58945(0xe641, float:8.26E-41)
                java.lang.Class[] r0 = new java.lang.Class[r11]
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r0[r10] = r2
                java.lang.Class<com.ss.android.ugc.aweme.u.al> r18 = com.ss.android.ugc.aweme.u.al.class
                r13 = r9
                r17 = r0
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                if (r0 == 0) goto L_0x00bf
                java.lang.Object[] r12 = new java.lang.Object[r11]
                r12[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.u.al.f75041a
                r15 = 0
                r16 = 58945(0xe641, float:8.26E-41)
                java.lang.Class[] r0 = new java.lang.Class[r11]
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r10] = r1
                java.lang.Class<com.ss.android.ugc.aweme.u.al> r18 = com.ss.android.ugc.aweme.u.al.class
                r13 = r9
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                r9 = r0
                com.ss.android.ugc.aweme.u.al r9 = (com.ss.android.ugc.aweme.u.al) r9
                goto L_0x00c6
            L_0x00bf:
                java.lang.String r0 = "shoot_type"
                com.ss.android.ugc.aweme.u.d$a r2 = com.ss.android.ugc.aweme.u.d.a.f75112a
                r9.a(r0, r1, r2)
            L_0x00c6:
                r9.e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.o.f.b.a(java.lang.String, java.lang.String):void");
        }

        public final void a(String str, String str2, String str3) {
            String str4 = str3;
            if (PatchProxy.isSupport(new Object[]{str, str2, str4}, this, f58172a, false, 54562, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str2, str4}, this, f58172a, false, 54562, new Class[]{String.class, String.class, String.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.u.g gVar = new com.ss.android.ugc.aweme.u.g();
            gVar.f75120b = g.a.fromStringValue(str);
            gVar.f75121c = g.b.fromStringValue(str2);
            gVar.f75122d = str4;
            gVar.e();
        }

        public final boolean a(long j) {
            long j2 = j;
            if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f58172a, false, 54566, new Class[]{Long.TYPE}, Boolean.TYPE)) {
                return LocalVideoPlayerManager.a().a(j2);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f58172a, false, 54566, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f58172a, false, 54567, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f58172a, false, 54567, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            AwemeAppData.p().ao = true;
        }

        public final void a(FragmentActivity fragmentActivity, String str) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2, str}, this, f58172a, false, 54568, new Class[]{FragmentActivity.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentActivity2, str}, this, f58172a, false, 54568, new Class[]{FragmentActivity.class, String.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.discover.hitrank.c cVar = com.ss.android.ugc.aweme.discover.hitrank.c.f42388e;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2, str}, cVar, com.ss.android.ugc.aweme.discover.hitrank.c.f42384a, false, 36400, new Class[]{FragmentActivity.class, String.class}, Void.TYPE)) {
                Object[] objArr = {fragmentActivity2, str};
                Object[] objArr2 = objArr;
                com.ss.android.ugc.aweme.discover.hitrank.c cVar2 = cVar;
                ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.discover.hitrank.c.f42384a;
                PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect, false, 36400, new Class[]{FragmentActivity.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            if (str != null) {
                com.ss.android.ugc.aweme.discover.hitrank.e eVar = (com.ss.android.ugc.aweme.discover.hitrank.e) com.ss.android.ugc.aweme.base.sharedpref.c.a(com.ss.android.ugc.aweme.base.utils.d.a(), com.ss.android.ugc.aweme.discover.hitrank.e.class);
                CharSequence charSequence = str;
                if ((StringsKt.contains$default(charSequence, (CharSequence) "153070", false, 2, (Object) null) || StringsKt.contains$default(charSequence, (CharSequence) "153071", false, 2, (Object) null)) && com.ss.android.ugc.aweme.discover.hitrank.c.f42385b) {
                    if (!eVar.a()) {
                        eVar.a(true);
                        com.ss.android.ugc.aweme.discover.hitrank.c.f42385b = false;
                        com.bytedance.ies.dmt.ui.d.a.c((Context) com.ss.android.ugc.aweme.app.k.a(), (int) C0906R.string.amd).a();
                    }
                    com.ss.android.ugc.aweme.discover.hitrank.f.f42393c.a(com.ss.android.ugc.aweme.discover.hitrank.c.f42386c, 7);
                }
            }
        }

        public final void a(Fragment fragment, boolean z) {
            Fragment fragment2 = fragment;
            if (PatchProxy.isSupport(new Object[]{fragment2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f58172a, false, 54572, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragment2, Byte.valueOf(z)}, this, f58172a, false, 54572, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (fragment2 instanceof HomeFragment) {
                HomeFragment homeFragment = (HomeFragment) fragment2;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, homeFragment, HomeFragment.f3509a, false, 57070, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    HomeFragment homeFragment2 = homeFragment;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, homeFragment2, HomeFragment.f3509a, false, 57070, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                HomeViewPager homeViewPager = homeFragment.f3510b;
                if (homeViewPager != null) {
                    homeViewPager.setCanScroll(z);
                }
            }
        }

        public final void a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f58172a, false, 54573, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f58172a, false, 54573, new Class[]{String.class}, Void.TYPE);
                return;
            }
            z.a(z.c.valueOf(str));
        }

        public final int c() {
            if (!PatchProxy.isSupport(new Object[0], this, f58172a, false, 54551, new Class[0], Integer.TYPE)) {
                return com.ss.android.ugc.aweme.app.i.a().getUpdateVersionCode();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58172a, false, 54551, new Class[0], Integer.TYPE)).intValue();
        }

        public final String d() {
            if (!PatchProxy.isSupport(new Object[0], this, f58172a, false, 54552, new Class[0], String.class)) {
                return com.ss.android.ugc.aweme.app.i.a().getVersion();
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f58172a, false, 54552, new Class[0], String.class);
        }

        public final String e() {
            if (!PatchProxy.isSupport(new Object[0], this, f58172a, false, 54553, new Class[0], String.class)) {
                return com.ss.android.ugc.aweme.app.i.a().getChannel();
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f58172a, false, 54553, new Class[0], String.class);
        }

        public final boolean g() {
            if (!PatchProxy.isSupport(new Object[0], this, f58172a, false, 54569, new Class[0], Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.video.j.b();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58172a, false, 54569, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final int h() {
            if (!PatchProxy.isSupport(new Object[0], this, f58172a, false, 54570, new Class[0], Integer.TYPE)) {
                return com.ss.android.ugc.aweme.utils.permission.e.a();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58172a, false, 54570, new Class[0], Integer.TYPE)).intValue();
        }

        public final int i() {
            if (!PatchProxy.isSupport(new Object[0], this, f58172a, false, 54571, new Class[0], Integer.TYPE)) {
                return com.ss.android.ugc.aweme.utils.permission.e.b();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58172a, false, 54571, new Class[0], Integer.TYPE)).intValue();
        }

        public final void f() {
            if (PatchProxy.isSupport(new Object[0], this, f58172a, false, 54565, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58172a, false, 54565, new Class[0], Void.TYPE);
            } else if (PatchProxy.isSupport(new Object[0], null, et.f75847a, true, 88639, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, et.f75847a, true, 88639, new Class[0], Void.TYPE);
            } else {
                et.a(10);
            }
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final ServiceConnection a(FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (!PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f58172a, false, 54561, new Class[]{FragmentActivity.class}, ServiceConnection.class)) {
                return new ServiceConnectionImpl(fragmentActivity2);
            }
            return (ServiceConnection) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f58172a, false, 54561, new Class[]{FragmentActivity.class}, ServiceConnection.class);
        }

        public final String a(Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f58172a, false, 54549, new Class[]{Context.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{context2}, this, f58172a, false, 54549, new Class[]{Context.class}, String.class);
            } else if (context2 instanceof MainActivity) {
                return ((MainActivity) context2).getEnterFromPage();
            } else {
                return null;
            }
        }

        public final void a(Context context, int i) {
            Context context2 = context;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, f58172a, false, 54557, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, f58172a, false, 54557, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intent intent = new Intent(context2, BlackListActivity.class);
            intent.putExtra("block_type", 1);
            if (i != 2) {
                i2 = 1;
            }
            intent.putExtra("theme_mode", i2);
            context2.startActivity(intent);
        }

        public final void a(Context context, m.a aVar) {
            Context context2 = context;
            final m.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{context2, aVar2}, this, f58172a, false, 54558, new Class[]{Context.class, m.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aVar2}, this, f58172a, false, 54558, new Class[]{Context.class, m.a.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.d.a.a(context2, new com.ss.android.ugc.aweme.d.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58173a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f58173a, false, 54575, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58173a, false, 54575, new Class[0], Void.TYPE);
                        return;
                    }
                    aVar2.a();
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58173a, false, 54574, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58173a, false, 54574, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    aVar2.a(z);
                }
            });
        }

        public final void a(Context context, @NonNull com.ss.android.ugc.aweme.shortvideo.c cVar) {
            Context context2 = context;
            com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{context2, cVar2}, this, f58172a, false, 54555, new Class[]{Context.class, com.ss.android.ugc.aweme.shortvideo.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, cVar2}, this, f58172a, false, 54555, new Class[]{Context.class, com.ss.android.ugc.aweme.shortvideo.c.class}, Void.TYPE);
                return;
            }
            new ak().a("upload").b("video").a(1).e();
            Intent intent = new Intent();
            intent.putExtra("creation_id", UUID.randomUUID().toString());
            intent.putExtra("challenge", cVar2);
            if (!(context2 instanceof Activity)) {
                intent.addFlags(268435456);
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).startCutMultiVideoActivity(context2, intent);
        }

        public final void a(Activity activity, View view, float f2, String... strArr) {
            if (PatchProxy.isSupport(new Object[]{activity, view, Float.valueOf(f2), strArr}, this, f58172a, false, 54554, new Class[]{Activity.class, View.class, Float.TYPE, String[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, view, Float.valueOf(f2), strArr}, this, f58172a, false, 54554, new Class[]{Activity.class, View.class, Float.TYPE, String[].class}, Void.TYPE);
                return;
            }
            HeaderDetailActivity.a(activity, view, f2, null, false, null, strArr);
        }
    }

    static class c implements com.ss.android.ugc.aweme.port.in.n {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58176a;

        private c() {
        }

        public final boolean b() {
            if (!PatchProxy.isSupport(new Object[0], this, f58176a, false, 54581, new Class[0], Boolean.TYPE)) {
                return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).needLiveInRecord();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58176a, false, 54581, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final boolean c() {
            if (!PatchProxy.isSupport(new Object[0], this, f58176a, false, 54582, new Class[0], Boolean.TYPE)) {
                return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).needCheckCopyright();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58176a, false, 54582, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final boolean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f58176a, false, 54576, new Class[0], Boolean.TYPE)) {
                return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isFocusOnVideoTime();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58176a, false, 54576, new Class[0], Boolean.TYPE)).booleanValue();
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public final String a(Context context) {
            if (!PatchProxy.isSupport(new Object[]{context}, this, f58176a, false, 54587, new Class[]{Context.class}, String.class)) {
                return com.ss.android.ugc.aweme.video.e.f.a(context);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{context}, this, f58176a, false, 54587, new Class[]{Context.class}, String.class);
        }

        public final w a(Object obj) {
            Object obj2 = obj;
            if (!PatchProxy.isSupport(new Object[]{obj2}, this, f58176a, false, 54584, new Class[]{Object.class}, w.class)) {
                return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkShareContextWhenPublish(obj2);
            }
            return (w) PatchProxy.accessDispatch(new Object[]{obj2}, this, f58176a, false, 54584, new Class[]{Object.class}, w.class);
        }

        public final void b(Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, f58176a, false, 54586, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj2}, this, f58176a, false, 54586, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onBackToOpenPlatform(obj2);
        }

        public final boolean a(w wVar) {
            w wVar2 = wVar;
            if (!PatchProxy.isSupport(new Object[]{wVar2}, this, f58176a, false, 54577, new Class[]{w.class}, Boolean.TYPE)) {
                return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isClientKeyValid(wVar2);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{wVar2}, this, f58176a, false, 54577, new Class[]{w.class}, Boolean.TYPE)).booleanValue();
        }

        public final void a(String str, String str2) {
            String str3 = str;
            if (PatchProxy.isSupport(new Object[]{str3, null}, this, f58176a, false, 54585, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, null}, this, f58176a, false, 54585, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent(str3, null);
        }

        public final void a(Activity activity, w wVar, String str, int i) {
            Activity activity2 = activity;
            w wVar2 = wVar;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{activity2, wVar2, str2, Integer.valueOf(i)}, this, f58176a, false, 54578, new Class[]{Activity.class, w.class, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, wVar2, str2, Integer.valueOf(i)}, this, f58176a, false, 54578, new Class[]{Activity.class, w.class, String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onReturnThirdPlatformFailed(activity2, wVar2, str2, i);
        }
    }

    static class d implements com.ss.android.ugc.aweme.port.in.p {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58177a;

        private d() {
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        public final boolean a(Exception exc) {
            if (!PatchProxy.isSupport(new Object[]{exc}, this, f58177a, false, 54592, new Class[]{Exception.class}, Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.captcha.c.b.a(exc);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{exc}, this, f58177a, false, 54592, new Class[]{Exception.class}, Boolean.TYPE)).booleanValue();
        }

        public final void a(com.ss.android.ugc.aweme.base.api.a.b.a aVar, p.a aVar2) {
            final com.ss.android.ugc.aweme.base.api.a.b.a aVar3 = aVar;
            final p.a aVar4 = aVar2;
            if (PatchProxy.isSupport(new Object[]{aVar3, aVar4}, this, f58177a, false, 54593, new Class[]{com.ss.android.ugc.aweme.base.api.a.b.a.class, p.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar3, aVar4}, this, f58177a, false, 54593, new Class[]{com.ss.android.ugc.aweme.base.api.a.b.a.class, p.a.class}, Void.TYPE);
                return;
            }
            bg.a(new com.ss.android.ugc.aweme.captcha.a<MainActivity>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58178a;

                public final /* synthetic */ void accept(Object obj) {
                    MainActivity mainActivity = (MainActivity) obj;
                    if (PatchProxy.isSupport(new Object[]{mainActivity}, this, f58178a, false, 54594, new Class[]{MainActivity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{mainActivity}, this, f58178a, false, 54594, new Class[]{MainActivity.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.captcha.c.b.a(mainActivity.getSupportFragmentManager(), aVar3, new com.ss.android.ugc.aweme.captcha.b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58182a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f58182a, false, 54595, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f58182a, false, 54595, new Class[0], Void.TYPE);
                                return;
                            }
                            aVar4.a();
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f58182a, false, 54596, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f58182a, false, 54596, new Class[0], Void.TYPE);
                                return;
                            }
                            aVar4.b();
                        }
                    });
                }
            });
        }
    }

    static class e implements com.ss.android.ugc.aweme.port.in.q {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58184a;

        private e() {
        }

        public final com.ss.android.ugc.aweme.shortvideo.c a(String str, int i, boolean z) throws Exception {
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{str2, 0, (byte) 0}, this, f58184a, false, 54602, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, com.ss.android.ugc.aweme.shortvideo.c.class)) {
                return new com.ss.android.ugc.aweme.shortvideo.o.a().apply(ChallengeApi.a(str2, 0, false).challenge);
            }
            return (com.ss.android.ugc.aweme.shortvideo.c) PatchProxy.accessDispatch(new Object[]{str2, 0, (byte) 0}, this, f58184a, false, 54602, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, com.ss.android.ugc.aweme.shortvideo.c.class);
        }

        public final void a(@Nullable String str, @Nullable String str2, @ChallengeType.TYPE int i, int i2, @NonNull com.ss.android.ugc.aweme.base.b.a.b<com.ss.android.ugc.aweme.shortvideo.c> bVar) {
            String str3 = str;
            com.ss.android.ugc.aweme.base.b.a.b<com.ss.android.ugc.aweme.shortvideo.c> bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{str3, null, 0, 0, bVar2}, this, f58184a, false, 54604, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.base.b.a.b.class}, Void.TYPE)) {
                Object[] objArr = {str3, null, 0, 0, bVar2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f58184a, false, 54604, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.base.b.a.b.class}, Void.TYPE);
                return;
            }
            ChallengeModule challengeModule = new ChallengeModule();
            m mVar = new m(bVar2);
            if (PatchProxy.isSupport(new Object[]{str3, null, 0, 0, mVar}, challengeModule, ChallengeModule.f69177a, false, 78535, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.base.b.a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, null, 0, 0, mVar}, challengeModule, ChallengeModule.f69177a, false, 78535, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.base.b.a.b.class}, Void.TYPE);
                return;
            }
            ChallengeModule.AnonymousClass1 r1 = new com.google.common.util.concurrent.k<ChallengeDetail>(mVar) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69179a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f69180b;

                public final void onFailure(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f69179a, false, 78537, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f69179a, false, 78537, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    this.f69180b.accept(null);
                }

                public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
                    ChallengeDetail challengeDetail = (ChallengeDetail) obj;
                    if (PatchProxy.isSupport(new Object[]{challengeDetail}, this, f69179a, false, 78536, new Class[]{ChallengeDetail.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{challengeDetail}, this, f69179a, false, 78536, new Class[]{ChallengeDetail.class}, Void.TYPE);
                        return;
                    }
                    this.f69180b.accept(challengeDetail);
                }

                {
                    this.f69180b = r2;
                }
            };
            if (com.ss.android.ugc.aweme.commercialize.utils.r.b(str) || com.ss.android.ugc.aweme.commercialize.utils.r.b((String) null)) {
                com.google.common.util.concurrent.l.a(challengeModule.f69178b.fetchCommerceChallengeDetail(str3, null, 0, 0), r1, com.ss.android.ugc.aweme.base.k.f34752b);
            } else {
                com.google.common.util.concurrent.l.a(challengeModule.f69178b.fetchChallengeDetail(str3, null, 0, 0), r1, com.ss.android.ugc.aweme.base.k.f34752b);
            }
        }

        /* synthetic */ e(byte b2) {
            this();
        }

        public final q.c a(Fragment fragment) {
            if (PatchProxy.isSupport(new Object[]{fragment}, this, f58184a, false, 54599, new Class[]{Fragment.class}, q.c.class)) {
                return (q.c) PatchProxy.accessDispatch(new Object[]{fragment}, this, f58184a, false, 54599, new Class[]{Fragment.class}, q.c.class);
            }
            final RecommendHashTagViewModel recommendHashTagViewModel = (RecommendHashTagViewModel) ViewModelProviders.of(fragment).get(RecommendHashTagViewModel.class);
            return new q.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58185a;

                public final List<com.ss.android.ugc.aweme.shortvideo.g> a() {
                    MutableLiveData<List<com.ss.android.ugc.aweme.challenge.recommend.a.a>> mutableLiveData;
                    if (PatchProxy.isSupport(new Object[0], this, f58185a, false, 54610, new Class[0], List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[0], this, f58185a, false, 54610, new Class[0], List.class);
                    }
                    RecommendHashTagViewModel recommendHashTagViewModel = recommendHashTagViewModel;
                    if (PatchProxy.isSupport(new Object[0], recommendHashTagViewModel, RecommendHashTagViewModel.f35403a, false, 25890, new Class[0], MutableLiveData.class)) {
                        mutableLiveData = (MutableLiveData) PatchProxy.accessDispatch(new Object[0], recommendHashTagViewModel, RecommendHashTagViewModel.f35403a, false, 25890, new Class[0], MutableLiveData.class);
                    } else {
                        if (recommendHashTagViewModel.f35404b == null) {
                            recommendHashTagViewModel.f35404b = new MutableLiveData<>();
                        }
                        mutableLiveData = recommendHashTagViewModel.f35404b;
                    }
                    List list = (List) mutableLiveData.getValue();
                    if (PatchProxy.isSupport(new Object[]{list}, null, com.ss.android.ugc.aweme.shortvideo.o.d.f68804a, true, 80102, new Class[]{List.class}, ArrayList.class)) {
                        return (ArrayList) PatchProxy.accessDispatch(new Object[]{list}, null, com.ss.android.ugc.aweme.shortvideo.o.d.f68804a, true, 80102, new Class[]{List.class}, ArrayList.class);
                    } else if (list == null) {
                        return null;
                    } else {
                        return az.a((Iterable<? extends E>) az.a(list, new com.ss.android.ugc.aweme.shortvideo.o.d()));
                    }
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f58185a, false, 54611, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58185a, false, 54611, new Class[0], Void.TYPE);
                        return;
                    }
                    RecommendHashTagViewModel recommendHashTagViewModel = recommendHashTagViewModel;
                    if (PatchProxy.isSupport(new Object[0], recommendHashTagViewModel, RecommendHashTagViewModel.f35403a, false, 25891, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], recommendHashTagViewModel, RecommendHashTagViewModel.f35403a, false, 25891, new Class[0], Void.TYPE);
                        return;
                    }
                    if (recommendHashTagViewModel.f35404b == null) {
                        recommendHashTagViewModel.f35404b = new MutableLiveData<>();
                    }
                    MutableLiveData<List<com.ss.android.ugc.aweme.challenge.recommend.a.a>> mutableLiveData = recommendHashTagViewModel.f35404b;
                    if (PatchProxy.isSupport(new Object[]{mutableLiveData}, null, RecommendHashTagApi.f35401a, true, 25887, new Class[]{MutableLiveData.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{mutableLiveData}, null, RecommendHashTagApi.f35401a, true, 25887, new Class[]{MutableLiveData.class}, Void.TYPE);
                        return;
                    }
                    RecommendHashTagApi.f35402b.fetchRecommendHashTags().a((a.g<TResult, TContinuationResult>) new com.ss.android.ugc.aweme.challenge.recommend.a<TResult,TContinuationResult>(mutableLiveData), a.i.f1052b);
                }
            };
        }

        public final q.a a(com.ss.android.ugc.aweme.common.f.c<com.ss.android.ugc.aweme.shortvideo.c> cVar) {
            final com.ss.android.ugc.aweme.common.f.c<com.ss.android.ugc.aweme.shortvideo.c> cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f58184a, false, 54603, new Class[]{com.ss.android.ugc.aweme.common.f.c.class}, q.a.class)) {
                return (q.a) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f58184a, false, 54603, new Class[]{com.ss.android.ugc.aweme.common.f.c.class}, q.a.class);
            }
            com.ss.android.ugc.aweme.common.f.b bVar = new com.ss.android.ugc.aweme.common.f.b();
            bVar.a(new com.ss.android.ugc.aweme.challenge.c.d());
            bVar.a(new com.ss.android.ugc.aweme.common.f.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58191a;

                public final void n_() {
                    if (PatchProxy.isSupport(new Object[0], this, f58191a, false, 54615, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58191a, false, 54615, new Class[0], Void.TYPE);
                        return;
                    }
                    cVar2.n_();
                }

                public final void s_() {
                    if (PatchProxy.isSupport(new Object[0], this, f58191a, false, 54619, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58191a, false, 54619, new Class[0], Void.TYPE);
                        return;
                    }
                    cVar2.s_();
                }

                public final void y_() {
                    if (PatchProxy.isSupport(new Object[0], this, f58191a, false, 54617, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58191a, false, 54617, new Class[0], Void.TYPE);
                        return;
                    }
                    cVar2.y_();
                }

                public final void z_() {
                    if (PatchProxy.isSupport(new Object[0], this, f58191a, false, 54622, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58191a, false, 54622, new Class[0], Void.TYPE);
                        return;
                    }
                    cVar2.z_();
                }

                public final void b(Exception exc) {
                    Exception exc2 = exc;
                    if (PatchProxy.isSupport(new Object[]{exc2}, this, f58191a, false, 54616, new Class[]{Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{exc2}, this, f58191a, false, 54616, new Class[]{Exception.class}, Void.TYPE);
                        return;
                    }
                    cVar2.b(exc2);
                }

                public final void c(Exception exc) {
                    Exception exc2 = exc;
                    if (PatchProxy.isSupport(new Object[]{exc2}, this, f58191a, false, 54620, new Class[]{Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{exc2}, this, f58191a, false, 54620, new Class[]{Exception.class}, Void.TYPE);
                        return;
                    }
                    cVar2.c(exc2);
                }

                public final void d(Exception exc) {
                    Exception exc2 = exc;
                    if (PatchProxy.isSupport(new Object[]{exc2}, this, f58191a, false, 54623, new Class[]{Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{exc2}, this, f58191a, false, 54623, new Class[]{Exception.class}, Void.TYPE);
                        return;
                    }
                    cVar2.d(exc2);
                }

                public final void a(List list, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f58191a, false, 54618, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f58191a, false, 54618, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    cVar2.a(com.ss.android.ugc.aweme.shortvideo.o.a.a(list), z);
                }

                public final void b(List list, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f58191a, false, 54621, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f58191a, false, 54621, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    cVar2.b(com.ss.android.ugc.aweme.shortvideo.o.a.a(list), z);
                }

                public final void c(List list, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f58191a, false, 54624, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f58191a, false, 54624, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    cVar2.c(com.ss.android.ugc.aweme.shortvideo.o.a.a(list), z);
                }
            });
            bVar.getClass();
            if (!PatchProxy.isSupport(new Object[]{bVar}, null, l.f58295a, true, 54607, new Class[]{com.ss.android.ugc.aweme.common.f.b.class}, q.a.class)) {
                return new l(bVar);
            }
            return (q.a) PatchProxy.accessDispatch(new Object[]{bVar}, null, l.f58295a, true, 54607, new Class[]{com.ss.android.ugc.aweme.common.f.b.class}, q.a.class);
        }

        public final q.b a(q.d dVar) {
            final q.d dVar2 = dVar;
            if (PatchProxy.isSupport(new Object[]{dVar2}, this, f58184a, false, 54600, new Class[]{q.d.class}, q.b.class)) {
                return (q.b) PatchProxy.accessDispatch(new Object[]{dVar2}, this, f58184a, false, 54600, new Class[]{q.d.class}, q.b.class);
            }
            com.ss.android.ugc.aweme.challenge.c.g gVar = new com.ss.android.ugc.aweme.challenge.c.g();
            gVar.a(new com.ss.android.ugc.aweme.challenge.c.e());
            gVar.a(new com.ss.android.ugc.aweme.challenge.c.i() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58188a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f58188a, false, 54612, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58188a, false, 54612, new Class[0], Void.TYPE);
                        return;
                    }
                    dVar2.b();
                }

                public final void a(Exception exc) {
                    Exception exc2 = exc;
                    if (PatchProxy.isSupport(new Object[]{exc2}, this, f58188a, false, 54613, new Class[]{Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{exc2}, this, f58188a, false, 54613, new Class[]{Exception.class}, Void.TYPE);
                        return;
                    }
                    dVar2.a(exc2);
                }

                public final void a(SearchChallengeList searchChallengeList) {
                    SearchChallengeList searchChallengeList2 = searchChallengeList;
                    if (PatchProxy.isSupport(new Object[]{searchChallengeList2}, this, f58188a, false, 54614, new Class[]{SearchChallengeList.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{searchChallengeList2}, this, f58188a, false, 54614, new Class[]{SearchChallengeList.class}, Void.TYPE);
                        return;
                    }
                    dVar2.a(new com.ss.android.ugc.aweme.shortvideo.o.e().a(searchChallengeList2));
                }
            });
            gVar.getClass();
            if (!PatchProxy.isSupport(new Object[]{gVar}, null, k.f58293a, true, 54605, new Class[]{com.ss.android.ugc.aweme.challenge.c.g.class}, q.b.class)) {
                return new k(gVar);
            }
            return (q.b) PatchProxy.accessDispatch(new Object[]{gVar}, null, k.f58293a, true, 54605, new Class[]{com.ss.android.ugc.aweme.challenge.c.g.class}, q.b.class);
        }

        @Nullable
        public final com.ss.android.ugc.aweme.shortvideo.c a(@Nullable Intent intent) {
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{intent2}, this, f58184a, false, 54597, new Class[]{Intent.class}, com.ss.android.ugc.aweme.shortvideo.c.class)) {
                return (com.ss.android.ugc.aweme.shortvideo.c) PatchProxy.accessDispatch(new Object[]{intent2}, this, f58184a, false, 54597, new Class[]{Intent.class}, com.ss.android.ugc.aweme.shortvideo.c.class);
            } else if (intent2 != null) {
                return new com.ss.android.ugc.aweme.shortvideo.o.a().apply((Challenge) intent2.getSerializableExtra("challenge"));
            } else {
                return null;
            }
        }

        public final com.ss.android.ugc.aweme.shortvideo.c a(int i, int i2, Intent intent, int i3) {
            Challenge challenge;
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2, 1}, this, f58184a, false, 54598, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class, Integer.TYPE}, com.ss.android.ugc.aweme.shortvideo.c.class)) {
                return (com.ss.android.ugc.aweme.shortvideo.c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2, 1}, this, f58184a, false, 54598, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class, Integer.TYPE}, com.ss.android.ugc.aweme.shortvideo.c.class);
            }
            if (i == 1 && i2 == -1) {
                if (intent2 != null) {
                    challenge = (Challenge) intent2.getSerializableExtra("challenge");
                } else {
                    challenge = null;
                }
                if (challenge != null) {
                    return new com.ss.android.ugc.aweme.shortvideo.o.a().apply(challenge);
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.o.f$f  reason: collision with other inner class name */
    static class C0654f implements com.ss.android.ugc.aweme.port.in.r {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58194a;

        private C0654f() {
        }

        public final boolean a(Context context, String str, boolean z) {
            Context context2 = context;
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{context2, str2, (byte) 0}, this, f58194a, false, 54625, new Class[]{Context.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.commercialize.utils.g.a(context2, str2, false);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2, (byte) 0}, this, f58194a, false, 54625, new Class[]{Context.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }

        /* synthetic */ C0654f(byte b2) {
            this();
        }

        public final String a(com.ss.android.ugc.aweme.draft.a.c cVar) {
            com.ss.android.ugc.aweme.draft.a.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f58194a, false, 54627, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f58194a, false, 54627, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, String.class);
            }
            if (PatchProxy.isSupport(new Object[]{cVar2}, null, com.ss.android.ugc.aweme.draft.n.f43496a, true, 38460, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{cVar2}, null, com.ss.android.ugc.aweme.draft.n.f43496a, true, 38460, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, String.class);
            }
            String str = cVar2.T.r;
            com.ss.android.ugc.aweme.commercialize.model.e b2 = com.ss.android.ugc.aweme.commercialize.model.e.b("");
            b2.f39379f = com.ss.android.ugc.aweme.commercialize.model.e.b(str).f39379f;
            return com.ss.android.ugc.aweme.commercialize.model.e.a(b2);
        }

        public final String a(String str, long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str, new Long(j2)}, this, f58194a, false, 54628, new Class[]{String.class, Long.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str, new Long(j2)}, this, f58194a, false, 54628, new Class[]{String.class, Long.TYPE}, String.class);
            }
            com.ss.android.ugc.aweme.commercialize.model.e b2 = com.ss.android.ugc.aweme.commercialize.model.e.b(str);
            b2.f39377d = j2;
            return com.ss.android.ugc.aweme.app.api.m.d().toJson((Object) b2);
        }

        public final String a(String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f58194a, false, 54629, new Class[]{String.class, Boolean.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f58194a, false, 54629, new Class[]{String.class, Boolean.TYPE}, String.class);
            }
            com.ss.android.ugc.aweme.commercialize.model.e b2 = com.ss.android.ugc.aweme.commercialize.model.e.b(str);
            b2.a(z);
            return com.ss.android.ugc.aweme.app.api.m.d().toJson((Object) b2);
        }

        public final boolean a(Context context, String str, String str2) {
            if (!PatchProxy.isSupport(new Object[]{context, str, str2}, this, f58194a, false, 54626, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.commercialize.utils.g.a(context, str, str2);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str, str2}, this, f58194a, false, 54626, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        }

        public final void a(@NonNull String str, @NonNull String str2, String str3, String str4, Map<String, Object> map) {
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8, null}, this, f58194a, false, 54630, new Class[]{String.class, String.class, String.class, String.class, Map.class}, Void.TYPE)) {
                Object[] objArr = {str5, str6, str7, str8, null};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f58194a, false, 54630, new Class[]{String.class, String.class, String.class, String.class, Map.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8, null}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31770, new Class[]{String.class, String.class, String.class, String.class, Map.class}, Void.TYPE)) {
                Object[] objArr3 = {str5, str6, str7, str8, null};
                Object[] objArr4 = objArr3;
                PatchProxy.accessDispatch(objArr4, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31770, new Class[]{String.class, String.class, String.class, String.class, Map.class}, Void.TYPE);
                return;
            }
            if (!TextUtils.isEmpty(str4)) {
                try {
                    AwemeRawAd awemeRawAd = (AwemeRawAd) new Gson().fromJson(str8, AwemeRawAd.class);
                    if (awemeRawAd != null) {
                        JSONObject a2 = com.ss.android.ugc.aweme.commercialize.log.g.a(GlobalContext.getContext(), awemeRawAd, "", false);
                        if (!TextUtils.isEmpty(str3)) {
                            try {
                                a2.put("refer", str7);
                            } catch (JSONException unused) {
                            }
                        }
                        com.ss.android.ugc.aweme.commercialize.log.g.a(GlobalContext.getContext(), str5, str6, a2, awemeRawAd);
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    static class g implements com.ss.android.ugc.aweme.port.in.s {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58195a;

        private g() {
        }

        public final com.ss.android.ugc.aweme.story.shootvideo.publish.a.f a() throws Exception {
            if (!PatchProxy.isSupport(new Object[0], this, f58195a, false, 54631, new Class[0], com.ss.android.ugc.aweme.story.shootvideo.publish.a.f.class)) {
                return PushSettingsApiManager.a();
            }
            return (com.ss.android.ugc.aweme.story.shootvideo.publish.a.f) PatchProxy.accessDispatch(new Object[0], this, f58195a, false, 54631, new Class[0], com.ss.android.ugc.aweme.story.shootvideo.publish.a.f.class);
        }

        public final s.c b() {
            if (PatchProxy.isSupport(new Object[0], this, f58195a, false, 54632, new Class[0], s.c.class)) {
                return (s.c) PatchProxy.accessDispatch(new Object[0], this, f58195a, false, 54632, new Class[0], s.c.class);
            }
            final com.ss.android.ugc.aweme.setting.serverpush.b.e eVar = new com.ss.android.ugc.aweme.setting.serverpush.b.e();
            return new s.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58196a;

                public final void a(final s.d dVar) {
                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f58196a, false, 54635, new Class[]{s.d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f58196a, false, 54635, new Class[]{s.d.class}, Void.TYPE);
                        return;
                    }
                    eVar.a(new com.ss.android.ugc.aweme.setting.serverpush.b.b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58199a;

                        public final void d_(Exception exc) {
                            if (PatchProxy.isSupport(new Object[]{exc}, this, f58199a, false, 54638, new Class[]{Exception.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{exc}, this, f58199a, false, 54638, new Class[]{Exception.class}, Void.TYPE);
                            }
                        }

                        public final void a(final com.ss.android.ugc.aweme.setting.serverpush.a.c cVar) {
                            if (PatchProxy.isSupport(new Object[]{cVar}, this, f58199a, false, 54637, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{cVar}, this, f58199a, false, 54637, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE);
                                return;
                            }
                            dVar.a(new s.e() {
                                public final int a() {
                                    return cVar.q;
                                }

                                public final int b() {
                                    return cVar.r;
                                }

                                public final int c() {
                                    return cVar.n;
                                }

                                public final int d() {
                                    return cVar.o;
                                }

                                public final int e() {
                                    return cVar.p;
                                }
                            });
                        }
                    });
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(java.lang.Object... r18) {
                    /*
                        r17 = this;
                        r0 = r18
                        r1 = 1
                        java.lang.Object[] r2 = new java.lang.Object[r1]
                        r9 = 0
                        r2[r9] = r0
                        com.meituan.robust.ChangeQuickRedirect r4 = f58196a
                        java.lang.Class[] r7 = new java.lang.Class[r1]
                        java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
                        r7[r9] = r3
                        java.lang.Class r8 = java.lang.Void.TYPE
                        r5 = 0
                        r6 = 54636(0xd56c, float:7.6561E-41)
                        r3 = r17
                        boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                        if (r2 == 0) goto L_0x0036
                        java.lang.Object[] r10 = new java.lang.Object[r1]
                        r10[r9] = r0
                        com.meituan.robust.ChangeQuickRedirect r12 = f58196a
                        r13 = 0
                        r14 = 54636(0xd56c, float:7.6561E-41)
                        java.lang.Class[] r15 = new java.lang.Class[r1]
                        java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
                        r15[r9] = r0
                        java.lang.Class r16 = java.lang.Void.TYPE
                        r11 = r17
                        com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                        return
                    L_0x0036:
                        r1 = r17
                        com.ss.android.ugc.aweme.setting.serverpush.b.e r2 = r0
                        r2.a((java.lang.Object[]) r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.o.f.g.AnonymousClass1.a(java.lang.Object[]):void");
                }
            };
        }

        public final s.a c() {
            if (PatchProxy.isSupport(new Object[0], this, f58195a, false, 54633, new Class[0], s.a.class)) {
                return (s.a) PatchProxy.accessDispatch(new Object[0], this, f58195a, false, 54633, new Class[0], s.a.class);
            }
            final com.ss.android.ugc.aweme.setting.serverpush.b.d dVar = new com.ss.android.ugc.aweme.setting.serverpush.b.d();
            return new s.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58204a;

                public final void a(final s.b bVar) {
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f58204a, false, 54639, new Class[]{s.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f58204a, false, 54639, new Class[]{s.b.class}, Void.TYPE);
                        return;
                    }
                    dVar.a(new com.ss.android.ugc.aweme.setting.serverpush.b.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58207a;

                        public final void X_() {
                            if (PatchProxy.isSupport(new Object[0], this, f58207a, false, 54642, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f58207a, false, 54642, new Class[0], Void.TYPE);
                                return;
                            }
                            bVar.b();
                        }

                        public final void c() {
                            if (PatchProxy.isSupport(new Object[0], this, f58207a, false, 54641, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f58207a, false, 54641, new Class[0], Void.TYPE);
                                return;
                            }
                            bVar.a();
                        }
                    });
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(java.lang.Object... r18) {
                    /*
                        r17 = this;
                        r0 = r18
                        r1 = 1
                        java.lang.Object[] r2 = new java.lang.Object[r1]
                        r9 = 0
                        r2[r9] = r0
                        com.meituan.robust.ChangeQuickRedirect r4 = f58204a
                        java.lang.Class[] r7 = new java.lang.Class[r1]
                        java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
                        r7[r9] = r3
                        java.lang.Class r8 = java.lang.Void.TYPE
                        r5 = 0
                        r6 = 54640(0xd570, float:7.6567E-41)
                        r3 = r17
                        boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                        if (r2 == 0) goto L_0x0036
                        java.lang.Object[] r10 = new java.lang.Object[r1]
                        r10[r9] = r0
                        com.meituan.robust.ChangeQuickRedirect r12 = f58204a
                        r13 = 0
                        r14 = 54640(0xd570, float:7.6567E-41)
                        java.lang.Class[] r15 = new java.lang.Class[r1]
                        java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
                        r15[r9] = r0
                        java.lang.Class r16 = java.lang.Void.TYPE
                        r11 = r17
                        com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                        return
                    L_0x0036:
                        r1 = r17
                        com.ss.android.ugc.aweme.setting.serverpush.b.d r2 = r0
                        r2.a((java.lang.Object[]) r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.o.f.g.AnonymousClass2.a(java.lang.Object[]):void");
                }
            };
        }

        public final boolean d() {
            if (!PatchProxy.isSupport(new Object[0], this, f58195a, false, 54634, new Class[0], Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.common.k.a(GlobalContext.getContext());
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58195a, false, 54634, new Class[0], Boolean.TYPE)).booleanValue();
        }

        /* synthetic */ g(byte b2) {
            this();
        }
    }

    static class i implements com.ss.android.ugc.aweme.port.in.t {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58210a;

        private i() {
        }

        /* synthetic */ i(byte b2) {
            this();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|15|16|(1:18)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x009b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(long r21, java.lang.String r23) {
            /*
                r20 = this;
                r0 = r21
                r2 = r23
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Long r5 = new java.lang.Long
                r5.<init>(r0)
                r11 = 0
                r4[r11] = r5
                r12 = 1
                r4[r12] = r2
                com.meituan.robust.ChangeQuickRedirect r6 = f58210a
                java.lang.Class[] r9 = new java.lang.Class[r3]
                java.lang.Class r5 = java.lang.Long.TYPE
                r9[r11] = r5
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r9[r12] = r5
                java.lang.Class r10 = java.lang.Void.TYPE
                r7 = 0
                r8 = 54644(0xd574, float:7.6573E-41)
                r5 = r20
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x0052
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.Long r4 = new java.lang.Long
                r4.<init>(r0)
                r13[r11] = r4
                r13[r12] = r2
                com.meituan.robust.ChangeQuickRedirect r15 = f58210a
                r16 = 0
                r17 = 54644(0xd574, float:7.6573E-41)
                java.lang.Class[] r0 = new java.lang.Class[r3]
                java.lang.Class r1 = java.lang.Long.TYPE
                r0[r11] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r12] = r1
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r20
                r18 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                return
            L_0x0052:
                com.ss.android.ugc.aweme.challenge.data.c r3 = new com.ss.android.ugc.aweme.challenge.data.c
                java.lang.Long r0 = java.lang.Long.valueOf(r21)
                r3.<init>(r0, r2)
                java.lang.Object[] r4 = new java.lang.Object[r12]
                r4[r11] = r3
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.challenge.data.d.f35397a
                r7 = 1
                r8 = 25825(0x64e1, float:3.6189E-41)
                java.lang.Class[] r9 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.aweme.challenge.data.c> r0 = com.ss.android.ugc.aweme.challenge.data.c.class
                r9[r11] = r0
                java.lang.Class r10 = java.lang.Void.TYPE
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r0 == 0) goto L_0x0089
                java.lang.Object[] r4 = new java.lang.Object[r12]
                r4[r11] = r3
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.challenge.data.d.f35397a
                r7 = 1
                r8 = 25825(0x64e1, float:3.6189E-41)
                java.lang.Class[] r9 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.aweme.challenge.data.c> r0 = com.ss.android.ugc.aweme.challenge.data.c.class
                r9[r11] = r0
                java.lang.Class r10 = java.lang.Void.TYPE
                com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
                return
            L_0x0089:
                com.ss.android.e.c<com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase> r0 = com.ss.android.ugc.aweme.challenge.data.d.f35398b     // Catch:{ Exception -> 0x00ab }
                java.lang.Object r0 = r0.b()     // Catch:{ Exception -> 0x00ab }
                com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase r0 = (com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase) r0     // Catch:{ Exception -> 0x00ab }
                if (r0 == 0) goto L_0x00aa
                com.ss.android.ugc.aweme.challenge.data.a r0 = r0.a()     // Catch:{ Exception -> 0x00ab }
                r0.a((com.ss.android.ugc.aweme.challenge.data.c) r3)     // Catch:{ SQLiteConstraintException -> 0x009b }
                goto L_0x009e
            L_0x009b:
                r0.b(r3)     // Catch:{ Exception -> 0x00ab }
            L_0x009e:
                int r1 = r0.b()     // Catch:{ Exception -> 0x00ab }
                r2 = 20
                if (r1 <= r2) goto L_0x00aa
                int r1 = r1 - r2
                r0.a((int) r1)     // Catch:{ Exception -> 0x00ab }
            L_0x00aa:
                return
            L_0x00ab:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.o.f.i.a(long, java.lang.String):void");
        }
    }

    static class j implements u {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58211a;

        private j() {
        }

        public final boolean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f58211a, false, 54645, new Class[0], Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.im.b.c();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58211a, false, 54645, new Class[0], Boolean.TYPE)).booleanValue();
        }

        /* synthetic */ j(byte b2) {
            this();
        }
    }

    static class k implements v {

        /* renamed from: a  reason: collision with root package name */
        private final Map<v.a, h> f58212a;

        private k() {
            this.f58212a = new HashMap();
        }

        /* synthetic */ k(byte b2) {
            this();
        }
    }

    static class l implements com.ss.android.ugc.aweme.port.in.w {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58213a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<Class, Object> f58214b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<w.a, f.a> f58215c;

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58213a, false, 54662, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58213a, false, 54662, new Class[]{Integer.TYPE}, Void.TYPE);
            }
        }

        private l() {
            this.f58214b = new HashMap();
            this.f58215c = new HashMap();
            this.f58214b.put(x.class, new m((byte) 0));
            this.f58214b.put(v.class, new k((byte) 0));
        }

        public final Object b() {
            if (!PatchProxy.isSupport(new Object[0], this, f58213a, false, 54667, new Class[0], Object.class)) {
                return new com.ss.android.ugc.aweme.live.f();
            }
            return PatchProxy.accessDispatch(new Object[0], this, f58213a, false, 54667, new Class[0], Object.class);
        }

        public final boolean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f58213a, false, 54664, new Class[0], Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.story.live.c.a().c();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58213a, false, 54664, new Class[0], Boolean.TYPE)).booleanValue();
        }

        /* synthetic */ l(byte b2) {
            this();
        }

        public final void a(com.ss.android.ugc.aweme.filter.h hVar) {
            com.ss.android.ugc.aweme.filter.h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f58213a, false, 54668, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f58213a, false, 54668, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE);
                return;
            }
            bg.a(new com.ss.android.ugc.aweme.live.model.d(hVar2));
        }

        public final void b(@NotNull w.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f58213a, false, 54670, new Class[]{w.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f58213a, false, 54670, new Class[]{w.a.class}, Void.TYPE);
                return;
            }
            f.a aVar2 = this.f58215c.get(aVar);
            if (aVar2 != null) {
                this.f58215c.remove(aVar);
                com.ss.android.ugc.aweme.live.a.d().i().b(aVar2);
            }
        }

        public final void a(@NotNull w.a aVar) {
            w.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, f58213a, false, 54669, new Class[]{w.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, f58213a, false, 54669, new Class[]{w.a.class}, Void.TYPE);
                return;
            }
            f.a aVar3 = this.f58215c.get(aVar2);
            if (aVar3 == null) {
                aVar.getClass();
                if (PatchProxy.isSupport(new Object[]{aVar2}, null, n.f58299a, true, 54671, new Class[]{w.a.class}, f.a.class)) {
                    aVar3 = (f.a) PatchProxy.accessDispatch(new Object[]{aVar2}, null, n.f58299a, true, 54671, new Class[]{w.a.class}, f.a.class);
                } else {
                    aVar3 = new n(aVar2);
                }
                this.f58215c.put(aVar2, aVar3);
            }
            com.ss.android.ugc.aweme.live.a.d().i().a(aVar3);
        }

        public final void b(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58213a, false, 54665, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58213a, false, 54665, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.story.live.c a2 = com.ss.android.ugc.aweme.story.live.c.a();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, com.ss.android.ugc.aweme.story.live.c.f73121a, false, 84713, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                Object[] objArr = {Byte.valueOf(z)};
                Object[] objArr2 = objArr;
                com.ss.android.ugc.aweme.story.live.c cVar = a2;
                PatchProxy.accessDispatch(objArr2, cVar, com.ss.android.ugc.aweme.story.live.c.f73121a, false, 84713, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            bg.a(new com.ss.android.ugc.aweme.story.live.a(z));
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58213a, false, 54663, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58213a, false, 54663, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.story.live.c.a(z);
        }
    }

    static class m implements x {
        private m() {
        }

        /* synthetic */ m(byte b2) {
            this();
        }
    }

    static class n implements y {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58216a;

        private n() {
        }

        @NonNull
        public final String a() {
            if (!PatchProxy.isSupport(new Object[0], this, f58216a, false, 54676, new Class[0], String.class)) {
                return com.ss.android.ugc.aweme.feed.c.d();
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f58216a, false, 54676, new Class[0], String.class);
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f58216a, false, 54677, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58216a, false, 54677, new Class[0], Void.TYPE);
                return;
            }
            cg.b();
        }

        public final String c() {
            if (PatchProxy.isSupport(new Object[0], this, f58216a, false, 54678, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f58216a, false, 54678, new Class[0], String.class);
            }
            com.ss.android.ugc.aweme.main.h.s sVar = (com.ss.android.ugc.aweme.main.h.s) ServiceManager.get().getService(com.ss.android.ugc.aweme.main.h.s.class);
            if (sVar != null) {
                return sVar.a();
            }
            return "";
        }

        public final boolean d() {
            if (!PatchProxy.isSupport(new Object[0], this, f58216a, false, 54680, new Class[0], Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.poi.e.p.d();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58216a, false, 54680, new Class[0], Boolean.TYPE)).booleanValue();
        }

        /* synthetic */ n(byte b2) {
            this();
        }

        @Nullable
        public final com.ss.android.ugc.aweme.s.a.a a(@NonNull Context context) {
            if (!PatchProxy.isSupport(new Object[]{context}, this, f58216a, false, 54675, new Class[]{Context.class}, com.ss.android.ugc.aweme.s.a.a.class)) {
                return new com.ss.android.ugc.aweme.shortvideo.o.b().apply(af.a(context).f());
            }
            return (com.ss.android.ugc.aweme.s.a.a) PatchProxy.accessDispatch(new Object[]{context}, this, f58216a, false, 54675, new Class[]{Context.class}, com.ss.android.ugc.aweme.s.a.a.class);
        }

        public final void b(@NonNull Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, f58216a, false, 54679, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, f58216a, false, 54679, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            af.a(context).d();
        }

        public final void a(Context context, y.a aVar) {
            Context context2 = context;
            y.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{context2, aVar2}, this, f58216a, false, 54681, new Class[]{Context.class, y.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aVar2}, this, f58216a, false, 54681, new Class[]{Context.class, y.a.class}, Void.TYPE);
            } else if (context2 != null) {
                com.ss.android.ugc.aweme.poi.a f2 = af.a(context.getApplicationContext()).f();
                if (f2 == null || !f2.isValid()) {
                    af.a(context.getApplicationContext()).a((com.ss.android.ugc.aweme.app.d.f) new o(context2, aVar2));
                } else {
                    aVar2.a(f2.latitude, f2.longitude);
                }
            }
        }

        public final void a(Context context, y.b bVar) {
            Context context2 = context;
            final y.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{context2, bVar2}, this, f58216a, false, 54682, new Class[]{Context.class, y.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, bVar2}, this, f58216a, false, 54682, new Class[]{Context.class, y.b.class}, Void.TYPE);
            } else if (!com.ss.android.ugc.aweme.utils.permission.a.a(context2, af.f2626c)) {
                com.ss.android.ugc.aweme.utils.permission.a.b((Activity) context2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, af.f2626c, new a.C0792a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58217a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f58217a, false, 54684, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f58217a, false, 54684, new Class[0], Void.TYPE);
                            return;
                        }
                        if (bVar2 != null) {
                            bVar2.a();
                        }
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f58217a, false, 54685, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f58217a, false, 54685, new Class[0], Void.TYPE);
                            return;
                        }
                        if (bVar2 != null) {
                            bVar2.b();
                        }
                    }
                });
            } else {
                bVar.a();
            }
        }
    }

    static class o implements ae {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58220a;

        private o() {
        }

        /* synthetic */ o(byte b2) {
            this();
        }

        public final String a(String str) {
            if (!PatchProxy.isSupport(new Object[]{str}, this, f58220a, false, 54688, new Class[]{String.class}, String.class)) {
                return PoiContext.serializeForDraft(str);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f58220a, false, 54688, new Class[]{String.class}, String.class);
        }

        public final String a(PoiStruct poiStruct) {
            if (PatchProxy.isSupport(new Object[]{poiStruct}, this, f58220a, false, 54691, new Class[]{PoiStruct.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{poiStruct}, this, f58220a, false, 54691, new Class[]{PoiStruct.class}, String.class);
            }
            PoiContext poiContext = new PoiContext();
            poiContext.mSelectPoiId = poiStruct.getPoiId();
            poiContext.mSelectPoiName = poiStruct.getPoiName();
            return com.ss.android.ugc.aweme.app.api.m.d().toJson((Object) poiContext);
        }

        public final PoiStruct b(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f58220a, false, 54690, new Class[]{String.class}, PoiStruct.class)) {
                return (PoiStruct) PatchProxy.accessDispatch(new Object[]{str}, this, f58220a, false, 54690, new Class[]{String.class}, PoiStruct.class);
            }
            PoiContext unserializeFromJson = PoiContext.unserializeFromJson(str);
            if (unserializeFromJson == null) {
                return null;
            }
            com.ss.android.ugc.aweme.poi.model.PoiStruct poiStruct = new com.ss.android.ugc.aweme.poi.model.PoiStruct();
            poiStruct.poiId = unserializeFromJson.mSelectPoiId;
            poiStruct.poiName = unserializeFromJson.mSelectPoiName;
            return poiStruct.toStickerPoiStruct();
        }

        public final void a(FragmentActivity fragmentActivity, ae.b bVar) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            ae.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2, bVar2}, this, f58220a, false, 54689, new Class[]{FragmentActivity.class, ae.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentActivity2, bVar2}, this, f58220a, false, 54689, new Class[]{FragmentActivity.class, ae.b.class}, Void.TYPE);
                return;
            }
            POISearchDialog pOISearchDialog = new POISearchDialog(fragmentActivity2, Bundle.EMPTY);
            pOISearchDialog.setOwnerActivity(fragmentActivity2);
            pOISearchDialog.f3744b = new p(bVar2, pOISearchDialog);
            pOISearchDialog.show();
        }

        public final void a(ae.a aVar, FragmentActivity fragmentActivity, boolean z) {
            final ae.a aVar2 = aVar;
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{aVar2, fragmentActivity2, (byte) 0}, this, f58220a, false, 54687, new Class[]{ae.a.class, FragmentActivity.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2, fragmentActivity2, (byte) 0}, this, f58220a, false, 54687, new Class[]{ae.a.class, FragmentActivity.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.a.a.a().a((IPOIService.a) new IPOIService.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58224a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f58224a, false, 54695, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58224a, false, 54695, new Class[0], Void.TYPE);
                        return;
                    }
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f58224a, false, 54696, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58224a, false, 54696, new Class[0], Void.TYPE);
                        return;
                    }
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                }

                public final void a(IPOIService.c cVar, @Nullable com.ss.android.ugc.aweme.poi.model.PoiStruct poiStruct, String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{cVar, poiStruct, str2}, this, f58224a, false, 54694, new Class[]{IPOIService.c.class, com.ss.android.ugc.aweme.poi.model.PoiStruct.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar, poiStruct, str2}, this, f58224a, false, 54694, new Class[]{IPOIService.c.class, com.ss.android.ugc.aweme.poi.model.PoiStruct.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (aVar2 != null) {
                        aVar2.a(poiStruct.toStickerPoiStruct(), str2);
                    }
                }
            }).a(fragmentActivity2);
        }

        public final void a(ae.b bVar, FragmentActivity fragmentActivity, boolean z) {
            final ae.b bVar2 = bVar;
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{bVar2, fragmentActivity2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f58220a, false, 54686, new Class[]{ae.b.class, FragmentActivity.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2, fragmentActivity2, Byte.valueOf(z)}, this, f58220a, false, 54686, new Class[]{ae.b.class, FragmentActivity.class, Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.a.a.a().a((IPOIService.a) null);
            } else if (bVar2 == null) {
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.a.a.a().a((Activity) fragmentActivity2);
            } else {
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.a.a.a().a((IPOIService.a) new IPOIService.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58221a;

                    public final void a() {
                    }

                    public final void b() {
                    }

                    public final void a(IPOIService.c cVar, @Nullable com.ss.android.ugc.aweme.poi.model.PoiStruct poiStruct, String str) {
                        String str2 = str;
                        if (PatchProxy.isSupport(new Object[]{cVar, poiStruct, str2}, this, f58221a, false, 54693, new Class[]{IPOIService.c.class, com.ss.android.ugc.aweme.poi.model.PoiStruct.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar, poiStruct, str2}, this, f58221a, false, 54693, new Class[]{IPOIService.c.class, com.ss.android.ugc.aweme.poi.model.PoiStruct.class, String.class}, Void.TYPE);
                            return;
                        }
                        if (bVar2 != null) {
                            bVar2.a(poiStruct.toStickerPoiStruct(), str2);
                        }
                    }
                }).a(fragmentActivity2);
            }
        }
    }

    static class p implements ag {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58227a;

        private p() {
        }

        /* synthetic */ p(byte b2) {
            this();
        }

        public final ag.b a(Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f58227a, false, 54697, new Class[]{Context.class}, ag.b.class)) {
                return (ag.b) PatchProxy.accessDispatch(new Object[]{context2}, this, f58227a, false, 54697, new Class[]{Context.class}, ag.b.class);
            }
            final com.ss.android.ugc.aweme.story.shootvideo.setting.j jVar = new com.ss.android.ugc.aweme.story.shootvideo.setting.j(context2);
            return new ag.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58228a;

                public final View a() {
                    return jVar;
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f58228a, false, 54701, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58228a, false, 54701, new Class[0], Void.TYPE);
                        return;
                    }
                    jVar.a();
                }

                public final void c() {
                    if (PatchProxy.isSupport(new Object[0], this, f58228a, false, 54702, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58228a, false, 54702, new Class[0], Void.TYPE);
                        return;
                    }
                    jVar.b();
                }

                public final void a(final ag.a aVar) {
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f58228a, false, 54704, new Class[]{ag.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f58228a, false, 54704, new Class[]{ag.a.class}, Void.TYPE);
                        return;
                    }
                    jVar.setStorySettingLayoutItemClick(new j.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58231a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f58231a, false, 54706, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f58231a, false, 54706, new Class[0], Void.TYPE);
                                return;
                            }
                            aVar.a();
                        }

                        public final void a(int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58231a, false, 54705, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58231a, false, 54705, new Class[]{Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            aVar.a(i);
                        }
                    });
                }

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58228a, false, 54703, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58228a, false, 54703, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    jVar.a(i);
                }

                public final void b(String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2}, this, f58228a, false, 54700, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2}, this, f58228a, false, 54700, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    jVar.setTipStr(str2);
                }

                public final void a(String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2}, this, f58228a, false, 54699, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2}, this, f58228a, false, 54699, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    jVar.setTitle(str2);
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58228a, false, 54698, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58228a, false, 54698, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    jVar.setViewPage(z);
                }
            };
        }
    }

    static class q implements ah {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58234a;

        public final String d() {
            return "guide";
        }

        private q() {
        }

        public final ah.a<Boolean> a() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54707, new Class[0], ah.a.class)) {
                return new ah.a<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58235a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58235a, false, 54741, new Class[0], Boolean.class)) {
                            return (Boolean) SharePrefCache.inst().getIsAwemePrivate().c();
                        }
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f58235a, false, 54741, new Class[0], Boolean.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f58235a, false, 54742, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f58235a, false, 54742, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getIsAwemePrivate().a(bool);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54707, new Class[0], ah.a.class);
        }

        public final ah.a<Boolean> b() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54708, new Class[0], ah.a.class)) {
                return new ah.a<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58241a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58241a, false, 54763, new Class[0], Boolean.class)) {
                            return (Boolean) SharePrefCache.inst().getAutoSaveVideo().c();
                        }
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f58241a, false, 54763, new Class[0], Boolean.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f58241a, false, 54764, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f58241a, false, 54764, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getAutoSaveVideo().a(bool);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54708, new Class[0], ah.a.class);
        }

        public final ah.a<Boolean> c() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54709, new Class[0], ah.a.class)) {
                return new ah.a<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58263a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58263a, false, 54783, new Class[0], Boolean.class)) {
                            return (Boolean) com.ss.android.ugc.aweme.app.x.a().ab().c();
                        }
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f58263a, false, 54783, new Class[0], Boolean.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f58263a, false, 54784, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f58263a, false, 54784, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.app.x.a().ab().a(bool);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54709, new Class[0], ah.a.class);
        }

        public final ah.a<Integer> e() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54715, new Class[0], ah.a.class)) {
                return new ah.a<Integer>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58265a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58265a, false, 54791, new Class[0], Integer.class)) {
                            return (Integer) SharePrefCache.inst().getFlashStatus().c();
                        }
                        return (Integer) PatchProxy.accessDispatch(new Object[0], this, f58265a, false, 54791, new Class[0], Integer.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Integer num = (Integer) obj;
                        if (PatchProxy.isSupport(new Object[]{num}, this, f58265a, false, 54792, new Class[]{Integer.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{num}, this, f58265a, false, 54792, new Class[]{Integer.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getFlashStatus().a(num);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54715, new Class[0], ah.a.class);
        }

        public final ah.a<Integer> f() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54720, new Class[0], ah.a.class)) {
                return new ah.a<Integer>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58267a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58267a, false, 54793, new Class[0], Integer.class)) {
                            return (Integer) SharePrefCache.inst().getStoryInfoStickerMaxCount().c();
                        }
                        return (Integer) PatchProxy.accessDispatch(new Object[0], this, f58267a, false, 54793, new Class[0], Integer.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Integer num = (Integer) obj;
                        if (PatchProxy.isSupport(new Object[]{num}, this, f58267a, false, 54794, new Class[]{Integer.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{num}, this, f58267a, false, 54794, new Class[]{Integer.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryInfoStickerMaxCount().a(num);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54720, new Class[0], ah.a.class);
        }

        public final ah.a<Boolean> g() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54721, new Class[0], ah.a.class)) {
                return new ah.a<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58269a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58269a, false, 54795, new Class[0], Boolean.class)) {
                            return (Boolean) SharePrefCache.inst().getStoryRecordGuideShow().c();
                        }
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f58269a, false, 54795, new Class[0], Boolean.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f58269a, false, 54796, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f58269a, false, 54796, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryRecordGuideShow().a(bool);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54721, new Class[0], ah.a.class);
        }

        public final ah.a<Boolean> h() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54722, new Class[0], ah.a.class)) {
                return new ah.a<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58257a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58257a, false, 54743, new Class[0], Boolean.class)) {
                            return (Boolean) SharePrefCache.inst().getStoryPublishFriendsBanner().c();
                        }
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f58257a, false, 54743, new Class[0], Boolean.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f58257a, false, 54744, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f58257a, false, 54744, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryPublishFriendsBanner().a(bool);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54722, new Class[0], ah.a.class);
        }

        public final ah.a<Integer> i() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54723, new Class[0], ah.a.class)) {
                return new ah.a<Integer>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58271a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58271a, false, 54745, new Class[0], Integer.class)) {
                            return (Integer) SharePrefCache.inst().getStorySettingViewPermission().c();
                        }
                        return (Integer) PatchProxy.accessDispatch(new Object[0], this, f58271a, false, 54745, new Class[0], Integer.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Integer num = (Integer) obj;
                        if (PatchProxy.isSupport(new Object[]{num}, this, f58271a, false, 54746, new Class[]{Integer.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{num}, this, f58271a, false, 54746, new Class[]{Integer.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStorySettingViewPermission().a(num);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54723, new Class[0], ah.a.class);
        }

        public final ah.a<Integer> j() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54724, new Class[0], ah.a.class)) {
                return new ah.a<Integer>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58273a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58273a, false, 54747, new Class[0], Integer.class)) {
                            return (Integer) SharePrefCache.inst().getStorySettingReplyPermission().c();
                        }
                        return (Integer) PatchProxy.accessDispatch(new Object[0], this, f58273a, false, 54747, new Class[0], Integer.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Integer num = (Integer) obj;
                        if (PatchProxy.isSupport(new Object[]{num}, this, f58273a, false, 54748, new Class[]{Integer.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{num}, this, f58273a, false, 54748, new Class[]{Integer.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStorySettingReplyPermission().a(num);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54724, new Class[0], ah.a.class);
        }

        public final ah.a<Boolean> k() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54725, new Class[0], ah.a.class)) {
                return new ah.a<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58275a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58275a, false, 54749, new Class[0], Boolean.class)) {
                            return (Boolean) SharePrefCache.inst().getStorySettingSyncDuoshan().c();
                        }
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f58275a, false, 54749, new Class[0], Boolean.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f58275a, false, 54750, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f58275a, false, 54750, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStorySettingSyncDuoshan().a(bool);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54725, new Class[0], ah.a.class);
        }

        public final ah.a<Boolean> l() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54726, new Class[0], ah.a.class)) {
                return new ah.a<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58277a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58277a, false, 54751, new Class[0], Boolean.class)) {
                            return (Boolean) SharePrefCache.inst().getStorySettingDoudouPhoto().c();
                        }
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f58277a, false, 54751, new Class[0], Boolean.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f58277a, false, 54752, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f58277a, false, 54752, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStorySettingDoudouPhoto().a(bool);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54726, new Class[0], ah.a.class);
        }

        public final ah.a<Integer> m() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54727, new Class[0], ah.a.class)) {
                return new ah.a<Integer>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58279a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58279a, false, 54753, new Class[0], Integer.class)) {
                            return (Integer) SharePrefCache.inst().getStorySettingSyncToast().c();
                        }
                        return (Integer) PatchProxy.accessDispatch(new Object[0], this, f58279a, false, 54753, new Class[0], Integer.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Integer num = (Integer) obj;
                        if (PatchProxy.isSupport(new Object[]{num}, this, f58279a, false, 54754, new Class[]{Integer.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{num}, this, f58279a, false, 54754, new Class[]{Integer.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStorySettingSyncToast().a(num);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54727, new Class[0], ah.a.class);
        }

        public final ah.a<Boolean> n() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54728, new Class[0], ah.a.class)) {
                return new ah.a<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58281a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58281a, false, 54755, new Class[0], Boolean.class)) {
                            return (Boolean) SharePrefCache.inst().getStorySettingManualOpenDoudou().c();
                        }
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f58281a, false, 54755, new Class[0], Boolean.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f58281a, false, 54756, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f58281a, false, 54756, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStorySettingManualOpenDoudou().a(bool);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54728, new Class[0], ah.a.class);
        }

        public final ah.a<String> o() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54729, new Class[0], ah.a.class)) {
                return new ah.a<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58283a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58283a, false, 54757, new Class[0], String.class)) {
                            return (String) SharePrefCache.inst().getStoryRegisterPublishSyncHintTitle().c();
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f58283a, false, 54757, new Class[0], String.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f58283a, false, 54758, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f58283a, false, 54758, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryRegisterPublishSyncHintTitle().a(str);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54729, new Class[0], ah.a.class);
        }

        public final ah.a<String> p() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54730, new Class[0], ah.a.class)) {
                return new ah.a<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58237a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58237a, false, 54759, new Class[0], String.class)) {
                            return (String) SharePrefCache.inst().getStoryRegisterPublishSyncHintContent().c();
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f58237a, false, 54759, new Class[0], String.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f58237a, false, 54760, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f58237a, false, 54760, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryRegisterPublishSyncHintContent().a(str);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54730, new Class[0], ah.a.class);
        }

        public final ah.a<String> q() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54731, new Class[0], ah.a.class)) {
                return new ah.a<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58239a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58239a, false, 54761, new Class[0], String.class)) {
                            return (String) SharePrefCache.inst().getStoryRegisterPublishSyncHintH5Str().c();
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f58239a, false, 54761, new Class[0], String.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f58239a, false, 54762, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f58239a, false, 54762, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryRegisterPublishSyncHintH5Str().a(str);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54731, new Class[0], ah.a.class);
        }

        public final ah.a<String> r() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54732, new Class[0], ah.a.class)) {
                return new ah.a<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58243a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58243a, false, 54765, new Class[0], String.class)) {
                            return (String) SharePrefCache.inst().getStoryRegisterPublishSyncHintH5Url().c();
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f58243a, false, 54765, new Class[0], String.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f58243a, false, 54766, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f58243a, false, 54766, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryRegisterPublishSyncHintH5Url().a(str);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54732, new Class[0], ah.a.class);
        }

        public final ah.a<String> s() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54733, new Class[0], ah.a.class)) {
                return new ah.a<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58245a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58245a, false, 54767, new Class[0], String.class)) {
                            return (String) SharePrefCache.inst().getStoryUnRegisterPublishSyncHintTitle().c();
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f58245a, false, 54767, new Class[0], String.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f58245a, false, 54768, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f58245a, false, 54768, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryUnRegisterPublishSyncHintTitle().a(str);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54733, new Class[0], ah.a.class);
        }

        public final ah.a<String> t() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54734, new Class[0], ah.a.class)) {
                return new ah.a<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58247a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58247a, false, 54769, new Class[0], String.class)) {
                            return (String) SharePrefCache.inst().getStoryUnRegisterPublishSyncHintContent().c();
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f58247a, false, 54769, new Class[0], String.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f58247a, false, 54770, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f58247a, false, 54770, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryUnRegisterPublishSyncHintContent().a(str);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54734, new Class[0], ah.a.class);
        }

        public final ah.a<String> u() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54735, new Class[0], ah.a.class)) {
                return new ah.a<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58249a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58249a, false, 54771, new Class[0], String.class)) {
                            return (String) SharePrefCache.inst().getStoryUnRegisterPublishSyncHintH5Str().c();
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f58249a, false, 54771, new Class[0], String.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f58249a, false, 54772, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f58249a, false, 54772, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryUnRegisterPublishSyncHintH5Str().a(str);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54735, new Class[0], ah.a.class);
        }

        public final ah.a<String> v() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54736, new Class[0], ah.a.class)) {
                return new ah.a<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58251a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58251a, false, 54773, new Class[0], String.class)) {
                            return (String) SharePrefCache.inst().getStoryUnRegisterPublishSyncHintH5Url().c();
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f58251a, false, 54773, new Class[0], String.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f58251a, false, 54774, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f58251a, false, 54774, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryUnRegisterPublishSyncHintH5Url().a(str);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54736, new Class[0], ah.a.class);
        }

        public final ah.a<Boolean> w() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54737, new Class[0], ah.a.class)) {
                return new ah.a<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58253a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58253a, false, 54775, new Class[0], Boolean.class)) {
                            return (Boolean) SharePrefCache.inst().getStoryPublishSaveLocal().c();
                        }
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f58253a, false, 54775, new Class[0], Boolean.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f58253a, false, 54776, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f58253a, false, 54776, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryPublishSaveLocal().a(bool);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54737, new Class[0], ah.a.class);
        }

        public final ah.a<Integer> x() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54738, new Class[0], ah.a.class)) {
                return new ah.a<Integer>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58255a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58255a, false, 54777, new Class[0], Integer.class)) {
                            return (Integer) SharePrefCache.inst().getCanIm().c();
                        }
                        return (Integer) PatchProxy.accessDispatch(new Object[0], this, f58255a, false, 54777, new Class[0], Integer.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Integer num = (Integer) obj;
                        if (PatchProxy.isSupport(new Object[]{num}, this, f58255a, false, 54778, new Class[]{Integer.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{num}, this, f58255a, false, 54778, new Class[]{Integer.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getCanIm().a(num);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54738, new Class[0], ah.a.class);
        }

        public final ah.a<String> y() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54739, new Class[0], ah.a.class)) {
                return new ah.a<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58259a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58259a, false, 54779, new Class[0], String.class)) {
                            return (String) SharePrefCache.inst().getStoryFontType().c();
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f58259a, false, 54779, new Class[0], String.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f58259a, false, 54780, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f58259a, false, 54780, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryFontType().a(str);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54739, new Class[0], ah.a.class);
        }

        public final ah.a<Integer> z() {
            if (!PatchProxy.isSupport(new Object[0], this, f58234a, false, 54740, new Class[0], ah.a.class)) {
                return new ah.a<Integer>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58261a;

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f58261a, false, 54781, new Class[0], Integer.class)) {
                            return (Integer) SharePrefCache.inst().getStoryTextStickerMaxCount().c();
                        }
                        return (Integer) PatchProxy.accessDispatch(new Object[0], this, f58261a, false, 54781, new Class[0], Integer.class);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        Integer num = (Integer) obj;
                        if (PatchProxy.isSupport(new Object[]{num}, this, f58261a, false, 54782, new Class[]{Integer.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{num}, this, f58261a, false, 54782, new Class[]{Integer.class}, Void.TYPE);
                            return;
                        }
                        SharePrefCache.inst().getStoryTextStickerMaxCount().a(num);
                    }
                };
            }
            return (ah.a) PatchProxy.accessDispatch(new Object[0], this, f58234a, false, 54740, new Class[0], ah.a.class);
        }

        /* synthetic */ q(byte b2) {
            this();
        }

        public final int a(String str, int i) {
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{str2, 0}, this, f58234a, false, 54710, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
                return com.ss.android.ugc.aweme.base.sharedpref.e.a().a(str2, 0);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, 0}, this, f58234a, false, 54710, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }

        public final void b(String str, int i) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f58234a, false, 54711, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f58234a, false, 54711, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.base.sharedpref.e.a().b(str2, i);
        }

        public final String a(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (!PatchProxy.isSupport(new Object[]{str3, str4}, this, f58234a, false, 54718, new Class[]{String.class, String.class}, String.class)) {
                return com.ss.android.ugc.aweme.base.sharedpref.e.a().a(str3, str4);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f58234a, false, 54718, new Class[]{String.class, String.class}, String.class);
        }

        public final void b(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f58234a, false, 54719, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f58234a, false, 54719, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.base.sharedpref.e.a().b(str3, str4);
        }

        public final boolean a(String str, boolean z) {
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{str2, (byte) 1}, this, f58234a, false, 54716, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.base.sharedpref.e.a().a(str2, true);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, (byte) 1}, this, f58234a, false, 54716, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }

        public final void b(String str, boolean z) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, (byte) 0}, this, f58234a, false, 54717, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, (byte) 0}, this, f58234a, false, 54717, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.base.sharedpref.e.a().b(str2, false);
        }
    }

    static class r implements al {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58285a;

        private r() {
        }

        /* synthetic */ r(byte b2) {
            this();
        }

        @Nullable
        public final User a(@Nullable Intent intent) {
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{intent2}, this, f58285a, false, 54800, new Class[]{Intent.class}, User.class)) {
                return (User) PatchProxy.accessDispatch(new Object[]{intent2}, this, f58285a, false, 54800, new Class[]{Intent.class}, User.class);
            } else if (intent2 != null) {
                return (User) intent2.getSerializableExtra("extra_data");
            } else {
                return null;
            }
        }

        public final void a(@NonNull Fragment fragment, int i) {
            Fragment fragment2 = fragment;
            if (PatchProxy.isSupport(new Object[]{fragment2, 3}, this, f58285a, false, 54799, new Class[]{Fragment.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragment2, 3}, this, f58285a, false, 54799, new Class[]{Fragment.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            SummonFriendActivity.a(fragment2, 3, "", 0);
        }

        public final void a(Fragment fragment, int i, String str, int i2) {
            Fragment fragment2 = fragment;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{fragment2, 3, str2, Integer.valueOf(i2)}, this, f58285a, false, 54801, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragment2, 3, str2, Integer.valueOf(i2)}, this, f58285a, false, 54801, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            SummonFriendActivity.a(fragment2, 3, str2, i2);
        }
    }

    static class s implements am {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58286a;

        private s() {
        }

        /* synthetic */ s(byte b2) {
            this();
        }

        public final am.a a(Context context) {
            final aw awVar;
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f58286a, false, 54802, new Class[]{Context.class}, am.a.class)) {
                return (am.a) PatchProxy.accessDispatch(new Object[]{context2}, this, f58286a, false, 54802, new Class[]{Context.class}, am.a.class);
            }
            av avVar = new av();
            if (PatchProxy.isSupport(new Object[]{context2}, avVar, av.f64682a, false, 73078, new Class[]{Context.class}, aw.class)) {
                Object[] objArr = {context2};
                av avVar2 = avVar;
                awVar = (aw) PatchProxy.accessDispatch(objArr, avVar2, av.f64682a, false, 73078, new Class[]{Context.class}, aw.class);
            } else {
                awVar = new bs(context2);
            }
            return new am.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58287a;

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58287a, false, 54805, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58287a, false, 54805, new Class[]{Integer.TYPE}, Void.TYPE);
                    }
                }

                public final void a(int i, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{1, (byte) 0}, this, f58287a, false, 54808, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{1, (byte) 0}, this, f58287a, false, 54808, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    }
                }

                public final View d() {
                    return awVar;
                }

                public final void a(String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2}, this, f58287a, false, 54809, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2}, this, f58287a, false, 54809, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    awVar.setSyncShareViewTitle(str2);
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58287a, false, 54813, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58287a, false, 54813, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    awVar.setSaveLocalEnabled(z);
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f58287a, false, 54803, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58287a, false, 54803, new Class[0], Void.TYPE);
                        return;
                    }
                    awVar.a();
                }

                public final String b() {
                    if (!PatchProxy.isSupport(new Object[0], this, f58287a, false, 54806, new Class[0], String.class)) {
                        return awVar.b();
                    }
                    return (String) PatchProxy.accessDispatch(new Object[0], this, f58287a, false, 54806, new Class[0], String.class);
                }

                public final int c() {
                    if (!PatchProxy.isSupport(new Object[0], this, f58287a, false, 54807, new Class[0], Integer.TYPE)) {
                        return awVar.getSaveUploadType();
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58287a, false, 54807, new Class[0], Integer.TYPE)).intValue();
                }

                public final void a(Fragment fragment) {
                    awVar.f3870a = fragment;
                }

                public final void a(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(15.0f)}, this, f58287a, false, 54810, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(15.0f)}, this, f58287a, false, 54810, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    awVar.setSyncShareViewTextSize(15.0f);
                }

                public final void b(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58287a, false, 54811, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58287a, false, 54811, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    awVar.setSyncShareViewTextColor(i);
                }

                public final void c(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58287a, false, 54812, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58287a, false, 54812, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    awVar.setSyncIconSize(i);
                }

                public final void a(int i, am.b bVar) {
                    am.b bVar2 = bVar;
                    if (PatchProxy.isSupport(new Object[]{1, bVar2}, this, f58287a, false, 54814, new Class[]{Integer.TYPE, am.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{1, bVar2}, this, f58287a, false, 54814, new Class[]{Integer.TYPE, am.b.class}, Void.TYPE);
                        return;
                    }
                    bVar.getClass();
                    if (PatchProxy.isSupport(new Object[]{bVar2}, null, q.f58307a, true, 54816, new Class[]{am.b.class}, CanCancelRadioButton.a.class)) {
                        CanCancelRadioButton.a aVar = (CanCancelRadioButton.a) PatchProxy.accessDispatch(new Object[]{bVar2}, null, q.f58307a, true, 54816, new Class[]{am.b.class}, CanCancelRadioButton.a.class);
                    } else {
                        new q(bVar2);
                    }
                }

                public final void a(int i, int i2, Intent intent) {
                    Intent intent2 = intent;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f58287a, false, 54804, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f58287a, false, 54804, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
                        return;
                    }
                    awVar.a(i, i2, intent2);
                }
            };
        }
    }

    static class t implements an {
        private t() {
        }

        /* synthetic */ t(byte b2) {
            this();
        }
    }
}
