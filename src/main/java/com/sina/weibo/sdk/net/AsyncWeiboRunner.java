package com.sina.weibo.sdk.net;

import android.content.Context;
import android.os.AsyncTask;
import com.sina.weibo.sdk.exception.WeiboException;

public class AsyncWeiboRunner {
    public Context mContext;

    static class AsyncTaskResult<T> {
        private WeiboException error;
        private T result;

        public WeiboException getError() {
            return this.error;
        }

        public T getResult() {
            return this.result;
        }

        public AsyncTaskResult(WeiboException weiboException) {
            this.error = weiboException;
        }

        public AsyncTaskResult(T t) {
            this.result = t;
        }
    }

    static class RequestRunner extends AsyncTask<Void, Void, AsyncTaskResult<String>> {
        private final Context mContext;
        private final String mHttpMethod;
        private final RequestListener mListener;
        private final WeiboParameters mParams;
        private final String mUrl;

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }

        /* access modifiers changed from: protected */
        public AsyncTaskResult<String> doInBackground(Void... voidArr) {
            try {
                return new AsyncTaskResult<>(HttpManager.openUrl(this.mContext, this.mUrl, this.mHttpMethod, this.mParams));
            } catch (WeiboException e2) {
                return new AsyncTaskResult<>(e2);
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(AsyncTaskResult<String> asyncTaskResult) {
            WeiboException error = asyncTaskResult.getError();
            if (error != null) {
                this.mListener.onWeiboException(error);
            } else {
                this.mListener.onComplete((String) asyncTaskResult.getResult());
            }
        }

        public RequestRunner(Context context, String str, WeiboParameters weiboParameters, String str2, RequestListener requestListener) {
            this.mContext = context;
            this.mUrl = str;
            this.mParams = weiboParameters;
            this.mHttpMethod = str2;
            this.mListener = requestListener;
        }
    }

    public AsyncWeiboRunner(Context context) {
        this.mContext = context;
    }

    public String request(String str, WeiboParameters weiboParameters, String str2) throws WeiboException {
        return HttpManager.openUrl(this.mContext, str, str2, weiboParameters);
    }

    @Deprecated
    public void requestByThread(String str, WeiboParameters weiboParameters, String str2, RequestListener requestListener) {
        final String str3 = str;
        final String str4 = str2;
        final WeiboParameters weiboParameters2 = weiboParameters;
        final RequestListener requestListener2 = requestListener;
        AnonymousClass1 r0 = new Thread() {
            public void run() {
                try {
                    String openUrl = HttpManager.openUrl(AsyncWeiboRunner.this.mContext, str3, str4, weiboParameters2);
                    if (requestListener2 != null) {
                        requestListener2.onComplete(openUrl);
                    }
                } catch (WeiboException e2) {
                    if (requestListener2 != null) {
                        requestListener2.onWeiboException(e2);
                    }
                }
            }
        };
        r0.start();
    }

    public void requestAsync(String str, WeiboParameters weiboParameters, String str2, RequestListener requestListener) {
        RequestRunner requestRunner = new RequestRunner(this.mContext, str, weiboParameters, str2, requestListener);
        requestRunner.execute(new Void[1]);
    }
}
