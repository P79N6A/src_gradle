package com.ss.android.ugc.aweme.commercialize.views;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.e.a;
import com.ss.android.ugc.aweme.commercialize.log.e;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.l;
import com.ss.android.ugc.aweme.profile.presenter.r;
import org.json.JSONObject;

public class AvatarBackgroundImageView extends RemoteImageView implements l, r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39878a;

    /* renamed from: b  reason: collision with root package name */
    public a f39879b;

    /* renamed from: c  reason: collision with root package name */
    public ad f39880c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f39881d;

    public final void a(User user, int i) {
    }

    public final void a(Exception exc, int i) {
    }

    public final void a(String str, boolean z) {
    }

    public final void a(boolean z) {
    }

    public AvatarBackgroundImageView(Context context) {
        super(context);
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f39878a, false, 32785, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f39878a, false, 32785, new Class[]{Exception.class}, Void.TYPE);
        } else if ((!(this.f39881d instanceof AmeActivity) || ((AmeActivity) this.f39881d).isViewValid()) && this.f39879b != null) {
            this.f39879b.b();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception", exc.toString());
            } catch (Exception unused) {
            }
            e.a("aweme_header_image_upload_error_rate", 1, jSONObject);
            com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), exc, C0906R.string.bv);
        }
    }

    public final void a(AvatarUri avatarUri) {
        if (PatchProxy.isSupport(new Object[]{avatarUri}, this, f39878a, false, 32784, new Class[]{AvatarUri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarUri}, this, f39878a, false, 32784, new Class[]{AvatarUri.class}, Void.TYPE);
            return;
        }
        if (this.f39879b != null) {
            this.f39879b.b();
        }
        if (this.f39880c == null || avatarUri == null) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.bv).a();
            return;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(avatarUri.uri);
        urlModel.setUrlList(avatarUri.urlList);
        d.a().getCurUser().getCommerceInfo().setHeadImageUrl(urlModel);
        c.b(this, urlModel);
        com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.bw).a();
        e.a("aweme_header_image_upload_error_rate", 0, (JSONObject) null);
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39878a, false, 32786, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f39878a, false, 32786, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f39879b != null) {
            a aVar = this.f39879b;
            if (PatchProxy.isSupport(new Object[]{str2}, aVar, a.f38676a, false, 31929, new Class[]{String.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{str2}, aVar2, a.f38676a, false, 31929, new Class[]{String.class}, Void.TYPE);
            } else if (aVar.f38677b != null) {
                aVar.f38677b.a(str2);
            }
        }
    }

    public AvatarBackgroundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarBackgroundImageView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }
}
