package com.bytedance.android.live.base.model.feed;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.b.a;
import com.bytedance.android.live.base.model.d;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

@Keep
public class FeedItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    public transient List<a> banners;
    @SerializedName("data")
    public JsonObject data;
    @Keep
    public transient d item;
    @Keep
    public transient String logPb;
    @Keep
    @IgnoreStyleCheck
    public transient Object object;
    @SerializedName("order_type")
    public int orderType;
    @Keep
    public transient boolean repeatDisable;
    @SerializedName("rid")
    public String resId;
    @IgnoreStyleCheck
    public transient String searchId = "";
    @Keep
    @IgnoreStyleCheck
    public transient String searchReqId = "";
    @SerializedName("tags")
    public List<String> tags;
    @SerializedName("type")
    public int type;

    public d item() {
        return this.item;
    }

    public String logPb() {
        return this.logPb;
    }

    public String requestId() {
        return this.resId;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47, new Class[0], String.class);
        } else if (this.item == null) {
            return "null";
        } else {
            return this.item.toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int hashCode() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 49
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 49
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x002a:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.bytedance.android.live.base.model.d r3 = r11.item
            r2[r0] = r3
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r0] = r2
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.bytedance.android.live.b.f7681a
            r7 = 1
            r8 = 2
            java.lang.Class[] r9 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r9[r0] = r3
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r3 == 0) goto L_0x0064
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r0] = r2
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.bytedance.android.live.b.f7681a
            r7 = 1
            r8 = 2
            java.lang.Class[] r9 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r9[r0] = r1
            java.lang.Class r10 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0064:
            int r0 = java.util.Arrays.hashCode(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.base.model.feed.FeedItem.hashCode():int");
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 48
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 48
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            if (r7 != r8) goto L_0x0040
            return r9
        L_0x0040:
            if (r8 == 0) goto L_0x00a5
            java.lang.Class r0 = r18.getClass()
            java.lang.Class r1 = r19.getClass()
            if (r0 == r1) goto L_0x004d
            goto L_0x00a5
        L_0x004d:
            r0 = r8
            com.bytedance.android.live.base.model.feed.FeedItem r0 = (com.bytedance.android.live.base.model.feed.FeedItem) r0
            com.bytedance.android.live.base.model.d r1 = r7.item
            com.bytedance.android.live.base.model.d r0 = r0.item
            r2 = 2
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.live.b.f7681a
            r14 = 1
            r15 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r3[r10] = r4
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x0098
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.live.b.f7681a
            r14 = 1
            r15 = 1
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r10] = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0098:
            if (r1 == r0) goto L_0x00a4
            if (r1 == 0) goto L_0x00a3
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            return r10
        L_0x00a4:
            return r9
        L_0x00a5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.base.model.feed.FeedItem.equals(java.lang.Object):boolean");
    }

    public static FeedItem create(int i, d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), dVar2}, null, changeQuickRedirect, true, 50, new Class[]{Integer.TYPE, d.class}, FeedItem.class)) {
            return (FeedItem) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), dVar2}, null, changeQuickRedirect, true, 50, new Class[]{Integer.TYPE, d.class}, FeedItem.class);
        }
        FeedItem feedItem = new FeedItem();
        feedItem.type = i;
        feedItem.item = dVar2;
        return feedItem;
    }

    public static FeedItem create(int i, d dVar, String str, String str2) {
        d dVar2 = dVar;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), dVar2, str3, str4}, null, changeQuickRedirect, true, 51, new Class[]{Integer.TYPE, d.class, String.class, String.class}, FeedItem.class)) {
            return (FeedItem) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), dVar2, str3, str4}, null, changeQuickRedirect, true, 51, new Class[]{Integer.TYPE, d.class, String.class, String.class}, FeedItem.class);
        }
        FeedItem feedItem = new FeedItem();
        feedItem.type = i;
        feedItem.item = dVar2;
        feedItem.logPb = str3;
        feedItem.resId = str4;
        return feedItem;
    }
}
