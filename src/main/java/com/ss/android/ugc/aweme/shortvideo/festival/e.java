package com.ss.android.ugc.aweme.shortvideo.festival;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.ex;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/festival/FestivalDataProvider;", "", "FestivalEntity", "Lcom/ss/android/ugc/aweme/festival/common/FestivalEntity;", "(Lcom/ss/android/ugc/aweme/festival/common/FestivalEntity;)V", "getFestivalEntity", "()Lcom/ss/android/ugc/aweme/festival/common/FestivalEntity;", "InFestival", "", "getInFestival", "()Z", "InFestival$delegate", "Lkotlin/Lazy;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67695a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f67696b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(e.class), "InFestival", "getInFestival()Z"))};
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.festival.common.a f67697c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f67698d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        public final boolean invoke() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77215, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77215, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (this.this$0.f67697c != null && this.this$0.f67697c.f47290d && !ex.b()) {
                z = true;
            }
            return z;
        }
    }

    public e() {
        this(null, 1);
    }

    public final boolean a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f67695a, false, 77214, new Class[0], Boolean.TYPE)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f67695a, false, 77214, new Class[0], Boolean.TYPE);
        } else {
            value = this.f67698d.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    private e(@Nullable com.ss.android.ugc.aweme.festival.common.a aVar) {
        this.f67697c = aVar;
        this.f67698d = LazyKt.lazy(new a(this));
    }

    public /* synthetic */ e(com.ss.android.ugc.aweme.festival.common.a aVar, int i) {
        this(com.ss.android.ugc.aweme.festival.christmas.a.e());
    }
}
