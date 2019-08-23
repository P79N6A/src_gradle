package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/StickerMessage;", "", "messageType", "", "arg1", "arg2", "arg3", "", "(IIILjava/lang/String;)V", "getArg1", "()I", "getArg2", "getArg3", "()Ljava/lang/String;", "getMessageType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70328a;

    /* renamed from: b  reason: collision with root package name */
    public final int f70329b;

    /* renamed from: c  reason: collision with root package name */
    public final int f70330c;

    /* renamed from: d  reason: collision with root package name */
    public final int f70331d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final String f70332e;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70328a, false, 79942, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f70328a, false, 79942, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (this.f70329b == iVar.f70329b) {
                    if (this.f70330c == iVar.f70330c) {
                        if (!(this.f70331d == iVar.f70331d) || !Intrinsics.areEqual((Object) this.f70332e, (Object) iVar.f70332e)) {
                            return false;
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
        if (PatchProxy.isSupport(new Object[0], this, f70328a, false, 79941, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f70328a, false, 79941, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = ((((this.f70329b * 31) + this.f70330c) * 31) + this.f70331d) * 31;
        String str = this.f70332e;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f70328a, false, 79940, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f70328a, false, 79940, new Class[0], String.class);
        }
        return "StickerMessage(messageType=" + this.f70329b + ", arg1=" + this.f70330c + ", arg2=" + this.f70331d + ", arg3=" + this.f70332e + ")";
    }

    public i(int i, int i2, int i3, @Nullable String str) {
        this.f70329b = i;
        this.f70330c = i2;
        this.f70331d = i3;
        this.f70332e = str;
    }
}
