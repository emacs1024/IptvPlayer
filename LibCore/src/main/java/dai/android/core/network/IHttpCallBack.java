package dai.android.core.network;

import okhttp3.Response;

public interface IHttpCallBack {

    void onSuccess(String url, Response response);

    void onFailed(String url, Exception e);
}
