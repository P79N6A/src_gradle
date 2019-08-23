package com.ss.android.ugc.aweme.discover.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/ClusterButtonData;", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "isMobShowSent", "", "clusterList", "", "Lcom/ss/android/ugc/aweme/music/model/Music;", "(ZLjava/util/List;)V", "getClusterList", "()Ljava/util/List;", "()Z", "setMobShowSent", "(Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends SearchMusic {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final List<Music> clusterList;
    private boolean isMobShowSent;

    public d() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ d copy$default(d dVar, boolean z, List<Music> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dVar.isMobShowSent;
        }
        if ((i & 2) != 0) {
            list = dVar.clusterList;
        }
        return dVar.copy(z, list);
    }

    public final boolean component1() {
        return this.isMobShowSent;
    }

    @NotNull
    public final List<Music> component2() {
        return this.clusterList;
    }

    @NotNull
    public final d copy(boolean z, @NotNull List<Music> list) {
        List<Music> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), list2}, this, changeQuickRedirect, false, 35537, new Class[]{Boolean.TYPE, List.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), list2}, this, changeQuickRedirect, false, 35537, new Class[]{Boolean.TYPE, List.class}, d.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "clusterList");
        return new d(z, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 35540, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 35540, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!(this.isMobShowSent == dVar.isMobShowSent) || !Intrinsics.areEqual((Object) this.clusterList, (Object) dVar.clusterList)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35539, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35539, new Class[0], Integer.TYPE)).intValue();
        }
        boolean z = this.isMobShowSent;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        List<Music> list = this.clusterList;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35538, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35538, new Class[0], String.class);
        }
        return "ClusterButtonData(isMobShowSent=" + this.isMobShowSent + ", clusterList=" + this.clusterList + ")";
    }

    @NotNull
    public final List<Music> getClusterList() {
        return this.clusterList;
    }

    public final boolean isMobShowSent() {
        return this.isMobShowSent;
    }

    public final void setMobShowSent(boolean z) {
        this.isMobShowSent = z;
    }

    public d(boolean z, @NotNull List<Music> list) {
        Intrinsics.checkParameterIsNotNull(list, "clusterList");
        this.isMobShowSent = z;
        this.clusterList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : list);
    }
}
