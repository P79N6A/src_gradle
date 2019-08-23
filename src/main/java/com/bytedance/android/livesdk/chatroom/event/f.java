package com.bytedance.android.livesdk.chatroom.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/event/DoSendGiftEvent;", "", "giftId", "", "count", "", "(JI)V", "getCount", "()I", "getGiftId", "()J", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "livebase_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10168a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f10169b = "";

    /* renamed from: c  reason: collision with root package name */
    public final long f10170c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10171d;

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f10168a, false, 4288, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f10168a, false, 4288, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.f10169b = str2;
    }

    public f(long j, int i) {
        this.f10170c = j;
        this.f10171d = i;
    }
}
