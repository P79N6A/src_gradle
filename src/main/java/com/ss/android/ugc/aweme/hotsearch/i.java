package com.ss.android.ugc.aweme.hotsearch;

import a.g;
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

public final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49778a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListIndependenceActivity f49779b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f49780c;

    /* renamed from: d  reason: collision with root package name */
    private final LruCache f49781d;

    /* renamed from: e  reason: collision with root package name */
    private final CountDownLatch f49782e;

    i(RankingListIndependenceActivity rankingListIndependenceActivity, RecyclerView recyclerView, LruCache lruCache, CountDownLatch countDownLatch) {
        this.f49779b = rankingListIndependenceActivity;
        this.f49780c = recyclerView;
        this.f49781d = lruCache;
        this.f49782e = countDownLatch;
    }

    public final Object then(a.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49778a, false, 49567, new Class[]{a.i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49778a, false, 49567, new Class[]{a.i.class}, Object.class);
        }
        RankingListIndependenceActivity rankingListIndependenceActivity = this.f49779b;
        RecyclerView recyclerView = this.f49780c;
        LruCache lruCache = this.f49781d;
        CountDownLatch countDownLatch = this.f49782e;
        if (iVar.e() != null) {
            int intValue = ((Integer) iVar.e()).intValue();
            Bitmap createBitmap = Bitmap.createBitmap(recyclerView.getMeasuredWidth(), rankingListIndependenceActivity.g, Bitmap.Config.RGB_565);
            Paint paint = new Paint();
            Canvas canvas = new Canvas(createBitmap);
            Drawable background = recyclerView.getBackground();
            if (background instanceof ColorDrawable) {
                canvas.drawColor(((ColorDrawable) background).getColor());
            }
            int i = 0;
            for (int i2 = 0; i2 < intValue; i2++) {
                Bitmap bitmap = (Bitmap) lruCache.get(String.valueOf(i2));
                canvas.drawBitmap(bitmap, 0.0f, (float) i, paint);
                i += bitmap.getHeight();
                bitmap.recycle();
            }
            View findViewById = rankingListIndependenceActivity.getWindow().getDecorView().findViewById(C0906R.id.by7);
            findViewById.setDrawingCacheEnabled(false);
            Bitmap a2 = f.a(findViewById);
            if (!(a2 == null || rankingListIndependenceActivity.f49638d == null || rankingListIndependenceActivity.f49639e == null)) {
                Bitmap createBitmap2 = Bitmap.createBitmap(a2.getWidth(), rankingListIndependenceActivity.f49640f, Bitmap.Config.RGB_565);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(rankingListIndependenceActivity.f49638d, 0.0f, 0.0f, null);
                canvas2.drawBitmap(a2, 0.0f, (float) rankingListIndependenceActivity.f49638d.getHeight(), null);
                canvas2.drawBitmap(createBitmap, 0.0f, (float) (rankingListIndependenceActivity.f49638d.getHeight() + a2.getHeight()), null);
                canvas2.drawBitmap(rankingListIndependenceActivity.f49639e, 0.0f, (float) (rankingListIndependenceActivity.f49640f - rankingListIndependenceActivity.f49639e.getHeight()), null);
                rankingListIndependenceActivity.h = createBitmap2;
                rankingListIndependenceActivity.f49637c.put(0, createBitmap2);
            }
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
        return null;
    }
}
