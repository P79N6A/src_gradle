package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.main.MainActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/app/PreLoginCommandsHandler;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33762a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f33763b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/app/PreLoginCommandsHandler$Companion;", "", "()V", "handlerPreLoginCommand", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "intent", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33764a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent a(@NotNull Activity activity, @Nullable Intent intent) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2, intent}, this, f33764a, false, 22574, new Class[]{Activity.class, Intent.class}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, intent}, this, f33764a, false, 22574, new Class[]{Activity.class, Intent.class}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            p a2 = p.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeRuntime.inst()");
            if (!a2.c()) {
                Intent intent2 = new Intent();
                if (com.ss.android.g.a.a()) {
                    intent2.setClassName(activity2, "com.ss.android.ugc.aweme.splash.SplashActivity");
                } else {
                    intent2 = new Intent(activity2, MainActivity.class);
                }
                activity2.startActivity(intent2);
            }
            Intent intent3 = new Intent(activity2, PushLoginActivity.class);
            if (intent != null) {
                intent3.putExtra("next_step", intent);
            }
            return intent3;
        }
    }

    @JvmStatic
    @NotNull
    public static final Intent a(@NotNull Activity activity, @Nullable Intent intent) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        if (!PatchProxy.isSupport(new Object[]{activity2, intent2}, null, f33762a, true, 22573, new Class[]{Activity.class, Intent.class}, Intent.class)) {
            return f33763b.a(activity2, intent2);
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, intent2}, null, f33762a, true, 22573, new Class[]{Activity.class, Intent.class}, Intent.class);
    }
}
