package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.thread.AlertThread;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/requesttask/idle/AppAlertRequest;", "Lcom/ss/android/ugc/aweme/lego/LegoRequest;", "context", "Landroid/content/Context;", "handler", "Landroid/os/Handler;", "hasMarket", "", "(Landroid/content/Context;Landroid/os/Handler;Z)V", "mContext", "mHandler", "mHasMarhet", "request", "", "coldBoot", "type", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63620a;

    /* renamed from: b  reason: collision with root package name */
    private Context f63621b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f63622c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f63623d;

    @NotNull
    public final e a() {
        if (PatchProxy.isSupport(new Object[0], this, f63620a, false, 70804, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f63620a, false, 70804, new Class[0], e.class);
        }
        boolean z = true;
        try {
            a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            z = true ^ b2.aI().booleanValue();
        } catch (Exception unused) {
        }
        if (AlertThread.c() == 0 || !z) {
            return e.NORMAL;
        }
        return e.IDLE;
    }

    public final void a(@NotNull Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63620a, false, 70805, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f63620a, false, 70805, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        new AlertThread(this.f63621b, this.f63622c, this.f63623d).b();
    }

    public b(@NotNull Context context, @NotNull Handler handler, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(handler, "handler");
        this.f63621b = context;
        this.f63622c = handler;
        this.f63623d = z;
    }
}
