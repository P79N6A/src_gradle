package com.ss.android.ugc.aweme.discover.hotspot.a;

import com.bytedance.jedi.arch.ext.list.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesPayLoad;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "source", "", "hasMore", "", "cursor", "", "hotword", "lastIndex", "(Ljava/lang/String;ZILjava/lang/String;I)V", "getHotword", "()Ljava/lang/String;", "setHotword", "(Ljava/lang/String;)V", "getSource", "setSource", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends k {
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f42436c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f42437d;

    public f() {
        this(null, false, 0, null, 0, 31);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(@NotNull String str, boolean z, int i, @NotNull String str2) {
        super(z, i);
        Intrinsics.checkParameterIsNotNull(str, "source");
        Intrinsics.checkParameterIsNotNull(str2, "hotword");
        this.f42436c = str;
        this.f42437d = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, boolean z, int i, String str2, int i2, int i3) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str2);
    }
}
