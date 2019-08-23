package com.ss.android.ugc.aweme.photo.local;

import a.g;
import a.i;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.ss.android.ugc.aweme.mediachoose.ImageAlbumAdapter;
import com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapterB;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.mediachoose.c;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.shortvideo.local.ChooseRecyclerView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public class ImageChooseFragmentB extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58573a;

    /* renamed from: b  reason: collision with root package name */
    public ChooseRecyclerView f58574b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f58575c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f58576d;

    /* renamed from: e  reason: collision with root package name */
    public ProgressBar f58577e;

    /* renamed from: f  reason: collision with root package name */
    public ImageChooseAdapterB f58578f;
    public ImageChooseAdapterB.b g;
    public MediaChooseFragmentB h;
    public ImageAlbumAdapter i;
    public d j;
    public MediaChooseFragmentB k;
    public int l;
    public ImageChooseAdapterB.c m = new ImageChooseAdapterB.c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58583a;

        public final void a(View view, a aVar) {
            if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f58583a, false, 63673, new Class[]{View.class, a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f58583a, false, 63673, new Class[]{View.class, a.class}, Void.TYPE);
            } else if (aVar != null && ImageChooseFragmentB.this.f58578f.f55118e) {
                com.ss.android.ugc.aweme.port.in.a.f61121d.a(ImageChooseFragmentB.this.getActivity(), view, (((float) UIUtils.getScreenWidth(ImageChooseFragmentB.this.getContext())) * 1.0f) / ((float) UIUtils.getScreenHeight(ImageChooseFragmentB.this.getContext())), "file://" + aVar.f56315e);
            }
        }
    };
    private int n;
    private TextView o;
    private boolean p;
    private d.b q = new d.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58579a;

        public final void a(boolean z, int i, List<a> list) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), list}, this, f58579a, false, 63671, new Class[]{Boolean.TYPE, Integer.TYPE, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), list}, this, f58579a, false, 63671, new Class[]{Boolean.TYPE, Integer.TYPE, List.class}, Void.TYPE);
            } else if (!ImageChooseFragmentB.this.isDestroyed()) {
                List<a> a2 = ImageChooseFragmentB.this.j.a(1);
                ArrayList arrayList = new ArrayList();
                for (a aVar : a2) {
                    String[] split = aVar.f56315e.split("\\.");
                    if (split.length <= 0 || !split[split.length - 1].equals("gif")) {
                        arrayList.add(ImageChooseAdapterB.a.a(aVar));
                    }
                }
                if (ImageChooseFragmentB.this.f58577e != null && ImageChooseFragmentB.this.f58576d != null) {
                    if (j.a((Collection<T>) arrayList)) {
                        ImageChooseFragmentB.this.f58577e.setVisibility(8);
                        ImageChooseFragmentB.this.f58576d.setVisibility(0);
                        ImageChooseFragmentB.this.f58576d.setText(ImageChooseFragmentB.this.getResources().getString(C0906R.string.bhf));
                        return;
                    }
                    ImageChooseFragmentB.this.f58576d.setVisibility(8);
                    ImageChooseFragmentB.this.f58577e.setVisibility(8);
                    ImageChooseFragmentB.this.f58578f.a((Collection<? extends ImageChooseAdapterB.a>) arrayList);
                    ImageAlbumAdapter imageAlbumAdapter = ImageChooseFragmentB.this.i;
                    if (PatchProxy.isSupport(new Object[]{arrayList}, imageAlbumAdapter, ImageAlbumAdapter.f55068a, false, 58432, new Class[]{List.class}, Void.TYPE)) {
                        ImageAlbumAdapter imageAlbumAdapter2 = imageAlbumAdapter;
                        PatchProxy.accessDispatch(new Object[]{arrayList}, imageAlbumAdapter2, ImageAlbumAdapter.f55068a, false, 58432, new Class[]{List.class}, Void.TYPE);
                    } else {
                        i.a((Callable<TResult>) new c<TResult>(imageAlbumAdapter, arrayList)).a((g<TResult, TContinuationResult>) new g<List<ImageAlbumAdapter.a>, Void>() {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f55073a;

                            public final /* synthetic */ java.lang.Object then(
/*
Method generation error in method: com.ss.android.ugc.aweme.mediachoose.ImageAlbumAdapter.1.then(a.i):java.lang.Object, dex: classes5.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.mediachoose.ImageAlbumAdapter.1.then(a.i):java.lang.Object, class status: UNLOADED
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
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:96)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:467)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:436)
                            	at jadx.core.codegen.ClassGen.addField(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:347)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:224)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                            
*/
                        }, i.f1052b);
                    }
                    ImageChooseFragmentB.this.f58574b.setAdapter(ImageChooseFragmentB.this.f58578f);
                    ImageChooseFragmentB.this.f58575c.setAdapter(ImageChooseFragmentB.this.i);
                    ((SimpleItemAnimator) ImageChooseFragmentB.this.f58574b.getItemAnimator()).setSupportsChangeAnimations(false);
                    ImageChooseFragmentB.this.f58578f.f55119f = ImageChooseFragmentB.this.m;
                }
            }
        }
    };

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f58573a, false, 63665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58573a, false, 63665, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58573a, false, 63664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58573a, false, 63664, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f58578f.notifyDataSetChanged();
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f58573a, false, 63662, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58573a, false, 63662, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f58573a, false, 63663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58573a, false, 63663, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58573a, false, 63668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58573a, false, 63668, new Class[0], Void.TYPE);
            return;
        }
        if (this.p) {
            this.f58575c.setVisibility(8);
            if (this.l != 0) {
                this.o.setVisibility(0);
            }
        } else {
            this.f58575c.setVisibility(0);
            this.o.setVisibility(8);
        }
        this.p = !this.p;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f58573a, false, 63670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58573a, false, 63670, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImageChooseAdapterB imageChooseAdapterB = this.f58578f;
        if (PatchProxy.isSupport(new Object[0], imageChooseAdapterB, ImageChooseAdapterB.f55114a, false, 58471, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], imageChooseAdapterB, ImageChooseAdapterB.f55114a, false, 58471, new Class[0], Void.TYPE);
        } else {
            imageChooseAdapterB.i.b(imageChooseAdapterB.j);
        }
        this.j.b(this.q);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58573a, false, 63661, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58573a, false, 63661, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        ImageChooseAdapterB imageChooseAdapterB = new ImageChooseAdapterB(getActivity(), this, this.n, 1.3d, 1.5f, 0);
        this.f58578f = imageChooseAdapterB;
        this.f58578f.g = this.g;
        this.i = new ImageAlbumAdapter(getContext(), this);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58573a, false, 63659, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58573a, false, 63659, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.n = getArguments().getInt("ARG_NUM_COLUMNS", 4);
        this.j = d.a();
        this.j.a(this.q);
        this.j.a(1, false);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f58573a, false, 63667, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f58573a, false, 63667, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.l = i2;
        if (i2 <= 0) {
            this.o.setVisibility(8);
            return;
        }
        if (i2 == 1) {
            this.o.setText(String.format(getString(C0906R.string.c8s), new Object[]{Integer.valueOf(i2)}));
            this.o.animate().alpha(0.5f).setDuration(300).start();
        } else if (i2 == 2) {
            this.o.setText(String.format(getString(C0906R.string.c8s), new Object[]{Integer.valueOf(i2)}));
            this.o.animate().alpha(1.0f).setDuration(300).start();
        } else {
            this.o.setText(String.format(getString(C0906R.string.c8s), new Object[]{Integer.valueOf(i2)}));
            this.o.setAlpha(1.0f);
        }
        this.o.setVisibility(0);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58573a, false, 63660, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58573a, false, 63660, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.s1, viewGroup2, false);
        this.f58574b = (ChooseRecyclerView) inflate.findViewById(C0906R.id.arc);
        this.f58575c = (RecyclerView) inflate.findViewById(C0906R.id.ar9);
        this.o = (TextView) inflate.findViewById(C0906R.id.dew);
        this.f58577e = (ProgressBar) inflate.findViewById(C0906R.id.arf);
        this.f58576d = (TextView) inflate.findViewById(C0906R.id.bqx);
        this.f58575c.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.f58574b.setLayoutManager(new WrapGridLayoutManager(null, this.n));
        this.f58574b.addItemDecoration(new GridSpacingItemDecoration(this.n, (int) UIUtils.dip2Px(getContext(), 1.0f), false));
        this.o.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58581a;

            public final void onClick(View view) {
                List list;
                if (PatchProxy.isSupport(new Object[]{view}, this, f58581a, false, 63672, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f58581a, false, 63672, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (ImageChooseFragmentB.this.h != null) {
                    ImageChooseAdapterB imageChooseAdapterB = ImageChooseFragmentB.this.f58578f;
                    if (PatchProxy.isSupport(new Object[0], imageChooseAdapterB, ImageChooseAdapterB.f55114a, false, 58472, new Class[0], List.class)) {
                        list = (List) PatchProxy.accessDispatch(new Object[0], imageChooseAdapterB, ImageChooseAdapterB.f55114a, false, 58472, new Class[0], List.class);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (ImageChooseAdapterB.a add : imageChooseAdapterB.f55117d) {
                            arrayList.add(add);
                        }
                        list = arrayList;
                    }
                    if (list.size() >= 2) {
                        ImageChooseFragmentB.this.f58578f.a();
                        ImageChooseFragmentB.this.l = 0;
                    }
                    ImageChooseFragmentB.this.h.b(list);
                }
            }
        });
        if (this.h != null) {
            this.f58574b.setFragment(this.h.k);
        }
        this.f58577e.setVisibility(0);
        return inflate;
    }
}
