package com.ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.IdRes;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import com.ss.android.ugc.aweme.utils.c;

public class PoiCouponRedeemActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38449a;

    /* renamed from: b  reason: collision with root package name */
    String f38450b;

    /* renamed from: c  reason: collision with root package name */
    String f38451c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38452d;

    /* renamed from: e  reason: collision with root package name */
    private CouponRedeemApi.b f38453e;

    /* renamed from: f  reason: collision with root package name */
    private CouponRedeemApi.a f38454f;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f38449a, false, 30364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38449a, false, 30364, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38449a, false, 30365, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38449a, false, 30365, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38449a, false, 30360, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38449a, false, 30360, new Class[0], Void.TYPE);
        } else if (!isFinishing()) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f38449a, false, 30357, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38449a, false, 30357, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f38452d) {
            a();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f38449a, false, 30356, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f38449a, false, 30356, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        this.f38453e = (CouponRedeemApi.b) getIntent().getSerializableExtra("coupon");
        this.f38450b = getIntent().getStringExtra("code");
        this.f38451c = getIntent().getStringExtra("action_type");
        this.f38452d = TextUtils.equals(this.f38451c, "scan");
        if (this.f38453e == null || this.f38453e.statusCode != 0 || this.f38453e.coupon == null) {
            View view = new View(this);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(0);
            setContentView(view);
            if (this.f38453e != null && !TextUtils.isEmpty(this.f38453e.statusMsg)) {
                a.b(getApplicationContext(), this.f38453e.statusMsg).a();
            }
            if (this.f38452d) {
                new Handler().postDelayed(new m(this), 700);
            } else {
                a();
            }
        } else {
            this.f38454f = this.f38453e.coupon;
            if (PatchProxy.isSupport(new Object[0], this, f38449a, false, 30358, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38449a, false, 30358, new Class[0], Void.TYPE);
            } else {
                setContentView((int) C0906R.layout.d0);
                a((int) C0906R.id.amr, this.f38454f.headImage);
                a((int) C0906R.id.hk, this.f38454f.avatar);
                a((int) C0906R.id.title, this.f38454f.title);
                a((int) C0906R.id.bmk, this.f38454f.merchantName);
                a((int) C0906R.id.dqm, this.f38454f.username);
                a((int) C0906R.id.q2, (View.OnClickListener) new n(this));
                a((int) C0906R.id.y0, (View.OnClickListener) new o(this));
                c.a(findViewById(C0906R.id.y0));
                c.a(findViewById(C0906R.id.q2));
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity", "onCreate", false);
    }

    private void a(@IdRes int i, View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), onClickListener2}, this, f38449a, false, 30363, new Class[]{Integer.TYPE, View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), onClickListener2}, this, f38449a, false, 30363, new Class[]{Integer.TYPE, View.OnClickListener.class}, Void.TYPE);
            return;
        }
        View findViewById = findViewById(i);
        if (findViewById != null) {
            findViewById.setOnClickListener(onClickListener2);
        }
    }

    private void a(@IdRes int i, UrlModel urlModel) {
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), urlModel2}, this, f38449a, false, 30362, new Class[]{Integer.TYPE, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), urlModel2}, this, f38449a, false, 30362, new Class[]{Integer.TYPE, UrlModel.class}, Void.TYPE);
        } else if (urlModel2 != null) {
            RemoteImageView remoteImageView = (RemoteImageView) findViewById(i);
            if (remoteImageView != null) {
                com.ss.android.ugc.aweme.base.c.b(remoteImageView, urlModel2);
            }
        }
    }

    private void a(@IdRes int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f38449a, false, 30361, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f38449a, false, 30361, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (str2 != null) {
            TextView textView = (TextView) findViewById(i);
            if (textView != null) {
                textView.setText(str2);
            }
        }
    }

    public static void a(Context context, String str, CouponRedeemApi.b bVar, String str2) {
        Context context2 = context;
        String str3 = str;
        CouponRedeemApi.b bVar2 = bVar;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, bVar2, str4}, null, f38449a, true, 30355, new Class[]{Context.class, String.class, CouponRedeemApi.b.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str3, bVar2, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f38449a, true, 30355, new Class[]{Context.class, String.class, CouponRedeemApi.b.class, String.class}, Void.TYPE);
        } else if (context2 != null && bVar2 != null) {
            Intent intent = new Intent(context2, PoiCouponRedeemActivity.class);
            if (!(context2 instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("code", str3);
            intent.putExtra("coupon", bVar2);
            intent.putExtra("action_type", str4);
            context2.startActivity(intent);
        }
    }
}
