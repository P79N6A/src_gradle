package com.ss.android.ugc.aweme.photo.publish;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.ss.android.ugc.aweme.commercialize.model.f;
import com.ss.android.ugc.aweme.commercialize.model.g;
import com.ss.android.ugc.aweme.commercialize.utils.an;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.publish.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class PhotoUploadSuccessPopView extends PopupWindow implements com.ss.android.ugc.aweme.common.widget.scrollablelayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58672a;

    /* renamed from: b  reason: collision with root package name */
    public int f58673b = 4000;

    /* renamed from: c  reason: collision with root package name */
    public Activity f58674c;
    @BindView(2131494992)
    RemoteImageView commerceIconView;
    @BindView(2131495366)
    View commerceLineView;
    @BindView(2131497851)
    TextView commerceMsgView;
    @BindView(2131495523)
    View commerceView;

    /* renamed from: d  reason: collision with root package name */
    public View f58675d;

    /* renamed from: e  reason: collision with root package name */
    public a f58676e = new a(this, (byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public boolean f58677f = false;
    public long g = 0;
    private Aweme h;
    private PhotoContext i;
    @BindView(2131495242)
    RelativeLayout mLayoutView;
    @BindView(2131496545)
    public PullUpLayout mPullUpLayout;
    @BindView(2131495241)
    LinearLayout mRootLayout;
    @BindView(2131496140)
    LinearLayout mShareItemContainer;
    @BindView(2131494774)
    RemoteImageView mVideoCover;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58683a;

        /* renamed from: b  reason: collision with root package name */
        boolean f58684b;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f58683a, false, 63778, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58683a, false, 63778, new Class[0], Void.TYPE);
                return;
            }
            if (!this.f58684b && System.currentTimeMillis() >= PhotoUploadSuccessPopView.this.g) {
                PhotoUploadSuccessPopView.this.b();
            }
        }

        private a() {
        }

        /* synthetic */ a(PhotoUploadSuccessPopView photoUploadSuccessPopView, byte b2) {
            this();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58672a, false, 63773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58672a, false, 63773, new Class[0], Void.TYPE);
            return;
        }
        this.f58677f = false;
        b();
    }

    private boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f58672a, false, 63767, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58672a, false, 63767, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!(this.h == null || this.h.getCommerceStickerInfo() == null || !this.h.getCommerceStickerInfo().enable())) {
            z = true;
        }
        return z;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58672a, false, 63770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58672a, false, 63770, new Class[0], Void.TYPE);
            return;
        }
        IShareService iShareService = (IShareService) ServiceManager.get().getService(IShareService.class);
        ShareOrderService shareOrderService = (ShareOrderService) ServiceManager.get().getService(ShareOrderService.class);
        com.douyin.baseshare.a[] aVarArr = new com.douyin.baseshare.a[shareOrderService.getImageShareList().length];
        for (int i2 = 0; i2 < shareOrderService.getImageShareList().length; i2++) {
            aVarArr[i2] = iShareService.getShareChannel(this.f58674c, shareOrderService.getImageShareList()[i2]);
        }
        new e.a(this.f58674c, aVarArr, this.mShareItemContainer).a(this.h, this.i);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f58672a, false, 63772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58672a, false, 63772, new Class[0], Void.TYPE);
            return;
        }
        if (isShowing() && !this.f58677f) {
            if (this.f58674c != null && !this.f58674c.isFinishing()) {
                this.mPullUpLayout.a(0.0f, true);
                dismiss();
            }
            this.f58674c = null;
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131494774})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58672a, false, 63765, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58672a, false, 63765, new Class[]{View.class}, Void.TYPE);
            return;
        }
        h a2 = h.a();
        Activity activity = this.f58674c;
        a2.a(activity, j.a("aweme://aweme/detail/" + this.h.getAid()).a("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").a());
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setPublishStatus(11);
        b();
    }

    public PhotoUploadSuccessPopView(Activity activity, @NonNull Aweme aweme, @NonNull PhotoContext photoContext) {
        super(activity);
        this.h = aweme;
        this.f58675d = LayoutInflater.from(activity).inflate(C0906R.layout.ael, null, false);
        this.f58674c = activity;
        this.i = photoContext;
        ButterKnife.bind((Object) this, this.f58675d);
        if (PatchProxy.isSupport(new Object[0], this, f58672a, false, 63766, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58672a, false, 63766, new Class[0], Void.TYPE);
            return;
        }
        int statusBarHeight = UIUtils.getStatusBarHeight(GlobalContext.getContext());
        if (c()) {
            setHeight(((int) UIUtils.dip2Px(this.f58674c, 155.5f)) + statusBarHeight);
        } else {
            setHeight(((int) UIUtils.dip2Px(this.f58674c, 110.0f)) + statusBarHeight);
        }
        setWidth(UIUtils.getScreenWidth(this.f58674c));
        setContentView(this.f58675d);
        setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.f58674c.getResources(), 2130840612));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mLayoutView.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, statusBarHeight, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.mLayoutView.setLayoutParams(layoutParams);
        setAnimationStyle(C0906R.style.tw);
        setClippingEnabled(false);
        update();
        c.a(this.mVideoCover, Uri.fromFile(new File(this.i.mPhotoLocalPath)).toString());
        this.mPullUpLayout.a((View) this.mRootLayout, false);
        this.mPullUpLayout.setPullUpListener(this);
        this.mPullUpLayout.setInternalTouchEventListener(new PullUpLayout.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58678a;

            public final void a(MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f58678a, false, 63776, new Class[]{MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f58678a, false, 63776, new Class[]{MotionEvent.class}, Void.TYPE);
                    return;
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        PhotoUploadSuccessPopView.this.f58677f = true;
                        if (PhotoUploadSuccessPopView.this.f58676e != null) {
                            PhotoUploadSuccessPopView.this.f58676e.f58684b = true;
                            return;
                        }
                        break;
                    case 1:
                        PhotoUploadSuccessPopView.this.f58677f = false;
                        PhotoUploadSuccessPopView.this.g = System.currentTimeMillis() + ((long) PhotoUploadSuccessPopView.this.f58673b);
                        PhotoUploadSuccessPopView.this.f58676e.f58684b = false;
                        PhotoUploadSuccessPopView.this.f58675d.postDelayed(PhotoUploadSuccessPopView.this.f58676e, (long) PhotoUploadSuccessPopView.this.f58673b);
                        break;
                    case 2:
                        PhotoUploadSuccessPopView.this.f58677f = true;
                        return;
                }
            }
        });
        d();
        if (PatchProxy.isSupport(new Object[0], this, f58672a, false, 63768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58672a, false, 63768, new Class[0], Void.TYPE);
        } else if (c()) {
            g commerceStickerInfo = this.h.getCommerceStickerInfo();
            this.commerceView.setVisibility(0);
            this.commerceLineView.setVisibility(0);
            c.a(this.commerceIconView, commerceStickerInfo.getIconUrl(), (int) UIUtils.dip2Px(this.f58674c, 23.0f), (int) UIUtils.dip2Px(this.f58674c, 23.0f));
            this.commerceMsgView.setText(commerceStickerInfo.getLetters());
            this.commerceView.setOnClickListener(new f(commerceStickerInfo));
            r.a("show_link", (Map) d.a().a("prop_id", commerceStickerInfo.getCommerceStickerId()).a("enter_from", "release").a("link_type", "web_link").f34114b);
        } else {
            this.commerceView.setVisibility(8);
            this.commerceLineView.setVisibility(8);
            final Aweme aweme2 = this.h;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, f58672a, false, 63769, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2}, this, f58672a, false, 63769, new Class[]{Aweme.class}, Void.TYPE);
                return;
            }
            f a2 = CommerceSettingsApi.a();
            if (!(a2 == null || a2.f39380a == null || AbTestManager.a().bu() == 0)) {
                ViewGroup viewGroup = (ViewGroup) this.f58675d.findViewById(C0906R.id.c4o);
                viewGroup.setVisibility(0);
                ImageView imageView = (ImageView) this.f58675d.findViewById(C0906R.id.c4r);
                Drawable a3 = an.a(this.f58675d.getResources(), 2130840356);
                if (a3 == null) {
                    imageView.setImageResource(C0906R.color.h5);
                } else {
                    imageView.setImageDrawable(a3);
                }
                viewGroup.findViewById(C0906R.id.c4q).bringToFront();
                DmtTextView dmtTextView = (DmtTextView) viewGroup.findViewById(C0906R.id.c4t);
                if (TextUtils.isEmpty(a2.f39380a.f39386b)) {
                    dmtTextView.setVisibility(8);
                } else {
                    dmtTextView.setVisibility(0);
                    dmtTextView.setText(a2.f39380a.f39386b);
                }
                com.ss.android.ugc.aweme.commercialize.utils.e.a((RemoteImageView) viewGroup.findViewById(C0906R.id.c4s), a2.f39380a.f39385a, (ControllerListener<ImageInfo>) new BaseControllerListener<ImageInfo>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58680a;

                    public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                        ImageInfo imageInfo = (ImageInfo) obj;
                        if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f58680a, false, 63777, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f58680a, false, 63777, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        AwemeStatus status = aweme2.getStatus();
                        if (status != null) {
                            switch (status.getPrivateStatus()) {
                                case 0:
                                    hashMap.put("privacy_status", "public");
                                    break;
                                case 1:
                                    hashMap.put("privacy_status", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE);
                                    break;
                                case 2:
                                    hashMap.put("privacy_status", "friend");
                                    break;
                            }
                        }
                        hashMap.put("enter_from", "release");
                        r.a("show_ad_sticker", (Map) hashMap);
                    }
                });
                viewGroup.setOnClickListener(new g(this, aweme2, a2));
            }
        }
    }
}
