package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.VEHook;
import com.ss.android.ttve.nativePort.b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\f\u001a\u00020\nR\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/VEHookMgr;", "", "()V", "hookSoLibs", "", "", "[Ljava/lang/String;", "isHook", "", "hook", "", "hookWhenLoadSoFinish", "init", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ez {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75856a;

    /* renamed from: b  reason: collision with root package name */
    static String[] f75857b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f75858c;

    /* renamed from: d  reason: collision with root package name */
    public static final ez f75859d = new ez();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "onMemHookNativeLibs", "([Ljava/lang/String;)V"}, k = 3, mv = {1, 1, 15})
    public static final class a implements b.C0396b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75860a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f75861b = new a();

        a() {
        }

        public final void a(String[] strArr) {
            if (PatchProxy.isSupport(new Object[]{strArr}, this, f75860a, false, 88695, new Class[]{String[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{strArr}, this, f75860a, false, 88695, new Class[]{String[].class}, Void.TYPE);
                return;
            }
            ez ezVar = ez.f75859d;
            ez.f75857b = strArr;
            ez ezVar2 = ez.f75859d;
            if (ez.f75858c) {
                ez.f75859d.a();
            }
        }
    }

    private ez() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75856a, false, 88694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75856a, false, 88694, new Class[0], Void.TYPE);
            return;
        }
        String[] strArr = f75857b;
        if (strArr != null) {
            VEHook.hook(strArr);
        }
    }
}
