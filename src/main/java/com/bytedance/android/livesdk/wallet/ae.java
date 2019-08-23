package com.bytedance.android.livesdk.wallet;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.util.ArraySet;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.dialog.b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.g.c;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.af;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.wallet.a.d;
import com.bytedance.android.livesdk.wallet.a.h;
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
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public final class ae extends a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17921a;
    private final CompositeDisposable A = new CompositeDisposable();
    private final r[] B = {r.WEIXIN, r.ALIPAY};
    private View.OnClickListener C = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17931a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f17932c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f17931a, true, 14136, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f17931a, true, 14136, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("TTLivePayDialog.java", AnonymousClass5.class);
            f17932c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.TTLivePayDialog$5", "android.view.View", NotifyType.VIBRATE, "", "void"), 448);
        }

        public void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f17931a, false, 14135, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f17931a, false, 14135, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f17932c, this, this, view));
            if (ae.this.q != null) {
                ae.this.e();
                com.bytedance.android.livesdk.w.b.an.a(ae.this.q.name());
                switch (AnonymousClass6.f17934a[ae.this.q.ordinal()]) {
                    case 1:
                        str = "wxpay";
                        break;
                    case 2:
                        str = "alipay";
                        break;
                    default:
                        str = "TEST";
                        break;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("request_page", ae.this.f17924d);
                hashMap.put("charge_reason", ae.this.f17923c);
                hashMap.put("money", String.valueOf(ae.this.n.f18682e + ae.this.n.f18683f));
                hashMap.put("pay_method", str);
                if (ae.this.t == 1) {
                    hashMap.put("panel_type", "first_recharge");
                } else if (ae.this.t == 2) {
                    hashMap.put("panel_type", "small_heart");
                } else {
                    hashMap.put("panel_type", "normal");
                }
                com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_pay", hashMap, j.class, Room.class);
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    protected b.a f17922b = new b.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17927a;

        public final void a(b bVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{bVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f17927a, false, 14132, new Class[]{b.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, Byte.valueOf(z)}, this, f17927a, false, 14132, new Class[]{b.class, Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                ae.this.q = null;
                ae.this.f();
            } else if (!bVar.a()) {
                String str = (String) com.bytedance.android.livesdk.config.a.f13644c.a();
                if (!TextUtils.isEmpty(str)) {
                    new b.a(ae.this.getContext()).b((CharSequence) str).a(17039370, ak.f17946b).a().show();
                }
            } else {
                ae.this.q = bVar.q;
                ae.this.f();
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    protected String f17923c;

    /* renamed from: d  reason: collision with root package name */
    protected String f17924d;

    /* renamed from: e  reason: collision with root package name */
    protected TextView f17925e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f17926f;
    protected TextView g;
    protected TextView h;
    protected ProgressBar i;
    protected ViewGroup j;
    protected View k;
    protected View l;
    protected b m;
    protected com.bytedance.android.livesdkapi.depend.model.a n;
    protected d o;
    protected e p;
    protected r q;
    protected Context r;
    @SuppressLint({"UseSparseArrays"})
    protected final Map<Long, b> s = new HashMap();
    public int t = 0;
    public final Set<r> u = new ArraySet();
    private long v;
    private long w;
    private final b x;
    private final b y;
    private ProgressDialog z;

    /* renamed from: com.bytedance.android.livesdk.wallet.ae$6  reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17934a = new int[r.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.bytedance.android.livesdkapi.host.r[] r0 = com.bytedance.android.livesdkapi.host.r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17934a = r0
                int[] r0 = f17934a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.WEIXIN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f17934a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.ALIPAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f17934a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.TEST     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wallet.ae.AnonymousClass6.<clinit>():void");
        }
    }

    public final void a() {
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.b bVar) {
    }

    public final void a(Exception exc, int i2) {
    }

    public final void b() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) throws Exception {
        com.bytedance.android.live.core.c.a.a(6, "TTLivePayDialog", th.getStackTrace());
        a(null, th, this.o.f17872a, String.valueOf(this.m.j));
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f17921a, false, 14121, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f17921a, false, 14121, new Class[]{Exception.class}, Void.TYPE);
        } else if (exc2 instanceof com.bytedance.android.live.a.a.b.a) {
            ai.a(((com.bytedance.android.live.a.a.b.a) exc2).getPrompt());
        } else {
            ai.a((int) C0906R.string.cqc);
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f17921a, false, 14118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17921a, false, 14118, new Class[0], Void.TYPE);
            return;
        }
        this.j.removeAllViews();
        this.i.setVisibility(8);
        this.g.setVisibility(0);
        this.k.setEnabled(false);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f17921a, false, 14120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17921a, false, 14120, new Class[0], Void.TYPE);
            return;
        }
        if (this.z != null && this.z.isShowing()) {
            this.z.dismiss();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f17921a, false, 14124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17921a, false, 14124, new Class[0], Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.dgi);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f17921a, false, 14104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17921a, false, 14104, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.A.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f17921a, false, 14105, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17921a, false, 14105, new Class[0], Void.TYPE);
            return;
        }
        this.v = SystemClock.uptimeMillis();
        this.i.setVisibility(0);
        this.g.setVisibility(8);
        this.k.setEnabled(false);
        this.j.removeAllViews();
        this.A.add(((WalletApi) com.bytedance.android.livesdk.v.j.q().d().a(WalletApi.class)).createOrderInfo(String.valueOf(this.n.f18678a)).compose(i.a()).subscribe(new ag(this), new ah(this)));
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f17921a, false, 14108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17921a, false, 14108, new Class[0], Void.TYPE);
            return;
        }
        String str = (String) com.bytedance.android.livesdk.w.b.an.a();
        if (StringUtils.isEmpty(str)) {
            this.q = null;
            return;
        }
        this.q = r.valueOf(str);
        if (this.q == r.TEST) {
            this.q = r.WEIXIN;
        }
        if (this.u.contains(this.q)) {
            this.q = null;
            for (r rVar : this.B) {
                if (!this.u.contains(rVar)) {
                    this.q = rVar;
                    return;
                }
            }
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f17921a, false, 14115, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17921a, false, 14115, new Class[0], Void.TYPE);
            return;
        }
        this.f17925e.setText(ac.a((int) C0906R.string.dgo, Float.valueOf(((float) this.n.f18680c) / 100.0f)));
        TextView textView = this.f17926f;
        StringBuilder sb = new StringBuilder();
        sb.append(ac.a((int) C0906R.string.dj1));
        sb.append(com.bytedance.android.live.core.utils.i.a("%.2f", Float.valueOf(((float) this.n.f18679b) / 100.0f)));
        textView.setText(sb);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f17921a, false, 14109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17921a, false, 14109, new Class[0], Void.TYPE);
        } else if (this.o != null && this.m != null) {
            this.w = SystemClock.uptimeMillis();
            if (this.p.b() != null) {
                ((f) this.p.b()).a((int) C0906R.string.cui);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("OrderId", this.o.f17872a);
            hashMap.put("Cost", com.bytedance.android.live.core.utils.i.a("%.2f", Float.valueOf(((float) this.n.f18679b) / 100.0f)));
            hashMap.put("ChannelId", String.valueOf(this.m.j));
            TTLiveSDKContext.getHostService().a();
            hashMap.put("AppId", "1128");
            this.A.add(((WalletApi) com.bytedance.android.livesdk.v.j.q().d().a(WalletApi.class)).getRechargeParam(hashMap).compose(i.a()).subscribe(new ai(this), new aj(this)));
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f17921a, false, 14116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17921a, false, 14116, new Class[0], Void.TYPE);
            return;
        }
        if (this.q == null) {
            this.k.setEnabled(false);
            for (b next : this.s.values()) {
                if (next.h != null) {
                    next.h.setChecked(false);
                }
            }
        } else {
            Iterator<b> it2 = this.s.values().iterator();
            while (true) {
                boolean z2 = true;
                if (!it2.hasNext()) {
                    break;
                }
                b next2 = it2.next();
                if (next2.h != null) {
                    CheckBox checkBox = next2.h;
                    if (next2.q != this.q) {
                        z2 = false;
                    }
                    checkBox.setChecked(z2);
                    if (next2.h.isChecked()) {
                        this.m = next2;
                    }
                }
            }
            this.k.setEnabled(true);
        }
        j();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(com.bytedance.android.live.core.network.response.d dVar) throws Exception {
        a(dVar.f7871b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Throwable th) throws Exception {
        com.bytedance.android.live.core.c.a.a(6, "TTLivePayDialog", th.getStackTrace());
        a((Object) th);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.bytedance.android.live.core.network.response.d dVar) throws Exception {
        a((h) dVar.f7871b, null, this.o.f17872a, String.valueOf(this.m.j));
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f17921a, false, 14114, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f17921a, false, 14114, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class}, Void.TYPE);
            return;
        }
        this.n = aVar;
        if (this.f17925e != null) {
            f();
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f17921a, false, 14119, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f17921a, false, 14119, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String a2 = ac.a(i2);
        if (this.z == null) {
            Activity a3 = com.bytedance.android.live.core.utils.d.a(this.r);
            if (a3 != null) {
                this.z = af.a(a3, a2);
                this.z.setCancelable(false);
                this.z.setCanceledOnTouchOutside(false);
            }
        }
        if (this.z != null && !this.z.isShowing()) {
            this.z.setMessage(a2);
            this.z.show();
        }
    }

    private void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f17921a, false, 14107, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f17921a, false, 14107, new Class[]{d.class}, Void.TYPE);
        } else if (dVar != null && dVar.f17873b != null && dVar.f17873b.f17874a != null && !dVar.f17873b.f17874a.isEmpty()) {
            for (d.b next : dVar.f17873b.f17874a) {
                b bVar = this.s.get(Long.valueOf(next.f17875a));
                if (bVar != null) {
                    bVar.p = !TextUtils.isEmpty(next.f17876b.f17877a);
                    bVar.r = next.f17876b.f17877a;
                    bVar.a(this.j);
                }
            }
        }
    }

    private void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17921a, false, 14106, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17921a, false, 14106, new Class[]{Object.class}, Void.TYPE);
        } else if (obj instanceof Exception) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", ((Exception) obj).getMessage());
            com.bytedance.android.livesdk.wallet.b.b.f(1, SystemClock.uptimeMillis() - this.v, hashMap);
            com.bytedance.android.livesdk.wallet.b.b.e(1, SystemClock.uptimeMillis() - this.v, hashMap);
            k();
        } else {
            d dVar = (d) obj;
            this.o = dVar;
            if (PatchProxy.isSupport(new Object[0], this, f17921a, false, 14117, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17921a, false, 14117, new Class[0], Void.TYPE);
            } else {
                this.i.setVisibility(8);
                this.g.setVisibility(8);
            }
            a(dVar);
            i();
            f();
            com.bytedance.android.livesdk.wallet.b.b.e(0, SystemClock.uptimeMillis() - this.v, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f17921a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 14103(0x3717, float:1.9763E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0030
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f17921a
            r4 = 0
            r5 = 14103(0x3717, float:1.9763E-41)
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
            java.lang.String r2 = "TTLivePayDialog"
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
            java.util.Set<com.bytedance.android.livesdkapi.host.r> r0 = r10.u
            r0.clear()
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r0 = com.bytedance.android.livesdk.config.a.f13643b
            java.lang.Object r0 = r0.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r0 & 1
            if (r1 <= 0) goto L_0x00a4
            java.util.Set<com.bytedance.android.livesdkapi.host.r> r1 = r10.u
            com.bytedance.android.livesdkapi.host.r r2 = com.bytedance.android.livesdkapi.host.r.WEIXIN
            r1.add(r2)
        L_0x00a4:
            r1 = 2
            r0 = r0 & r1
            if (r0 <= 0) goto L_0x00af
            java.util.Set<com.bytedance.android.livesdkapi.host.r> r0 = r10.u
            com.bytedance.android.livesdkapi.host.r r2 = com.bytedance.android.livesdkapi.host.r.ALIPAY
            r0.add(r2)
        L_0x00af:
            r0 = 2131170934(0x7f071676, float:1.795624E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f17925e = r0
            r0 = 2131170951(0x7f071687, float:1.7956275E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f17926f = r0
            r0 = 2131170292(0x7f0713f4, float:1.7954938E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.h = r0
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
            r10.g = r0
            android.widget.TextView r0 = r10.g
            com.bytedance.android.livesdk.wallet.af r2 = new com.bytedance.android.livesdk.wallet.af
            r2.<init>(r10)
            r0.setOnClickListener(r2)
            r0 = 2131165766(0x7f070246, float:1.7945758E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.k = r0
            android.view.View r0 = r10.k
            android.view.View$OnClickListener r2 = r10.C
            r0.setOnClickListener(r2)
            r0 = 2131169133(0x7f070f6d, float:1.7952587E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.l = r0
            com.bytedance.android.livesdkapi.depend.model.a r0 = r10.n
            if (r0 == 0) goto L_0x011b
            r10.j()
        L_0x011b:
            android.widget.TextView r0 = r10.f17925e
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r10.l
            r0.setVisibility(r9)
            int r0 = r10.t
            if (r0 == r8) goto L_0x012f
            int r0 = r10.t
            if (r0 != r1) goto L_0x0142
        L_0x012f:
            com.bytedance.android.livesdkapi.depend.model.a r0 = r10.n
            java.lang.String r0 = r0.f18681d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0142
            android.widget.TextView r0 = r10.h
            com.bytedance.android.livesdkapi.depend.model.a r1 = r10.n
            java.lang.String r1 = r1.f18681d
            r0.setText(r1)
        L_0x0142:
            r10.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wallet.ae.onCreate(android.os.Bundle):void");
    }

    public final void b(Exception exc, int i2) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2, 0}, this, f17921a, false, 14123, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, 0}, this, f17921a, false, 14123, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
        } else if (exc2 instanceof com.bytedance.android.live.a.a.b.a) {
            ai.a(((com.bytedance.android.live.a.a.b.a) exc2).getPrompt());
        } else {
            ai.a((int) C0906R.string.cqc);
        }
    }

    public final void a(int i2, @Nullable com.bytedance.android.livesdk.wallet.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), aVar}, this, f17921a, false, 14122, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), aVar}, this, f17921a, false, 14122, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE);
            return;
        }
        c cVar = new c(i2);
        cVar.f14631a = this.t;
        com.bytedance.android.livesdk.u.a.a().a((Object) cVar);
        if (isShowing()) {
            dismiss();
        }
        ai.a((int) C0906R.string.cqj);
    }

    private void a(h hVar, Throwable th, String str, String str2) {
        com.bytedance.android.livesdkapi.depend.model.c cVar;
        String str3;
        int i2;
        Exception exc;
        h hVar2 = hVar;
        Throwable th2 = th;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{hVar2, th2, str4, str5}, this, f17921a, false, 14110, new Class[]{h.class, Throwable.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, th2, str4, str5}, this, f17921a, false, 14110, new Class[]{h.class, Throwable.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.p.b() != null) {
            ((f) this.p.b()).c();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str4);
        hashMap.put("channel_id", str5);
        if (th2 != null) {
            k();
            hashMap.put("error_msg", th.getMessage());
            if (th2 instanceof com.bytedance.android.live.a.a.a) {
                i2 = ((com.bytedance.android.live.a.a.a) th2).getErrorCode();
            } else {
                i2 = -17;
            }
            hashMap.put("error_code", Integer.valueOf(i2));
            com.bytedance.android.livesdk.wallet.b.b.i(1, SystemClock.uptimeMillis() - this.w, hashMap);
            com.bytedance.android.livesdk.wallet.b.b.i(1, SystemClock.uptimeMillis() - this.w, hashMap);
            if (this.p.b() != null) {
                f fVar = (f) this.p.b();
                if (th2 instanceof Exception) {
                    exc = (Exception) th2;
                } else {
                    exc = new Exception(th2);
                }
                fVar.a(exc);
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f17921a, false, 14111, new Class[]{h.class}, com.bytedance.android.livesdkapi.depend.model.c.class)) {
                cVar = (com.bytedance.android.livesdkapi.depend.model.c) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f17921a, false, 14111, new Class[]{h.class}, com.bytedance.android.livesdkapi.depend.model.c.class);
            } else if (hVar2 == null || hVar2.f17885b == null) {
                cVar = null;
            } else {
                h.a aVar = hVar2.f17885b;
                com.bytedance.android.livesdkapi.depend.model.c cVar2 = new com.bytedance.android.livesdkapi.depend.model.c();
                if (this.q == r.ALIPAY) {
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f17921a, false, 14112, new Class[]{h.a.class}, String.class)) {
                        str3 = (String) PatchProxy.accessDispatch(new Object[]{aVar}, this, f17921a, false, 14112, new Class[]{h.a.class}, String.class);
                    } else {
                        str3 = aVar.h;
                        if (com.bytedance.android.live.uikit.a.a.b()) {
                            if (!TextUtils.isEmpty(aVar.f17891f)) {
                                str3 = str3 + "&sign=" + aVar.f17891f;
                            }
                            if (!TextUtils.isEmpty(aVar.g)) {
                                str3 = str3 + "&sign_type=" + aVar.g;
                            }
                        } else {
                            if (!TextUtils.isEmpty(aVar.f17891f)) {
                                str3 = str3 + "&sign=\"" + aVar.f17891f + "\"";
                            }
                            if (!TextUtils.isEmpty(aVar.g)) {
                                str3 = str3 + "&sign_type=\"" + aVar.g + "\"";
                            }
                        }
                    }
                    cVar2.g = str3;
                }
                cVar2.h = aVar.f17890e;
                cVar2.k = aVar.f17889d;
                cVar2.i = aVar.f17886a;
                cVar2.j = aVar.f17887b;
                cVar2.m = aVar.f17891f;
                cVar2.l = aVar.f17888c;
                cVar2.f18695a = hVar2.f17884a;
                cVar2.f18696b = this.q;
                cVar2.f18700f = String.valueOf(this.m.j);
                cVar2.f18698d = this.n.f18682e + this.n.f18683f;
                cVar2.f18697c = String.valueOf(this.n.f18678a);
                cVar = cVar2;
            }
            if (this.p.b() != null) {
                this.p.b();
            }
            this.p.a(cVar, this.n, this.q);
            com.bytedance.android.livesdk.wallet.b.b.i(0, SystemClock.uptimeMillis() - this.w, hashMap);
            com.bytedance.android.livesdk.wallet.b.b.a(0, 0, SystemClock.uptimeMillis() - this.v, hashMap);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ae(android.content.Context r16, com.bytedance.android.livesdk.wallet.e r17, java.lang.String r18, java.lang.String r19, int r20) {
        /*
            r15 = this;
            r8 = r15
            r9 = r16
            r10 = r17
            r0 = 2131493743(0x7f0c036f, float:1.8610975E38)
            r15.<init>(r9, r0)
            com.bytedance.android.livesdk.wallet.ae$1 r11 = new com.bytedance.android.livesdk.wallet.ae$1
            r0 = 2131564167(0x7f0d1687, float:1.8753812E38)
            java.lang.String r6 = com.bytedance.android.live.core.utils.ac.a((int) r0)
            com.bytedance.android.livesdkapi.host.r r7 = com.bytedance.android.livesdkapi.host.r.ALIPAY
            r2 = 0
            r4 = 2130841281(0x7f020ec1, float:1.7287625E38)
            r5 = 2130841282(0x7f020ec2, float:1.7287627E38)
            r0 = r11
            r1 = r15
            r0.<init>(r2, r4, r5, r6, r7)
            r8.x = r11
            com.bytedance.android.livesdk.wallet.ae$2 r11 = new com.bytedance.android.livesdk.wallet.ae$2
            r0 = 2131564182(0x7f0d1696, float:1.8753842E38)
            java.lang.String r6 = com.bytedance.android.live.core.utils.ac.a((int) r0)
            com.bytedance.android.livesdkapi.host.r r7 = com.bytedance.android.livesdkapi.host.r.WEIXIN
            r2 = 1
            r4 = 2130841287(0x7f020ec7, float:1.7287637E38)
            r5 = 2130841288(0x7f020ec8, float:1.7287639E38)
            r0 = r11
            r0.<init>(r2, r4, r5, r6, r7)
            r8.y = r11
            com.bytedance.android.livesdk.wallet.ae$3 r0 = new com.bytedance.android.livesdk.wallet.ae$3
            r0.<init>()
            r8.f17922b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8.s = r0
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r8.A = r0
            r0 = 0
            r8.t = r0
            android.support.v4.util.ArraySet r1 = new android.support.v4.util.ArraySet
            r1.<init>()
            r8.u = r1
            r1 = 2
            com.bytedance.android.livesdkapi.host.r[] r1 = new com.bytedance.android.livesdkapi.host.r[r1]
            com.bytedance.android.livesdkapi.host.r r2 = com.bytedance.android.livesdkapi.host.r.WEIXIN
            r1[r0] = r2
            com.bytedance.android.livesdkapi.host.r r0 = com.bytedance.android.livesdkapi.host.r.ALIPAY
            r2 = 1
            r1[r2] = r0
            r8.B = r1
            com.bytedance.android.livesdk.wallet.ae$5 r0 = new com.bytedance.android.livesdk.wallet.ae$5
            r0.<init>()
            r8.C = r0
            r8.r = r9
            r8.p = r10
            r0 = r18
            r8.f17923c = r0
            r0 = r19
            r8.f17924d = r0
            r0 = r20
            r8.t = r0
            com.bytedance.android.livesdk.wallet.b r0 = r8.x
            com.bytedance.android.livesdk.wallet.b$a r1 = r8.f17922b
            r0.s = r1
            com.bytedance.android.livesdk.wallet.b r0 = r8.y
            com.bytedance.android.livesdk.wallet.b$a r1 = r8.f17922b
            r0.s = r1
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.wallet.b> r0 = r8.s
            com.bytedance.android.livesdk.wallet.b r1 = r8.x
            long r1 = r1.j
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.bytedance.android.livesdk.wallet.b r2 = r8.x
            r0.put(r1, r2)
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.wallet.b> r0 = r8.s
            com.bytedance.android.livesdk.wallet.b r1 = r8.y
            long r1 = r1.j
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.bytedance.android.livesdk.wallet.b r2 = r8.y
            r0.put(r1, r2)
            if (r10 != 0) goto L_0x00cc
            com.bytedance.android.livesdk.wallet.e r0 = new com.bytedance.android.livesdk.wallet.e
            android.content.Context r1 = r8.r
            android.app.Activity r10 = com.bytedance.android.live.core.utils.d.a(r1)
            com.bytedance.android.livesdk.wallet.ae$4 r11 = new com.bytedance.android.livesdk.wallet.ae$4
            r11.<init>()
            java.lang.String r12 = r8.f17923c
            java.lang.String r13 = r8.f17924d
            int r14 = r8.t
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            r8.p = r0
            com.bytedance.android.livesdk.wallet.e r0 = r8.p
            r0.a(r15)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wallet.ae.<init>(android.content.Context, com.bytedance.android.livesdk.wallet.e, java.lang.String, java.lang.String, int):void");
    }
}
