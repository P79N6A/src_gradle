package com.ss.android.ugc.aweme.discover.d.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/repo/fetcher/DiscoverRequestParam;", "Ljava/io/Serializable;", "cursor", "", "(I)V", "getCursor", "()I", "setCursor", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements Serializable {
    public static final a Companion = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    private int cursor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/repo/fetcher/DiscoverRequestParam$Companion;", "Ljava/io/Serializable;", "()V", "CURSOR_REFRESH", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Serializable {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ b copy$default(b bVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.cursor;
        }
        return bVar.copy(i);
    }

    public final int component1() {
        return this.cursor;
    }

    @NotNull
    public final b copy(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 37360, new Class[]{Integer.TYPE}, b.class)) {
            return new b(i);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 37360, new Class[]{Integer.TYPE}, b.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                if (this.cursor == ((b) obj).cursor) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.cursor;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37361, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37361, new Class[0], String.class);
        }
        return "DiscoverRequestParam(cursor=" + this.cursor + ")";
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public b(int i) {
        this.cursor = i;
    }
}
