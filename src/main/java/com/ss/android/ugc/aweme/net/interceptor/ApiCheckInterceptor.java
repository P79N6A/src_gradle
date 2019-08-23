package com.ss.android.ugc.aweme.net.interceptor;

import android.net.Uri;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.net.ac;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/net/interceptor/ApiCheckInterceptor;", "Lcom/bytedance/retrofit2/intercept/Interceptor;", "()V", "intercept", "Lcom/bytedance/retrofit2/SsResponse;", "chain", "Lcom/bytedance/retrofit2/intercept/Interceptor$Chain;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ApiCheckInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56953a;

    public final SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{chain}, this, f56953a, false, 60913, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return b.a(this, chain);
        }
        return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f56953a, false, 60913, new Class[]{Interceptor.Chain.class}, SsResponse.class);
    }

    @NotNull
    public final SsResponse<?> a(@NotNull Interceptor.Chain chain) throws Exception {
        boolean z;
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56953a, false, 60914, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56953a, false, 60914, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        Intrinsics.checkParameterIsNotNull(chain2, "chain");
        Request request = chain.request();
        ac acVar = ac.f56892e;
        Intrinsics.checkExpressionValueIsNotNull(request, "request");
        String url = request.getUrl();
        Intrinsics.checkExpressionValueIsNotNull(url, "request.url");
        if (PatchProxy.isSupport(new Object[]{url}, acVar, ac.f56888a, false, 60796, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{url}, acVar, ac.f56888a, false, 60796, new Class[]{String.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(url, PushConstants.WEB_URL);
            if (PatchProxy.isSupport(new Object[0], acVar, ac.f56888a, false, 60798, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], acVar, ac.f56888a, false, 60798, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (ac.f56891d || !a.b().f3306d || com.ss.android.g.a.a()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (ac.f56890c == null) {
                    k a2 = k.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeApplication.getApplication()");
                    ac.f56890c = a2.getResources().getStringArray(C0906R.array.x);
                }
                Uri parse = Uri.parse(url);
                Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
                String path = parse.getPath();
                if (!StringUtils.isEmpty(parse.getQueryParameter("device_id"))) {
                    String[] strArr = ac.f56890c;
                    if (strArr == null) {
                        Intrinsics.throwNpe();
                    }
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (StringsKt.contains$default((CharSequence) url, (CharSequence) strArr[i], false, 2, (Object) null)) {
                                break;
                            }
                            i++;
                        } else {
                            String str = "启动阶段不能请求接口" + path + "，如果有疑问请联系禹慧军，" + url;
                            if (PatchProxy.isSupport(new Object[]{str}, acVar, ac.f56888a, false, 60797, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str}, acVar, ac.f56888a, false, 60797, new Class[]{String.class}, Void.TYPE);
                            } else {
                                ac.f56889b.post(new ac.a(str));
                            }
                        }
                    }
                }
            }
        }
        SsResponse<?> proceed = chain2.proceed(request);
        Intrinsics.checkExpressionValueIsNotNull(proceed, "chain.proceed(request)");
        return proceed;
    }
}
