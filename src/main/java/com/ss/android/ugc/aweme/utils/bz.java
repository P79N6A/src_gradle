package com.ss.android.ugc.aweme.utils;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058B@BX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/GlobalDebounceOnClickListener;", "Landroid/view/View$OnClickListener;", "delayInterval", "", "isGlobal", "", "(IZ)V", "enableAgainRunnable", "Ljava/lang/Runnable;", "value", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "localEnabled", "doClick", "", "v", "Landroid/view/View;", "onClick", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class bz implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f75650c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f75651d = new a((byte) 0);
    private static boolean g = true;

    /* renamed from: a  reason: collision with root package name */
    private final int f75652a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f75653b;

    /* renamed from: e  reason: collision with root package name */
    private boolean f75654e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f75655f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/GlobalDebounceOnClickListener$Companion;", "", "()V", "globalEnabled", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
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
        public static ChangeQuickRedirect f75656a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bz f75657b;

        b(bz bzVar) {
            this.f75657b = bzVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f75656a, false, 88346, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75656a, false, 88346, new Class[0], Void.TYPE);
                return;
            }
            this.f75657b.a(true);
        }
    }

    @JvmOverloads
    public bz(int i) {
        this(i, false, 2);
    }

    public abstract void a(@NotNull View view);

    public final void a(boolean z) {
        if (this.f75653b) {
            g = z;
        } else {
            this.f75654e = z;
        }
    }

    public void onClick(@NotNull View view) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view}, this, f75650c, false, 88345, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f75650c, false, 88345, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        if (this.f75653b) {
            z = g;
        } else {
            z = this.f75654e;
        }
        if (z) {
            a(false);
            view.postDelayed(this.f75655f, (long) this.f75652a);
            a(view);
        }
    }

    @JvmOverloads
    private bz(int i, boolean z) {
        this.f75654e = true;
        this.f75655f = new b(this);
        this.f75652a = i;
        this.f75653b = z;
    }

    private /* synthetic */ bz(int i, boolean z, int i2) {
        this(i, true);
    }
}
