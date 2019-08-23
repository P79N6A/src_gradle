package com.ss.android.ugc.aweme.im.sdk.module.msghelper;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.im.sdk.d.k;
import com.ss.android.ugc.aweme.im.sdk.module.session.SessionListAdapter;
import com.ss.android.ugc.aweme.im.sdk.module.session.b.a;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import java.util.List;

public class MessageHelperActivity extends AmeActivity implements a<com.ss.android.ugc.aweme.im.service.session.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51830a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f51831b;

    /* renamed from: c  reason: collision with root package name */
    private SessionListAdapter f51832c;

    /* renamed from: d  reason: collision with root package name */
    private DmtStatusView f51833d;

    public final void a(List<com.ss.android.ugc.aweme.im.service.session.a> list) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f51830a, false, 52374, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51830a, false, 52374, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51830a, false, 52375, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51830a, false, 52375, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f51830a, false, 52369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51830a, false, 52369, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        k.a().b(this);
        if (this.f51831b != null) {
            this.f51831b.setAdapter(null);
        }
    }

    public final void a(k.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f51830a, false, 52373, new Class[]{k.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f51830a, false, 52373, new Class[]{k.a.class}, Void.TYPE);
            return;
        }
        this.f51832c.setData(aVar.f51301c);
        if (aVar.f51301c.isEmpty()) {
            if (PatchProxy.isSupport(new Object[0], this, f51830a, false, 52371, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51830a, false, 52371, new Class[0], Void.TYPE);
            } else {
                this.f51833d.e();
            }
        } else {
            this.f51833d.b();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51830a, false, 52367, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51830a, false, 52367, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.du);
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        if (PatchProxy.isSupport(new Object[0], this, f51830a, false, 52368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51830a, false, 52368, new Class[0], Void.TYPE);
        } else {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) findViewById(C0906R.id.d3m);
            imTextTitleBar.setOnTitlebarClickListener(new ImTextTitleBar.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51834a;

                public final void b() {
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f51834a, false, 52376, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51834a, false, 52376, new Class[0], Void.TYPE);
                        return;
                    }
                    MessageHelperActivity.this.finish();
                }
            });
            imTextTitleBar.setTitle((int) C0906R.string.axx);
            this.f51831b = (RecyclerView) findViewById(C0906R.id.cip);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setOrientation(1);
            this.f51831b.setLayoutManager(linearLayoutManager);
            this.f51832c = new SessionListAdapter();
            this.f51831b.setAdapter(this.f51832c);
            this.f51833d = (DmtStatusView) findViewById(C0906R.id.cvd);
            this.f51833d.setBuilder(DmtStatusView.a.a((Context) this).a(new c.a(this).a(2130840141).b((int) C0906R.string.axt).c(C0906R.string.axs).f20493a).a().a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51836a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f51836a, false, 52377, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f51836a, false, 52377, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    k.a().f();
                }
            }));
            k.a().a((a<com.ss.android.ugc.aweme.im.service.session.a>) this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onCreate", false);
    }
}
