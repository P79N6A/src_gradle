package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;

public final /* synthetic */ class r implements LoadMoreRecyclerViewAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70105a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchInfoStickerPresenter f70106b;

    r(SearchInfoStickerPresenter searchInfoStickerPresenter) {
        this.f70106b = searchInfoStickerPresenter;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadMore() {
        /*
            r13 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f70105a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 79453(0x1365d, float:1.11337E-40)
            r2 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f70105a
            r5 = 0
            r6 = 79453(0x1365d, float:1.11337E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r13
        L_0x0021:
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter r9 = r13.f70106b
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter.f4012a
            r5 = 0
            r6 = 79449(0x13659, float:1.11332E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0048
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter.f4012a
            r5 = 0
            r6 = 79449(0x13659, float:1.11332E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            goto L_0x0021
        L_0x0048:
            android.support.v4.app.FragmentActivity r2 = r9.f4013b
            android.arch.lifecycle.ViewModelProvider r2 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r2)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerViewModel> r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerViewModel.class
            android.arch.lifecycle.ViewModel r2 = r2.get(r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerViewModel r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerViewModel) r2
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r2 = r2.f69816a
            java.lang.Object r3 = r2.getValue()
            r10 = 30
            r11 = 1
            if (r3 == 0) goto L_0x00c5
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00c5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.w r2 = r9.f4014c
            java.lang.String r12 = r2.b()
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r0] = r12
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter.f4012a
            r5 = 0
            r6 = 79445(0x13655, float:1.11326E-40)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r0] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x00a4
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r0] = r12
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter.f4012a
            r5 = 0
            r6 = 79445(0x13655, float:1.11326E-40)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r0] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x011d
        L_0x00a4:
            boolean r0 = r9.i
            if (r0 != 0) goto L_0x00ae
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.w r0 = r9.f4014c
            r0.b(r11)
            goto L_0x011d
        L_0x00ae:
            android.support.v4.app.FragmentActivity r0 = r9.f4013b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerViewModel r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerModule.a((android.support.v4.app.FragmentActivity) r0)
            java.lang.String r2 = "giphy"
            int r3 = r9.h
            android.arch.lifecycle.LiveData r0 = r0.b(r12, r2, r3, r10)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.v r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.v
            r2.<init>(r9)
            r0.observe(r9, r2)
            return
        L_0x00c5:
            int r12 = r9.g
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2[r0] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter.f4012a
            r5 = 0
            r6 = 79443(0x13653, float:1.11323E-40)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r0] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x00ff
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2[r0] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter.f4012a
            r5 = 0
            r6 = 79443(0x13653, float:1.11323E-40)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r0] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x00ff:
            boolean r0 = r9.i
            if (r0 != 0) goto L_0x0109
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.w r0 = r9.f4014c
            r0.b(r11)
            return
        L_0x0109:
            android.support.v4.app.FragmentActivity r0 = r9.f4013b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerViewModel r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerModule.a((android.support.v4.app.FragmentActivity) r0)
            java.lang.String r2 = "giphy"
            android.arch.lifecycle.LiveData r0 = r0.a(r2, r12, r10)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.t r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.t
            r2.<init>(r9)
            r0.observe(r9, r2)
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.r.loadMore():void");
    }
}
