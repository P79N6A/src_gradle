package com.ss.android.ugc.aweme.live.authentication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.live.authentication.b.a;
import com.ss.android.ugc.aweme.live.authentication.b.a.c;
import com.ss.android.ugc.aweme.live.authentication.b.a.e;
import com.ss.android.ugc.aweme.live.authentication.fragment.LiveAuthenticationFragment;
import com.ss.android.ugc.aweme.mobile.a.b;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class LiveBroadcastAuthenticateActivity extends AmeActivity implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3424a;

    /* renamed from: b  reason: collision with root package name */
    private LiveAuthenticationFragment f3425b;

    /* renamed from: c  reason: collision with root package name */
    private WeakHandler f3426c;

    /* renamed from: d  reason: collision with root package name */
    private a.C0618a f3427d;

    /* renamed from: e  reason: collision with root package name */
    private e f3428e;

    /* renamed from: f  reason: collision with root package name */
    private List<a> f3429f;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3424a, false, 55616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3424a, false, 55616, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.authentication.LiveBroadcastAuthenticateActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.authentication.LiveBroadcastAuthenticateActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3424a, false, 55617, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3424a, false, 55617, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.authentication.LiveBroadcastAuthenticateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3424a, false, 55608, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3424a, false, 55608, new Class[0], Void.TYPE);
            return;
        }
        this.f3427d.b();
        this.f3427d.a(this.f3428e);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3424a, false, 55610, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3424a, false, 55610, new Class[0], Void.TYPE);
            return;
        }
        try {
            getSupportFragmentManager().popBackStack();
        } catch (Exception unused) {
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f3424a, false, 55609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3424a, false, 55609, new Class[0], Void.TYPE);
        } else if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            b.a(this, false, true);
        } else {
            b();
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3424a, false, 55613, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3424a, false, 55613, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f3426c.removeCallbacks(null);
    }

    public final void a(Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f3424a, false, 55611, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, f3424a, false, 55611, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        a(fragment2, false);
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f3424a, false, 55615, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f3424a, false, 55615, new Class[]{Message.class}, Void.TYPE);
        } else if (message2.obj instanceof Exception) {
            if (message2.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                ((com.ss.android.ugc.aweme.base.api.a.b.a) message2.obj).getErrorCode();
            }
        } else {
            if (message2.what == 112) {
                int verifyStatus = ((User) message2.obj).getVerifyStatus();
                com.ss.android.ugc.aweme.live.authentication.model.b.a().f53325b.realname_verify = verifyStatus;
                if (com.ss.android.ugc.aweme.live.authentication.model.b.a(verifyStatus)) {
                    a();
                }
                this.f3425b.a(com.ss.android.ugc.aweme.live.authentication.model.b.a().f53325b);
            }
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onAuthenticationEvent(com.ss.android.ugc.aweme.fe.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3424a, false, 55607, new Class[]{com.ss.android.ugc.aweme.fe.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3424a, false, 55607, new Class[]{com.ss.android.ugc.aweme.fe.a.a.class}, Void.TYPE);
        } else if (aVar.f44407a == -1) {
            finish();
        } else if (aVar.f44407a == 1) {
            d.a().queryUser(this.f3426c);
        } else {
            a();
            this.f3425b.a(com.ss.android.ugc.aweme.live.authentication.model.b.a().f53325b);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        LiveAuthenticationFragment liveAuthenticationFragment;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3424a, false, 55606, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3424a, false, 55606, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.authentication.LiveBroadcastAuthenticateActivity", "onCreate", true);
        super.onCreate(bundle);
        if (com.ss.android.ugc.aweme.live.authentication.model.b.a().f53325b == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.authentication.LiveBroadcastAuthenticateActivity", "onCreate", false);
            return;
        }
        setContentView((int) C0906R.layout.al);
        this.f3426c = new WeakHandler(this);
        this.f3429f = new ArrayList();
        this.f3429f.add(new com.ss.android.ugc.aweme.live.authentication.b.a.b());
        this.f3429f.add(new com.ss.android.ugc.aweme.live.authentication.b.a.d());
        this.f3429f.add(new com.ss.android.ugc.aweme.live.authentication.b.a.a());
        this.f3429f.add(new c());
        this.f3428e = new e();
        this.f3428e.f53309b = this;
        this.f3428e.f53310c = this.f3426c;
        this.f3428e.f53308a = com.ss.android.ugc.aweme.live.authentication.model.b.a().f53325b;
        this.f3427d = new com.ss.android.ugc.aweme.live.authentication.b.b(0, this.f3429f, this.f3428e);
        com.ss.android.ugc.aweme.live.authentication.model.b a2 = com.ss.android.ugc.aweme.live.authentication.model.b.a();
        if (PatchProxy.isSupport(new Object[]{this}, a2, com.ss.android.ugc.aweme.live.authentication.model.b.f53323a, false, 55630, new Class[]{Activity.class}, Boolean.TYPE)) {
            com.ss.android.ugc.aweme.live.authentication.model.b bVar = a2;
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{this}, bVar, com.ss.android.ugc.aweme.live.authentication.model.b.f53323a, false, 55630, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.live.authentication.model.b.a(a2.f53325b.realname_verify) || !a2.f53325b.is_phone_binded) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            com.ss.android.ugc.aweme.live.authentication.model.b a3 = com.ss.android.ugc.aweme.live.authentication.model.b.a();
            if (a3.f53325b.live_answer && a3.f53325b.live_agreement) {
                z2 = false;
            }
            if (z2) {
                a();
                finish();
            }
        }
        if (PatchProxy.isSupport(new Object[0], null, LiveAuthenticationFragment.f53315a, true, 55621, new Class[0], LiveAuthenticationFragment.class)) {
            liveAuthenticationFragment = (LiveAuthenticationFragment) PatchProxy.accessDispatch(new Object[0], null, LiveAuthenticationFragment.f53315a, true, 55621, new Class[0], LiveAuthenticationFragment.class);
        } else {
            liveAuthenticationFragment = new LiveAuthenticationFragment();
        }
        this.f3425b = liveAuthenticationFragment;
        a(this.f3425b);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.authentication.LiveBroadcastAuthenticateActivity", "onCreate", false);
    }

    private void a(Fragment fragment, boolean z) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2, (byte) 0}, this, f3424a, false, 55612, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, (byte) 0}, this, f3424a, false, 55612, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE);
        } else if (getSupportFragmentManager().getFragments() == null) {
            getSupportFragmentManager().beginTransaction().add((int) C0906R.id.aic, fragment2).commitAllowingStateLoss();
        } else {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.setCustomAnimations(C0906R.anim.cz, C0906R.anim.da, 0, C0906R.anim.da);
            beginTransaction.add((int) C0906R.id.gp, fragment2);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), strArr, iArr}, this, f3424a, false, 55614, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), strArr, iArr}, this, f3424a, false, 55614, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.utils.permission.a.a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
