package com.ss.android.ugc.aweme.draft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.views.DividerItemDecoration;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class DraftBoxFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43401a;

    /* renamed from: b  reason: collision with root package name */
    View f43402b;

    /* renamed from: c  reason: collision with root package name */
    ButtonTitleBar f43403c;

    /* renamed from: d  reason: collision with root package name */
    DmtStatusView f43404d;

    /* renamed from: e  reason: collision with root package name */
    RecyclerView f43405e;

    /* renamed from: f  reason: collision with root package name */
    TextView f43406f;
    FrameLayout g;
    public AwemeDraftAdapter h;
    public int i;
    boolean j;
    boolean k;
    ObjectAnimator l;
    private Map<ImageView, CloseableReference<CloseableImage>> m = new WeakHashMap();
    private ObjectAnimator n;
    private IDraftService.DraftListener o = new IDraftService.DraftListenerAdapter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43407a;

        public final void onDraftCheckedChanged(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43407a, false, 38427, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43407a, false, 38427, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (z) {
                DraftBoxFragment.this.i++;
            } else {
                DraftBoxFragment.this.i--;
            }
            DraftBoxFragment.this.f43406f.setText(String.format(DraftBoxFragment.this.getString(C0906R.string.ig), new Object[]{Integer.valueOf(DraftBoxFragment.this.i)}));
            if (DraftBoxFragment.this.i <= 0) {
                DraftBoxFragment.this.b();
                return;
            }
            if (DraftBoxFragment.this.g.getVisibility() != 0) {
                DraftBoxFragment draftBoxFragment = DraftBoxFragment.this;
                if (PatchProxy.isSupport(new Object[0], draftBoxFragment, DraftBoxFragment.f43401a, false, 38417, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], draftBoxFragment, DraftBoxFragment.f43401a, false, 38417, new Class[0], Void.TYPE);
                } else if (draftBoxFragment.g.getVisibility() != 0) {
                    draftBoxFragment.l = ObjectAnimator.ofFloat(draftBoxFragment.g, "translationY", new float[]{(float) draftBoxFragment.g.getMeasuredHeight(), 0.0f}).setDuration(200);
                    draftBoxFragment.l.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f43411a;

                        public final void onAnimationStart(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f43411a, false, 38430, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f43411a, false, 38430, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            DraftBoxFragment.this.g.setVisibility(0);
                        }
                    });
                    draftBoxFragment.l.start();
                }
            }
        }

        public final void onDraftDelete(@Nullable c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f43407a, false, 38426, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f43407a, false, 38426, new Class[]{c.class}, Void.TYPE);
                return;
            }
            if (cVar != null) {
                AwemeDraftAdapter awemeDraftAdapter = DraftBoxFragment.this.h;
                String S = cVar.S();
                if (PatchProxy.isSupport(new Object[]{S}, awemeDraftAdapter, AwemeDraftAdapter.f43351a, false, 38342, new Class[]{String.class}, Void.TYPE)) {
                    AwemeDraftAdapter awemeDraftAdapter2 = awemeDraftAdapter;
                    PatchProxy.accessDispatch(new Object[]{S}, awemeDraftAdapter2, AwemeDraftAdapter.f43351a, false, 38342, new Class[]{String.class}, Void.TYPE);
                } else if (awemeDraftAdapter.mItems != null) {
                    for (c cVar2 : awemeDraftAdapter.mItems) {
                        if (TextUtils.equals(S, cVar2.S())) {
                            awemeDraftAdapter.a(cVar2);
                            return;
                        }
                    }
                }
            }
        }

        public final void onDraftUpdate(@NonNull c cVar) {
            c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f43407a, false, 38425, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar2}, this, f43407a, false, 38425, new Class[]{c.class}, Void.TYPE);
            } else if (DraftBoxFragment.this.isViewValid()) {
                AwemeDraftAdapter awemeDraftAdapter = DraftBoxFragment.this.h;
                if (PatchProxy.isSupport(new Object[]{cVar2}, awemeDraftAdapter, AwemeDraftAdapter.f43351a, false, 38348, new Class[]{c.class}, Void.TYPE)) {
                    AwemeDraftAdapter awemeDraftAdapter2 = awemeDraftAdapter;
                    PatchProxy.accessDispatch(new Object[]{cVar2}, awemeDraftAdapter2, AwemeDraftAdapter.f43351a, false, 38348, new Class[]{c.class}, Void.TYPE);
                } else if (awemeDraftAdapter.getItemCount() != 0 && cVar2 != null) {
                    int size = awemeDraftAdapter.mItems.size();
                    for (int i = 0; i < size; i++) {
                        c cVar3 = (c) awemeDraftAdapter.mItems.get(i);
                        if (cVar3 != null && StringUtils.equal(cVar.S(), cVar3.S())) {
                            awemeDraftAdapter.mItems.set(i, cVar2);
                            awemeDraftAdapter.notifyItemChanged(i);
                        }
                    }
                }
            }
        }
    };

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43401a, false, 38416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43401a, false, 38416, new Class[0], Void.TYPE);
            return;
        }
        if (this.j) {
            this.f43403c.getEndBtn().setText(getText(C0906R.string.ie));
            this.f43403c.getStartBtn().setVisibility(8);
            this.f43403c.getTitleView().setVisibility(8);
        } else {
            this.f43403c.getEndBtn().setText(getText(C0906R.string.f12if));
            this.f43403c.getStartBtn().setVisibility(0);
            this.f43403c.getTitleView().setVisibility(0);
            b();
        }
        this.h.a(this.j);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f43401a, false, 38418, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43401a, false, 38418, new Class[0], Void.TYPE);
            return;
        }
        this.i = 0;
        if (this.g.getVisibility() != 8) {
            this.n = ObjectAnimator.ofFloat(this.g, "translationY", new float[]{(float) this.g.getMeasuredHeight()}).setDuration(200);
            this.n.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43413a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f43413a, false, 38431, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f43413a, false, 38431, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    DraftBoxFragment.this.g.setVisibility(8);
                }
            });
            this.n.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        r.a("delete_drafts", (Map) d.a().a("draft_cnt", this.i).f34114b);
        AwemeDraftAdapter awemeDraftAdapter = this.h;
        if (PatchProxy.isSupport(new Object[0], awemeDraftAdapter, AwemeDraftAdapter.f43351a, false, 38344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], awemeDraftAdapter, AwemeDraftAdapter.f43351a, false, 38344, new Class[0], Void.TYPE);
        } else {
            ArrayList<c> arrayList = new ArrayList<>(awemeDraftAdapter.mItems);
            a.a(new Runnable(arrayList) {

                /* renamed from: a */
                public static ChangeQuickRedirect f43356a;

                /* renamed from: b */
                final /* synthetic */ List f43357b;

                public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.draft.AwemeDraftAdapter.1.run():void, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.draft.AwemeDraftAdapter.1.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            });
            for (c cVar : arrayList) {
                if (cVar.w) {
                    awemeDraftAdapter.a(cVar);
                }
            }
        }
        b();
        this.j = false;
        a();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f43401a, false, 38413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43401a, false, 38413, new Class[0], Void.TYPE);
            return;
        }
        for (CloseableReference<CloseableImage> close : this.m.values()) {
            close.close();
        }
        this.m.clear();
        super.onDestroy();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f43401a, false, 38407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43401a, false, 38407, new Class[0], Void.TYPE);
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().unregisterDraftListener(this.o);
        if (PatchProxy.isSupport(new Object[0], this, f43401a, false, 38408, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43401a, false, 38408, new Class[0], Void.TYPE);
        } else {
            if (this.n != null) {
                this.n.removeAllListeners();
                this.n.cancel();
            }
            if (this.l != null) {
                this.l.removeAllListeners();
                this.l.cancel();
            }
        }
        super.onDestroyView();
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f43401a, false, 38405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43401a, false, 38405, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        b();
        if (this.h != null) {
            this.h.clearData();
        }
        if (PatchProxy.isSupport(new Object[0], this, f43401a, false, 38409, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43401a, false, 38409, new Class[0], Void.TYPE);
            return;
        }
        this.f43404d.d();
        com.ss.android.ugc.aweme.tools.a.a().execute(new h(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f43401a, false, 38406, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f43401a, false, 38406, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f43401a, false, 38411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43401a, false, 38411, new Class[0], Void.TYPE);
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f43402b.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(getActivity());
            }
            this.f43403c.setTitle(getText(C0906R.string.a82));
            this.f43403c.getStartBtn().setVisibility(0);
            this.f43403c.getEndBtn().setVisibility(0);
            this.f43403c.getEndBtn().setText(getText(C0906R.string.f12if));
            this.f43403c.getEndBtn().setBackgroundColor(0);
            this.f43405e.setOverScrollMode(2);
            this.f43405e.setLayoutManager(new WrapLinearLayoutManager(getActivity()));
            RecyclerView recyclerView = this.f43405e;
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getResources().getColor(C0906R.color.ano), (int) UIUtils.dip2Px(getActivity(), 0.0f), 1, UIUtils.dip2Px(getActivity(), 0.0f), UIUtils.dip2Px(getActivity(), 0.0f), false);
            recyclerView.addItemDecoration(dividerItemDecoration);
            this.h = new AwemeDraftAdapter(this.m);
            this.h.setShowFooter(false);
            this.h.f43353c = new i(this);
            this.f43405e.setAdapter(this.h);
            this.f43404d.setBuilder(DmtStatusView.a.a(getContext()));
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().registerDraftListener(this.o);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f43401a, false, 38403, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f43401a, false, 38403, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.nk, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f43401a, false, 38404, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f43401a, false, 38404, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f43403c = (ButtonTitleBar) ViewCompat.requireViewById(inflate, C0906R.id.d3m);
            this.f43402b = ViewCompat.requireViewById(inflate, C0906R.id.cv0);
            this.f43404d = (DmtStatusView) ViewCompat.requireViewById(inflate, C0906R.id.a7n);
            this.f43405e = (RecyclerView) ViewCompat.requireViewById(inflate, C0906R.id.ccc);
            this.f43406f = (TextView) ViewCompat.requireViewById(inflate, C0906R.id.dar);
            this.g = (FrameLayout) ViewCompat.requireViewById(inflate, C0906R.id.b8b);
            this.f43403c.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43409a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f43409a, false, 38428, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f43409a, false, 38428, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    DraftBoxFragment draftBoxFragment = DraftBoxFragment.this;
                    if (PatchProxy.isSupport(new Object[]{view}, draftBoxFragment, DraftBoxFragment.f43401a, false, 38412, new Class[]{View.class}, Void.TYPE)) {
                        DraftBoxFragment draftBoxFragment2 = draftBoxFragment;
                        PatchProxy.accessDispatch(new Object[]{view}, draftBoxFragment2, DraftBoxFragment.f43401a, false, 38412, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    draftBoxFragment.getActivity().finish();
                }

                public final void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f43409a, false, 38429, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f43409a, false, 38429, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    DraftBoxFragment draftBoxFragment = DraftBoxFragment.this;
                    if (PatchProxy.isSupport(new Object[]{view}, draftBoxFragment, DraftBoxFragment.f43401a, false, 38415, new Class[]{View.class}, Void.TYPE)) {
                        DraftBoxFragment draftBoxFragment2 = draftBoxFragment;
                        PatchProxy.accessDispatch(new Object[]{view}, draftBoxFragment2, DraftBoxFragment.f43401a, false, 38415, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    draftBoxFragment.j = !draftBoxFragment.j;
                    draftBoxFragment.a();
                }
            });
            this.f43406f.setOnClickListener(new g(this));
        }
        return inflate;
    }
}
