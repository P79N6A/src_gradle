package com.ss.android.ugc.aweme.bizactivity;

import android.app.Activity;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.bizactivity.h;
import com.ss.android.ugc.aweme.feed.f.p;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.greenrobot.eventbus.c;

public class BizActivityFloatDialogHelper implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35208a;

    /* renamed from: b  reason: collision with root package name */
    public h.a f35209b;

    /* renamed from: c  reason: collision with root package name */
    int f35210c = -1;

    /* renamed from: d  reason: collision with root package name */
    View f35211d;
    @BindView(2131493984)
    AnimateDraweeView displayIv;

    /* renamed from: e  reason: collision with root package name */
    ConstraintLayout f35212e;

    /* renamed from: f  reason: collision with root package name */
    Activity f35213f;
    @BindView(2131494346)
    AnimateDraweeView foldIv;
    public m g;
    View.OnClickListener h = new a(this);
    private final int i = -1;
    private final int j = 1;
    private final int k = 2;
    private final int l = 3;
    private final int m = -1;
    private final int n = 1;
    private final int o = 2;
    private BizActivityViewModel p;
    private Observer<g> q = new Observer<g>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35214a;

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            int i;
            g gVar = (g) obj;
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f35214a, false, 25691, new Class[]{g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f35214a, false, 25691, new Class[]{g.class}, Void.TYPE);
                return;
            }
            if (gVar == null) {
                BizActivityFloatDialogHelper.this.f35209b = null;
                i = -1;
            } else {
                i = gVar.f35230a;
                BizActivityFloatDialogHelper.this.f35209b = gVar.f35231b;
            }
            if (i != -2) {
                if (i == -1 || BizActivityFloatDialogHelper.this.f35209b == null) {
                    BizActivityFloatDialogHelper.this.dismiss();
                    BizActivityFloatDialogHelper.this.g.a(false);
                } else if (i == 1) {
                    BizActivityFloatDialogHelper bizActivityFloatDialogHelper = BizActivityFloatDialogHelper.this;
                    if (PatchProxy.isSupport(new Object[0], bizActivityFloatDialogHelper, BizActivityFloatDialogHelper.f35208a, false, 25682, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bizActivityFloatDialogHelper, BizActivityFloatDialogHelper.f35208a, false, 25682, new Class[0], Void.TYPE);
                    } else if (!bizActivityFloatDialogHelper.f35213f.isFinishing() && bizActivityFloatDialogHelper.f35209b != null) {
                        if (bizActivityFloatDialogHelper.f35211d == null) {
                            bizActivityFloatDialogHelper.f35211d = View.inflate(bizActivityFloatDialogHelper.f35213f, C0906R.layout.a3q, null);
                            ButterKnife.bind((Object) bizActivityFloatDialogHelper, bizActivityFloatDialogHelper.f35211d);
                            View.OnClickListener onClickListener = bizActivityFloatDialogHelper.h;
                            View[] viewArr = {bizActivityFloatDialogHelper.f35211d, bizActivityFloatDialogHelper.foldIv, bizActivityFloatDialogHelper.unfoldIv, bizActivityFloatDialogHelper.displayIv};
                            for (int i2 = 0; i2 < 4; i2++) {
                                viewArr[i2].setOnClickListener(onClickListener);
                            }
                            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams((int) UIUtils.dip2Px(bizActivityFloatDialogHelper.f35213f, 100.0f), (int) UIUtils.dip2Px(bizActivityFloatDialogHelper.f35213f, 120.0f));
                            layoutParams.topToTop = 0;
                            layoutParams.topMargin = (int) UIUtils.dip2Px(bizActivityFloatDialogHelper.f35213f, 74.0f);
                            bizActivityFloatDialogHelper.f35211d.setLayoutParams(layoutParams);
                            bizActivityFloatDialogHelper.f35212e.addView(bizActivityFloatDialogHelper.f35211d);
                        }
                        bizActivityFloatDialogHelper.f35212e.setVisibility(0);
                        if (PatchProxy.isSupport(new Object[0], bizActivityFloatDialogHelper, BizActivityFloatDialogHelper.f35208a, false, 25681, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], bizActivityFloatDialogHelper, BizActivityFloatDialogHelper.f35208a, false, 25681, new Class[0], Void.TYPE);
                        } else {
                            int c2 = bizActivityFloatDialogHelper.c();
                            if (c2 == 1) {
                                if (bizActivityFloatDialogHelper.g.a()) {
                                    bizActivityFloatDialogHelper.dismiss();
                                } else if (bizActivityFloatDialogHelper.f35210c != 2) {
                                    bizActivityFloatDialogHelper.displayIv.a(bizActivityFloatDialogHelper.f35209b.g, true, Bitmap.Config.ARGB_8888);
                                    bizActivityFloatDialogHelper.f35212e.setVisibility(0);
                                    bizActivityFloatDialogHelper.unfoldIv.setVisibility(8);
                                    bizActivityFloatDialogHelper.foldIv.setVisibility(8);
                                    bizActivityFloatDialogHelper.displayIv.setVisibility(0);
                                    bizActivityFloatDialogHelper.f35210c = 2;
                                }
                            } else if (c2 == 2) {
                                if (!(bizActivityFloatDialogHelper.f35210c == 1 || bizActivityFloatDialogHelper.f35210c == 0)) {
                                    bizActivityFloatDialogHelper.unfoldIv.a(bizActivityFloatDialogHelper.f35209b.f35238f, true, Bitmap.Config.ARGB_8888);
                                    bizActivityFloatDialogHelper.foldIv.a(bizActivityFloatDialogHelper.f35209b.f35237e, true, Bitmap.Config.ARGB_8888);
                                    bizActivityFloatDialogHelper.f35212e.setVisibility(0);
                                    bizActivityFloatDialogHelper.foldIv.setVisibility(8);
                                    bizActivityFloatDialogHelper.displayIv.setVisibility(8);
                                    bizActivityFloatDialogHelper.unfoldIv.setVisibility(0);
                                    bizActivityFloatDialogHelper.f35210c = 0;
                                }
                            } else if (c2 == 3 || c2 == -1) {
                                bizActivityFloatDialogHelper.dismiss();
                                bizActivityFloatDialogHelper.g.a(false);
                            }
                        }
                    }
                } else if (i == 2 && BizActivityFloatDialogHelper.this.f35209b.f35234b != 0) {
                    BizActivityFloatDialogHelper.this.b();
                }
            }
            c.a().d(new p());
        }
    };
    @BindView(2131498307)
    AnimateDraweeView unfoldIv;

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    /* access modifiers changed from: package-private */
    public int c() {
        if (this.f35209b == null) {
            return -1;
        }
        if (this.f35209b.i) {
            return 3;
        }
        if (this.f35209b.f35235c > 0 && this.f35209b.h) {
            return 1;
        }
        if (this.f35209b.f35235c != 0 || !this.f35209b.h) {
            return -1;
        }
        return 2;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35208a, false, 25678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35208a, false, 25678, new Class[0], Void.TYPE);
            return;
        }
        if (c() == 2) {
            this.unfoldIv.setTranslationX(0.0f);
            this.unfoldIv.animate().translationX((float) (-this.unfoldIv.getMeasuredWidth())).withEndAction(new b(this));
            this.f35210c = 1;
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f35208a, false, 25683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35208a, false, 25683, new Class[0], Void.TYPE);
        } else if (!this.f35213f.isFinishing()) {
            this.f35212e.setVisibility(8);
            if (this.f35211d != null && this.displayIv != null) {
                this.displayIv.setVisibility(8);
                this.foldIv.setVisibility(8);
                this.unfoldIv.setVisibility(8);
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35208a, false, 25679, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35208a, false, 25679, new Class[0], Void.TYPE);
            return;
        }
        if (this.f35209b.f35234b == 0) {
            BizActivityViewModel bizActivityViewModel = this.p;
            if (PatchProxy.isSupport(new Object[]{2}, bizActivityViewModel, BizActivityViewModel.f2797a, false, 25698, new Class[]{Integer.TYPE}, Void.TYPE)) {
                BizActivityViewModel bizActivityViewModel2 = bizActivityViewModel;
                PatchProxy.accessDispatch(new Object[]{2}, bizActivityViewModel2, BizActivityViewModel.f2797a, false, 25698, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                if (bizActivityViewModel.f2799c == null) {
                    bizActivityViewModel.f2799c = (BizActivityApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(BizActivityApi.class);
                }
                bizActivityViewModel.a(2);
            }
        } else {
            User user = new User();
            user.roomId = this.f35209b.f35234b;
            BizActivityViewModel bizActivityViewModel3 = this.p;
            if (PatchProxy.isSupport(new Object[0], bizActivityViewModel3, BizActivityViewModel.f2797a, false, 25696, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bizActivityViewModel3, BizActivityViewModel.f2797a, false, 25696, new Class[0], Void.TYPE);
            } else {
                bg.c(bizActivityViewModel3);
            }
            com.ss.android.ugc.aweme.story.live.c.a().a((Context) this.f35213f, user, (Rect) null, "activity_entrance");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view) {
        int id = view.getId();
        if (id == C0906R.id.a5o) {
            if (c() == 1) {
                view.animate().translationX((float) (-view.getMeasuredWidth())).withEndAction(new c(this)).start();
                String str = this.f35209b.f35233a;
                try {
                    str = URLEncoder.encode(this.f35209b.f35233a, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                }
                this.f35213f.startActivity(f.f34171e.a((Context) this.f35213f, Uri.parse("aweme://webview/?url=" + str)));
                this.g.a(true);
                this.f35210c = 2;
            } else if (c() == 2) {
                this.displayIv.setVisibility(8);
                this.unfoldIv.setVisibility(0);
                this.f35210c = 1;
                b();
            }
        } else if (id == C0906R.id.agp) {
            if (c() == 2) {
                this.foldIv.animate().translationX((float) (-this.foldIv.getMeasuredWidth())).withEndAction(new d(this)).start();
                this.f35210c = 0;
            }
        } else if (id == C0906R.id.do1) {
            a();
            b();
        }
    }
}
