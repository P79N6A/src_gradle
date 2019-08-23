package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.commercialize.model.n;
import com.ss.android.ugc.aweme.discover.model.MicroAppStruct;
import com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchCommodity;
import com.ss.android.ugc.aweme.discover.model.SearchMovie;
import com.ss.android.ugc.aweme.discover.model.SearchPoi;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchXiGuaVideo;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.util.ArrayList;
import java.util.List;

public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42540a;

    /* renamed from: b  reason: collision with root package name */
    public String f42541b;
    @SerializedName("comment_list")

    /* renamed from: c  reason: collision with root package name */
    public List<Comment> f42542c;
    @SerializedName("user_list")

    /* renamed from: d  reason: collision with root package name */
    public List<SearchUser> f42543d;
    @SerializedName("music_list")

    /* renamed from: e  reason: collision with root package name */
    public List<Music> f42544e;
    @SerializedName("challenge_list")

    /* renamed from: f  reason: collision with root package name */
    public List<SearchChallenge> f42545f;
    @SerializedName("has_top_user")
    public boolean g;
    @SerializedName("article_list")
    public List<com.ss.android.ugc.aweme.newfollow.e.a> h;
    @SerializedName("related_word_list")
    public List<RelatedSearchWordItem> i;
    @SerializedName("poi_info_list")
    public List<SearchPoi> j;
    @SerializedName("micro_app_info")
    public MicroAppStruct k;
    @SerializedName("goods_list")
    public List<SearchCommodity> l;
    @SerializedName("movie_info")
    public SearchMovie m;
    @SerializedName("has_more_goods")
    public boolean n;
    @SerializedName("xigua_video_list")
    public List<SearchXiGuaVideo> o;
    @SerializedName("view_more")
    public boolean p = true;
    @SerializedName("ad_data")
    @JsonAdapter(StringJsonAdapterFactory.class)
    public n q;
    @SerializedName("words_query_record")
    public RecommendWordMob r;
    public LogPbBean s;
    @SerializedName("type")
    private int t;
    @SerializedName("aweme_info")
    private Aweme u;

    public List<com.ss.android.ugc.aweme.newfollow.e.a> getArticleList() {
        return this.h;
    }

    public Aweme getAweme() {
        return this.u;
    }

    public final boolean a() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    public List<Comment> getCommentList() {
        if (PatchProxy.isSupport(new Object[0], this, f42540a, false, 36778, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f42540a, false, 36778, new Class[0], List.class);
        }
        if (this.f42542c == null || this.u == null || !this.u.getAwemeControl().canShowComment()) {
            this.f42542c = new ArrayList();
        }
        return this.f42542c;
    }

    public int getFeedType() {
        int i2 = this.t;
        if (i2 == Integer.MAX_VALUE) {
            return 65462;
        }
        switch (i2) {
            case 1:
                return 65280;
            case 2:
                return 65456;
            case 3:
                return 65457;
            case 4:
                return 65458;
            case 5:
                return 65285;
            case 6:
                return 65459;
            case e.l:
                return 65460;
            case 8:
                return 65461;
            case 9:
                return 65463;
            case 10:
                return 65464;
            case 11:
                return 65466;
            default:
                return this.t;
        }
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f42540a, false, 36786, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42540a, false, 36786, new Class[0], Integer.TYPE)).intValue();
        }
        int i14 = this.t * 31;
        if (this.u != null) {
            i2 = this.u.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        if (this.f42543d != null) {
            i3 = this.f42543d.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        if (this.f42544e != null) {
            i4 = this.f42544e.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        if (this.f42545f != null) {
            i5 = this.f42545f.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        if (this.h != null) {
            i6 = this.h.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 31;
        if (this.i != null) {
            i7 = this.i.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 31;
        if (this.j != null) {
            i8 = this.j.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 31;
        if (this.k != null) {
            i9 = this.k.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 31;
        if (this.l != null) {
            i10 = this.l.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 31;
        if (this.m != null) {
            i11 = this.m.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 31;
        if (this.o != null) {
            i12 = this.o.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 31;
        if (this.q != null) {
            i13 = this.q.hashCode();
        }
        return i25 + i13;
    }

    public void setAweme(Aweme aweme) {
        this.u = aweme;
    }

    public void setFeedType(int i2) {
        this.t = i2;
    }

    public void addComment(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f42540a, false, 36780, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f42540a, false, 36780, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        if (this.f42542c == null) {
            this.f42542c = new ArrayList();
        }
        this.f42542c.add(0, comment);
    }

    public int deleteComment(String str) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, f42540a, false, 36782, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f42540a, false, 36782, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (this.f42542c != null) {
            while (i2 < this.f42542c.size()) {
                Comment comment = this.f42542c.get(i2);
                if (comment == null || !StringUtils.equal(comment.getCid(), str)) {
                    i2++;
                } else {
                    this.f42542c.remove(i2);
                    return i2;
                }
            }
        }
        return -1;
    }

    public int getCommentPosition(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f42540a, false, 36779, new Class[]{Comment.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{comment}, this, f42540a, false, 36779, new Class[]{Comment.class}, Integer.TYPE)).intValue();
        } else if (this.f42542c != null) {
            return this.f42542c.indexOf(comment);
        } else {
            return -1;
        }
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f42540a, false, 36783, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f42540a, false, 36783, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.setRequestId(str);
        if (this.u != null) {
            this.u.setRequestId(str);
        }
        if (!CollectionUtils.isEmpty(this.h)) {
            for (com.ss.android.ugc.aweme.newfollow.e.a next : this.h) {
                if (next != null) {
                    next.f57095a = str;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f42540a, false, 36785, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f42540a, false, 36785, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.t == aVar.t && com.ss.android.ugc.aweme.base.utils.n.a(this.u, aVar.u) && com.ss.android.ugc.aweme.base.utils.n.a(this.f42543d, aVar.f42543d) && com.ss.android.ugc.aweme.base.utils.n.a(this.f42544e, aVar.f42544e) && com.ss.android.ugc.aweme.base.utils.n.a(this.f42545f, aVar.f42545f) && com.ss.android.ugc.aweme.base.utils.n.a(this.h, aVar.h) && com.ss.android.ugc.aweme.base.utils.n.a(this.i, aVar.i) && com.ss.android.ugc.aweme.base.utils.n.a(this.j, aVar.j) && com.ss.android.ugc.aweme.base.utils.n.a(this.k, aVar.k) && com.ss.android.ugc.aweme.base.utils.n.a(this.l, aVar.l) && com.ss.android.ugc.aweme.base.utils.n.a(this.m, aVar.m) && com.ss.android.ugc.aweme.base.utils.n.a(this.o, aVar.o)) {
                return com.ss.android.ugc.aweme.base.utils.n.a(this.q, aVar.q);
            }
            return false;
        }
    }

    public int updateComment(String str, int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f42540a, false, 36781, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f42540a, false, 36781, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.f42542c != null) {
            while (i3 < this.f42542c.size()) {
                Comment comment = this.f42542c.get(i3);
                if (comment == null || !StringUtils.equal(comment.getCid(), str)) {
                    i3++;
                } else {
                    com.ss.android.ugc.aweme.comment.a.b.a(comment, getAwemeAuthorId());
                    if (i2 >= 0) {
                        comment.setDiggCount(i2);
                    }
                    return i3;
                }
            }
        }
        return -1;
    }
}
