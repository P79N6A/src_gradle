package com.ss.android.ugc.aweme.im.sdk.group.b;

import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.c;
import com.bytedance.im.core.d.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/utils/GroupHelper;", "", "()V", "KEY_GROUP_BANNED", "", "VALUE_GROUP_BANNED", "isGroupBanned", "", "conversation", "Lcom/bytedance/im/core/model/Conversation;", "conversationId", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51577a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f51578b = new a();

    private a() {
    }

    @JvmStatic
    public static final boolean a(@Nullable b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, null, f51577a, true, 52246, new Class[]{b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, null, f51577a, true, 52246, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
        }
        if (!(bVar == null || !bVar.isGroupChat() || bVar.getCoreInfo() == null)) {
            c coreInfo = bVar.getCoreInfo();
            Intrinsics.checkExpressionValueIsNotNull(coreInfo, "conversation.coreInfo");
            if (coreInfo.getExt() != null) {
                c coreInfo2 = bVar.getCoreInfo();
                Intrinsics.checkExpressionValueIsNotNull(coreInfo2, "conversation.coreInfo");
                if (Intrinsics.areEqual((Object) coreInfo2.getExt().get("a:s_banned"), (Object) PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean a(@Nullable String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f51577a, true, 52245, new Class[]{String.class}, Boolean.TYPE)) {
            return a(d.a().a(str2));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f51577a, true, 52245, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }
}
