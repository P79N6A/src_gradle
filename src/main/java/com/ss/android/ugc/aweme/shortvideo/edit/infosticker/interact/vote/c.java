package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;

public class c extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67379a;
    private float A;

    /* renamed from: b  reason: collision with root package name */
    float f67380b;

    /* renamed from: c  reason: collision with root package name */
    private int f67381c;

    /* renamed from: d  reason: collision with root package name */
    private int f67382d;

    /* renamed from: e  reason: collision with root package name */
    private float f67383e = 28.0f;
    private int y;
    private VotingStickerView z;

    public final boolean g() {
        return true;
    }

    public VotingStickerView getBaseView() {
        return this.z;
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f67379a, false, 77144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67379a, false, 77144, new Class[0], Void.TYPE);
            return;
        }
        this.f67380b = (float) this.m.getMeasuredHeight();
    }

    public c(Context context) {
        super(context);
        this.g = context;
        this.f67382d = (int) UIUtils.dip2Px(context, 32.0f);
        this.f67381c = UIUtils.getScreenWidth(context) - this.f67382d;
        this.y = this.f67381c;
        this.f67383e = UIUtils.dip2Px(context, 28.0f);
        this.A = UIUtils.dip2Px(context, 96.0f);
        if (PatchProxy.isSupport(new Object[0], this, f67379a, false, 77140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67379a, false, 77140, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(this.g).inflate(C0906R.layout.a8v, this);
        this.l = (StickerHelpBoxView) findViewById(C0906R.id.cvj);
        this.m = findViewById(C0906R.id.z1);
    }

    public final void a(VotingStickerView votingStickerView) {
        if (PatchProxy.isSupport(new Object[]{votingStickerView}, this, f67379a, false, 77141, new Class[]{VotingStickerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{votingStickerView}, this, f67379a, false, 77141, new Class[]{VotingStickerView.class}, Void.TYPE);
        } else if (votingStickerView != null) {
            this.z = votingStickerView;
            ((ViewGroup) this.m).removeAllViews();
            ((ViewGroup) this.m).addView(votingStickerView);
        }
    }

    public final float b(VotingStickerView votingStickerView) {
        if (PatchProxy.isSupport(new Object[]{votingStickerView}, this, f67379a, false, 77143, new Class[]{VotingStickerView.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{votingStickerView}, this, f67379a, false, 77143, new Class[]{VotingStickerView.class}, Float.TYPE)).floatValue();
        }
        float height = (this.f67380b - ((float) this.z.getHeight())) * this.h;
        if (height >= 0.0f || !StringUtils.isEmpty(votingStickerView.getVoteStruct().getQuestion())) {
            return height / 2.0f;
        }
        return height;
    }

    public final void a(VoteStruct voteStruct) {
        if (PatchProxy.isSupport(new Object[]{voteStruct}, this, f67379a, false, 77142, new Class[]{VoteStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{voteStruct}, this, f67379a, false, 77142, new Class[]{VoteStruct.class}, Void.TYPE);
            return;
        }
        if (this.z == null) {
            this.z = new VotingStickerView(getContext());
            this.z.setTouchEnable(true);
            this.z.setEditEnable(false);
            if (voteStruct != null && !CollectionUtils.isEmpty(voteStruct.getOptions())) {
                this.z.a(voteStruct);
            }
            this.z.b();
        }
        ((ViewGroup) this.m).removeAllViews();
        ((ViewGroup) this.m).addView(this.z);
    }
}
