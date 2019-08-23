package com.ss.android.ugc.aweme.detail.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ae.c;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.ss.android.ugc.aweme.base.activity.a;
import com.ss.android.ugc.aweme.base.activity.f;
import com.ss.android.ugc.aweme.commercialize.utils.ak;
import com.ss.android.ugc.aweme.feed.g.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.main.base.d;
import com.ss.android.ugc.aweme.main.bu;
import com.ss.android.ugc.aweme.main.e;
import com.ss.android.ugc.aweme.utils.ee;
import com.ss.android.ugc.aweme.video.j;
import com.ss.android.ugc.aweme.video.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@AddPageTrace
public class DetailActivity extends AmeSlideSSActivity implements d.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f41332b = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f41333e = true;

    /* renamed from: c  reason: collision with root package name */
    protected DetailFragment f41334c;

    /* renamed from: d  reason: collision with root package name */
    protected List<a> f41335d;

    /* renamed from: f  reason: collision with root package name */
    Aweme f41336f;
    protected int g;
    private String h;

    public final boolean b() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41332b, false, 35053, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41332b, false, 35053, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @SuppressLint({"TooManyMethodParam"})
    public static void a(Context context, String str, String str2, String str3, String str4, int i, int i2, String str5, View view) {
        Context context2 = context;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{context2, str6, str7, str8, str9, Integer.valueOf(i), Integer.valueOf(i2), str10, view2}, null, f41332b, true, 35032, new Class[]{Context.class, String.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str6, str7, str8, str9, Integer.valueOf(i), Integer.valueOf(i2), str10, view2}, null, f41332b, true, 35032, new Class[]{Context.class, String.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, View.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, DetailActivity.class);
        intent.putExtra("search_keyword", str6);
        intent.putExtra("id", str7);
        intent.putExtra("refer", str8);
        intent.putExtra("video_from", str9);
        intent.putExtra("profile_enterprise_type", i);
        intent.putExtra("page_type", i2);
        if (str10 != null) {
            intent.putExtra("userid", str10);
        }
        a(context2, intent, view2);
    }

    public void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f41332b, false, 35042, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f41332b, false, 35042, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.g = getIntent().getIntExtra("page_type", -1);
        this.h = getIntent().getStringExtra("from_micro_app");
        b a2 = com.ss.android.ugc.aweme.feed.param.a.a(this);
        if (TextUtils.isEmpty(a2.getAid()) && TextUtils.isEmpty(a2.getIds()) && TextUtils.isEmpty(a2.getPushParams()) && !a2.isHotSpot()) {
            finish();
        } else if (!com.ss.android.g.a.a() || !"undefined".equalsIgnoreCase(a2.getAid())) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            this.f41334c = (DetailFragment) supportFragmentManager.findFragmentByTag("detailFragment");
            if (this.f41334c == null) {
                this.f41334c = a(a2);
            }
            this.f41334c.setUserVisibleHint(true);
            if (bundle == null) {
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                ak.a(getParent(), (Fragment) this.f41334c);
                beginTransaction.replace(C0906R.id.aic, this.f41334c, "detailFragment");
                beginTransaction.commit();
            }
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                String stringExtra = getIntent().getStringExtra("invitation_code");
                String stringExtra2 = getIntent().getStringExtra("invitor");
                jSONObject.put("id", a2.getAid());
                jSONObject.put("refer", a2.getEventType());
                jSONObject.put("ids", a2.getIds());
                jSONObject.put("userid", a2.getUid());
                jSONObject.put("video_from", a2.getFrom());
                jSONObject.put("page_type", this.g);
                jSONObject.put("music_id", a2.getMusicId());
                jSONObject.put("sticker_id", a2.getStickerId());
                jSONObject.put("challenge_id", a2.getChallengeId());
                jSONObject.put("invitation_code", stringExtra);
                jSONObject.put("invitor", stringExtra2);
                jSONObject.put("video_type", a2.getVideoType());
                jSONObject.put("push_params", a2.getPushParams());
            } catch (JSONException unused) {
            }
            n.a("aweme_detail_aid_undefined", jSONObject);
            finish();
        }
    }

    public DetailFragment a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f41332b, false, 35043, new Class[]{b.class}, DetailFragment.class)) {
            return (DetailFragment) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f41332b, false, 35043, new Class[]{b.class}, DetailFragment.class);
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, DetailFragment.f3004a, true, 35057, new Class[]{b.class}, DetailFragment.class)) {
            return (DetailFragment) PatchProxy.accessDispatch(new Object[]{bVar2}, null, DetailFragment.f3004a, true, 35057, new Class[]{b.class}, DetailFragment.class);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("feed_param", bVar2);
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    public final void a(@NonNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f41332b, false, 35050, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f41332b, false, 35050, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f41335d == null) {
            this.f41335d = new ArrayList();
        }
        if (!this.f41335d.contains(aVar)) {
            this.f41335d.add(aVar);
        }
    }

    public e getHelper() {
        return this.f41334c.f3006c;
    }

    public final boolean ad_() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f41332b, false, 35035, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41332b, false, 35035, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!j.b()) {
            z = true;
        }
        return z;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f41332b, false, 35037, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41332b, false, 35037, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", true);
        super.onResume();
        ee.a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f41332b, false, 35038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41332b, false, 35038, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public final boolean c() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f41332b, false, 35046, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41332b, false, 35046, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f41334c == null) {
            return false;
        } else {
            DetailFragment detailFragment = this.f41334c;
            if (PatchProxy.isSupport(new Object[0], detailFragment, DetailFragment.f3004a, false, 35085, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], detailFragment, DetailFragment.f3004a, false, 35085, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (detailFragment.f3006c != null) {
                bu buVar = detailFragment.f3006c;
                if (!PatchProxy.isSupport(new Object[0], buVar, bu.f54648a, false, 57668, new Class[0], Boolean.TYPE)) {
                    return TextUtils.equals("page_home", buVar.b());
                }
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], buVar, bu.f54648a, false, 57668, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = true;
            }
            return z;
        }
    }

    public void onBackPressed() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f41332b, false, 35045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41332b, false, 35045, new Class[0], Void.TYPE);
            return;
        }
        if (this.f41334c != null && this.f41334c.isViewValid()) {
            DetailFragment detailFragment = this.f41334c;
            if (PatchProxy.isSupport(new Object[0], detailFragment, DetailFragment.f3004a, false, 35073, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], detailFragment, DetailFragment.f3004a, false, 35073, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (detailFragment.f3006c != null && !detailFragment.f3006c.j() && detailFragment.f3006c.k()) {
                detailFragment.f3006c.a((Boolean) null);
                z = true;
            }
            if (!z) {
                this.f41334c.d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r1.equals("from_hot") != false) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f41332b
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 35044(0x88e4, float:4.9107E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f41332b
            r5 = 0
            r6 = 35044(0x88e4, float:4.9107E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.onDestroy()
            r9.overridePendingTransition(r0, r0)
            com.ss.android.ugc.aweme.detail.ui.DetailFragment r1 = r9.f41334c
            if (r1 != 0) goto L_0x0030
            return
        L_0x0030:
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r2 = "video_from"
            java.lang.String r1 = r1.getStringExtra(r2)
            android.content.Intent r2 = r9.getIntent()
            if (r2 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.detail.d.a r2 = com.ss.android.ugc.aweme.detail.d.a.f41172b
            boolean r2 = r2.a(r1)
            if (r2 == 0) goto L_0x00ae
            int r2 = r9.g
            r3 = -1
            if (r2 == r3) goto L_0x00ae
            com.ss.android.ugc.aweme.detail.ui.DetailFragment r2 = r9.f41334c
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.getCurrentAweme()
            if (r2 == 0) goto L_0x00ae
            int r4 = r1.hashCode()
            r5 = -1244334536(0xffffffffb5d4f638, float:-1.586689E-6)
            if (r4 == r5) goto L_0x006e
            r0 = 54656180(0x341fcb4, float:5.700769E-37)
            if (r4 == r0) goto L_0x0064
            goto L_0x0077
        L_0x0064:
            java.lang.String r0 = "from_nearby"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0077
            r0 = 1
            goto L_0x0078
        L_0x006e:
            java.lang.String r4 = "from_hot"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r0 = -1
        L_0x0078:
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return
        L_0x007c:
            java.lang.String r0 = "homepage_fresh"
            goto L_0x0081
        L_0x007f:
            java.lang.String r0 = "homepage_hot"
        L_0x0081:
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r3 = "feed_back"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r3)
            com.ss.android.ugc.aweme.common.MobClick r0 = r1.setLabelName(r0)
            com.ss.android.ugc.aweme.detail.ui.DetailFragment r1 = r9.f41334c
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.getCurrentAweme()
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)
            com.ss.android.ugc.aweme.feed.a r1 = com.ss.android.ugc.aweme.feed.a.a()
            int r3 = r9.g
            org.json.JSONObject r1 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r2, (int) r3)
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailActivity.onDestroy():void");
    }

    public void finish() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f41332b, false, 35048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41332b, false, 35048, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.d4);
        if (this.f41334c != null) {
            DetailFragment detailFragment = this.f41334c;
            if (PatchProxy.isSupport(new Object[0], detailFragment, DetailFragment.f3004a, false, 35077, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], detailFragment, DetailFragment.f3004a, false, 35077, new Class[0], Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[0], detailFragment, DetailFragment.f3004a, false, 35075, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], detailFragment, DetailFragment.f3004a, false, 35075, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z = DetailFragment.a(detailFragment.c());
                }
                if (z && detailFragment.getActivity() != null) {
                    com.ss.android.ugc.aweme.feed.g.d.a().f45349b = FeedSharePlayerViewModel.getPlayerManager(detailFragment.getActivity());
                }
            }
        }
        String stringExtra = getIntent().getStringExtra("video_from");
        if (f.b(this) || TextUtils.equals(stringExtra, "from_follow_page")) {
            overridePendingTransition(C0906R.anim.bq, C0906R.anim.br);
        } else if (!o.v()) {
            o.b().g();
        } else {
            com.ss.android.ugc.playerkit.videoview.a.a().U();
        }
        if (!com.ss.android.g.a.a()) {
            c.a(this);
        } else if (isTaskRoot()) {
            h.a().a((Activity) this, "aweme://main");
        }
        if (this.f41334c != null) {
            this.f41334c.a(!TextUtils.equals(stringExtra, "from_follow_page"));
        }
        if (!TextUtils.isEmpty(this.h)) {
            try {
                startActivity(new Intent(this, Class.forName(this.h)));
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public final void b(@NonNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f41332b, false, 35051, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f41332b, false, 35051, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f41335d != null) {
            this.f41335d.remove(aVar);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f41332b, false, 35036, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f41332b, false, 35036, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(48);
        setContentView((int) C0906R.layout.el);
        a(bundle);
        if (!NetworkUtils.isNetworkAvailable(this)) {
            finish();
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
        }
        try {
            if (!com.ss.android.g.a.a() && Build.VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
            String str = Build.BRAND;
            String str2 = Build.MODEL;
            if (com.ss.android.g.a.b() && Build.VERSION.SDK_INT >= 21 && str != null && str2 != null && str.equals("TECNO") && str2.equals("TECNO Camon CX")) {
                getWindow().setNavigationBarColor(-16777216);
            }
        } catch (Exception unused) {
        }
        com.ss.android.ugc.aweme.base.activity.f fVar = new com.ss.android.ugc.aweme.base.activity.f(this, false);
        b bVar = new b(this);
        if (PatchProxy.isSupport(new Object[]{bVar}, fVar, com.ss.android.ugc.aweme.base.activity.f.f34516a, false, 24116, new Class[]{f.a.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.base.activity.f fVar2 = fVar;
            PatchProxy.accessDispatch(new Object[]{bVar}, fVar2, com.ss.android.ugc.aweme.base.activity.f.f34516a, false, 24116, new Class[]{f.a.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(bVar, "listener");
            fVar.f34519d = bVar;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", false);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f41332b, false, 35049, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f41332b, false, 35049, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f41335d != null) {
            for (a a2 : this.f41335d) {
                if (a2.a(i, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public static void a(Activity activity, Bundle bundle, View view) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle2, view2}, null, f41332b, true, 35033, new Class[]{Activity.class, Bundle.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bundle2, view2}, null, f41332b, true, 35033, new Class[]{Activity.class, Bundle.class, View.class}, Void.TYPE);
        } else if (activity2 != null) {
            Intent intent = new Intent(activity2, DetailActivity.class);
            intent.putExtras(bundle2);
            a((Context) activity2, intent, view2);
        }
    }

    private static void a(Context context, @NonNull Intent intent, View view) {
        Context context2 = context;
        Intent intent2 = intent;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{context2, intent2, view2}, null, f41332b, true, 35034, new Class[]{Context.class, Intent.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2, view2}, null, f41332b, true, 35034, new Class[]{Context.class, Intent.class, View.class}, Void.TYPE);
            return;
        }
        try {
            ActivityCompat.startActivity(context2, intent2, ActivityOptionsCompat.makeClipRevealAnimation(view2, 0, 0, view.getWidth(), view.getHeight()).toBundle());
        } catch (Exception unused) {
            context.startActivity(intent);
        }
    }

    public static void a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f41332b, true, 35027, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f41332b, true, 35027, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, str3, null, null, str4}, null, f41332b, true, 35028, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, null, null, str4}, null, f41332b, true, 35028, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, DetailActivity.class);
        intent.putExtra("id", str3);
        intent.putExtra("invitation_code", null);
        intent.putExtra("invitor", null);
        intent.putExtra("refer", str4);
        context2.startActivity(intent);
    }

    @SuppressLint({"TooManyMethodParam"})
    public static void a(Context context, String str, String str2, String str3, int i, int i2, String str4, View view) {
        Context context2 = context;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{context2, str5, str6, str7, Integer.valueOf(i), Integer.valueOf(i2), str8, view2}, null, f41332b, true, 35030, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str5, str6, str7, Integer.valueOf(i), Integer.valueOf(i2), str8, view2}, null, f41332b, true, 35030, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, View.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, DetailActivity.class);
        intent.putExtra("id", str5);
        intent.putExtra("refer", str6);
        intent.putExtra("video_from", str7);
        intent.putExtra("profile_enterprise_type", i);
        intent.putExtra("page_type", i2);
        if (str8 != null) {
            intent.putExtra("userid", str8);
        }
        a(context2, intent, view2);
    }

    @SuppressLint({"TooManyMethodParam"})
    public static void a(Context context, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, View view) {
        Context context2 = context;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{context2, str7, str8, str9, Integer.valueOf(i), Integer.valueOf(i2), str10, str11, str12, view2}, null, f41332b, true, 35031, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str7, str8, str9, Integer.valueOf(i), Integer.valueOf(i2), str10, str11, str12, view2}, null, f41332b, true, 35031, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, View.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, DetailActivity.class);
        intent.putExtra("id", str7);
        intent.putExtra("refer", str8);
        intent.putExtra("video_from", str9);
        intent.putExtra("profile_enterprise_type", i);
        intent.putExtra("page_type", i2);
        intent.putExtra("poi_id", str11);
        intent.putExtra("previous_page", "poi_page");
        if (str10 != null) {
            intent.putExtra("userid", str10);
        }
        if (!TextUtils.isEmpty(str6)) {
            intent.putExtra("related_gid", str12);
        }
        a(context2, intent, view2);
    }
}
