package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.facebook.drawee.drawable.ScalingUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.bj;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerHolder;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.b.b;
import com.ss.android.ugc.effectmanager.effect.b.c;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SearchInfoStickerAdapter extends AbstractInfoStickerAdapter<p> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f69788d;

    /* renamed from: e  reason: collision with root package name */
    protected FragmentActivity f69789e;

    public final int a(int i) {
        return 1;
    }

    SearchInfoStickerAdapter(FragmentActivity fragmentActivity) {
        this.f69789e = fragmentActivity;
        this.mTextColor = this.f69789e.getResources().getColor(C0906R.color.amw);
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69788d, false, 79409, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69788d, false, 79409, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        SearchInfoStickerHolder searchInfoStickerHolder = new SearchInfoStickerHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ff, viewGroup2, false));
        searchInfoStickerHolder.f69801c = this.f69673c;
        return searchInfoStickerHolder;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69788d, false, 79412, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69788d, false, 79412, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getBasicItemViewType(i) == -2) {
            if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69788d, false, 79408, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69788d, false, 79408, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            MutableLiveData<Boolean> mutableLiveData = ((SearchInfoStickerViewModel) ViewModelProviders.of(this.f69789e).get(SearchInfoStickerViewModel.class)).f69816a;
            TextView textView = ((SearchInfoStickerHeaderHolder) viewHolder).f69798a;
            if (mutableLiveData.getValue() == null || !((Boolean) mutableLiveData.getValue()).booleanValue()) {
                i2 = C0906R.string.c2c;
            } else {
                i2 = C0906R.string.c2b;
            }
            textView.setText(i2);
        } else {
            super.onBindBasicViewHolder(viewHolder, i);
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69788d, false, 79411, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69788d, false, 79411, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i != -2) {
            return super.onCreateBasicViewHolder(viewGroup, i);
        } else {
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69788d, false, 79410, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                return new SearchInfoStickerHeaderHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.fa, viewGroup2, false));
            }
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69788d, false, 79410, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69788d, false, 79407, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69788d, false, 79407, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        SearchInfoStickerHolder searchInfoStickerHolder = (SearchInfoStickerHolder) viewHolder;
        FragmentActivity fragmentActivity = this.f69789e;
        boolean isSupport = PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, AbstractInfoStickerAdapter.f69671a, false, 79239, new Class[]{Integer.TYPE}, Object.class);
        Object obj = null;
        if (isSupport) {
            obj = PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, AbstractInfoStickerAdapter.f69671a, false, 79239, new Class[]{Integer.TYPE}, Object.class);
        } else if (i2 < getBasicItemCount()) {
            int min = Math.min(i2 - 1, this.mItems.size() - 1);
            if (this.mItems.size() != 0) {
                List list = this.mItems;
                if (min < 0) {
                    min = 0;
                }
                obj = list.get(min);
            }
        }
        p pVar = (p) obj;
        Object[] objArr = {fragmentActivity, pVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = SearchInfoStickerHolder.f69799a;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (PatchProxy.isSupport(objArr, searchInfoStickerHolder, changeQuickRedirect, false, 79427, new Class[]{FragmentActivity.class, p.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr2 = {fragmentActivity2, pVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = SearchInfoStickerHolder.f69799a;
            SearchInfoStickerHolder searchInfoStickerHolder2 = searchInfoStickerHolder;
            Object[] objArr3 = objArr2;
            SearchInfoStickerHolder searchInfoStickerHolder3 = searchInfoStickerHolder2;
            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect2;
            PatchProxy.accessDispatch(objArr3, searchInfoStickerHolder3, changeQuickRedirect3, false, 79427, new Class[]{FragmentActivity.class, p.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        SearchInfoStickerHolder searchInfoStickerHolder4 = searchInfoStickerHolder;
        searchInfoStickerHolder4.f69802d = fragmentActivity2;
        if (pVar != null && pVar.f70100b != null) {
            searchInfoStickerHolder4.f69803e = pVar;
            searchInfoStickerHolder4.f69800b.a(pVar.f70101c, pVar.f70102d);
            ProviderEffect.StickerBean stickerBean = pVar.f70100b.sticker;
            if (stickerBean != null && !StringUtils.isEmpty(stickerBean.url)) {
                searchInfoStickerHolder4.f69800b.setIconImageViewScaleType(ScalingUtils.ScaleType.FIT_CENTER);
                searchInfoStickerHolder4.f69800b.a(stickerBean.url, Bitmap.Config.ARGB_8888);
            }
            cb cbVar = InfoStickerModule.a(fragmentActivity2).f69785d;
            MutableLiveData<Boolean> mutableLiveData = ((SearchInfoStickerViewModel) ViewModelProviders.of(fragmentActivity2).get(SearchInfoStickerViewModel.class)).f69816a;
            View view = searchInfoStickerHolder4.itemView;
            SearchInfoStickerHolder.AnonymousClass1 r0 = new ax(fragmentActivity2, pVar, cbVar, i, mutableLiveData) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69804a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ FragmentActivity f69805b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ p f69806c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ cb f69807d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ int f69808e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ MutableLiveData f69809f;

                public final void a(View view) {
                    String str;
                    String str2;
                    LiveData liveData;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f69804a, false, 79431, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f69804a, false, 79431, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    SearchInfoStickerHolder searchInfoStickerHolder = SearchInfoStickerHolder.this;
                    FragmentActivity fragmentActivity = this.f69805b;
                    p pVar = this.f69806c;
                    if (PatchProxy.isSupport(new Object[]{fragmentActivity, pVar}, searchInfoStickerHolder, SearchInfoStickerHolder.f69799a, false, 79428, new Class[]{FragmentActivity.class, p.class}, Void.TYPE)) {
                        Object[] objArr = {fragmentActivity, pVar};
                        SearchInfoStickerHolder searchInfoStickerHolder2 = searchInfoStickerHolder;
                        ChangeQuickRedirect changeQuickRedirect = SearchInfoStickerHolder.f69799a;
                        PatchProxy.accessDispatch(objArr, searchInfoStickerHolder2, changeQuickRedirect, false, 79428, new Class[]{FragmentActivity.class, p.class}, Void.TYPE);
                    } else if (!(pVar == null || pVar.f70100b == null)) {
                        if (pVar.f70101c == 1 || p.a(pVar.f70100b)) {
                            InfoStickerModule.a(fragmentActivity).c().setValue(new a().a(pVar.f70100b));
                        } else {
                            pVar.f70101c = 2;
                            searchInfoStickerHolder.f69800b.b();
                            InfoStickerViewModel a2 = InfoStickerModule.a(fragmentActivity);
                            ProviderEffect providerEffect = pVar.f70100b;
                            if (PatchProxy.isSupport(new Object[]{providerEffect}, a2, InfoStickerViewModel.f69782a, false, 79389, new Class[]{ProviderEffect.class}, LiveData.class)) {
                                InfoStickerViewModel infoStickerViewModel = a2;
                                liveData = (LiveData) PatchProxy.accessDispatch(new Object[]{providerEffect}, infoStickerViewModel, InfoStickerViewModel.f69782a, false, 79389, new Class[]{ProviderEffect.class}, LiveData.class);
                            } else {
                                InfoStickerRepository infoStickerRepository = a2.f69783b;
                                if (PatchProxy.isSupport(new Object[]{providerEffect}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79320, new Class[]{ProviderEffect.class}, LiveData.class)) {
                                    Object[] objArr2 = {providerEffect};
                                    InfoStickerRepository infoStickerRepository2 = infoStickerRepository;
                                    ChangeQuickRedirect changeQuickRedirect2 = InfoStickerRepository.f69728a;
                                    liveData = (LiveData) PatchProxy.accessDispatch(objArr2, infoStickerRepository2, changeQuickRedirect2, false, 79320, new Class[]{ProviderEffect.class}, LiveData.class);
                                } else {
                                    MutableLiveData mutableLiveData = new MutableLiveData();
                                    mutableLiveData.setValue(a.a(a.C0799a.LOADING, null));
                                    infoStickerRepository.f69729b.a(providerEffect, (b) new c(mutableLiveData) {

                                        /* renamed from: a */
                                        public static ChangeQuickRedirect f69740a;

                                        /* renamed from: b */
                                        final /* synthetic */ MutableLiveData f69741b;

                                        public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.11.a(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect):void, dex: classes5.dex
                                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.11.a(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect):void, class status: UNLOADED
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
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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

                                        public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.11.a(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect, com.ss.android.ugc.effectmanager.common.e.c):void, dex: classes5.dex
                                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.11.a(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect, com.ss.android.ugc.effectmanager.common.e.c):void, class status: UNLOADED
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
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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

                                        public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.11.a(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect, int, long):void, dex: classes5.dex
                                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.11.a(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect, int, long):void, class status: UNLOADED
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
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
                                    liveData = mutableLiveData;
                                }
                            }
                            liveData.observe(fragmentActivity, searchInfoStickerHolder);
                        }
                    }
                    com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                    bj a3 = bj.a().a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR).a("tab_name", "贴图").a("prop_id", this.f69806c.f70100b.id).a("enter_method", "click_main_panel").a("creation_id", this.f69807d.creationId).a("shoot_way", this.f69807d.mShootWay).a("draft_id", this.f69807d.draftId);
                    if (SearchInfoStickerHolder.this.f69801c) {
                        str = "edit_post_page";
                    } else {
                        str = "video_edit_page";
                    }
                    bj a4 = a3.a("enter_from", str).a("impr_position", this.f69808e);
                    if (this.f69809f.getValue() == null || !((Boolean) this.f69809f.getValue()).booleanValue()) {
                        str2 = PushConstants.PUSH_TYPE_NOTIFY;
                    } else {
                        str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    }
                    aVar.a("prop_click", a4.a("after_search", str2).f65805b);
                    if (this.f69806c.f70100b.click_url != null) {
                        OkHttpClient oKHttpClient = com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient();
                        Request.Builder builder = new Request.Builder();
                        builder.get().url(this.f69806c.f70100b.click_url);
                        oKHttpClient.newCall(builder.build()).enqueue(new Callback() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f69810a;

                            public final void onFailure(@NonNull Call call, @NonNull IOException iOException) {
                                if (PatchProxy.isSupport(new Object[]{call, iOException}, this, f69810a, false, 79432, new Class[]{Call.class, IOException.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{call, iOException}, this, f69810a, false, 79432, new Class[]{Call.class, IOException.class}, Void.TYPE);
                                    return;
                                }
                                call.cancel();
                            }

                            public final void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                                if (PatchProxy.isSupport(new Object[]{call, response}, this, f69810a, false, 79433, new Class[]{Call.class, Response.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{call, response}, this, f69810a, false, 79433, new Class[]{Call.class, Response.class}, Void.TYPE);
                                    return;
                                }
                                call.cancel();
                            }
                        });
                    }
                }

                {
                    this.f69805b = r2;
                    this.f69806c = r3;
                    this.f69807d = r4;
                    this.f69808e = r5;
                    this.f69809f = r6;
                }
            };
            view.setOnClickListener(r0);
        }
    }
}
