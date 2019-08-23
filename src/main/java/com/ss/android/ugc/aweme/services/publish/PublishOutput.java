package com.ss.android.ugc.aweme.services.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/services/publish/PublishOutput;", "", "filePath", "", "(Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class PublishOutput {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private final String filePath;

    public static /* synthetic */ PublishOutput copy$default(PublishOutput publishOutput, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishOutput.filePath;
        }
        return publishOutput.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.filePath;
    }

    @NotNull
    public final PublishOutput copy(@Nullable String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71545, new Class[]{String.class}, PublishOutput.class)) {
            return new PublishOutput(str2);
        }
        return (PublishOutput) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71545, new Class[]{String.class}, PublishOutput.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 71548, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof PublishOutput) && Intrinsics.areEqual((Object) this.filePath, (Object) ((PublishOutput) obj).filePath));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 71548, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71547, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71547, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.filePath;
        if (str != null) {
            i = str.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71546, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71546, new Class[0], String.class);
        }
        return "PublishOutput(filePath=" + this.filePath + ")";
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    public PublishOutput(@Nullable String str) {
        this.filePath = str;
    }
}
