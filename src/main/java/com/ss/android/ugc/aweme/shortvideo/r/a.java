package com.ss.android.ugc.aweme.shortvideo.r;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.bm;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.utils.bk;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000b\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0006\u001a\u00020\u00018FX\u0002¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\u0007\u0010\u0003¨\u0006\f"}, d2 = {"WATER_DIR", "", "getWATER_DIR", "()Ljava/lang/String;", "WATER_DIR$delegate", "Lkotlin/Lazy;", "WATER_MASK_LAYER_DIR", "getWATER_MASK_LAYER_DIR", "WATER_MASK_LAYER_DIR$delegate", "prepareWaterMaskLayer", "vertical", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69020a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f69021b = {Reflection.property0(new PropertyReference0Impl(Reflection.getOrCreateKotlinPackage(a.class, "tools.dmt-av-impl_douyinCnRelease"), "WATER_DIR", "getWATER_DIR()Ljava/lang/String;")), Reflection.property0(new PropertyReference0Impl(Reflection.getOrCreateKotlinPackage(a.class, "tools.dmt-av-impl_douyinCnRelease"), "WATER_MASK_LAYER_DIR", "getWATER_MASK_LAYER_DIR()Ljava/lang/String;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    static final Lazy f69022c = LazyKt.lazy(C0725a.INSTANCE);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final Lazy f69023d = LazyKt.lazy(b.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.r.a$a  reason: collision with other inner class name */
    static final class C0725a extends Lambda implements Function0<String> {
        public static final C0725a INSTANCE = new C0725a();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0725a() {
            super(0);
        }

        @NotNull
        public final String invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81253, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81253, new Class[0], String.class);
            }
            String str = ff.f67717f + "water" + File.separatorChar;
            bm.a(str, false);
            return str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<String> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final String invoke() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81254, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81254, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (PatchProxy.isSupport(new Object[0], null, a.f69020a, true, 81250, new Class[0], String.class)) {
                value = PatchProxy.accessDispatch(new Object[0], null, a.f69020a, true, 81250, new Class[0], String.class);
            } else {
                value = a.f69022c.getValue();
            }
            sb.append((String) value);
            sb.append("mask");
            sb.append(File.separatorChar);
            String sb2 = sb.toString();
            bm.a(sb2, false);
            return sb2;
        }
    }

    @NotNull
    private static String a() {
        return (String) (PatchProxy.isSupport(new Object[0], null, f69020a, true, 81251, new Class[0], String.class) ? PatchProxy.accessDispatch(new Object[0], null, f69020a, true, 81251, new Class[0], String.class) : f69023d.getValue());
    }

    @Nullable
    public static final String a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f69020a, true, 81252, new Class[]{Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f69020a, true, 81252, new Class[]{Boolean.TYPE}, String.class);
        }
        if (z) {
            str = "av_ic_water_mark_9_16.png";
        } else {
            str = "av_ic_water_mark_16_9.png";
        }
        return bk.a((Context) com.ss.android.ugc.aweme.port.in.a.f61119b, str, a());
    }
}
