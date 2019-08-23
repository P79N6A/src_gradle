package com.ss.android.ugc.aweme.setting.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.setting.serverpush.b.a;
import com.ss.android.ugc.aweme.setting.serverpush.b.c;

public abstract class BaseControlSettingActivity extends AmeSSActivity implements View.OnClickListener, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64103a;

    /* renamed from: b  reason: collision with root package name */
    protected int f64104b;

    /* renamed from: c  reason: collision with root package name */
    protected int f64105c;

    /* renamed from: d  reason: collision with root package name */
    protected c f64106d;
    @BindView(2131494168)
    protected CommonItemView mEveryoneItem;
    @BindView(2131494416)
    protected CommonItemView mFriendsItem;
    @BindView(2131496024)
    protected CommonItemView mOffItem;
    @BindView(2131497590)
    protected TextView mTitle;

    public abstract void a();

    public abstract void a(int i);

    public abstract void b();

    public final void c() {
    }

    public abstract String e();

    public abstract void f();

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f64103a, false, 72396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64103a, false, 72396, new Class[0], Void.TYPE);
            return;
        }
        this.mFriendsItem.setRightIconRes(0);
        this.mEveryoneItem.setRightIconRes(0);
        this.mOffItem.setRightIconRes(0);
    }

    public void X_() {
        if (PatchProxy.isSupport(new Object[0], this, f64103a, false, 72392, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64103a, false, 72392, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgg).a();
        a(this.f64105c);
        this.f64104b = this.f64105c;
    }

    @OnClick({2131493213})
    public void back() {
        if (PatchProxy.isSupport(new Object[0], this, f64103a, false, 72398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64103a, false, 72398, new Class[0], Void.TYPE);
            return;
        }
        onBackPressed();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f64103a, false, 72399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64103a, false, 72399, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = getIntent();
        intent.putExtra("currentSettingsValue", this.f64104b);
        setResult(-1, intent);
        finish();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f64103a, false, 72393, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64103a, false, 72393, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f64106d.k();
        if (com.ss.android.g.a.a()) {
            ImmersionBar.with((Activity) this).destroy();
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f64103a, false, 72390, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64103a, false, 72390, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.c()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        } else {
            if (com.ss.android.g.a.b()) {
                ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) C0906R.color.w1).init();
            }
        }
    }

    public final void a(CommonItemView commonItemView) {
        CommonItemView commonItemView2 = commonItemView;
        if (PatchProxy.isSupport(new Object[]{commonItemView2}, this, f64103a, false, 72395, new Class[]{CommonItemView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commonItemView2}, this, f64103a, false, 72395, new Class[]{CommonItemView.class}, Void.TYPE);
            return;
        }
        commonItemView2.setRightIconRes(2130839076);
    }

    public final void a(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f64103a, false, 72400, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f64103a, false, 72400, new Class[]{CharSequence.class}, Void.TYPE);
        } else if (this.mOffItem != null && this.mOffItem.getVisibility() == 0) {
            this.mOffItem.setDesc(charSequence);
        } else if (this.mFriendsItem != null && this.mFriendsItem.getVisibility() == 0) {
            this.mFriendsItem.setDesc(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64103a, false, 72397, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64103a, false, 72397, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f64106d.a(e(), Integer.valueOf(i));
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64103a, false, 72401, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64103a, false, 72401, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mOffItem != null && this.mOffItem.getVisibility() == 0) {
            this.mOffItem.getTvwDesc().setTextColor(i);
        } else if (this.mFriendsItem != null && this.mFriendsItem.getVisibility() == 0) {
            this.mFriendsItem.getTvwDesc().setTextColor(i);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64103a, false, 72394, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64103a, false, 72394, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            g();
            a((CommonItemView) view);
            this.f64105c = this.f64104b;
            int intValue = ((Integer) view.getTag()).intValue();
            this.f64104b = intValue;
            b(intValue);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64103a, false, 72389, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64103a, false, 72389, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b4);
        g();
        if (PatchProxy.isSupport(new Object[0], this, f64103a, false, 72391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64103a, false, 72391, new Class[0], Void.TYPE);
            return;
        }
        this.f64106d = new c();
        this.f64106d.a(this);
        this.mEveryoneItem.setOnClickListener(this);
        this.mFriendsItem.setOnClickListener(this);
        this.mOffItem.setOnClickListener(this);
        f();
        a();
        b();
    }
}
