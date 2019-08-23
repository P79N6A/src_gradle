package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.discover.mixfeed.a;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixXiGuaVideoViewHolder;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.SearchXiGuaVideo;
import com.ss.android.ugc.aweme.discover.model.XiGuaVideo;
import com.ss.android.ugc.aweme.discover.ui.XiGuaVideoItemViewHolder;
import com.ss.android.ugc.aweme.discover.ui.ap;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.utils.eo;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchMixXiGuaVideoCell;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchMixCell;", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "cardViewHolder", "Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixXiGuaVideoViewHolder;", "itemView", "Landroid/view/View;", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/ugc/aweme/discover/ui/SearchMixCell$ViewAllListener;", "(Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixXiGuaVideoViewHolder;Landroid/view/View;Landroid/content/Context;Lcom/ss/android/ugc/aweme/discover/ui/SearchMixCell$ViewAllListener;)V", "bind", "", "mixFeed", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "showViewMore", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class av extends ap<a> {
    public static ChangeQuickRedirect i;
    private SearchMixXiGuaVideoViewHolder j;

    public final void a(@NotNull a aVar, @Nullable SearchResultParam searchResultParam, boolean z) {
        XiGuaVideoItemViewHolder xiGuaVideoItemViewHolder;
        String str;
        a aVar2 = aVar;
        SearchResultParam searchResultParam2 = searchResultParam;
        int i2 = 1;
        int i3 = 2;
        if (PatchProxy.isSupport(new Object[]{aVar2, searchResultParam2, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 38016, new Class[]{a.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, searchResultParam2, Byte.valueOf(z)}, this, i, false, 38016, new Class[]{a.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "mixFeed");
        super.a(aVar, searchResultParam, z);
        List<SearchXiGuaVideo> list = aVar2.o;
        this.g.removeAllViews();
        for (SearchXiGuaVideo next : list) {
            XiGuaVideoItemViewHolder.a aVar3 = XiGuaVideoItemViewHolder.i;
            LinearLayout linearLayout = this.g;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mContentView");
            ViewGroup viewGroup = linearLayout;
            SearchMixXiGuaVideoViewHolder searchMixXiGuaVideoViewHolder = this.j;
            Object[] objArr = new Object[i3];
            objArr[0] = viewGroup;
            objArr[i2] = searchMixXiGuaVideoViewHolder;
            ChangeQuickRedirect changeQuickRedirect = XiGuaVideoItemViewHolder.a.f43070a;
            Class[] clsArr = new Class[i3];
            clsArr[0] = ViewGroup.class;
            clsArr[i2] = SearchMixXiGuaVideoViewHolder.class;
            if (PatchProxy.isSupport(objArr, aVar3, changeQuickRedirect, false, 38127, clsArr, XiGuaVideoItemViewHolder.class)) {
                Object[] objArr2 = new Object[i3];
                objArr2[0] = viewGroup;
                objArr2[i2] = searchMixXiGuaVideoViewHolder;
                ChangeQuickRedirect changeQuickRedirect2 = XiGuaVideoItemViewHolder.a.f43070a;
                Class[] clsArr2 = new Class[i3];
                clsArr2[0] = ViewGroup.class;
                clsArr2[i2] = SearchMixXiGuaVideoViewHolder.class;
                xiGuaVideoItemViewHolder = (XiGuaVideoItemViewHolder) PatchProxy.accessDispatch(objArr2, aVar3, changeQuickRedirect2, false, 38127, clsArr2, XiGuaVideoItemViewHolder.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a08, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
                xiGuaVideoItemViewHolder = new XiGuaVideoItemViewHolder(inflate);
            }
            this.g.addView(xiGuaVideoItemViewHolder.itemView);
            Intrinsics.checkExpressionValueIsNotNull(next, "searchVideo");
            Object[] objArr3 = new Object[i3];
            objArr3[0] = next;
            objArr3[i2] = searchResultParam2;
            ChangeQuickRedirect changeQuickRedirect3 = XiGuaVideoItemViewHolder.f43066c;
            Class[] clsArr3 = new Class[i3];
            clsArr3[0] = SearchXiGuaVideo.class;
            clsArr3[i2] = SearchResultParam.class;
            if (PatchProxy.isSupport(objArr3, xiGuaVideoItemViewHolder, changeQuickRedirect3, false, 38126, clsArr3, Void.TYPE)) {
                Object[] objArr4 = new Object[i3];
                objArr4[0] = next;
                objArr4[i2] = searchResultParam2;
                ChangeQuickRedirect changeQuickRedirect4 = XiGuaVideoItemViewHolder.f43066c;
                Class[] clsArr4 = new Class[i3];
                clsArr4[0] = SearchXiGuaVideo.class;
                clsArr4[i2] = SearchResultParam.class;
                PatchProxy.accessDispatch(objArr4, xiGuaVideoItemViewHolder, changeQuickRedirect4, false, 38126, clsArr4, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(next, "videoItem");
                XiGuaVideo video = next.getVideo();
                if (video != null) {
                    c.b(xiGuaVideoItemViewHolder.f43068e, video.getCover());
                    View view = xiGuaVideoItemViewHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    xiGuaVideoItemViewHolder.g.setText(com.ss.android.ugc.aweme.base.utils.a.a(view.getContext(), video.getDesc(), next.getPosition()));
                    View view2 = xiGuaVideoItemViewHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    String d2 = eo.d(view2.getContext(), video.getCreateTime() * 1000);
                    DmtTextView dmtTextView = xiGuaVideoItemViewHolder.h;
                    StringBuilder sb = new StringBuilder();
                    View view3 = xiGuaVideoItemViewHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                    Context context = view3.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                    Resources resources = context.getResources();
                    Object[] objArr5 = new Object[i2];
                    objArr5[0] = b.a(video.getPlayCount());
                    sb.append(resources.getString(C0906R.string.dug, objArr5));
                    sb.append("  ");
                    sb.append(d2);
                    dmtTextView.setText(sb.toString());
                    DmtTextView dmtTextView2 = xiGuaVideoItemViewHolder.f43069f;
                    XiGuaVideoItemViewHolder.a aVar4 = XiGuaVideoItemViewHolder.i;
                    long duration = video.getDuration() * 1000;
                    Object[] objArr6 = new Object[i2];
                    objArr6[0] = new Long(duration);
                    ChangeQuickRedirect changeQuickRedirect5 = XiGuaVideoItemViewHolder.a.f43070a;
                    Class[] clsArr5 = new Class[i2];
                    clsArr5[0] = Long.TYPE;
                    if (PatchProxy.isSupport(objArr6, aVar4, changeQuickRedirect5, false, 38128, clsArr5, String.class)) {
                        Object[] objArr7 = new Object[i2];
                        objArr7[0] = new Long(duration);
                        ChangeQuickRedirect changeQuickRedirect6 = XiGuaVideoItemViewHolder.a.f43070a;
                        Class[] clsArr6 = new Class[i2];
                        clsArr6[0] = Long.TYPE;
                        str = (String) PatchProxy.accessDispatch(objArr7, aVar4, changeQuickRedirect6, false, 38128, clsArr6, String.class);
                    } else {
                        Object[] objArr8 = new Object[i3];
                        objArr8[0] = Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(duration) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(duration)));
                        objArr8[1] = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(duration) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
                        str = String.format("%02d:%02d", Arrays.copyOf(objArr8, 2));
                        Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(format, *args)");
                    }
                    dmtTextView2.setText(str);
                    xiGuaVideoItemViewHolder.itemView.setOnClickListener(new XiGuaVideoItemViewHolder.b(xiGuaVideoItemViewHolder, video, searchResultParam2));
                    i2 = 1;
                    i3 = 2;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av(@NotNull SearchMixXiGuaVideoViewHolder searchMixXiGuaVideoViewHolder, @NotNull View view, @NotNull Context context, @Nullable ap.a aVar) {
        super(view, context, aVar);
        Intrinsics.checkParameterIsNotNull(searchMixXiGuaVideoViewHolder, "cardViewHolder");
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.j = searchMixXiGuaVideoViewHolder;
        this.f3077d.setText(C0906R.string.c2n);
        this.f3078e.setText(C0906R.string.c3g);
    }
}
