package appingx2.exam.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val explicitIntent = Intent(this, GameActivity::class.java)

        start.setOnClickListener {
            Log.d("MainActivity", edit.text.toString())
            explicitIntent.putExtra("NAME", edit.text.toString() )
            startActivity(explicitIntent)
        }
    }
}
