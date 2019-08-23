package com.ss.android.ugc.aweme.shortvideo.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.f;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\"\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/monitor/AVSettingsMonitor;", "", "()V", "WHITE_LIST_LOG_TYPE", "", "hasABModelFetched", "", "hasSettingFetched", "monitorResolution", "", "monitorResolutionOnABModelGet", "monitorResolutionOnSettingsGet", "monitorSettingItem", "key", "value", "", "extra", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68040a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f68041b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f68042c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f68043d = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"is720Resolution", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.h.a$a  reason: collision with other inner class name */
    static final class C0716a extends Lambda implements Function0<Boolean> {
        public static final C0716a INSTANCE = new C0716a();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0716a() {
            super(0);
        }

        public final boolean invoke() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77707, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77707, new Class[0], Boolean.TYPE)).booleanValue();
            }
            int[] j = f.j();
            if (j != null) {
                if (j.length >= 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    j = null;
                }
                if (j == null || j[0] != 720) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"is720ResolutionUpload", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Boolean> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        public final boolean invoke() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77708, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77708, new Class[0], Boolean.TYPE)).booleanValue();
            }
            int[] k = f.k();
            if (k != null) {
                if (k.length >= 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    k = null;
                }
                if (k == null || k[0] != 720) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    @JvmOverloads
    public final void a(@NotNull String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f68040a, false, 77705, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f68040a, false, 77705, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(str2, i, "");
    }

    private a() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68040a, false, 77706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68040a, false, 77706, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this) {
            if (f68042c && f68041b) {
                a aVar = f68043d;
                boolean invoke = C0716a.INSTANCE.invoke();
                aVar.a("resolution", invoke ? 1 : 0, MapsKt.mapOf(TuplesKt.to("resolution_default", com.ss.android.ugc.aweme.port.in.a.L.e(e.a.VideoSize)), TuplesKt.to("resolution_category", com.ss.android.ugc.aweme.port.in.a.L.e(e.a.VideoSizeCategory)), TuplesKt.to("resolution_real", f.h())).toString());
                a aVar2 = f68043d;
                boolean invoke2 = b.INSTANCE.invoke();
                aVar2.a("resolution", invoke2 ? 1 : 0, MapsKt.mapOf(TuplesKt.to("resolution_default", com.ss.android.ugc.aweme.port.in.a.L.e(e.a.VideoSize)), TuplesKt.to("resolution_category_upload", com.ss.android.ugc.aweme.port.in.a.L.e(e.a.ImportVideoSizeCategory)), TuplesKt.to("resolution_real_upload", f.i())).toString());
            }
        }
    }

    /* access modifiers changed from: private */
    @JvmOverloads
    public void a(@NotNull String str, int i, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4}, this, f68040a, false, 77704, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4}, this, f68040a, false, 77704, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "key");
        Intrinsics.checkParameterIsNotNull(str4, PushConstants.EXTRA);
        n.a("aweme_android_white_list", com.ss.android.ugc.aweme.tools.b.a.a(MapsKt.mapOf(TuplesKt.to("white_list_type", str3), TuplesKt.to("white_list_value", String.valueOf(i)), TuplesKt.to(PushConstants.EXTRA, str4))));
    }
}
