package com.ss.android.ugc.aweme.message.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.message.model.NoticeCount;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/message/event/FollowTabNoticeEvent;", "", "()V", "noticeCountList", "", "Lcom/ss/android/ugc/aweme/message/model/NoticeCount;", "getNoticeCountList", "()Ljava/util/List;", "noticeCountList$delegate", "Lkotlin/Lazy;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55354a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f55355b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "noticeCountList", "getNoticeCountList()Ljava/util/List;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f55356c = LazyKt.lazy(C0637a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/message/model/NoticeCount;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.message.b.a$a  reason: collision with other inner class name */
    static final class C0637a extends Lambda implements Function0<List<NoticeCount>> {
        public static final C0637a INSTANCE = new C0637a();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0637a() {
            super(0);
        }

        @NotNull
        public final List<NoticeCount> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58728, new Class[0], List.class)) {
                return new ArrayList<>();
            }
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58728, new Class[0], List.class);
        }
    }

    @NotNull
    public final List<NoticeCount> a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f55354a, false, 58727, new Class[0], List.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f55354a, false, 58727, new Class[0], List.class);
        } else {
            value = this.f55356c.getValue();
        }
        return (List) value;
    }
}
