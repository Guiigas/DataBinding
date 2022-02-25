package guirique.samples.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import guirique.samples.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*
    #  25/02/2021 - Guilherme Freitas
    #
    #  Use DataBinding in your project code
    #  You will not use more findViewById(R.id.nameView)
    */

    /*
    #
    # First step, you need enable databinding, open the file buildgradle:app
    #
    # Second step, you need add tag layout into your XML layout "activity_main.xml"
    #
    # Next step, you need declare binding: ActivityMainBinding and change setContentView(R.layout.activity_main)
    #
    */

    private lateinit var binding: ActivityMainBinding
    private lateinit var button: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
        change
        setContentView(R.layout.activity_main)
        */
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        /*
        change
        button = findViewById(R.id.control_button)
        to
        binding.*

        When you use Databinding all name views into your XML for example  android:id="@+id/control_button" , the name control_button
        contracted to controlButton and remove underscore, othe example textview called full_name -> contracted to -> fullName
        */

        binding.controlButton.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    private fun startOrStopProgressBar() {

        /*
        change
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        to
        binding.*
        */

        if (binding.progressBar.visibility == View.GONE) {
            binding.progressBar.visibility = View.VISIBLE
            binding.controlButton.text = "Stop"
        } else {
            binding.progressBar.visibility = View.GONE
            binding.controlButton.text = "Start"
        }
    }
}