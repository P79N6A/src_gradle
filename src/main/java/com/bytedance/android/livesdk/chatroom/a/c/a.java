package com.bytedance.android.livesdk.chatroom.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.f.d;
import com.bytedance.android.livesdk.gift.effect.normal.e.b;
import com.bytedance.android.livesdk.message.model.bi;
import com.bytedance.android.livesdkapi.host.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.barrage.a.c;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9720a;

    /* renamed from: b  reason: collision with root package name */
    public final View f9721b;

    /* renamed from: c  reason: collision with root package name */
    public c f9722c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f9723d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f9724e;

    /* renamed from: f  reason: collision with root package name */
    final ImageView f9725f;
    final TextView g;
    public final ImageView h;
    private final TextView i;
    private final ImageView j;

    public a(View view, bi biVar) {
        FansClubData fansClubData;
        ImageModel imageModel;
        this.f9721b = view;
        this.i = (TextView) view.findViewById(C0906R.id.da0);
        this.i.setText(biVar.f16569b);
        if (com.bytedance.android.livesdkapi.a.a.f18614b && Build.VERSION.SDK_INT >= 17 && !com.bytedance.android.live.uikit.d.c.a(ac.e())) {
            this.i.setTextDirection(3);
        }
        this.f9723d = (ImageView) view.findViewById(C0906R.id.ane);
        this.f9724e = (ImageView) view.findViewById(C0906R.id.b26);
        this.f9725f = (ImageView) view.findViewById(C0906R.id.aca);
        this.g = (TextView) view.findViewById(C0906R.id.acb);
        this.h = (ImageView) view.findViewById(C0906R.id.kj);
        TextView textView = (TextView) view.findViewById(C0906R.id.dfb);
        this.j = (ImageView) view.findViewById(C0906R.id.ct1);
        TTLiveSDKContext.getHostService().p().a(biVar.f16570c.getAvatarThumb(), (e.c) new e.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9726a;

            public final void a(Bitmap bitmap) {
                if (PatchProxy.isSupport(new Object[]{bitmap}, this, f9726a, false, 3940, new Class[]{Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bitmap}, this, f9726a, false, 3940, new Class[]{Bitmap.class}, Void.TYPE);
                } else if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap a2 = b.a(bitmap);
                    if (a2 != null && !a2.isRecycled()) {
                        a.this.f9723d.setImageBitmap(a2);
                        if (a.this.f9722c != null) {
                            a.this.f9722c.a(a.this.f9721b);
                        }
                    }
                }
            }
        });
        if (biVar.f16570c.getUserHonor() == null || biVar.f16570c.getUserHonor().m() <= 0 || com.bytedance.android.livesdkapi.a.a.f18615c) {
            this.f9724e.setVisibility(8);
        } else {
            this.f9724e.setVisibility(8);
            if (com.bytedance.android.live.uikit.a.a.f()) {
                imageModel = biVar.f16570c.getUserHonor().j();
            } else {
                imageModel = biVar.f16570c.getUserHonor().k();
            }
            TTLiveSDKContext.getHostService().p().a(imageModel, (e.c) new e.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f9728a;

                public final void a(Bitmap bitmap) {
                    Bitmap bitmap2;
                    Bitmap bitmap3 = bitmap;
                    if (PatchProxy.isSupport(new Object[]{bitmap3}, this, f9728a, false, 3941, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap3}, this, f9728a, false, 3941, new Class[]{Bitmap.class}, Void.TYPE);
                    } else if (bitmap3 != null && !bitmap.isRecycled()) {
                        ImageView imageView = a.this.f9724e;
                        if (com.bytedance.android.live.uikit.a.a.f()) {
                            bitmap2 = bitmap3;
                        } else {
                            if (PatchProxy.isSupport(new Object[]{bitmap3}, null, a.f9720a, true, 3935, new Class[]{Bitmap.class}, Bitmap.class)) {
                                bitmap2 = (Bitmap) PatchProxy.accessDispatch(new Object[]{bitmap3}, null, a.f9720a, true, 3935, new Class[]{Bitmap.class}, Bitmap.class);
                            } else {
                                bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                                Canvas canvas = new Canvas(bitmap2);
                                Paint paint = new Paint();
                                Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                RectF rectF = new RectF(rect);
                                paint.setAntiAlias(true);
                                canvas.drawARGB(0, 0, 0, 0);
                                paint.setColor(-12434878);
                                canvas.drawOval(rectF, paint);
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                                canvas.drawBitmap(bitmap3, rect, rect, paint);
                            }
                        }
                        imageView.setImageBitmap(bitmap2);
                        a.this.f9724e.setVisibility(0);
                        if (a.this.f9722c != null) {
                            a.this.f9722c.a(a.this.f9721b);
                        }
                    }
                }
            });
        }
        textView.setText(biVar.f16570c.getNickName());
        textView.measure(0, 0);
        this.i.measure(0, 0);
        if (this.i.getMeasuredWidth() < textView.getMeasuredWidth()) {
            this.i.setWidth(textView.getMeasuredWidth());
        }
        if (biVar.f16573f != null) {
            if (!(biVar.f16573f.f16610a == null || biVar.f16573f.f16610a.getUrls() == null)) {
                d.f10220b.a(biVar.f16573f.f16610a, this.i, com.bytedance.android.live.uikit.d.c.a(ac.e()), new b(this));
            }
            if (!(biVar.f16573f.f16611b == null || this.h == null)) {
                TTLiveSDKContext.getHostService().p().a(biVar.f16573f.f16611b, (e.c) new e.c() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f9730a;

                    public final void a(Bitmap bitmap) {
                        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f9730a, false, 3942, new Class[]{Bitmap.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bitmap}, this, f9730a, false, 3942, new Class[]{Bitmap.class}, Void.TYPE);
                        } else if (bitmap != null && !bitmap.isRecycled()) {
                            a.this.h.setImageBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, true));
                            if (a.this.f9722c != null) {
                                a.this.f9722c.a(a.this.f9721b);
                            }
                        }
                    }
                });
            }
        }
        User user = biVar.f16570c;
        if (!(user == null || user.getFansClub() == null)) {
            if (FansClubData.isValid(user.getFansClub().getData())) {
                fansClubData = user.getFansClub().getData();
            } else if (user.getFansClub().getPreferData() != null) {
                fansClubData = user.getFansClub().getPreferData().get(1);
            } else {
                fansClubData = null;
            }
            if (FansClubData.isValid(fansClubData) && fansClubData.userFansClubStatus == 1 && fansClubData.badge != null && fansClubData.badge.icons != null) {
                ImageModel imageModel2 = fansClubData.badge.icons.get(2);
                if (imageModel2 != null) {
                    com.bytedance.android.livesdkapi.depend.model.d dVar = new com.bytedance.android.livesdkapi.depend.model.d(imageModel2, 1);
                    dVar.f18703a = fansClubData.clubName;
                    com.bytedance.android.livesdk.chatroom.f.b.a(dVar).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new c(this, fansClubData), new d(this));
                }
            } else if (this.f9725f != null) {
                this.f9725f.setVisibility(8);
                this.g.setVisibility(8);
            }
        }
        if (biVar.f16570c == null || TextUtils.isEmpty(biVar.f16570c.getSpecialId())) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
        }
        this.f9722c = new c(this.f9721b);
        UserProfileEvent userProfileEvent = new UserProfileEvent(biVar.f16570c);
        userProfileEvent.mSource = "live_barrage";
        this.f9722c.i = new e(userProfileEvent);
    }
}
