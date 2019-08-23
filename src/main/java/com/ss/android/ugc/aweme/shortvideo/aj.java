package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.e.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.e.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/CombineRecordModeHelper;", "", "()V", "longDurationCombineTag", "", "getLongDurationCombineTag", "()Ljava/lang/String;", "normalCombineTag", "shortDurationCombineTag", "getShortDurationCombineTag", "getRecordModeForDA", "tag", "getShootModeForCombineTag", "", "isCombineModeEnable", "", "isCombineModeForTag", "isLongDurationRecordAsTabEnable", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65578a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    static final String f65579b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    static final String f65580c;

    /* renamed from: d  reason: collision with root package name */
    public static final aj f65581d = new aj();

    /* renamed from: e  reason: collision with root package name */
    private static final String f65582e;

    private aj() {
    }

    @NotNull
    public static String a() {
        return f65579b;
    }

    @NotNull
    public static String b() {
        return f65580c;
    }

    static {
        String string = a.a().getString(C0906R.string.bwy);
        Intrinsics.checkExpressionValueIsNotNull(string, "AppProvider.getApp().get….record_mode_combine_tag)");
        f65582e = string;
        String string2 = a.a().getString(C0906R.string.bww);
        Intrinsics.checkExpressionValueIsNotNull(string2, "AppProvider.getApp().get…cord_mode_combine_15_tag)");
        f65579b = string2;
        String string3 = a.a().getString(C0906R.string.bwx);
        Intrinsics.checkExpressionValueIsNotNull(string3, "AppProvider.getApp().get…cord_mode_combine_60_tag)");
        f65580c = string3;
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f65578a, false, 73984, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UsingMixRecordButton);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65578a, false, 73984, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f65578a, false, 73985, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65578a, false, 73985, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean a2 = com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.LongDurationRecordAsTab);
        if (com.ss.android.g.a.b()) {
            if (!c() || !a2) {
                return false;
            }
            return true;
        } else if (!f.a() || !c() || !a2) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65578a, false, 73986, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f65578a, false, 73986, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "tag");
        if (Intrinsics.areEqual((Object) f65582e, (Object) str2) || Intrinsics.areEqual((Object) f65579b, (Object) str2) || Intrinsics.areEqual((Object) f65580c, (Object) str2)) {
            return true;
        }
        return false;
    }
}
