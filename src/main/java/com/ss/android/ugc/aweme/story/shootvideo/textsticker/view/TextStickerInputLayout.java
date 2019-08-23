package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.story.shootvideo.a.b;
import com.ss.android.ugc.aweme.story.shootvideo.edit.r;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.c;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.d;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.f;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.j;
import com.ss.android.ugc.aweme.tools.R$styleable;
import com.ss.android.ugc.aweme.utils.ax;
import org.jetbrains.annotations.NotNull;

public class TextStickerInputLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f74318b;
    private View A;
    private View B;
    private View C;
    private int D;

    /* renamed from: a  reason: collision with root package name */
    private Context f74319a;

    /* renamed from: c  reason: collision with root package name */
    TextStickerEditText f74320c;

    /* renamed from: d  reason: collision with root package name */
    int f74321d;

    /* renamed from: e  reason: collision with root package name */
    int f74322e;

    /* renamed from: f  reason: collision with root package name */
    int f74323f;
    int g;
    public boolean h;
    public b i;
    com.ss.android.ugc.aweme.story.shootvideo.textrecord.a j;
    public f k;
    View l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a r;
    a s;
    private View t;
    private ColorSelectLayout u;
    private ImageView v;
    private ImageView w;
    private InputMethodManager x;
    private View y;
    private View z;

    public interface a {
        void a(boolean z);
    }

    public int getAlignTxt() {
        return this.f74323f;
    }

    public int getCurColor() {
        return this.g;
    }

    public int getCurTxtMode() {
        return this.f74321d;
    }

    public EditText getEditText() {
        return this.f74320c;
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86390, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86390, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.a(d.a().b());
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86388, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86388, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f74320c == null || this.x == null)) {
            this.x.toggleSoftInput(0, 2);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86389, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86389, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f74320c == null || this.x == null)) {
            this.x.hideSoftInputFromWindow(this.f74320c.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86376, new Class[0], Void.TYPE);
        } else if (this.f74323f == 2) {
            this.w.setImageResource(2130839352);
        } else if (this.f74323f == 1) {
            this.w.setImageResource(2130839355);
        } else {
            if (this.f74323f == 3) {
                this.w.setImageResource(2130839358);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86378, new Class[0], Void.TYPE);
        } else if (this.f74321d == 1) {
            this.v.setImageResource(2130839354);
        } else if (this.f74321d == 2) {
            this.v.setImageResource(2130839351);
        } else {
            if (this.f74321d == 3) {
                this.v.setImageResource(2130839359);
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86379, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86379, new Class[0], Void.TYPE);
            return;
        }
        this.k.a();
        this.f74321d = 1;
        this.f74322e = -1;
        this.g = j.a().c().f74254b;
        this.f74323f = 2;
        this.f74320c.a(this.f74321d, this.g);
        this.f74320c.setText("");
    }

    public Point getEditInputCenterPoint() {
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86373, new Class[0], Point.class)) {
            return (Point) PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86373, new Class[0], Point.class);
        }
        return new Point(UIUtils.getScreenWidth(this.f74319a) / 2, ((int) UIUtils.dip2Px(this.f74319a, 52.0f)) + (this.A.getHeight() / 2));
    }

    public String[] getTextAry() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86380, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86380, new Class[0], String[].class);
        }
        Layout layout = this.f74320c.getLayout();
        String obj = this.f74320c.getText().toString();
        String[] strArr = new String[this.f74320c.getLineCount()];
        int i3 = 0;
        while (i2 < this.f74320c.getLineCount()) {
            int lineEnd = layout.getLineEnd(i2);
            strArr[i2] = obj.substring(i3, lineEnd);
            layout.getLineBounds(i2, new Rect());
            i2++;
            i3 = lineEnd;
        }
        return strArr;
    }

    public void setBgColorChangeListener(com.ss.android.ugc.aweme.story.shootvideo.textrecord.a aVar) {
        this.j = aVar;
    }

    public void setStoryEditViewShowListener(b bVar) {
        this.i = bVar;
    }

    public void setTextStickerUpdateListener(a aVar) {
        this.s = aVar;
    }

    public TextStickerInputLayout(@NonNull Context context) {
        this(context, null);
    }

    public void dismiss(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74318b, false, 86386, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74318b, false, 86386, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.h) {
            com.ss.android.ugc.aweme.story.shootvideo.a.b(this);
            this.h = true;
            if (this.i != null) {
                this.i.dismiss();
            }
        }
    }

    public void setData(TextStickerData textStickerData) {
        if (PatchProxy.isSupport(new Object[]{textStickerData}, this, f74318b, false, 86381, new Class[]{TextStickerData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textStickerData}, this, f74318b, false, 86381, new Class[]{TextStickerData.class}, Void.TYPE);
            return;
        }
        int i2 = textStickerData.mBgMode;
        int i3 = textStickerData.mColor;
        int i4 = textStickerData.mAlign;
        this.f74321d = i2;
        this.g = i3;
        this.f74323f = i4;
        if (TextUtils.isEmpty(textStickerData.mFontType)) {
            d.a().f74173c = textStickerData.mFontType;
        }
    }

    public void setTextStickerInputMobListener(com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a aVar) {
        com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f74318b, false, 86396, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f74318b, false, 86396, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.framework.core.a.b().f3306d || aVar2 != null) {
            this.r = aVar2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74318b, false, 86387, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74318b, false, 86387, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.z.getLayoutParams();
        layoutParams.bottomMargin = i2;
        this.z.setLayoutParams(layoutParams);
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f74318b, false, 86371, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f74318b, false, 86371, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.C.setVisibility(0);
        this.f74320c.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74326a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f74326a, false, 86405, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f74326a, false, 86405, new Class[]{Editable.class}, Void.TYPE);
                } else if (TextUtils.isEmpty(editable.toString())) {
                    TextStickerInputLayout.this.c(false);
                } else {
                    TextStickerInputLayout.this.c(true);
                }
            }
        });
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74318b, false, 86372, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74318b, false, 86372, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            if (this.y.getAlpha() < 1.0f) {
                this.y.setAlpha(1.0f);
                this.y.setClickable(true);
                this.y.setTag(Boolean.TRUE);
            }
        } else if (this.y.getAlpha() >= 1.0f) {
            this.y.setAlpha(0.34f);
            this.y.setClickable(false);
            this.y.setTag(Boolean.FALSE);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f74318b, false, 86374, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f74318b, false, 86374, new Class[]{c.class}, Void.TYPE);
        } else if (cVar != null) {
            if (cVar.f74167d == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                this.f74322e = this.f74321d;
                this.f74321d = 1;
                this.v.setAlpha(0.34f);
                this.v.setClickable(false);
                this.v.setTag(Boolean.FALSE);
                return;
            }
            if (this.f74322e != -1) {
                this.f74321d = this.f74322e;
            }
            this.v.setAlpha(1.0f);
            this.v.setClickable(true);
            this.v.setTag(Boolean.TRUE);
        }
    }

    public void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74318b, false, 86384, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74318b, false, 86384, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.h || z2) {
            this.h = false;
            d();
        }
    }

    public TextStickerInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a aVar;
        f fVar;
        this.f74321d = 1;
        this.f74322e = -1;
        this.f74323f = 2;
        this.g = -1;
        this.h = true;
        this.q = true;
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86395, new Class[0], com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a.class)) {
            aVar = (com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a) PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86395, new Class[0], com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a.class);
        } else {
            aVar = new com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74328a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f74328a, false, 86406, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f74328a, false, 86406, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.utils.a.f75468b.a("text_complete", r.a(TextStickerInputLayout.this.m, TextStickerInputLayout.this.n, TextStickerInputLayout.this.o, TextStickerInputLayout.this.p, TextStickerInputLayout.this.q).f34114b);
                }

                public final void b(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74328a, false, 86409, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74328a, false, 86409, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                    com.ss.android.ugc.aweme.app.d.d a2 = r.a(TextStickerInputLayout.this.m, TextStickerInputLayout.this.n, TextStickerInputLayout.this.o, TextStickerInputLayout.this.p, TextStickerInputLayout.this.q);
                    aVar.a("select_text_style", a2.a("text_style", i).f34114b);
                }

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74328a, false, 86407, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74328a, false, 86407, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                    com.ss.android.ugc.aweme.app.d.d a2 = r.a(TextStickerInputLayout.this.m, TextStickerInputLayout.this.n, TextStickerInputLayout.this.o, TextStickerInputLayout.this.p, TextStickerInputLayout.this.q);
                    aVar.a("select_text_color", a2.a("color", Integer.toHexString(i)).f34114b);
                }

                public final void a(c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f74328a, false, 86410, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f74328a, false, 86410, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.utils.a.f75468b.a("select_text_font", r.a(TextStickerInputLayout.this.m, TextStickerInputLayout.this.n, TextStickerInputLayout.this.o, TextStickerInputLayout.this.p, TextStickerInputLayout.this.q).a(" font", cVar.f74166c).f34114b);
                }

                public final void a(@NotNull String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f74328a, false, 86408, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f74328a, false, 86408, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.utils.a.f75468b.a("select_text_paragraph", r.a(TextStickerInputLayout.this.m, TextStickerInputLayout.this.n, TextStickerInputLayout.this.o, TextStickerInputLayout.this.p, TextStickerInputLayout.this.q).a("paragraph_style", str).f34114b);
                }
            };
        }
        this.r = aVar;
        this.f74319a = context;
        this.x = (InputMethodManager) this.f74319a.getSystemService("input_method");
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f74318b, false, 86369, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f74318b, false, 86369, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
        } else if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextStickerInputLayout);
            this.D = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86368, new Class[0], Void.TYPE);
            return;
        }
        this.t = LayoutInflater.from(this.f74319a).inflate(C0906R.layout.a_0, null);
        this.z = this.t.findViewById(C0906R.id.yv);
        this.A = this.t.findViewById(C0906R.id.aus);
        this.f74320c = (TextStickerEditText) this.t.findViewById(C0906R.id.aa8);
        this.v = (ImageView) this.t.findViewById(C0906R.id.cot);
        LinearLayout linearLayout = (LinearLayout) this.t.findViewById(C0906R.id.ahj);
        Context context2 = this.f74319a;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f.f74186a, true, 86114, new Class[]{Context.class}, f.class)) {
            fVar = (f) PatchProxy.accessDispatch(new Object[]{context2}, null, f.f74186a, true, 86114, new Class[]{Context.class}, f.class);
        } else {
            f fVar2 = new f(context2, null);
            fVar2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            fVar = fVar2;
        }
        this.k = fVar;
        this.k.a(d.a().b());
        linearLayout.addView(this.k);
        this.w = (ImageView) this.t.findViewById(C0906R.id.ef);
        this.w.setOnClickListener(new h(this));
        this.u = (ColorSelectLayout) this.t.findViewById(C0906R.id.ui);
        this.u.setColorChangeListener(new i(this));
        this.k.setClickFontStyleListener(new j(this));
        this.v.setOnClickListener(new ax() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74324a;

            public final void a(View view) {
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{view}, this, f74324a, false, 86404, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f74324a, false, 86404, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                TextStickerInputLayout textStickerInputLayout = TextStickerInputLayout.this;
                if (PatchProxy.isSupport(new Object[0], textStickerInputLayout, TextStickerInputLayout.f74318b, false, 86377, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], textStickerInputLayout, TextStickerInputLayout.f74318b, false, 86377, new Class[0], Void.TYPE);
                    return;
                }
                if (textStickerInputLayout.f74321d == 1) {
                    textStickerInputLayout.f74321d = 2;
                } else if (textStickerInputLayout.f74321d == 2) {
                    textStickerInputLayout.f74321d = 3;
                } else if (textStickerInputLayout.f74321d == 3) {
                    textStickerInputLayout.f74321d = 1;
                }
                textStickerInputLayout.b();
                textStickerInputLayout.f74320c.a(textStickerInputLayout.f74321d, textStickerInputLayout.g);
                textStickerInputLayout.f74322e = textStickerInputLayout.f74321d;
                if (PatchProxy.isSupport(new Object[0], textStickerInputLayout, TextStickerInputLayout.f74318b, false, 86393, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], textStickerInputLayout, TextStickerInputLayout.f74318b, false, 86393, new Class[0], Void.TYPE);
                    return;
                }
                if (textStickerInputLayout.f74321d != 1) {
                    if (textStickerInputLayout.f74321d == 2) {
                        i = 1;
                    } else if (textStickerInputLayout.f74321d == 3) {
                        i = 2;
                    }
                }
                if (textStickerInputLayout.r != null) {
                    textStickerInputLayout.r.b(i);
                }
            }
        });
        View findViewById = this.t.findViewById(C0906R.id.cxa);
        View findViewById2 = this.t.findViewById(C0906R.id.dk4);
        if (this.D == 0) {
            this.y = findViewById;
            findViewById2.setVisibility(8);
        } else {
            this.y = findViewById2;
            findViewById.setVisibility(8);
        }
        this.y.setOnClickListener(new k(this));
        this.t.setOnClickListener(new l(this));
        this.v.setImageResource(2130839351);
        addView(this.t);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.t.getLayoutParams();
        layoutParams.topMargin = p.c();
        this.t.setLayoutParams(layoutParams);
        findViewById(C0906R.id.buk).setOnClickListener(m.f74396b);
        if (PatchProxy.isSupport(new Object[0], this, f74318b, false, 86370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74318b, false, 86370, new Class[0], Void.TYPE);
        } else {
            this.B = this.t.findViewById(C0906R.id.kb);
            this.l = this.t.findViewById(C0906R.id.ka);
            this.C = this.t.findViewById(C0906R.id.cn8);
            this.C.setVisibility(8);
            this.B.setBackground(bc.a(-1, 16777215, (int) UIUtils.dip2Px(getContext(), 2.0f), (int) UIUtils.dip2Px(getContext(), 4.0f)));
            this.l.setBackground(bc.a(j.a().c().f74253a));
            this.C.setOnClickListener(new n(this));
            com.ss.android.ugc.aweme.notification.d.c.b(this.C);
        }
        ImageView imageView = this.v;
        if (PatchProxy.isSupport(new Object[]{imageView}, null, com.ss.android.ugc.aweme.notification.d.c.f58117a, true, 63261, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView}, null, com.ss.android.ugc.aweme.notification.d.c.f58117a, true, 63261, new Class[]{View.class}, Void.TYPE);
        } else {
            imageView.setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a */
                public static ChangeQuickRedirect f58121a;

                public final boolean onTouch(
/*
Method generation error in method: com.ss.android.ugc.aweme.notification.d.c.4.onTouch(android.view.View, android.view.MotionEvent):boolean, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.notification.d.c.4.onTouch(android.view.View, android.view.MotionEvent):boolean, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            });
        }
        View view = this.y;
        if (PatchProxy.isSupport(new Object[]{view}, null, com.ss.android.ugc.aweme.notification.d.c.f58117a, true, 63259, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, null, com.ss.android.ugc.aweme.notification.d.c.f58117a, true, 63259, new Class[]{View.class}, Void.TYPE);
        } else {
            view.setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a */
                public static ChangeQuickRedirect f58119a;

                public final boolean onTouch(
/*
Method generation error in method: com.ss.android.ugc.aweme.notification.d.c.2.onTouch(android.view.View, android.view.MotionEvent):boolean, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.notification.d.c.2.onTouch(android.view.View, android.view.MotionEvent):boolean, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            });
        }
        com.ss.android.ugc.aweme.notification.d.c.b(this.w);
    }

    public final void a(String str, String str2, boolean z2, boolean z3) {
        this.m = str;
        this.n = str2;
        this.o = z2;
        this.p = z3;
    }

    public final void a(String str, int i2, int i3, int i4, String str2, boolean z2) {
        String str3 = str;
        int i5 = i2;
        int i6 = i3;
        String str4 = str2;
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str4, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74318b, false, 86383, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str4, Byte.valueOf(z2)}, this, f74318b, false, 86383, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f74322e = -1;
        a(z3);
        f();
        this.f74320c.requestFocus();
        this.f74320c.setCursorVisible(true);
        this.u.a(z3, i6);
        if (z3) {
            d.a().c();
            c();
        } else {
            if (!TextUtils.isEmpty(str)) {
                this.f74320c.setText(str3);
                this.f74320c.setSelection(str.length());
            }
            this.u.setSelectColorView(i6);
            this.f74321d = i5;
            this.f74323f = i4;
            this.g = i6;
            d.a().f74173c = str4;
        }
        b();
        this.f74320c.setFontType(d.a().d());
        this.f74320c.a(i5, i6);
        this.f74320c.setAligin(this.f74323f);
        this.k.a();
        a();
        a(d.a().f());
        if (!this.q) {
            this.l.setBackground(bc.a(j.a().c().f74253a));
        }
    }
}
