package io.github.naimurhasan.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.naimurhasan.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val editText : EditText = findViewById(R.id.editTextNumber)
        val btn : Button = findViewById(R.id.button)
        val resultText : TextView = findViewById(R.id.textView)

        btn.setOnClickListener(){
            val inputText: String = editText.text.toString();
            if(inputText.isNotEmpty()){
                val kilos : Double = inputText.toDouble()
                resultText.setText(""+convertToPounds(kilos))
            }else{
                Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show()
            }

        }
    }

    fun convertToPounds(kilos: Double): Double {
        var pounds : Double = kilos*2.20462
        return pounds
    }
}
