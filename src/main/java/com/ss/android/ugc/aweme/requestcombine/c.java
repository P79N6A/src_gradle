package com.ss.android.ugc.aweme.requestcombine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.antiaddic.lock.d;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/UserSettingRequest;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63589a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/UserSettingRequest$Companion;", "", "()V", "setPushSetting", "", "from", "", "pushSettings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "tryMobPushSetting", "settings", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63590a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/requestcombine/UserSettingRequest$Companion$setPushSetting$1", "Lcom/ss/android/ugc/aweme/antiaddic/lock/ParentalPlatformManager$ParentalPlatformInfoCallback;", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "tennModeChanged", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.requestcombine.c$a$a  reason: collision with other inner class name */
        public static final class C0686a implements ParentalPlatformManager.a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63591a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f63592b;

            public C0686a(int i) {
                this.f63592b = i;
            }

            public final void a(@NotNull Exception exc) {
                Exception exc2 = exc;
                if (PatchProxy.isSupport(new Object[]{exc2}, this, f63591a, false, 70723, new Class[]{Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{exc2}, this, f63591a, false, 70723, new Class[]{Exception.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(exc2, "e");
                c.f63589a.a(this.f63592b, null);
            }

            public final void a(@NotNull com.ss.android.ugc.aweme.setting.serverpush.a.c cVar, boolean z) {
                if (PatchProxy.isSupport(new Object[]{cVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63591a, false, 70722, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar, Byte.valueOf(z)}, this, f63591a, false, 70722, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(cVar, "settings");
                if (this.f63592b == 1 && !z && TimeLockRuler.sLastContentFilterState && b.b(cVar) == b.a.CHILD && cVar.C == 0) {
                    TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                    if (userSetting != null) {
                        userSetting.setContentFilterOn(false);
                        TimeLockRuler.applyUserSetting(userSetting);
                    }
                    d.a();
                }
                c.f63589a.a(this.f63592b, cVar);
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(int i, com.ss.android.ugc.aweme.setting.serverpush.a.c cVar) {
            String str;
            String str2;
            String str3;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), cVar}, this, f63590a, false, 70721, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), cVar}, this, f63590a, false, 70721, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE);
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
    }
}
