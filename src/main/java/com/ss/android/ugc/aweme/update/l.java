package com.ss.android.ugc.aweme.update;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.downloadlib.h;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.p;
import java.io.File;
import org.json.JSONObject;

public final class l extends Dialog implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75235a;

    /* renamed from: b  reason: collision with root package name */
    public m f75236b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f75237c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f75238d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f75239e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f75240f;
    private View g;
    private View h;
    private View i;
    private TextView j;
    private TextView k;
    private View l;
    private TextView m;
    private boolean n;
    private String o = "upgrade_pop";
    private String p;
    private final View.OnClickListener q = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75241a;

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f75241a, false, 87406, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f75241a, false, 87406, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            view2.setSelected(true ^ view.isSelected());
        }
    };

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75253a;

        /* renamed from: b  reason: collision with root package name */
        a f75254b = new a();

        /* renamed from: c  reason: collision with root package name */
        volatile boolean f75255c = false;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f75253a, false, 87409, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75253a, false, 87409, new Class[0], Void.TYPE);
                return;
            }
            while (true) {
                try {
                    Thread.sleep(1500);
                } catch (Exception unused) {
                }
                if (!l.this.f75236b.g()) {
                    break;
                }
                l.this.f75236b.a(this.f75254b);
                Message obtainMessage = l.this.f75237c.obtainMessage(1);
                obtainMessage.obj = this.f75254b;
                synchronized (this) {
                    if (!this.f75255c) {
                        l.this.f75237c.sendMessage(obtainMessage);
                    }
                }
            }
            if (!this.f75255c) {
                l.this.f75237c.sendEmptyMessage(2);
            }
        }

        a() {
        }
    }

    private void a() {
        final boolean z;
        final boolean z2;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f75235a, false, 87400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75235a, false, 87400, new Class[0], Void.TYPE);
            return;
        }
        final m a2 = m.a();
        this.f75236b = a2;
        if (a2 != null) {
            if (a2.q() != null) {
                z = true;
            } else {
                z = false;
            }
            boolean p2 = a2.p();
            if (!a2.i() || !this.n) {
                z2 = false;
            } else {
                z2 = true;
            }
            String a3 = m.a(a2.f());
            if (!TextUtils.isEmpty(a3) && a3.charAt(a3.length() - 1) == 10) {
                a3 = a3.substring(0, a3.length() - 1);
            }
            String j2 = a2.j();
            String k2 = a2.k();
            int i3 = C0906R.string.b4j;
            int i4 = C0906R.string.b4l;
            if (z2) {
                if (z) {
                    i3 = C0906R.string.b4k;
                } else {
                    i3 = C0906R.string.b4m;
                }
                i4 = C0906R.string.b4i;
            }
            if (z) {
                a3 = j2;
            }
            this.f75238d.setText(k2);
            TextView textView = this.f75239e;
            if (p2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            this.f75240f.setText(a3);
            this.j.setText(i3);
            this.k.setText(i4);
            this.j.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75243a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f75243a, false, 87407, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f75243a, false, 87407, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (z2 && z) {
                        l.this.onEvent("forcible_downloaded_refuse");
                    } else if (z2 && !z) {
                        l.this.onEvent("forcible_refuse");
                    } else if (z) {
                        l.this.onEvent("downloaded_refuse");
                    } else {
                        l.this.onEvent("refuse");
                    }
                    if (z2) {
                        LocalBroadcastManager.getInstance(l.this.getContext()).sendBroadcast(new Intent("com.ss.android.common.app.action.exit_app"));
                    }
                    m mVar = a2;
                    if (PatchProxy.isSupport(new Object[0], mVar, m.f4275a, false, 87448, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], mVar, m.f4275a, false, 87448, new Class[0], Void.TYPE);
                    } else if (mVar.X != null) {
                        mVar.X.b();
                    }
                    if (!z2 && !z) {
                        l.this.a(a2);
                    }
                    l.this.dismiss();
                    com.ss.android.common.lib.a.a(l.this.getContext(), "update", "cancel");
                }
            });
            this.j.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75248a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f75248a, false, 87408, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f75248a, false, 87408, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (z2 && z) {
                        l.this.onEvent("forcible_downloaded_accept");
                    } else if (z2 && !z) {
                        l.this.onEvent("forcible_accept");
                    } else if (z) {
                        l.this.onEvent("downloaded_accept");
                    } else {
                        l.this.onEvent("accept");
                    }
                    a2.b();
                    File q = a2.q();
                    if (q != null) {
                        a2.c();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.addFlags(1);
                        intent.setDataAndType(p.a(l.this.getContext(), q), "application/vnd.android.package-archive");
                        intent.addFlags(268435456);
                        l.this.getContext().startActivity(intent);
                    } else {
                        a2.v();
                        if (z2) {
                            new a().start();
                        }
                    }
                    if (!z2 && !z) {
                        l.this.a(a2);
                        com.bytedance.ies.dmt.ui.d.a.c(l.this.getContext(), (int) C0906R.string.doh).a();
                    }
                    if (!z2) {
                        l.this.dismiss();
                    }
                    com.ss.android.common.lib.a.a(l.this.getContext(), "update", "confirm");
                }
            });
            if (!z2 && !z) {
                a2.t();
                if (a2.n()) {
                    this.l.setSelected(true);
                } else {
                    this.l.setSelected(false);
                }
                if (a2.m()) {
                    this.m.setText(a2.o());
                    this.l.setVisibility(0);
                } else {
                    this.l.setVisibility(8);
                }
                this.l.setOnClickListener(this.q);
            }
        }
    }

    public final void onEvent(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75235a, false, 87405, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f75235a, false, 87405, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (getContext() != null) {
            com.ss.android.common.lib.a.a(getContext(), this.o, str2);
        }
    }

    public final void handleMsg(Message message) {
        a aVar;
        Message message2 = message;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f75235a, false, 87402, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f75235a, false, 87402, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        switch (message2.what) {
            case 1:
                if (message2.obj == null || !(message2.obj instanceof a)) {
                    aVar = new a();
                } else {
                    aVar = (a) message2.obj;
                }
                long j2 = aVar.f75201a;
                long j3 = aVar.f75202b;
                if (!PatchProxy.isSupport(new Object[]{new Long(j2), new Long(j3)}, this, f75235a, false, 87403, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
                    this.j.setEnabled(false);
                    this.g.setVisibility(0);
                    if (j2 > 0) {
                        i2 = 5;
                    }
                    if (j3 > 0) {
                        i2 = (int) ((j2 * 100) / j3);
                        if (i2 > 99) {
                            i2 = 99;
                        }
                    }
                    this.j.setText(i2 + "%" + this.p);
                    this.g.getLayoutParams().width = (int) ((((float) i2) * ((float) this.h.getWidth())) / 100.0f);
                    this.g.requestLayout();
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2), new Long(j3)}, this, f75235a, false, 87403, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
                    return;
                }
                break;
            case 2:
                if (PatchProxy.isSupport(new Object[0], this, f75235a, false, 87404, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f75235a, false, 87404, new Class[0], Void.TYPE);
                    break;
                } else {
                    a();
                    return;
                }
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f75235a, false, 87399, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f75235a, false, 87399, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(C0906R.layout.aav);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = com.bytedance.ies.dmt.ui.b.a.f20279f;
        window.addFlags(2);
        window.setBackgroundDrawableResource(2130840612);
        window.setGravity(17);
        window.setAttributes(attributes);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        this.f75237c = new WeakHandler(this);
        this.i = findViewById(C0906R.id.chu);
        this.f75238d = (TextView) findViewById(C0906R.id.d40);
        this.f75239e = (TextView) findViewById(C0906R.id.a7l);
        this.f75240f = (TextView) findViewById(C0906R.id.a3u);
        this.g = findViewById(C0906R.id.dog);
        this.j = (TextView) findViewById(C0906R.id.dob);
        this.k = (TextView) findViewById(C0906R.id.b7i);
        this.h = findViewById(C0906R.id.a5x);
        this.l = findViewById(C0906R.id.l7);
        this.m = (TextView) findViewById(C0906R.id.ao5);
        if (m.a().q() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!m.a().i() || !this.n) {
            z2 = false;
        }
        if (z2 && z) {
            onEvent("forcible_downloaded_show");
        } else if (z2) {
            onEvent("forcible_show");
        } else if (z) {
            onEvent("downloaded_show");
        } else {
            onEvent("show");
        }
        a();
    }

    public final void a(m mVar) {
        JSONObject jSONObject;
        long j2;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{mVar2}, this, f75235a, false, 87401, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar2}, this, f75235a, false, 87401, new Class[]{m.class}, Void.TYPE);
        } else if (mVar2 != null) {
            if (this.l.isSelected()) {
                if (PatchProxy.isSupport(new Object[0], mVar, m.f4275a, false, 87446, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], mVar, m.f4275a, false, 87446, new Class[0], Void.TYPE);
                } else if (TextUtils.isEmpty(mVar2.H) || TextUtils.isEmpty(mVar2.F)) {
                    Logger.debug();
                    mVar.u();
                } else {
                    try {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("label", "detail_ad");
                            jSONObject.put("ext_json", null);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    JSONObject jSONObject2 = jSONObject;
                    String str = mVar2.H;
                    String str2 = mVar2.F;
                    Context context = mVar2.i;
                    if (PatchProxy.isSupport(new Object[]{str, str2, context, (byte) 1, (byte) 0, (byte) 1, (byte) 0, jSONObject2}, null, p.f75917a, true, 87930, new Class[]{String.class, String.class, Context.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, JSONObject.class}, Long.TYPE)) {
                        j2 = ((Long) PatchProxy.accessDispatch(new Object[]{str, str2, context, (byte) 1, (byte) 0, (byte) 1, (byte) 0, jSONObject2}, null, p.f75917a, true, 87930, new Class[]{String.class, String.class, Context.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, JSONObject.class}, Long.TYPE)).longValue();
                    } else {
                        j2 = p.a(str, str2, context, true, null, null, false, true, false, false, jSONObject2);
                    }
                    if (j2 >= 0 && mVar2.Z != null) {
                        h.a(mVar2.i).f29059c.a(Long.valueOf(j2), mVar2.Z, "bind_app", -1, null);
                    }
                }
            } else {
                mVar.u();
            }
        }
    }

    public l(Context context, boolean z) {
        super(context);
        this.n = z;
        this.p = context.getString(C0906R.string.b4n);
    }
}
