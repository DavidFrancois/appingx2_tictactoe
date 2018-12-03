package appingx2.exam.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity(), View.OnClickListener {

    var playerTurn = false
    var grid = Array(9, { i -> 0 })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val originIntent = intent
        val message = originIntent.getStringExtra("NAME")
        player_name.text = "O (" + message + ")"


        grid_1.setOnClickListener(this@GameActivity)
        grid_2.setOnClickListener(this@GameActivity)
        grid_3.setOnClickListener(this@GameActivity)
        grid_4.setOnClickListener(this@GameActivity)
        grid_5.setOnClickListener(this@GameActivity)
        grid_6.setOnClickListener(this@GameActivity)
        grid_7.setOnClickListener(this@GameActivity)
        grid_8.setOnClickListener(this@GameActivity)
        grid_9.setOnClickListener(this@GameActivity)
    }

    override fun onClick(clickedView: View?) {
        if (clickedView != null) {
            when (clickedView.id) {
                R.id.grid_1 -> {
                    if (grid_1.text == "") {
                        grid_1.text = if (playerTurn) "O" else "X"
                        grid[0] = if (playerTurn) 1 else 2
                    }
                }

                R.id.grid_2 -> {
                    if (grid_2.text == "") {
                        grid_2.text = if (playerTurn) "O" else "X"
                        grid[1] = if (playerTurn) 1 else 2
                    }
                }
                R.id.grid_3 -> {
                    if (grid_3.text == "") {
                        grid_3.text = if (playerTurn) "O" else "X"
                        grid[2] = if (playerTurn) 1 else 2
                    }
                }
                R.id.grid_4 -> {
                    if (grid_4.text == "") {
                        grid_4.text = if (playerTurn) "O" else "X"
                        grid[3] = if (playerTurn) 1 else 2
                    }
                }
                R.id.grid_5 -> {
                    if (grid_5.text == "") {
                        grid_5.text = if (playerTurn) "O" else "X"
                        grid[4] = if (playerTurn) 1 else 2
                    }
                }
                R.id.grid_6 -> {
                    if (grid_6.text == "") {
                        grid_6.text = if (playerTurn) "O" else "X"
                        grid[5] = if (playerTurn) 1 else 2
                    }
                }
                R.id.grid_7 -> {
                    if (grid_7.text == "") {
                        grid_7.text = if (playerTurn) "O" else "X"
                        grid[6] = if (playerTurn) 1 else 2
                    }
                }
                R.id.grid_8 -> {
                    if (grid_8.text == "") {
                        grid_8.text = if (playerTurn) "O" else "X"
                        grid[7] = if (playerTurn) 1 else 2
                    }
                }
                R.id.grid_9 -> {
                    if (grid_9.text == "") {
                        grid_9.text = if (playerTurn) "O" else "X"
                        grid[8] = if (playerTurn) 1 else 2
                    }
                }
                else -> {}
            }
            this.playerTurn = !this.playerTurn
        }
    }
}
