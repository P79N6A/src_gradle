package com.ss.android.ugc.aweme.account.ui;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.login.e;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/ui/FullScreenLoginActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FullScreenLoginActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32891a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f32892b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/account/ui/FullScreenLoginActivity$Companion;", "", "()V", "ENTER_FROM", "", "ENTER_METHOD", "open", "", "context", "Landroid/content/Context;", "enterForm", "enterMethod", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32893a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/account/ui/FullScreenLoginActivity$onCreate$1", "Lcom/ss/android/ugc/aweme/base/component/OnActivityResult;", "onResultCancelled", "", "data", "Landroid/os/Bundle;", "onResultOK", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32894a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FullScreenLoginActivity f32895b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f32894a, false, 21124, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32894a, false, 21124, new Class[0], Void.TYPE);
                return;
            }
            this.f32895b.finish();
            this.f32895b.overridePendingTransition(0, 0);
        }

        b(FullScreenLoginActivity fullScreenLoginActivity) {
            this.f32895b = fullScreenLoginActivity;
        }

        public final void a(@Nullable Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{null}, this, f32894a, false, 21125, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f32894a, false, 21125, new Class[]{Bundle.class}, Void.TYPE);
                return;
            }
            this.f32895b.finish();
            this.f32895b.overridePendingTransition(0, 0);
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32891a, false, 21121, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32891a, false, 21121, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32891a, false, 21122, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32891a, false, 21122, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32891a, false, 21117, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32891a, false, 21117, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        e.a((Activity) this, getIntent().getStringExtra("enter_from"), getIntent().getStringExtra("enter_method"), (Bundle) null, (f) new b(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onCreate", false);
    }
}
