package com.guntursatya.perpustakaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class loadingscreen extends AppCompatActivity {
    private Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingscreen);

        pindah = new Intent(loadingscreen.this, LoginActivity.class);
        CompletableFuture.delayedExecutor(3, TimeUnit.SECONDS).execute(() -> {
            startActivity(pindah);
        });
    }
}