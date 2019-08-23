package com.ss.android.ugc.aweme.hotsearch;

import a.g;
import a.i;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.LruCache;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.hotsearch.d.f;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49714a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListActivity f49715b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f49716c;

    /* renamed from: d  reason: collision with root package name */
    private final LruCache f49717d;

    /* renamed from: e  reason: collision with root package name */
    private final int f49718e;

    /* renamed from: f  reason: collision with root package name */
    private final CountDownLatch f49719f;

    d(RankingListActivity rankingListActivity, RecyclerView recyclerView, LruCache lruCache, int i, CountDownLatch countDownLatch) {
        this.f49715b = rankingListActivity;
        this.f49716c = recyclerView;
        this.f49717d = lruCache;
        this.f49718e = i;
        this.f49719f = countDownLatch;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49714a, false, 49539, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49714a, false, 49539, new Class[]{i.class}, Object.class);
        }
        RankingListActivity rankingListActivity = this.f49715b;
        RecyclerView recyclerView = this.f49716c;
        LruCache lruCache = this.f49717d;
        int i = this.f49718e;
        CountDownLatch countDownLatch = this.f49719f;
        if (iVar.e() != null) {
            int intValue = ((Integer) iVar.e()).intValue();
            Bitmap createBitmap = Bitmap.createBitmap(recyclerView.getMeasuredWidth(), rankingListActivity.g, Bitmap.Config.RGB_565);
            Paint paint = new Paint();
            Canvas canvas = new Canvas(createBitmap);
            Drawable background = recyclerView.getBackground();
            if (background instanceof ColorDrawable) {
                canvas.drawColor(((ColorDrawable) background).getColor());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < intValue; i3++) {
                Bitmap bitmap = (Bitmap) lruCache.get(String.valueOf(i3));
                canvas.drawBitmap(bitmap, 0.0f, (float) i2, paint);
                i2 += bitmap.getHeight();
                bitmap.recycle();
            }
            View findViewById = rankingListActivity.getWindow().getDecorView().findViewById(C0906R.id.ap3);
            findViewById.setDrawingCacheEnabled(false);
            Bitmap a2 = f.a(findViewById);
            if (!(a2 == null || rankingListActivity.f3357d == null || rankingListActivity.f3358e == null)) {
                Bitmap createBitmap2 = Bitmap.createBitmap(a2.getWidth(), rankingListActivity.f3359f, Bitmap.Config.RGB_565);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(rankingListActivity.f3357d, 0.0f, 0.0f, null);
                canvas2.drawBitmap(a2, 0.0f, (float) rankingListActivity.f3357d.getHeight(), null);
                canvas2.drawBitmap(createBitmap, 0.0f, (float) (rankingListActivity.f3357d.getHeight() + a2.getHeight()), null);
                canvas2.drawBitmap(rankingListActivity.f3358e, 0.0f, (float) (rankingListActivity.f3359f - rankingListActivity.f3358e.getHeight()), null);
                rankingListActivity.h = createBitmap2;
                rankingListActivity.f3356c.put(Integer.valueOf(i), createBitmap2);
            }
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
        return null;
    }
}
