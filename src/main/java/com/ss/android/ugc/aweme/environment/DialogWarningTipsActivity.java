package com.ss.android.ugc.aweme.environment;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.framework.core.a;

public class DialogWarningTipsActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43872a;

    /* renamed from: b  reason: collision with root package name */
    public int f43873b;

    /* renamed from: c  reason: collision with root package name */
    private DialogInterface.OnClickListener f43874c = new DialogInterface.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43876a;

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43876a, false, 39034, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43876a, false, 39034, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (DialogWarningTipsActivity.this.f43873b != 1) {
                if (DialogWarningTipsActivity.this.f43873b == 2) {
                    DialogWarningTipsActivity dialogWarningTipsActivity = DialogWarningTipsActivity.this;
                    if (PatchProxy.isSupport(new Object[0], dialogWarningTipsActivity, DialogWarningTipsActivity.f43872a, false, 39029, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], dialogWarningTipsActivity, DialogWarningTipsActivity.f43872a, false, 39029, new Class[0], Void.TYPE);
                    } else {
                        dialogWarningTipsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://d.douyin.com/fdYH/")));
                    }
                }
            }
            DialogWarningTipsActivity.this.a();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private DialogInterface.OnClickListener f43875d = new DialogInterface.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43878a;

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43878a, false, 39035, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43878a, false, 39035, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            DialogWarningTipsActivity.this.a();
        }
    };

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f43872a, false, 39032, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43872a, false, 39032, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43872a, false, 39033, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43872a, false, 39033, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f43872a, false, 39031, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43872a, false, 39031, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43872a, false, 39030, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43872a, false, 39030, new Class[0], Void.TYPE);
            return;
        }
        int myPid = Process.myPid();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(myPid)}, null, a.f43880a, true, 39036, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(myPid)}, null, a.f43880a, true, 39036, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String str = a.b().f3304b;
        if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
            Process.killProcess(myPid);
            return;
        }
        throw new RuntimeException("Process killed, pid is " + myPid);
    }

    public static final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f43872a, true, 39027, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f43872a, true, 39027, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        k a2 = k.a();
        Intent intent = new Intent(a2, DialogWarningTipsActivity.class);
        intent.putExtra("type", i);
        intent.setFlags(268435456);
        a2.startActivity(intent);
    }

    public void onCreate(Bundle bundle) {
        com.bytedance.ies.dmt.ui.b.a aVar;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43872a, false, 39028, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f43872a, false, 39028, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.lw);
        if (getIntent() != null) {
            this.f43873b = getIntent().getIntExtra("type", 0);
        }
        int i = this.f43873b;
        DialogInterface.OnClickListener onClickListener = this.f43874c;
        DialogInterface.OnClickListener onClickListener2 = this.f43875d;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), this, onClickListener, onClickListener2}, null, b.f43881a, true, 39038, new Class[]{Integer.TYPE, Activity.class, DialogInterface.OnClickListener.class, DialogInterface.OnClickListener.class}, com.bytedance.ies.dmt.ui.b.a.class)) {
            aVar = (com.bytedance.ies.dmt.ui.b.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), this, onClickListener, onClickListener2}, null, b.f43881a, true, 39038, new Class[]{Integer.TYPE, Activity.class, DialogInterface.OnClickListener.class, DialogInterface.OnClickListener.class}, com.bytedance.ies.dmt.ui.b.a.class);
        } else if (1 == i) {
            if (PatchProxy.isSupport(new Object[]{this, onClickListener}, null, b.f43881a, true, 39039, new Class[]{Activity.class, DialogInterface.OnClickListener.class}, com.bytedance.ies.dmt.ui.b.a.class)) {
                aVar = (com.bytedance.ies.dmt.ui.b.a) PatchProxy.accessDispatch(new Object[]{this, onClickListener}, null, b.f43881a, true, 39039, new Class[]{Activity.class, DialogInterface.OnClickListener.class}, com.bytedance.ies.dmt.ui.b.a.class);
            } else {
                aVar = new a.C0185a(this).a((int) C0906R.string.clc).b((int) C0906R.string.aof).a((int) C0906R.string.p0, onClickListener).a();
            }
        } else if (2 == i) {
            if (PatchProxy.isSupport(new Object[]{this, onClickListener, onClickListener2}, null, b.f43881a, true, 39040, new Class[]{Activity.class, DialogInterface.OnClickListener.class, DialogInterface.OnClickListener.class}, com.bytedance.ies.dmt.ui.b.a.class)) {
                aVar = (com.bytedance.ies.dmt.ui.b.a) PatchProxy.accessDispatch(new Object[]{this, onClickListener, onClickListener2}, null, b.f43881a, true, 39040, new Class[]{Activity.class, DialogInterface.OnClickListener.class, DialogInterface.OnClickListener.class}, com.bytedance.ies.dmt.ui.b.a.class);
            } else {
                aVar = new a.C0185a(this).a((int) C0906R.string.do7).b((int) C0906R.string.do8).a((int) C0906R.string.a7a, onClickListener).b((int) C0906R.string.oy, onClickListener2).a();
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onCreate", false);
    }
}
