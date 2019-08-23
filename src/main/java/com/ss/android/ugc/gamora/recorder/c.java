package com.ss.android.ugc.gamora.recorder;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.a.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.record.n;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/NormalGroupScene;", "Lcom/bytedance/scene/group/GroupScene;", "()V", "recordViewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;", "speedModule", "Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;", "getSpeedModule", "()Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;", "setSpeedModule", "(Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "container", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends com.bytedance.scene.group.c {
    public static final a l = new a((byte) 0);
    @NotNull
    public n k;
    private RecordViewModel m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/NormalGroupScene$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f77640b;

        b(c cVar, k kVar) {
            this.f77639a = cVar;
            this.f77640b = kVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 0) {
                this.f77639a.c(this.f77640b);
            } else {
                this.f77639a.b((com.bytedance.scene.e) this.f77640b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.gamora.recorder.c$c  reason: collision with other inner class name */
    static final class C0821c<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77641a;

        C0821c(c cVar) {
            this.f77641a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                com.bytedance.scene.e a2 = this.f77641a.a("RecordMVScene");
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(a2, "findSceneByTag<RecordMVScene>(RecordMVScene.TAG)!!");
                h hVar = (h) a2;
                if (bool.booleanValue()) {
                    com.bytedance.scene.e eVar = hVar.f22095c;
                    if (eVar != null) {
                        ((com.bytedance.scene.group.c) eVar).c(hVar);
                        com.ss.android.ugc.aweme.shortvideo.mvtemplate.a aVar = hVar.i;
                        if (aVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mvTemplateModule");
                        }
                        aVar.a();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                }
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.a aVar2 = hVar.i;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mvTemplateModule");
                }
                aVar2.dismiss();
                com.bytedance.scene.e eVar2 = hVar.f22095c;
                if (eVar2 != null) {
                    ((com.bytedance.scene.group.c) eVar2).b((com.bytedance.scene.e) hVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77642a;

        d(c cVar) {
            this.f77642a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                com.bytedance.scene.e a2 = this.f77642a.a("RecordLiveScene");
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(a2, "findSceneByTag<RecordLiv…e>(RecordLiveScene.TAG)!!");
                g gVar = (g) a2;
                if (bool.booleanValue()) {
                    com.ss.android.ugc.aweme.port.internal.b bVar = gVar.i;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("liveModule");
                    }
                    View view = gVar.f22094b;
                    if (view != null) {
                        bVar.a((ViewGroup) view);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                com.ss.android.ugc.aweme.port.internal.b bVar2 = gVar.i;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("liveModule");
                }
                View view2 = gVar.f22094b;
                if (view2 != null) {
                    bVar2.b((ViewGroup) view2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77643a;

        e(c cVar) {
            this.f77643a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    this.f77643a.f22097e.a(i.class);
                } else {
                    this.f77643a.f22097e.c();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77644a;

        f(c cVar) {
            this.f77644a = cVar;
        }

        public final void onChanged(@Nullable Object obj) {
            this.f77644a.f22097e.a(f.class, (Bundle) null, new c.a().a(true).a((com.bytedance.scene.animation.c) new com.bytedance.scene.animation.a.b()).a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77645a;

        g(c cVar) {
            this.f77645a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 0) {
                    com.ss.android.ugc.gamora.a.c.a(this.f77645a, "RecordBottomTabScene");
                } else {
                    com.ss.android.ugc.gamora.a.c.b(this.f77645a, "RecordBottomTabScene");
                }
            }
        }
    }

    @NotNull
    public final n a() {
        n nVar = this.k;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("speedModule");
        }
        return nVar;
    }

    public final void f(@Nullable Bundle bundle) {
        super.f(bundle);
        Activity s = s();
        if (s != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) s).get(RecordViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(re…ordViewModel::class.java)");
            this.m = (RecordViewModel) viewModel;
            a((int) C0906R.id.cbs, (com.bytedance.scene.e) new e(), "RecordCameraScene");
            a((int) C0906R.id.cbs, (com.bytedance.scene.e) new m(), "RecordTitleScene");
            a((int) C0906R.id.cbs, (com.bytedance.scene.e) new ab(), "RecordToolbarScene");
            a((int) C0906R.id.cbs, (com.bytedance.scene.e) new h(), "RecordMVScene");
            com.ss.android.ugc.gamora.a.c.b(this, "RecordMVScene");
            a((int) C0906R.id.cbs, (com.bytedance.scene.e) new g(), "RecordLiveScene");
            a((int) C0906R.id.cbs, (com.bytedance.scene.e) new d(), "RecordBottomTabScene");
            k kVar = new k();
            com.bytedance.scene.e eVar = kVar;
            a((int) C0906R.id.cbs, eVar, "RecordSpeedGroupScene");
            if (!com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SpeedPanelOpen)) {
                b(eVar);
            }
            n nVar = kVar.j;
            if (nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("speedModule");
            }
            this.k = nVar;
            RecordViewModel recordViewModel = this.m;
            if (recordViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
            }
            recordViewModel.f77632b.observe(this.f22097e, new b(this, kVar));
            RecordViewModel recordViewModel2 = this.m;
            if (recordViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
            }
            recordViewModel2.f77633c.observe(this.f22097e, new C0821c(this));
            RecordViewModel recordViewModel3 = this.m;
            if (recordViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
            }
            recordViewModel3.f77634d.observe(this.f22097e, new d(this));
            RecordViewModel recordViewModel4 = this.m;
            if (recordViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
            }
            recordViewModel4.f77635e.observe(this.f22097e, new e(this));
            RecordViewModel recordViewModel5 = this.m;
            if (recordViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
            }
            recordViewModel5.f77636f.observe(this.f22097e, new f(this));
            RecordViewModel recordViewModel6 = this.m;
            if (recordViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
            }
            recordViewModel6.g.observe(this.f22097e, new g(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @NotNull
    public final ViewGroup a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.aq3, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final /* bridge */ /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return a(layoutInflater, viewGroup);
    }
}
