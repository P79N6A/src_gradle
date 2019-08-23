package dmt.av.video.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0003\u0010\u0006¨\u0006\t"}, d2 = {"Ldmt/av/video/record/RecorderSwitch;", "", "()V", "isUseVERecorder", "", "isUseVERecorder$annotations", "()Z", "isUseVERecorder$delegate", "Lkotlin/Lazy;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82947a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f82948b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(n.class), "isUseVERecorder", "isUseVERecorder()Z"))};

    /* renamed from: c  reason: collision with root package name */
    public static final n f82949c = new n();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final Lazy f82950d = LazyKt.lazy(a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Boolean> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        public final boolean invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92236, new Class[0], Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableUserVeRecoder);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92236, new Class[0], Boolean.TYPE)).booleanValue();
        }
    }

    public static final boolean a() {
        return ((Boolean) (PatchProxy.isSupport(new Object[0], null, f82947a, true, 92235, new Class[0], Boolean.TYPE) ? PatchProxy.accessDispatch(new Object[0], null, f82947a, true, 92235, new Class[0], Boolean.TYPE) : f82950d.getValue())).booleanValue();
    }

    private n() {
    }
}
