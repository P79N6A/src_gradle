package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.graphics.Point;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71252a;

    /* renamed from: b  reason: collision with root package name */
    private final ChooseCoverActivity f71253b;

    /* renamed from: c  reason: collision with root package name */
    private final InteractStickerStruct f71254c;

    /* renamed from: d  reason: collision with root package name */
    private final int f71255d;

    /* renamed from: e  reason: collision with root package name */
    private final float f71256e;

    /* renamed from: f  reason: collision with root package name */
    private final int f71257f;
    private final VotingStickerView g;
    private final int h;
    private final int i;

    a(ChooseCoverActivity chooseCoverActivity, InteractStickerStruct interactStickerStruct, int i2, float f2, int i3, VotingStickerView votingStickerView, int i4, int i5) {
        this.f71253b = chooseCoverActivity;
        this.f71254c = interactStickerStruct;
        this.f71255d = i2;
        this.f71256e = f2;
        this.f71257f = i3;
        this.g = votingStickerView;
        this.h = i4;
        this.i = i5;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f71252a, false, 81094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71252a, false, 81094, new Class[0], Void.TYPE);
            return;
        }
        ChooseCoverActivity chooseCoverActivity = this.f71253b;
        InteractStickerStruct interactStickerStruct = this.f71254c;
        int i2 = this.f71255d;
        float f2 = this.f71256e;
        int i3 = this.f71257f;
        VotingStickerView votingStickerView = this.g;
        int i4 = this.h;
        int i5 = this.i;
        NormalTrackTimeStamp a2 = b.a(interactStickerStruct);
        if (a2 != null) {
            Point point = new Point((int) (a2.getX() * ((float) i2) * f2), (int) (a2.getY() * ((float) i3) * f2));
            votingStickerView.setX((float) (((chooseCoverActivity.f71230e.getLeft() + i4) + point.x) - (votingStickerView.getWidth() / 2)));
            votingStickerView.setY((float) (((chooseCoverActivity.f71230e.getTop() + i5) + point.y) - (votingStickerView.getHeight() / 2)));
            votingStickerView.setRotation(a2.getRotation());
            votingStickerView.setScaleX(a2.getScale().floatValue() * f2);
            votingStickerView.setScaleY(a2.getScale().floatValue() * f2);
            votingStickerView.setVisibility(0);
        }
    }
}
