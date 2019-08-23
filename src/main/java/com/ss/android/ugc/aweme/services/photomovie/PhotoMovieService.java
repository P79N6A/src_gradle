package com.ss.android.ugc.aweme.services.photomovie;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.medialib.photomovie.MovieCover;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.draft.a.f;
import com.ss.android.ugc.aweme.draft.l;
import com.ss.android.ugc.aweme.photo.e;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContextOld;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity;
import com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity;
import com.ss.android.ugc.aweme.photomovie.v;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.g;
import java.io.File;
import java.io.Serializable;
import java.util.List;

public class PhotoMovieService implements IPhotoMovieService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void getPhotoMovieCover(@NonNull PhotoMovieContext photoMovieContext, @NonNull PhotoMovieContext.a aVar) {
        final PhotoMovieContext photoMovieContext2 = photoMovieContext;
        final PhotoMovieContext.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{photoMovieContext2, aVar2}, this, changeQuickRedirect, false, 71529, new Class[]{PhotoMovieContext.class, PhotoMovieContext.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoMovieContext2, aVar2}, this, changeQuickRedirect, false, 71529, new Class[]{PhotoMovieContext.class, PhotoMovieContext.a.class}, Void.TYPE);
            return;
        }
        a.a(new Runnable() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void run() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71533, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71533, new Class[0], Void.TYPE);
                } else if (photoMovieContext2.mImageList != null) {
                    String[] strArr = new String[photoMovieContext2.mImageList.size()];
                    for (int i = 0; i < strArr.length; i++) {
                        strArr[i] = photoMovieContext2.mImageList.get(i);
                    }
                    CoverInfo cover = new MovieCover().getCover(g.a(strArr, co.IMAGE), photoMovieContext2.mFilterPath, photoMovieContext2.mPlayType, (long) (photoMovieContext2.mCoverStartTm * 1000.0f), (int) SearchJediMixFeedAdapter.f42517f, 228);
                    if (cover == null || cover.getData() == null) {
                        if (!TextUtils.isEmpty(photoMovieContext2.getPhotoMovieCover())) {
                            c.a(e.a(Uri.fromFile(new File(photoMovieContext2.getPhotoMovieCover()))), (int) SearchJediMixFeedAdapter.f42517f, 228, (b<Bitmap>) new b<Bitmap>() {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                public void accept(Bitmap bitmap) {
                                    Bitmap bitmap2 = bitmap;
                                    if (PatchProxy.isSupport(new Object[]{bitmap2}, this, changeQuickRedirect, false, 71534, new Class[]{Bitmap.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{bitmap2}, this, changeQuickRedirect, false, 71534, new Class[]{Bitmap.class}, Void.TYPE);
                                        return;
                                    }
                                    aVar2.a(bitmap2, SearchJediMixFeedAdapter.f42517f, 228);
                                }
                            });
                        }
                        return;
                    }
                    aVar2.a(Bitmap.createBitmap(cover.getData(), cover.getWidth(), cover.getHeight(), Bitmap.Config.ARGB_8888), cover.getWidth(), cover.getHeight());
                }
            }
        });
    }

    public void getPhotoMovieCover(@NonNull PhotoMovieContextOld photoMovieContextOld, @NonNull PhotoMovieContextOld.a aVar) {
        final PhotoMovieContextOld photoMovieContextOld2 = photoMovieContextOld;
        final PhotoMovieContextOld.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{photoMovieContextOld2, aVar2}, this, changeQuickRedirect, false, 71530, new Class[]{PhotoMovieContextOld.class, PhotoMovieContextOld.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoMovieContextOld2, aVar2}, this, changeQuickRedirect, false, 71530, new Class[]{PhotoMovieContextOld.class, PhotoMovieContextOld.a.class}, Void.TYPE);
            return;
        }
        a.a(new Runnable() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void run() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71535, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71535, new Class[0], Void.TYPE);
                } else if (photoMovieContextOld2.f58807c != null) {
                    String[] strArr = new String[photoMovieContextOld2.f58807c.size()];
                    for (int i = 0; i < strArr.length; i++) {
                        strArr[i] = photoMovieContextOld2.f58807c.get(i);
                    }
                    CoverInfo cover = new MovieCover().getCover(g.a(strArr, co.IMAGE), photoMovieContextOld2.m, photoMovieContextOld2.h, (long) (photoMovieContextOld2.k * 1000.0f), (int) SearchJediMixFeedAdapter.f42517f, 228);
                    if (cover == null || cover.getData() == null) {
                        if (!TextUtils.isEmpty(photoMovieContextOld2.a())) {
                            c.a(e.a(Uri.fromFile(new File(photoMovieContextOld2.a()))), (int) SearchJediMixFeedAdapter.f42517f, 228, (b<Bitmap>) new b<Bitmap>() {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                public void accept(Bitmap bitmap) {
                                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, changeQuickRedirect, false, 71536, new Class[]{Bitmap.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, changeQuickRedirect, false, 71536, new Class[]{Bitmap.class}, Void.TYPE);
                                    }
                                }
                            });
                        }
                        return;
                    }
                    Bitmap.createBitmap(cover.getData(), cover.getWidth(), cover.getHeight(), Bitmap.Config.ARGB_8888);
                    cover.getWidth();
                    cover.getHeight();
                }
            }
        });
    }

    public void startEditDraftActivity(@NonNull Context context, @NonNull com.ss.android.ugc.aweme.draft.a.c cVar, @NonNull List<com.ss.android.ugc.aweme.shortvideo.e> list) {
        Context context2 = context;
        com.ss.android.ugc.aweme.draft.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, cVar2, list}, this, changeQuickRedirect, false, 71532, new Class[]{Context.class, com.ss.android.ugc.aweme.draft.a.c.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, cVar2, list}, this, changeQuickRedirect, false, 71532, new Class[]{Context.class, com.ss.android.ugc.aweme.draft.a.c.class, List.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, cVar2, list}, null, v.f59053a, true, 64045, new Class[]{Context.class, com.ss.android.ugc.aweme.draft.a.c.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, cVar2, list}, null, v.f59053a, true, 64045, new Class[]{Context.class, com.ss.android.ugc.aweme.draft.a.c.class, List.class}, Void.TYPE);
            return;
        }
        PhotoMovieContext photoMovieContext = cVar2.f43436d;
        if (photoMovieContext != null && cVar2.f43435c != null) {
            photoMovieContext.challenges = cVar2.f43435c.f43425c;
            photoMovieContext.title = cVar2.f43435c.f43423a;
            photoMovieContext.structList = cVar2.f43435c.f43424b;
            photoMovieContext.isPrivate = cVar2.y;
            photoMovieContext.mIsFromDraft = true;
            photoMovieContext.mFrom = 1;
            photoMovieContext.poiId = cVar.z();
            photoMovieContext.mSaveModel = cVar.y();
            photoMovieContext.draftEditTransferModel = new f(l.a(cVar), cVar.O());
            if (PatchProxy.isSupport(new Object[]{context2, photoMovieContext, list}, null, v.f59053a, true, 64046, new Class[]{Context.class, PhotoMovieContext.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, photoMovieContext, list}, null, v.f59053a, true, 64046, new Class[]{Context.class, PhotoMovieContext.class, List.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{context2, photoMovieContext, list}, null, PhotoMoviePublishActivity.f58841a, true, 63987, new Class[]{Context.class, PhotoMovieContext.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, photoMovieContext, list}, null, PhotoMoviePublishActivity.f58841a, true, 63987, new Class[]{Context.class, PhotoMovieContext.class, List.class}, Void.TYPE);
                return;
            }
            if (photoMovieContext != null) {
                Intent intent = new Intent();
                intent.setClass(context2, PhotoMoviePublishActivity.class);
                intent.putExtra("shoot_way", "edit_draft");
                intent.putExtra("photo_movie_context_music_list", (Serializable) list);
                intent.putExtra("photo_movie_context", photoMovieContext);
                context2.startActivity(intent);
            }
        }
    }

    public void toPhotoMovieEditActivity(@NonNull Context context, @NonNull PhotoMovieContext photoMovieContext, @NonNull List<com.ss.android.ugc.aweme.shortvideo.e> list, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{context, photoMovieContext, list, str}, this, changeQuickRedirect, false, 71531, new Class[]{Context.class, PhotoMovieContext.class, List.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, photoMovieContext, list, str};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 71531, new Class[]{Context.class, PhotoMovieContext.class, List.class, String.class}, Void.TYPE);
            return;
        }
        PhotoMovieEditActivity.a(context, photoMovieContext, list, str);
    }
}
