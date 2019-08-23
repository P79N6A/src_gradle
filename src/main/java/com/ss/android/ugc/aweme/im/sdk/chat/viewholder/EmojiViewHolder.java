package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.im.core.d.n;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.utils.az;
import com.ss.android.ugc.aweme.im.sdk.utils.w;

public class EmojiViewHolder extends BaseViewHolder<EmojiContent> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51064b;
    private static int p = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 112.0f));

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f51065a;

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51064b, false, 51461, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51064b, false, 51461, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.n.a(this.i);
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51064b, false, 51460, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51064b, false, 51460, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f51065a = (RemoteImageView) this.itemView.findViewById(C0906R.id.by9);
        this.i = this.itemView.findViewById(C0906R.id.yp);
    }

    public EmojiViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, EmojiContent emojiContent, int i) {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, emojiContent, Integer.valueOf(i)}, this, f51064b, false, 51462, new Class[]{n.class, n.class, EmojiContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, emojiContent, Integer.valueOf(i)}, this, f51064b, false, 51462, new Class[]{n.class, n.class, EmojiContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, emojiContent, i);
        if (PatchProxy.isSupport(new Object[0], this, f51064b, false, 51463, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51064b, false, 51463, new Class[0], Void.TYPE);
        } else if (((EmojiContent) this.k).getType() == 500 || ((EmojiContent) this.k).getType() == 501) {
            ((GenericDraweeHierarchy) this.f51065a.getHierarchy()).setPlaceholderImage((Drawable) null);
        } else {
            ((GenericDraweeHierarchy) this.f51065a.getHierarchy()).setPlaceholderImage(2130840345);
        }
        if (PatchProxy.isSupport(new Object[0], this, f51064b, false, 51464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51064b, false, 51464, new Class[0], Void.TYPE);
        } else {
            UrlModel localUrl = ((EmojiContent) this.k).getLocalUrl();
            UrlModel urlModel = (UrlModel) this.f51065a.getTag(67108864);
            if (localUrl != null) {
                if (!localUrl.equals(urlModel)) {
                    this.f51065a.setTag(67108864, localUrl);
                }
            } else if (((EmojiContent) this.k).getUrl() != null && !((EmojiContent) this.k).getUrl().equals(urlModel)) {
                this.f51065a.setTag(67108864, ((EmojiContent) this.k).getUrl());
            }
            if (((EmojiContent) this.k).getHeight() == 0 || ((EmojiContent) this.k).getWidth() == 0) {
                i2 = 0;
            } else if (((EmojiContent) this.k).getWidth() >= ((EmojiContent) this.k).getHeight()) {
                i3 = p;
                i2 = (p * ((EmojiContent) this.k).getHeight()) / ((EmojiContent) this.k).getWidth();
            } else {
                int i4 = p;
                i3 = (p * ((EmojiContent) this.k).getWidth()) / ((EmojiContent) this.k).getHeight();
                i2 = i4;
            }
            ViewGroup.LayoutParams layoutParams = this.f51065a.getLayoutParams();
            layoutParams.width = i3;
            layoutParams.height = i2;
            this.f51065a.setLayoutParams(layoutParams);
            if (w.d(((EmojiContent) this.k).getImageType()) || w.e(((EmojiContent) this.k).getImageType())) {
                if (localUrl == null) {
                    az.a(this.f51065a, ((EmojiContent) this.k).getUrl(), i3, i2);
                } else {
                    az.a(this.f51065a, localUrl, i3, i2);
                }
            } else if (localUrl == null) {
                c.a(this.f51065a, ((EmojiContent) this.k).getUrl(), i3, i2);
            } else {
                c.a(this.f51065a, localUrl, i3, i2);
            }
        }
        this.i.setTag(50331648, 10);
        this.i.setTag(67108864, this.m);
    }
}
