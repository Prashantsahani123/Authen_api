package com.kaizen.authen_api;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class TokenInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        String tok = "B8y3NYNCJDr-tRC2kBOMiZtKznaOASbvx7FleuuAjoga8l-uox4geYZ2O0-zbplu2kyvcO25dOKLliswGmNZStKfbkvvyi2BgU6ZnpGVYWxlvogoEJoa1NtmmFwP_L2fKcs3KIBdvg3HDF1n8d3yL0YVqz2rFXTuiwDj84QbK_rpPYdrpIe5dkj13NgrgI8kCFYX_jMKi00Iq2UaXPGcswnxRQdMEm7-NtdutxStP1QmZju5idPDIi4eiF3vrcXuElyMbqPZGs-v2hqW63qAXuRSNk0LyeRi6CfRl8vRkCR9ABgf5A9RBKFmeY2ykC8R";

        Request newRequest=chain.request().newBuilder()
                .header("Authorization","Bearer "+ tok)
                .build();

        return chain.proceed(newRequest);


    }
}
