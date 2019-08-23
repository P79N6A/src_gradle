package com.ss.android.ugc.aweme.longvideo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/LongVideoParams;", "", "eventType", "", "pageType", "", "isLongItem", "(Ljava/lang/String;II)V", "getEventType", "()Ljava/lang/String;", "()I", "getPageType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final String f53913a;

    /* renamed from: b  reason: collision with root package name */
    public final int f53914b;

    /* renamed from: c  reason: collision with root package name */
    public final int f53915c;

    public f() {
        this(null, 0, 0, 7);
    }

    public f(@NotNull String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "eventType");
        this.f53913a = str;
        this.f53914b = i;
        this.f53915c = i2;
    }

    private /* synthetic */ f(String str, int i, int i2, int i3) {
        this("", 0, 0);
    }
}
