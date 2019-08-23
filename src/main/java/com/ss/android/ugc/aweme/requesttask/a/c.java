package com.ss.android.ugc.aweme.requesttask.a;

import android.content.Context;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.thread.GetSettingThread;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/requesttask/normal/FetchServiceSettingRequest;", "Lcom/ss/android/ugc/aweme/lego/LegoRequest;", "handler", "Landroid/os/Handler;", "defaultSettingLoaded", "", "(Landroid/os/Handler;Z)V", "mDefaultSettingLoaded", "mHandler", "request", "", "context", "Landroid/content/Context;", "coldBoot", "type", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63597a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f63598b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f63599c;

    @NotNull
    public final e a() {
        return e.NORMAL;
    }

    public c(@NotNull Handler handler, boolean z) {
        Intrinsics.checkParameterIsNotNull(handler, "handler");
        this.f63598b = handler;
        this.f63599c = z;
    }

    public final void a(@NotNull Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63597a, false, 70830, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f63597a, false, 70830, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        new GetSettingThread(context, this.f63598b, !this.f63599c).b();
    }
}
