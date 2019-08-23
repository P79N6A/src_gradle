package com.ss.android.ugc.aweme.discover.hitrank;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hitrank/HitTaskInfo;", "Ljava/io/Serializable;", "compeletedTaskCnt", "", "totalTaskCnt", "(II)V", "getCompeletedTaskCnt", "()I", "setCompeletedTaskCnt", "(I)V", "getTotalTaskCnt", "setTotalTaskCnt", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("compeleted_task_cnt")
    private int compeletedTaskCnt;
    @SerializedName("total_task_cnt")
    private int totalTaskCnt;

    public static /* synthetic */ b copy$default(b bVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bVar.compeletedTaskCnt;
        }
        if ((i3 & 2) != 0) {
            i2 = bVar.totalTaskCnt;
        }
        return bVar.copy(i, i2);
    }

    public final int component1() {
        return this.compeletedTaskCnt;
    }

    public final int component2() {
        return this.totalTaskCnt;
    }

    @NotNull
    public final b copy(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 36378, new Class[]{Integer.TYPE, Integer.TYPE}, b.class)) {
            return new b(i, i2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 36378, new Class[]{Integer.TYPE, Integer.TYPE}, b.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.compeletedTaskCnt == bVar.compeletedTaskCnt) {
                    if (this.totalTaskCnt == bVar.totalTaskCnt) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.compeletedTaskCnt * 31) + this.totalTaskCnt;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36379, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36379, new Class[0], String.class);
        }
        return "HitTaskInfo(compeletedTaskCnt=" + this.compeletedTaskCnt + ", totalTaskCnt=" + this.totalTaskCnt + ")";
    }

    public final int getCompeletedTaskCnt() {
        return this.compeletedTaskCnt;
    }

    public final int getTotalTaskCnt() {
        return this.totalTaskCnt;
    }

    public final void setCompeletedTaskCnt(int i) {
        this.compeletedTaskCnt = i;
    }

    public final void setTotalTaskCnt(int i) {
        this.totalTaskCnt = i;
    }

    public b(int i, int i2) {
        this.compeletedTaskCnt = i;
        this.totalTaskCnt = i2;
    }
}
