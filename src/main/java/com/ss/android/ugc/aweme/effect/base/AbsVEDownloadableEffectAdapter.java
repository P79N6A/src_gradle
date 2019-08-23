package com.ss.android.ugc.aweme.effect.base;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.a.a;
import com.ss.android.ugc.aweme.effect.base.EffectDownloadState;
import com.ss.android.ugc.aweme.shortvideo.bm;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0004J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0017\u001a\u00020\rJ\u0016\u0010\u0018\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/base/AbsVEDownloadableEffectAdapter;", "VH", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "mDownloadController", "Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController;", "(Landroid/support/v7/widget/RecyclerView;Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController;)V", "mDatas", "", "Lcom/ss/android/ugc/aweme/effect/EffectModel;", "mDownloadState", "", "calculateDownloadState", "position", "getDownloadState", "model", "getEffectData", "", "initDownloadState", "", "onEffectStateChanged", "state", "setEffectData", "models", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class AbsVEDownloadableEffectAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f43707d;

    /* renamed from: a  reason: collision with root package name */
    private List<Integer> f43708a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView f43709b;

    /* renamed from: c  reason: collision with root package name */
    private final a f43710c;

    /* renamed from: e  reason: collision with root package name */
    public List<EffectModel> f43711e = new ArrayList();

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43707d, false, 38819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43707d, false, 38819, new Class[0], Void.TYPE);
            return;
        }
        this.f43708a.clear();
        for (EffectModel a2 : this.f43711e) {
            this.f43708a.add(Integer.valueOf(a(a2)));
        }
    }

    private final int a(EffectModel effectModel) {
        if (PatchProxy.isSupport(new Object[]{effectModel}, this, f43707d, false, 38820, new Class[]{EffectModel.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{effectModel}, this, f43707d, false, 38820, new Class[]{EffectModel.class}, Integer.TYPE)).intValue();
        }
        a aVar = this.f43710c;
        if (aVar == null || !aVar.a(effectModel)) {
            a aVar2 = this.f43710c;
            if (aVar2 == null || !aVar2.b(effectModel)) {
                if (bm.a(effectModel.resDir)) {
                    return 3;
                }
                return 0;
            }
        }
        return 2;
    }

    public final int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43707d, false, 38821, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f43708a.get(i).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43707d, false, 38821, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void a(@Nullable List<? extends EffectModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f43707d, false, 38818, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f43707d, false, 38818, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            this.f43711e.clear();
            this.f43711e.addAll(list);
            a();
            notifyDataSetChanged();
        }
    }

    public AbsVEDownloadableEffectAdapter(@Nullable RecyclerView recyclerView, @Nullable a aVar) {
        this.f43709b = recyclerView;
        this.f43710c = aVar;
    }

    public final void a(int i, @EffectDownloadState.State int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f43707d, false, 38822, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f43707d, false, 38822, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f43708a.size() > i) {
            int a2 = a(this.f43711e.get(i));
            int intValue = this.f43708a.get(i).intValue();
            ai.a("onEffectStateChanged: position=" + i + ",newState=" + a2 + ",current=" + intValue + ",state=" + i2);
            if (intValue != a2) {
                this.f43708a.set(i, Integer.valueOf(a2));
                notifyItemChanged(i);
            }
        }
    }
}
