package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/LaunchChatMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "()V", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "jump2Chat", "", "context", "Landroid/content/Context;", "imUser", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LaunchChatMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44455a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onResultOK", "com/ss/android/ugc/aweme/fe/method/LaunchChatMethod$handle$2$1"}, k = 3, mv = {1, 1, 15})
    static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LaunchChatMethod f44457b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IMUser f44458c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f44459d;

        a(LaunchChatMethod launchChatMethod, IMUser iMUser, BaseCommonJavaMethod.a aVar) {
            this.f44457b = launchChatMethod;
            this.f44458c = iMUser;
            this.f44459d = aVar;
        }

        public final void a(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{null}, this, f44456a, false, 39785, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f44456a, false, 39785, new Class[]{Bundle.class}, Void.TYPE);
            }
        }

        public final void a() {
            Context context;
            if (PatchProxy.isSupport(new Object[0], this, f44456a, false, 39784, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44456a, false, 39784, new Class[0], Void.TYPE);
                return;
            }
            LaunchChatMethod launchChatMethod = this.f44457b;
            WeakReference weakReference = this.f44457b.f3123e;
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            if (launchChatMethod.a(context, this.f44458c)) {
                BaseCommonJavaMethod.a aVar = this.f44459d;
                if (aVar != null) {
                    aVar.a((Object) 1);
                }
                return;
            }
            BaseCommonJavaMethod.a aVar2 = this.f44459d;
            if (aVar2 != null) {
                aVar2.a(0, "open chat fail");
            }
        }
    }

    public final boolean a(Context context, IMUser iMUser) {
        Context context2 = context;
        IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{context2, iMUser2}, this, f44455a, false, 39783, new Class[]{Context.class, IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, iMUser2}, this, f44455a, false, 39783, new Class[]{Context.class, IMUser.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            IIMService a2 = b.a(false);
            if (!b.b() || a2 == null) {
                return false;
            }
            a2.startChat(context2, iMUser2);
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable org.json.JSONObject r11, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f44455a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 39782(0x9b66, float:5.5746E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f44455a
            r3 = 0
            r4 = 39782(0x9b66, float:5.5746E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            if (r11 != 0) goto L_0x0047
            java.lang.String r0 = "no params found"
            r12.a(r8, r0)
            return
        L_0x0047:
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = new com.ss.android.ugc.aweme.im.service.model.IMUser
            r0.<init>()
            java.lang.String r1 = "uid"
            java.lang.String r1 = r11.optString(r1)
            r0.setUid(r1)
            java.lang.String r1 = "nick_name"
            java.lang.String r1 = r11.optString(r1)
            r0.setNickName(r1)
            java.lang.String r1 = "alias"
            java.lang.String r1 = r11.optString(r1)
            r0.setSignature(r1)
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r2 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            boolean r1 = r1.isLogin()
            r2 = 0
            if (r1 != 0) goto L_0x00a7
            java.lang.ref.WeakReference r1 = r10.f3123e
            if (r1 == 0) goto L_0x00a6
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L_0x00a6
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r1 = r2
        L_0x0089:
            if (r1 == 0) goto L_0x00a6
            if (r1 == 0) goto L_0x009e
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r2 = "poi_page"
            java.lang.String r3 = "click_chat_button"
            com.ss.android.ugc.aweme.fe.method.LaunchChatMethod$a r4 = new com.ss.android.ugc.aweme.fe.method.LaunchChatMethod$a
            r4.<init>(r10, r0, r12)
            com.ss.android.ugc.aweme.base.component.f r4 = (com.ss.android.ugc.aweme.base.component.f) r4
            com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r1, (java.lang.String) r2, (java.lang.String) r3, (com.ss.android.ugc.aweme.base.component.f) r4)
            return
        L_0x009e:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            r0.<init>(r1)
            throw r0
        L_0x00a6:
            return
        L_0x00a7:
            java.lang.ref.WeakReference r1 = r10.f3123e
            if (r1 == 0) goto L_0x00b2
            java.lang.Object r1 = r1.get()
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
        L_0x00b2:
            boolean r0 = r10.a((android.content.Context) r2, (com.ss.android.ugc.aweme.im.service.model.IMUser) r0)
            if (r0 == 0) goto L_0x00c0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r12.a((java.lang.Object) r0)
            return
        L_0x00c0:
            java.lang.String r0 = "open chat fail"
            r12.a(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.LaunchChatMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
