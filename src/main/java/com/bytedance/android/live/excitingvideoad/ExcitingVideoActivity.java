package com.bytedance.android.live.excitingvideoad;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;
import com.bytedance.android.live.excitingvideoad.sdk.ExcitingVideoFragment;
import com.bytedance.android.live.excitingvideoad.sdk.b;
import com.bytedance.android.live.excitingvideoad.sdk.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ExcitingVideoActivity extends FragmentActivity implements b, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8369a;

    /* renamed from: b  reason: collision with root package name */
    private ExcitingVideoFragment f8370b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8369a, false, 1554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8369a, false, 1554, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f8369a, false, 1553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8369a, false, 1553, new Class[0], Void.TYPE);
            return;
        }
        if (this.f8370b == null || !this.f8370b.b()) {
            super.onBackPressed();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8369a, false, 1552, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8369a, false, 1552, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setRequestedOrientation(1);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(C0906R.id.aaq);
        setContentView(frameLayout);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f8370b = new ExcitingVideoFragment();
        this.f8370b.p = this;
        this.f8370b.q = this;
        supportFragmentManager.beginTransaction().replace(C0906R.id.aaq, this.f8370b).commit();
    }
}
