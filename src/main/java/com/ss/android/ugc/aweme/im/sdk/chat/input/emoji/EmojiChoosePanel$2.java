package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;

class EmojiChoosePanel$2 extends ViewPager.SimpleOnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50482a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f50483b;

    EmojiChoosePanel$2(b bVar) {
        this.f50483b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00be, code lost:
        if (r0.i.findViewByPosition(r0.i.findFirstVisibleItemPosition()).getLeft() < 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fe, code lost:
        if (r0.i.findViewByPosition(r0.i.findLastVisibleItemPosition()).getRight() > r0.f50554f.getWidth()) goto L_0x00c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageSelected(int r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r9 = 0
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f50482a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 50800(0xc670, float:7.1186E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f50482a
            r3 = 0
            r4 = 50800(0xc670, float:7.1186E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003e:
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r0 = r7.f50483b
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.e r0 = r0.h
            r1 = r18
            r0.b(r1)
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r0 = r7.f50483b
            r0.g()
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r0 = r7.f50483b
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b.f50552d
            r13 = 0
            r14 = 50791(0xc667, float:7.1173E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0073
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b.f50552d
            r13 = 0
            r14 = 50791(0xc667, float:7.1173E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0112
        L_0x0073:
            int r1 = r0.k
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.e r2 = r0.h
            int r2 = r2.f50564d
            if (r1 == r2) goto L_0x0112
            com.ss.android.ugc.aweme.im.sdk.chat.input.tab.TabIndicatorAdapter r1 = r0.g
            r1.notifyDataSetChanged()
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.e r1 = r0.h
            int r1 = r1.f50564d
            int r2 = r0.k
            if (r1 >= r2) goto L_0x00c2
            android.support.v7.widget.LinearLayoutManager r1 = r0.i
            int r1 = r1.findFirstVisibleItemPosition()
            int r2 = r0.k
            if (r1 != r2) goto L_0x0094
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            android.support.v7.widget.LinearLayoutManager r2 = r0.i
            int r2 = r2.findFirstVisibleItemPosition()
            int r3 = r0.k
            int r3 = r3 - r8
            if (r2 != r3) goto L_0x0101
            android.support.v7.widget.LinearLayoutManager r2 = r0.i
            android.support.v7.widget.LinearLayoutManager r3 = r0.i
            int r3 = r3.findFirstVisibleItemPosition()
            android.view.View r2 = r2.findViewByPosition(r3)
            if (r2 == 0) goto L_0x0101
            android.support.v7.widget.LinearLayoutManager r2 = r0.i
            android.support.v7.widget.LinearLayoutManager r3 = r0.i
            int r3 = r3.findFirstVisibleItemPosition()
            android.view.View r2 = r2.findViewByPosition(r3)
            int r2 = r2.getLeft()
            if (r2 >= 0) goto L_0x0101
        L_0x00c0:
            r1 = 1
            goto L_0x0101
        L_0x00c2:
            android.support.v7.widget.LinearLayoutManager r1 = r0.i
            int r1 = r1.findLastVisibleItemPosition()
            int r2 = r0.k
            if (r1 != r2) goto L_0x00ce
            r1 = 1
            goto L_0x00cf
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            android.support.v7.widget.LinearLayoutManager r2 = r0.i
            int r2 = r2.findLastVisibleItemPosition()
            int r3 = r0.k
            int r3 = r3 + r8
            if (r2 != r3) goto L_0x0101
            android.support.v7.widget.LinearLayoutManager r2 = r0.i
            android.support.v7.widget.LinearLayoutManager r3 = r0.i
            int r3 = r3.findLastVisibleItemPosition()
            android.view.View r2 = r2.findViewByPosition(r3)
            if (r2 == 0) goto L_0x0101
            android.support.v7.widget.LinearLayoutManager r2 = r0.i
            android.support.v7.widget.LinearLayoutManager r3 = r0.i
            int r3 = r3.findLastVisibleItemPosition()
            android.view.View r2 = r2.findViewByPosition(r3)
            int r2 = r2.getRight()
            android.support.v7.widget.RecyclerView r3 = r0.f50554f
            int r3 = r3.getWidth()
            if (r2 <= r3) goto L_0x0101
            goto L_0x00c0
        L_0x0101:
            if (r1 == 0) goto L_0x010c
            android.support.v7.widget.RecyclerView r1 = r0.f50554f
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.e r2 = r0.h
            int r2 = r2.f50564d
            r1.scrollToPosition(r2)
        L_0x010c:
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.e r1 = r0.h
            int r1 = r1.f50564d
            r0.k = r1
        L_0x0112:
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r0 = r7.f50483b
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.e r0 = r0.h
            com.ss.android.ugc.aweme.im.sdk.chat.input.c r0 = r0.f50562b
            int r0 = r0.h()
            r1 = 2
            if (r0 != r1) goto L_0x018a
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r0 = r7.f50483b
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.e r0 = r0.h
            com.ss.android.ugc.aweme.im.sdk.chat.input.c r0 = r0.f50562b
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x018a
            com.ss.android.ugc.aweme.im.sdk.resources.b r0 = com.ss.android.ugc.aweme.im.sdk.resources.b.a()
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r2 = r7.f50483b
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.e r2 = r2.h
            com.ss.android.ugc.aweme.im.sdk.chat.input.c r2 = r2.f50562b
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.g r2 = (com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.g) r2
            com.ss.android.ugc.aweme.im.sdk.resources.model.e r2 = r2.f50579e
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r2
            java.lang.Byte r3 = java.lang.Byte.valueOf(r8)
            r10[r8] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.sdk.resources.b.f52260a
            r13 = 0
            r14 = 53072(0xcf50, float:7.437E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.resources.model.e> r3 = com.ss.android.ugc.aweme.im.sdk.resources.model.e.class
            r15[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r15[r8] = r3
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r0
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x0183
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r8)
            r10[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.sdk.resources.b.f52260a
            r13 = 0
            r14 = 53072(0xcf50, float:7.437E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.resources.model.e> r1 = com.ss.android.ugc.aweme.im.sdk.resources.model.e.class
            r15[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            goto L_0x018a
        L_0x0183:
            com.ss.android.ugc.aweme.im.sdk.resources.c r0 = com.ss.android.ugc.aweme.im.sdk.resources.c.b()
            r0.b((com.ss.android.ugc.aweme.im.sdk.resources.model.e) r2, (boolean) r8)
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiChoosePanel$2.onPageSelected(int):void");
    }
}
