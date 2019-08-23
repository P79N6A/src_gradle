package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.k;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.presenter.w;
import com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView;
import com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView;
import com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout;
import java.util.Map;
import java.util.concurrent.Callable;

public class ProfileCoverCropActivity extends AmeSSActivity implements WeakHandler.IHandler, k, r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62085a;

    /* renamed from: b  reason: collision with root package name */
    Bitmap f62086b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f62087c;

    /* renamed from: d  reason: collision with root package name */
    boolean f62088d;

    /* renamed from: e  reason: collision with root package name */
    boolean f62089e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f62090f = new bt(this);
    public boolean g = true;
    int h;
    float i = 0.0f;
    private w j;
    private ad k;
    private int l;
    @BindView(2131497819)
    DmtTextView mCancel;
    @BindView(2131497852)
    DmtTextView mConfirm;
    @BindView(2131494996)
    PinchImageView mCoverImage;
    @BindView(2131495000)
    PreviewBoxView mCoverWindow;
    @BindView(2131493839)
    SwitchModeFrameLayout mCropContainer;
    @BindView(2131495024)
    ImageView mFakeShelter;
    @BindView(2131495025)
    View mFakeShelterTop;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497604)
    View mTitleBar;

    public final void a(boolean z) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f62085a, false, 68614, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62085a, false, 68614, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62085a, false, 68615, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62085a, false, 68615, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(Exception exc, int i2) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i2)}, this, f62085a, false, 68611, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i2)}, this, f62085a, false, 68611, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.k != null) {
            this.mStatusView.setVisibility(8);
            a.a(this, exc, C0906R.string.bsd);
        }
    }

    public final void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62085a, false, 68612, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f62085a, false, 68612, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (this.mStatusView != null) {
                this.mStatusView.b();
            }
            if (!TextUtils.isEmpty(str)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) com.ss.android.ugc.aweme.app.k.a(), str).a();
                if (z) {
                    finish();
                }
            }
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f62085a, false, 68599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62085a, false, 68599, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f62085a, false, 68613, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f62085a, false, 68613, new Class[]{Message.class}, Void.TYPE);
        } else if (message2.obj instanceof Exception) {
            a.a(this, (Exception) message2.obj, C0906R.string.bsd);
        } else {
            if (message2.obj instanceof User) {
                d.a().setCurUser((User) message2.obj);
                finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(i iVar) throws Exception {
        if (iVar.b()) {
            w wVar = this.j;
            String str = (String) iVar.e();
            if (PatchProxy.isSupport(new Object[]{str}, wVar, w.f61656a, false, 67599, new Class[]{String.class}, Void.TYPE)) {
                w wVar2 = wVar;
                PatchProxy.accessDispatch(new Object[]{str}, wVar2, w.f61656a, false, 67599, new Class[]{String.class}, Void.TYPE);
            } else {
                wVar.f61659d = str;
                wVar.a(0, str);
            }
        }
        return null;
    }

    @OnClick({2131497819, 2131497852})
    public void onViewClicked(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62085a, false, 68607, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62085a, false, 68607, new Class[]{View.class}, Void.TYPE);
        } else if (this.mCoverImage.getPinchMode() == 0) {
            int id = view.getId();
            if (id == C0906R.id.d9v) {
                finish();
                return;
            }
            if (id == C0906R.id.d_u) {
                if (this.l == 2) {
                    com.ss.android.ugc.aweme.common.r.a("replace_profile_cover_finish", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_method", "sys_album").f34114b);
                } else if (this.l == 1) {
                    com.ss.android.ugc.aweme.common.r.a("replace_profile_cover_finish", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_method", "camera").f34114b);
                }
                this.mStatusView.d();
                i.a((Callable<TResult>) new bv<TResult>(this)).a((g<TResult, TContinuationResult>) new bw<TResult,TContinuationResult>(this), i.f1052b);
            }
        }
    }

    public final void a(AvatarUri avatarUri) {
        if (PatchProxy.isSupport(new Object[]{avatarUri}, this, f62085a, false, 68608, new Class[]{AvatarUri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarUri}, this, f62085a, false, 68608, new Class[]{AvatarUri.class}, Void.TYPE);
        } else if (this.k == null || avatarUri == null) {
            this.mStatusView.setVisibility(8);
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bse).a();
        } else {
            this.k.a(avatarUri.uri, this.l);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62085a, false, 68601, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62085a, false, 68601, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.db);
        ButterKnife.bind((Activity) this);
        if (PatchProxy.isSupport(new Object[0], this, f62085a, false, 68602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62085a, false, 68602, new Class[0], Void.TYPE);
        } else {
            String stringExtra = getIntent().getStringExtra("cover_url");
            this.l = getIntent().getIntExtra("cover_source", 0);
            if (TextUtils.isEmpty(stringExtra)) {
                finish();
            } else {
                this.h = (int) (((float) UIUtils.getScreenHeight(this)) * 0.3f);
                this.f62086b = BitmapUtils.rotateBitmap(BitmapUtils.getBitmapFromSD(stringExtra, 1080, 1080), BitmapUtils.readPictureDegree(stringExtra));
                this.mCoverImage.setImageBitmap(this.f62086b);
                this.mFakeShelter.setImageResource(2130839559);
                if (!com.ss.android.g.a.a() || com.ss.android.g.a.c()) {
                    this.mFakeShelterTop.setVisibility(0);
                }
                this.mCoverWindow.setTopOffset(this.h);
                this.mCoverWindow.f63049d = new PreviewBoxView.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62091a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f62091a, false, 68620, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f62091a, false, 68620, new Class[0], Void.TYPE);
                            return;
                        }
                        ProfileCoverCropActivity.this.mFakeShelter.setAlpha(0.0f);
                        ProfileCoverCropActivity.this.mFakeShelterTop.setAlpha(0.0f);
                    }

                    public final void a(float f2) {
                        float f3;
                        int i;
                        float f4 = f2;
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f62091a, false, 68621, new Class[]{Float.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f62091a, false, 68621, new Class[]{Float.TYPE}, Void.TYPE);
                            return;
                        }
                        ProfileCoverCropActivity profileCoverCropActivity = ProfileCoverCropActivity.this;
                        if (PatchProxy.isSupport(new Object[0], profileCoverCropActivity, ProfileCoverCropActivity.f62085a, false, 68604, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], profileCoverCropActivity, ProfileCoverCropActivity.f62085a, false, 68604, new Class[0], Void.TYPE);
                        } else {
                            if (profileCoverCropActivity.i == 0.0f) {
                                if (PatchProxy.isSupport(new Object[0], profileCoverCropActivity, ProfileCoverCropActivity.f62085a, false, 68603, new Class[0], Float.TYPE)) {
                                    f3 = ((Float) PatchProxy.accessDispatch(new Object[0], profileCoverCropActivity, ProfileCoverCropActivity.f62085a, false, 68603, new Class[0], Float.TYPE)).floatValue();
                                } else {
                                    int screenWidth = UIUtils.getScreenWidth(GlobalContext.getContext());
                                    if (screenWidth * 2 <= UIUtils.getScreenHeight(GlobalContext.getContext())) {
                                        i = com.ss.android.ugc.aweme.profile.a.d(GlobalContext.getContext());
                                    } else {
                                        i = 0;
                                    }
                                    f3 = ((((float) UIUtils.getScreenWidth(GlobalContext.getContext())) / 3.0f) + (((float) i) / 2.0f)) / ((float) screenWidth);
                                }
                                profileCoverCropActivity.i = f3;
                            }
                            if (!profileCoverCropActivity.f62088d && profileCoverCropActivity.f62087c != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) profileCoverCropActivity.mFakeShelter.getLayoutParams();
                                int dip2Px = (int) UIUtils.dip2Px(profileCoverCropActivity.mCoverWindow.getContext(), 16.0f);
                                float width = (((float) profileCoverCropActivity.h) + (((float) profileCoverCropActivity.f62087c.width()) * profileCoverCropActivity.i)) - UIUtils.dip2Px(profileCoverCropActivity, 16.0f);
                                if (!com.ss.android.g.a.a() || com.ss.android.g.a.c()) {
                                    width += (((float) profileCoverCropActivity.f62087c.height()) - (((float) profileCoverCropActivity.f62087c.width()) * profileCoverCropActivity.i)) / 2.0f;
                                }
                                marginLayoutParams.setMargins(dip2Px, (int) width, dip2Px, 0);
                                profileCoverCropActivity.mFakeShelter.setLayoutParams(marginLayoutParams);
                                profileCoverCropActivity.mFakeShelter.requestLayout();
                                profileCoverCropActivity.f62088d = true;
                            }
                            if (!profileCoverCropActivity.f62089e && profileCoverCropActivity.f62087c != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) profileCoverCropActivity.mFakeShelterTop.getLayoutParams();
                                int dip2Px2 = (int) UIUtils.dip2Px(profileCoverCropActivity.mCoverWindow.getContext(), 16.0f);
                                marginLayoutParams2.height = (int) ((((float) profileCoverCropActivity.f62087c.height()) - (((float) profileCoverCropActivity.f62087c.width()) * profileCoverCropActivity.i)) / 2.0f);
                                marginLayoutParams2.setMargins(dip2Px2, profileCoverCropActivity.h, dip2Px2, 0);
                                profileCoverCropActivity.mFakeShelterTop.setLayoutParams(marginLayoutParams2);
                                profileCoverCropActivity.mFakeShelterTop.requestLayout();
                                profileCoverCropActivity.f62088d = true;
                            }
                        }
                        ProfileCoverCropActivity.this.mFakeShelter.setAlpha(f4);
                        ProfileCoverCropActivity.this.mFakeShelterTop.setAlpha(f4 / 2.0f);
                    }
                };
                this.mCropContainer.setIntercepter(new SwitchModeFrameLayout.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62093a;

                    public final void a(MotionEvent motionEvent) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f62093a, false, 68622, new Class[]{MotionEvent.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f62093a, false, 68622, new Class[]{MotionEvent.class}, Void.TYPE);
                            return;
                        }
                        if (motionEvent.getAction() == 0) {
                            ProfileCoverCropActivity.this.mCoverWindow.b();
                            if (ProfileCoverCropActivity.this.g) {
                                ProfileCoverCropActivity.this.mCoverWindow.removeCallbacks(ProfileCoverCropActivity.this.f62090f);
                                ProfileCoverCropActivity.this.g = false;
                            }
                        } else if (motionEvent.getAction() == 1) {
                            if (ProfileCoverCropActivity.this.f62087c == null) {
                                ProfileCoverCropActivity.this.f62087c = ProfileCoverCropActivity.this.mCoverWindow.getVisibleRect();
                            }
                            ProfileCoverCropActivity.this.mCoverWindow.a();
                        }
                    }
                });
                this.mCoverWindow.addOnLayoutChangeListener(new bu(this));
                this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this));
                this.mCoverWindow.postDelayed(this.f62090f, 1000);
            }
        }
        this.j = new w();
        this.j.f61658c = this;
        this.k = new ad();
        this.k.h = this;
        if (PatchProxy.isSupport(new Object[0], this, f62085a, false, 68600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62085a, false, 68600, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 19) {
            ((ViewGroup.MarginLayoutParams) this.mTitleBar.getLayoutParams()).topMargin = StatusBarUtils.getStatusBarHeight(this);
            this.mTitleBar.requestLayout();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onCreate", false);
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f62085a, false, 68609, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f62085a, false, 68609, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.setVisibility(8);
            a.a(this, exc, C0906R.string.bse);
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        }
    }

    public final void a(User user, int i2) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, f62085a, false, 68610, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, f62085a, false, 68610, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            com.bytedance.ies.dmt.ui.d.a.a(GlobalContext.getContext(), (int) C0906R.string.bs9).a();
            this.mStatusView.setVisibility(8);
            d.a().queryUser(new WeakHandler(Looper.getMainLooper(), this));
        }
    }

    public static void a(Context context, String str, int i2) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Integer.valueOf(i2)}, null, f62085a, true, 68598, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, Integer.valueOf(i2)}, null, f62085a, true, 68598, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, ProfileCoverCropActivity.class);
        intent.putExtra("cover_url", str2);
        intent.putExtra("cover_source", i2);
        context2.startActivity(intent);
    }
}
