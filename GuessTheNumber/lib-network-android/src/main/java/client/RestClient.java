package client;

import android.content.Context;

/**
 * Created by hrant on 9/25/16.
 */

public class RestClient {
    private static RestClient Instance;
    private Context applicationContext;

    private RestClient(Context applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void init(Context applicationContext) {
        if (Instance == null) {
            Instance = new RestClient(applicationContext);
        }
    }

    public static RestClient getInstance() {
        if (Instance == null) {
            throw new IllegalStateException("Instance Can't be null");
        }
        return Instance;
    }
}
