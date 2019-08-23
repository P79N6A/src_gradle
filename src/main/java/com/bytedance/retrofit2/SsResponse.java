package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

public final class SsResponse<T> {
    private final T body;
    private final TypedInput errorBody;
    private final Response rawResponse;

    public final T body() {
        return this.body;
    }

    public final TypedInput errorBody() {
        return this.errorBody;
    }

    public final Response raw() {
        return this.rawResponse;
    }

    public final int code() {
        return this.rawResponse.getStatus();
    }

    public final List<Header> headers() {
        return this.rawResponse.getHeaders();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public static <T> SsResponse<T> success(T t, Response response) {
        if (response == null) {
            throw new NullPointerException("rawResponse == null");
        } else if (response.isSuccessful()) {
            return new SsResponse<>(response, t, null);
        } else {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
    }

    public static <T> SsResponse<T> error(TypedInput typedInput, Response response) {
        if (typedInput == null) {
            throw new NullPointerException("body == null");
        } else if (response == null) {
            throw new NullPointerException("rawResponse == null");
        } else if (!response.isSuccessful()) {
            return new SsResponse<>(response, null, typedInput);
        } else {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
    }

    private SsResponse(Response response, T t, TypedInput typedInput) {
        this.rawResponse = response;
        this.body = t;
        this.errorBody = typedInput;
    }
}
