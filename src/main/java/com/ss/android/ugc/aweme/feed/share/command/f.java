package com.ss.android.ugc.aweme.feed.share.command;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.share.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/share/command/GroupShareCommandJumpHandler;", "Lcom/ss/android/ugc/aweme/share/command/BaseCommandShareJumpHandler;", "()V", "canJumpTo", "", "code", "", "type", "qrCodeType", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45947a;

    public final boolean a(@Nullable String str, @Nullable String str2, int i) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2, Integer.valueOf(i)}, this, f45947a, false, 42163, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str2, Integer.valueOf(i)}, this, f45947a, false, 42163, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (TextUtils.equals(str2, "group_chat")) {
            IAccountUserService a2 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (a2.isLogin()) {
                IIMService a3 = b.a();
                if (a3 == null) {
                    return false;
                }
                a3.addGroupByPassword(str3);
                return true;
            }
        }
        return false;
    }
}
