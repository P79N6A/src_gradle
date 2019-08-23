package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.ext.list.k;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationPayload;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "title", "", "relationCount", "", "hasMore", "", "cursor", "(Ljava/lang/String;IZI)V", "getRelationCount", "()I", "getTitle", "()Ljava/lang/String;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends k {
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f48210c;

    /* renamed from: d  reason: collision with root package name */
    public final int f48211d;

    public b() {
        this(null, 0, false, 0, 15);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull String str, int i, boolean z, int i2) {
        super(z, i2);
        Intrinsics.checkParameterIsNotNull(str, PushConstants.TITLE);
        this.f48210c = str;
        this.f48211d = i;
    }

    public /* synthetic */ b(String str, int i, boolean z, int i2, int i3) {
        this("", 0, true, 0);
    }
}
