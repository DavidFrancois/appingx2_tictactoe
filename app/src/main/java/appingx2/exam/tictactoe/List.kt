package appingx2.exam.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list.*

class List : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        // In this example, we create data as a hardcoded List
        val data : MutableList<Score> = arrayListOf()

//        score_list.adapter = ScoreListAdapter(data)
    }
}
