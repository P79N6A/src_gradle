package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/ui/StickerPoi;", "Ljava/io/Serializable;", "id", "", "isPoi", "", "(Ljava/lang/String;Z)V", "doorplateLevelId", "getDoorplateLevelId", "()Ljava/lang/String;", "isDoorplateLevel", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class z implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private final String doorplateLevelId;
    public final String id;
    private final boolean isDoorplateLevel;
    private final boolean isPoi;

    public static /* synthetic */ z copy$default(z zVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zVar.id;
        }
        if ((i & 2) != 0) {
            z = zVar.isPoi;
        }
        return zVar.copy(str, z);
    }

    public final boolean component2() {
        return this.isPoi;
    }

    @NotNull
    public final z copy(@NotNull String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 80332, new Class[]{String.class, Boolean.TYPE}, z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 80332, new Class[]{String.class, Boolean.TYPE}, z.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "id");
        return new z(str2, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 80335, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 80335, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                if (Intrinsics.areEqual((Object) this.id, (Object) zVar.id)) {
                    if (this.isPoi == zVar.isPoi) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80334, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80334, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.id;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = i * 31;
        boolean z = this.isPoi;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80333, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80333, new Class[0], String.class);
        }
        return "StickerPoi(id=" + this.id + ", isPoi=" + this.isPoi + ")";
    }

    @Nullable
    public final String getDoorplateLevelId() {
        return this.doorplateLevelId;
    }

    public final boolean isDoorplateLevel() {
        return this.isDoorplateLevel;
    }

    public final boolean isPoi() {
        return this.isPoi;
    }

    public z(@NotNull String str, boolean z) {
        String str2;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.id = str;
        this.isPoi = z;
        boolean z3 = false;
        if (this.isPoi) {
            if (this.id.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (!Intrinsics.areEqual((Object) this.id, (Object) PushConstants.PUSH_TYPE_NOTIFY))) {
                z3 = true;
            }
        }
        this.isDoorplateLevel = z3;
        if (this.isDoorplateLevel) {
            str2 = this.id;
        } else {
            str2 = null;
        }
        this.doorplateLevelId = str2;
    }
}
