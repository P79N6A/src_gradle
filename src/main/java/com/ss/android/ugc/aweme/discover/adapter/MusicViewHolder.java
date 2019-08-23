package com.ss.android.ugc.aweme.discover.adapter;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.support.v7.graphics.Palette;
import android.text.SpannableStringBuilder;
import butterknife.BindView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.ad.b;
import com.ss.android.ugc.aweme.discover.base.e;
import com.ss.android.ugc.aweme.discover.model.Category;
import com.ss.android.ugc.aweme.music.model.Music;

public class MusicViewHolder extends BaseCategoryNewViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f41690b;

    /* renamed from: c  reason: collision with root package name */
    private e f41691c;
    @BindView(2131494996)
    RemoteImageView coverView;
    @BindView(2131498191)
    DmtTextView titleView;

    public final void a(Category category, int i) {
        if (PatchProxy.isSupport(new Object[]{category, Integer.valueOf(i)}, this, f41690b, false, 35696, new Class[]{Category.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{category, Integer.valueOf(i)}, this, f41690b, false, 35696, new Class[]{Category.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i);
        final Music music = category.getMusic();
        if (music != null) {
            c.b(this.coverView, music.getCoverMedium());
            e eVar = this.f41691c;
            AnonymousClass1 r2 = new e.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41692a;

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41692a, false, 35698, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41692a, false, 35698, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    MusicViewHolder.this.itemView.setBackgroundColor(i);
                }
            };
            UrlModel coverMedium = music.getCoverMedium();
            RectF rectF = new RectF(0.0f, 0.9f, 1.0f, 1.0f);
            if (PatchProxy.isSupport(new Object[]{r2, coverMedium, rectF}, eVar, e.f42159a, false, 36159, new Class[]{e.a.class, UrlModel.class, RectF.class}, Void.TYPE)) {
                e eVar2 = eVar;
                PatchProxy.accessDispatch(new Object[]{r2, coverMedium, rectF}, eVar2, e.f42159a, false, 36159, new Class[]{e.a.class, UrlModel.class, RectF.class}, Void.TYPE);
            } else {
                eVar.f42164f = null;
                eVar.g = 0;
                eVar.f42162c = r2;
                eVar.f42163d = coverMedium;
                if (coverMedium != null) {
                    int hashCode = coverMedium.hashCode();
                    if (coverMedium.getUri() == null || !e.f42160e.containsKey(Integer.valueOf(hashCode))) {
                        eVar.a(eVar.f42161b);
                        c.a(coverMedium, (c.a) new c.a(coverMedium, rectF) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f42165a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ UrlModel f42166b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ RectF f42167c;

                            public final void a(Exception exc) {
                            }

                            public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                                if (PatchProxy.isSupport(new Object[]{dataSource}, this, f42165a, false, 36162, new Class[]{DataSource.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dataSource}, this, f42165a, false, 36162, new Class[]{DataSource.class}, Void.TYPE);
                                } else if (dataSource.isFinished() && e.this.a(this.f42166b)) {
                                    CloseableReference closeableReference = (CloseableReference) dataSource.getResult();
                                    Bitmap bitmap = null;
                                    if (closeableReference != null && (closeableReference.get() instanceof com.facebook.imagepipeline.image.a)) {
                                        bitmap = ((com.facebook.imagepipeline.image.a) closeableReference.get()).getUnderlyingBitmap();
                                    }
                                    try {
                                        int width = bitmap.getWidth();
                                        int height = bitmap.getHeight();
                                        float f2 = (float) width;
                                        Palette.from(bitmap).setRegion((int) (this.f42167c.left * f2), (int) (this.f42167c.top * ((float) height)), (int) (this.f42167c.right * f2), (int) (this.f42167c.bottom * f2)).maximumColorCount(10).clearFilters().addFilter(e.h).generate(new PaletteDelegate$1$1(this));
                                    } finally {
                                        CloseableReference.closeSafely(closeableReference);
                                    }
                                }
                            }

                            {
                                this.f42166b = r2;
                                this.f42167c = r3;
                            }
                        });
                    } else {
                        eVar.a(e.f42160e.get(Integer.valueOf(hashCode)).intValue());
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append("*");
            spannableStringBuilder.setSpan(new b(this.itemView.getContext(), 2130838884), 0, 1, 17);
            this.titleView.setText(music.getMusicName());
            spannableStringBuilder.append(music.getMusicName());
            this.titleView.setText(spannableStringBuilder);
            this.itemView.setOnClickListener(new t(music));
        }
    }
}
