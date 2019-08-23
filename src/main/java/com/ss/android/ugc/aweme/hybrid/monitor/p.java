package com.ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u001b\u0010\u0007\u001a\u00020\b8VX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8VX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/UnitAbstractSession;", "Lcom/ss/android/ugc/aweme/hybrid/monitor/AbstractSession;", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitSession;", "uri", "Landroid/net/Uri;", "preSession", "(Landroid/net/Uri;Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitSession;)V", "pageIdentifier", "Lcom/ss/android/ugc/aweme/hybrid/monitor/PageIdentifier;", "getPageIdentifier", "()Lcom/ss/android/ugc/aweme/hybrid/monitor/PageIdentifier;", "pageIdentifier$delegate", "Lkotlin/Lazy;", "unitIdentifier", "Lcom/ss/android/ugc/aweme/hybrid/monitor/Identifier;", "getUnitIdentifier", "()Lcom/ss/android/ugc/aweme/hybrid/monitor/Identifier;", "unitIdentifier$delegate", "getUri", "()Landroid/net/Uri;", "navigateToUri", "", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
public abstract class p extends a implements k {
    public static ChangeQuickRedirect g;
    static final /* synthetic */ KProperty[] h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(p.class), "unitIdentifier", "getUnitIdentifier()Lcom/ss/android/ugc/aweme/hybrid/monitor/Identifier;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(p.class), "pageIdentifier", "getPageIdentifier()Lcom/ss/android/ugc/aweme/hybrid/monitor/PageIdentifier;"))};
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f49993e = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new b<Object>(this));
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f49994f = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new a<Object>(this));
    @NotNull
    public final Uri i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/hybrid/monitor/PageIdentifier;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<m> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ p this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        @NotNull
        public final m invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49933, new Class[0], m.class)) {
                return new m(this.this$0.i, this.this$0.i);
            }
            return (m) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49933, new Class[0], m.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/hybrid/monitor/Identifier;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<l> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ p this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        @NotNull
        public final l invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49934, new Class[0], l.class)) {
                return new l(this.this$0.i, null, 2);
            }
            return (l) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49934, new Class[0], l.class);
        }
    }

    @NotNull
    public final l c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 49930, new Class[0], l.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 49930, new Class[0], l.class);
        } else {
            value = this.f49993e.getValue();
        }
        return (l) value;
    }

    @NotNull
    public final m d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 49931, new Class[0], m.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 49931, new Class[0], m.class);
        } else {
            value = this.f49994f.getValue();
        }
        return (m) value;
    }

    public final void b(@NotNull Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2}, this, g, false, 49932, new Class[]{Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2}, this, g, false, 49932, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(uri2, "uri");
        m d2 = d();
        if (PatchProxy.isSupport(new Object[]{uri2}, d2, m.f49986a, false, 49925, new Class[]{Uri.class}, Void.TYPE)) {
            m mVar = d2;
            PatchProxy.accessDispatch(new Object[]{uri2}, mVar, m.f49986a, false, 49925, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(uri2, "value");
        d2.f49989d = uri2;
        d2.f49988c = new l(d2.f49989d, "page_");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(@NotNull Uri uri, @Nullable k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        this.i = uri;
    }
}
