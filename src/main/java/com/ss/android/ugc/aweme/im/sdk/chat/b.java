package com.ss.android.ugc.aweme.im.sdk.chat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IFollowService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra;
import com.ss.android.ugc.aweme.im.sdk.model.d;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.c;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50277a;

    /* renamed from: b  reason: collision with root package name */
    public int f50278b = 120;

    /* renamed from: c  reason: collision with root package name */
    public String f50279c = "";

    /* renamed from: d  reason: collision with root package name */
    public int f50280d = 8;

    /* renamed from: e  reason: collision with root package name */
    public View f50281e;

    /* renamed from: f  reason: collision with root package name */
    public View f50282f;
    public TextView g;
    public IMUser h;
    public String i;
    public boolean j;
    public int k;
    private View.OnClickListener l;
    private View m;

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50277a, false, 50271, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f50277a, false, 50271, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f50279c = str;
        this.g.setText(C0906R.string.ark);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f50277a, false, 50272, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f50277a, false, 50272, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f50280d != i2) {
            this.f50280d = i2;
            if (i2 == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) this.f50278b});
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50283a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f50283a, false, 50279, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f50283a, false, 50279, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int i = (int) floatValue;
                        b.this.k = i;
                        b.this.f50281e.getLayoutParams().height = i;
                        b.this.f50281e.setAlpha(floatValue / ((float) b.this.f50278b));
                        b.this.f50281e.requestLayout();
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50285a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f50285a, false, 50281, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f50285a, false, 50281, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationEnd(animator);
                        b.this.k = b.this.f50278b;
                        b.this.f50281e.setAlpha(1.0f);
                        b.this.f50281e.getLayoutParams().height = b.this.f50278b;
                        b.this.f50281e.requestLayout();
                    }

                    public final void onAnimationStart(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f50285a, false, 50280, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f50285a, false, 50280, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationStart(animator);
                        b.this.f50281e.setAlpha(0.0f);
                        b.this.f50281e.setVisibility(0);
                    }
                });
                ofFloat.start();
                return;
            }
            if (i2 == 8) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(float) this.f50278b, 0.0f});
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50287a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f50287a, false, 50282, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f50287a, false, 50282, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int i = (int) floatValue;
                        b.this.k = i;
                        b.this.f50281e.getLayoutParams().height = i;
                        b.this.f50281e.setAlpha(floatValue / ((float) b.this.f50278b));
                        b.this.f50281e.requestLayout();
                    }
                });
                ofFloat2.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50289a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f50289a, false, 50284, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f50289a, false, 50284, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationEnd(animator);
                        b.this.f50281e.setAlpha(0.0f);
                        b.this.f50281e.getLayoutParams().height = 0;
                        b.this.k = 0;
                        b.this.f50281e.setVisibility(8);
                    }

                    public final void onAnimationStart(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f50289a, false, 50283, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f50289a, false, 50283, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationStart(animator);
                        b.this.f50281e.setAlpha(1.0f);
                        b.this.f50281e.setVisibility(0);
                    }
                });
                ofFloat2.start();
            }
        }
    }

    public b(View view, IMUser iMUser) {
        this.m = view;
        if (PatchProxy.isSupport(new Object[0], this, f50277a, false, 50274, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50277a, false, 50274, new Class[0], Void.TYPE);
        } else {
            this.f50278b = (int) UIUtils.dip2Px(this.m.getContext(), 60.0f);
            if (PatchProxy.isSupport(new Object[0], this, f50277a, false, 50275, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50277a, false, 50275, new Class[0], Void.TYPE);
            } else {
                this.f50281e = this.m.findViewById(C0906R.id.ah0);
                this.g = (TextView) this.f50281e.findViewById(C0906R.id.agr);
                this.f50282f = this.f50281e.findViewById(C0906R.id.ts);
            }
            if (PatchProxy.isSupport(new Object[0], this, f50277a, false, 50276, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50277a, false, 50276, new Class[0], Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f50277a, false, 50277, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50277a, false, 50277, new Class[0], Void.TYPE);
                } else if (this.l == null) {
                    this.l = new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f50293a;

                        public final void onClick(View view) {
                            ContentValues contentValues;
                            View view2 = view;
                            if (PatchProxy.isSupport(new Object[]{view2}, this, f50293a, false, 50286, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view2}, this, f50293a, false, 50286, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (view2.equals(b.this.g)) {
                                b bVar = b.this;
                                if (PatchProxy.isSupport(new Object[0], bVar, b.f50277a, false, 50278, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], bVar, b.f50277a, false, 50278, new Class[0], Void.TYPE);
                                } else {
                                    if (bVar.j) {
                                        if (!m.b()) {
                                            z a2 = z.a();
                                            String str = bVar.i;
                                            if (PatchProxy.isSupport(new Object[]{str}, a2, z.f52670a, false, 53560, new Class[]{String.class}, Void.TYPE)) {
                                                z zVar = a2;
                                                PatchProxy.accessDispatch(new Object[]{str}, zVar, z.f52670a, false, 53560, new Class[]{String.class}, Void.TYPE);
                                            } else {
                                                JSONObject jSONObject = new JSONObject();
                                                try {
                                                    jSONObject.put("enter_from", "token");
                                                } catch (JSONException unused) {
                                                }
                                                r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("chat").setValue(str).setJsonObject(jSONObject));
                                            }
                                        }
                                        z a3 = z.a();
                                        String str2 = bVar.i;
                                        if (PatchProxy.isSupport(new Object[]{str2}, a3, z.f52670a, false, 53559, new Class[]{String.class}, Void.TYPE)) {
                                            z zVar2 = a3;
                                            PatchProxy.accessDispatch(new Object[]{str2}, zVar2, z.f52670a, false, 53559, new Class[]{String.class}, Void.TYPE);
                                        } else {
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("enter_from", "chat");
                                            hashMap.put("previous_page", "token");
                                            hashMap.put("from_user_id", str2);
                                            hashMap.put("previous_page_position", "other_places");
                                            hashMap.put("enter_method", "follow_button");
                                            if (!m.b()) {
                                                hashMap.put("_staging_flag", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                            }
                                            r.a("follow", (Map) hashMap);
                                        }
                                    } else {
                                        if (!m.b()) {
                                            z a4 = z.a();
                                            String str3 = bVar.f50279c;
                                            if (PatchProxy.isSupport(new Object[]{str3}, a4, z.f52670a, false, 53562, new Class[]{String.class}, Void.TYPE)) {
                                                z zVar3 = a4;
                                                PatchProxy.accessDispatch(new Object[]{str3}, zVar3, z.f52670a, false, 53562, new Class[]{String.class}, Void.TYPE);
                                            } else {
                                                JSONObject jSONObject2 = new JSONObject();
                                                try {
                                                    jSONObject2.put("enter_from", "message");
                                                } catch (JSONException unused2) {
                                                }
                                                r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("chat").setValue(str3).setJsonObject(jSONObject2));
                                            }
                                        }
                                        z a5 = z.a();
                                        String str4 = bVar.f50279c;
                                        if (PatchProxy.isSupport(new Object[]{str4}, a5, z.f52670a, false, 53561, new Class[]{String.class}, Void.TYPE)) {
                                            z zVar4 = a5;
                                            PatchProxy.accessDispatch(new Object[]{str4}, zVar4, z.f52670a, false, 53561, new Class[]{String.class}, Void.TYPE);
                                        } else {
                                            HashMap hashMap2 = new HashMap();
                                            hashMap2.put("enter_from", "chat");
                                            hashMap2.put("previous_page", "message");
                                            hashMap2.put("from_user_id", str4);
                                            hashMap2.put("previous_page_position", "other_places");
                                            hashMap2.put("enter_method", "follow_button");
                                            if (!m.b()) {
                                                hashMap2.put("_staging_flag", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                            }
                                            r.a("follow", (Map) hashMap2);
                                        }
                                    }
                                    ((IFollowService) ServiceManager.get().getService(IFollowService.class)).sendRequest(bVar.f50279c, 1, new IFollowService.IFollowCallback() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f50295a;

                                        public final void onFollowSuccess() {
                                            if (PatchProxy.isSupport(new Object[0], this, f50295a, false, 50287, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], this, f50295a, false, 50287, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            b bVar = b.this;
                                            if (PatchProxy.isSupport(new Object[0], bVar, b.f50277a, false, 50273, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], bVar, b.f50277a, false, 50273, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            a.b(new Runnable() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f50291a;

                                                public final void run() {
                                                    if (PatchProxy.isSupport(new Object[0], this, f50291a, false, 50285, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], this, f50291a, false, 50285, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    b.this.g.setText(C0906R.string.arp);
                                                    b.this.a(8);
                                                    c.a().d(new d(b.this.f50279c));
                                                }
                                            });
                                        }

                                        public final void onFollowFailed(Exception exc) {
                                            if (PatchProxy.isSupport(new Object[]{exc}, this, f50295a, false, 50288, new Class[]{Exception.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{exc}, this, f50295a, false, 50288, new Class[]{Exception.class}, Void.TYPE);
                                                return;
                                            }
                                            Context context = b.this.f50281e.getContext();
                                            String string = context.getString(C0906R.string.ara);
                                            if (!NetworkUtils.isNetworkAvailable(b.this.f50281e.getContext())) {
                                                string = context.getString(C0906R.string.bgf);
                                            } else if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                                                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
                                                if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                                                    string = aVar.getErrorMsg();
                                                }
                                            }
                                            UIUtils.displayToast(b.this.f50281e.getContext(), string);
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("service", "follow_failed");
                                                jSONObject.put("error", exc.toString());
                                                com.bytedance.im.core.c.d.a("chat_room", "follow_failed", jSONObject);
                                            } catch (JSONException unused) {
                                            }
                                        }
                                    });
                                }
                            } else if (view2.equals(b.this.f50282f)) {
                                UserExtra userExtra = new UserExtra(b.this.h.getUid(), true, false);
                                com.ss.android.ugc.aweme.im.sdk.h.c.b a6 = com.ss.android.ugc.aweme.im.sdk.h.c.b.a();
                                if (PatchProxy.isSupport(new Object[]{userExtra}, a6, com.ss.android.ugc.aweme.im.sdk.h.c.b.f51686a, false, 53276, new Class[]{UserExtra.class}, Boolean.TYPE)) {
                                    com.ss.android.ugc.aweme.im.sdk.h.c.b bVar2 = a6;
                                    ((Boolean) PatchProxy.accessDispatch(new Object[]{userExtra}, bVar2, com.ss.android.ugc.aweme.im.sdk.h.c.b.f51686a, false, 53276, new Class[]{UserExtra.class}, Boolean.TYPE)).booleanValue();
                                } else {
                                    if (PatchProxy.isSupport(new Object[]{userExtra}, a6, com.ss.android.ugc.aweme.im.sdk.h.c.b.f51686a, false, 53278, new Class[]{UserExtra.class}, ContentValues.class)) {
                                        com.ss.android.ugc.aweme.im.sdk.h.c.b bVar3 = a6;
                                        contentValues = (ContentValues) PatchProxy.accessDispatch(new Object[]{userExtra}, bVar3, com.ss.android.ugc.aweme.im.sdk.h.c.b.f51686a, false, 53278, new Class[]{UserExtra.class}, ContentValues.class);
                                    } else {
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put(com.ss.android.ugc.aweme.im.sdk.h.b.b.COLUMN_UID.key, userExtra.getUid());
                                        contentValues2.put(com.ss.android.ugc.aweme.im.sdk.h.b.b.COLUMN_IS_DISABLE_SHOW_FOLLOW_BAR.key, Integer.valueOf(userExtra.getIsDisableShowFollowBar() ? 1 : 0));
                                        contentValues2.put(com.ss.android.ugc.aweme.im.sdk.h.b.b.COLUMN_IS_SAY_HELLO_LOGGER.key, Integer.valueOf(userExtra.getIsSayHelloLogger() ? 1 : 0));
                                        contentValues = contentValues2;
                                    }
                                    int i = (com.ss.android.ugc.aweme.im.sdk.h.a.b.a().a("USER_EXTRA", (String) null, contentValues) > 0 ? 1 : (com.ss.android.ugc.aweme.im.sdk.h.a.b.a().a("USER_EXTRA", (String) null, contentValues) == 0 ? 0 : -1));
                                }
                                b.this.a(8);
                            }
                        }
                    };
                }
                this.g.setOnClickListener(this.l);
                this.f50282f.setOnClickListener(this.l);
                au.a(this.g);
            }
        }
        this.h = iMUser;
    }
}
