package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.BaseViewHolder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class EmojiGridView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50484a;

    /* renamed from: b  reason: collision with root package name */
    public int f50485b;

    /* renamed from: c  reason: collision with root package name */
    public View f50486c;

    /* renamed from: d  reason: collision with root package name */
    public GridView f50487d;

    /* renamed from: e  reason: collision with root package name */
    a f50488e;

    /* renamed from: f  reason: collision with root package name */
    private Context f50489f;

    final class EmojiHolder extends BaseViewHolder<c> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f50490c;

        /* renamed from: e  reason: collision with root package name */
        private RemoteImageView f50492e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f50493f;

        public final void c() {
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f50490c, false, 50807, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50490c, false, 50807, new Class[0], Void.TYPE);
                return;
            }
            this.f50492e = (RemoteImageView) this.itemView.findViewById(C0906R.id.a9e);
            this.f50493f = (TextView) this.itemView.findViewById(C0906R.id.d41);
        }

        public final void a(c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f50490c, false, 50808, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f50490c, false, 50808, new Class[]{c.class}, Void.TYPE);
            } else if (cVar != null) {
                if (!cVar.a()) {
                    this.f50492e.setImageResource(cVar.f50559c);
                    if (!TextUtils.isEmpty(cVar.f50558b)) {
                        this.f50492e.setContentDescription(GlobalContext.getContext().getString(C0906R.string.aok, new Object[]{cVar.f50558b}));
                    } else {
                        this.f50492e.setContentDescription(GlobalContext.getContext().getString(C0906R.string.aon));
                    }
                    if (this.f50493f != null) {
                        this.f50493f.setVisibility(8);
                    }
                } else if (cVar.f50557a.getStickerType() == 2) {
                    File file = new File(com.ss.android.ugc.aweme.im.sdk.resources.a.a(), com.ss.android.ugc.aweme.im.sdk.resources.a.c(cVar.f50557a));
                    if (file.exists()) {
                        this.f50492e.setImageURI(Uri.fromFile(file));
                    } else {
                        c.b(this.f50492e, cVar.f50557a.getStaticUrl());
                    }
                    this.f50492e.setContentDescription(GlobalContext.getContext().getString(C0906R.string.aon));
                } else {
                    this.f50492e.setImageURI(Uri.fromFile(new File(com.ss.android.ugc.aweme.im.sdk.resources.a.a(cVar.f50557a))));
                    if (!TextUtils.isEmpty(cVar.f50558b)) {
                        this.f50492e.setContentDescription(GlobalContext.getContext().getString(C0906R.string.aok, new Object[]{cVar.f50558b}));
                    }
                }
                if (this.f50493f != null && cVar.a()) {
                    if (cVar.f50557a.getStickerType() == 2) {
                        this.f50493f.setVisibility(8);
                    } else {
                        this.f50493f.setText(cVar.f50557a.getRealDisplayName());
                        this.f50493f.setVisibility(0);
                    }
                }
            }
        }

        public EmojiHolder(View view) {
            super(view);
        }
    }

    final class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50494a;

        /* renamed from: b  reason: collision with root package name */
        List<c> f50495b = new ArrayList();

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f50494a, false, 50805, new Class[0], Integer.TYPE)) {
                return this.f50495b.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50494a, false, 50805, new Class[0], Integer.TYPE)).intValue();
        }

        public a() {
        }

        public final Object getItem(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50494a, false, 50806, new Class[]{Integer.TYPE}, Object.class)) {
                return this.f50495b.get(i);
            }
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50494a, false, 50806, new Class[]{Integer.TYPE}, Object.class);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView$EmojiHolder} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.support.annotation.NonNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.View getView(int r13, @android.support.annotation.Nullable android.view.View r14, @android.support.annotation.NonNull android.view.ViewGroup r15) {
            /*
                r12 = this;
                r7 = r12
                r8 = 3
                java.lang.Object[] r0 = new java.lang.Object[r8]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                r9 = 0
                r0[r9] = r1
                r10 = 1
                r0[r10] = r14
                r11 = 2
                r0[r11] = r15
                com.meituan.robust.ChangeQuickRedirect r2 = f50494a
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r9] = r1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r10] = r1
                java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
                r5[r11] = r1
                java.lang.Class<android.view.View> r6 = android.view.View.class
                r3 = 0
                r4 = 50804(0xc674, float:7.1192E-41)
                r1 = r12
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0058
                java.lang.Object[] r0 = new java.lang.Object[r8]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                r0[r9] = r1
                r0[r10] = r14
                r0[r11] = r15
                com.meituan.robust.ChangeQuickRedirect r2 = f50494a
                r3 = 0
                r4 = 50804(0xc674, float:7.1192E-41)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r9] = r1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r10] = r1
                java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
                r5[r11] = r1
                java.lang.Class<android.view.View> r6 = android.view.View.class
                r1 = r12
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                android.view.View r0 = (android.view.View) r0
                return r0
            L_0x0058:
                if (r14 != 0) goto L_0x007f
                android.content.Context r0 = r15.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView r1 = com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView.this
                int r1 = r1.f50485b
                if (r1 == r10) goto L_0x006c
                r1 = 2131690190(0x7f0f02ce, float:1.9009417E38)
                goto L_0x006f
            L_0x006c:
                r1 = 2131690239(0x7f0f02ff, float:1.9009516E38)
            L_0x006f:
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView$EmojiHolder r1 = new com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView$EmojiHolder
                com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView r2 = com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView.this
                r1.<init>(r0)
                r0.setTag(r1)
                goto L_0x0087
            L_0x007f:
                java.lang.Object r0 = r14.getTag()
                r1 = r0
                com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView$EmojiHolder r1 = (com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView.EmojiHolder) r1
                r0 = r14
            L_0x0087:
                java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c> r2 = r7.f50495b
                r3 = r13
                java.lang.Object r2 = r2.get(r13)
                com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c r2 = (com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c) r2
                r1.a((com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c) r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView.a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    public EmojiGridView(Context context, int i) {
        this.f50489f = context;
        this.f50485b = i;
        if (PatchProxy.isSupport(new Object[0], this, f50484a, false, 50802, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50484a, false, 50802, new Class[0], Void.TYPE);
            return;
        }
        this.f50486c = LayoutInflater.from(this.f50489f).inflate(C0906R.layout.a3n, null);
        this.f50487d = (GridView) this.f50486c.findViewById(C0906R.id.a9i);
        this.f50487d.setSelector(17170445);
        this.f50487d.setStretchMode(1);
        this.f50487d.setGravity(17);
        Resources resources = this.f50489f.getResources();
        if (this.f50485b == 1) {
            this.f50487d.setNumColumns(7);
            this.f50487d.setColumnWidth(resources.getDimensionPixelSize(C0906R.dimen.h3));
            this.f50487d.setVerticalSpacing(resources.getDimensionPixelSize(C0906R.dimen.h5));
            int dimensionPixelSize = resources.getDimensionPixelSize(C0906R.dimen.h4);
            this.f50487d.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            this.f50487d.setNumColumns(4);
            this.f50487d.setColumnWidth(resources.getDimensionPixelSize(C0906R.dimen.h0));
            this.f50487d.setVerticalSpacing(resources.getDimensionPixelSize(C0906R.dimen.h2));
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0906R.dimen.h1);
            this.f50487d.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        }
        this.f50488e = new a();
        this.f50487d.setAdapter(this.f50488e);
    }
}
