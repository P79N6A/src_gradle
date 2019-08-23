package com.ss.android.ugc.aweme.antiaddic.lock;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.profile.ui.DmtStatusViewDialog;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.af;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001%B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0007J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000eJ\u0014\u0010\u0013\u001a\u00020\t2\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u0018\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u001cJ\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000eH\u0002J\u0010\u0010$\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/ParentalPlatformManager;", "Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager$PushSettingCallback;", "()V", "callbackList", "", "Lcom/ss/android/ugc/aweme/antiaddic/lock/ParentalPlatformManager$ParentalPlatformInfoCallback;", "isInProcess", "", "enterDigitalWellbeing", "", "context", "Landroid/app/Activity;", "getDynamicPassword", "uid", "", "Landroid/content/Context;", "interceptQRCode", "result", "isParentalQRCode", "onFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onParentalModeChanged", "event", "Lcom/ss/android/ugc/aweme/fe/method/BroadcastMethod$JsBroadCastEvent;", "onSettingChanged", "setting", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "onSuccess", "settings", "setParentalData", "callback", "pushSettings", "showDynamicPassword", "password", "syncParentalData", "ParentalPlatformInfoCallback", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ParentalPlatformManager implements a.C0028a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2598a;

    /* renamed from: b  reason: collision with root package name */
    public static final ParentalPlatformManager f2599b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<a> f2600c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f2601d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/ParentalPlatformManager$ParentalPlatformInfoCallback;", "", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "tennModeChanged", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(@NotNull com.ss.android.ugc.aweme.setting.serverpush.a.c cVar, boolean z);

        void a(@NotNull Exception exc);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/antiaddic/lock/ParentalPlatformManager$enterDigitalWellbeing$1", "Lcom/ss/android/ugc/aweme/antiaddic/lock/ParentalPlatformManager$ParentalPlatformInfoCallback;", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "tennModeChanged", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33402a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f33403b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f33404c;

        public final void a(@NotNull Exception exc) {
            if (PatchProxy.isSupport(new Object[]{exc}, this, f33402a, false, 21755, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc}, this, f33402a, false, 21755, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(exc, "e");
            ((DmtStatusViewDialog) this.f33403b.element).dismiss();
            com.ss.android.ugc.aweme.app.api.a.a.a((Context) this.f33404c, (Throwable) exc);
        }

        b(Ref.ObjectRef objectRef, Activity activity) {
            this.f33403b = objectRef;
            this.f33404c = activity;
        }

        public final void a(@NotNull com.ss.android.ugc.aweme.setting.serverpush.a.c cVar, boolean z) {
            String str;
            com.ss.android.ugc.aweme.setting.serverpush.a.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f33402a, false, 21754, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar2, Byte.valueOf(z)}, this, f33402a, false, 21754, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "settings");
            ((DmtStatusViewDialog) this.f33403b.element).dismiss();
            if (!z) {
                if (b.f33436b.b() == b.a.CHILD) {
                    h a2 = h.a();
                    b bVar = b.f33436b;
                    if (PatchProxy.isSupport(new Object[0], bVar, b.f33435a, false, 21735, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], bVar, b.f33435a, false, 21735, new Class[0], String.class);
                    } else {
                        SharePrefCache inst = SharePrefCache.inst();
                        Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
                        an guardianChildScheme = inst.getGuardianChildScheme();
                        Intrinsics.checkExpressionValueIsNotNull(guardianChildScheme, "SharePrefCache.inst().guardianChildScheme");
                        String str2 = (String) guardianChildScheme.c();
                        if (str2 != null) {
                            if (!(!TextUtils.isEmpty(str2))) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                str = str2;
                            }
                        }
                        str = bVar.d();
                    }
                    a2.a(str);
                    return;
                }
                this.f33404c.startActivity(new Intent(this.f33404c, DigitalWellbeingActivity.class));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "ParentalPlatformManager.kt", c = {169}, d = "invokeSuspend", e = "com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$getDynamicPassword$1")
    public static final class c extends k implements Function2<af, kotlin.coroutines.c<? super Unit>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $context;
        final /* synthetic */ q $future;
        Object L$0;
        int label;
        private af p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(q qVar, Context context, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.$future = qVar;
            this.$context = context;
        }

        @NotNull
        public final kotlin.coroutines.c<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.c<?> cVar) {
            if (PatchProxy.isSupport(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 21757, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class)) {
                return (kotlin.coroutines.c) PatchProxy.accessDispatch(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 21757, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            c cVar2 = new c(this.$future, this.$context, cVar);
            cVar2.p$ = (af) obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            Object obj3 = obj;
            if (PatchProxy.isSupport(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 21758, new Class[]{Object.class, Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 21758, new Class[]{Object.class, Object.class}, Object.class);
            }
            return ((c) create(obj3, (kotlin.coroutines.c) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0081 A[Catch:{ Exception -> 0x00cb }] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x009d A[Catch:{ Exception -> 0x00cb }] */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
            /*
                r13 = this;
                r8 = 1
                java.lang.Object[] r1 = new java.lang.Object[r8]
                r9 = 0
                r1[r9] = r14
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r8]
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                r6[r9] = r2
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r4 = 0
                r5 = 21756(0x54fc, float:3.0487E-41)
                r2 = r13
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0033
                java.lang.Object[] r1 = new java.lang.Object[r8]
                r1[r9] = r14
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                r4 = 0
                r5 = 21756(0x54fc, float:3.0487E-41)
                java.lang.Class[] r6 = new java.lang.Class[r8]
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                r6[r9] = r0
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r2 = r13
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                java.lang.Object r0 = (java.lang.Object) r0
                return r0
            L_0x0033:
                java.lang.Object r1 = kotlin.coroutines.a.b.a()
                int r2 = r13.label
                switch(r2) {
                    case 0: goto L_0x0046;
                    case 1: goto L_0x0044;
                    default: goto L_0x003c;
                }
            L_0x003c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0044:
                r0 = r14
                goto L_0x0055
            L_0x0046:
                kotlinx.coroutines.af r0 = r13.p$
                com.google.common.util.concurrent.q r2 = r13.$future     // Catch:{ Exception -> 0x00cb }
                r13.L$0 = r0     // Catch:{ Exception -> 0x00cb }
                r13.label = r8     // Catch:{ Exception -> 0x00cb }
                java.lang.Object r0 = com.ss.android.ugc.aweme.antiaddic.lock.api.a.a(r2, r13)     // Catch:{ Exception -> 0x00cb }
                if (r0 != r1) goto L_0x0055
                return r1
            L_0x0055:
                com.ss.android.ugc.aweme.antiaddic.lock.entity.a r0 = (com.ss.android.ugc.aweme.antiaddic.lock.entity.a) r0     // Catch:{ Exception -> 0x00cb }
                java.lang.String r0 = r0.f33452a     // Catch:{ Exception -> 0x00cb }
                com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager r10 = com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.f2599b     // Catch:{ Exception -> 0x00cb }
                android.content.Context r11 = r13.$context     // Catch:{ Exception -> 0x00cb }
                java.lang.String r1 = "password"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ Exception -> 0x00cb }
                r12 = 2
                java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00cb }
                r1[r9] = r11     // Catch:{ Exception -> 0x00cb }
                r1[r8] = r0     // Catch:{ Exception -> 0x00cb }
                com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.f2598a     // Catch:{ Exception -> 0x00cb }
                r4 = 0
                r5 = 21750(0x54f6, float:3.0478E-41)
                java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x00cb }
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r6[r9] = r2     // Catch:{ Exception -> 0x00cb }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r6[r8] = r2     // Catch:{ Exception -> 0x00cb }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00cb }
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00cb }
                if (r1 == 0) goto L_0x009d
                java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00cb }
                r1[r9] = r11     // Catch:{ Exception -> 0x00cb }
                r1[r8] = r0     // Catch:{ Exception -> 0x00cb }
                com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.f2598a     // Catch:{ Exception -> 0x00cb }
                r4 = 0
                r5 = 21750(0x54f6, float:3.0478E-41)
                java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x00cb }
                java.lang.Class<android.content.Context> r0 = android.content.Context.class
                r6[r9] = r0     // Catch:{ Exception -> 0x00cb }
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r6[r8] = r0     // Catch:{ Exception -> 0x00cb }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00cb }
                r2 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00cb }
                goto L_0x00d3
            L_0x009d:
                com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = com.ss.android.a.a.a(r11)     // Catch:{ Exception -> 0x00cb }
                r2 = 2131559734(0x7f0d0536, float:1.874482E38)
                java.lang.String r2 = r11.getString(r2)     // Catch:{ Exception -> 0x00cb }
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00cb }
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x00cb }
                com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = r1.setTitle((java.lang.CharSequence) r2)     // Catch:{ Exception -> 0x00cb }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00cb }
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x00cb }
                com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = r1.setMessage((java.lang.CharSequence) r0)     // Catch:{ Exception -> 0x00cb }
                r1 = 2131559452(0x7f0d041c, float:1.8744248E38)
                com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$f r2 = com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.f.f33409a     // Catch:{ Exception -> 0x00cb }
                android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2     // Catch:{ Exception -> 0x00cb }
                com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = r0.setPositiveButton((int) r1, (android.content.DialogInterface.OnClickListener) r2)     // Catch:{ Exception -> 0x00cb }
                r0.show()     // Catch:{ Exception -> 0x00cb }
                goto L_0x00d3
            L_0x00cb:
                r0 = move-exception
                android.content.Context r1 = r13.$context
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                com.ss.android.ugc.aweme.app.api.a.a.a((android.content.Context) r1, (java.lang.Throwable) r0)
            L_0x00d3:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"closeTeenMode", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Unit> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(0);
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21759, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21759, new Class[0], Void.TYPE);
                return;
            }
            new Handler(Looper.myLooper()).post(AnonymousClass1.f33406b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"openTeenMode", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<Unit> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(0);
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21761, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21761, new Class[0], Void.TYPE);
                return;
            }
            new Handler(Looper.myLooper()).post(AnonymousClass1.f33408b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f33409a = new f();

        f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    private ParentalPlatformManager() {
    }

    static {
        ParentalPlatformManager parentalPlatformManager = new ParentalPlatformManager();
        f2599b = parentalPlatformManager;
        bg.c(parentalPlatformManager);
    }

    @JvmStatic
    public static final void a(@Nullable Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f2598a, true, 21751, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, f2598a, true, 21751, new Class[]{Activity.class}, Void.TYPE);
        } else if (activity2 != null) {
            Context context = activity2;
            if (!NetworkUtils.isNetworkAvailable(context)) {
                com.bytedance.ies.dmt.ui.d.a.b(context, activity2.getString(C0906R.string.abg)).a();
                return;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new DmtStatusViewDialog(activity2);
            ((DmtStatusViewDialog) objectRef.element).show();
            f2599b.a((a) new b(objectRef, activity2));
        }
    }

    @Keep
    @Subscribe(a = ThreadMode.MAIN)
    public final void onParentalModeChanged(@NotNull BroadcastMethod.a aVar) {
        BroadcastMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2598a, false, 21743, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2598a, false, 21743, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        if (TextUtils.equals("guardian_platform_open", aVar2.f44432b.getString("eventName")) || TextUtils.equals("guardian_platform_close", aVar2.f44432b.getString("eventName"))) {
            a((a) null);
        }
    }

    public final void a(@Nullable a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2598a, false, 21746, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2598a, false, 21746, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null && !f2600c.contains(aVar2)) {
            f2600c.add(aVar2);
        }
        if (!f2601d) {
            f2601d = true;
            com.ss.android.ugc.aweme.setting.serverpush.a.f64018e.a(null, false);
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.setting.serverpush.a.c cVar) {
        boolean z;
        boolean z2;
        com.ss.android.ugc.aweme.setting.serverpush.a.c cVar2;
        int i;
        int i2;
        int i3;
        com.ss.android.ugc.aweme.setting.serverpush.a.c cVar3 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar3}, this, f2598a, false, 21744, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar3}, this, f2598a, false, 21744, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar3, "settings");
        if (PatchProxy.isSupport(new Object[]{cVar3}, this, f2598a, false, 21748, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar3}, this, f2598a, false, 21748, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Boolean.TYPE)).booleanValue();
        } else {
            Intrinsics.checkParameterIsNotNull(cVar3, "setting");
            d dVar = d.INSTANCE;
            e eVar = e.INSTANCE;
            com.ss.android.ugc.aweme.setting.serverpush.a.c a2 = b.a();
            b.f33436b.a(cVar3);
            if (b.b(cVar) == b.a.CHILD || b.b(cVar) == b.a.PARENT) {
                x a3 = x.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "CommonSharePrefCache.inst()");
                an o = a3.o();
                Intrinsics.checkExpressionValueIsNotNull(o, "CommonSharePrefCache.inst().hadOpenParentCare");
                o.a(Boolean.TRUE);
            }
            if (b.b(cVar) == b.a.CHILD) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                cVar2 = cVar3;
            } else {
                cVar2 = null;
            }
            if (cVar2 != null) {
                TimeLockRuler.removeUserSettingWithoutNotify();
            }
            if (b.b(a2) == b.a.CHILD && b.b(cVar) != b.a.CHILD) {
                if (a2 != null) {
                    i3 = a2.C;
                } else {
                    i3 = 0;
                }
                if (i3 != 0) {
                    dVar.invoke();
                }
                z = false;
            } else if (b.b(a2) == b.a.CHILD || b.b(cVar) != b.a.CHILD) {
                if (b.b(a2) == b.a.CHILD && b.b(cVar) == b.a.CHILD) {
                    if (a2 != null) {
                        i = a2.C;
                    } else {
                        i = 0;
                    }
                    if (i == 0 || cVar3.C != 0) {
                        if (a2 != null) {
                            i2 = a2.C;
                        } else {
                            i2 = 0;
                        }
                        if (i2 == 0 && cVar3.C != 0) {
                            eVar.invoke();
                        }
                    } else {
                        dVar.invoke();
                    }
                }
                z = false;
            } else if (cVar3.C == 0 || TimeLockRuler.sLastContentFilterState) {
                if (cVar3.C == 0 && TimeLockRuler.sLastContentFilterState) {
                    dVar.invoke();
                }
                z = false;
            } else {
                eVar.invoke();
            }
            z = true;
        }
        for (a a4 : f2600c) {
            a4.a(cVar3, z);
        }
        f2600c.clear();
        f2601d = false;
        TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
        timeLockUserSetting.setNotifyParentModeOnly(true);
        bg.a(timeLockUserSetting);
    }

    public final void a(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f2598a, false, 21745, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f2598a, false, 21745, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        for (a a2 : f2600c) {
            a2.a(exc2);
        }
        f2600c.clear();
        f2601d = false;
    }

    public final boolean a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2598a, false, 21753, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f2598a, false, 21753, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "result");
        return StringsKt.contains((CharSequence) str2, (CharSequence) "/falcon/rn/guardian_child", true);
    }

    public final void a(@Nullable a aVar, @NotNull com.ss.android.ugc.aweme.setting.serverpush.a.c cVar) {
        a aVar2 = aVar;
        com.ss.android.ugc.aweme.setting.serverpush.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, cVar2}, this, f2598a, false, 21747, new Class[]{a.class, com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, cVar2}, this, f2598a, false, 21747, new Class[]{a.class, com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "pushSettings");
        if (!f2600c.contains(aVar2)) {
            f2600c.add(aVar2);
        }
        if (!f2601d) {
            f2601d = true;
            a(cVar2);
        }
    }
}
