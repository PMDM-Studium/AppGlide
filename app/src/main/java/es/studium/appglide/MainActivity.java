package es.studium.appglide;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen=findViewById(R.id.imageView);
        Glide.with(this)
                .load("https://www.tiendasdecuadros.com/archivos/images/carlos-guernica-redimension-1549889328.jpg")
                .into(imagen);
    }
}