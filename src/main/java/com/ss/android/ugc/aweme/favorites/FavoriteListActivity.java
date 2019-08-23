package com.ss.android.ugc.aweme.favorites;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.activity.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.u.ap;
import java.util.Locale;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class FavoriteListActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3109a;

    /* renamed from: b  reason: collision with root package name */
    boolean f3110b = true;

    /* renamed from: c  reason: collision with root package name */
    private int f3111c;

    /* renamed from: d  reason: collision with root package name */
    private String f3112d;

    /* renamed from: e  reason: collision with root package name */
    private String f3113e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3114f;
    private boolean g;
    private String h;
    private String i;
    private AwemeListFragment j;
    private long k;
    @BindView(2131497604)
    TextTitleBar mTitleBar;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3109a, false, 39388, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3109a, false, 39388, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onPause() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f3109a, false, 39383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3109a, false, 39383, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (PatchProxy.isSupport(new Object[0], this, f3109a, false, 39385, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3109a, false, 39385, new Class[0], Void.TYPE);
            return;
        }
        if (this.k > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.k;
            if (currentTimeMillis > 0) {
                ap apVar = new ap();
                if (this.f3114f) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                ap apVar2 = (ap) apVar.b(str).a(String.valueOf(currentTimeMillis)).j(this.i);
                if (this.g) {
                    str2 = "click_my_like";
                } else {
                    str2 = "click_link";
                }
                apVar2.f75060b = str2;
                apVar2.e();
            }
            this.k = -1;
        }
    }

    public void onResume() {
        String str;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, f3109a, false, 39382, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3109a, false, 39382, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onResume", true);
        super.onResume();
        if (PatchProxy.isSupport(new Object[0], this, f3109a, false, 39384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3109a, false, 39384, new Class[0], Void.TYPE);
        } else {
            this.k = System.currentTimeMillis();
        }
        if (PatchProxy.isSupport(new Object[0], this, f3109a, false, 39386, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3109a, false, 39386, new Class[0], Void.TYPE);
        } else {
            if (a.a()) {
                Locale locale = Locale.getDefault();
                String string = getString(C0906R.string.b5g);
                Object[] objArr = new Object[1];
                if (this.f3111c < 0) {
                    i3 = 0;
                } else {
                    i3 = this.f3111c;
                }
                objArr[0] = Integer.valueOf(i3);
                str = String.format(locale, string, objArr);
            } else {
                Object[] objArr2 = new Object[1];
                if (this.f3111c < 0) {
                    i2 = 0;
                } else {
                    i2 = this.f3111c;
                }
                objArr2[0] = Integer.valueOf(i2);
                str = getString(C0906R.string.b5g, objArr2);
            }
            this.mTitleBar.setTitle((CharSequence) str);
        }
        if (this.j != null && !this.f3110b) {
            this.j.r();
        }
        this.f3110b = false;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onResume", false);
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f3109a, false, 39387, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f3109a, false, 39387, new Class[]{ar.class}, Void.TYPE);
        } else if (arVar.f45292b == 13) {
            if (com.ss.android.ugc.aweme.feed.a.a().b((String) arVar.f45293c).getUserDigg() == 1) {
                this.f3111c++;
            } else {
                this.f3111c--;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3109a, false, 39381, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3109a, false, 39381, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onCreate", true);
        super.onCreate(bundle);
        requestDisableOptimizeViewHierarchy();
        setContentView((int) C0906R.layout.bb);
        c.a(this, 0);
        this.f3111c = getIntent().getIntExtra("favoriteCount", 0);
        this.f3112d = getIntent().getStringExtra("userId");
        this.f3113e = getIntent().getStringExtra("sec_user_id");
        this.f3114f = getIntent().getBooleanExtra("isMyProfile", false);
        this.g = getIntent().getBooleanExtra("clickMyLike", false);
        this.h = getIntent().getStringExtra("contentSource");
        this.i = getIntent().getStringExtra("tabName");
        ButterKnife.bind((Activity) this);
        this.j = AwemeListFragment.a((int) getResources().getDimension(C0906R.dimen.lv), 1, this.f3112d, this.f3113e, this.f3114f, true);
        this.j.f3789f = true;
        AwemeListFragment awemeListFragment = this.j;
        if (this.g) {
            str = "click_my_like_cover";
        } else {
            str = "click_link_cover";
        }
        awemeListFragment.w = str;
        this.j.x = this.h;
        this.j.k = this.i;
        getSupportFragmentManager().beginTransaction().add((int) C0906R.id.aic, (Fragment) this.j).commitAllowingStateLoss();
        this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44189a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44189a, false, 39389, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44189a, false, 39389, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                FavoriteListActivity.this.onBackPressed();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onCreate", false);
    }

    @SuppressLint({"TooManyMethodParam"})
    public static final void a(Context context, int i2, String str, String str2, boolean z, boolean z2, String str3, String str4) {
        String str5;
        String str6;
        Context context2 = context;
        String str7 = str;
        String str8 = str2;
        boolean z3 = z;
        boolean z4 = z2;
        String str9 = str3;
        String str10 = str4;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2), str7, str8, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), str9, str10}, null, f3109a, true, 39380, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Boolean.TYPE, Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2), str7, str8, Byte.valueOf(z), Byte.valueOf(z2), str9, str10}, null, f3109a, true, 39380, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Boolean.TYPE, Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context2, FavoriteListActivity.class);
        intent.putExtra("favoriteCount", i2);
        intent.putExtra("userId", str7);
        intent.putExtra("sec_user_id", str8);
        intent.putExtra("isMyProfile", z3);
        intent.putExtra("clickMyLike", z4);
        intent.putExtra("tabName", str9);
        intent.putExtra("contentSource", str10);
        context2.startActivity(intent);
        d a2 = d.a();
        if (z3) {
            str5 = "personal_homepage";
        } else {
            str5 = "others_homepage";
        }
        a2.a("enter_from", str5);
        if (z4) {
            str6 = "click_my_like";
        } else {
            str6 = "click_link";
        }
        a2.a("enter_method", str6);
        r.a("enter_like_detail", (Map) a2.f34114b);
    }
}
