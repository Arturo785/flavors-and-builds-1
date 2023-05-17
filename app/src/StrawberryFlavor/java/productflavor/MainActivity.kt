package productflavor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simform.productflavor.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val variant = "Strawberry flavor"
        setTitle(R.string.app_title)
        // current flavor selected is cookies so the R.string.appTittle does not redirect
    }
}