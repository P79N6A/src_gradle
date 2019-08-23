package com.ss.android.ugc.aweme.im.sdk.d;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import com.ss.android.ugc.aweme.im.sdk.utils.ImApi;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J(\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0017\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0006\u0010\u0018\u001a\u00020\bJ\f\u0010\u0019\u001a\u00020\u0006*\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/core/MixInitTask;", "", "()V", "mCompose", "Lio/reactivex/disposables/CompositeDisposable;", "mTokenRetryCount", "", "coldUp", "", "fetchToken", "handleRChat", "rCellStatus", "Lcom/ss/android/ugc/aweme/im/sdk/model/RMsgCellStatus;", "handleToken", "force", "", "imToken", "", "e", "", "handleXPlan", "isActiveX", "(Ljava/lang/Boolean;)V", "monitorTokenException", "refreshToken", "toInt", "Companion", "Holder", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51240a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f51241c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final CompositeDisposable f51242b;

    /* renamed from: d  reason: collision with root package name */
    private int f51243d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/core/MixInitTask$Companion;", "", "()V", "inst", "Lcom/ss/android/ugc/aweme/im/sdk/core/MixInitTask;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        @JvmStatic
        @NotNull
        public static h a() {
            return b.f51244a;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/core/MixInitTask$Holder;", "", "()V", "inst", "Lcom/ss/android/ugc/aweme/im/sdk/core/MixInitTask;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class b {
        @NotNull
        @JvmField

        /* renamed from: a  reason: collision with root package name */
        public static final h f51244a = new h((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f51245b = new b();

        private b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Consumer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51246a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f51247b = new c();

        c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f51246a, false, 51763, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f51246a, false, 51763, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            a.a().c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/im/sdk/model/MixInitResponse;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Consumer<com.ss.android.ugc.aweme.im.sdk.model.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51248a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f51249b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f51250c;

        d(h hVar, boolean z) {
            this.f51249b = hVar;
            this.f51250c = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ca  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                com.ss.android.ugc.aweme.im.sdk.model.b r8 = (com.ss.android.ugc.aweme.im.sdk.model.b) r8
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f51248a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.model.b> r1 = com.ss.android.ugc.aweme.im.sdk.model.b.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 51764(0xca34, float:7.2537E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003a
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f51248a
                r3 = 0
                r4 = 51764(0xca34, float:7.2537E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.model.b> r1 = com.ss.android.ugc.aweme.im.sdk.model.b.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r18
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x003a:
                com.ss.android.ugc.aweme.im.sdk.d.h r0 = r7.f51249b
                com.ss.android.ugc.aweme.im.sdk.model.c r1 = r8.f51821a
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.d.h.f51240a
                r14 = 0
                r15 = 51758(0xca2e, float:7.2528E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.model.c> r3 = com.ss.android.ugc.aweme.im.sdk.model.c.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x0073
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.d.h.f51240a
                r14 = 0
                r15 = 51758(0xca2e, float:7.2528E-41)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.model.c> r2 = com.ss.android.ugc.aweme.im.sdk.model.c.class
                r1[r10] = r2
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x00ec
            L_0x0073:
                if (r1 == 0) goto L_0x00ec
                com.ss.android.ugc.aweme.im.sdk.utils.o r0 = com.ss.android.ugc.aweme.im.sdk.utils.o.a()
                java.lang.String r2 = "IMSPUtils.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                long r2 = r0.g()
                long r4 = r1.f51824a
                r11 = 0
                int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r0 == 0) goto L_0x00ec
                java.lang.String r0 = "im_flip_chat"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r11 = "fetchRebootMiscState-delTime="
                r6.<init>(r11)
                r6.append(r4)
                java.lang.String r6 = r6.toString()
                com.ss.android.agilelogger.ALog.e((java.lang.String) r0, (java.lang.String) r6)
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x00af
                com.ss.android.ugc.aweme.im.sdk.utils.o r0 = com.ss.android.ugc.aweme.im.sdk.utils.o.a()
                java.lang.String r6 = "IMSPUtils.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r6)
                r0.a((long) r4)
            L_0x00ad:
                r0 = 1
                goto L_0x00b5
            L_0x00af:
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x00b4
                goto L_0x00ad
            L_0x00b4:
                r0 = 0
            L_0x00b5:
                long r11 = r1.f51825b
                int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r1 <= 0) goto L_0x00c8
                com.ss.android.ugc.aweme.im.sdk.utils.o r0 = com.ss.android.ugc.aweme.im.sdk.utils.o.a()
                java.lang.String r1 = "IMSPUtils.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.a((long) r4)
                r0 = 1
            L_0x00c8:
                if (r0 == 0) goto L_0x00ec
                com.ss.android.ugc.aweme.im.sdk.utils.o r0 = com.ss.android.ugc.aweme.im.sdk.utils.o.a()
                java.lang.String r1 = "IMSPUtils.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                boolean r0 = r0.f()
                if (r0 != 0) goto L_0x00ec
                com.ss.android.ugc.aweme.im.sdk.utils.o r0 = com.ss.android.ugc.aweme.im.sdk.utils.o.a()
                java.lang.String r1 = "IMSPUtils.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.b((boolean) r9)
                com.ss.android.ugc.aweme.im.sdk.d.k r0 = com.ss.android.ugc.aweme.im.sdk.d.k.a()
                r0.g()
            L_0x00ec:
                com.ss.android.ugc.aweme.im.sdk.d.h r0 = r7.f51249b
                java.lang.Boolean r1 = r8.f51822b
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.d.h.f51240a
                r14 = 0
                r15 = 51759(0xca2f, float:7.253E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x0124
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.d.h.f51240a
                r14 = 0
                r15 = 51759(0xca2f, float:7.253E-41)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                r1[r10] = r2
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0147
            L_0x0124:
                if (r1 == 0) goto L_0x0147
                boolean r0 = r1.booleanValue()
                if (r0 == 0) goto L_0x0147
                com.ss.android.ugc.aweme.im.sdk.utils.o r0 = com.ss.android.ugc.aweme.im.sdk.utils.o.a()
                java.lang.String r1 = "IMSPUtils.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                boolean r0 = r0.d()
                if (r0 != 0) goto L_0x0147
                com.ss.android.ugc.aweme.im.sdk.utils.o r0 = com.ss.android.ugc.aweme.im.sdk.utils.o.a()
                java.lang.String r1 = "IMSPUtils.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.a((boolean) r9)
            L_0x0147:
                com.ss.android.ugc.aweme.im.sdk.d.h r0 = r7.f51249b
                boolean r1 = r7.f51250c
                java.lang.String r2 = r8.f51823c
                r3 = 0
                r4 = 4
                com.ss.android.ugc.aweme.im.sdk.d.h.a(r0, r1, r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.d.h.d.accept(java.lang.Object):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f51252b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f51253c;

        e(h hVar, boolean z) {
            this.f51252b = hVar;
            this.f51253c = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f51251a, false, 51765, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f51251a, false, 51765, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            h.a(this.f51252b, this.f51253c, null, th, 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/im/sdk/model/MixInitResponse;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Consumer<com.ss.android.ugc.aweme.im.sdk.model.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f51255b;

        f(h hVar) {
            this.f51255b = hVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.im.sdk.model.b bVar = (com.ss.android.ugc.aweme.im.sdk.model.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51254a, false, 51766, new Class[]{com.ss.android.ugc.aweme.im.sdk.model.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51254a, false, 51766, new Class[]{com.ss.android.ugc.aweme.im.sdk.model.b.class}, Void.TYPE);
                return;
            }
            h.a(this.f51255b, true, bVar.f51823c, null, 4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f51257b;

        g(h hVar) {
            this.f51257b = hVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f51256a, false, 51767, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f51256a, false, 51767, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            h.a(this.f51257b, true, null, th, 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/im/sdk/model/MixInitResponse;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$h  reason: collision with other inner class name */
    public static final class C0598h<T> implements Consumer<com.ss.android.ugc.aweme.im.sdk.model.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f51259b;

        public C0598h(h hVar) {
            this.f51259b = hVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.im.sdk.model.b bVar = (com.ss.android.ugc.aweme.im.sdk.model.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51258a, false, 51768, new Class[]{com.ss.android.ugc.aweme.im.sdk.model.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51258a, false, 51768, new Class[]{com.ss.android.ugc.aweme.im.sdk.model.b.class}, Void.TYPE);
            } else if (TextUtils.isEmpty(bVar.f51823c)) {
                this.f51259b.a((Throwable) null);
            } else {
                o a2 = o.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "IMSPUtils.get()");
                a2.a(bVar.f51823c);
                ad.d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    public static final class i<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f51261b;

        public i(h hVar) {
            this.f51261b = hVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f51260a, false, 51769, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f51260a, false, 51769, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            this.f51261b.a(th);
        }
    }

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    @JvmStatic
    @NotNull
    public static final h b() {
        return PatchProxy.isSupport(new Object[0], null, f51240a, true, 51762, new Class[0], h.class) ? (h) PatchProxy.accessDispatch(new Object[0], null, f51240a, true, 51762, new Class[0], h.class) : a.a();
    }

    private h() {
        this.f51242b = new CompositeDisposable();
    }

    public final void a() {
        boolean z;
        Boolean bool;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f51240a, false, 51756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51240a, false, 51756, new Class[0], Void.TYPE);
            return;
        }
        this.f51243d = 0;
        this.f51242b.clear();
        if (com.ss.android.ugc.aweme.im.sdk.utils.d.a()) {
            o a2 = o.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "IMSPUtils.get()");
            boolean isEmpty = TextUtils.isEmpty(a2.j());
            if (!isEmpty) {
                this.f51242b.add(Single.just(Boolean.TRUE).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) c.f51247b));
            }
            if (isEmpty || o.a().l()) {
                z = true;
            } else {
                z = false;
            }
            if (bc.a()) {
                o a3 = o.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "IMSPUtils.get()");
                if (!a3.d()) {
                    z2 = true;
                }
            }
            try {
                com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
                FlipChatSettings av = b2.av();
                Intrinsics.checkExpressionValueIsNotNull(av, "SettingsReader.get().flipchatSettings");
                bool = av.getMainSwitch();
            } catch (Exception unused) {
                bool = Boolean.FALSE;
            }
            CompositeDisposable compositeDisposable = this.f51242b;
            ImApi a4 = r.a();
            Intrinsics.checkExpressionValueIsNotNull(bool, "needRChat");
            compositeDisposable.add(a4.fetchMixInit(a(bool.booleanValue()), a(z2), a(z)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(this, isEmpty), new e(this, isEmpty)));
        }
    }

    public /* synthetic */ h(byte b2) {
        this();
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f51240a, false, 51761, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f51240a, false, 51761, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("service", "fetch_token_failed");
            if (th != null) {
                jSONObject.put("error", th.toString());
            }
            com.bytedance.im.core.c.d.a("chat_room", "fetch_token_failed", jSONObject);
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ void a(h hVar, boolean z, String str, Throwable th, int i2) {
        String str2;
        Throwable th2;
        h hVar2 = hVar;
        if ((i2 & 2) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 4) != 0) {
            th2 = null;
        } else {
            th2 = th;
        }
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2, th2}, hVar, f51240a, false, 51760, new Class[]{Boolean.TYPE, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2, th2}, hVar, f51240a, false, 51760, new Class[]{Boolean.TYPE, String.class, Throwable.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str2)) {
            if (z && hVar2.f51243d <= 50) {
                hVar2.f51243d++;
                if (PatchProxy.isSupport(new Object[0], hVar, f51240a, false, 51755, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], hVar, f51240a, false, 51755, new Class[0], Void.TYPE);
                } else if (com.ss.android.ugc.aweme.im.sdk.utils.d.a()) {
                    hVar2.f51242b.add(r.a().fetchMixInit(0, 0, 1).delay(5, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new f(hVar), new g(hVar)));
                }
            }
            hVar.a(th2);
        } else {
            o a2 = o.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "IMSPUtils.get()");
            a2.a(str2);
            if (z) {
                a.a().c();
            }
        }
    }
}
