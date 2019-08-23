package com.ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.poi.a.f;
import com.ss.android.ugc.aweme.poi.a.g;
import com.ss.android.ugc.aweme.poi.a.i;
import com.ss.android.ugc.aweme.poi.a.j;
import com.ss.android.ugc.aweme.poi.a.l;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommentMoreViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommentViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommonBannerViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductInfoViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiMultipleTourProductViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiMultipleTourProductViewHolder$bind$1;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendPoiViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendPoiViewHolder$bind$2;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiSingleTourProductViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiTourProductAdapter;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiVideoViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.m;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.al;
import com.ss.android.ugc.aweme.poi.model.am;
import com.ss.android.ugc.aweme.poi.model.aw;
import com.ss.android.ugc.aweme.poi.model.o;
import com.ss.android.ugc.aweme.poi.ui.SpaceDecoration;
import com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentDetailActivity;
import com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentPresenter;
import com.ss.android.ugc.aweme.poi.ui.comment.d;
import com.ss.android.ugc.aweme.poi.ui.detail.PoiDetailWithoutMapFragment;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

public class PoiAwemeFeedAdapter extends FeedAdapter<b> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f59416f;
    public a A;
    public int B = 3;
    public PoiDetailHeaderInfoPresenter.a C;
    public a D;
    public int E;
    public PoiOptimizedDetailViewHolder g;
    public c h;
    public AbsFragment z;

    public interface a {
        boolean b();
    }

    public final boolean j() {
        return true;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        boolean z2;
        int i4 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f59416f, false, 64739, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f59416f, false, 64739, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getBasicItemViewType(i4) == 112) {
            if (this.g != null) {
                PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = this.g;
                b bVar = (b) this.mItems.get(i4);
                c cVar = this.h;
                if (PatchProxy.isSupport(new Object[]{bVar, cVar}, poiOptimizedDetailViewHolder, PoiOptimizedDetailViewHolder.f59577a, false, 64857, new Class[]{b.class, c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar, cVar}, poiOptimizedDetailViewHolder, PoiOptimizedDetailViewHolder.f59577a, false, 64857, new Class[]{b.class, c.class}, Void.TYPE);
                } else {
                    poiOptimizedDetailViewHolder.f59581e = cVar;
                    poiOptimizedDetailViewHolder.a((PoiDetail) bVar);
                }
            }
        } else if (getBasicItemViewType(i4) == 128) {
            PoiCommentViewHolder poiCommentViewHolder = (PoiCommentViewHolder) viewHolder;
            o oVar = (o) this.mItems.get(i4);
            int i5 = this.B;
            c cVar2 = this.h;
            if (PatchProxy.isSupport(new Object[]{oVar, Integer.valueOf(i5), cVar2}, poiCommentViewHolder, PoiCommentViewHolder.f59524a, false, 64805, new Class[]{o.class, Integer.TYPE, c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{oVar, Integer.valueOf(i5), cVar2}, poiCommentViewHolder, PoiCommentViewHolder.f59524a, false, 64805, new Class[]{o.class, Integer.TYPE, c.class}, Void.TYPE);
                return;
            }
            poiCommentViewHolder.f59527d = oVar;
            poiCommentViewHolder.g = cVar2;
            PoiCommentPresenter poiCommentPresenter = poiCommentViewHolder.h;
            if (PatchProxy.isSupport(new Object[]{oVar, Integer.valueOf(i5), cVar2}, poiCommentPresenter, PoiCommentPresenter.f60579a, false, 66283, new Class[]{o.class, Integer.TYPE, c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{oVar, Integer.valueOf(i5), cVar2}, poiCommentPresenter, PoiCommentPresenter.f60579a, false, 66283, new Class[]{o.class, Integer.TYPE, c.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) poiCommentPresenter.mAvatarImg, oVar.avatar, 100, 100);
                poiCommentPresenter.mTxtUserName.setText(oVar.nickname);
                if (i5 == 0) {
                    poiCommentPresenter.mTxtContainer.b();
                } else if (i5 == 3) {
                    poiCommentPresenter.mTxtContainer.a();
                } else if (i5 == 9) {
                    poiCommentPresenter.mTxtContainer.a(oVar.expand);
                }
                poiCommentPresenter.mTxtContainer.setText(oVar.content);
                if (i5 == 3) {
                    poiCommentPresenter.mTxtContainer.a((View.OnClickListener) new com.ss.android.ugc.aweme.poi.ui.comment.c(poiCommentPresenter, cVar2, oVar));
                    poiCommentPresenter.mImagesList.setVisibility(8);
                    poiCommentPresenter.mImagesLayout.setVisibility(0);
                    poiCommentPresenter.mImagesLayout.removeAllViews();
                    if (oVar.getImages() != null && oVar.getImages().size() > 0) {
                        poiCommentPresenter.a(oVar, cVar2);
                    }
                } else {
                    poiCommentPresenter.mTxtContainer.setOnExpandStateChangeListener(new d(oVar));
                    poiCommentPresenter.mImagesLayout.setVisibility(8);
                    poiCommentPresenter.mImagesList.setVisibility(0);
                    PoiCommentImageAdapter poiCommentImageAdapter = poiCommentPresenter.f60580b;
                    List images = oVar.getImages();
                    List list = images;
                    if (PatchProxy.isSupport(new Object[]{images, Integer.valueOf(i5), cVar2}, poiCommentImageAdapter, PoiCommentImageAdapter.f59421a, false, 64765, new Class[]{List.class, Integer.TYPE, c.class}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i5), cVar2}, poiCommentImageAdapter, PoiCommentImageAdapter.f59421a, false, 64765, new Class[]{List.class, Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        poiCommentImageAdapter.f59425e = cVar2;
                        if (list == null || list.size() == 0) {
                            z2 = false;
                        } else {
                            poiCommentImageAdapter.f59422b = list.subList(0, Math.min(list.size(), 12));
                            poiCommentImageAdapter.f59423c = poiCommentImageAdapter.f59422b.size();
                            if (i5 == 3) {
                                poiCommentImageAdapter.f59424d = Math.min(3, poiCommentImageAdapter.f59423c);
                            } else if (i5 != 9) {
                                poiCommentImageAdapter.f59424d = poiCommentImageAdapter.f59423c;
                            } else {
                                poiCommentImageAdapter.f59424d = Math.min(9, poiCommentImageAdapter.f59423c);
                            }
                            poiCommentImageAdapter.notifyDataSetChanged();
                            z2 = true;
                        }
                    }
                    if (z2) {
                        poiCommentPresenter.mImagesList.setVisibility(0);
                    } else {
                        poiCommentPresenter.mImagesList.setVisibility(8);
                    }
                }
                if (oVar.cost > 0.0d) {
                    poiCommentPresenter.mTxtPrice.setVisibility(0);
                    poiCommentPresenter.mTxtPrice.setText(String.format(poiCommentPresenter.f60581c.getResources().getString(C0906R.string.bo9), new Object[]{String.valueOf(Math.round(oVar.cost))}));
                    i3 = 8;
                } else {
                    i3 = 8;
                    poiCommentPresenter.mTxtPrice.setVisibility(8);
                }
                if (StringUtils.isEmpty(oVar.src)) {
                    poiCommentPresenter.mTxtFrom.setVisibility(i3);
                } else {
                    poiCommentPresenter.mTxtFrom.setVisibility(0);
                    poiCommentPresenter.mTxtFrom.setText(oVar.src);
                }
            }
            if (poiCommentViewHolder.f59527d.hasDivider()) {
                PoiCommentPresenter poiCommentPresenter2 = poiCommentViewHolder.h;
                if (PatchProxy.isSupport(new Object[0], poiCommentPresenter2, PoiCommentPresenter.f60579a, false, 66282, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], poiCommentPresenter2, PoiCommentPresenter.f60579a, false, 66282, new Class[0], Void.TYPE);
                } else {
                    poiCommentPresenter2.mDivider.setVisibility(0);
                }
            }
            poiCommentViewHolder.f59526c.setOnClickListener(new View.OnClickListener(i5, oVar, cVar2) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59532a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f59533b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ o f59534c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ c f59535d;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f59532a, false, 64817, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f59532a, false, 64817, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (this.f59533b == 3) {
                        h.a(PoiCommentViewHolder.this.g, "outer_section_click", com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "poi_page").a("previous_page", PoiCommentViewHolder.this.g.getPreviousPage()).a("poi_id", PoiCommentViewHolder.this.g.getPoiId()).a("poi_channel", PoiCommentViewHolder.this.g.getPoiChannel()));
                        this.f59534c.setPoiId(PoiCommentViewHolder.this.g.getPoiId());
                        PoiCommentDetailActivity.a(PoiCommentViewHolder.this.f59525b, this.f59534c, this.f59535d);
                    }
                }

                {
                    this.f59533b = r2;
                    this.f59534c = r3;
                    this.f59535d = r4;
                }
            });
        } else if (getBasicItemViewType(i4) == 144) {
            ((PoiCateTitleViewHolder) viewHolder).a((com.ss.android.ugc.aweme.poi.a.d) this.mItems.get(i4), this.h, this.A);
        } else if (getBasicItemViewType(i4) == 145) {
            com.ss.android.ugc.aweme.poi.a.c cVar3 = (com.ss.android.ugc.aweme.poi.a.c) this.mItems.get(i4);
            cVar3.aid = this.h.getAwemeId();
            ((PoiCateMoreViewHolder) viewHolder).a(cVar3, true, i4, this.A);
        } else if (getBasicItemViewType(i4) == 160) {
            ((PoiCateTitleViewHolder) viewHolder).a((com.ss.android.ugc.aweme.poi.a.d) this.mItems.get(i4), this.h, this.A);
        } else if (getBasicItemViewType(i4) == 161) {
            ((PoiCateMoreViewHolder) viewHolder).a((com.ss.android.ugc.aweme.poi.a.c) this.mItems.get(i4), false, i4, this.A);
        } else if (getBasicItemViewType(i4) == 162) {
            PoiCommentMoreViewHolder poiCommentMoreViewHolder = (PoiCommentMoreViewHolder) viewHolder;
            f fVar = (f) this.mItems.get(i4);
            if (PatchProxy.isSupport(new Object[]{fVar}, poiCommentMoreViewHolder, PoiCommentMoreViewHolder.f59517a, false, 64802, new Class[]{f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, poiCommentMoreViewHolder, PoiCommentMoreViewHolder.f59517a, false, 64802, new Class[]{f.class}, Void.TYPE);
                return;
            }
            if (!StringUtils.isEmpty(fVar.commentUrl)) {
                poiCommentMoreViewHolder.mTxtMore.setOnClickListener(new View.OnClickListener(fVar) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f59519a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ f f59520b;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f59519a, false, 64803, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f59519a, false, 64803, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (!NetworkUtils.isNetworkAvailable(PoiCommentMoreViewHolder.this.f59518b)) {
                            a.b(PoiCommentMoreViewHolder.this.f59518b, (int) C0906R.string.bgf).a();
                            return;
                        }
                        Intent intent = new Intent(PoiCommentMoreViewHolder.this.f59518b, CrossPlatformActivity.class);
                        intent.setData(Uri.parse(this.f59520b.commentUrl));
                        intent.putExtra("show_closeall", true);
                        intent.putExtra(PushConstants.TITLE, PoiCommentMoreViewHolder.this.f59518b.getResources().getString(C0906R.string.bny));
                        PoiCommentMoreViewHolder.this.f59518b.startActivity(intent);
                    }

                    {
                        this.f59520b = r2;
                    }
                });
            }
        } else {
            String str = null;
            if (getBasicItemViewType(i4) == 163) {
                PoiRecommendViewHolder poiRecommendViewHolder = (PoiRecommendViewHolder) viewHolder;
                i iVar = (i) this.mItems.get(i4);
                c cVar4 = this.h;
                if (PatchProxy.isSupport(new Object[]{iVar, cVar4}, poiRecommendViewHolder, PoiRecommendViewHolder.f59626a, false, 64897, new Class[]{i.class, c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iVar, cVar4}, poiRecommendViewHolder, PoiRecommendViewHolder.f59626a, false, 64897, new Class[]{i.class, c.class}, Void.TYPE);
                    return;
                }
                if (poiRecommendViewHolder.f59628c == null) {
                    poiRecommendViewHolder.f59629d = cVar4;
                    poiRecommendViewHolder.f59628c = iVar;
                    aw poiType = aw.getPoiType(iVar.f59403c);
                    if (!CollectionUtils.isEmpty(iVar.f59402b)) {
                        String str2 = iVar.f59404d;
                        List<al> list2 = iVar.f59402b;
                        if (PatchProxy.isSupport(new Object[]{str2, list2}, poiRecommendViewHolder, PoiRecommendViewHolder.f59626a, false, 64899, new Class[]{String.class, List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str2, list2}, poiRecommendViewHolder, PoiRecommendViewHolder.f59626a, false, 64899, new Class[]{String.class, List.class}, Void.TYPE);
                        } else {
                            View inflate = LayoutInflater.from(poiRecommendViewHolder.f59627b).inflate(C0906R.layout.oz, null, false);
                            poiRecommendViewHolder.mRecommendLayout.addView(inflate, new LinearLayout.LayoutParams(-1, -2));
                            TextView textView = (TextView) inflate.findViewById(C0906R.id.c16);
                            TextView textView2 = (TextView) inflate.findViewById(C0906R.id.c17);
                            if (!poiRecommendViewHolder.f59628c.f59405e) {
                                textView.setVisibility(8);
                                textView2.setVisibility(0);
                                textView2.setText(str2);
                            } else {
                                textView.setText(str2);
                            }
                            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0906R.id.c14);
                            recyclerView.setLayoutManager(new WrapLinearLayoutManager(poiRecommendViewHolder.f59627b, 0, false));
                            recyclerView.addItemDecoration(new SpaceDecoration(poiRecommendViewHolder.f59627b.getResources().getDimensionPixelOffset(C0906R.dimen.kp)));
                            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f59634a;

                                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f59634a, false, 64901, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f59634a, false, 64901, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    super.onScrollStateChanged(recyclerView, i);
                                    if (i == 0) {
                                        r.a((Context) null, "cell_slide", "slide", 0, 0);
                                        com.ss.android.ugc.aweme.poi.preview.a.a(PoiRecommendViewHolder.this.f59629d, "recommend");
                                    }
                                }
                            });
                            poiRecommendViewHolder.f59630e = new RecommendImageAdapter(poiRecommendViewHolder.f59627b, recyclerView, list2, poiRecommendViewHolder.f59629d);
                            recyclerView.setAdapter(poiRecommendViewHolder.f59630e);
                        }
                    } else if (aw.POI_TYPE_RESTAURANT == poiType && !CollectionUtils.isEmpty(iVar.f59401a)) {
                        List<String> list3 = iVar.f59401a;
                        if (PatchProxy.isSupport(new Object[]{list3}, poiRecommendViewHolder, PoiRecommendViewHolder.f59626a, false, 64898, new Class[]{List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list3}, poiRecommendViewHolder, PoiRecommendViewHolder.f59626a, false, 64898, new Class[]{List.class}, Void.TYPE);
                            return;
                        }
                        View inflate2 = LayoutInflater.from(poiRecommendViewHolder.f59627b).inflate(C0906R.layout.p0, null, false);
                        poiRecommendViewHolder.mRecommendLayout.addView(inflate2, new LinearLayout.LayoutParams(-1, -2));
                        TextView textView3 = (TextView) inflate2.findViewById(C0906R.id.c16);
                        TextView textView4 = (TextView) inflate2.findViewById(C0906R.id.c17);
                        if (!poiRecommendViewHolder.f59628c.f59405e) {
                            textView3.setVisibility(8);
                            textView4.setVisibility(0);
                        }
                        TagFlowLayout tagFlowLayout = (TagFlowLayout) inflate2.findViewById(C0906R.id.c15);
                        tagFlowLayout.setAdapter(new com.ss.android.ugc.aweme.widget.flowlayout.a<String>(list3, tagFlowLayout) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f59631a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ TagFlowLayout f59632b;

                            {
                                this.f59632b = r3;
                            }

                            public final /* synthetic */ View a(FlowLayout flowLayout, int i, Object obj) {
                                String str = (String) obj;
                                if (PatchProxy.isSupport(new Object[]{flowLayout, Integer.valueOf(i), str}, this, f59631a, false, 64900, new Class[]{FlowLayout.class, Integer.TYPE, String.class}, View.class)) {
                                    return (View) PatchProxy.accessDispatch(new Object[]{flowLayout, Integer.valueOf(i), str}, this, f59631a, false, 64900, new Class[]{FlowLayout.class, Integer.TYPE, String.class}, View.class);
                                }
                                TextView textView = (TextView) LayoutInflater.from(PoiRecommendViewHolder.this.f59627b).inflate(C0906R.layout.yy, this.f59632b, false);
                                textView.setText(str);
                                return textView;
                            }
                        });
                    }
                }
            } else if (getBasicItemViewType(i4) == 165) {
                PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder = (PoiDcdProductInfoViewHolder) viewHolder;
                g gVar = (g) this.mItems.get(i4);
                c cVar5 = this.h;
                if (PatchProxy.isSupport(new Object[]{gVar, cVar5}, poiDcdProductInfoViewHolder, PoiDcdProductInfoViewHolder.f59547a, false, 64822, new Class[]{g.class, c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{gVar, cVar5}, poiDcdProductInfoViewHolder, PoiDcdProductInfoViewHolder.f59547a, false, 64822, new Class[]{g.class, c.class}, Void.TYPE);
                    return;
                }
                if (!(poiDcdProductInfoViewHolder.f59550d != null || gVar == null || gVar.productInfo == null)) {
                    poiDcdProductInfoViewHolder.f59550d = gVar;
                    am amVar = poiDcdProductInfoViewHolder.f59550d.productInfo;
                    poiDcdProductInfoViewHolder.mTitle.setText(amVar.title);
                    poiDcdProductInfoViewHolder.mAllProduct.setText(amVar.urlTitle);
                    if (!CollectionUtils.isEmpty(amVar.products)) {
                        PoiProductAdapter poiProductAdapter = new PoiProductAdapter(amVar, cVar5);
                        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(poiDcdProductInfoViewHolder.itemView.getContext());
                        wrapLinearLayoutManager.setOrientation(0);
                        poiDcdProductInfoViewHolder.mProductList.addItemDecoration(new RecyclerView.ItemDecoration() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f59551a;

                            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                                Rect rect2 = rect;
                                View view2 = view;
                                RecyclerView recyclerView2 = recyclerView;
                                if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f59551a, false, 64824, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                                    Object[] objArr = {rect2, view2, recyclerView2, state};
                                    Object[] objArr2 = objArr;
                                    PatchProxy.accessDispatch(objArr2, this, f59551a, false, 64824, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                                    return;
                                }
                                super.getItemOffsets(rect, view, recyclerView, state);
                                int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                                if (childAdapterPosition >= 0) {
                                    if (childAdapterPosition == 0) {
                                        rect2.left = (int) UIUtils.dip2Px(recyclerView.getContext(), 16.0f);
                                    } else if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
                                        rect2.right = (int) UIUtils.dip2Px(recyclerView.getContext(), 16.0f);
                                        return;
                                    }
                                    rect2.right = (int) UIUtils.dip2Px(recyclerView.getContext(), 6.0f);
                                }
                            }
                        });
                        poiDcdProductInfoViewHolder.mProductList.addOnScrollListener(new RecyclerView.OnScrollListener(cVar5) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f59553a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ c f59554b;

                            {
                                this.f59554b = r2;
                            }

                            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f59553a, false, 64825, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f59553a, false, 64825, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (PoiDcdProductInfoViewHolder.this.f59548b != i && i == 0) {
                                    h.a(this.f59554b, "project_card_slide", com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "poi_page").a("poi_id", PoiDcdProductInfoViewHolder.this.f59550d.poiId).a("content_type", PoiDcdProductInfoViewHolder.this.f59550d.getSpSource()));
                                }
                                PoiDcdProductInfoViewHolder.this.f59548b = i;
                            }
                        });
                        poiDcdProductInfoViewHolder.mProductList.setLayoutManager(wrapLinearLayoutManager);
                        poiDcdProductInfoViewHolder.mProductList.setAdapter(poiProductAdapter);
                    }
                    poiDcdProductInfoViewHolder.mAllProductContainer.setOnClickListener(new com.ss.android.ugc.aweme.poi.adapter.viewholder.b(poiDcdProductInfoViewHolder, amVar, cVar5));
                }
            } else if (getBasicItemViewType(i4) == 166) {
                ((PoiCommonBannerViewHolder) viewHolder).a((com.ss.android.ugc.aweme.poi.a.b) this.mItems.get(i4), this.h);
            } else if (getBasicItemViewType(i4) == 168) {
                PoiRecommendPoiViewHolder poiRecommendPoiViewHolder = (PoiRecommendPoiViewHolder) viewHolder;
                j jVar = (j) this.mItems.get(i4);
                c cVar6 = this.h;
                if (PatchProxy.isSupport(new Object[]{jVar, cVar6}, poiRecommendPoiViewHolder, PoiRecommendPoiViewHolder.f59613a, false, 64892, new Class[]{j.class, c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{jVar, cVar6}, poiRecommendPoiViewHolder, PoiRecommendPoiViewHolder.f59613a, false, 64892, new Class[]{j.class, c.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(jVar, "poiRecommendItem");
                poiRecommendPoiViewHolder.f59615c.setText(jVar.title());
                if (!jVar.hasMore()) {
                    poiRecommendPoiViewHolder.f59616d.setVisibility(8);
                } else {
                    poiRecommendPoiViewHolder.f59616d.setVisibility(0);
                    poiRecommendPoiViewHolder.f59616d.setOnClickListener(new PoiRecommendPoiViewHolder.a(poiRecommendPoiViewHolder, jVar, cVar6));
                }
                poiRecommendPoiViewHolder.k = jVar.list();
                poiRecommendPoiViewHolder.l = Integer.valueOf(jVar.getRecommendType().intValue());
                poiRecommendPoiViewHolder.m = cVar6;
                if (!poiRecommendPoiViewHolder.i) {
                    poiRecommendPoiViewHolder.j = new WrapLinearLayoutManager(poiRecommendPoiViewHolder.f59614b, 0, false);
                    poiRecommendPoiViewHolder.f59617e.setLayoutManager(poiRecommendPoiViewHolder.j);
                    poiRecommendPoiViewHolder.f59617e.addItemDecoration(new SpaceDecoration(poiRecommendPoiViewHolder.f59614b.getResources().getDimensionPixelOffset(C0906R.dimen.kp), u.a(6.0d)));
                    poiRecommendPoiViewHolder.i = true;
                }
                poiRecommendPoiViewHolder.f59617e.addOnScrollListener(new PoiRecommendPoiViewHolder$bind$2(cVar6, jVar));
                poiRecommendPoiViewHolder.h = new RecommendPoiAdapter(poiRecommendPoiViewHolder.k, cVar6, jVar.getRecommendType(), jVar.title());
                poiRecommendPoiViewHolder.f59617e.setAdapter(poiRecommendPoiViewHolder.h);
                if (jVar.getHideDivider()) {
                    i2 = 8;
                    poiRecommendPoiViewHolder.g.setVisibility(8);
                } else {
                    i2 = 8;
                    poiRecommendPoiViewHolder.g.setVisibility(0);
                }
                if (jVar.getHideTopDivider()) {
                    poiRecommendPoiViewHolder.f59618f.setVisibility(i2);
                } else {
                    poiRecommendPoiViewHolder.f59618f.setVisibility(0);
                }
            } else {
                int i6 = 8;
                if (getBasicItemViewType(i4) == 169) {
                    PoiSingleTourProductViewHolder poiSingleTourProductViewHolder = (PoiSingleTourProductViewHolder) viewHolder;
                    l lVar = (l) this.mItems.get(i4);
                    c cVar7 = this.h;
                    if (PatchProxy.isSupport(new Object[]{lVar, cVar7}, poiSingleTourProductViewHolder, PoiSingleTourProductViewHolder.f59638a, false, 64903, new Class[]{l.class, c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{lVar, cVar7}, poiSingleTourProductViewHolder, PoiSingleTourProductViewHolder.f59638a, false, 64903, new Class[]{l.class, c.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(lVar, "ad");
                    View view = poiSingleTourProductViewHolder.f59641d;
                    if (lVar.f59413d) {
                        i6 = 0;
                    }
                    view.setVisibility(i6);
                    poiSingleTourProductViewHolder.f59640c.setText(lVar.f59412c);
                    m mVar = poiSingleTourProductViewHolder.f59643f;
                    List<? extends AwemeRawAd> list4 = lVar.f59411b;
                    if (list4 == null) {
                        Intrinsics.throwNpe();
                    }
                    mVar.a((AwemeRawAd) list4.get(0), cVar7);
                    if (!poiSingleTourProductViewHolder.f59642e) {
                        if (TextUtils.isEmpty(cVar7 != null ? cVar7.getAwemeId() : null)) {
                            Context context = poiSingleTourProductViewHolder.f59639b;
                            AwemeRawAd a2 = lVar.a();
                            if (cVar7 != null) {
                                str = cVar7.getPoiId();
                            }
                            com.ss.android.ugc.aweme.commercialize.log.g.c(context, a2, str);
                        }
                        poiSingleTourProductViewHolder.f59642e = true;
                    }
                } else if (getBasicItemViewType(i4) == 170) {
                    PoiMultipleTourProductViewHolder poiMultipleTourProductViewHolder = (PoiMultipleTourProductViewHolder) viewHolder;
                    l lVar2 = (l) this.mItems.get(i4);
                    c cVar8 = this.h;
                    if (PatchProxy.isSupport(new Object[]{lVar2, cVar8}, poiMultipleTourProductViewHolder, PoiMultipleTourProductViewHolder.f59568a, false, 64841, new Class[]{l.class, c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{lVar2, cVar8}, poiMultipleTourProductViewHolder, PoiMultipleTourProductViewHolder.f59568a, false, 64841, new Class[]{l.class, c.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(lVar2, "ad");
                    if (poiMultipleTourProductViewHolder.f59573f == null) {
                        poiMultipleTourProductViewHolder.h = cVar8;
                        poiMultipleTourProductViewHolder.f59573f = lVar2;
                        View view2 = poiMultipleTourProductViewHolder.f59570c;
                        if (lVar2.f59413d) {
                            i6 = 0;
                        }
                        view2.setVisibility(i6);
                        poiMultipleTourProductViewHolder.f59571d.setText(lVar2.f59412c);
                        poiMultipleTourProductViewHolder.g = new LinearLayoutManager(poiMultipleTourProductViewHolder.f59569b, 0, false);
                        poiMultipleTourProductViewHolder.f59572e.setLayoutManager(poiMultipleTourProductViewHolder.g);
                        int dimensionPixelOffset = poiMultipleTourProductViewHolder.f59569b.getResources().getDimensionPixelOffset(C0906R.dimen.kp);
                        poiMultipleTourProductViewHolder.f59572e.addItemDecoration(new SpaceDecoration(dimensionPixelOffset, dimensionPixelOffset));
                        RecyclerView recyclerView2 = poiMultipleTourProductViewHolder.f59572e;
                        Context context2 = poiMultipleTourProductViewHolder.f59569b;
                        l lVar3 = poiMultipleTourProductViewHolder.f59573f;
                        if (lVar3 == null) {
                            Intrinsics.throwNpe();
                        }
                        List<? extends AwemeRawAd> list5 = lVar3.f59411b;
                        if (list5 == null) {
                            Intrinsics.throwNpe();
                        }
                        recyclerView2.setAdapter(new PoiTourProductAdapter(context2, list5, cVar8));
                        poiMultipleTourProductViewHolder.f59572e.addOnScrollListener(new PoiMultipleTourProductViewHolder$bind$1(poiMultipleTourProductViewHolder, cVar8));
                        if (TextUtils.isEmpty(cVar8 != null ? cVar8.getAwemeId() : null)) {
                            Context context3 = poiMultipleTourProductViewHolder.f59569b;
                            AwemeRawAd a3 = lVar2.a();
                            if (cVar8 != null) {
                                str = cVar8.getPoiId();
                            }
                            com.ss.android.ugc.aweme.commercialize.log.g.c(context3, a3, str);
                        }
                    }
                } else {
                    super.onBindBasicViewHolder(viewHolder, i);
                }
            }
        }
    }

    public final void B_() {
        if (PatchProxy.isSupport(new Object[0], this, f59416f, false, 64746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59416f, false, 64746, new Class[0], Void.TYPE);
            return;
        }
        super.B_();
        if (this.g != null) {
            this.g.b();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f59416f, false, 64747, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59416f, false, 64747, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (this.g != null) {
            this.g.a();
        }
    }

    public final boolean k() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f59416f, false, 64754, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59416f, false, 64754, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.D == null) {
            return super.k();
        } else {
            if (!this.D.b()) {
                z2 = true;
            }
            return z2;
        }
    }

    public final BaseFollowViewHolder a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f59416f, false, 64742, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class)) {
            return (BaseFollowViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f59416f, false, 64742, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class);
        }
        PoiVideoViewHolder poiVideoViewHolder = new PoiVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.h, this.r, this.j, this.o, this.q);
        poiVideoViewHolder.V = this;
        return poiVideoViewHolder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f59416f
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 64751(0xfcef, float:9.0735E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0041
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f59416f
            r3 = 0
            r4 = 64751(0xfcef, float:9.0735E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0041:
            int r0 = r9.getItemCount()
            int r0 = r0 - r7
            r1 = 17
            r2 = 16
            if (r10 >= r0) goto L_0x0067
            int r0 = r9.getItemViewType(r10)
            if (r0 == r2) goto L_0x0058
            int r0 = r9.getItemViewType(r10)
            if (r0 != r1) goto L_0x007b
        L_0x0058:
            int r0 = r10 + 1
            int r3 = r9.getItemViewType(r0)
            if (r3 == r2) goto L_0x007b
            int r0 = r9.getItemViewType(r0)
            if (r0 == r1) goto L_0x007b
            return r8
        L_0x0067:
            int r0 = r9.getItemCount()
            int r0 = r0 - r7
            if (r10 != r0) goto L_0x007b
            int r0 = r9.getItemViewType(r10)
            if (r0 == r2) goto L_0x007a
            int r0 = r9.getItemViewType(r10)
            if (r0 != r1) goto L_0x007b
        L_0x007a:
            return r8
        L_0x007b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter.d(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r1 >= getItemCount()) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        r8 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setData(java.util.List<com.ss.android.ugc.aweme.newfollow.e.b> r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f59416f
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 64753(0xfcf1, float:9.0738E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f59416f
            r3 = 0
            r4 = 64753(0xfcf1, float:9.0738E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.util.List r0 = r9.a((java.util.List<T>) r10)
            super.setData(r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f59416f
            r3 = 0
            r4 = 64755(0xfcf3, float:9.0741E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0064
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f59416f
            r3 = 0
            r4 = 64755(0xfcf3, float:9.0741E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r8 = r0.intValue()
            goto L_0x008b
        L_0x0064:
            int r0 = r9.getItemCount()
            if (r0 != 0) goto L_0x006b
            goto L_0x008b
        L_0x006b:
            r0 = 0
            r1 = 0
        L_0x006d:
            int r2 = r9.getItemCount()
            if (r0 >= r2) goto L_0x008a
            int r2 = r9.getItemViewType(r0)
            r3 = 16
            if (r2 != r3) goto L_0x0082
            int r0 = r9.getItemCount()
            if (r1 < r0) goto L_0x008a
            goto L_0x008b
        L_0x0082:
            r3 = -1
            if (r2 == r3) goto L_0x0087
            int r1 = r1 + 1
        L_0x0087:
            int r0 = r0 + 1
            goto L_0x006d
        L_0x008a:
            r8 = r1
        L_0x008b:
            r9.E = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter.setData(java.util.List):void");
    }

    public int getBasicItemViewType(int i) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59416f, false, 64743, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59416f, false, 64743, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int basicItemViewType = super.getBasicItemViewType(i);
        if (basicItemViewType != -1) {
            return basicItemViewType;
        }
        b bVar = (b) this.mItems.get(i);
        if (bVar.getFeedType() == 65441) {
            return SearchJediMixFeedAdapter.f42516e;
        }
        if (bVar.getFeedType() == 65442) {
            return SearchJediMixFeedAdapter.f42517f;
        }
        if (bVar.getFeedType() != 65443 || !(bVar instanceof com.ss.android.ugc.aweme.poi.a.d)) {
            if (bVar.getFeedType() != 65444 || !(bVar instanceof com.ss.android.ugc.aweme.poi.a.c)) {
                if (bVar.getFeedType() == 65445) {
                    return 162;
                }
                if (bVar.getFeedType() == 65446 && (bVar instanceof i)) {
                    return 163;
                }
                if (bVar.getFeedType() == 65448) {
                    return 165;
                }
                if (bVar.getFeedType() == 65449) {
                    return 166;
                }
                if (bVar.getFeedType() == 65451) {
                    return 168;
                }
                if (bVar.getFeedType() != 65452) {
                    return -1;
                }
                l lVar = (l) a(i);
                if (PatchProxy.isSupport(new Object[0], lVar, l.f59410a, false, 64940, new Class[0], Integer.class)) {
                    num = (Integer) PatchProxy.accessDispatch(new Object[0], lVar, l.f59410a, false, 64940, new Class[0], Integer.class);
                } else {
                    List<? extends AwemeRawAd> list = lVar.f59411b;
                    if (list != null) {
                        num = Integer.valueOf(list.size());
                    } else {
                        num = null;
                    }
                }
                if (num.intValue() == 1) {
                    return 169;
                }
                return 170;
            } else if (((com.ss.android.ugc.aweme.poi.a.c) bVar).isAweme) {
                return 145;
            } else {
                return 161;
            }
        } else if (((com.ss.android.ugc.aweme.poi.a.d) bVar).isAweme) {
            return SearchJediMixFeedAdapter.g;
        } else {
            return 160;
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Integer num;
        Integer num2;
        String str;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f59416f, false, 64745, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f59416f, false, 64745, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder2 instanceof PoiRecommendPoiViewHolder) {
            PoiRecommendPoiViewHolder poiRecommendPoiViewHolder = (PoiRecommendPoiViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], poiRecommendPoiViewHolder, PoiRecommendPoiViewHolder.f59613a, false, 64893, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], poiRecommendPoiViewHolder, PoiRecommendPoiViewHolder.f59613a, false, 64893, new Class[0], Void.TYPE);
            } else if (!(poiRecommendPoiViewHolder.l == null || poiRecommendPoiViewHolder.k == null)) {
                WrapLinearLayoutManager wrapLinearLayoutManager = poiRecommendPoiViewHolder.j;
                if (wrapLinearLayoutManager != null) {
                    num = Integer.valueOf(wrapLinearLayoutManager.findFirstVisibleItemPosition());
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    WrapLinearLayoutManager wrapLinearLayoutManager2 = poiRecommendPoiViewHolder.j;
                    if (wrapLinearLayoutManager2 != null) {
                        num2 = Integer.valueOf(wrapLinearLayoutManager2.findLastVisibleItemPosition());
                    } else {
                        num2 = null;
                    }
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        int i = intValue2 - 1;
                        if (intValue >= 0 && i >= intValue) {
                            List<? extends SimplePoiInfoStruct> list = poiRecommendPoiViewHolder.k;
                            if (list == null) {
                                Intrinsics.throwNpe();
                            }
                            if (intValue2 < list.size() && intValue <= intValue2) {
                                while (true) {
                                    c cVar = poiRecommendPoiViewHolder.m;
                                    if (cVar != null) {
                                        str = cVar.getPoiId();
                                    } else {
                                        str = null;
                                    }
                                    Integer num3 = poiRecommendPoiViewHolder.l;
                                    if (num3 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    int intValue3 = num3.intValue();
                                    if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(intValue3)}, poiRecommendPoiViewHolder, PoiRecommendPoiViewHolder.f59613a, false, 64894, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(intValue3)}, poiRecommendPoiViewHolder, PoiRecommendPoiViewHolder.f59613a, false, 64894, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                                    } else {
                                        h.a(poiRecommendPoiViewHolder.m, "poi_explore_card", com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "poi_page").a("enter_method", "show").a("poi_channel", aa.b()).a("poi_id", str).a("city_info", aa.a()).a("content_type", p.a(intValue3)));
                                    }
                                    if (intValue == intValue2) {
                                        break;
                                    }
                                    intValue++;
                                }
                            }
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        } else if (viewHolder2 instanceof PoiMultipleTourProductViewHolder) {
            ((PoiMultipleTourProductViewHolder) viewHolder2).a();
        }
    }

    public final void a(Aweme aweme, String str) {
        if (PatchProxy.isSupport(new Object[]{aweme, str}, this, f59416f, false, 64744, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str}, this, f59416f, false, 64744, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (aweme != null && TextUtils.equals(str, this.u) && ((LinearLayoutManager) this.s.getLayoutManager()) != null) {
            Iterator it2 = this.mItems.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                b bVar = (b) it2.next();
                Aweme aweme2 = bVar.getAweme();
                if (bVar.getFeedType() == 65280 && aweme2 != null && TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                    if (this.z != null && (this.z instanceof PoiDetailWithoutMapFragment)) {
                        ((PoiDetailWithoutMapFragment) this.z).a(this.mItems.indexOf(bVar), false);
                        return;
                    }
                }
            }
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f59416f, false, 64741, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f59416f, false, 64741, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 112) {
            if (this.g == null) {
                this.g = new PoiOptimizedDetailViewHolder(this.z, this.C, LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uh, viewGroup, false));
            }
            return this.g;
        } else if (i == 128) {
            FollowFeedLayout followFeedLayout = (FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uu, viewGroup, false);
            com.ss.android.ugc.aweme.forward.a.a aVar = this.r;
            com.ss.android.ugc.aweme.newfollow.util.l lVar = this.j;
            if (3 == this.B) {
                z2 = true;
            }
            return new PoiCommentViewHolder(followFeedLayout, aVar, lVar, z2);
        } else if (i == 144 || i == 160) {
            return new PoiCateTitleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ut, viewGroup, false));
        } else {
            if (i == 145 || i == 161) {
                return new PoiCateMoreViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.us, viewGroup, false));
            }
            if (i == 162) {
                return new PoiCommentMoreViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a7d, viewGroup, false));
            }
            if (i == 163) {
                return new PoiRecommendViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ui, viewGroup, false));
            }
            if (i == 165) {
                return new PoiDcdProductInfoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uw, viewGroup, false));
            }
            if (i == 166) {
                return new PoiCommonBannerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uv, viewGroup, false));
            }
            if (i == 168) {
                return new PoiRecommendPoiViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uj, viewGroup, false));
            }
            if (i == 169) {
                return new PoiSingleTourProductViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uk, viewGroup, false));
            }
            if (i == 170) {
                return new PoiMultipleTourProductViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ug, viewGroup, false));
            }
            return super.onCreateBasicViewHolder(viewGroup, i);
        }
    }

    public PoiAwemeFeedAdapter(RecyclerView recyclerView, com.ss.android.ugc.aweme.feed.d dVar, com.ss.android.ugc.aweme.newfollow.util.g gVar) {
        super(recyclerView, dVar, gVar);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i), list}, this, f59416f, false, 64740, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), list}, this, f59416f, false, 64740, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
        } else if (list == null || list.size() == 0) {
            int i2 = i;
            onBindViewHolder(viewHolder, i);
        } else {
            if (getBasicItemViewType(i) == 112) {
                ((PoiOptimizedDetailViewHolder) viewHolder).e();
            }
        }
    }
}
