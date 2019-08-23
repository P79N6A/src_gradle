package com.bytedance.ies.dmt.ui.input.emoji;

import android.support.v4.view.ViewPager;

class EmojiChoosePanel$2 extends ViewPager.SimpleOnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f20367a;

    EmojiChoosePanel$2(c cVar) {
        this.f20367a = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r7.g.findViewByPosition(r7.g.findFirstVisibleItemPosition()).getLeft() < 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        if (r7.g.findViewByPosition(r7.g.findLastVisibleItemPosition()).getRight() > r7.f20391d.getWidth()) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageSelected(int r7) {
        /*
            r6 = this;
            com.bytedance.ies.dmt.ui.input.emoji.c r0 = r6.f20367a
            com.bytedance.ies.dmt.ui.input.emoji.e r0 = r0.f20393f
            r1 = 0
            if (r7 < 0) goto L_0x0033
            r2 = 0
            r3 = 0
        L_0x0009:
            java.util.List<com.bytedance.ies.dmt.ui.input.c> r4 = r0.f20398c
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x0033
            java.util.List<com.bytedance.ies.dmt.ui.input.c> r4 = r0.f20398c
            java.lang.Object r4 = r4.get(r2)
            com.bytedance.ies.dmt.ui.input.c r4 = (com.bytedance.ies.dmt.ui.input.c) r4
            int r5 = r4.d()
            int r5 = r5 + r3
            if (r7 >= r5) goto L_0x002b
            r0.f20397b = r2
            r0.f20396a = r4
            com.bytedance.ies.dmt.ui.input.c r0 = r0.f20396a
            int r7 = r7 - r3
            r0.a(r7)
            goto L_0x0033
        L_0x002b:
            int r4 = r4.d()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0033:
            com.bytedance.ies.dmt.ui.input.emoji.c r7 = r6.f20367a
            r7.f()
            com.bytedance.ies.dmt.ui.input.emoji.c r7 = r6.f20367a
            int r0 = r7.i
            com.bytedance.ies.dmt.ui.input.emoji.e r2 = r7.f20393f
            int r2 = r2.f20397b
            if (r0 == r2) goto L_0x00d6
            com.bytedance.ies.dmt.ui.input.tab.TabIndicatorAdapter r0 = r7.f20392e
            r0.notifyDataSetChanged()
            com.bytedance.ies.dmt.ui.input.emoji.e r0 = r7.f20393f
            int r0 = r0.f20397b
            int r2 = r7.i
            r3 = 1
            if (r0 >= r2) goto L_0x0088
            android.support.v7.widget.LinearLayoutManager r0 = r7.g
            int r0 = r0.findFirstVisibleItemPosition()
            int r2 = r7.i
            if (r0 != r2) goto L_0x005b
            r1 = 1
        L_0x005b:
            android.support.v7.widget.LinearLayoutManager r0 = r7.g
            int r0 = r0.findFirstVisibleItemPosition()
            int r2 = r7.i
            int r2 = r2 - r3
            if (r0 != r2) goto L_0x00c5
            android.support.v7.widget.LinearLayoutManager r0 = r7.g
            android.support.v7.widget.LinearLayoutManager r2 = r7.g
            int r2 = r2.findFirstVisibleItemPosition()
            android.view.View r0 = r0.findViewByPosition(r2)
            if (r0 == 0) goto L_0x00c5
            android.support.v7.widget.LinearLayoutManager r0 = r7.g
            android.support.v7.widget.LinearLayoutManager r2 = r7.g
            int r2 = r2.findFirstVisibleItemPosition()
            android.view.View r0 = r0.findViewByPosition(r2)
            int r0 = r0.getLeft()
            if (r0 >= 0) goto L_0x00c5
        L_0x0086:
            r1 = 1
            goto L_0x00c5
        L_0x0088:
            android.support.v7.widget.LinearLayoutManager r0 = r7.g
            int r0 = r0.findLastVisibleItemPosition()
            int r2 = r7.i
            if (r0 != r2) goto L_0x0093
            r1 = 1
        L_0x0093:
            android.support.v7.widget.LinearLayoutManager r0 = r7.g
            int r0 = r0.findLastVisibleItemPosition()
            int r2 = r7.i
            int r2 = r2 + r3
            if (r0 != r2) goto L_0x00c5
            android.support.v7.widget.LinearLayoutManager r0 = r7.g
            android.support.v7.widget.LinearLayoutManager r2 = r7.g
            int r2 = r2.findLastVisibleItemPosition()
            android.view.View r0 = r0.findViewByPosition(r2)
            if (r0 == 0) goto L_0x00c5
            android.support.v7.widget.LinearLayoutManager r0 = r7.g
            android.support.v7.widget.LinearLayoutManager r2 = r7.g
            int r2 = r2.findLastVisibleItemPosition()
            android.view.View r0 = r0.findViewByPosition(r2)
            int r0 = r0.getRight()
            android.support.v7.widget.RecyclerView r2 = r7.f20391d
            int r2 = r2.getWidth()
            if (r0 <= r2) goto L_0x00c5
            goto L_0x0086
        L_0x00c5:
            if (r1 == 0) goto L_0x00d0
            android.support.v7.widget.RecyclerView r0 = r7.f20391d
            com.bytedance.ies.dmt.ui.input.emoji.e r1 = r7.f20393f
            int r1 = r1.f20397b
            r0.scrollToPosition(r1)
        L_0x00d0:
            com.bytedance.ies.dmt.ui.input.emoji.e r0 = r7.f20393f
            int r0 = r0.f20397b
            r7.i = r0
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.input.emoji.EmojiChoosePanel$2.onPageSelected(int):void");
    }
}
