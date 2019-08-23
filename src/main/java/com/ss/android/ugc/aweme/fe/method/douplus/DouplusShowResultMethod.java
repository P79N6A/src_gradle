package com.ss.android.ugc.aweme.fe.method.douplus;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.hostbusiness.ILiveDouPlusApi;
import com.ss.android.ugc.aweme.live.model.c;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.DmtLoadingDialog;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0002J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0002J \u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/douplus/DouplusShowResultMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "()V", "douPlusApi", "Lcom/ss/android/ugc/aweme/live/hostbusiness/ILiveDouPlusApi;", "mLoadingDialog", "Lcom/ss/android/ugc/aweme/views/DmtLoadingDialog;", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "hideLoadingDialog", "queryOrderStatus", "time", "", "itemId", "", "logExtra", "sendOrderCheckLog", "suc", "", "showLoadingDialog", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DouplusShowResultMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44554a;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public DmtLoadingDialog f44555b;
    private ILiveDouPlusApi h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/douplus/DouplusShowResultMethod$Companion;", "", "()V", "DOUPLUS_SHOW_RESULT", "", "RETRY_DELAY_DURATION", "", "RETRY_TIMES", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44556a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DouplusShowResultMethod f44557b;

        b(DouplusShowResultMethod douplusShowResultMethod) {
            this.f44557b = douplusShowResultMethod;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f44556a, false, 39868, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44556a, false, 39868, new Class[0], Void.TYPE);
                return;
            }
            this.f44557b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "response", "Lcom/ss/android/ugc/aweme/live/model/DouPlusOrderStatusResponse;", "kotlin.jvm.PlatformType", "accept", "com/ss/android/ugc/aweme/fe/method/douplus/DouplusShowResultMethod$queryOrderStatus$1$1"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Consumer<com.ss.android.ugc.aweme.live.model.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44558a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DouplusShowResultMethod f44559b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f44560c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f44561d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ JSONObject f44562e;

        c(DouplusShowResultMethod douplusShowResultMethod, long j, Ref.IntRef intRef, JSONObject jSONObject) {
            this.f44559b = douplusShowResultMethod;
            this.f44560c = j;
            this.f44561d = intRef;
            this.f44562e = jSONObject;
        }

        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.live.model.b bVar = (com.ss.android.ugc.aweme.live.model.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f44558a, false, 39869, new Class[]{com.ss.android.ugc.aweme.live.model.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f44558a, false, 39869, new Class[]{com.ss.android.ugc.aweme.live.model.b.class}, Void.TYPE);
                return;
            }
            this.f44559b.a();
            if (bVar != null) {
                com.ss.android.ugc.aweme.live.model.c cVar = bVar.f53499a;
                if (cVar != null) {
                    c.a aVar = cVar.f53500a;
                    if (aVar != null && aVar.a()) {
                        this.f44559b.a(true, this.f44560c, this.f44562e);
                        Context context = (Context) this.f44559b.f3123e.get();
                        if (context != null) {
                            Activity a2 = com.ss.android.ugc.aweme.commerce.live.a.f36962b.a(context);
                            if (a2 != null) {
                                context = a2;
                            }
                            new a.C0185a(context).a((int) C0906R.string.a6s).b((int) C0906R.string.a6r).a((int) C0906R.string.a6q, (DialogInterface.OnClickListener) null).a().b();
                        }
                        bg.a(new com.ss.android.ugc.aweme.live.a.a(com.ss.android.ugc.aweme.live.a.a.f53185a));
                    }
                }
            }
            this.f44559b.a(false, this.f44560c, this.f44562e);
            com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.a6o).a();
            bg.a(new com.ss.android.ugc.aweme.live.a.a(com.ss.android.ugc.aweme.live.a.a.f53185a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "com/ss/android/ugc/aweme/fe/method/douplus/DouplusShowResultMethod$queryOrderStatus$1$2"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44563a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DouplusShowResultMethod f44564b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f44565c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f44566d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ JSONObject f44567e;

        d(DouplusShowResultMethod douplusShowResultMethod, long j, Ref.IntRef intRef, JSONObject jSONObject) {
            this.f44564b = douplusShowResultMethod;
            this.f44565c = j;
            this.f44566d = intRef;
            this.f44567e = jSONObject;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f44563a, false, 39870, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f44563a, false, 39870, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            this.f44566d.element++;
            if (this.f44566d.element == 4) {
                this.f44564b.a(false, this.f44565c, this.f44567e);
                this.f44564b.a();
                com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.a6o).a();
                bg.a(new com.ss.android.ugc.aweme.live.a.a(com.ss.android.ugc.aweme.live.a.a.f53185a));
                return;
            }
            this.f44564b.a(this.f44566d.element, this.f44565c, this.f44567e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/fe/method/douplus/DouplusShowResultMethod$showLoadingDialog$1$1"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44568a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f44569b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DouplusShowResultMethod f44570c;

        e(Context context, DouplusShowResultMethod douplusShowResultMethod) {
            this.f44569b = context;
            this.f44570c = douplusShowResultMethod;
        }

        public final void run() {
            Context context;
            if (PatchProxy.isSupport(new Object[0], this, f44568a, false, 39871, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44568a, false, 39871, new Class[0], Void.TYPE);
                return;
            }
            DmtLoadingDialog dmtLoadingDialog = this.f44570c.f44555b;
            if (dmtLoadingDialog != null) {
                dmtLoadingDialog.dismiss();
            }
            DouplusShowResultMethod douplusShowResultMethod = this.f44570c;
            Activity a2 = com.ss.android.ugc.aweme.commerce.live.a.f36962b.a(this.f44569b);
            if (a2 != null) {
                context = a2;
            } else {
                context = this.f44569b;
            }
            douplusShowResultMethod.f44555b = new DmtLoadingDialog(context, this.f44569b.getString(C0906R.string.a6p));
            DmtLoadingDialog dmtLoadingDialog2 = this.f44570c.f44555b;
            if (dmtLoadingDialog2 != null) {
                dmtLoadingDialog2.show();
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44554a, false, 39867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44554a, false, 39867, new Class[0], Void.TYPE);
            return;
        }
        DmtLoadingDialog dmtLoadingDialog = this.f44555b;
        if (dmtLoadingDialog != null) {
            dmtLoadingDialog.dismiss();
            DmtLoadingDialog dmtLoadingDialog2 = this.f44555b;
            if (dmtLoadingDialog2 != null) {
                dmtLoadingDialog2.isShowing();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0047, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable org.json.JSONObject r12, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            r10 = 1
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f44554a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 39863(0x9bb7, float:5.586E-41)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f44554a
            r3 = 0
            r4 = 39863(0x9bb7, float:5.586E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            if (r12 == 0) goto L_0x0049
            java.lang.String r0 = "item_id"
            java.lang.String r0 = r12.optString(r0)     // Catch:{ Exception -> 0x0050 }
            if (r0 != 0) goto L_0x004b
        L_0x0049:
            java.lang.String r0 = "0"
        L_0x004b:
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0050 }
            goto L_0x0052
        L_0x0050:
            r0 = 0
        L_0x0052:
            r7 = r0
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            if (r12 == 0) goto L_0x006a
            java.lang.String r0 = "room_id"
            java.lang.String r0 = r12.optString(r0)     // Catch:{ Exception -> 0x0068 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = "room_id"
            r10.put(r1, r0)     // Catch:{ Exception -> 0x0068 }
            goto L_0x006a
        L_0x0068:
            goto L_0x0097
        L_0x006a:
            if (r12 == 0) goto L_0x0079
            java.lang.String r0 = "order_id"
            java.lang.String r0 = r12.optString(r0)     // Catch:{ Exception -> 0x0068 }
            if (r0 == 0) goto L_0x0079
            java.lang.String r1 = "order_id"
            r10.put(r1, r0)     // Catch:{ Exception -> 0x0068 }
        L_0x0079:
            if (r12 == 0) goto L_0x0088
            java.lang.String r0 = "coupon_id"
            java.lang.String r0 = r12.optString(r0)     // Catch:{ Exception -> 0x0068 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = "coupon_id"
            r10.put(r1, r0)     // Catch:{ Exception -> 0x0068 }
        L_0x0088:
            if (r12 == 0) goto L_0x0097
            java.lang.String r0 = "entrance_type"
            java.lang.String r0 = r12.optString(r0)     // Catch:{ Exception -> 0x0068 }
            if (r0 == 0) goto L_0x0097
            java.lang.String r1 = "entrance_type"
            r10.put(r1, r0)     // Catch:{ Exception -> 0x0068 }
        L_0x0097:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f44554a
            r3 = 0
            r4 = 39865(0x9bb9, float:5.5863E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00bb
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f44554a
            r3 = 0
            r4 = 39865(0x9bb9, float:5.5863E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00d8
        L_0x00bb:
            java.lang.ref.WeakReference r0 = r11.f3123e
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L_0x00d8
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.ss.android.ugc.aweme.fe.method.douplus.DouplusShowResultMethod$e r2 = new com.ss.android.ugc.aweme.fe.method.douplus.DouplusShowResultMethod$e
            r2.<init>(r0, r11)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.post(r2)
        L_0x00d8:
            r11.a((int) r9, (long) r7, (org.json.JSONObject) r10)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.ss.android.ugc.aweme.fe.method.douplus.DouplusShowResultMethod$b r1 = new com.ss.android.ugc.aweme.fe.method.douplus.DouplusShowResultMethod$b
            r1.<init>(r11)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2 = 6000(0x1770, double:2.9644E-320)
            r0.postDelayed(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.douplus.DouplusShowResultMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    public final void a(boolean z, long j, JSONObject jSONObject) {
        boolean z2 = z;
        long j2 = j;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j2), jSONObject2}, this, f44554a, false, 39866, new Class[]{Boolean.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j2), jSONObject2}, this, f44554a, false, 39866, new Class[]{Boolean.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            jSONObject2.put("item_id", j2);
            if (!z2) {
                jSONObject2.put("error_status", "30001");
            }
        } catch (Exception unused) {
        }
        n.a("dou_order_pay_live", z2 ? 1 : 0, jSONObject2);
    }

    public final void a(int i, long j, JSONObject jSONObject) {
        long j2;
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j3), jSONObject}, this, f44554a, false, 39864, new Class[]{Integer.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j3), jSONObject}, this, f44554a, false, 39864, new Class[]{Integer.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i;
        if (this.h == null) {
            this.h = (ILiveDouPlusApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ILiveDouPlusApi.class);
        }
        ILiveDouPlusApi iLiveDouPlusApi = this.h;
        if (iLiveDouPlusApi != null) {
            Observable observeOn = iLiveDouPlusApi.queryOrderStatus(j3).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            if (intRef.element == 0) {
                j2 = 0;
            } else {
                j2 = 1500;
            }
            Observable delaySubscription = observeOn.delaySubscription(j2, TimeUnit.MILLISECONDS);
            long j4 = j;
            Ref.IntRef intRef2 = intRef;
            JSONObject jSONObject2 = jSONObject;
            c cVar = new c(this, j4, intRef2, jSONObject2);
            Consumer consumer = cVar;
            d dVar = new d(this, j4, intRef2, jSONObject2);
            delaySubscription.subscribe(consumer, dVar);
        }
    }
}
