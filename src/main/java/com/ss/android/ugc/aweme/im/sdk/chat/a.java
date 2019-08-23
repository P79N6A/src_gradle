package com.ss.android.ugc.aweme.im.sdk.chat;

import android.arch.lifecycle.LifecycleOwner;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/ChatPanelFactoryManager;", "", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "getChatPanel", "Lcom/ss/android/ugc/aweme/im/sdk/chat/BaseChatPanel;", "view", "Landroid/view/View;", "sessionInfo", "Lcom/ss/android/ugc/aweme/im/sdk/chat/SessionInfo;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50274a;

    /* renamed from: b  reason: collision with root package name */
    final LifecycleOwner f50275b;

    public a(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        this.f50275b = lifecycleOwner;
    }
}
