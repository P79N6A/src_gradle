package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.content.Context;
import android.graphics.Point;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.shootvideo.a.b;
import com.ss.android.ugc.aweme.story.shootvideo.c;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.d;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o;

public class StoryTextRecordLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74215a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f74216b;

    /* renamed from: c  reason: collision with root package name */
    View f74217c;

    /* renamed from: d  reason: collision with root package name */
    TextView f74218d;

    /* renamed from: e  reason: collision with root package name */
    o f74219e;

    /* renamed from: f  reason: collision with root package name */
    View f74220f;
    View g;
    View h;
    View i;
    public Fragment j;
    View k;
    b l;
    long m;
    float n;
    float o;
    public b p;
    public String q;
    boolean r;
    boolean s;
    long t;
    public boolean u = true;
    StoryTextRecordTextInputLayout v;
    private String[] w;
    private Point x = new Point();
    private a y;

    public View getBgView() {
        return this.f74217c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74215a, false, 86215, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74215a, false, 86215, new Class[0], Void.TYPE);
        } else if (fc.a()) {
            switch (fb.f67663b) {
                case 1:
                    c(true);
                    return;
                case 2:
                    c(true);
                    return;
                case 3:
                    c(false);
                    return;
                case 4:
                    c(true);
                    return;
                case 5:
                    c(true);
                    return;
                case 6:
                    c(false);
                    return;
                case e.l:
                    c(false);
                    return;
                default:
                    c(false);
                    return;
            }
        }
    }

    public TextStickerData getTextStickerData() {
        if (PatchProxy.isSupport(new Object[0], this, f74215a, false, 86229, new Class[0], TextStickerData.class)) {
            return (TextStickerData) PatchProxy.accessDispatch(new Object[0], this, f74215a, false, 86229, new Class[0], TextStickerData.class);
        }
        TextStickerData textStickerData = null;
        if (this.f74219e != null) {
            textStickerData = new TextStickerData(this.f74219e.getText(), this.f74219e.getCurMode(), this.f74219e.getCurColor(), this.f74219e.getCurAlignTxt(), d.a().f74173c);
            textStickerData.mEditCenterPoint = this.x;
            textStickerData.mTextStrAry = this.w;
        }
        return textStickerData;
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f74215a, false, 86223, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74215a, false, 86223, new Class[0], Void.TYPE);
        } else if (!this.s) {
            this.s = true;
            if (this.v != null) {
                this.v.setVisibility(8);
                b(true);
                this.v.dismiss(true);
                TextStickerData textStickerData = null;
                if (c.a(this.v.getTextAry())) {
                    textStickerData = new TextStickerData("", this.v.getCurTxtMode(), this.v.getCurColor(), this.v.getAlignTxt(), d.a().f74173c);
                    textStickerData.mTextStrAry = this.v.getTextAry();
                    textStickerData.mEditCenterPoint = this.v.getEditInputCenterPoint();
                }
                a(textStickerData);
                if (PatchProxy.isSupport(new Object[0], this, f74215a, false, 86226, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74215a, false, 86226, new Class[0], Void.TYPE);
                    return;
                }
                if (this.l != null) {
                    this.l.dismiss();
                }
                if (this.f74219e == null) {
                    this.f74218d.setVisibility(0);
                } else {
                    this.f74219e.setVisibility(0);
                    if (this.f74219e != null) {
                        this.k.setVisibility(0);
                        return;
                    }
                }
                this.k.setVisibility(8);
            }
        }
    }

    public void setOnChangeBgColorListener(a aVar) {
        this.y = aVar;
    }

    public void setOnStoryTextRecordFinishListener(b bVar) {
        this.p = bVar;
    }

    public void setStickerShowListener(b bVar) {
        this.l = bVar;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74215a, false, 86233, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74215a, false, 86233, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.j != null && this.j.getParentFragment() != null) {
            a.f61121d.a(this.j.getParentFragment(), z);
        }
    }

    private void c(boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74215a, false, 86216, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74215a, false, 86216, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f74217c != null && this.k != null) {
            getContext().getResources().getDimensionPixelSize(C0906R.dimen.cf);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k.getLayoutParams();
            if (z) {
                f2 = UIUtils.dip2Px(getContext(), 16.0f) + UIUtils.dip2Px(getContext(), 65.0f);
            } else {
                f2 = UIUtils.dip2Px(getContext(), 65.0f);
            }
            layoutParams.bottomMargin = (int) f2;
            this.k.setLayoutParams(layoutParams);
        }
    }

    public final void a(TextStickerData textStickerData) {
        if (PatchProxy.isSupport(new Object[]{textStickerData}, this, f74215a, false, 86228, new Class[]{TextStickerData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textStickerData}, this, f74215a, false, 86228, new Class[]{TextStickerData.class}, Void.TYPE);
            return;
        }
        Point point = null;
        if (textStickerData != null) {
            point = textStickerData.mEditCenterPoint;
            this.x = point;
            this.w = textStickerData.mTextStrAry;
        }
        a(textStickerData, point);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74215a, false, 86224, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74215a, false, 86224, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f74217c.setBackgroundColor(0);
        this.f74217c.setBackground(bc.a(j.a().c().f74253a));
        this.g.setBackground(bc.a(j.a().c().f74253a));
        this.f74218d.setTextColor(j.a().c().f74255c);
        if (this.y != null) {
            this.y.a(z);
        }
    }

    public StoryTextRecordLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(TextStickerData textStickerData, Point point) {
        TextStickerData textStickerData2 = textStickerData;
        Point point2 = point;
        if (PatchProxy.isSupport(new Object[]{textStickerData2, point2}, this, f74215a, false, 86219, new Class[]{TextStickerData.class, Point.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textStickerData2, point2}, this, f74215a, false, 86219, new Class[]{TextStickerData.class, Point.class}, Void.TYPE);
            return;
        }
        if (textStickerData2 != null && c.a(textStickerData2.mTextStrAry)) {
            if (PatchProxy.isSupport(new Object[]{textStickerData2, point2}, this, f74215a, false, 86220, new Class[]{TextStickerData.class, Point.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textStickerData2, point2}, this, f74215a, false, 86220, new Class[]{TextStickerData.class, Point.class}, Void.TYPE);
            } else if (!(textStickerData2.mTextStrAry == null || textStickerData2.mTextStrAry.length == 0)) {
                if (this.f74219e != null) {
                    this.f74219e.setText(textStickerData2.mTextStrAry);
                    this.f74219e.a(textStickerData2.mBgMode, textStickerData2.mColor, textStickerData2.mAlign, textStickerData2.mFontType);
                } else {
                    this.f74219e = new o(getContext(), null, null, false);
                    this.f74219e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f74216b.addView(this.f74219e);
                    this.f74219e.setText(textStickerData2.mTextStrAry);
                    this.f74219e.a(textStickerData2.mBgMode, textStickerData2.mColor, textStickerData2.mAlign, textStickerData2.mFontType);
                    this.f74219e.setAnimXY(point2);
                }
                if (this.r && this.p != null) {
                    this.p.a(false);
                }
            }
        } else if (this.f74219e != null) {
            this.f74219e = null;
            this.f74216b.removeView(this.f74219e);
        }
    }
}
