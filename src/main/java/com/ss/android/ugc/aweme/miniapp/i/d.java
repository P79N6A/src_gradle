package com.ss.android.ugc.aweme.miniapp.i;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.api.MicroAppApi;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp_api.model.d;
import com.tt.miniapphost.hostmethod.HostMethodManager;
import com.tt.miniapphost.hostmethod.IHostMethod;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/miniapp/openmethod/ShowVideoMethod;", "Lcom/tt/miniapphost/hostmethod/IHostMethod;", "()V", "call", "", "activity", "Landroid/app/Activity;", "params", "Lorg/json/JSONObject;", "callBack", "Lcom/tt/miniapphost/hostmethod/HostMethodManager$ResponseCallBack;", "callSync", "", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "shouldHandleActivityResult", "miniapp_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements IHostMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55793a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/miniapp_api/model/GidVideoResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
    static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55794a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f55795b;

        a(String str) {
            this.f55795b = str;
        }

        public final /* synthetic */ Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f55794a, false, 59481, new Class[0], com.ss.android.ugc.aweme.miniapp_api.model.d.class)) {
                return MicroAppApi.b(this.f55795b);
            }
            return (com.ss.android.ugc.aweme.miniapp_api.model.d) PatchProxy.accessDispatch(new Object[0], this, f55794a, false, 59481, new Class[0], com.ss.android.ugc.aweme.miniapp_api.model.d.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/miniapp_api/model/GidVideoResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class b<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.miniapp_api.model.d, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HostMethodManager.ResponseCallBack f55797b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f55798c;

        b(HostMethodManager.ResponseCallBack responseCallBack, Activity activity) {
            this.f55797b = responseCallBack;
            this.f55798c = activity;
        }

        public final /* synthetic */ Object then(i iVar) {
            String str;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f55796a, false, 59482, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f55796a, false, 59482, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            if (iVar.d() || iVar.e() == null) {
                HostMethodManager.ResponseCallBack responseCallBack = this.f55797b;
                if (responseCallBack != null) {
                    responseCallBack.callResponse("{\"errMsg\":\"fail Network not available\"}");
                }
            } else {
                d.a aVar = ((com.ss.android.ugc.aweme.miniapp_api.model.d) iVar.e()).f56027a;
                if (aVar != null) {
                    str = aVar.f56028a;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    HostMethodManager.ResponseCallBack responseCallBack2 = this.f55797b;
                    if (responseCallBack2 != null) {
                        responseCallBack2.callResponse("{\"errMsg\":\"fail Video not exist\"}");
                    }
                } else {
                    if (this.f55798c != null) {
                        Intent intent = new Intent();
                        intent.putExtra("id", str);
                        q a2 = q.a();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "MiniAppService.inst()");
                        a2.i.a(this.f55798c, intent);
                    }
                    HostMethodManager.ResponseCallBack responseCallBack3 = this.f55797b;
                    if (responseCallBack3 != null) {
                        responseCallBack3.callResponse("{\"errMsg\":\"ok\"}");
                    }
                }
            }
            return null;
        }
    }

    @NotNull
    public final String callSync(@Nullable Activity activity, @Nullable JSONObject jSONObject) {
        return "";
    }

    public final boolean onActivityResult(int i, int i2, @Nullable Intent intent) {
        return false;
    }

    public final boolean shouldHandleActivityResult(@Nullable JSONObject jSONObject) {
        return false;
    }

    public final void call(@Nullable Activity activity, @Nullable JSONObject jSONObject, @Nullable HostMethodManager.ResponseCallBack responseCallBack) {
        String str;
        Activity activity2 = activity;
        JSONObject jSONObject2 = jSONObject;
        HostMethodManager.ResponseCallBack responseCallBack2 = responseCallBack;
        if (PatchProxy.isSupport(new Object[]{activity2, jSONObject2, responseCallBack2}, this, f55793a, false, 59480, new Class[]{Activity.class, JSONObject.class, HostMethodManager.ResponseCallBack.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, jSONObject2, responseCallBack2}, this, f55793a, false, 59480, new Class[]{Activity.class, JSONObject.class, HostMethodManager.ResponseCallBack.class}, Void.TYPE);
            return;
        }
        if (jSONObject2 != null) {
            str = jSONObject2.optString("alias_id");
        } else {
            str = null;
        }
        i.a((Callable<TResult>) new a<TResult>(str)).a((g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(responseCallBack2, activity2), i.f1052b);
    }
}
