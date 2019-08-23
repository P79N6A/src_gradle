package com.ss.android.ugc.aweme.story.metrics.base;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;

@Keep
public abstract class BaseMetricsEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected final String event;
    private Map<String, String> extraParams = new HashMap();
    private final Map<String, String> params = new HashMap();
    private boolean useJson = false;

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f73148a = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f73150c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f73150c, false, 84784, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f73150c, false, 84784, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final a f73149b = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f73151c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f73151c, false, 84785, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f73151c, false, 84785, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2) || PushConstants.PUSH_TYPE_NOTIFY.equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        String a(String str);
    }

    public void buildCommonParams() {
    }

    public abstract void buildParams();

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$post$0$BaseMetricsEvent() {
        try {
            if (this.useJson) {
                AppLogNewUtils.onEventV3(this.event, com.ss.android.ugc.aweme.story.metrics.a.a.a(this.params));
                return;
            }
            q.a(this.event, this.params);
        } catch (Throwable unused) {
        }
    }

    public final void post() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84777, new Class[0], Void.TYPE);
            return;
        }
        buildCommonParams();
        buildParams();
        this.params.putAll(this.extraParams);
        a aVar = new a(this);
        tryDelayAfterBootFinish(aVar, new b(aVar));
    }

    public void setUseJson(boolean z) {
        this.useJson = z;
    }

    public BaseMetricsEvent(String str) {
        this.event = str;
    }

    public BaseMetricsEvent appendExtraParams(Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, changeQuickRedirect, false, 84780, new Class[]{Map.class}, BaseMetricsEvent.class)) {
            return (BaseMetricsEvent) PatchProxy.accessDispatch(new Object[]{map}, this, changeQuickRedirect, false, 84780, new Class[]{Map.class}, BaseMetricsEvent.class);
        }
        this.extraParams.putAll(map);
        return this;
    }

    public void appendLogPbParam(LogPbBean logPbBean) {
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{logPbBean2}, this, changeQuickRedirect, false, 84781, new Class[]{LogPbBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{logPbBean2}, this, changeQuickRedirect, false, 84781, new Class[]{LogPbBean.class}, Void.TYPE);
            return;
        }
        appendParam("log_pb", new Gson().toJson((Object) logPbBean2), a.f73148a);
    }

    public static boolean tryDelayAfterBootFinish(Runnable runnable, Runnable runnable2) {
        if (PatchProxy.isSupport(new Object[]{runnable, runnable2}, null, changeQuickRedirect, true, 84778, new Class[]{Runnable.class, Runnable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{runnable, runnable2}, null, changeQuickRedirect, true, 84778, new Class[]{Runnable.class, Runnable.class}, Boolean.TYPE)).booleanValue();
        }
        if (runnable2 != null) {
            runnable2.run();
        }
        return false;
    }

    public final void appendParam(String str, String str2, a aVar) {
        String str3 = str;
        String str4 = str2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, this, changeQuickRedirect, false, 84779, new Class[]{String.class, String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, this, changeQuickRedirect, false, 84779, new Class[]{String.class, String.class, a.class}, Void.TYPE);
            return;
        }
        this.params.put(str3, aVar2.a(str4));
    }
}
