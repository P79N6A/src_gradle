package com.ss.android.ugc.aweme.story.profile.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryLoadMoreParams;", "", "cursor", "", "hasMore", "", "(JI)V", "getCursor", "()J", "getHasMore", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73284a;

    /* renamed from: b  reason: collision with root package name */
    public final long f73285b;

    /* renamed from: c  reason: collision with root package name */
    public final int f73286c;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f73285b == aVar.f73285b) {
                    if (this.f73286c == aVar.f73286c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f73285b;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f73286c;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f73284a, false, 84890, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f73284a, false, 84890, new Class[0], String.class);
        }
        return "AllStoryLoadMoreParams(cursor=" + this.f73285b + ", hasMore=" + this.f73286c + ")";
    }

    public a(long j, int i) {
        this.f73285b = j;
        this.f73286c = i;
    }
}
