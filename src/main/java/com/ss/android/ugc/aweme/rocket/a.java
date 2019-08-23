package com.ss.android.ugc.aweme.rocket;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.core.j;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatPageRequestCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.rocket.android.api.FusionFuelSdk;
import com.rocket.android.api.IFusionFuelSdkDepend;
import com.rocket.android.commonsdk.wschannel.FFWsMsg;
import com.rocket.android.model.FFMsgData;
import com.rocket.android.model.ShareData;
import com.rocket.android.model.UnReadCountData;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.sdk.b.b;
import com.ss.android.sdk.b.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.message.d.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ca;
import com.ss.android.ugc.aweme.utils.p;
import com.ss.android.websocket.b.a.e;
import com.ss.android.websocket.b.b;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#J\b\u0010$\u001a\u00020\u0006H\u0016J\u0012\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010'\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010*\u001a\u00020\nH\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/rocket/FFSdkDepend;", "Lcom/rocket/android/api/IFusionFuelSdkDepend;", "()V", "AWEME_APP_ID", "", "antiSpamReport", "", "context", "Landroid/content/Context;", "str", "", "canRecommendMeToOthers", "", "canRecommendOthersToMe", "canUseHostPhoneContact", "getAppUserAvatar", "getAppUserName", "getDeviceFingerPrint", "goToLogin", "handleSchema", "openUrl", "handleShareData", "shareData", "Lcom/rocket/android/model/ShareData;", "isWsConnected", "loadLibrary", "lib", "onAuthExpired", "onAuthNoBind", "onFFConversationListFinish", "onFlipChatMsgUpdate", "Landroid/os/Bundle;", "lastMsg", "Lcom/rocket/android/model/FFMsgData;", "unreadCountData", "Lcom/rocket/android/model/UnReadCountData;", "onHostSessionExpired", "onLastMsgUpdate", "data", "onUnreadCountUpdate", "onUserUnBind", "openBrowserActivity", "url", "secEncode", "", "bytes", "sendMsg", "ffWsMsg", "Lcom/rocket/android/commonsdk/wschannel/FFWsMsg;", "showRedBadge", "count", "", "unbindFlipChatInfo", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements IFusionFuelSdkDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63643a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f63644b = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/rocket/FFSdkDepend$goToLogin$1", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatPageRequestCallback;", "onPageComplete", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.rocket.a$a  reason: collision with other inner class name */
    public static final class C0687a implements FlipChatPageRequestCallback {
        public final void onPageComplete() {
        }

        C0687a() {
        }
    }

    public final boolean canRecommendOthersToMe() {
        return true;
    }

    public final void showRedBadge(int i) {
    }

    private a() {
    }

    @NotNull
    public final String getAppUserAvatar() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70861, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70861, new Class[0], String.class);
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        String avatarUrl = a2.getAvatarUrl();
        Intrinsics.checkExpressionValueIsNotNull(avatarUrl, "AccountUserProxyService.get().avatarUrl");
        return avatarUrl;
    }

    @Nullable
    public final String getDeviceFingerPrint() {
        if (!PatchProxy.isSupport(new Object[0], this, f63643a, false, 70846, new Class[0], String.class)) {
            return ca.a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70846, new Class[0], String.class);
    }

    public final boolean goToLogin() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70852, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70852, new Class[0], Boolean.TYPE)).booleanValue();
        }
        d.f63651b.goToLogin(new C0687a());
        return true;
    }

    public final void onAuthExpired() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70853, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public final void onAuthNoBind() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70854, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public final void onHostSessionExpired() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70855, new Class[0], Void.TYPE);
            return;
        }
        goToLogin();
    }

    public final void onUserUnBind() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70856, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70857, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70857, new Class[0], Void.TYPE);
            return;
        }
        if (b.a().a("flipchat")) {
            c.h.o = false;
            d.a().refreshPassportUserInfo();
        }
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
        if (a2 != null) {
            a2.onFlipChatMsgUnbind(true);
        }
    }

    public final boolean canRecommendMeToOthers() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70860, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70860, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        User curUser = a2.getCurUser();
        Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
        return curUser.isHideSearch();
    }

    public final boolean canUseHostPhoneContact() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70859, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70859, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(GlobalContext.getContext(), "android.permission.READ_CONTACTS") == 0) {
            return true;
        } else {
            return false;
        }
    }

    @NotNull
    public final String getAppUserName() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70862, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70862, new Class[0], String.class);
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        User curUser = a2.getCurUser();
        Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
        String nickname = curUser.getNickname();
        Intrinsics.checkExpressionValueIsNotNull(nickname, "AccountUserProxyService.get().curUser.nickname");
        return nickname;
    }

    public final boolean isWsConnected() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70847, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70847, new Class[0], Boolean.TYPE)).booleanValue();
        }
        com.ss.android.websocket.b.a a2 = com.ss.android.websocket.b.a.a(GlobalContext.getContext());
        f d2 = f.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "WSMessageManager.getInstance()");
        if (a2.a(d2.e()) == b.a.CONNECTED) {
            z = true;
        }
        return z;
    }

    public final void onFFConversationListFinish() {
        if (PatchProxy.isSupport(new Object[0], this, f63643a, false, 70866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63643a, false, 70866, new Class[0], Void.TYPE);
            return;
        }
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
        if (a2 != null) {
            a2.onFlipChatConversationListFinish(a(FusionFuelSdk.getLastMsg(), FusionFuelSdk.getMsgUnReadCountData()));
        }
        ALog.e("im_flip_chat", "onFFConversationListFinish");
    }

    public final boolean loadLibrary(@NotNull String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63643a, false, 70858, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f63643a, false, 70858, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "lib");
        try {
            System.loadLibrary(str);
        } catch (Throwable unused) {
            if (str.hashCode() == -346360734 && str2.equals("medecrypter")) {
                z = j.a("com.ss.android.ugc.aweme.fusionfuelplugin", str2);
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void onLastMsgUpdate(@Nullable FFMsgData fFMsgData) {
        FFMsgData fFMsgData2 = fFMsgData;
        if (PatchProxy.isSupport(new Object[]{fFMsgData2}, this, f63643a, false, 70865, new Class[]{FFMsgData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fFMsgData2}, this, f63643a, false, 70865, new Class[]{FFMsgData.class}, Void.TYPE);
            return;
        }
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
        if (a2 != null) {
            a2.onFlipChatLastMsgUpdate(a(fFMsgData2, FusionFuelSdk.getMsgUnReadCountData()));
        }
        ALog.e("im_flip_chat", "onLastMsgUpdate");
    }

    public final void onUnreadCountUpdate(@Nullable UnReadCountData unReadCountData) {
        UnReadCountData unReadCountData2 = unReadCountData;
        if (PatchProxy.isSupport(new Object[]{unReadCountData2}, this, f63643a, false, 70864, new Class[]{UnReadCountData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{unReadCountData2}, this, f63643a, false, 70864, new Class[]{UnReadCountData.class}, Void.TYPE);
            return;
        }
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
        if (a2 != null) {
            a2.onFlipChatUnreadCountUpdate(a(FusionFuelSdk.getLastMsg(), unReadCountData2));
        }
        ALog.e("im_flip_chat", "onUnreadCountUpdate");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] secEncode(@org.jetbrains.annotations.Nullable byte[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f63643a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class<byte[]> r8 = byte[].class
            r5 = 0
            r6 = 70863(0x114cf, float:9.93E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f63643a
            r13 = 0
            r14 = 70863(0x114cf, float:9.93E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class<byte[]> r16 = byte[].class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            byte[] r0 = (byte[]) r0
            return r0
        L_0x0039:
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            r2 = 1128(0x468, double:5.573E-321)
            com.ss.sys.ces.out.ISdk r1 = com.ss.sys.ces.out.StcSDKFactory.getSDK((android.content.Context) r1, (long) r2)
            byte[] r0 = r1.encode(r0)
            java.lang.String r1 = "StcSDKFactory.getSDK(Glo…EME_APP_ID).encode(bytes)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.rocket.a.secEncode(byte[]):byte[]");
    }

    public final void sendMsg(@NotNull FFWsMsg fFWsMsg) {
        FFWsMsg fFWsMsg2 = fFWsMsg;
        if (PatchProxy.isSupport(new Object[]{fFWsMsg2}, this, f63643a, false, 70848, new Class[]{FFWsMsg.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fFWsMsg2}, this, f63643a, false, 70848, new Class[]{FFWsMsg.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fFWsMsg2, "ffWsMsg");
        if (isWsConnected()) {
            f d2 = f.d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "WSMessageManager.getInstance()");
            String e2 = d2.e();
            HashMap hashMap = new HashMap();
            List<FFWsMsg.a> msgHeaders = fFWsMsg.getMsgHeaders();
            Intrinsics.checkExpressionValueIsNotNull(msgHeaders, "ffWsMsg.msgHeaders");
            for (FFWsMsg.a aVar : msgHeaders) {
                Intrinsics.checkExpressionValueIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
                String str = aVar.f27368a;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.key");
                String str2 = aVar.f27369b;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.value");
                hashMap.put(str, str2);
            }
            e eVar = new e(e2, fFWsMsg.getService(), fFWsMsg.getSeqId(), 0, fFWsMsg.getMethod(), fFWsMsg.getPayload(), fFWsMsg.getPayloadType(), fFWsMsg.getPayloadEncoding(), hashMap);
            org.greenrobot.eventbus.c.a().d(new com.ss.android.websocket.b.a.d(e2, eVar));
        }
    }

    public final void antiSpamReport(@NotNull Context context, @NotNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f63643a, false, 70845, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f63643a, false, 70845, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, "str");
        ca.a(context, str);
    }

    public final void handleSchema(@NotNull Context context, @Nullable String str) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str}, this, f63643a, false, 70850, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str}, this, f63643a, false, 70850, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if (str != null) {
            p.a(context, str);
        }
    }

    @Nullable
    public final Bundle a(@Nullable FFMsgData fFMsgData, @Nullable UnReadCountData unReadCountData) {
        if (PatchProxy.isSupport(new Object[]{fFMsgData, unReadCountData}, this, f63643a, false, 70867, new Class[]{FFMsgData.class, UnReadCountData.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{fFMsgData, unReadCountData}, this, f63643a, false, 70867, new Class[]{FFMsgData.class, UnReadCountData.class}, Bundle.class);
        } else if (!d.f63651b.isLogin() || !d.f63651b.isBindFlipChat()) {
            return null;
        } else {
            if (fFMsgData == null || unReadCountData == null) {
                ALog.e("imsdk", "onFlipChatMsgUpdate-null");
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(fFMsgData.getContent())) {
                bundle.putString("flip_chat_msg_content", GlobalContext.getContext().getString(C0906R.string.afl));
            } else {
                bundle.putString("flip_chat_msg_content", fFMsgData.getContent());
            }
            bundle.putString("flip_chat_msg_src_content", fFMsgData.getContent());
            bundle.putLong("flip_chat_msg_update_time", fFMsgData.getCreateAtTime());
            bundle.putLong("flip_chat_msg_unread_count", unReadCountData.getUnReadMgsCount());
            bundle.putLong("flip_chat_msg_last_unread_time", unReadCountData.getConLastTime());
            bundle.putLong("flip_chat_msg_unread_dot_count", unReadCountData.getMuteUunReadMgsCount());
            bundle.putLong("flip_chat_msg_last_unread_dot_time", unReadCountData.getMuteConLastTime());
            ALog.e("imsdk", "onFlipChatMsgUpdate");
            return bundle;
        }
    }

    public final void handleShareData(@NotNull Context context, @NotNull ShareData shareData) {
        if (PatchProxy.isSupport(new Object[]{context, shareData}, this, f63643a, false, 70851, new Class[]{Context.class, ShareData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, shareData}, this, f63643a, false, 70851, new Class[]{Context.class, ShareData.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(shareData, "shareData");
        String schema = shareData.getSchema();
        if (schema == null || !(!StringsKt.isBlank(schema)) || ((!StringsKt.startsWith$default(schema, com.ss.android.ugc.aweme.app.e.f34152b, false, 2, null) && !StringsKt.startsWith$default(schema, "snssdk1128", false, 2, null)) || shareData.getAid() != 1128)) {
            String link = shareData.getLink();
            Intrinsics.checkExpressionValueIsNotNull(link, "shareData.link");
            openBrowserActivity(context, link);
            return;
        }
        handleSchema(context, schema);
    }

    public final void openBrowserActivity(@NotNull Context context, @NotNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f63643a, false, 70849, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f63643a, false, 70849, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        Intent intent = new Intent(v.a(context), CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        intent.putExtra("bundle_webview_background", v.a(context).getResources().getColor(C0906R.color.ao4));
        if (TextUtils.equals("MX4 Pro", Build.MODEL)) {
            CharSequence charSequence = "meizu";
            String str3 = Build.BRAND;
            Intrinsics.checkExpressionValueIsNotNull(str3, "Build.BRAND");
            if (str3 != null) {
                String lowerCase = str3.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (TextUtils.equals(charSequence, lowerCase)) {
                    intent.putExtra("bundle_fix_webview", false);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        v.a(context).startActivity(intent);
    }
}
