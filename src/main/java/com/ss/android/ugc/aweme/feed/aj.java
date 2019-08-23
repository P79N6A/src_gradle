package com.ss.android.ugc.aweme.feed;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.discover.hitrank.f;
import com.ss.android.ugc.aweme.feed.f.al;
import com.ss.android.ugc.aweme.feed.widget.g;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45001a;

    /* renamed from: b  reason: collision with root package name */
    public IShareService.ShareStruct f45002b;

    /* renamed from: c  reason: collision with root package name */
    public IShareService.SharePage f45003c;

    /* renamed from: d  reason: collision with root package name */
    public View f45004d;

    /* renamed from: e  reason: collision with root package name */
    public View f45005e;

    /* renamed from: f  reason: collision with root package name */
    public View f45006f;
    public View g;
    public View h;
    public View i;
    public RemoteImageView j;
    public DmtTextView k;
    public DmtTextView l;
    public DmtEditText m;
    public View.OnClickListener n;
    public View.OnTouchListener o;
    public g p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    private ValueAnimator.AnimatorUpdateListener x;
    private AnimatorListenerAdapter y;
    private String z = GlobalContext.getContext().getResources().getString(C0906R.string.b4d);

    public final boolean a() {
        if (this.f45004d == null) {
            return true;
        }
        return false;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f45001a, false, 40217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45001a, false, 40217, new Class[0], Void.TYPE);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.m.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.m.getWindowToken(), 2);
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f45001a, false, 40215, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45001a, false, 40215, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f45005e == null || this.f45005e.getVisibility() == 8) {
            return false;
        } else {
            a(false);
            a(0);
            return true;
        }
    }

    private void d() {
        ValueAnimator valueAnimator;
        if (PatchProxy.isSupport(new Object[0], this, f45001a, false, 40219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45001a, false, 40219, new Class[0], Void.TYPE);
        } else if (a()) {
            e();
        } else {
            if (this.t) {
                this.u = this.f45004d.getHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45004d.getLayoutParams();
                this.v = marginLayoutParams.topMargin;
                this.w = marginLayoutParams.bottomMargin;
                valueAnimator = ValueAnimator.ofFloat(new float[]{(float) this.u, 0.0f});
                this.k.setVisibility(8);
                this.l.setVisibility(0);
            } else {
                valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, (float) this.u});
                this.k.setVisibility(0);
                this.l.setVisibility(8);
            }
            valueAnimator.setDuration(150);
            valueAnimator.addListener(this.y);
            valueAnimator.addUpdateListener(this.x);
            valueAnimator.start();
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f45001a, false, 40220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45001a, false, 40220, new Class[0], Void.TYPE);
        } else if (this.t) {
            this.f45005e.setVisibility(0);
            this.f45006f.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            this.f45005e.setAlpha(1.0f);
            if (this.h != null) {
                this.h.setVisibility(8);
            }
            IIMService a2 = b.a(false);
            if (a2 != null) {
                a2.setImage(this.j, this.f45002b);
            }
        } else {
            this.f45005e.setVisibility(8);
            if (!this.q) {
                this.f45006f.setVisibility(0);
            }
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            if (this.h != null) {
                this.h.setVisibility(0);
            }
            c();
        }
    }

    public aj(IShareService.ShareStruct shareStruct) {
        this.f45002b = shareStruct;
        if (PatchProxy.isSupport(new Object[0], this, f45001a, false, 40221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45001a, false, 40221, new Class[0], Void.TYPE);
            return;
        }
        this.y = new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45016a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f45016a, false, 40230, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f45016a, false, 40230, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                if (aj.this.t) {
                    aj.this.f45006f.setVisibility(8);
                    IIMService a2 = b.a(false);
                    if (a2 != null) {
                        a2.setImage(aj.this.j, aj.this.f45002b);
                    }
                    return;
                }
                aj.this.f45005e.setVisibility(8);
                aj.this.c();
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f45016a, false, 40229, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f45016a, false, 40229, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationStart(animator);
                if (aj.this.t) {
                    aj.this.f45005e.setVisibility(0);
                    if (aj.this.h != null) {
                        aj.this.h.setVisibility(8);
                    }
                } else {
                    aj.this.c();
                    if (!aj.this.q) {
                        aj.this.f45006f.setVisibility(0);
                    }
                    if (aj.this.h != null) {
                        aj.this.h.setVisibility(0);
                    }
                }
            }
        };
        this.x = new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45018a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f45018a, false, 40231, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f45018a, false, 40231, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f2 = floatValue / ((float) aj.this.u);
                if (!aj.this.a()) {
                    aj.this.f45004d.getLayoutParams().height = (int) floatValue;
                    aj.this.f45004d.setAlpha(f2);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aj.this.f45004d.getLayoutParams();
                    marginLayoutParams.topMargin = (int) (((float) aj.this.v) * f2);
                    marginLayoutParams.bottomMargin = (int) (((float) aj.this.w) * f2);
                    aj.this.f45004d.requestLayout();
                }
                aj.this.f45005e.setAlpha(1.0f - f2);
                aj.this.f45006f.setAlpha(f2);
            }
        };
        this.n = new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45020a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f45020a, false, 40232, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f45020a, false, 40232, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (aj.this.p != null) {
                    aj.this.p.a();
                }
                aj.this.c();
                IIMService a2 = b.a(false);
                if (a2 != null) {
                    a2.sendMutilMsg(aj.this.m.getText().toString(), aj.this.g);
                    if (aj.this.f45002b != null) {
                        HashMap<String, String> hashMap = aj.this.f45002b.extraParams;
                        if (hashMap != null && TextUtils.equals(hashMap.get("is_star"), PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                            f.f42393c.a(aj.this.f45002b.authorId, 3);
                        }
                    }
                }
            }
        };
        this.o = new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45022a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f45022a, false, 40233, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f45022a, false, 40233, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        };
    }

    public final void a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f45001a, false, 40213, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f45001a, false, 40213, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.r) {
            if (((Boolean) x.a().X().c()).booleanValue()) {
                a.a(GlobalContext.getContext(), (int) C0906R.string.sx).a();
                x a2 = x.a();
                if (PatchProxy.isSupport(new Object[]{(byte) 0}, a2, x.f2698a, false, 22432, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    x xVar = a2;
                    PatchProxy.accessDispatch(new Object[]{(byte) 0}, xVar, x.f2698a, false, 22432, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    a2.X().a(Boolean.FALSE);
                }
            }
            if (i3 <= 0) {
                this.f45003c.setCancelable(true);
                this.t = false;
                d();
            } else if (this.f45005e.getVisibility() != 0) {
                this.f45003c.setCancelable(false);
                this.t = true;
                d();
            } else if (i3 == 1) {
                this.l.setText(this.z);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.z);
                sb.append("(");
                sb.append(i3);
                sb.append(")");
                this.l.setText(sb);
            }
        }
    }

    public final void a(IShareService.ShareStruct shareStruct) {
        String str;
        if (PatchProxy.isSupport(new Object[]{shareStruct}, this, f45001a, false, 40214, new Class[]{IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct}, this, f45001a, false, 40214, new Class[]{IShareService.ShareStruct.class}, Void.TYPE);
            return;
        }
        if (shareStruct != null) {
            if (shareStruct.extraParams == null) {
                shareStruct.extraParams = new HashMap<>();
            }
            HashMap<String, String> hashMap = shareStruct.extraParams;
            if (PatchProxy.isSupport(new Object[0], this, f45001a, false, 40216, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, f45001a, false, 40216, new Class[0], String.class);
            } else if (this.m != null) {
                str = this.m.getText().toString();
            } else {
                str = "";
            }
            hashMap.put("multi_share_msg", str);
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f45001a, false, 40218, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f45001a, false, 40218, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.r) {
            IIMService a2 = b.a(false);
            if (a2 != null) {
                a2.resetShareHeadListView(this.g);
            }
            this.t = true;
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            if (z2) {
                this.m.setText("");
            }
            this.f45005e.setAlpha(0.0f);
            if (!this.q) {
                this.f45006f.setAlpha(1.0f);
                this.f45006f.setVisibility(0);
            } else {
                this.f45006f.setVisibility(8);
            }
            this.f45005e.setVisibility(8);
            if (!a()) {
                this.f45004d.setAlpha(1.0f);
                this.f45004d.getLayoutParams().height = this.u;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45004d.getLayoutParams();
                marginLayoutParams.topMargin = this.v;
                marginLayoutParams.bottomMargin = this.w;
                this.f45004d.requestLayout();
            }
        }
    }

    public static void a(ViewGroup viewGroup, SparseArray<Integer> sparseArray) {
        ViewGroup viewGroup2 = viewGroup;
        SparseArray<Integer> sparseArray2 = sparseArray;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, sparseArray2}, null, f45001a, true, 40224, new Class[]{ViewGroup.class, SparseArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, sparseArray2}, null, f45001a, true, 40224, new Class[]{ViewGroup.class, SparseArray.class}, Void.TYPE);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup2.getChildAt(i2);
            childAt.setVisibility(sparseArray2.get(childAt.getId()).intValue());
        }
        bg.a(new al());
    }
}
