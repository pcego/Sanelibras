package android.fasa.edu.br.sanelibras;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

// Splash Actvity Sanelibras
public class SplashActivity extends AppCompatActivity {

    // Objeto Handler
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /*
        Instanciando o objeto handler e utilizando
        o método postDelayde para atrasar
        a chamada da MainActivity em 2 segundos
        */
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent =
                        new Intent(getApplicationContext(),
                                MainActivity.class);

                startActivity(intent);

            }
        }, 2000);

    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
