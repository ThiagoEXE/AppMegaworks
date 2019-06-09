package megaworks.com.br;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView megaworks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        megaworks = findViewById(R.id.site);
        megaworks.getSettings().setJavaScriptEnabled(true);
        megaworks.setFocusable(true);
        megaworks.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        megaworks.getSettings().setAppCacheEnabled(true);
        megaworks.getSettings().setDomStorageEnabled(true);
        megaworks.setWebViewClient(new WebViewClient());
        megaworks.loadUrl("http://megaworks.com.br/");

    }
}
