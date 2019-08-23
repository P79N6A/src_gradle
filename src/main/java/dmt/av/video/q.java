package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.List;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83056a;

    public static void a(List<EffectPointModel> list, f<p> fVar) {
        List<EffectPointModel> list2 = list;
        f<p> fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{list2, fVar2}, null, f83056a, true, 92010, new Class[]{List.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, fVar2}, null, f83056a, true, 92010, new Class[]{List.class, f.class}, Void.TYPE);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            EffectPointModel effectPointModel = list2.get(i);
            if (effectPointModel.getType() != 2) {
                p a2 = p.a(effectPointModel.getResDir(), (long) effectPointModel.getStartPoint());
                a2.g = effectPointModel.getSelectColor();
                a2.i = effectPointModel.getKey();
                a2.f83055f = effectPointModel.isFromEnd();
                a2.l = effectPointModel.getCategory();
                a2.k = effectPointModel.getDuration();
                fVar2.setValue(a2);
                p a3 = p.a((long) effectPointModel.getEndPoint());
                a3.f83055f = effectPointModel.isFromEnd();
                fVar2.setValue(a3);
            }
        }
    }
}
