package com.ss.android.ugc.aweme.profile.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.effect.EffectApi;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.ss.android.ugc.aweme.feed.model.NewStickerItemList;
import com.ss.android.ugc.aweme.net.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0014¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0016J!\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0014¢\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0014¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/presenter/EffectListModel;", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", "Lcom/ss/android/ugc/aweme/feed/model/NewFaceSticker;", "Lcom/ss/android/ugc/aweme/feed/model/NewStickerItemList;", "()V", "checkParams", "", "params", "", "", "([Ljava/lang/Object;)Z", "getItems", "", "handleData", "", "data", "isHasMore", "loadMoreList", "([Ljava/lang/Object;)V", "refreshList", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g extends a<NewFaceSticker, NewStickerItemList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61624a;

    public final boolean checkParams(@NotNull Object... objArr) {
        Object obj = objArr;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f61624a, false, 67574, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f61624a, false, 67574, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj, "params");
        return true;
    }

    @Nullable
    public final List<NewFaceSticker> getItems() {
        NewStickerItemList newStickerItemList = (NewStickerItemList) this.mData;
        if (newStickerItemList != null) {
            return newStickerItemList.stickers;
        }
        return null;
    }

    public final boolean isHasMore() {
        if (this.mData == null || ((NewStickerItemList) this.mData).hasMore != 1) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void handleData(Object obj) {
        LogPbBean logPbBean;
        NewStickerItemList newStickerItemList = (NewStickerItemList) obj;
        if (PatchProxy.isSupport(new Object[]{newStickerItemList}, this, f61624a, false, 67575, new Class[]{NewStickerItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{newStickerItemList}, this, f61624a, false, 67575, new Class[]{NewStickerItemList.class}, Void.TYPE);
            return;
        }
        super.handleData(newStickerItemList);
        if (newStickerItemList != null) {
            List<NewFaceSticker> list = newStickerItemList.stickers;
            if (list != null) {
                for (NewFaceSticker newFaceSticker : list) {
                    if (newStickerItemList != null) {
                        logPbBean = newStickerItemList.logPb;
                    } else {
                        logPbBean = null;
                    }
                    newFaceSticker.setLogPb(logPbBean);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void refreshList(@org.jetbrains.annotations.NotNull java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f61624a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 67572(0x107f4, float:9.4689E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f61624a
            r13 = 0
            r14 = 67572(0x107f4, float:9.4689E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.lang.String r2 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.effect.EffectApi$API r3 = com.ss.android.ugc.aweme.effect.EffectApi.a()
            r1 = r0[r1]
            if (r1 == 0) goto L_0x0075
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            int r1 = r0.length
            r2 = 3
            if (r1 < r2) goto L_0x005a
            r1 = 2
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x005b
        L_0x0052:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r1)
            throw r0
        L_0x005a:
            r0 = 0
        L_0x005b:
            r5 = r0
            r6 = 0
            r8 = 10
            a.i r0 = r3.getEffectList(r4, r5, r6, r8)
            com.ss.android.ugc.aweme.net.m r1 = new com.ss.android.ugc.aweme.net.m
            r2 = r17
            com.bytedance.common.utility.collection.WeakHandler r3 = r2.mHandler
            android.os.Handler r3 = (android.os.Handler) r3
            r1.<init>(r3, r9)
            a.g r1 = (a.g) r1
            r0.a((a.g<TResult, TContinuationResult>) r1)
            return
        L_0x0075:
            r2 = r17
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.g.refreshList(java.lang.Object[]):void");
    }

    public final void loadMoreList(@NotNull Object... objArr) {
        String str;
        long j;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f61624a, false, 67573, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f61624a, false, 67573, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(objArr, "params");
        EffectApi.API a2 = EffectApi.a();
        String str2 = objArr[1];
        if (str2 != null) {
            String str3 = str2;
            if (objArr.length >= 3) {
                String str4 = objArr[2];
                if (str4 != null) {
                    str = str4;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                str = null;
            }
            String str5 = str;
            if (this.mData == null) {
                j = 0;
            } else {
                j = ((NewStickerItemList) this.mData).cursor;
            }
            a2.getEffectList(str3, str5, j, 10).a((a.g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }
}
