package ezequiel.app.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meuImageView: ImageView = findViewById(R.id.imageView)


        Glide
            .with(this)
            .asGif()
            .load(R.drawable.imagem)
            .into(meuImageView)
    }
}