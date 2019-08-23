package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;

public final /* synthetic */ class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70741a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity f70742b;

    /* renamed from: c  reason: collision with root package name */
    private final InteractStickerStruct f70743c;

    /* renamed from: d  reason: collision with root package name */
    private final VotingStickerView f70744d;

    /* renamed from: e  reason: collision with root package name */
    private final View f70745e;

    ac(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity, InteractStickerStruct interactStickerStruct, VotingStickerView votingStickerView, View view) {
        this.f70742b = vEVideoPublishPreviewActivity;
        this.f70743c = interactStickerStruct;
        this.f70744d = votingStickerView;
        this.f70745e = view;
    }

    public final void run() {
        Point point;
        if (PatchProxy.isSupport(new Object[0], this, f70741a, false, 80356, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70741a, false, 80356, new Class[0], Void.TYPE);
            return;
        }
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f70742b;
        InteractStickerStruct interactStickerStruct = this.f70743c;
        VotingStickerView votingStickerView = this.f70744d;
        View view = this.f70745e;
        NormalTrackTimeStamp a2 = b.a(interactStickerStruct);
        PointF pointF = new PointF(a2.getX(), a2.getY());
        if (PatchProxy.isSupport(new Object[]{pointF}, vEVideoPublishPreviewActivity, VEVideoPublishPreviewActivity.f70555a, false, 80350, new Class[]{PointF.class}, Point.class)) {
            VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity2 = vEVideoPublishPreviewActivity;
            point = (Point) PatchProxy.accessDispatch(new Object[]{pointF}, vEVideoPublishPreviewActivity2, VEVideoPublishPreviewActivity.f70555a, false, 80350, new Class[]{PointF.class}, Point.class);
        } else {
            Point point2 = new Point();
            point2.set((int) (((float) vEVideoPublishPreviewActivity.f70557c.q.d().f77890a) * pointF.x), (int) (((float) vEVideoPublishPreviewActivity.f70557c.q.d().f77891b) * pointF.y));
            point = point2;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vEVideoPublishPreviewActivity.f70558d.getLayoutParams();
        float height = (float) ((vEVideoPublishPreviewActivity.f70558d.getHeight() - vEVideoPublishPreviewActivity.f70557c.q.d().f77891b) / 2);
        votingStickerView.setX((float) ((point.x + layoutParams.leftMargin) - (votingStickerView.getWidth() / 2)));
        votingStickerView.setY((((float) (point.y + layoutParams.topMargin)) + height) - ((float) (votingStickerView.getHeight() / 2)));
        votingStickerView.setRotation(a2.getRotation());
        votingStickerView.setScaleX(a2.getScale().floatValue());
        votingStickerView.setScaleY(a2.getScale().floatValue());
        votingStickerView.bringToFront();
        view.bringToFront();
        votingStickerView.setVisibility(0);
    }
}
