package com.ss.android.ugc.aweme.live.hostbusiness;

import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/live/hostbusiness/DouplusDialogMonitor;", "", "url", "", "extra", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "currentStartAt", "", "logExtra", "monitorUrl", "underMonitor", "", "onPageFail", "", "statusCode", "", "failingUrl", "onPageFinish", "onPageStart", "onWebViewClosed", "closeType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53409a;

    /* renamed from: b  reason: collision with root package name */
    boolean f53410b;

    /* renamed from: c  reason: collision with root package name */
    long f53411c;

    /* renamed from: d  reason: collision with root package name */
    String f53412d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f53413e;

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f53409a, false, 55678, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f53409a, false, 55678, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "closeType");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dp_webview_close_type", str2);
            jSONObject.put("close_webView", 1);
            try {
                jSONObject.put(PushConstants.WEB_URL, this.f53412d);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
        Logger.debug();
        n.a("aweme_dppage_gesture_close", 1, jSONObject);
    }

    public a(@NotNull String str, @NotNull JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(jSONObject, PushConstants.EXTRA);
        this.f53412d = str;
        this.f53413e = jSONObject;
    }

    public final void a(int i, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f53409a, false, 55677, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f53409a, false, 55677, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (this.f53410b) {
            this.f53410b = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f53411c;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", currentTimeMillis);
                this.f53413e.put("error_status", i);
                this.f53413e.put("error_message", str);
            } catch (JSONException unused) {
            }
            Logger.debug();
            n.a("douplus_live_show", 0, jSONObject, this.f53413e);
        }
    }
}
