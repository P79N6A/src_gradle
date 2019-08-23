package com.ss.android.ugc.aweme.services.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.d;
import com.ss.android.ugc.aweme.port.in.af;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/services/publish/ExtensionMisc;", "", "candidateLog", "", "defaultSelectStickerPoi", "Lcom/ss/android/ugc/aweme/draft/model/DefaultSelectStickerPoi;", "poiContext", "isFromMicroApp", "", "commerceData", "commerceDataContainer", "Lcom/ss/android/ugc/aweme/port/in/IPublishService$CommerceDataContainer;", "showPOI", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/draft/model/DefaultSelectStickerPoi;Ljava/lang/String;ZLjava/lang/String;Lcom/ss/android/ugc/aweme/port/in/IPublishService$CommerceDataContainer;Z)V", "getCandidateLog", "()Ljava/lang/String;", "getCommerceData", "getCommerceDataContainer", "()Lcom/ss/android/ugc/aweme/port/in/IPublishService$CommerceDataContainer;", "getDefaultSelectStickerPoi", "()Lcom/ss/android/ugc/aweme/draft/model/DefaultSelectStickerPoi;", "()Z", "getPoiContext", "getShowPOI", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class ExtensionMisc {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private final String candidateLog;
    @Nullable
    private final String commerceData;
    @Nullable
    private final af.a commerceDataContainer;
    @Nullable
    private final d defaultSelectStickerPoi;
    private final boolean isFromMicroApp;
    @Nullable
    private final String poiContext;
    private final boolean showPOI;

    public static /* synthetic */ ExtensionMisc copy$default(ExtensionMisc extensionMisc, String str, d dVar, String str2, boolean z, String str3, af.a aVar, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extensionMisc.candidateLog;
        }
        if ((i & 2) != 0) {
            dVar = extensionMisc.defaultSelectStickerPoi;
        }
        d dVar2 = dVar;
        if ((i & 4) != 0) {
            str2 = extensionMisc.poiContext;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = extensionMisc.isFromMicroApp;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            str3 = extensionMisc.commerceData;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            aVar = extensionMisc.commerceDataContainer;
        }
        af.a aVar2 = aVar;
        if ((i & 64) != 0) {
            z2 = extensionMisc.showPOI;
        }
        return extensionMisc.copy(str, dVar2, str4, z3, str5, aVar2, z2);
    }

    @Nullable
    public final String component1() {
        return this.candidateLog;
    }

    @Nullable
    public final d component2() {
        return this.defaultSelectStickerPoi;
    }

    @Nullable
    public final String component3() {
        return this.poiContext;
    }

    public final boolean component4() {
        return this.isFromMicroApp;
    }

    @Nullable
    public final String component5() {
        return this.commerceData;
    }

    @Nullable
    public final af.a component6() {
        return this.commerceDataContainer;
    }

    public final boolean component7() {
        return this.showPOI;
    }

    @NotNull
    public final ExtensionMisc copy(@Nullable String str, @Nullable d dVar, @Nullable String str2, boolean z, @Nullable String str3, @Nullable af.a aVar, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{str, dVar, str2, Byte.valueOf(z ? (byte) 1 : 0), str3, aVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71541, new Class[]{String.class, d.class, String.class, Boolean.TYPE, String.class, af.a.class, Boolean.TYPE}, ExtensionMisc.class)) {
            return (ExtensionMisc) PatchProxy.accessDispatch(new Object[]{str, dVar, str2, Byte.valueOf(z), str3, aVar, Byte.valueOf(z2)}, this, changeQuickRedirect, false, 71541, new Class[]{String.class, d.class, String.class, Boolean.TYPE, String.class, af.a.class, Boolean.TYPE}, ExtensionMisc.class);
        }
        ExtensionMisc extensionMisc = new ExtensionMisc(str, dVar, str2, z, str3, aVar, z2);
        return extensionMisc;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 71544, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 71544, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof ExtensionMisc) {
                ExtensionMisc extensionMisc = (ExtensionMisc) obj;
                if (Intrinsics.areEqual((Object) this.candidateLog, (Object) extensionMisc.candidateLog) && Intrinsics.areEqual((Object) this.defaultSelectStickerPoi, (Object) extensionMisc.defaultSelectStickerPoi) && Intrinsics.areEqual((Object) this.poiContext, (Object) extensionMisc.poiContext)) {
                    if ((this.isFromMicroApp == extensionMisc.isFromMicroApp) && Intrinsics.areEqual((Object) this.commerceData, (Object) extensionMisc.commerceData) && Intrinsics.areEqual((Object) this.commerceDataContainer, (Object) extensionMisc.commerceDataContainer)) {
                        if (this.showPOI == extensionMisc.showPOI) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71543, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71543, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.candidateLog;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        d dVar = this.defaultSelectStickerPoi;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str2 = this.poiContext;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isFromMicroApp;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.commerceData;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        af.a aVar = this.commerceDataContainer;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        int i3 = (hashCode4 + i) * 31;
        boolean z2 = this.showPOI;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71542, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71542, new Class[0], String.class);
        }
        return "ExtensionMisc(candidateLog=" + this.candidateLog + ", defaultSelectStickerPoi=" + this.defaultSelectStickerPoi + ", poiContext=" + this.poiContext + ", isFromMicroApp=" + this.isFromMicroApp + ", commerceData=" + this.commerceData + ", commerceDataContainer=" + this.commerceDataContainer + ", showPOI=" + this.showPOI + ")";
    }

    @Nullable
    public final String getCandidateLog() {
        return this.candidateLog;
    }

    @Nullable
    public final String getCommerceData() {
        return this.commerceData;
    }

    @Nullable
    public final af.a getCommerceDataContainer() {
        return this.commerceDataContainer;
    }

    @Nullable
    public final d getDefaultSelectStickerPoi() {
        return this.defaultSelectStickerPoi;
    }

    @Nullable
    public final String getPoiContext() {
        return this.poiContext;
    }

    public final boolean getShowPOI() {
        return this.showPOI;
    }

    public final boolean isFromMicroApp() {
        return this.isFromMicroApp;
    }

    public ExtensionMisc(@Nullable String str, @Nullable d dVar, @Nullable String str2, boolean z, @Nullable String str3, @Nullable af.a aVar, boolean z2) {
        this.candidateLog = str;
        this.defaultSelectStickerPoi = dVar;
        this.poiContext = str2;
        this.isFromMicroApp = z;
        this.commerceData = str3;
        this.commerceDataContainer = aVar;
        this.showPOI = z2;
    }
}
