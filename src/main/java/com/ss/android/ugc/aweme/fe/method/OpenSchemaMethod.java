package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.UiThreadUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.ReactInstance;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J&\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/OpenSchemaMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "openSchemaH5", "schema", "", "openSchemaRN", "reactId", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class OpenSchemaMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44468a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f44469b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/OpenSchemaMethod$Companion;", "", "()V", "BRIDGE_NAME_OPEN_SCHEMA", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
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
        public static ChangeQuickRedirect f44470a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44471b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f44472c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f44473d;

        b(String str, String str2, BaseCommonJavaMethod.a aVar) {
            this.f44471b = str;
            this.f44472c = str2;
            this.f44473d = aVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f44470a, false, 39796, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44470a, false, 39796, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.framework.activity.a reactViewById = ReactInstance.getReactViewById(this.f44471b);
            if (TextUtils.isEmpty(this.f44472c) || reactViewById == null) {
                BaseCommonJavaMethod.a aVar = this.f44473d;
                if (aVar != null) {
                    aVar.a(com.ss.android.ugc.aweme.framework.c.a.f48480d, "schema is not legal");
                    return;
                }
                return;
            }
            String str = this.f44472c;
            if (str != null && StringsKt.startsWith$default(str, "aweme://live/", false, 2, null)) {
                Uri parse = Uri.parse(this.f44472c);
                String queryParameter = parse.getQueryParameter("room_id");
                String queryParameter2 = parse.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                    f.f34171e.a(reactViewById.getActivity(), StringsKt.replace$default(this.f44472c, "aweme", e.f34152b, false, 4, (Object) null), null);
                    BaseCommonJavaMethod.a aVar2 = this.f44473d;
                    if (aVar2 != null) {
                        aVar2.a((Object) new JSONObject());
                    }
                } else {
                    BaseCommonJavaMethod.a aVar3 = this.f44473d;
                    if (aVar3 != null) {
                        aVar3.a(com.ss.android.ugc.aweme.framework.c.a.f48480d, "");
                    }
                }
            } else if (h.a().a(reactViewById.getActivity(), this.f44472c)) {
                BaseCommonJavaMethod.a aVar4 = this.f44473d;
                if (aVar4 != null) {
                    aVar4.a((Object) new JSONObject());
                }
            } else {
                BaseCommonJavaMethod.a aVar5 = this.f44473d;
                if (aVar5 != null) {
                    aVar5.a(com.ss.android.ugc.aweme.framework.c.a.f48480d, "");
                }
            }
        }
    }

    public OpenSchemaMethod() {
        this(null, 1);
    }

    public OpenSchemaMethod(@Nullable com.bytedance.ies.f.a.a aVar) {
        super(aVar);
    }

    private /* synthetic */ OpenSchemaMethod(com.bytedance.ies.f.a.a aVar, int i) {
        this(null);
    }

    public final void a(@Nullable JSONObject jSONObject, @Nullable BaseCommonJavaMethod.a aVar) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f44468a, false, 39793, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f44468a, false, 39793, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        String str2 = null;
        if (jSONObject2 != null) {
            str = jSONObject2.optString("reactId");
        } else {
            str = null;
        }
        if (jSONObject2 != null) {
            str2 = jSONObject2.optString("schema");
        }
        String str3 = str2;
        if (this.f3124f != null) {
            if (PatchProxy.isSupport(new Object[]{str3}, this, f44468a, false, 39795, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3}, this, f44468a, false, 39795, new Class[]{String.class}, Void.TYPE);
            } else if (this.f3123e.get() != null) {
                h a2 = h.a();
                Object obj = this.f3123e.get();
                if (obj != null) {
                    a2.a((Activity) obj, str3);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            } else {
                h.a().a(str3);
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{str, str3, aVar2}, this, f44468a, false, 39794, new Class[]{String.class, String.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str3, aVar2}, this, f44468a, false, 39794, new Class[]{String.class, String.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
                return;
            }
            UiThreadUtil.runOnUiThread(new b(str, str3, aVar2));
        }
    }
}
