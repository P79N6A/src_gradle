package com.ss.android.ugc.aweme.choosemusic.fragment;

import a.g;
import a.i;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.choosemusic.b.a;
import com.ss.android.ugc.aweme.choosemusic.d.l;
import com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;
import com.ss.android.ugc.aweme.choosemusic.view.h;
import com.ss.android.ugc.aweme.commercialize.model.f;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class MusicClassDetailFragment extends BaseMusicListFragment implements a<Music>, LoadMoreRecyclerViewAdapter.a {
    public static ChangeQuickRedirect i;
    public String j;
    f.a k;
    private String l;
    private String m;
    private boolean n;
    private String o;

    public final /* bridge */ /* synthetic */ void a(Object obj, int i2) {
    }

    public final String b() {
        return "music_list";
    }

    public final String c() {
        return "refresh_status_music_list";
    }

    public final String d() {
        return "loadmore_status_music_list";
    }

    public final int k() {
        return 3;
    }

    public final String l() {
        return "";
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26605, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f2829e.a(this.l, 0, 30);
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26610, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26610, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2829e != null) {
            this.f2829e.a(this.l, 0, 30);
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26611, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26609, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2829e == null || this.f2830f == null)) {
            b bVar = (b) this.f2830f.a(b());
            if ((this.g instanceof BaseMusicListView) && ((BaseMusicListView) this.g).f36007f) {
                if (this.g != null) {
                    this.g.a();
                }
                com.ss.android.ugc.aweme.choosemusic.d.a aVar = this.f2829e;
                String str = this.l;
                int intValue = ((Integer) bVar.a("list_cursor")).intValue();
                if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(intValue), 16}, aVar, com.ss.android.ugc.aweme.choosemusic.d.a.f35803a, false, 26732, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.choosemusic.d.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(intValue), 16}, aVar2, com.ss.android.ugc.aweme.choosemusic.d.a.f35803a, false, 26732, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (!aVar.f35808f) {
                    aVar.f35808f = true;
                    aVar.f35804b.musicList(str, intValue, 16).a((g<TResult, TContinuationResult>) new l<TResult,TContinuationResult>(aVar), i.f1052b);
                }
            }
        }
    }

    public final c b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 26608, new Class[]{View.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 26608, new Class[]{View.class}, c.class);
        }
        h hVar = new h(getContext(), view, this, C0906R.string.bhi, this, this, this.h);
        String str = this.j;
        if (PatchProxy.isSupport(new Object[]{str}, hVar, h.g, false, 26853, new Class[]{String.class}, Void.TYPE)) {
            h hVar2 = hVar;
            PatchProxy.accessDispatch(new Object[]{str}, hVar2, h.g, false, 26853, new Class[]{String.class}, Void.TYPE);
        } else {
            hVar.mTitleBar.setTitle((CharSequence) str);
        }
        hVar.a(this.n);
        hVar.a((com.ss.android.ugc.aweme.choosemusic.b.b) this);
        com.ss.android.ugc.aweme.choosemusic.a aVar = new com.ss.android.ugc.aweme.choosemusic.a(this.m, this.j, this.o, com.ss.android.ugc.aweme.choosemusic.f.c.a());
        aVar.f35735e = this.l;
        hVar.a(aVar);
        hVar.a((PreloadRecyclerViewConverter.a) new i(this), 10);
        return hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.ss.android.ugc.aweme.commercialize.model.f$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = i
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26604(0x67ec, float:3.728E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 26604(0x67ec, float:3.728E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0034:
            super.onCreate(r18)
            android.os.Bundle r0 = r17.getArguments()
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = "music_class_id"
            java.lang.String r1 = r0.getString(r1)
            r7.l = r1
            java.lang.String r1 = "music_class_name"
            java.lang.String r1 = r0.getString(r1)
            r7.j = r1
            java.lang.String r1 = "music_class_enter_from"
            java.lang.String r1 = r0.getString(r1)
            r7.m = r1
            java.lang.String r1 = "music_class_is_hot"
            boolean r1 = r0.getBoolean(r1, r9)
            r7.n = r1
            java.lang.String r1 = "music_class_enter_method"
            java.lang.String r0 = r0.getString(r1)
            r7.o = r0
        L_0x0065:
            java.lang.String r0 = r7.l
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi.f38483a
            r13 = 1
            r14 = 30410(0x76ca, float:4.2613E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.f$a> r16 = com.ss.android.ugc.aweme.commercialize.model.f.a.class
            r15 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r2 = 0
            if (r1 == 0) goto L_0x009c
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi.f38483a
            r13 = 1
            r14 = 30410(0x76ca, float:4.2613E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.f$a> r16 = com.ss.android.ugc.aweme.commercialize.model.f.a.class
            r15 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r2 = r0
            com.ss.android.ugc.aweme.commercialize.model.f$a r2 = (com.ss.android.ugc.aweme.commercialize.model.f.a) r2
            goto L_0x00c6
        L_0x009c:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x00a9
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r8 = 0
        L_0x00a9:
            if (r8 == 0) goto L_0x00ac
            goto L_0x00c6
        L_0x00ac:
            com.ss.android.ugc.aweme.commercialize.model.f r1 = com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi.f38485c
            if (r1 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.commercialize.model.f$a[] r1 = r1.f39382c
            if (r1 == 0) goto L_0x00c6
            int r3 = r1.length
        L_0x00b5:
            if (r9 >= r3) goto L_0x00c6
            r4 = r1[r9]
            java.lang.String r5 = r4.f39383a
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r5 == 0) goto L_0x00c3
            r2 = r4
            goto L_0x00c6
        L_0x00c3:
            int r9 = r9 + 1
            goto L_0x00b5
        L_0x00c6:
            r7.k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment.onCreate(android.os.Bundle):void");
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, i, false, 26606, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, i, false, 26606, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 26607, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 26607, new Class[]{View.class}, Void.TYPE);
        } else if (this.k != null && this.k.f39384b != null && AbTestManager.a().bw() != 0) {
            ((com.bytedance.ies.dmt.ui.titlebar.a) view.findViewById(C0906R.id.d3m)).showDividerLine(false);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(C0906R.id.d3j);
            viewGroup.setVisibility(0);
            com.ss.android.ugc.aweme.base.c.a((RemoteImageView) view.findViewById(C0906R.id.d3k), this.k.f39384b.f39385a, (ControllerListener<ImageInfo>) new BaseControllerListener<ImageInfo>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35936a;

                public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                    ImageInfo imageInfo = (ImageInfo) obj;
                    if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f35936a, false, 26614, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f35936a, false, 26614, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "change_music_page");
                    hashMap.put("category_name", MusicClassDetailFragment.this.j);
                    r.a("show_ad_sticker", (Map) hashMap);
                }
            });
            viewGroup.setOnClickListener(new h(this));
        }
    }
}
