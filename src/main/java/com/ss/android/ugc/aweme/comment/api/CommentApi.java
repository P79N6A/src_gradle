package com.ss.android.ugc.aweme.comment.api;

import a.i;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.store.d;
import com.ss.android.ugc.aweme.utils.aj;
import java.util.List;
import java.util.concurrent.ExecutionException;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class CommentApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36360a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f36361b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c  reason: collision with root package name */
    private static IRetrofitService f36362c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    interface RealApi {
        @GET(a = "/aweme/v1/comment/delete/")
        q<BaseCommentResponse> deleteComment(@Query(a = "cid") String str);

        @GET(a = "/aweme/v1/comment/digg/")
        q<BaseCommentResponse> diggComment(@Query(a = "cid") String str, @Query(a = "aweme_id") String str2, @Query(a = "digg_type") String str3, @Query(a = "channel_id") int i);

        @GET(a = "/aweme/v1/comment/list/")
        q<CommentItemList> fetchCommentList(@Query(a = "aweme_id") String str, @Query(a = "cursor") long j, @Query(a = "count") int i, @Query(a = "comment_style") int i2, @Query(a = "digged_cid") String str2, @Query(a = "insert_cids") String str3, @Query(a = "address_book_access") Integer num, @Query(a = "gps_access") Integer num2);

        @GET(a = "/aweme/v2/comment/list/")
        i<CommentItemList> fetchCommentListV2(@Query(a = "aweme_id") String str, @Query(a = "cursor") long j, @Query(a = "count") int i, @Query(a = "insert_ids") String str2, @Query(a = "address_book_access") Integer num, @Query(a = "gps_access") Integer num2, @Query(a = "forward_page_type") int i2, @Query(a = "ad_creative_id") Long l);

        @GET(a = "/aweme/v1/comment/story/replylist/")
        q<CommentItemList> fetchStoryReplyCommentList(@Query(a = "comment_id") String str);

        @GET(a = "/aweme/v1/comment/list/reply/")
        i<CommentItemList> loadMoreCommentList(@Query(a = "comment_id") String str, @Query(a = "cursor") long j, @Query(a = "count") int i, @Query(a = "top_ids") String str2, @Query(a = "item_id") String str3);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/comment/publish/")
        q<CommentResponse> publishComment(@Field(a = "aweme_id") String str, @Field(a = "text") String str2, @Field(a = "reply_id") String str3, @Field(a = "text_extra") String str4, @Field(a = "is_self_see") int i, @Field(a = "reply_to_reply_id") String str5, @Field(a = "channel_id") int i2);
    }

    public static CommentItemList a(String str, long j, int i, int i2, String str2, String str3, int i3, int i4, boolean z, String str4) throws Exception {
        String str5 = str;
        long j2 = j;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{str5, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str6, str7, Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0), str8}, null, f36360a, true, 27281, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class}, CommentItemList.class)) {
            return (CommentItemList) PatchProxy.accessDispatch(new Object[]{str5, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str6, str7, Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z), str8}, null, f36360a, true, 27281, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class}, CommentItemList.class);
        } else if (z) {
            String str9 = "/aweme/v1/comment/list/?aid=" + str5 + "&cursor=" + j2 + "&count=" + i + "&commentStyle=" + i2 + "&cid=" + str6 + "&insertCids=" + str7 + "&addressBookAccess=" + i3 + "&gpsAccess=" + i4;
            new StringBuilder("url = ").append(str9);
            int a2 = d.a(str9);
            if (!TextUtils.isEmpty(str4) && d.a().e(a2) != null) {
                return null;
            }
            d.a().b(a2);
            try {
                Object a3 = d.a().a(a2);
                StringBuilder sb = new StringBuilder("get result = ");
                sb.append(a2);
                sb.append(" ");
                if (a3 != null) {
                    z2 = false;
                }
                sb.append(z2);
                if (a3 != null) {
                    d.a().a(str8, a2);
                    return (CommentItemList) a3;
                }
                CommentItemList a4 = a(str, j, i, i2, str2, str3, i3, i4);
                if (!TextUtils.isEmpty(str4)) {
                    d.a().a(a2, (Object) a4);
                    d.a().a(a2, str8);
                    StringBuilder sb2 = new StringBuilder("put result = ");
                    sb2.append(a2);
                    sb2.append(" ");
                    sb2.append(str9);
                } else {
                    d.a().d(a2);
                }
                CommentItemList commentItemList = a4;
                d.a().c(a2);
                return commentItemList;
            } finally {
                d.a().c(a2);
            }
        } else {
            int i5 = i;
            int i6 = i2;
            int i7 = i3;
            int i8 = i4;
            return a(str, j, i, i2, str2, str3, i3, i4);
        }
    }

    public static CommentResponse a(String str, String str2, @Nullable String str3, List<TextExtraStruct> list, @Nullable String str4, int i) throws Exception {
        List<TextExtraStruct> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, list2, str4, Integer.valueOf(i)}, null, f36360a, true, 27286, new Class[]{String.class, String.class, String.class, List.class, String.class, Integer.TYPE}, CommentResponse.class)) {
            Object[] objArr = {str, str2, str3, list2, str4, Integer.valueOf(i)};
            return (CommentResponse) PatchProxy.accessDispatch(objArr, null, f36360a, true, 27286, new Class[]{String.class, String.class, String.class, List.class, String.class, Integer.TYPE}, CommentResponse.class);
        }
        try {
            CommentResponse commentResponse = (CommentResponse) ((RealApi) f36361b.create(RealApi.class)).publishComment(str, str2, str3, m.d().toJson((Object) list2), aj.a() ? 1 : 0, str4, i).get();
            commentResponse.comment.setLabelInfo(commentResponse.starFakeLabel);
            return commentResponse;
        } catch (ExecutionException e2) {
            throw f36362c.propagateCompatibleException(e2);
        }
    }

    public static BaseCommentResponse a(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f36360a, true, 27279, new Class[]{String.class}, BaseCommentResponse.class)) {
            return (BaseCommentResponse) PatchProxy.accessDispatch(new Object[]{str2}, null, f36360a, true, 27279, new Class[]{String.class}, BaseCommentResponse.class);
        }
        try {
            return (BaseCommentResponse) ((RealApi) f36361b.create(RealApi.class)).deleteComment(str2).get();
        } catch (ExecutionException e2) {
            throw f36362c.propagateCompatibleException(e2);
        }
    }

    public static BaseCommentResponse a(String str, String str2, String str3, int i) throws Exception {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, Integer.valueOf(i)}, null, f36360a, true, 27280, new Class[]{String.class, String.class, String.class, Integer.TYPE}, BaseCommentResponse.class)) {
            return (BaseCommentResponse) PatchProxy.accessDispatch(new Object[]{str4, str5, str6, Integer.valueOf(i)}, null, f36360a, true, 27280, new Class[]{String.class, String.class, String.class, Integer.TYPE}, BaseCommentResponse.class);
        }
        try {
            return (BaseCommentResponse) ((RealApi) f36361b.create(RealApi.class)).diggComment(str4, str5, str6, i).get();
        } catch (ExecutionException e2) {
            throw f36362c.propagateCompatibleException(e2);
        }
    }

    public static i<CommentItemList> a(String str, long j, int i, String str2, String str3) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{str, new Long(j2), Integer.valueOf(i), str2, str3}, null, f36360a, true, 27284, new Class[]{String.class, Long.TYPE, Integer.TYPE, String.class, String.class}, i.class)) {
            return ((RealApi) f36361b.create(RealApi.class)).loadMoreCommentList(str, j, i, str2, str3);
        }
        Object[] objArr = {str, new Long(j2), Integer.valueOf(i), str2, str3};
        return (i) PatchProxy.accessDispatch(objArr, null, f36360a, true, 27284, new Class[]{String.class, Long.TYPE, Integer.TYPE, String.class, String.class}, i.class);
    }

    public static i<CommentItemList> a(String str, long j, int i, String str2, int i2, int i3, Long l) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3), l}, null, f36360a, true, 27283, new Class[]{String.class, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Long.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str, new Long(j2), Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3), l}, null, f36360a, true, 27283, new Class[]{String.class, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Long.class}, i.class);
        }
        return ((RealApi) f36361b.create(RealApi.class)).fetchCommentListV2(str, j, i, str2, Integer.valueOf(i2), Integer.valueOf(i3), AbTestManager.a().aD() ? 1 : 0, l);
    }

    private static CommentItemList a(String str, long j, int i, int i2, String str2, String str3, int i3, int i4) throws Exception {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str2, str3, Integer.valueOf(i3), Integer.valueOf(i4)}, null, f36360a, true, 27282, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.TYPE, Integer.TYPE}, CommentItemList.class)) {
            return (CommentItemList) PatchProxy.accessDispatch(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str2, str3, Integer.valueOf(i3), Integer.valueOf(i4)}, null, f36360a, true, 27282, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.TYPE, Integer.TYPE}, CommentItemList.class);
        }
        try {
            return (CommentItemList) ((RealApi) f36361b.create(RealApi.class)).fetchCommentList(str, j, i, i2, str2, str3, Integer.valueOf(i3), Integer.valueOf(i4)).get();
        } catch (ExecutionException e2) {
            throw f36362c.propagateCompatibleException(e2);
        }
    }
}
