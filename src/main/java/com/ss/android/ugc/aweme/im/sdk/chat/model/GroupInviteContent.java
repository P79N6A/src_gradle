package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.group.a.c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/GroupInviteContent;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "()V", "groupInviteCardInfo", "Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupInviteCardInfo;", "getGroupInviteCardInfo", "()Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupInviteCardInfo;", "setGroupInviteCardInfo", "(Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupInviteCardInfo;)V", "getMsgHint", "", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupInviteContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_invite_card")
    @Nullable
    private c groupInviteCardInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/GroupInviteContent$Companion;", "", "()V", "obtain", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/GroupInviteContent;", "groupInviteCardInfo", "Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupInviteCardInfo;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final GroupInviteContent obtain(@NotNull c cVar) {
            c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 51119, new Class[]{c.class}, GroupInviteContent.class)) {
                return (GroupInviteContent) PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 51119, new Class[]{c.class}, GroupInviteContent.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "groupInviteCardInfo");
            GroupInviteContent groupInviteContent = new GroupInviteContent();
            groupInviteContent.setGroupInviteCardInfo(cVar2);
            return groupInviteContent;
        }
    }

    @JvmStatic
    @NotNull
    public static final GroupInviteContent obtain(@NotNull c cVar) {
        c cVar2 = cVar;
        if (!PatchProxy.isSupport(new Object[]{cVar2}, null, changeQuickRedirect, true, 51118, new Class[]{c.class}, GroupInviteContent.class)) {
            return Companion.obtain(cVar2);
        }
        return (GroupInviteContent) PatchProxy.accessDispatch(new Object[]{cVar2}, null, changeQuickRedirect, true, 51118, new Class[]{c.class}, GroupInviteContent.class);
    }

    @Nullable
    public final c getGroupInviteCardInfo() {
        return this.groupInviteCardInfo;
    }

    @NotNull
    public final String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51117, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51117, new Class[0], String.class);
        }
        Context context = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
        String string = context.getResources().getString(C0906R.string.asn);
        Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…roup_invite_message_hint)");
        return string;
    }

    public final void setGroupInviteCardInfo(@Nullable c cVar) {
        this.groupInviteCardInfo = cVar;
    }
}
