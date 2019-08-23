package com.bytedance.android.livesdk.wallet;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArraySet;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.d;
import com.bytedance.android.live.core.utils.i;
import com.bytedance.android.live.uikit.dialog.b;
import com.bytedance.android.livesdk.config.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.af;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.wallet.a.f;
import com.bytedance.android.livesdk.wallet.api.WalletApi;
import com.bytedance.android.livesdk.wallet.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.r;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.aspectj.lang.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class p extends a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18126a;

    /* renamed from: b  reason: collision with root package name */
    public e f18127b;

    /* renamed from: c  reason: collision with root package name */
    protected b.a f18128c = new b.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18132a;

        public final void a(b bVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{bVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f18132a, false, 13985, new Class[]{b.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, Byte.valueOf(z)}, this, f18132a, false, 13985, new Class[]{b.class, Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                p.this.m = null;
                p.this.e();
            } else if (!bVar.a()) {
                String str = (String) a.f13644c.a();
                if (!TextUtils.isEmpty(str)) {
                    new b.a(p.this.getContext()).b((CharSequence) str).a(17039370, t.f18147b).a().show();
                }
            } else {
                p.this.m = bVar.q;
                p.this.e();
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    protected String f18129d;

    /* renamed from: e  reason: collision with root package name */
    protected String f18130e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f18131f;
    protected TextView g;
    protected TextView h;
    protected ProgressBar i;
    protected ViewGroup j;
    protected View k;
    protected com.bytedance.android.livesdkapi.depend.model.a l;
    protected r m;
    protected Context n;
    @SuppressLint({"UseSparseArrays"})
    protected final Map<Long, b> o = new HashMap();
    public final Set<r> p = new ArraySet();
    private ProgressDialog q;
    private final b r;
    private final b s;
    private final b t;
    private final boolean u;
    private final CompositeDisposable v = new CompositeDisposable();
    private final r[] w = {r.WEIXIN, r.ALIPAY};
    private View.OnClickListener x = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18136a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f18137c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f18136a, true, 13989, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f18136a, true, 13989, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("JsbPayDialog.java", AnonymousClass6.class);
            f18137c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.JsbPayDialog$6", "android.view.View", NotifyType.VIBRATE, "", "void"), 318);
        }

        public void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f18136a, false, 13988, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f18136a, false, 13988, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f18137c, this, this, view));
            if (p.this.m != null) {
                p.this.f18127b.a(p.this.l, p.this.m);
                com.bytedance.android.livesdk.w.b.an.a(p.this.m.name());
                switch (AnonymousClass7.f18139a[p.this.m.ordinal()]) {
                    case 1:
                        str = "wxpay";
                        break;
                    case 2:
                        str = "alipay";
                        break;
                    case 3:
                        str = "balance";
                        break;
                    default:
                        str = "TEST";
                        break;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("request_page", p.this.f18130e);
                hashMap.put("charge_reason", p.this.f18129d);
                hashMap.put("money", String.valueOf(p.this.l.f18682e + p.this.l.f18683f));
                hashMap.put("pay_method", str);
                com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_pay", hashMap, j.class, Room.class);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.wallet.p$7  reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18139a = new int[r.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.bytedance.android.livesdkapi.host.r[] r0 = com.bytedance.android.livesdkapi.host.r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18139a = r0
                int[] r0 = f18139a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.WEIXIN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f18139a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.ALIPAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f18139a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.FIRE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f18139a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.TEST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wallet.p.AnonymousClass7.<clinit>():void");
        }
    }

    public final void a() {
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.b bVar) {
    }

    public final void a(Exception exc, int i2) {
    }

    public final void b() {
    }

    public final void d() {
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f18126a, false, 13973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18126a, false, 13973, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null && this.q.isShowing()) {
            this.q.dismiss();
        }
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f18126a, false, 13966, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18126a, false, 13966, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.v.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f18126a, false, 13967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18126a, false, 13967, new Class[0], Void.TYPE);
            return;
        }
        this.i.setVisibility(0);
        this.h.setVisibility(8);
        this.k.setEnabled(false);
        this.j.removeAllViews();
        this.v.add(((WalletApi) com.bytedance.android.livesdk.v.j.q().d().a(WalletApi.class)).fetchOptionList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new r(this), new s(this)));
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f18126a, false, 13968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18126a, false, 13968, new Class[0], Void.TYPE);
            return;
        }
        this.f18131f.setText(ac.a((int) C0906R.string.dgo, Float.valueOf(((float) this.l.f18680c) / 100.0f)));
        TextView textView = this.g;
        StringBuilder sb = new StringBuilder();
        sb.append(ac.a((int) C0906R.string.dj1));
        sb.append(i.a("%.2f", Float.valueOf(((float) this.l.f18679b) / 100.0f)));
        textView.setText(sb);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f18126a, false, 13969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18126a, false, 13969, new Class[0], Void.TYPE);
            return;
        }
        if (this.m == null) {
            this.k.setEnabled(false);
            for (b next : this.o.values()) {
                if (next.h != null) {
                    next.h.setChecked(false);
                }
            }
        } else {
            Iterator<b> it2 = this.o.values().iterator();
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                b next2 = it2.next();
                if (next2.h != null) {
                    CheckBox checkBox = next2.h;
                    if (next2.q != this.m) {
                        z = false;
                    }
                    checkBox.setChecked(z);
                }
            }
            this.k.setEnabled(true);
        }
        h();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) throws Exception {
        com.bytedance.android.live.core.c.a.a(6, "PayDialog", th.getStackTrace());
        if (PatchProxy.isSupport(new Object[0], this, f18126a, false, 13971, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18126a, false, 13971, new Class[0], Void.TYPE);
            return;
        }
        this.i.setVisibility(8);
        this.h.setVisibility(0);
        this.k.setEnabled(false);
    }

    private JSONObject b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18126a, false, 13976, new Class[]{Integer.TYPE}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18126a, false, 13976, new Class[]{Integer.TYPE}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "pay");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("channel_param", i2);
            jSONObject.put("args", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18126a, false, 13972, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18126a, false, 13972, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String a2 = ac.a(i2);
        if (this.q == null) {
            Activity a3 = d.a(this.n);
            if (a3 != null) {
                this.q = af.a(a3, a2);
                this.q.setCancelable(false);
                this.q.setCanceledOnTouchOutside(false);
            }
        }
        if (this.q != null && !this.q.isShowing()) {
            this.q.setMessage(a2);
            this.q.show();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(c cVar) throws Exception {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f18126a, false, 13970, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18126a, false, 13970, new Class[0], Void.TYPE);
        } else {
            this.i.setVisibility(8);
            this.h.setVisibility(8);
        }
        for (f fVar : cVar.f7867b) {
            b bVar = this.o.get(Long.valueOf(fVar.f17879a));
            if (bVar != null) {
                if (fVar.f17882d) {
                    bVar.o = fVar.f17880b;
                    bVar.p = fVar.f17881c;
                    bVar.a(this.j);
                } else {
                    this.o.remove(Long.valueOf(fVar.f17879a));
                }
            }
        }
        String str = (String) com.bytedance.android.livesdk.w.b.an.a();
        if (StringUtils.isEmpty(str)) {
            this.m = null;
        } else if (r.valueOf(str) != r.FIRE || this.r.a()) {
            this.m = r.valueOf(str);
            if (this.m == r.FIRE || this.m == r.TEST) {
                this.m = r.WEIXIN;
            }
            if (this.p.contains(this.m)) {
                this.m = null;
                r[] rVarArr = this.w;
                int length = rVarArr.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    r rVar = rVarArr[i2];
                    if (!this.p.contains(rVar)) {
                        this.m = rVar;
                        break;
                    }
                    i2++;
                }
            }
        } else {
            this.m = null;
        }
        e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f18126a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 13965(0x368d, float:1.9569E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0030
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f18126a
            r4 = 0
            r5 = 13965(0x368d, float:1.9569E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0030:
            super.onCreate(r11)
            r0 = 2131691152(0x7f0f0690, float:1.9011368E38)
            r10.setContentView(r0)
            android.view.Window r1 = r10.getWindow()
            android.content.Context r0 = r10.getContext()     // Catch:{ Exception -> 0x0050 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x0050 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x0050 }
            int r0 = r0.orientation     // Catch:{ Exception -> 0x0050 }
            if (r0 != r8) goto L_0x004e
            goto L_0x0056
        L_0x004e:
            r0 = 0
            goto L_0x0057
        L_0x0050:
            r0 = move-exception
            java.lang.String r2 = "PayDialog"
            com.bytedance.android.live.core.c.a.a((java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x0056:
            r0 = 1
        L_0x0057:
            if (r1 == 0) goto L_0x0088
            r1 = -2
            r2 = -1
            if (r0 == 0) goto L_0x006e
            android.view.Window r0 = r10.getWindow()
            r0.setLayout(r2, r1)
            android.view.Window r0 = r10.getWindow()
            r1 = 80
            r0.setGravity(r1)
            goto L_0x0088
        L_0x006e:
            android.view.Window r0 = r10.getWindow()
            r0.setLayout(r1, r2)
            android.view.Window r0 = r10.getWindow()
            r1 = 2131493750(0x7f0c0376, float:1.8610989E38)
            r0.setWindowAnimations(r1)
            android.view.Window r0 = r10.getWindow()
            r1 = 21
            r0.setGravity(r1)
        L_0x0088:
            com.bytedance.android.livesdk.wallet.e r0 = new com.bytedance.android.livesdk.wallet.e
            android.content.Context r1 = r10.n
            android.app.Activity r3 = com.bytedance.android.live.core.utils.d.a(r1)
            com.bytedance.android.livesdk.wallet.p$5 r4 = new com.bytedance.android.livesdk.wallet.p$5
            r4.<init>()
            java.lang.String r5 = r10.f18129d
            java.lang.String r6 = r10.f18130e
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r10.f18127b = r0
            com.bytedance.android.livesdk.wallet.e r0 = r10.f18127b
            r0.a(r10)
            java.util.Set<com.bytedance.android.livesdkapi.host.r> r0 = r10.p
            r0.clear()
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r0 = com.bytedance.android.livesdk.config.a.f13643b
            java.lang.Object r0 = r0.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r0 & 1
            if (r1 <= 0) goto L_0x00c1
            java.util.Set<com.bytedance.android.livesdkapi.host.r> r1 = r10.p
            com.bytedance.android.livesdkapi.host.r r2 = com.bytedance.android.livesdkapi.host.r.WEIXIN
            r1.add(r2)
        L_0x00c1:
            r1 = 2
            r0 = r0 & r1
            if (r0 <= 0) goto L_0x00cc
            java.util.Set<com.bytedance.android.livesdkapi.host.r> r0 = r10.p
            com.bytedance.android.livesdkapi.host.r r2 = com.bytedance.android.livesdkapi.host.r.ALIPAY
            r0.add(r2)
        L_0x00cc:
            r0 = 2131170934(0x7f071676, float:1.795624E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f18131f = r0
            r0 = 2131170951(0x7f071687, float:1.7956275E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.g = r0
            r0 = 2131169206(0x7f070fb6, float:1.7952736E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r10.i = r0
            r0 = 2131168227(0x7f070be3, float:1.795075E38)
            android.view.View r0 = r10.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r10.j = r0
            r0 = 2131170842(0x7f07161a, float:1.7956054E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.h = r0
            android.widget.TextView r0 = r10.h
            com.bytedance.android.livesdk.wallet.q r2 = new com.bytedance.android.livesdk.wallet.q
            r2.<init>(r10)
            r0.setOnClickListener(r2)
            r0 = 2131165766(0x7f070246, float:1.7945758E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.k = r0
            android.view.View r0 = r10.k
            android.view.View$OnClickListener r2 = r10.x
            r0.setOnClickListener(r2)
            com.bytedance.android.livesdkapi.depend.model.a r0 = r10.l
            if (r0 == 0) goto L_0x0124
            r10.h()
        L_0x0124:
            boolean r0 = r10.u
            if (r0 != 0) goto L_0x0135
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.wallet.b> r0 = r10.o
            com.bytedance.android.livesdk.wallet.b r2 = r10.r
            long r2 = r2.j
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.remove(r2)
        L_0x0135:
            r10.f()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.android.livesdkapi.depend.model.a r2 = r10.l
            int r2 = r2.f18682e
            com.bytedance.android.livesdkapi.depend.model.a r3 = r10.l
            int r3 = r3.f18683f
            int r2 = r2 + r3
            java.lang.String r3 = "money"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r3, r2)
            java.lang.String r2 = "request_page"
            java.lang.String r3 = r10.f18130e
            r0.put(r2, r3)
            java.lang.String r2 = "charge_reason"
            java.lang.String r3 = r10.f18129d
            r0.put(r2, r3)
            com.bytedance.android.livesdk.j.a r2 = com.bytedance.android.livesdk.j.a.a()
            java.lang.String r3 = "livesdk_check_out_show"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Class<com.bytedance.android.livesdk.j.c.j> r4 = com.bytedance.android.livesdk.j.c.j.class
            r1[r9] = r4
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r1[r8] = r4
            r2.a(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wallet.p.onCreate(android.os.Bundle):void");
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f18126a, false, 13974, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f18126a, false, 13974, new Class[]{Exception.class}, Void.TYPE);
        } else if (exc2 instanceof com.bytedance.android.live.a.a.b.a) {
            ai.a(((com.bytedance.android.live.a.a.b.a) exc2).getPrompt());
        } else {
            ai.a((int) C0906R.string.cqc);
        }
    }

    public final void a(int i2, @Nullable com.bytedance.android.livesdk.wallet.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), aVar}, this, f18126a, false, 13975, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), aVar}, this, f18126a, false, 13975, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.g.c(i2));
        if (isShowing()) {
            dismiss();
        }
        ai.a((int) C0906R.string.cqj);
        com.bytedance.android.livesdk.v.j.q().f().a("H5_payStatus", b(1));
    }

    public final void b(Exception exc, int i2) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2, 0}, this, f18126a, false, 13977, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, 0}, this, f18126a, false, 13977, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (exc2 instanceof com.bytedance.android.live.a.a.b.a) {
            ai.a(((com.bytedance.android.live.a.a.b.a) exc2).getPrompt());
        } else {
            ai.a((int) C0906R.string.cqc);
        }
        com.bytedance.android.livesdk.v.j.q().f().a("H5_payStatus", b(2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Context context, boolean z, String str, String str2, @NonNull com.bytedance.android.livesdkapi.depend.model.a aVar) {
        super(context, C0906R.style.wb);
        AnonymousClass1 r0 = new b(0, 2130841285, 2130841286, ac.a((int) C0906R.string.dgm), r.FIRE) {
            public static ChangeQuickRedirect t;

            public final boolean a() {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[0], this, t, false, 13981, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, t, false, 13981, new Class[0], Boolean.TYPE)).booleanValue();
                }
                if (((long) p.this.l.f18682e) <= com.bytedance.android.livesdk.v.j.q().n().d() / 10) {
                    z = true;
                }
                return z;
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, t, false, 13982, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, t, false, 13982, new Class[0], Void.TYPE);
                    return;
                }
                String a2 = ac.a((int) C0906R.string.dgg);
                double c2 = (double) com.bytedance.android.livesdk.v.j.q().n().c();
                Double.isNaN(c2);
                StringBuilder sb = new StringBuilder(i.a(a2, Double.valueOf(c2 / 100.0d)));
                if (((long) p.this.l.f18682e) > com.bytedance.android.livesdk.v.j.q().n().d() / 10) {
                    sb.append(p.this.n.getString(C0906R.string.dgn));
                }
                this.n = sb.toString();
                this.f17972e.setText(this.n);
                this.f17972e.setVisibility(0);
            }
        };
        this.r = r0;
        AnonymousClass2 r02 = new b(1, 2130841281, 2130841282, ac.a((int) C0906R.string.dgf), r.ALIPAY) {
            public static ChangeQuickRedirect t;

            public final void b() {
            }

            public final boolean a() {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[0], this, t, false, 13983, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, t, false, 13983, new Class[0], Boolean.TYPE)).booleanValue();
                }
                if (!p.this.p.contains(r.ALIPAY)) {
                    z = true;
                }
                return z;
            }
        };
        this.s = r02;
        AnonymousClass3 r03 = new b(2, 2130841287, 2130841288, ac.a((int) C0906R.string.dgu), r.WEIXIN) {
            public static ChangeQuickRedirect t;

            public final void b() {
            }

            public final boolean a() {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[0], this, t, false, 13984, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, t, false, 13984, new Class[0], Boolean.TYPE)).booleanValue();
                }
                if (!p.this.p.contains(r.WEIXIN)) {
                    z = true;
                }
                return z;
            }
        };
        this.t = r03;
        this.n = context;
        this.u = false;
        this.f18129d = str;
        this.f18130e = str2;
        this.l = aVar;
        this.r.s = this.f18128c;
        this.s.s = this.f18128c;
        this.t.s = this.f18128c;
        this.o.put(Long.valueOf(this.r.j), this.r);
        this.o.put(Long.valueOf(this.s.j), this.s);
        this.o.put(Long.valueOf(this.t.j), this.t);
    }
}
