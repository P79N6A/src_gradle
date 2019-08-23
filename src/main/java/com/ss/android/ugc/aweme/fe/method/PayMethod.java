package com.ss.android.ugc.aweme.fe.method;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.c.e;
import com.ss.android.ugc.aweme.commerce.c.f;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/PayMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PayMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44474a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f44475b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/PayMethod$Companion;", "", "()V", "BRIDGE_NAME_PAY", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public PayMethod() {
        this(null, 1);
    }

    public PayMethod(@Nullable com.bytedance.ies.f.a.a aVar) {
        super(aVar);
    }

    private /* synthetic */ PayMethod(com.bytedance.ies.f.a.a aVar, int i) {
        this(null);
    }

    public final void a(@Nullable JSONObject jSONObject, @Nullable BaseCommonJavaMethod.a aVar) {
        f fVar;
        JSONObject jSONObject2 = jSONObject;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f44474a, false, 39797, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f44474a, false, 39797, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        WeakReference weakReference = this.f3123e;
        if (PatchProxy.isSupport(new Object[]{weakReference, aVar2}, null, e.f36775a, true, 28292, new Class[]{WeakReference.class, BaseCommonJavaMethod.a.class}, f.class)) {
            fVar = (f) PatchProxy.accessDispatch(new Object[]{weakReference, aVar2}, null, e.f36775a, true, 28292, new Class[]{WeakReference.class, BaseCommonJavaMethod.a.class}, f.class);
        } else {
            fVar = new f(weakReference, new com.ss.android.ugc.aweme.commerce.c.a(aVar2));
        }
        if (jSONObject2 == null) {
            Intrinsics.throwNpe();
        }
        fVar.a(jSONObject2);
    }
}
