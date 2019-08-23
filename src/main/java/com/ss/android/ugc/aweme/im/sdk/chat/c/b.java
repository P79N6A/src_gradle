package com.ss.android.ugc.aweme.im.sdk.chat.c;

import android.text.TextUtils;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/utils/RedEnvelopeTextUtils;", "", "()V", "wrapperMessageHint", "", "msg", "Lcom/bytedance/im/core/model/Message;", "msgHint", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50300a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f50301b = new b();

    private b() {
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull n nVar, @NotNull String str) {
        String str2;
        n nVar2 = nVar;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{nVar2, str3}, null, f50300a, true, 51373, new Class[]{n.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{nVar2, str3}, null, f50300a, true, 51373, new Class[]{n.class, String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(nVar2, "msg");
        Intrinsics.checkParameterIsNotNull(str3, "msgHint");
        if (nVar.isSelf()) {
            IMUser b2 = e.a().b(String.valueOf(com.bytedance.im.core.d.e.a(nVar.getConversationId())));
            Intrinsics.checkExpressionValueIsNotNull(b2, "IMUserManager.inst().getUser(uid)");
            str2 = b2.getNickName();
        } else {
            User c2 = d.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "AppUtil.getCurrentUser()");
            str2 = c2.getNickname();
        }
        if (TextUtils.isEmpty(str2)) {
            return str3;
        }
        return "@" + str2 + ' ' + str3;
    }
}
