package com.ss.android.ugc.aweme.requesttask.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lego.e;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001a\u0010\r\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/requesttask/normal/FetchUserSettingRequest;", "Lcom/ss/android/ugc/aweme/lego/LegoRequest;", "from", "", "(I)V", "mFrom", "request", "", "context", "Landroid/content/Context;", "coldBoot", "", "syncPushSetting", "tryMobPushSetting", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "type", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements com.ss.android.ugc.aweme.lego.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63600a;

    /* renamed from: b  reason: collision with root package name */
    private int f63601b = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/requesttask/normal/FetchUserSettingRequest$syncPushSetting$1", "Lcom/ss/android/ugc/aweme/antiaddic/lock/ParentalPlatformManager$ParentalPlatformInfoCallback;", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "tennModeChanged", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements ParentalPlatformManager.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63602a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f63603b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f63604c;

        public final void a(@NotNull Exception exc) {
            if (PatchProxy.isSupport(new Object[]{exc}, this, f63602a, false, 70835, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc}, this, f63602a, false, 70835, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(exc, "e");
            this.f63603b.a(this.f63604c, (c) null);
        }

        a(d dVar, int i) {
            this.f63603b = dVar;
            this.f63604c = i;
        }

        public final void a(@NotNull c cVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{cVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63602a, false, 70834, new Class[]{c.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar, Byte.valueOf(z)}, this, f63602a, false, 70834, new Class[]{c.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar, "settings");
            if (this.f63604c == 1 && !z && TimeLockRuler.sLastContentFilterState && b.b(cVar) == b.a.CHILD && cVar.C == 0) {
                TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                if (userSetting != null) {
                    userSetting.setContentFilterOn(false);
                    TimeLockRuler.applyUserSetting(userSetting);
                }
                com.ss.android.ugc.aweme.antiaddic.lock.d.a();
            }
            this.f63603b.a(this.f63604c, cVar);
        }
    }

    @NotNull
    public final e a() {
        return e.IDLE;
    }

    public d(int i) {
    }

    public final void a(int i, @Nullable c cVar) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), cVar}, this, f63600a, false, 70833, new Class[]{Integer.TYPE, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), cVar}, this, f63600a, false, 70833, new Class[]{Integer.TYPE, c.class}, Void.TYPE);
        } else if (i == 1) {
            if (TimeLockRuler.isTimeLockOn()) {
                str = "on";
            } else {
                str = "off";
            }
            if (TimeLockRuler.isContentFilterOn()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            if (b.f33436b.b() == b.a.CHILD || b.f33436b.b() == b.a.PARENT) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            r.a("time_lock_status", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", str).f34114b);
            r.a("teen_mode_status", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", str2).f34114b);
            r.a("kid_platform_status", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", str3).f34114b);
        }
    }

    public final void a(@NotNull Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63600a, false, 70831, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f63600a, false, 70831, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        int i = this.f63601b;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f63600a, false, 70832, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f63600a, false, 70832, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        if (a2.isLogin()) {
            ParentalPlatformManager.f2599b.a((ParentalPlatformManager.a) new a(this, i));
        } else {
            a(i, (c) null);
        }
    }
}
