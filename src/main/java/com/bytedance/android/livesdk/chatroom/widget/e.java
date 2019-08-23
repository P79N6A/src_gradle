package com.bytedance.android.livesdk.chatroom.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdkapi.depend.model.live.c;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
public final class e extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13474a;
    private int A;
    private boolean B;
    private Rect C = new Rect();
    private Rect D = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public c f13475b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f13476c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f13477d;

    /* renamed from: e  reason: collision with root package name */
    public int f13478e;

    /* renamed from: f  reason: collision with root package name */
    public int f13479f;
    public int g;
    public int h;
    public int i;
    public int j;
    public String k;
    public a l;
    int[] m = new int[2];
    int[] n = new int[2];
    private ImageView o;
    private Button p;
    private View q;
    private View r;
    private View s;
    private View t;
    private float u;
    private float v;
    private float w;
    private float x;
    private boolean y;
    private boolean z;

    public interface a {
        void a(boolean z);

        void b(c cVar);

        void c(String str);

        void g();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final int getType() {
        return this.f13475b.g;
    }

    public final c getRoomDecoration() {
        this.f13475b.k = this.i;
        this.f13475b.l = this.j;
        return this.f13475b;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13474a, false, 7821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13474a, false, 7821, new Class[0], Void.TYPE);
        } else if (this.q != null) {
            this.q.setVisibility(4);
            this.q.setAlpha(1.0f);
        }
    }

    public final JSONObject getDecorationInfo() {
        if (PatchProxy.isSupport(new Object[0], this, f13474a, false, 7824, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f13474a, false, 7824, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", String.valueOf(this.f13475b.h));
            jSONObject.put(PushConstants.CONTENT, this.k);
            jSONObject.put("x", this.f13475b.i);
            jSONObject.put("y", this.f13475b.j);
            jSONObject.put("w", this.i);
            jSONObject.put("h", this.j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13474a, false, 7816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13474a, false, 7816, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (PatchProxy.isSupport(new Object[0], this, f13474a, false, 7817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13474a, false, 7817, new Class[0], Void.TYPE);
        } else if (this.f13475b.f18714a != null && this.f13475b.f18714a.getUrls() != null && this.f13475b.f18714a.getUrls().size() != 0) {
            String str = null;
            Iterator<String> it2 = this.f13475b.f18714a.getUrls().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (!TextUtils.isEmpty(next)) {
                    str = next;
                    break;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                b.a(this.o, this.f13475b.f18714a, (q.a) new q.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f13480a;

                    /* renamed from: c  reason: collision with root package name */
                    private boolean f13482c;

                    public final void a(ImageModel imageModel) {
                    }

                    public final void a(ImageModel imageModel, Exception exc) {
                    }

                    public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                        int i3;
                        int i4;
                        float f2;
                        if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f13480a, false, 7830, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f13480a, false, 7830, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                        } else if (!this.f13482c) {
                            this.f13482c = true;
                            e.this.f13478e = (int) UIUtils.dip2Px(e.this.getContext(), ((float) i) / 2.0f);
                            e.this.f13479f = (int) UIUtils.dip2Px(e.this.getContext(), ((float) i2) / 2.0f);
                            e.this.g = e.this.f13478e / 2;
                            e.this.h = e.this.f13479f / 2;
                            ViewGroup.LayoutParams layoutParams = e.this.getLayoutParams();
                            layoutParams.width = e.this.f13478e;
                            layoutParams.height = e.this.f13479f;
                            e.this.setLayoutParams(layoutParams);
                            if (e.this.f13475b.i == -1 && e.this.f13475b.j == -1) {
                                i4 = (e.this.i / 2) - e.this.g;
                                i3 = (e.this.j / 3) - e.this.h;
                            } else {
                                float f3 = 1.0f;
                                if (e.this.f13475b.k > 0) {
                                    f2 = ((float) e.this.i) / ((float) e.this.f13475b.k);
                                } else {
                                    f2 = 1.0f;
                                }
                                if (e.this.f13475b.l > 0) {
                                    f3 = ((float) e.this.j) / ((float) e.this.f13475b.l);
                                }
                                i4 = ((int) (((float) e.this.f13475b.i) * f2)) - e.this.g;
                                i3 = ((int) (((float) e.this.f13475b.j) * f3)) - e.this.h;
                            }
                            if (i4 < e.this.f13477d[2]) {
                                i4 = e.this.f13477d[2];
                            } else if (layoutParams.width + i4 > e.this.f13477d[3]) {
                                i4 = e.this.f13477d[3] - layoutParams.width;
                            }
                            if (i3 < e.this.f13477d[0]) {
                                i3 = e.this.f13477d[0];
                            } else if (layoutParams.height + i3 > e.this.f13477d[1]) {
                                i3 = e.this.f13477d[1] - layoutParams.height;
                            }
                            e.this.setX((float) i4);
                            e.this.setY((float) i3);
                            e.this.f13475b.i = i4 + e.this.g;
                            e.this.f13475b.j = i3 + e.this.h;
                            if (1 == e.this.f13475b.g) {
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e.this.f13476c.getLayoutParams();
                                if (e.this.f13475b.f18719f != null && e.this.f13475b.f18719f.length == 4) {
                                    layoutParams2.leftMargin = (int) UIUtils.dip2Px(e.this.getContext(), ((float) e.this.f13475b.f18719f[0]) / 2.0f);
                                    layoutParams2.topMargin = (int) UIUtils.dip2Px(e.this.getContext(), ((float) e.this.f13475b.f18719f[1]) / 2.0f);
                                }
                                layoutParams2.width = ((int) UIUtils.sp2px(e.this.getContext(), (float) (e.this.f13475b.f18716c / 2))) * 8;
                                e.this.f13476c.setLayoutParams(layoutParams2);
                                e.this.f13476c.setTextSize(2, (float) (e.this.f13475b.f18716c / 2));
                                e.this.f13476c.setTextColor(Color.parseColor(e.this.f13475b.f18715b));
                                String str = "";
                                if (!TextUtils.isEmpty(e.this.k)) {
                                    str = e.this.k;
                                } else if (!TextUtils.isEmpty(e.this.f13475b.f18717d)) {
                                    str = e.this.f13475b.f18717d;
                                }
                                e.this.f13476c.setText(str);
                                e.this.f13476c.setOnClickListener(new f(this));
                                e.this.f13476c.setVisibility(0);
                            } else {
                                e.this.f13476c.setVisibility(8);
                            }
                            e.this.setVisibility(0);
                        }
                    }
                });
            }
        }
    }

    public final void setText(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f13474a, false, 7822, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f13474a, false, 7822, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.k = str;
        this.f13476c.setText(str);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f13474a, false, 7818, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f13474a, false, 7818, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.z || !super.dispatchTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f13474a, false, 7829, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f13474a, false, 7829, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.l != null && ac.f()) {
            this.l.a(z2);
        }
    }

    public final void a(int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{iArr}, this, f13474a, false, 7815, new Class[]{int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iArr}, this, f13474a, false, 7815, new Class[]{int[].class}, Void.TYPE);
            return;
        }
        this.f13477d = iArr;
        if (getX() < ((float) this.f13477d[2])) {
            setX((float) this.f13477d[2]);
        } else if (getX() + ((float) this.f13478e) > ((float) this.f13477d[3])) {
            setX((float) this.f13477d[3]);
        }
        if (getY() < ((float) this.f13477d[0])) {
            setY((float) this.f13477d[0]);
            return;
        }
        if (getY() + ((float) this.f13479f) > ((float) this.f13477d[1])) {
            setY((float) (this.f13477d[1] - this.f13479f));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f13474a, false, 7819, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f13474a, false, 7819, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.u = motionEvent.getRawX();
                this.v = motionEvent.getRawY();
                this.w = this.u;
                this.x = this.v;
                return true;
            case 1:
                if (a(this, this.r)) {
                    if (PatchProxy.isSupport(new Object[0], this, f13474a, false, 7828, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f13474a, false, 7828, new Class[0], Void.TYPE);
                    } else if (this.l != null) {
                        this.l.b(this.f13475b);
                        this.l.g();
                    }
                } else if (this.f13476c.getVisibility() == 0 && !this.y) {
                    this.f13476c.performClick();
                } else if (this.y) {
                    this.f13475b.i = (int) (getX() + ((float) this.g));
                    this.f13475b.j = (int) (getY() + ((float) this.h));
                    if (this.l != null) {
                        this.l.g();
                    }
                    this.y = false;
                }
                a();
                a(false);
                return true;
            case 2:
                float abs = Math.abs(motionEvent.getRawX() - this.w);
                float abs2 = Math.abs(motionEvent.getRawY() - this.x);
                if (abs > ((float) this.A) || abs2 > ((float) this.A)) {
                    this.y = true;
                }
                float rawX = motionEvent.getRawX() - this.u;
                float rawY = motionEvent.getRawY() - this.v;
                if (getX() + rawX >= ((float) this.f13477d[2]) && getX() + ((float) this.f13478e) + rawX <= ((float) this.f13477d[3])) {
                    this.u = motionEvent.getRawX();
                    setX(getX() + rawX);
                }
                if (getY() + rawY >= ((float) this.f13477d[0]) && getY() + ((float) this.f13479f) + rawY <= ((float) this.f13477d[1])) {
                    this.v = motionEvent.getRawY();
                    setY(getY() + rawY);
                }
                View view = this.r;
                if (PatchProxy.isSupport(new Object[]{this, view}, this, f13474a, false, 7825, new Class[]{View.class, View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{this, view}, this, f13474a, false, 7825, new Class[]{View.class, View.class}, Void.TYPE);
                } else {
                    boolean a2 = a(this, view);
                    if (a2 && !this.B) {
                        this.B = true;
                        this.p.animate().scaleX(1.2f).scaleY(1.2f).setDuration(200).start();
                    } else if (this.B && !a2) {
                        this.B = false;
                        this.p.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).start();
                    }
                }
                a(true);
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(1.0f)}, this, f13474a, false, 7820, new Class[]{Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(1.0f)}, this, f13474a, false, 7820, new Class[]{Float.TYPE}, Void.TYPE);
                } else if (this.q != null) {
                    this.q.setAlpha(1.0f);
                    if (this.q.getVisibility() != 0) {
                        this.q.setVisibility(0);
                    }
                }
                return true;
            case 3:
                a();
                a(false);
                return true;
            default:
                return true;
        }
    }

    private boolean a(View view, View view2) {
        if (PatchProxy.isSupport(new Object[]{view, view2}, this, f13474a, false, 7826, new Class[]{View.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, view2}, this, f13474a, false, 7826, new Class[]{View.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        view.getLocationOnScreen(this.n);
        view2.getLocationOnScreen(this.m);
        a(view, this.C, this.n);
        a(view2, this.D, this.m);
        return this.C.intersect(this.D);
    }

    private void a(View view, Rect rect, int[] iArr) {
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{view, rect2, iArr}, this, f13474a, false, 7827, new Class[]{View.class, Rect.class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, rect2, iArr}, this, f13474a, false, 7827, new Class[]{View.class, Rect.class, int[].class}, Void.TYPE);
            return;
        }
        rect2.left = iArr[0];
        rect2.top = iArr[1];
        rect2.right = rect2.left + view.getMeasuredWidth();
        rect2.bottom = rect2.top + view.getMeasuredHeight();
    }

    public e(Context context, c cVar, boolean z2, int[] iArr, a aVar, ViewGroup viewGroup) {
        super(context);
        inflate(context, C0906R.layout.afb, this);
        this.f13475b = cVar;
        this.z = z2;
        this.f13477d = iArr;
        this.l = aVar;
        this.i = UIUtils.getScreenWidth(getContext());
        this.j = UIUtils.getScreenHeight(getContext());
        this.o = (ImageView) findViewById(C0906R.id.chm);
        this.f13476c = (TextView) findViewById(C0906R.id.chn);
        this.A = new ViewConfiguration().getScaledTouchSlop();
        if (PatchProxy.isSupport(new Object[]{context, viewGroup}, this, f13474a, false, 7814, new Class[]{Context.class, ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, viewGroup}, this, f13474a, false, 7814, new Class[]{Context.class, ViewGroup.class}, Void.TYPE);
            return;
        }
        inflate(context, C0906R.layout.af_, viewGroup);
        this.q = viewGroup.findViewById(C0906R.id.b_5);
        this.r = viewGroup.findViewById(C0906R.id.a3h);
        this.s = viewGroup.findViewById(C0906R.id.bmq);
        this.t = viewGroup.findViewById(C0906R.id.mo);
        this.p = (Button) viewGroup.findViewById(C0906R.id.a3i);
    }
}
