package com.ss.android.ugc.aweme.photo.local;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.mediachoose.VideoChooseFragment;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.mediachoose.j;
import com.ss.android.ugc.aweme.mediachoose.k;
import com.ss.android.ugc.aweme.music.b.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.c;
import java.util.List;

public class MediaChooseFragment extends AmeBaseFragment implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58585a;

    /* renamed from: b  reason: collision with root package name */
    public a f58586b;

    /* renamed from: c  reason: collision with root package name */
    public k f58587c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f58588d;

    /* renamed from: e  reason: collision with root package name */
    public int f58589e = 2;

    /* renamed from: f  reason: collision with root package name */
    int f58590f;
    public boolean g;
    public long h;
    private MediaTypeNavigator i;
    private ViewPager j;

    class MediaTypeAdapter extends FragmentPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58591a;

        public int getCount() {
            return MediaChooseFragment.this.f58589e;
        }

        public Fragment getItem(int i) {
            ImageChooseFragment imageChooseFragment;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58591a, false, 63685, new Class[]{Integer.TYPE}, Fragment.class)) {
                return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58591a, false, 63685, new Class[]{Integer.TYPE}, Fragment.class);
            } else if (i2 == 0) {
                VideoChooseFragment a2 = VideoChooseFragment.a(4, MediaChooseFragment.this.getResources().getColor(C0906R.color.a3l), MediaChooseFragment.this.getResources().getColor(C0906R.color.a2p), MediaChooseFragment.this.g, (c) MediaChooseFragment.this.getArguments().getSerializable("challenge"), MediaChooseFragment.this.f58587c);
                a2.o = MediaChooseFragment.this.f58588d;
                a2.m = MediaChooseFragment.this.h;
                return a2;
            } else if (i2 == 1) {
                int color = MediaChooseFragment.this.getResources().getColor(C0906R.color.a3l);
                int color2 = MediaChooseFragment.this.getResources().getColor(C0906R.color.a2p);
                int i3 = MediaChooseFragment.this.f58590f;
                a aVar = MediaChooseFragment.this.f58586b;
                if (PatchProxy.isSupport(new Object[]{4, Integer.valueOf(color), Integer.valueOf(color2), Integer.valueOf(i3), aVar}, null, ImageChooseFragment.f58560a, true, 63647, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class}, ImageChooseFragment.class)) {
                    imageChooseFragment = (ImageChooseFragment) PatchProxy.accessDispatch(new Object[]{4, Integer.valueOf(color), Integer.valueOf(color2), Integer.valueOf(i3), aVar}, null, ImageChooseFragment.f58560a, true, 63647, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class}, ImageChooseFragment.class);
                } else {
                    ImageChooseFragment imageChooseFragment2 = new ImageChooseFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("ARG_NUM_COLUMNS", 4);
                    bundle.putInt("ARG_TEXT_COLOR", color);
                    bundle.putInt("ARG_SHADOW_COLOR", color2);
                    bundle.putInt("ARG_SUPPORT_FLAGS", i3);
                    imageChooseFragment2.setArguments(bundle);
                    imageChooseFragment2.f58565f = aVar;
                    imageChooseFragment = imageChooseFragment2;
                }
                return imageChooseFragment;
            } else {
                throw new IllegalArgumentException("unknown position: " + i2);
            }
        }

        MediaTypeAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }
    }

    public final ViewPager a() {
        return this.j;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f58585a, false, 63678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58585a, false, 63678, new Class[0], Void.TYPE);
            return;
        }
        VideoChooseFragment videoChooseFragment = (VideoChooseFragment) a(this.j, 0);
        if (videoChooseFragment != null) {
            videoChooseFragment.a();
        }
    }

    public final boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f58585a, false, 63680, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58585a, false, 63680, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.j == null) {
            return false;
        } else {
            if (this.j.getCurrentItem() == 0) {
                z = true;
            }
            return z;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f58585a, false, 63679, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58585a, false, 63679, new Class[0], Void.TYPE);
            return;
        }
        VideoChooseFragment videoChooseFragment = (VideoChooseFragment) a(this.j, 0);
        if (videoChooseFragment != null) {
            videoChooseFragment.b();
        }
        ImageChooseFragment imageChooseFragment = (ImageChooseFragment) a(this.j, 1);
        if (imageChooseFragment != null) {
            if (PatchProxy.isSupport(new Object[0], imageChooseFragment, ImageChooseFragment.f58560a, false, 63651, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], imageChooseFragment, ImageChooseFragment.f58560a, false, 63651, new Class[0], Void.TYPE);
            } else if (!imageChooseFragment.g) {
                imageChooseFragment.f58563d.setVisibility(0);
                com.ss.android.b.a.a.a.a(new Runnable() {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f58566a;

                    public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.photo.local.ImageChooseFragment.1.run():void, dex: classes5.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.photo.local.ImageChooseFragment.1.run():void, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
            }
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58585a, false, 63677, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58585a, false, 63677, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.j.setAdapter(new MediaTypeAdapter(getChildFragmentManager()));
        this.i.setupWithViewPager(this.j);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58585a, false, 63675, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58585a, false, 63675, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f58590f = getArguments().getInt("ARG_SUPPORT_FLAGS", 0);
        this.g = getArguments().getBoolean("ARG_MULTI_VIDEO_ENABLE", true);
    }

    public final void a(List<com.ss.android.ugc.aweme.music.b.a.a> list) {
        List<com.ss.android.ugc.aweme.music.b.a.a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f58585a, false, 63681, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f58585a, false, 63681, new Class[]{List.class}, Void.TYPE);
            return;
        }
        VideoChooseFragment videoChooseFragment = (VideoChooseFragment) a(this.j, 0);
        if (videoChooseFragment != null) {
            if (PatchProxy.isSupport(new Object[]{list2}, videoChooseFragment, VideoChooseFragment.f55208a, false, 58551, new Class[]{List.class}, Void.TYPE)) {
                VideoChooseFragment videoChooseFragment2 = videoChooseFragment;
                PatchProxy.accessDispatch(new Object[]{list2}, videoChooseFragment2, VideoChooseFragment.f55208a, false, 58551, new Class[]{List.class}, Void.TYPE);
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                i2 = (int) (((long) i2) + list2.get(i3).h);
            }
            if (((long) i2) <= videoChooseFragment.m) {
                UIUtils.displayToast((Context) videoChooseFragment.getActivity(), videoChooseFragment.d());
            } else if (i2 > 3600000) {
                UIUtils.displayToast((Context) videoChooseFragment.getActivity(), (int) C0906R.string.bcy);
            } else {
                d.a().b();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    d.a().a(list2.get(i4));
                }
                String str = list2.get(0).f56315e;
                if (PatchProxy.isSupport(new Object[]{str}, videoChooseFragment, VideoChooseFragment.f55208a, false, 58552, new Class[]{String.class}, Void.TYPE)) {
                    VideoChooseFragment videoChooseFragment3 = videoChooseFragment;
                    PatchProxy.accessDispatch(new Object[]{str}, videoChooseFragment3, VideoChooseFragment.f55208a, false, 58552, new Class[]{String.class}, Void.TYPE);
                } else if (videoChooseFragment.isViewValid()) {
                    if (!videoChooseFragment.o) {
                        videoChooseFragment.a(str);
                    } else if (videoChooseFragment.getActivity() != null) {
                        Intent intent = new Intent();
                        intent.putExtra("video_file", str);
                        intent.putExtra("video_multi_edit", true);
                        videoChooseFragment.getActivity().setResult(-1, intent);
                        videoChooseFragment.getActivity().finish();
                    }
                }
            }
        }
    }

    @Nullable
    private Fragment a(ViewPager viewPager, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewPager, Integer.valueOf(i2)}, this, f58585a, false, 63683, new Class[]{ViewPager.class, Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{viewPager, Integer.valueOf(i2)}, this, f58585a, false, 63683, new Class[]{ViewPager.class, Integer.TYPE}, Fragment.class);
        } else if (!isAdded()) {
            return null;
        } else {
            return getChildFragmentManager().findFragmentByTag(a(viewPager.getId(), i2));
        }
    }

    private static String a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f58585a, true, 63684, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f58585a, true, 63684, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
        }
        return "android:switcher:" + i2 + ":" + i3;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58585a, false, 63676, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58585a, false, 63676, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.aa1, viewGroup2, false);
        this.i = (MediaTypeNavigator) inflate.findViewById(C0906R.id.bm7);
        this.j = (ViewPager) inflate.findViewById(C0906R.id.duu);
        if (this.f58590f == 0 || com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.AmericaRecordOptim) != 0) {
            this.i.setVisibility(8);
            this.f58589e = 1;
        }
        return inflate;
    }

    public static MediaChooseFragment a(@Nullable c cVar, int i2, boolean z, com.ss.android.ugc.aweme.music.b.a aVar, k kVar) {
        c cVar2 = cVar;
        com.ss.android.ugc.aweme.music.b.a aVar2 = aVar;
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), aVar2, kVar2}, null, f58585a, true, 63674, new Class[]{c.class, Integer.TYPE, Boolean.TYPE, com.ss.android.ugc.aweme.music.b.a.class, k.class}, MediaChooseFragment.class)) {
            Object[] objArr = {cVar2, Integer.valueOf(i2), Byte.valueOf(z), aVar2, kVar2};
            return (MediaChooseFragment) PatchProxy.accessDispatch(objArr, null, f58585a, true, 63674, new Class[]{c.class, Integer.TYPE, Boolean.TYPE, com.ss.android.ugc.aweme.music.b.a.class, k.class}, MediaChooseFragment.class);
        }
        MediaChooseFragment mediaChooseFragment = new MediaChooseFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("challenge", cVar2);
        bundle.putInt("ARG_SUPPORT_FLAGS", i2);
        bundle.putBoolean("ARG_MULTI_VIDEO_ENABLE", z);
        mediaChooseFragment.setArguments(bundle);
        mediaChooseFragment.f58586b = aVar2;
        mediaChooseFragment.f58587c = kVar2;
        return mediaChooseFragment;
    }
}
