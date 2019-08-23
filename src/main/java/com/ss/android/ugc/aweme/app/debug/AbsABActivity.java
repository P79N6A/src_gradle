package com.ss.android.ugc.aweme.app.debug;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.a.a;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import org.greenrobot.eventbus.Subscribe;

public abstract class AbsABActivity extends AmeBaseActivity {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f2648d;

    /* renamed from: e  reason: collision with root package name */
    protected LinearLayout f2649e;

    /* renamed from: f  reason: collision with root package name */
    protected AbTestModel f2650f;
    protected a g;

    public final int a() {
        return C0906R.layout.a4;
    }

    public abstract void c();

    public boolean isRegisterEventBus() {
        return true;
    }

    @OnClick({2131493210})
    public void back() {
        if (PatchProxy.isSupport(new Object[0], this, f2648d, false, 23343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2648d, false, 23343, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f2648d, false, 23342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2648d, false, 23342, new Class[0], Void.TYPE);
            return;
        }
        this.g = (a) getIntent().getSerializableExtra("paeg_param");
        ((TextView) findViewById(C0906R.id.title)).setText(this.g.category);
        this.f2649e = (LinearLayout) findViewById(C0906R.id.b7o);
        this.f2650f = AbTestManager.a().d();
        c();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2648d, false, 23341, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2648d, false, 23341, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        d();
    }

    @Subscribe
    public void onEvent(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2648d, false, 23344, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2648d, false, 23344, new Class[]{a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.setting.a.b().a(getApplicationContext(), "ab_test_model", (Object) this.f2650f);
    }
}
