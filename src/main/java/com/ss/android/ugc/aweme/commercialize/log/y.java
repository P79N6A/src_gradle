package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.commercialize.model.l;
import com.ss.android.ugc.aweme.g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/log/OpenAppBackLogWatcher;", "Lcom/ss/android/ugc/aweme/ActivityMonitor$AppLifecycleCallback;", "()V", "onAppEnterBackGround", "", "onAppEnterForeground", "onMainActivityResumed", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class y implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39355a = null;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final String f39356b = f39356b;

    /* renamed from: c  reason: collision with root package name */
    public static long f39357c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public static String f39358d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f39359e = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R0\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00068F@FX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/log/OpenAppBackLogWatcher$Companion;", "", "()V", "EXPIRE_HOURS", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "lastTimeEnterForeground", "value", "paramsStringCache", "paramsStringCache$annotations", "getParamsStringCache", "setParamsStringCache", "(Ljava/lang/String;)V", "sendLog", "", "params", "Lcom/ss/android/ugc/aweme/commercialize/model/OpenAppBackLogParams;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39360a;

        private a() {
        }

        @Nullable
        public final String a() {
            if (PatchProxy.isSupport(new Object[0], this, f39360a, false, 31839, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f39360a, false, 31839, new Class[0], String.class);
            }
            if (TextUtils.isEmpty(y.f39358d)) {
                SharePrefCache inst = SharePrefCache.inst();
                Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
                an<String> openAppBackLogParams = inst.getOpenAppBackLogParams();
                Intrinsics.checkExpressionValueIsNotNull(openAppBackLogParams, "SharePrefCache.inst().openAppBackLogParams");
                y.f39358d = (String) openAppBackLogParams.c();
            }
            return y.f39358d;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(@Nullable l lVar) {
            if (PatchProxy.isSupport(new Object[]{lVar}, this, f39360a, false, 31841, new Class[]{l.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{lVar}, this, f39360a, false, 31841, new Class[]{l.class}, Void.TYPE);
            } else if (lVar != null && !TextUtils.isEmpty(lVar.getTag()) && lVar.getAwemeRawAd() != null) {
                Context a2 = d.a();
                JSONObject e2 = g.e(a2, lVar.getAwemeRawAd(), y.f39356b);
                long startTime = y.f39357c - lVar.getStartTime();
                if (startTime <= TimeUnit.HOURS.toMillis(24)) {
                    try {
                        e2.put("duration", startTime);
                    } catch (JSONException unused) {
                    }
                    g.a(a2, lVar.getTag(), y.f39356b, e2, lVar.getAwemeRawAd());
                }
            }
        }

        public final void a(@Nullable String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f39360a, false, 31840, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f39360a, false, 31840, new Class[]{String.class}, Void.TYPE);
                return;
            }
            y.f39358d = str2;
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            inst.getOpenAppBackLogParams().b(str2, true);
        }
    }

    @JvmStatic
    public static final void a(@Nullable l lVar) {
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{lVar2}, null, f39355a, true, 31838, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar2}, null, f39355a, true, 31838, new Class[]{l.class}, Void.TYPE);
            return;
        }
        f39359e.a(lVar2);
    }

    public static final void a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f39355a, true, 31837, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f39355a, true, 31837, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f39359e.a(str2);
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39355a, false, 31835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39355a, false, 31835, new Class[0], Void.TYPE);
            return;
        }
        f39357c = System.currentTimeMillis();
        if (!TextUtils.isEmpty(f39359e.a())) {
            f39359e.a((l) new Gson().fromJson(f39359e.a(), l.class));
            f39359e.a("");
        }
    }
}
