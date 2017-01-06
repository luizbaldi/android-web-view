package com.luizbaldi.androidwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;

public class WebView extends AppCompatActivity {

    private android.webkit.WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        mWebView = (android.webkit.WebView) findViewById(R.id.activity_main_webview);

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Loads the url
        mWebView.loadUrl("http://google.com/");
    }
}
