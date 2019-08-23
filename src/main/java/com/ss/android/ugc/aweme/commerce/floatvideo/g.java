package com.ss.android.ugc.aweme.commerce.floatvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/floatvideo/FloatVideoModel;", "", "playerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "(Lcom/ss/android/ugc/aweme/video/PlayerManager;Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getPlayerManager", "()Lcom/ss/android/ugc/aweme/video/PlayerManager;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36923a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final o f36924b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Aweme f36925c;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f36923a, false, 28203, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f36923a, false, 28203, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!Intrinsics.areEqual((Object) this.f36924b, (Object) gVar.f36924b) || !Intrinsics.areEqual((Object) this.f36925c, (Object) gVar.f36925c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f36923a, false, 28202, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36923a, false, 28202, new Class[0], Integer.TYPE)).intValue();
        }
        o oVar = this.f36924b;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        Aweme aweme = this.f36925c;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f36923a, false, 28201, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f36923a, false, 28201, new Class[0], String.class);
        }
        return "FloatVideoModel(playerManager=" + this.f36924b + ", aweme=" + this.f36925c + ")";
    }
}
