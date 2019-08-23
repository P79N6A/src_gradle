package com.ss.android.ugc.aweme.feed;

import com.bytedance.ttnet.TTNetInit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/NetDetector;", "", "()V", "actionType", "", "getActionType", "()I", "detectStartTime", "", "getDetectStartTime", "()J", "setDetectStartTime", "(J)V", "runningStatus", "", "getRunningStatus", "()Z", "setRunningStatus", "(Z)V", "stopped", "getStopped", "setStopped", "timeOut", "getTimeOut", "urls", "", "", "getUrls", "()[Ljava/lang/String;", "[Ljava/lang/String;", "setStop", "", "start", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45034a = null;

    /* renamed from: b  reason: collision with root package name */
    static final int f45035b = f45035b;

    /* renamed from: c  reason: collision with root package name */
    static final int f45036c = f45036c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    static final String[] f45037d = {"https://www.google.com/images/nav_logo.webp", "https://www.facebook.com/images/fb_icon_325x325.png"};

    /* renamed from: e  reason: collision with root package name */
    public static volatile boolean f45038e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f45039f;
    public static long g;
    public static final al h = new al();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    public static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45040a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f45041b = new a();

        a() {
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f45040a, false, 40241, new Class[0], Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[0], this, f45040a, false, 40241, new Class[0], Void.class);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("network_status", 1);
            jSONObject.put("detect_cost", 0);
            jSONObject.put("detect_start_time", 0);
            r.a("network_detect_result", jSONObject);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    public static final class b<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45042a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f45043b = new b();

        b() {
        }

        public final /* synthetic */ Object call() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f45042a, false, 40242, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45042a, false, 40242, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = TTNetInit.tryStartTTNetDetect(al.f45037d, al.f45036c, al.f45035b);
            }
            return Boolean.valueOf(z);
        }
    }

    private al() {
    }
}
