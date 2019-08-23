package dmt.av.video.b;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.hm;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"dmt/av/video/record/Recorder__IRecorderKt"}, k = 4, mv = {1, 1, 15})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82938a;

    @NotNull
    @JvmOverloads
    public static final a a(@NotNull Context context, @NotNull m mVar) {
        Context context2 = context;
        m mVar2 = mVar;
        if (!PatchProxy.isSupport(new Object[]{context2, mVar2}, null, f82938a, true, 92226, new Class[]{Context.class, m.class}, a.class)) {
            return a(context2, mVar2, false, 4, null);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{context2, mVar2}, null, f82938a, true, 92226, new Class[]{Context.class, m.class}, a.class);
    }

    private static /* synthetic */ a a(Context context, m mVar, boolean z, int i, Object obj) {
        Context context2 = context;
        m mVar2 = mVar;
        boolean a2 = n.a();
        if (PatchProxy.isSupport(new Object[]{context2, mVar2, Byte.valueOf(a2 ? (byte) 1 : 0)}, null, f82938a, true, 92225, new Class[]{Context.class, m.class, Boolean.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2, mVar2, Byte.valueOf(a2)}, null, f82938a, true, 92225, new Class[]{Context.class, m.class, Boolean.TYPE}, a.class);
        }
        if (PatchProxy.isSupport(new Object[]{context2, mVar2, Byte.valueOf(a2)}, null, o.f82951a, true, 92237, new Class[]{Context.class, m.class, Boolean.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2, mVar2, Byte.valueOf(a2)}, null, o.f82951a, true, 92237, new Class[]{Context.class, m.class, Boolean.TYPE}, a.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(mVar2, "recorderParameters");
        if (!a2) {
            return new d(context2, null, 2);
        }
        a.a(new hm().a());
        return new r(context2, mVar2, null, 4);
    }
}
