package com.ss.android.ugc.aweme.im.sdk.debug;

import a.g;
import a.i;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.m;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.concurrent.Callable;

public class DebugActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51303a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f51304b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f51305c;

    /* renamed from: d  reason: collision with root package name */
    public EditText f51306d;

    /* renamed from: e  reason: collision with root package name */
    public CheckBox f51307e;

    /* renamed from: f  reason: collision with root package name */
    public String f51308f;
    public String g;
    private TextView h;
    private TextView i;
    private TextView j;
    private Button k;
    private Button l;
    private Button m;
    private Button n;
    private EditText o;
    private EditText p;
    private EditText q;
    private RadioGroup r;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f51303a, false, 51841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51303a, false, 51841, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51303a, false, 51842, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51303a, false, 51842, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void a(final Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f51303a, false, 51835, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, this, f51303a, false, 51835, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        new AlertDialog.Builder(this).setTitle((CharSequence) "想清楚你在干什么！！").setMessage((CharSequence) "去掉严格模式，意味着不会对消息内容进行检查，如果将错误的消息发出去，可能会导致严重的后果！！").setCancelable(false).setNegativeButton((CharSequence) "好好好，我怂了", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51327a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51327a, false, 51850, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51327a, false, 51850, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                DebugActivity.this.f51307e.setChecked(true);
            }
        }).setPositiveButton((CharSequence) "我不怕死，来吧", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51324a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51324a, false, 51849, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51324a, false, 51849, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (runnable != null) {
                    runnable.run();
                }
            }
        }).show();
    }

    public void onClick(View view) {
        int intValue;
        String obj;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f51303a, false, 51838, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f51303a, false, 51838, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view == this.k) {
            if (PatchProxy.isSupport(new Object[0], this, f51303a, false, 51830, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51303a, false, 51830, new Class[0], Void.TYPE);
            } else {
                b a2 = d.a().a(this.f51308f);
                if (a2 != null) {
                    this.f51306d.setText(l.a(a2));
                } else {
                    this.f51306d.setText("会话不存在或还没有被加入内存中");
                }
            }
        } else if (view == this.l) {
            if (PatchProxy.isSupport(new Object[0], this, f51303a, false, 51832, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51303a, false, 51832, new Class[0], Void.TYPE);
            } else {
                n nVar = null;
                try {
                    nVar = (n) l.a(this.f51306d.getText().toString(), n.class);
                } catch (Exception unused) {
                }
                if (nVar != null) {
                    this.o.setText(String.valueOf(nVar.getMsgType()));
                    this.p.setText(String.valueOf(nVar.getContent()));
                } else {
                    a.a(Toast.makeText(this, "解析失败", 0));
                }
            }
        } else if (view == this.m) {
            if (PatchProxy.isSupport(new Object[0], this, f51303a, false, 51833, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51303a, false, 51833, new Class[0], Void.TYPE);
            } else {
                try {
                    if (TextUtils.isEmpty(this.o.getText())) {
                        intValue = Integer.valueOf(this.o.getHint().toString()).intValue();
                    } else {
                        intValue = Integer.valueOf(this.o.getText().toString()).intValue();
                    }
                    final int i2 = intValue;
                    if (TextUtils.isEmpty(this.p.getText())) {
                        obj = this.p.getHint().toString();
                    } else {
                        obj = this.p.getText().toString();
                    }
                    final String str = obj;
                    if (!this.f51307e.isChecked()) {
                        a(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f51320a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f51320a, false, 51848, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f51320a, false, 51848, new Class[0], Void.TYPE);
                                    return;
                                }
                                ad.c(new n.a().a(d.a().a(DebugActivity.this.f51308f)).a(i2).a(str).a());
                            }
                        });
                        return;
                    }
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f51303a, false, 51834, new Class[]{Integer.TYPE, String.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f51303a, false, 51834, new Class[]{Integer.TYPE, String.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        if (e.a(this.f51308f) >= 0) {
                            if (!TextUtils.isEmpty(str)) {
                                if (i2 != 7) {
                                    a.a(Toast.makeText(this, "严格模式下，该消息类型暂不支持", 0));
                                } else {
                                    BaseContent content = m.content(i2, str, false, 0);
                                    if (ad.a(content) != i2) {
                                        a.a(Toast.makeText(this, "消息内容和消息类型不匹配", 0));
                                    } else if (!content.isValid()) {
                                        a.a(Toast.makeText(this, "消息内容数据非法", 0));
                                    }
                                }
                                z = false;
                            }
                        }
                        a.a(Toast.makeText(this, "消息检查没通过，再看看？", 0));
                        z = false;
                    }
                    if (z) {
                        ad.c(new n.a().a(d.a().a(this.f51308f)).a(i2).a(str).a());
                    }
                } catch (Exception unused2) {
                    a.a(Toast.makeText(this, "哪一步错了，仔细检查一下", 0));
                }
            }
        } else if (view == this.n) {
            if (PatchProxy.isSupport(new Object[0], this, f51303a, false, 51837, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51303a, false, 51837, new Class[0], Void.TYPE);
                return;
            }
            String obj2 = this.q.getText().toString();
            try {
                Uri.parse(obj2);
                c.a().b().f20900f = obj2;
                a.a(Toast.makeText(this, "修改成功，下个请求生效，冷重启会重置", 0));
            } catch (Exception unused3) {
                a.a(Toast.makeText(this, "填的Host似乎不合法吧？", 0));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51303a, false, 51827, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51303a, false, 51827, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.rs);
        this.f51308f = getIntent().getStringExtra("EXTRA_CONVERSATION_ID");
        this.g = getIntent().getStringExtra("EXTRA_MSG_UUID");
        this.h = (TextView) findViewById(C0906R.id.dam);
        this.f51304b = (TextView) findViewById(C0906R.id.dio);
        this.f51305c = (TextView) findViewById(C0906R.id.dev);
        this.i = (TextView) findViewById(C0906R.id.dkv);
        this.j = (TextView) findViewById(C0906R.id.dbx);
        this.k = (Button) findViewById(C0906R.id.ov);
        this.l = (Button) findViewById(C0906R.id.nv);
        this.m = (Button) findViewById(C0906R.id.p2);
        this.n = (Button) findViewById(C0906R.id.o_);
        this.f51306d = (EditText) findViewById(C0906R.id.aad);
        this.o = (EditText) findViewById(C0906R.id.aaa);
        this.p = (EditText) findViewById(C0906R.id.aa_);
        this.q = (EditText) findViewById(C0906R.id.aa5);
        this.f51307e = (CheckBox) findViewById(C0906R.id.r2);
        this.r = (RadioGroup) findViewById(C0906R.id.ce8);
        this.k.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.f51307e.setOnCheckedChangeListener(this);
        this.r.setOnCheckedChangeListener(this);
        if (PatchProxy.isSupport(new Object[0], this, f51303a, false, 51828, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51303a, false, 51828, new Class[0], Void.TYPE);
        } else {
            this.h.setText(com.ss.android.ugc.aweme.im.sdk.utils.d.b());
            i.a((Callable<TResult>) new Callable<Pair<Integer, Integer>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51314a;

                /* access modifiers changed from: private */
                /* JADX WARNING: Removed duplicated region for block: B:25:0x0056 A[SYNTHETIC, Splitter:B:25:0x0056] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public android.util.Pair<java.lang.Integer, java.lang.Integer> call() throws java.lang.Exception {
                    /*
                        r9 = this;
                        r0 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r3 = f51314a
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class<android.util.Pair> r7 = android.util.Pair.class
                        r4 = 0
                        r5 = 51845(0xca85, float:7.265E-41)
                        r2 = r9
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0028
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r4 = f51314a
                        r5 = 0
                        r6 = 51845(0xca85, float:7.265E-41)
                        java.lang.Class[] r7 = new java.lang.Class[r0]
                        java.lang.Class<android.util.Pair> r8 = android.util.Pair.class
                        r3 = r9
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                        android.util.Pair r0 = (android.util.Pair) r0
                        return r0
                    L_0x0028:
                        r1 = 0
                        java.lang.String r2 = "select * from conversation_list"
                        com.bytedance.im.core.b.a.a.d.a()     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
                        com.bytedance.im.core.b.a.c.b r2 = com.bytedance.im.core.b.a.a.d.a(r2, r1)     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
                        if (r2 == 0) goto L_0x003c
                        int r3 = r2.b()     // Catch:{ Exception -> 0x0047, all -> 0x0039 }
                        goto L_0x003d
                    L_0x0039:
                        r0 = move-exception
                        r1 = r2
                        goto L_0x0042
                    L_0x003c:
                        r3 = 0
                    L_0x003d:
                        com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r2)
                        goto L_0x004b
                    L_0x0041:
                        r0 = move-exception
                    L_0x0042:
                        com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r1)
                        throw r0
                    L_0x0046:
                        r2 = r1
                    L_0x0047:
                        com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r2)
                        r3 = 0
                    L_0x004b:
                        java.lang.String r4 = "select * from msg"
                        com.bytedance.im.core.b.a.a.d.a()     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                        com.bytedance.im.core.b.a.c.b r1 = com.bytedance.im.core.b.a.a.d.a(r4, r1)     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                        if (r1 == 0) goto L_0x0065
                        int r2 = r1.b()     // Catch:{ Exception -> 0x0065, all -> 0x005c }
                        r0 = r2
                        goto L_0x0065
                    L_0x005c:
                        r0 = move-exception
                        r2 = r1
                        goto L_0x0060
                    L_0x005f:
                        r0 = move-exception
                    L_0x0060:
                        com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r2)
                        throw r0
                    L_0x0064:
                        r1 = r2
                    L_0x0065:
                        com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r1)
                        android.util.Pair r1 = new android.util.Pair
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r1.<init>(r2, r0)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity.AnonymousClass3.call():android.util.Pair");
                }
            }).a((g<TResult, TContinuationResult>) new g<Pair<Integer, Integer>, Object>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51312a;

                public final Object then(i<Pair<Integer, Integer>> iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f51312a, false, 51844, new Class[]{i.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f51312a, false, 51844, new Class[]{i.class}, Object.class);
                    }
                    if (iVar.b() && iVar.e() != null) {
                        DebugActivity.this.f51304b.setText(String.valueOf(((Pair) iVar.e()).first));
                        DebugActivity.this.f51305c.setText(String.valueOf(((Pair) iVar.e()).second));
                    }
                    return null;
                }
            }, i.f1052b);
        }
        if (PatchProxy.isSupport(new Object[0], this, f51303a, false, 51829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51303a, false, 51829, new Class[0], Void.TYPE);
        } else if (!TextUtils.isEmpty(this.f51308f)) {
            long a2 = e.a(this.f51308f);
            this.i.setText(String.valueOf(a2));
            if (a2 != -1) {
                IMUser b2 = com.ss.android.ugc.aweme.im.sdk.d.e.a().b(String.valueOf(a2));
                if (b2 != null) {
                    switch (b2.getFollowStatus()) {
                        case 0:
                            this.j.setText("没有互相关注或状态未知");
                            break;
                        case 1:
                            this.j.setText("当前用户单向关注对方");
                            break;
                        case 2:
                            this.j.setText("双向关注");
                            break;
                    }
                }
            }
            this.j.setText("用户不存在或本地没有数据");
        }
        if (PatchProxy.isSupport(new Object[0], this, f51303a, false, 51831, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51303a, false, 51831, new Class[0], Void.TYPE);
        } else {
            this.o.setHint("7");
            this.p.setHint(l.a(TextContent.obtain("这是一条测试消息")));
            if (!TextUtils.isEmpty(this.g)) {
                i.a((Callable<TResult>) new Callable<n>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f51318a;

                    public final /* synthetic */ Object call() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f51318a, false, 51847, new Class[0], n.class)) {
                            return (n) PatchProxy.accessDispatch(new Object[0], this, f51318a, false, 51847, new Class[0], n.class);
                        }
                        o.a();
                        return o.c(DebugActivity.this.g);
                    }
                }).a((g<TResult, TContinuationResult>) new g<n, Object>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f51316a;

                    public final Object then(i<n> iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f51316a, false, 51846, new Class[]{i.class}, Object.class)) {
                            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f51316a, false, 51846, new Class[]{i.class}, Object.class);
                        }
                        if (iVar.b() && iVar.e() != null) {
                            DebugActivity.this.f51306d.setText(l.a(iVar.e()));
                        }
                        return null;
                    }
                }, i.f1052b);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f51303a, false, 51836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51303a, false, 51836, new Class[0], Void.TYPE);
        } else {
            String str = c.a().b().f20900f;
            if (!TextUtils.isEmpty(str)) {
                this.q.setText(str);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onCreate", false);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f51303a, false, 51839, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f51303a, false, 51839, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (compoundButton == this.f51307e && !z) {
            a(null);
        }
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i2) {
        RadioGroup radioGroup2 = radioGroup;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{radioGroup2, Integer.valueOf(i2)}, this, f51303a, false, 51840, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{radioGroup2, Integer.valueOf(i2)}, this, f51303a, false, 51840, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (radioGroup2 == this.r) {
            if (i3 == C0906R.id.ca2) {
                c.a().b().j = 0;
            } else if (i3 == C0906R.id.ca4) {
                c.a().b().j = 1;
            } else if (i3 == C0906R.id.ca3) {
                c.a().b().j = 2;
            }
        }
    }
}
