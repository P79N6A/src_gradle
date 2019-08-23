package com.bytedance.android.livesdk.wallet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.ArraySet;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.i;
import com.bytedance.android.live.uikit.dialog.b;
import com.bytedance.android.livesdk.j.c.j;
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
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class v extends a {
    public static ChangeQuickRedirect n;
    @SuppressLint({"UseSparseArrays"})
    protected final Map<Long, b> A = new HashMap();
    public final Set<r> B = new ArraySet();

    /* renamed from: a  reason: collision with root package name */
    private final b f18151a;

    /* renamed from: b  reason: collision with root package name */
    private final b f18152b;

    /* renamed from: c  reason: collision with root package name */
    private final b f18153c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18154d;

    /* renamed from: e  reason: collision with root package name */
    private final CompositeDisposable f18155e = new CompositeDisposable();

    /* renamed from: f  reason: collision with root package name */
    private final r[] f18156f = {r.WEIXIN, r.ALIPAY};
    private View.OnClickListener g = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18159a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f18160c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f18159a, true, 14011, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f18159a, true, 14011, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("PayDialog.java", AnonymousClass5.class);
            f18160c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.PayDialog$5", "android.view.View", NotifyType.VIBRATE, "", "void"), 277);
        }

        public void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f18159a, false, 14010, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f18159a, false, 14010, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f18160c, this, this, view));
            if (v.this.y != null) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.g.b(v.this.x, v.this.y));
                com.bytedance.android.livesdk.w.b.an.a(v.this.y.name());
                switch (AnonymousClass6.f18162a[v.this.y.ordinal()]) {
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
                hashMap.put("request_page", v.this.q);
                hashMap.put("charge_reason", v.this.p);
                hashMap.put("money", String.valueOf(v.this.x.f18682e + v.this.x.f18683f));
                hashMap.put("pay_method", str);
                com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_pay", hashMap, j.class, Room.class);
            }
        }
    };
    protected b.a o = new b.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18157a;

        public final void a(b bVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{bVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f18157a, false, 14008, new Class[]{b.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, Byte.valueOf(z)}, this, f18157a, false, 14008, new Class[]{b.class, Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                v.this.y = null;
                v.this.i();
            } else if (!bVar.a()) {
                String str = (String) com.bytedance.android.livesdk.config.a.f13644c.a();
                if (!TextUtils.isEmpty(str)) {
                    new b.a(v.this.getContext()).b((CharSequence) str).a(17039370, z.f18170b).a().show();
                }
            } else {
                v.this.y = bVar.q;
                v.this.i();
            }
        }
    };
    protected String p;
    protected String q;
    protected TextView r;
    protected TextView s;
    protected TextView t;
    protected ProgressBar u;
    protected ViewGroup v;
    protected View w;
    protected com.bytedance.android.livesdkapi.depend.model.a x;
    protected r y;
    protected Context z;

    /* renamed from: com.bytedance.android.livesdk.wallet.v$6  reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18162a = new int[r.values().length];

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
                f18162a = r0
                int[] r0 = f18162a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.WEIXIN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f18162a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.ALIPAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f18162a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.FIRE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f18162a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdkapi.host.r r1 = com.bytedance.android.livesdkapi.host.r.TEST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wallet.v.AnonymousClass6.<clinit>():void");
        }
    }

    public void f() {
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 13994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 13994, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f18155e.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 13995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 13995, new Class[0], Void.TYPE);
            return;
        }
        this.u.setVisibility(0);
        this.t.setVisibility(8);
        this.w.setEnabled(false);
        this.v.removeAllViews();
        this.f18155e.add(((WalletApi) com.bytedance.android.livesdk.v.j.q().d().a(WalletApi.class)).fetchOptionList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new x(this), new y(this)));
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 13997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 13997, new Class[0], Void.TYPE);
            return;
        }
        this.r.setText(ac.a((int) C0906R.string.dgo, Float.valueOf(((float) this.x.f18680c) / 100.0f)));
        TextView textView = this.s;
        StringBuilder sb = new StringBuilder();
        sb.append(ac.a((int) C0906R.string.dj1));
        sb.append(i.a("%.2f", Float.valueOf(((float) this.x.f18679b) / 100.0f)));
        textView.setText(sb);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 13998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 13998, new Class[0], Void.TYPE);
            return;
        }
        if (this.y == null) {
            this.w.setEnabled(false);
            for (b next : this.A.values()) {
                if (next.h != null) {
                    next.h.setChecked(false);
                }
            }
        } else {
            Iterator<b> it2 = this.A.values().iterator();
            while (true) {
                boolean z2 = true;
                if (!it2.hasNext()) {
                    break;
                }
                b next2 = it2.next();
                if (next2.h != null) {
                    CheckBox checkBox = next2.h;
                    if (next2.q != this.y) {
                        z2 = false;
                    }
                    checkBox.setChecked(z2);
                }
            }
            this.w.setEnabled(true);
        }
        e();
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, n, false, 13996, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, n, false, 13996, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class}, Void.TYPE);
            return;
        }
        this.x = aVar;
        if (this.r != null) {
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(c cVar) throws Exception {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, n, false, 13999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 13999, new Class[0], Void.TYPE);
        } else {
            this.u.setVisibility(8);
            this.t.setVisibility(8);
        }
        f();
        for (f fVar : cVar.f7867b) {
            b bVar = this.A.get(Long.valueOf(fVar.f17879a));
            if (bVar != null) {
                if (fVar.f17882d) {
                    bVar.o = fVar.f17880b;
                    bVar.p = fVar.f17881c;
                    bVar.a(this.v);
                } else {
                    this.A.remove(Long.valueOf(fVar.f17879a));
                }
            }
        }
        String str = (String) com.bytedance.android.livesdk.w.b.an.a();
        if (StringUtils.isEmpty(str)) {
            this.y = null;
        } else if (r.valueOf(str) != r.FIRE || this.f18151a.a()) {
            this.y = r.valueOf(str);
            if (this.y == r.FIRE || this.y == r.TEST) {
                this.y = r.WEIXIN;
            }
            if (this.B.contains(this.y)) {
                this.y = null;
                r[] rVarArr = this.f18156f;
                int length = rVarArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    r rVar = rVarArr[i];
                    if (!this.B.contains(rVar)) {
                        this.y = rVar;
                        break;
                    }
                    i++;
                }
            }
        } else {
            this.y = null;
        }
        i();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) throws Exception {
        com.bytedance.android.live.core.c.a.a(6, "PayDialog", th.getStackTrace());
        if (PatchProxy.isSupport(new Object[0], this, n, false, 14000, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 14000, new Class[0], Void.TYPE);
            return;
        }
        this.u.setVisibility(8);
        this.t.setVisibility(0);
        this.w.setEnabled(false);
    }

    public void onCreate(Bundle bundle) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, n, false, 13993, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, n, false, 13993, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.ah3);
        Window window = getWindow();
        try {
            if (getContext().getResources().getConfiguration().orientation != 1) {
                z2 = false;
            }
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("PayDialog", (Throwable) e2);
        }
        if (window != null) {
            if (z2) {
                getWindow().setLayout(-1, -2);
                getWindow().setGravity(80);
            } else {
                getWindow().setLayout(-2, -1);
                getWindow().setWindowAnimations(C0906R.style.wi);
                getWindow().setGravity(21);
            }
        }
        this.B.clear();
        int intValue = ((Integer) com.bytedance.android.livesdk.config.a.f13643b.a()).intValue();
        if ((intValue & 1) > 0) {
            this.B.add(r.WEIXIN);
        }
        if ((intValue & 2) > 0) {
            this.B.add(r.ALIPAY);
        }
        this.r = (TextView) findViewById(C0906R.id.dgk);
        this.s = (TextView) findViewById(C0906R.id.dh1);
        this.u = (ProgressBar) findViewById(C0906R.id.c7w);
        this.v = (ViewGroup) findViewById(C0906R.id.bhf);
        this.t = (TextView) findViewById(C0906R.id.de3);
        this.t.setOnClickListener(new w(this));
        this.w = findViewById(C0906R.id.os);
        this.w.setOnClickListener(this.g);
        if (this.x != null) {
            e();
        }
        if (!this.f18154d) {
            this.A.remove(Long.valueOf(this.f18151a.j));
        }
        j();
    }

    public v(Context context, boolean z2, String str, String str2) {
        super(context, C0906R.style.wb);
        AnonymousClass1 r0 = new b(0, 2130841285, 2130841286, ac.a((int) C0906R.string.dgm), r.FIRE) {
            public static ChangeQuickRedirect t;

            public final boolean a() {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[0], this, t, false, 14004, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, t, false, 14004, new Class[0], Boolean.TYPE)).booleanValue();
                }
                if (((long) v.this.x.f18682e) <= com.bytedance.android.livesdk.v.j.q().n().d() / 10) {
                    z = true;
                }
                return z;
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, t, false, 14005, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, t, false, 14005, new Class[0], Void.TYPE);
                    return;
                }
                String a2 = ac.a((int) C0906R.string.dgg);
                double c2 = (double) com.bytedance.android.livesdk.v.j.q().n().c();
                Double.isNaN(c2);
                StringBuilder sb = new StringBuilder(i.a(a2, Double.valueOf(c2 / 100.0d)));
                if (((long) v.this.x.f18682e) > com.bytedance.android.livesdk.v.j.q().n().d() / 10) {
                    sb.append(v.this.z.getString(C0906R.string.dgn));
                }
                this.n = sb.toString();
                this.f17972e.setText(this.n);
                this.f17972e.setVisibility(0);
            }
        };
        this.f18151a = r0;
        AnonymousClass2 r02 = new b(1, 2130841281, 2130841282, ac.a((int) C0906R.string.dgf), r.ALIPAY) {
            public static ChangeQuickRedirect t;

            public final void b() {
            }

            public final boolean a() {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[0], this, t, false, 14006, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, t, false, 14006, new Class[0], Boolean.TYPE)).booleanValue();
                }
                if (!v.this.B.contains(r.ALIPAY)) {
                    z = true;
                }
                return z;
            }
        };
        this.f18152b = r02;
        AnonymousClass3 r03 = new b(2, 2130841287, 2130841288, ac.a((int) C0906R.string.dgu), r.WEIXIN) {
            public static ChangeQuickRedirect t;

            public final void b() {
            }

            public final boolean a() {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[0], this, t, false, 14007, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, t, false, 14007, new Class[0], Boolean.TYPE)).booleanValue();
                }
                if (!v.this.B.contains(r.WEIXIN)) {
                    z = true;
                }
                return z;
            }
        };
        this.f18153c = r03;
        this.z = context;
        this.f18154d = z2;
        this.p = str;
        this.q = str2;
        this.f18151a.s = this.o;
        this.f18152b.s = this.o;
        this.f18153c.s = this.o;
        this.A.put(Long.valueOf(this.f18151a.j), this.f18151a);
        this.A.put(Long.valueOf(this.f18152b.j), this.f18152b);
        this.A.put(Long.valueOf(this.f18153c.j), this.f18153c);
    }
}
