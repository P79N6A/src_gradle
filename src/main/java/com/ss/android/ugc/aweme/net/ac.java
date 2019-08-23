package com.ss.android.ugc.aweme.net;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0006\u0010\u0005\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/net/StartUpApiWhiteListHelper;", "", "()V", "handler", "Landroid/os/Handler;", "stop", "", "whitelist", "", "", "[Ljava/lang/String;", "checkUrl", "", "url", "enableCheck", "throwException", "msg", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56888a;

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f56889b;

    /* renamed from: c  reason: collision with root package name */
    public static String[] f56890c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f56891d;

    /* renamed from: e  reason: collision with root package name */
    public static final ac f56892e = new ac();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f56896b;

        public a(String str) {
            this.f56896b = str;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f56895a, false, 60800, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f56895a, false, 60800, new Class[0], Void.TYPE);
                return;
            }
            throw new RuntimeException(this.f56896b);
        }
    }

    public static void a() {
        f56891d = true;
    }

    private ac() {
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f56889b = handler;
        handler.postDelayed(AnonymousClass1.f56894b, 5000);
    }
}
