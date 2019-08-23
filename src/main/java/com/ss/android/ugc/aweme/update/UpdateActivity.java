package com.ss.android.ugc.aweme.update;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.SSActivity;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.utils.p;
import java.io.File;

public class UpdateActivity extends SSActivity implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75181a;

    /* renamed from: b  reason: collision with root package name */
    m f75182b;

    /* renamed from: c  reason: collision with root package name */
    Handler f75183c;

    /* renamed from: d  reason: collision with root package name */
    a f75184d;

    /* renamed from: e  reason: collision with root package name */
    String f75185e;

    /* renamed from: f  reason: collision with root package name */
    Button f75186f;
    Button g;
    Button h;
    Button i;
    Button j;
    TextView k;
    View m;
    ProgressBar n;
    TextView o;
    View p;
    View q;
    TextView r;
    String s = "";

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75197a;

        /* renamed from: b  reason: collision with root package name */
        a f75198b = new a();

        /* renamed from: c  reason: collision with root package name */
        volatile boolean f75199c = false;

        public final synchronized void a() {
            this.f75199c = true;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f75197a, false, 87398, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75197a, false, 87398, new Class[0], Void.TYPE);
                return;
            }
            while (true) {
                try {
                    Thread.sleep(1500);
                } catch (Exception unused) {
                }
                if (!UpdateActivity.this.f75182b.g()) {
                    break;
                }
                UpdateActivity.this.f75182b.a(this.f75198b);
                Message obtainMessage = UpdateActivity.this.f75183c.obtainMessage(1);
                obtainMessage.obj = this.f75198b;
                synchronized (this) {
                    if (!this.f75199c) {
                        UpdateActivity.this.f75183c.sendMessage(obtainMessage);
                    }
                }
            }
            if (!this.f75199c) {
                UpdateActivity.this.f75183c.sendEmptyMessage(2);
            }
        }

        a() {
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f75181a, false, 87391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75181a, false, 87391, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.update.UpdateActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.update.UpdateActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f75181a, false, 87392, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f75181a, false, 87392, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.update.UpdateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f75181a, false, 87386, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75181a, false, 87386, new Class[0], Void.TYPE);
            return;
        }
        String a2 = m.a(this.f75182b.f());
        if (a2 == null) {
            a2 = "";
        }
        this.r.setText(a2);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f75181a, false, 87379, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75181a, false, 87379, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f75184d != null) {
            this.f75184d.a();
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f75181a, false, 87380, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75181a, false, 87380, new Class[0], Void.TYPE);
        } else if (this.f75182b.g()) {
            if (this.f75184d != null) {
                this.f75184d.a();
            }
            this.f75184d = new a();
            this.f75184d.start();
            h();
        } else if (!this.f75182b.h()) {
            f();
        } else if (this.f75182b.q() != null) {
            g();
        } else {
            e();
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f75181a, false, 87385, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75181a, false, 87385, new Class[0], Void.TYPE);
            return;
        }
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.g.setVisibility(8);
        this.f75186f.setVisibility(8);
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f75181a, false, 87387, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75181a, false, 87387, new Class[0], Void.TYPE);
            return;
        }
        String e2 = this.f75182b.e();
        if (e2 == null) {
            e2 = "";
        }
        String string = getString(C0906R.string.cbx);
        this.k.setText(String.format(string, new Object[]{this.f75185e, e2}));
        this.p.setVisibility(0);
        this.m.setVisibility(8);
        this.q.setVisibility(0);
        d();
        c();
        this.h.setVisibility(0);
        this.g.setVisibility(0);
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f75181a, false, 87388, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75181a, false, 87388, new Class[0], Void.TYPE);
            return;
        }
        String string = getString(C0906R.string.cc0);
        this.k.setText(String.format(string, new Object[]{this.f75185e}));
        this.p.setVisibility(8);
        this.m.setVisibility(8);
        this.q.setVisibility(4);
        c();
        this.f75186f.setVisibility(0);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f75181a, false, 87389, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75181a, false, 87389, new Class[0], Void.TYPE);
            return;
        }
        String e2 = this.f75182b.e();
        String string = getString(C0906R.string.cc1);
        this.k.setText(String.format(string, new Object[]{this.f75185e, e2}));
        this.p.setVisibility(0);
        this.m.setVisibility(8);
        this.q.setVisibility(0);
        d();
        c();
        this.i.setVisibility(0);
        this.g.setVisibility(0);
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f75181a, false, 87390, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75181a, false, 87390, new Class[0], Void.TYPE);
            return;
        }
        String e2 = this.f75182b.e();
        String string = getString(C0906R.string.cbx);
        this.k.setText(String.format(string, new Object[]{this.f75185e, e2}));
        this.q.setVisibility(0);
        d();
        c();
        this.j.setVisibility(0);
        this.f75186f.setVisibility(0);
        this.p.setVisibility(0);
        this.m.setVisibility(0);
        this.n.setProgress(0);
        this.o.setText(" ");
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75181a, false, 87381, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75181a, false, 87381, new Class[0], Void.TYPE);
        } else if (!this.f75182b.h()) {
            f();
        } else {
            this.f75182b.b();
            File q2 = this.f75182b.q();
            if (q2 != null) {
                this.f75182b.c();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(1);
                intent.setDataAndType(p.a((Context) this, q2), "application/vnd.android.package-archive");
                startActivity(intent);
                finish();
                return;
            }
            this.f75182b.v();
            if (this.f75184d != null) {
                this.f75184d.a();
            }
            this.f75184d = new a();
            this.f75184d.start();
            h();
        }
    }

    private String a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f75181a, false, 87384, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f75181a, false, 87384, new Class[]{Long.TYPE}, String.class);
        } else if (j3 >= 1048576) {
            return String.format("%.2f MB", new Object[]{Float.valueOf(((float) j3) / 1048576.0f)});
        } else if (j3 >= 1024) {
            return String.format("%.2f KB", new Object[]{Float.valueOf(((float) j3) / 1024.0f)});
        } else {
            return String.format("%d B", new Object[]{Long.valueOf(j2)});
        }
    }

    public void handleMsg(Message message) {
        a aVar;
        Message message2 = message;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f75181a, false, 87382, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f75181a, false, 87382, new Class[]{Message.class}, Void.TYPE);
        } else if (isViewValid()) {
            switch (message2.what) {
                case 1:
                    if (message2.obj == null || !(message2.obj instanceof a)) {
                        aVar = new a();
                    } else {
                        aVar = (a) message2.obj;
                    }
                    long j2 = aVar.f75201a;
                    long j3 = aVar.f75202b;
                    if (!PatchProxy.isSupport(new Object[]{new Long(j2), new Long(j3)}, this, f75181a, false, 87383, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
                        String str = this.s;
                        if (j2 > 0) {
                            i2 = 10;
                        }
                        if (j3 > 0) {
                            str = a(j3);
                            i2 = (int) ((100 * j2) / j3);
                            if (i2 > 99) {
                                i2 = 99;
                            }
                        }
                        this.n.setProgress(i2);
                        this.o.setText(a(j2) + " / " + str);
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[]{new Long(j2), new Long(j3)}, this, f75181a, false, 87383, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
                        return;
                    }
                    break;
                case 2:
                    b();
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f75181a, false, 87378, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f75181a, false, 87378, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.update.UpdateActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ape);
        this.f75182b = m.a();
        this.f75183c = new WeakHandler(this);
        m mVar = this.f75182b;
        if (PatchProxy.isSupport(new Object[0], mVar, m.f4275a, false, 87416, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], mVar, m.f4275a, false, 87416, new Class[0], String.class);
        } else {
            str = mVar.h.getStringAppName();
        }
        this.f75185e = str;
        this.s = getString(C0906R.string.cc5);
        this.k = (TextView) findViewById(C0906R.id.doh);
        this.p = findViewById(C0906R.id.bwh);
        this.m = findViewById(C0906R.id.c7t);
        this.n = (ProgressBar) findViewById(C0906R.id.c7k);
        this.o = (TextView) findViewById(C0906R.id.c80);
        this.q = findViewById(C0906R.id.dxi);
        this.r = (TextView) findViewById(C0906R.id.dxh);
        this.f75186f = (Button) findViewById(C0906R.id.ix);
        this.f75186f.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75187a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f75187a, false, 87393, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f75187a, false, 87393, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.finish();
            }
        });
        this.g = (Button) findViewById(C0906R.id.q6);
        this.g.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75189a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f75189a, false, 87394, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f75189a, false, 87394, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.f75182b.b();
                UpdateActivity.this.f75182b.c();
                UpdateActivity.this.finish();
            }
        });
        this.h = (Button) findViewById(C0906R.id.doa);
        this.h.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75191a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f75191a, false, 87395, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f75191a, false, 87395, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.a();
            }
        });
        this.j = (Button) findViewById(C0906R.id.cvz);
        this.j.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75193a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f75193a, false, 87396, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f75193a, false, 87396, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (UpdateActivity.this.f75184d != null) {
                    UpdateActivity.this.f75184d.a();
                }
                UpdateActivity.this.f75184d = null;
                m mVar = UpdateActivity.this.f75182b;
                if (PatchProxy.isSupport(new Object[0], mVar, m.f4275a, false, 87453, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], mVar, m.f4275a, false, 87453, new Class[0], Void.TYPE);
                } else {
                    synchronized (mVar.Q) {
                        if (mVar.S != null) {
                            mVar.S.a();
                        }
                        if (mVar.R != null) {
                            mVar.R.a();
                        }
                        mVar.k.sendEmptyMessage(13);
                    }
                }
                UpdateActivity.this.finish();
            }
        });
        this.i = (Button) findViewById(C0906R.id.auz);
        this.i.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75195a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f75195a, false, 87397, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f75195a, false, 87397, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.a();
            }
        });
        b();
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.getBoolean("from_update_avail")) {
                q.a(this, "more_tab", "notify_version_click");
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.update.UpdateActivity", "onCreate", false);
    }
}
