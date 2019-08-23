package com.ss.android.ugc.aweme.story.shootvideo.publish;

import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.shootvideo.e;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.k;
import com.ss.android.ugc.aweme.story.shootvideo.publish.view.PublishBottomLayout;
import com.ss.android.ugc.aweme.story.shootvideo.publish.view.PublishSelectFriendImgView;
import java.util.ArrayList;
import java.util.List;

public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f73702b;

    /* renamed from: c  reason: collision with root package name */
    public PublishBottomLayout f73703c;

    /* renamed from: d  reason: collision with root package name */
    public a f73704d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f73705e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<String> f73706f = new ArrayList();
    private boolean g = true;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73702b, false, 85416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73702b, false, 85416, new Class[0], Void.TYPE);
        } else if (!this.g) {
            this.g = true;
            this.f73703c.b();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f73702b, false, 85417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73702b, false, 85417, new Class[0], Void.TYPE);
        } else if (this.g) {
            this.g = false;
            PublishBottomLayout publishBottomLayout = this.f73703c;
            if (PatchProxy.isSupport(new Object[0], publishBottomLayout, PublishBottomLayout.f73772a, false, 85520, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], publishBottomLayout, PublishBottomLayout.f73772a, false, 85520, new Class[0], Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], publishBottomLayout, PublishBottomLayout.f73772a, false, 85517, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], publishBottomLayout, PublishBottomLayout.f73772a, false, 85517, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.story.shootvideo.a.b(publishBottomLayout);
            }
            publishBottomLayout.h = true;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73702b, false, 85415, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73702b, false, 85415, new Class[0], Void.TYPE);
            return;
        }
        if (this.f73704d.a()) {
            this.f73704d.dismiss();
        } else {
            a aVar = this.f73704d;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f73515b, false, 85296, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f73515b, false, 85296, new Class[0], Void.TYPE);
            } else {
                aVar.f73516c.b(aVar.f73519f);
                aVar.f73516c.c(aVar.f73517d);
                if (aVar.g != null) {
                    aVar.g.a();
                }
            }
        }
        a aVar2 = this.f73704d;
        AnonymousClass2 r9 = new com.ss.android.ugc.aweme.story.shootvideo.friends.adapter.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73709a;

            public final void a(k kVar, boolean z) {
            }

            public final void a(List<k> list) {
                if (PatchProxy.isSupport(new Object[]{list}, this, f73709a, false, 85421, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list}, this, f73709a, false, 85421, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                d.this.f73704d.dismiss();
                ArrayList arrayList = new ArrayList();
                if (list != null && list.size() > 0) {
                    for (k next : list) {
                        arrayList.add(next.f73551a);
                        if (next.f73554d) {
                            d.this.f73705e.add(next.f73551a.getUid());
                        } else {
                            d.this.f73706f.add(next.f73551a.getUid());
                        }
                    }
                }
                PublishBottomLayout publishBottomLayout = d.this.f73703c;
                if (PatchProxy.isSupport(new Object[]{arrayList}, publishBottomLayout, PublishBottomLayout.f73772a, false, 85515, new Class[]{List.class}, Void.TYPE)) {
                    PublishBottomLayout publishBottomLayout2 = publishBottomLayout;
                    PatchProxy.accessDispatch(new Object[]{arrayList}, publishBottomLayout2, PublishBottomLayout.f73772a, false, 85515, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                PublishSelectFriendImgView publishSelectFriendImgView = publishBottomLayout.f73777f;
                if (PatchProxy.isSupport(new Object[]{arrayList}, publishSelectFriendImgView, PublishSelectFriendImgView.f73778a, false, 85523, new Class[]{List.class}, Void.TYPE)) {
                    Object[] objArr = {arrayList};
                    Object[] objArr2 = objArr;
                    PublishSelectFriendImgView publishSelectFriendImgView2 = publishSelectFriendImgView;
                    PatchProxy.accessDispatch(objArr2, publishSelectFriendImgView2, PublishSelectFriendImgView.f73778a, false, 85523, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                publishSelectFriendImgView.f73783f.setVisibility(8);
                if (arrayList.size() == 0) {
                    publishSelectFriendImgView.f73779b.setVisibility(0);
                    publishSelectFriendImgView.f73780c.setVisibility(8);
                    publishSelectFriendImgView.f73781d.setVisibility(8);
                    publishSelectFriendImgView.f73782e.setVisibility(8);
                    return;
                }
                publishSelectFriendImgView.f73779b.setVisibility(8);
                publishSelectFriendImgView.f73780c.setVisibility(0);
                if (arrayList.size() == 1) {
                    c.b(publishSelectFriendImgView.f73780c, ((User) arrayList.get(0)).getAvatarThumb());
                    publishSelectFriendImgView.f73781d.setVisibility(8);
                    publishSelectFriendImgView.f73782e.setVisibility(8);
                    return;
                }
                publishSelectFriendImgView.f73781d.setVisibility(0);
                if (arrayList.size() == 2) {
                    c.b(publishSelectFriendImgView.f73780c, ((User) arrayList.get(0)).getAvatarThumb());
                    c.b(publishSelectFriendImgView.f73781d, ((User) arrayList.get(1)).getAvatarThumb());
                    publishSelectFriendImgView.f73782e.setVisibility(8);
                    return;
                }
                publishSelectFriendImgView.f73782e.setVisibility(0);
                c.b(publishSelectFriendImgView.f73780c, ((User) arrayList.get(0)).getAvatarThumb());
                c.b(publishSelectFriendImgView.f73781d, ((User) arrayList.get(1)).getAvatarThumb());
                c.b(publishSelectFriendImgView.f73782e, ((User) arrayList.get(2)).getAvatarThumb());
                if (arrayList.size() > 3) {
                    publishSelectFriendImgView.f73783f.setVisibility(0);
                    if (arrayList.size() >= 100) {
                        publishSelectFriendImgView.f73783f.setText("99");
                        return;
                    }
                    TextView textView = publishSelectFriendImgView.f73783f;
                    textView.setText(arrayList.size());
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{r9}, aVar2, a.f73515b, false, 85299, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.friends.adapter.a.class}, Void.TYPE)) {
            a aVar3 = aVar2;
            PatchProxy.accessDispatch(new Object[]{r9}, aVar3, a.f73515b, false, 85299, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.friends.adapter.a.class}, Void.TYPE);
            return;
        }
        aVar2.f73518e = r9;
        aVar2.f73516c.setSelectFriendListener(aVar2);
    }
}
